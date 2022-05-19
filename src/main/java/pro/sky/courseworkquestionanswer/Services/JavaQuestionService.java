package pro.sky.courseworkquestionanswer.Services;

import org.springframework.stereotype.Service;
import pro.sky.courseworkquestionanswer.Exeptions.SimilarQuestionExeption;
import pro.sky.courseworkquestionanswer.Exeptions.WrongRequestExeption;
import pro.sky.courseworkquestionanswer.Question;
import pro.sky.courseworkquestionanswer.Services.QuestionService;

import java.util.*;

import static java.lang.Math.abs;

@Service
public class JavaQuestionService implements QuestionService {
    private Set<Question> questions;

    public JavaQuestionService() {
        this.questions = new HashSet<>();
    }

    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        if (questions.contains(q)) {
            throw new SimilarQuestionExeption();
        } else {
            questions.add(q);
            return q;
        }
    }

    public Question add(Question q) {
        if (questions.contains(q)) {
            throw new SimilarQuestionExeption();
        } else {
            questions.add(q);
            return q;
        }
    }
//Чтобы избежать логики в контроллере, в качестве параметров сразу передал поля
    public Question remove(String question, String answer) {
        Question q = new Question(question, answer);
        if (!questions.contains(q)) {
            throw new WrongRequestExeption();
        } else {
            questions.remove(q);
            return q;
        }
    }

    public Collection<Question> getAll() {
        return questions;
    }

    public Question getRandomQuestion() {
        Random rand = new Random();
        int i = abs(rand.nextInt() % questions.size());
        List<Question> list = new ArrayList<>(questions);
        return list.get(i);
    }

}
