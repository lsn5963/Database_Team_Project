package TeamProject.demo.domain.history.service;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.account.repository.AccountRepository;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    @Autowired
    AccountRepository accountRepository;
    public void findId(Long accountId) {

    }

    public void findNameId(String name, Long accountId) {
    }
}
