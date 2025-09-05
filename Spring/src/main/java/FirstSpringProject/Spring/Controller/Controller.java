package FirstSpringProject.Spring.Controller;
import FirstSpringProject.Spring.Model.QuestionModel;
import FirstSpringProject.Spring.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("Question")
public class Controller {
    @Autowired
    QuestionService students;
    @GetMapping("/AllQuestions")
    public List<QuestionModel> getAllQuestions(){
        return students.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<QuestionModel> getQuestionByCategory(@PathVariable String category) {
        return students.getQuestionsByCategory(category);
    }
    @GetMapping("id/{id}")
    public Optional<QuestionModel> getQuestionByCategory(@PathVariable Integer id) {
        return students.getQuestionsById(id);
        }

    @PostMapping("add")
    public String addQuestions(@RequestBody QuestionModel questionModel){
        return students.addQuestion(questionModel);
    }
}
