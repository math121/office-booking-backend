package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.enums.Role;
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

    public UserObk getUserId(String username, String password) throws AccountNotFoundException {
        UserObk user = userRepo.findByUserNameAndPassword(username, password);
        if (user == null) {
            throw new AccountNotFoundException("Account not found");
        }
        return user;
    }

    public UserObk addUser(String username, String password, Role role) throws Exception {
        UserObk findUser = userRepo.findByUserName(username);
        if (findUser != null) {
           throw new Exception("User already exists");
        }
        return userRepo.save(new UserObk(username, password, role));
    }
}
