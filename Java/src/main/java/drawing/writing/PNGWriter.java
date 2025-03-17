package drawing.writing;

import drawing.shapes.Line;
import java.io.IOException;
import java.io.Writer;

public class PNGWriter implements DrawingWriter {
    @Override
    public void write(Writer writer, Line[] lines) throws IOException {
        // Implement PNG-specific drawing logic here
        // Example: Write lines to the file in PNG format.
        writer.write("PNG format drawing\n");
        for (Line line : lines) {
            writer.write(line.toString() + "\n");
        }
    }
}
