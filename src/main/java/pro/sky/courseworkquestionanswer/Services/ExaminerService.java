package pro.sky.courseworkquestionanswer.Services;

import pro.sky.courseworkquestionanswer.Exeptions.WrongAmountExeption;
import pro.sky.courseworkquestionanswer.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount) throws WrongAmountExeption;
}
