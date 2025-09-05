package FirstSpringProject.Spring.QuestionRepository;

import FirstSpringProject.Spring.Model.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepo extends JpaRepository<QuestionModel, Integer> {

    List<QuestionModel> findByCategory(String category);
    Optional<QuestionModel> findById(Integer id);
}

