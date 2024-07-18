package hackweek.office_booking_backend.controllers;

import hackweek.office_booking_backend.dtos.OfficeDto;
import hackweek.office_booking_backend.models.Office;
import hackweek.office_booking_backend.services.OfficeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offices")
@CrossOrigin("http://localhost:5173")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping
    public ResponseEntity<List<Office>> getAllOffices() {
        return ResponseEntity.ok(officeService.getAllOffices());
    }

    @GetMapping("/{filterWord}")
    public ResponseEntity<List<Office>> getAllOffices(@PathVariable String filterWord) {
        return ResponseEntity.ok(officeService.getAllOfficesByFilter(filterWord));
    }

    @PostMapping
    public ResponseEntity<Office> addNewOffice(@RequestBody OfficeDto newOffice) {
        Office office = new Office(newOffice.officeName(), newOffice.location(),
                newOffice.description(), newOffice.image());
        return ResponseEntity.ok(officeService.addNewOffice(office));
    }

}
