package hackweek.office_booking_backend.repositories;

import hackweek.office_booking_backend.models.Office;
import org.springframework.data.repository.ListCrudRepository;

public interface OfficeRepository extends ListCrudRepository<Office, Long> {
}
