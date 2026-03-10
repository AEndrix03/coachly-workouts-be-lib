package it.aredegalli.coachly.workout.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SessionStatus {
    @JsonProperty("in_progress")
    IN_PROGRESS,
    @JsonProperty("completed")
    COMPLETED,
    @JsonProperty("abandoned")
    ABANDONED
}
