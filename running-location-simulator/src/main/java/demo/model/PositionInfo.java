package demo.model;

/**
 * Created by yehuixiang on 6/29/18.
 */
import lombok.Data;

@Data
public class PositionInfo {

    private String runningId;
    private Point position;
    private RunnerStatus runnerStatus = RunnerStatus.NONE;

    private Leg leg;

    private double distanceFromStart;

    private double speed;

    public PositionInfo(){

    }
}
