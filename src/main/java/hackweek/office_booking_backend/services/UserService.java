package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public Long getUserId(String username, String password) {
        return userRepo.findByUserNameAndPassword(username, password).getId();
    }
}
