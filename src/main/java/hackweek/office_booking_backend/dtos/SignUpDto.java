package hackweek.office_booking_backend.dtos;

import hackweek.office_booking_backend.enums.Role;

public record SignUpDto(String username, String password, Role role) {
}
