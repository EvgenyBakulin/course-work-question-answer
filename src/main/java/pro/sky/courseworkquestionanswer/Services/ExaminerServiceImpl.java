package pro.sky.courseworkquestionanswer.Services;

import org.springframework.stereotype.Service;
import pro.sky.courseworkquestionanswer.Exeptions.WrongAmountExeption;
import pro.sky.courseworkquestionanswer.Question;

import java.util.Collection;
import java.util.HashSet;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    public Collection<Question> getQuestion(int amount) {
        if (amount > questionService.getAll().size() || amount <= 0) {
            throw new WrongAmountExeption();
        } else {
            Collection<Question> questions = new HashSet<>();
            while (questions.size() < amount) {
                questions.add(questionService.getRandomQuestion());
            }
            return questions;
        }
    }
}
