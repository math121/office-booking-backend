package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.models.UserObk;
import hackweek.office_booking_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public Long getUserId(String username, String password) throws AccountNotFoundException {
        UserObk user = userRepo.findByUserNameAndPassword(username, password);
        if (user == null) {
            throw new AccountNotFoundException("Account not found");
        }
        return user.getId();
    }
}
