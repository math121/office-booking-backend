package hackweek.office_booking_backend.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String officeName;
    private String location;
    private String description;

    @OneToMany(mappedBy = "office", cascade = { CascadeType.MERGE, CascadeType.REMOVE })
    private List<Booking> bookings;

    public Long getId() {
        return id;
    }

    public String getOfficeName() {
        return officeName;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
