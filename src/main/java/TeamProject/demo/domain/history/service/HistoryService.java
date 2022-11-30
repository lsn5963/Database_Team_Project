package TeamProject.demo.domain.history.service;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.account.repository.AccountRepository;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import TeamProject.demo.domain.history.entity.History;
import TeamProject.demo.domain.history.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryService {
    @Autowired
    HistoryRepository historyRepository;
    public void findId(Long accountId) {
        List<History> history = historyRepository.findByAccountId(accountId);
        for (History history1 : history) {
            System.out.println(history1.getDawDate());
        }
    }

    public void findNameId(String name, Long accountId) {
    }
}
