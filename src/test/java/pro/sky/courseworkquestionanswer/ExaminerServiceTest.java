package pro.sky.courseworkquestionanswer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworkquestionanswer.Services.ExaminerServiceImpl;
import pro.sky.courseworkquestionanswer.Services.QuestionService;

import java.util.Set;

import static org.mockito.Mockito.when;
import static pro.sky.courseworkquestionanswer.ObjectsForTests.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    private QuestionService questionServiceMock;
    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void isCorrectGetQuestion() {
        when(questionServiceMock.getAll()).thenReturn(QUESTIONS);
        when(questionServiceMock.getRandomQuestion()).thenReturn(QUESTION_2,QUESTION_3);
        Set<Question> expected = QUESTIONS_1;
        Assertions.assertEquals(out.getQuestion(2),expected);
    }
}
