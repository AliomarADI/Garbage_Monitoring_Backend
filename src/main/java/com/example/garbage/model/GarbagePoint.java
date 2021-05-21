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
}
