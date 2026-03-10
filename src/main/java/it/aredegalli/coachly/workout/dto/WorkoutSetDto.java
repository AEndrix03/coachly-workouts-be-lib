package it.aredegalli.coachly.workout.dto;

import it.aredegalli.coachly.workout.enums.LoadUnit;
import it.aredegalli.coachly.workout.enums.SetType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutSetDto {

    private UUID id;
    private UUID entryId;
    private Short position;
    private SetType setType;
    private Short reps;
    private BigDecimal load;
    private LoadUnit loadUnit;
    private Short restSeconds;
    private String notes;
}
