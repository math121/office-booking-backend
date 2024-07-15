package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.models.Booking;
import hackweek.office_booking_backend.models.Office;
import hackweek.office_booking_backend.models.UserObk;
import hackweek.office_booking_backend.repositories.BookingRepository;
import hackweek.office_booking_backend.repositories.OfficeRepository;
import hackweek.office_booking_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

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

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking addNewBooking(Booking booking, Long officeId) {
        UserObk userObk = userRepo.findById(1L).get();
        Office office = officeRepo.findById(officeId).get();
        booking.setOffice(office);
        booking.setUserObk(userObk);
        return bookingRepo.save(booking);
    }
}
