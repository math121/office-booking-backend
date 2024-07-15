package hackweek.office_booking_backend.controllers;

import hackweek.office_booking_backend.dtos.BookingDto;
import hackweek.office_booking_backend.models.Booking;
import hackweek.office_booking_backend.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin("http://localhost:5173")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/{timePeriod}/{id}")
    public ResponseEntity<List<Booking>> getAllBookings(@PathVariable String timePeriod,
                                                        @PathVariable Long id) {
        return ResponseEntity.ok(bookingService.getBookings(timePeriod, id));
    }

    @PostMapping
    public ResponseEntity<Booking> postNewBooking(@RequestBody BookingDto bookingDto) {
        System.out.println(bookingDto);
        Booking booking = new Booking(bookingDto.startDate(), bookingDto.endDate());

        return ResponseEntity.ok(bookingService.addNewBooking(booking, bookingDto.officeId(),
                bookingDto.userId()));
    }

}
