package it.aredegalli.coachly.workout.dto.command;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
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
public class WorkoutBlockUpsertRequestDto {

    private UUID id;
    private Short position;
    private String label;

    @Min(0)
    private Short restSeconds;

    private String notes;

    @Valid
    @Builder.Default
    private List<WorkoutBlockEntryUpsertRequestDto> entries = new ArrayList<>();
}
