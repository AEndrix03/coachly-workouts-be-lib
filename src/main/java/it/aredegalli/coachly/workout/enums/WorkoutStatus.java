package it.aredegalli.coachly.workout.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum WorkoutStatus {
    @JsonProperty("draft")
    DRAFT,
    @JsonProperty("active")
    ACTIVE,
    @JsonProperty("archived")
    ARCHIVED
}
