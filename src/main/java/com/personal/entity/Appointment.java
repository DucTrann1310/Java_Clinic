package com.personal.entity;

import com.personal.BaseEntity;
import com.personal.enums.EAppointmentType;
import com.personal.enums.EReservationType;
import com.personal.enums.EStatusAppointment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id", nullable = false)
    private Service service;

    @Enumerated(EnumType.STRING)
    private EAppointmentType appointmentType;

    @Enumerated(EnumType.STRING)
    private EReservationType reservationType;

    private LocalDateTime bookingTime;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Enumerated(EnumType.STRING)
    private EStatusAppointment status;

}
