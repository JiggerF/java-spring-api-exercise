package mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FooRequestDto {

    @JsonProperty
    private String id;
}
