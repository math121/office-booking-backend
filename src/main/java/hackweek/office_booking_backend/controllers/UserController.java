package hackweek.office_booking_backend.controllers;

import hackweek.office_booking_backend.dtos.SignUpDto;
import hackweek.office_booking_backend.dtos.UserDto;
import hackweek.office_booking_backend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ResponseEntity<UserDto> loginUser(@RequestParam String username,
                                             @RequestParam String password)
            throws AccountNotFoundException {
        Long id = userService.getUserId(username, password);
        return ResponseEntity.ok(new UserDto(id));
    }

    @PostMapping("/signUp")
    public ResponseEntity<UserDto> signUpUser(@RequestBody SignUpDto newUser) throws Exception {
        Long id = userService.addUser(newUser.username(), newUser.password());
        return ResponseEntity.ok(new UserDto(id));
    }

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<?> notValidAccount(AccountNotFoundException ex) {
        return ResponseEntity.status(404).body(ex);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> error(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex);
    }
}
