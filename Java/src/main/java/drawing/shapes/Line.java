package drawing.shapes;

public class Line {

    private final int[] start;
    private final int[] end;

    public Line(int[] start, int[] end) {
        this.start = start;
        this.end = end;
    }

    public int[] getStart() {
        return start;
    }

    public int[] getEnd() {
        return end;
    }
}
