package com.example.garbage.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "garbages")
public class GarbagePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String country;
    String city;
    String address;
    String size;
    int userPhoneNumber;
//    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id",insertable = false,updatable = false)
//    private Account user;
    @Column(name = "user_id")
    private int userId;
}
