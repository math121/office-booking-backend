package hackweek.office_booking_backend.models;

import hackweek.office_booking_backend.enums.Role;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserObk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;
    private Role role;

    @OneToMany(mappedBy = "userObk", cascade = { CascadeType.MERGE, CascadeType.REMOVE })
    private List<Booking> bookings;


    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public UserObk() {
    }

    public UserObk(String userName, String password, Role role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
}
