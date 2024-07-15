package hackweek.office_booking_backend.controllers;

import hackweek.office_booking_backend.dtos.UserDto;
import hackweek.office_booking_backend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ResponseEntity<UserDto> loginUser(@RequestParam String username, @RequestParam String password) {
        Long id = userService.getUserId(username, password);
        return ResponseEntity.ok(new UserDto(id));
    }
}
