package demo.model;

/**
 * Created by yehuixiang on 6/29/18.
 */
import lombok.Data;

@Data
public class Leg {

    private int id;
    private Point startPosition;
    private Point endPosition;
    private double length;
    private double heading;

    public Leg(){

    }
}
