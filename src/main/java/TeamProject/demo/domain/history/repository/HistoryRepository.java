package TeamProject.demo.domain.history.repository;

import TeamProject.demo.domain.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    List<History> findByAccountId(Long accountId);
    List<History> findByAccountIdAndDawDateBetween(Long id, LocalDateTime start, LocalDateTime end);
}
