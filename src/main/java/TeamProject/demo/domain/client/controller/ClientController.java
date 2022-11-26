package TeamProject.demo.domain.client.controller;

import TeamProject.demo.domain.client.clientDto.ClientCreate;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import TeamProject.demo.domain.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/clientRetrieve")
    public String clientRetrieve(@RequestBody ClientCreate clientCreate){
        clientService.save(clientCreate);
//        System.out.println("clientRepository = " + clientRepository.findAll());
        return "test";
    }
    @RequestMapping("/clientRetrieve/findAll")
    public String clientFindAll(){
        System.out.println(clientService.findAll());
//        System.out.println("clientRepository = " + clientRepository.findAll());
        return "test";
    }
}
