package com.example.mytravel.itinerary.db;

import com.example.mytravel.trip.db.TripEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = " itinerary") //db의 board table과 매칭
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)

public class ItineraryEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long itineraryId;

    private Long tripId;

    private String departurePlace;

    private String destination;

    private LocalDate startDate;

    private LocalDate endDate;

    @Column(columnDefinition = "TEXT")
    private String comment;


}
