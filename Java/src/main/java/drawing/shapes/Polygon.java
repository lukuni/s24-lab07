

package drawing.shapes;

public abstract class Polygon implements Shape {

    protected final int[][] points;

    protected Polygon(int[][] points) {
        this.points = points;
    }

    @Override
    public Line[] toLines() {
        int numPoints = points.length;
        Line[] lines = new Line[numPoints];
        for (int i = 0; i < numPoints; i++) {
            lines[i] = new Line(points[i], points[(i + 1) % numPoints]);
        }
        return lines;
    }
}
