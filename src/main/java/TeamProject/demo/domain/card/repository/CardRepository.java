package TeamProject.demo.domain.card.repository;

import TeamProject.demo.domain.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
//    List<Card> findByName(String name);

//    List<Card> findByregNum

    List<Card> findByRegNumber(String regNumber);
}
