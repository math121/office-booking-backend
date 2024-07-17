package hackweek.office_booking_backend.repositories;

import hackweek.office_booking_backend.models.Office;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface OfficeRepository extends ListCrudRepository<Office, Long> {
    List<Office> findOfficesByLocationContainingIgnoreCase(String filterWord);
}
