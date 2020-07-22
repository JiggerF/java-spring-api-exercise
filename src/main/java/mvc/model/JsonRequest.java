package mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class JsonRequest {

    @NotNull(message = "Name cannot be null")
    @JsonProperty
    private String name;

    @NotNull(message = "Name cannot be null")
    @JsonProperty
    private String lastName;

    @NotNull(message = "Id cannot be null")
    @Pattern(regexp = "[\\d]{5}" , message="Id char length should be 5")
    @JsonProperty
    private String id;
}
