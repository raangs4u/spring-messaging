package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by rmandada on 15/12/15.
 */
@Controller
public class GreetingController {

    @MessageMapping(value = "/hello")
    @SendTo(value = "/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        //Thread.sleep(3000);

        return new Greeting("Hello, " + message.getName() + "!");
    }
}
