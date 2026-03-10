package it.aredegalli.coachly.workout.dto.snapshot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class SnapshotBlockDto {

    @JsonProperty("source_block_id")
    private UUID sourceBlockId;     // null = added live during session

    private String label;
    private Integer position;

    @JsonProperty("rest_seconds")
    private Integer restSeconds;

    private List<SnapshotEntryDto> entries;
}
