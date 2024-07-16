package hackweek.office_booking_backend.controllers;

import hackweek.office_booking_backend.dtos.BookingDateUpdateDto;
import hackweek.office_booking_backend.dtos.BookingDto;
import hackweek.office_booking_backend.models.Booking;
import hackweek.office_booking_backend.services.BookingService;
import hackweek.office_booking_backend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin("http://localhost:5173")
public class BookingController {

    private final BookingService bookingService;
    private final UserService userService;

    public BookingController(BookingService bookingService, UserService userService) {
        this.bookingService = bookingService;
        this.userService = userService;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Booking> updateBooking(@PathVariable Long id, @RequestBody BookingDateUpdateDto updateBooking) {
        Booking updateBk = bookingService.updateBooking(id, updateBooking.startDate(), updateBooking.endDate());
        return ResponseEntity.ok(updateBk);
    }

}
