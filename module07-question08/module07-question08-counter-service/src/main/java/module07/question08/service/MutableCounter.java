package module07.question08.service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Component
@SessionScope
public class MutableCounter {

    private int number;

    public void countUp() {
        ++number;
    }
}
