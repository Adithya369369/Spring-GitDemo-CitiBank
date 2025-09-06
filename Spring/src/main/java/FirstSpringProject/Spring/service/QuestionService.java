package FirstSpringProject.Spring.service;
import FirstSpringProject.Spring.Model.QuestionModel;
import FirstSpringProject.Spring.QuestionRepository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class QuestionService {
    @Autowired
    QuestionRepo questionRepo;

    public List<QuestionModel> getAllQuestions() {
        return questionRepo.findAll();
    }

    public List<QuestionModel> getQuestionsByCategory(String category) {
        return questionRepo.findByCategory(category);
    }

    public Optional<QuestionModel> getQuestionsById(Integer id) {
        try {
            return questionRepo.findById(id);   // returns Optional<QuestionModel>
        } catch (Exception e) {
            // log properly if you have a logger
            System.out.println("Error while fetching question: " + e.getMessage());
            return Optional.empty();
        }
    }

    public String addQuestion(QuestionModel questionModel) {
        questionRepo.save(questionModel);
        return "success";
    }

    public String addSecondQuestion(QuestionModel questionModel) {
        questionRepo.save(questionModel);
        return "success";
    }
}

