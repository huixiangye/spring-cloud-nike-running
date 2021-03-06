package demo;

/**
 * Created by yehuixiang on 7/1/18.
 */
import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@EnableBinding(Source.class)
public class RunnerPositionSource {

    @Autowired
    private MessageChannel output;

    //relay the message to RabbitMQ
    @RequestMapping(path="/api/locations", method = RequestMethod.POST)
    public void location(@RequestBody String positionInfo) {
        log.info("Receiving currentPositionInfo from simulator " + positionInfo);
        this.output.send(MessageBuilder.withPayload(positionInfo).build());

    }
}