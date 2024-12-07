package exercise;

// BEGIN
//import Point.java;

public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        var middleX = (endPoint.getX() - beginPoint.getX()) / 2 + beginPoint.getX();
        var middleY = (endPoint.getY() - beginPoint.getY()) / 2 + beginPoint.getY();
        var middlePoint = new Point(middleX, middleY);
        return middlePoint;
    }
}
// END
