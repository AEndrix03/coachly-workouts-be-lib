package it.aredegalli.coachly.workout.dto.command;

import it.aredegalli.coachly.workout.enums.LoadUnit;
import it.aredegalli.coachly.workout.enums.SetType;
import jakarta.validation.constraints.Min;
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
public class WorkoutSetUpsertRequestDto {

    private UUID id;
    private Short position;
    private SetType setType;

    @Min(0)
    private Short reps;

    private BigDecimal load;
    private LoadUnit loadUnit;

    @Min(0)
    private Short restSeconds;

    private String notes;
}
