package pro.sky.courseworkquestionanswer.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Такой вопрос уже есть")
public class SimilarQuestionExeption extends RuntimeException{
    public SimilarQuestionExeption(){
        super();
    }
}
