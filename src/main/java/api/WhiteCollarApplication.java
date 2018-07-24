package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class WhiteCollarApplication {
    
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
        return application.sources(WhiteCollarApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(WhiteCollarApplication.class, args);
	}

}
