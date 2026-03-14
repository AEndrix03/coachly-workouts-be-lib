package it.aredegalli.coachly.workout.dto.command;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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
public class WorkoutBlockEntryUpsertRequestDto {

    private UUID id;

    @NotNull
    private UUID exerciseId;

    private Short position;

    @Valid
    @Builder.Default
    private List<WorkoutSetUpsertRequestDto> sets = new ArrayList<>();
}
