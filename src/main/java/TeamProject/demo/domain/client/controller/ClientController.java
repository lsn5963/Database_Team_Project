package TeamProject.demo.domain.client.controller;

import TeamProject.demo.domain.client.dto.ClientCreate;
import TeamProject.demo.domain.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/clientCreate")
    public ResponseEntity clientCreate(@RequestBody ClientCreate clientCreate){
        clientService.save(clientCreate);
//        System.out.println("clientRepository = " + clientRepository.findAll());
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/retrieveAllClient")
    public ResponseEntity retrieveAllClient(){
        System.out.println(clientService.findAll());
//        System.out.println("clientRepository = " + clientRepository.findAll());
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/retrieveClientByBirth")   //날짜를 기준으로 가장 생일이 가까운 고객 한명을 리턴
    public ResponseEntity retrieveClientByBirth(@RequestBody String birth){
        clientService.birthFind(birth);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
}
