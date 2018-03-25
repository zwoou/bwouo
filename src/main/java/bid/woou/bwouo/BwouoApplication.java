package bid.woou.bwouo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;




@ServletComponentScan
@SpringBootApplication
public class BwouoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BwouoApplication.class, args);
	}
}
