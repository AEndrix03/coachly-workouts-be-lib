package it.aredegalli.coachly.workout.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SetType {
    /** Serie standard. */
    @JsonProperty("normal")
    NORMAL,
    /** Riscaldamento. */
    @JsonProperty("warmup")
    WARMUP,
    /** Avvicinamento al carico di lavoro. */
    @JsonProperty("approach")
    APPROACH,
    /** Riduzione del carico senza riposo. */
    @JsonProperty("dropset")
    DROPSET,
    /** Microriposi intra-serie. */
    @JsonProperty("cluster")
    CLUSTER,
    /** Portata a cedimento muscolare. */
    @JsonProperty("failure")
    FAILURE,
    /** Breve riposo + ulteriori reps. */
    @JsonProperty("rest_pause")
    REST_PAUSE,
    /** As many reps as possible. */
    @JsonProperty("amrap")
    AMRAP
}
