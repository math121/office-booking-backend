package hackweek.office_booking_backend.repositories;

import hackweek.office_booking_backend.models.Booking;
import hackweek.office_booking_backend.models.UserObk;
import org.springframework.data.repository.ListCrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingRepository extends ListCrudRepository<Booking, Long> {
    List<Booking> findAllByUserObkAndStartDateGreaterThan(UserObk userObk, LocalDateTime startDate);
    List<Booking> findAllByUserObkAndEndDateLessThan(UserObk userObk, LocalDateTime endDate);
}
