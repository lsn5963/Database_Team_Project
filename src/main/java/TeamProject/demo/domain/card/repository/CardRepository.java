package TeamProject.demo.domain.card.repository;

import TeamProject.demo.domain.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
