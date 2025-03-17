package drawing.writing;

import drawing.shapes.Line;
import java.io.IOException;
import java.io.Writer;

public class JPEGWriter implements DrawingWriter {
    @Override
    public void write(Writer writer, Line[] lines) throws IOException {
        // Implement JPEG-specific drawing logic here
        // Example: Write lines to the file in JPEG format.
        writer.write("JPEG format drawing\n");
        for (Line line : lines) {
            writer.write(line.toString() + "\n");
        }
    }
}
