package it.aredegalli.coachly.workout.dto;

import it.aredegalli.coachly.workout.dto.snapshot.SessionSnapshotDto;
import it.aredegalli.coachly.workout.enums.SessionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutSessionDto {

    private UUID id;
    private UUID userId;
    private UUID workoutId;
    private SessionStatus status;
    private OffsetDateTime startedAt;
    private OffsetDateTime endedAt;
    private Integer durationSeconds;
    private SessionSnapshotDto snapshot;
    private Short totalSets;
    private Short completedSets;
    private BigDecimal totalVolumeKg;
    private String notes;
    private OffsetDateTime syncedAt;
}
