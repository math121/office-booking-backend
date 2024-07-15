package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.models.Booking;
import hackweek.office_booking_backend.repositories.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepo;

    public BookingService(BookingRepository bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }
}
