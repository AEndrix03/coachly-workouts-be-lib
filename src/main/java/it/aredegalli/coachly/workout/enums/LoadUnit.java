package it.aredegalli.coachly.workout.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LoadUnit {
    @JsonProperty("kg")
    KG,
    @JsonProperty("lbs")
    LBS,
    @JsonProperty("bodyweight")
    BODYWEIGHT,
    @JsonProperty("band")
    BAND,
    @JsonProperty("machine_notch")
    MACHINE_NOTCH
}
