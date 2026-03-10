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
public class WorkoutBlockDto {

    private UUID id;
    private UUID workoutId;
    private Short position;
    private String label;
    private Short restSeconds;
    private String notes;

    @Builder.Default
    private List<WorkoutBlockEntryDto> entries = new ArrayList<>();
}
