package mvc.model;

import lombok.Data;

@Data
public class Foo {

    public String processFoo(String id) {
        return id + " processedFoo";
    }
}
