package drawing;

import drawing.shapes.Shape;
import drawing.writing.DrawingWriter;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Refactored Drawing class.
 */
public class Drawing {

    private static final String JPEG_FORMAT = "jpeg";
    private static final String PNG_FORMAT = "png";

    private final List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Draw shapes to a file with the given format.
     * 
     * @param format File format (e.g., "jpeg", "png").
     * @param writer Output writer for the file.
     */
    
    /**
     * Get the appropriate DrawingWriter based on the format.
     *
     * @param format the file format.
     * @return a DrawingWriter instance or null if format is unsupported.
     */
    private DrawingWriter getDrawingWriter(String format) {
        switch (format.toLowerCase()) {
            case JPEG_FORMAT:
                return new JPEGWriter();
            case PNG_FORMAT:
                return new PNGWriter();
            default:
                return null;  // Unsupported format
        }
    }
}
