package team.sunrise.managementplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author SilentWolf1997
 */
@SpringBootApplication
@MapperScan("team.sunrise.managementplatform.mapper")
public class ManagementplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementplatformApplication.class, args);
	}

}
