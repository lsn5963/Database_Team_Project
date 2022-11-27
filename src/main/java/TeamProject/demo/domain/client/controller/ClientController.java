package TeamProject.demo.domain.client.controller;

import TeamProject.demo.domain.client.dto.ClientCreate;
import TeamProject.demo.domain.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/retrieveClientByBirth")   //날짜를 기준으로 가장 생일이 가까운 고객 한명을 리턴
    public String retrieveClientByBirth(@RequestBody String birth){
        clientService.birthFind(birth);
        return "";
    }
}
