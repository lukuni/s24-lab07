package drawing.shapes;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Refactored
 */
public interface Shape {
    /**
     * Converts shape into an array of lines.
     *
     * @return An array of lines representing this shape.
     */
    Line[] toLines();
}
