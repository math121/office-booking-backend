package hackweek.office_booking_backend.dtos;

import hackweek.office_booking_backend.enums.Role;

public record UserDto(Long id, Role role) {
}
