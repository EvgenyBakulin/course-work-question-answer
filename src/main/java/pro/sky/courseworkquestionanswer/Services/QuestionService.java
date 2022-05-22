package pro.sky.courseworkquestionanswer.Services;

import pro.sky.courseworkquestionanswer.Exeptions.SimilarQuestionExeption;
import pro.sky.courseworkquestionanswer.Exeptions.WrongRequestExeption;
import pro.sky.courseworkquestionanswer.Question;

import java.util.Collection;
import java.util.Random;


public interface QuestionService {
    Question add(String question, String answer) throws SimilarQuestionExeption;

    Question add(Question question);

    Question remove(String question, String answer) throws WrongRequestExeption;

    Collection<Question> getAll();

    Question getRandomQuestion();

    void setRandom(Random rand);

}
