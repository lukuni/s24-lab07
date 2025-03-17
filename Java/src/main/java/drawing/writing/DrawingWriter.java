package drawing.writing;

import drawing.shapes.Line;
import java.io.Writer;
import java.io.IOException;

public interface DrawingWriter {
    void write(Writer writer, Line[] lines) throws IOException;
}
