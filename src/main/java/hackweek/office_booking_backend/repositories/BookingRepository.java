package hackweek.office_booking_backend.repositories;

import hackweek.office_booking_backend.models.Booking;
import org.springframework.data.repository.ListCrudRepository;

public interface BookingRepository extends ListCrudRepository<Booking, Long> {
}
