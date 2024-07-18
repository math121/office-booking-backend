package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.models.UserObk;
import hackweek.office_booking_backend.repositories.UserRepository;
import org.apache.catalina.User;
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

    public Long addUser(String username, String password) throws Exception {
        UserObk findUser = userRepo.findByUserName(username);
        if (findUser != null) {
           throw new Exception("User already exists");
        }
        UserObk newUser = userRepo.save(new UserObk(username, password));
        return newUser.getId();
    }
}
