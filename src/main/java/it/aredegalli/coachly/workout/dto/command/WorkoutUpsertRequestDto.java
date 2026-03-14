package it.aredegalli.coachly.workout.dto.command;

import it.aredegalli.coachly.workout.enums.WorkoutStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutUpsertRequestDto {

    private UUID id;

    @NotBlank
    private String name;

    @Valid
    @Builder.Default
    private Map<String, WorkoutTranslationDto> translations = new LinkedHashMap<>();

    private WorkoutStatus status;

    @Valid
    @Builder.Default
    private List<WorkoutBlockUpsertRequestDto> blocks = new ArrayList<>();
}
