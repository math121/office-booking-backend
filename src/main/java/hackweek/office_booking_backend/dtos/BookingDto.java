package hackweek.office_booking_backend.dtos;

import java.time.LocalDateTime;

public record BookingDto(LocalDateTime startDate, LocalDateTime endDate, Long officeId, Long userId) {
}
