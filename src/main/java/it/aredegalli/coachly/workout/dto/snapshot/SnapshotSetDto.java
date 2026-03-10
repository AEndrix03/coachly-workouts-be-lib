package it.aredegalli.coachly.workout.dto.snapshot;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.aredegalli.coachly.workout.enums.LoadUnit;
import it.aredegalli.coachly.workout.enums.SetType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class SnapshotSetDto {

    @JsonProperty("source_set_id")
    private UUID sourceSetId;       // null = added live during session

    private Integer position;

    @JsonProperty("set_type")
    private SetType setType;

    @JsonProperty("planned_reps")
    private Integer plannedReps;

    @JsonProperty("planned_load")
    private BigDecimal plannedLoad;

    @JsonProperty("load_unit")
    private LoadUnit loadUnit;

    @JsonProperty("actual_reps")
    private Integer actualReps;

    @JsonProperty("actual_load")
    private BigDecimal actualLoad;

    private boolean completed;
    private boolean skipped;

    @JsonProperty("rest_seconds")
    private Integer restSeconds;

    private String notes;
}
