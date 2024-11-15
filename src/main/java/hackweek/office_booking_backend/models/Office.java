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
    private String image;

    @OneToMany(mappedBy = "office", cascade = { CascadeType.MERGE, CascadeType.REMOVE })
    private List<Booking> bookings;

    public Office() {
    }

    public Office(String officeName, String location, String description, String image) {
        this.officeName = officeName;
        this.location = location;
        this.description = description;
        this.image = image;
    }

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

    public String getImage() {
        return image;
    }
}
