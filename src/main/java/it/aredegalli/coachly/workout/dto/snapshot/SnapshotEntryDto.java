package it.aredegalli.coachly.workout.dto.snapshot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class SnapshotEntryDto {

    @JsonProperty("source_entry_id")
    private UUID sourceEntryId;     // null = added live during session

    @JsonProperty("exercise_id")
    private UUID exerciseId;

    /**
     * Exercise name denormalized at session creation time.
     * Stable across catalog changes and shows the name the user saw that day.
     */
    @JsonProperty("exercise_name")
    private String exerciseName;

    private Integer position;

    private List<SnapshotSetDto> sets;
}
