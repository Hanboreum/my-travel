package com.example.mytravel.trip.db;

import com.example.mytravel.itinerary.db.ItineraryEntity;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = " trip") //db의 board table과 매칭
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)

public class TripEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long tripId;

    private String tripName;

    private LocalDate startDate;

    private LocalDate endDate;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @OneToMany(mappedBy = "trip")
    private List<ItineraryEntity> itineraryList = List.of();

}
