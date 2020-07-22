package mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Application {

    // Spring Tutorial found at
    // https://spring.io/guides/gs/serving-web-content/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}