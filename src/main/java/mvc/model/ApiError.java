package mvc.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Builder
@Data
public class ApiError {

    private HttpStatus httpStatus;
    private String errorId;
    private String errorMessage;
}
