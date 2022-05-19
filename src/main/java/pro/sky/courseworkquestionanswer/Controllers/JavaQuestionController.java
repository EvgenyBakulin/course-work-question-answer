package pro.sky.courseworkquestionanswer.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.courseworkquestionanswer.Question;
import pro.sky.courseworkquestionanswer.Services.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    public final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/java")
    public Collection<Question> getAll() {
        return questionService.getAll();
    }

    @GetMapping("/java/add")
    public Question add(@RequestParam(value = "question") String questionText,
                        @RequestParam(value = "answer") String answerText) {
        return questionService.add(questionText, answerText);
    }

    @GetMapping("/java/remove")
    public Question remove(@RequestParam(value = "question") String questionText,
                           @RequestParam(value = "answer") String answerText) {

        return questionService.remove(questionText,answerText);
    }

}
