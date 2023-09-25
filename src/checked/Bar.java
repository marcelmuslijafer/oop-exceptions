package checked;

import java.io.Closeable;
import java.io.IOException;

public class Bar implements Closeable {

    public void serveDBeer() {
        System.out.println("A beer for you!");
    }

    public void beQuiet() throws IllegalArgumentException {
        System.out.println("Turning down music");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing bar");
    }
}
