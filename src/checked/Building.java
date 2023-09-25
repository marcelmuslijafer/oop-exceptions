package checked;

import java.io.IOException;

public class Building {
    Bar bar = new Bar();

    public void turnDownMusic() throws IOException {
        bar.beQuiet();
        bar.close();
    }
}
