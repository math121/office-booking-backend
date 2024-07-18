package hackweek.office_booking_backend.repositories;

import hackweek.office_booking_backend.models.UserObk;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<UserObk, Long> {
    UserObk findByUserNameAndPassword(String username, String password);
    UserObk findByUserName(String username);
}
