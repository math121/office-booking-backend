package hackweek.office_booking_backend.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserObk {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String password;

    @OneToMany(mappedBy = "userObk", cascade = { CascadeType.MERGE, CascadeType.REMOVE })
    private List<Booking> bookings;


    public Long getId() {
        return id;
    }
}
