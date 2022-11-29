package TeamProject.demo.domain.client.service;

import TeamProject.demo.domain.client.dto.ClientCreate;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void save(ClientCreate clientCreate){
        Client client = new Client(clientCreate.getRegNumber(),clientCreate.getName(),clientCreate.getAddress()
                ,clientCreate.getBirth(),clientCreate.getEmail(),clientCreate.getPhoneNumber(), clientCreate.getJob());
        clientRepository.save(client);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public void birthFind(String birth) {
//        clientRepository.findAllByIdOrderByBirth();
    }
}
