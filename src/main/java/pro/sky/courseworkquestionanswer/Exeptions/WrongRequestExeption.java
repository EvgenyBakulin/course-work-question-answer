package pro.sky.courseworkquestionanswer.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Такого вопроса нет")
public class WrongRequestExeption extends RuntimeException{
    public WrongRequestExeption(){
        super();
    }
}
