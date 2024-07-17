package hackweek.office_booking_backend.services;

import hackweek.office_booking_backend.models.Office;
import hackweek.office_booking_backend.repositories.OfficeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeService {

    private final OfficeRepository officeRepo;

    public OfficeService(OfficeRepository officeRepo) {
        this.officeRepo = officeRepo;
    }

    public List<Office> getAllOfficesByFilter(String filterWord) {
        return officeRepo.findOfficesByLocationContainingIgnoreCase(filterWord);
    }

    public List<Office> getAllOffices() {
        return officeRepo.findAll();
    }
}
