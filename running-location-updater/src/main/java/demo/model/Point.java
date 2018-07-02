package demo.model;

/**
 * Created by yehuixiang on 7/1/18.
 */
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Point {
    private Double latitude;
    private Double longitude;

    @Override
    public String toString() {
        return "Point [lat/lang:" + latitude + "," + longitude + "]";
    }

}