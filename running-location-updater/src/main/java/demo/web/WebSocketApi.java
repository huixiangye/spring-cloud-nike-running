package demo.web;

/**
 * Created by yehuixiang on 7/1/18.
 */
import demo.model.CurrentPosition;
import demo.model.CurrentPositionDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

public class WebSocketApi {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/locations")
    public CurrentPositionDto sendMessage(CurrentPositionDto message) throws Exception {
        return message;
    }
}