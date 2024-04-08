package org.example.flyweight;

import java.util.ArrayList;
import java.util.List;

import static org.example.flyweight.PointType.CAFE;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(1, 2, iconFactory.getPointIcon(CAFE));
        points.add(point);

        return points;
    }
}
