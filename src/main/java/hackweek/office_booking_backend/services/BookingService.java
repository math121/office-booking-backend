package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.models.Booking;
import hackweek.office_booking_backend.models.Office;
import hackweek.office_booking_backend.models.UserObk;
import hackweek.office_booking_backend.repositories.BookingRepository;
import hackweek.office_booking_backend.repositories.OfficeRepository;
import hackweek.office_booking_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepo;
    private final UserRepository userRepo;
    private final OfficeRepository officeRepo;

    public BookingService(BookingRepository bookingRepo, UserRepository userRepo, OfficeRepository officeRepo) {
        this.bookingRepo = bookingRepo;
        this.userRepo = userRepo;
        this.officeRepo = officeRepo;
    }

    public List<Booking> getBookings(String timePeriod, Long id) {
        UserObk userObk = userRepo.findById(id).get();
        if (timePeriod.equals("past")) {
            return bookingRepo.findAllByUserObkAndEndDateLessThan(userObk, LocalDateTime.now());
        } else if (timePeriod.equals("future")) {
            return bookingRepo.findAllByUserObkAndEndDateGreaterThan(userObk, LocalDateTime.now());
        } else {
            return null;
        }
    }

    public List<Booking> getBookingsWithFilter(String timePeriod, Long id, String filterLocation) {
        List<Booking> bookings = getBookings(timePeriod, id);
        if (bookings != null) {
            return bookings
                    .stream()
                    .filter(bk -> bk.getOffice().getLocation()
                            .toLowerCase().contains(filterLocation.toLowerCase()))
                    .toList();
        }
        return null;
    }

    public Booking addNewBooking(Booking booking, Long officeId, Long userId) {
        UserObk userObk = userRepo.findById(userId).get();
        Office office = officeRepo.findById(officeId).get();
        booking.setOffice(office);
        booking.setUserObk(userObk);
        return bookingRepo.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepo.deleteById(id);
    }

    public Booking updateBooking(Long id, LocalDateTime startDate, LocalDateTime endDate) {
        Booking booking = bookingRepo.findById(id).get();
        booking.setStartDate(startDate);
        booking.setEndDate(endDate);
        return bookingRepo.save(booking);
    }
}
