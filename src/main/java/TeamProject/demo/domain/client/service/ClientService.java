package TeamProject.demo.domain.client.service;

import TeamProject.demo.domain.client.dto.ClientCreate;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public Client birthFind(String birth) {
        LocalDate date = LocalDate.parse(birth, DateTimeFormatter.ISO_DATE);

        Client top1ByBirthBefore = clientRepository.findTop1ByBirthBeforeOrderByBirthDesc(date);

        Client top1ByBirthAfter = clientRepository.findTop1ByBirthAfter(date);

        if (top1ByBirthBefore == null){
            return top1ByBirthAfter;
        }

        if (top1ByBirthAfter == null){
            return top1ByBirthBefore;
        }


        Duration duration1 = Duration.between(date.atStartOfDay(), top1ByBirthBefore.getBirth().atStartOfDay());
//        Duration duration1 = Duration.between(top1ByBirthBefore.getBirth().atStartOfDay(), date.atStartOfDay());
        Duration duration2 = Duration.between(date.atStartOfDay(), top1ByBirthAfter.getBirth().atStartOfDay());

        System.out.println("duration1 = " + Math.abs(duration1.toDays()));
        System.out.println("duration1 = " + Math.abs(duration2.toDays()));
        Client result = top1ByBirthAfter;
        if (Math.abs(duration1.toDays()) > Math.abs(duration2.toDays())){
            result = top1ByBirthAfter;
        }else{
            result = top1ByBirthBefore;
        }
        return result;

    }
}
