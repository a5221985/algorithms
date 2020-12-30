import java.io.IOException;
import java.nio.file.Path;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;


public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count = 0;
        Path filePath = null;

        // First, obtain a path to the file
        try {
            filePath = Path.of("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path error: " + e);
            return;
        }

        // Next, obtain a channel to that file within a try-with-resources block.
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)) {
            // Allocate a buffer
            ByteBuffer mBuf = ByteBuffer.allocate(128);
     
            do {
                // Read a buffer.
                count = fChan.read(mBuf);

                // Stop when end of file is reached.
                if (count != -1) {
                    // Rewind the buffer so that it can be read
                    mBuf.rewind();

                    // Read bytes from the buffer and show
                    // them on the screen as characters.
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
