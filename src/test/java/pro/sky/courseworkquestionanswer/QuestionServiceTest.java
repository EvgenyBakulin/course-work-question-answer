package pro.sky.courseworkquestionanswer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworkquestionanswer.Exeptions.SimilarQuestionExeption;
import pro.sky.courseworkquestionanswer.Exeptions.WrongRequestExeption;
import pro.sky.courseworkquestionanswer.Services.JavaQuestionService;
import pro.sky.courseworkquestionanswer.Services.QuestionService;

import java.util.*;

import static org.mockito.Mockito.*;
import static pro.sky.courseworkquestionanswer.ObjectsForTests.*;

@ExtendWith(MockitoExtension.class)
public class QuestionServiceTest {
    QuestionService out = new JavaQuestionService();

    @Test
    public void isCorrectWorkOfAdd() {
        Question result = out.add("Что такое Java?", "Java это язык программирования");
        Assertions.assertTrue(out.getAll().contains(result));
        Assertions.assertThrows(SimilarQuestionExeption.class, () -> out.add(QUESTION_1));
    }

    @Test
    public void isCorrectWorkOfAddParamObject() {
        Question result = out.add(QUESTION_1);
        Assertions.assertTrue(out.getAll().contains(result));
        Assertions.assertThrows(SimilarQuestionExeption.class, () -> out.add(QUESTION_1));
    }

    @Test
    public void isCorrectGetAll() {
        out.add(QUESTION_1);
        out.add(QUESTION_2);
        out.add(QUESTION_3);
        Collection<Question> actual = out.getAll();
        Set<Question> expected = QUESTIONS;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void isCorrectWorkOfRemove() {
        out.add(QUESTION_1);
        out.add(QUESTION_2);
        Question result = out.remove("Что такое Java?", "Java это язык программирования");
        Assertions.assertEquals(result, QUESTION_1);
        Assertions.assertThrows(WrongRequestExeption.class, () -> out.remove("Что такое C++?", "Это язык программирования"));
    }

    @Test
    public void isCorrectRandom() {
        Random fakeRandom = mock(Random.class, withSettings().withoutAnnotations());
        when(fakeRandom.nextInt()).thenReturn(1);
        out.add(QUESTION_1);
        out.add(QUESTION_2);
        out.add(QUESTION_3);
        Assertions.assertEquals(out.getRandomQuestion(), QUESTION_2);
    }
}
