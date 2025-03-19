package next.reflection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Junit3Runner {

    private static final Logger log = LoggerFactory.getLogger(Junit3Runner.class);

    @Test
    @DisplayName("Question 클래스의 모든 필드, 생성자, 메소드에 대한 정보를 출력한다.")
    public void runner() throws Exception {
        Class clazz = Question.class;
        log.info("clazz: {}", clazz);
    }
}
