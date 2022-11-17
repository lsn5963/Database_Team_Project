package TeamProject.demo.domain.history.repository;

import TeamProject.demo.domain.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
