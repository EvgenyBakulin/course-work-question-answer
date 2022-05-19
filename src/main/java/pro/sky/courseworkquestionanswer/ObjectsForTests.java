package pro.sky.courseworkquestionanswer;

import java.util.List;
import java.util.Set;

public class ObjectsForTests {
    public static final Set<Question> QUESTIONS = Set.of(new Question("Что такое Java?","Java это язык программирования"),
            new Question("Какие Вы знаете циклы","for, while, do-while, forEach"),
            new Question("В какой области памяти хранятся переменные?", "В стеке"));
    public static final Set<Question> QUESTIONS_1 = Set.of( new Question("Какие Вы знаете циклы","for, while, do-while, forEach"),
            new Question("В какой области памяти хранятся переменные?", "В стеке"));
    public static final Question QUESTION_1 = new Question("Что такое Java?","Java это язык программирования");
    public static final Question QUESTION_2 = new Question("Какие Вы знаете циклы","for, while, do-while, forEach");
    public static final Question QUESTION_3 = new Question("В какой области памяти хранятся переменные?", "В стеке");
}
