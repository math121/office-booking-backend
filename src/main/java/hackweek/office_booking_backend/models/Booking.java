package hackweek.office_booking_backend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserObk userObk;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;


    public Long getId() {
        return id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public UserObk getUserObk() {
        return userObk;
    }

    public Office getOffice() {
        return office;
    }

}
