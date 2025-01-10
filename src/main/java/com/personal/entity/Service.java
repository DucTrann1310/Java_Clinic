package com.personal.entity;

import com.personal.BaseEntity;
import com.personal.enums.EServiceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "services")
public class Service extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private EServiceType serviceType;

    private String note;

    @Column(columnDefinition = "boolean default false")
    private Boolean insuranceAccepted;
}
