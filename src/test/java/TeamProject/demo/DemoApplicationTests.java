package TeamProject.demo;

import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ClientRepository clientRepository;
	@Test
	void contextLoads() {
//		Client client = new Client();
//		client.setAddress("용인");
////		client.setBirth("");
//		client.setEmail("lsn@sadlkj");
//		client.setJob("학생");
//		client.setName("이");
//		client.setRegNumber("01213-56547");

//		clientRepository.save(client);
	}

}
