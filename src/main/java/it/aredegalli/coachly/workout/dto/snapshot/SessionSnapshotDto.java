package it.aredegalli.coachly.workout.dto.snapshot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Deserialization target for {@link com.coachly.workout.model.WorkoutSession#snapshot}.
 *
 * <p>Used by {@code SnapshotAnalyzer} to extract stats and by the API layer
 * to return structured session data to the client.
 *
 * <p>All fields are nullable to handle partial or legacy snapshots gracefully.
 */
@Data
public class SessionSnapshotDto {

    @JsonProperty("workout_name")
    private String workoutName;

    private List<SnapshotBlockDto> blocks;
}
