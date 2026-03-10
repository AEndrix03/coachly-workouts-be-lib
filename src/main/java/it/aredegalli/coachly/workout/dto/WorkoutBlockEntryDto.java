package it.aredegalli.coachly.workout.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutBlockEntryDto {

    private UUID id;
    private UUID blockId;
    private UUID exerciseId;
    private Short position;

    @Builder.Default
    private List<WorkoutSetDto> sets = new ArrayList<>();
}
