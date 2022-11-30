package TeamProject.demo.domain.history.service;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.account.repository.AccountRepository;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import TeamProject.demo.domain.history.entity.History;
import TeamProject.demo.domain.history.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HistoryService {
    @Autowired
    HistoryRepository historyRepository;

    @Autowired
    AccountRepository accountRepository;
    public void findId(Long accountId) {
        List<History> history = historyRepository.findByAccountId(accountId);

        LocalDateTime end = LocalDateTime.now();
        LocalDateTime start = end.minusMonths(1);
        List<History> betweenHistory = historyRepository.findByAccountIdAndDawDateBetween(accountId, start, end);

        for (History history1 : betweenHistory) {
            System.out.println("history1.getId() = " + history1.getId());
        }

    }

    public void findNameId(String name, Long accountId) {
        List<Account> account = accountRepository.findByName(name);

    }
}
