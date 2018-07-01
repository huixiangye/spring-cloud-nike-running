package demo.task;

/**
 * Created by yehuixiang on 6/29/18.
 */
import lombok.AllArgsConstructor;
        import lombok.Data;

        import java.util.concurrent.Future;

@Data
@AllArgsConstructor
public class LocationSimulatorInstance {

    private long instanceId;
    private LocationSimulator locationSimulator;
    private Future<?> locationSimulatorTask;

}