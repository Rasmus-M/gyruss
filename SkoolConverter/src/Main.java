import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new SkoolConverter(true).convert(
            new File("../gyruss-skoolkit/src/gyruss.skool"),
            new File("src/gyruss.a99"),
            0x7000,
            0xc000
        );
    }
}
