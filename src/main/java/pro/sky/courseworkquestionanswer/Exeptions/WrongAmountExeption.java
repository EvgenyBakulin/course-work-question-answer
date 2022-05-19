package pro.sky.courseworkquestionanswer.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Неверный запрос количества вопросов")
public class WrongAmountExeption extends RuntimeException {
    public WrongAmountExeption() {
        super();
    }
}
