package mvc.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JsonResponse {

    private String name;
    private String lastName;
    private String id;
    private String department;
    private String address;
    private String course;
}
