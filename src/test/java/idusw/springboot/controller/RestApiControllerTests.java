package idusw.springboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

@SpringBootTest
public class RestApiControllerTests {
    @Autowired
    RestApiController restApiController;
    @Test
    public void postTests() {
                    Model model = null;
                    restApiController.updateMember(123L, model);
    }
}
