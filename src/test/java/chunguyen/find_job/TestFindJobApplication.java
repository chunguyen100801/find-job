package chunguyen.find_job;

import org.springframework.boot.SpringApplication;

public class TestFindJobApplication {

	public static void main(String[] args) {
		SpringApplication.from(FindJobApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
