package hackweek.office_booking_backend.dtos;

import java.time.LocalDateTime;

public record BookingDateUpdateDto(LocalDateTime startDate, LocalDateTime endDate) {
}
