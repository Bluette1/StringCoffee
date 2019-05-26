package stringcoffee;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the ProcessFiles class.
 *
 * @author marylene
 * @since 26 May 2019
 */
public class ProcessFilesTest {

    @Test
    /**
     * This will test that the correct processed files string is retrieved.
     *
     * @covers stringcoffee.ProcessFiles.processString()
     */
    public void testProcessFiles() {

        System.out.println("processString");

        String[][] testScenarios = new String[][]{
            {"music 1011b\nimages 0b\nmovies 10200b\nother 105b",
                "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\n"
                + "video.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"
            }
        };

        for (String[] scenario : testScenarios) {
            String expResult = scenario[0];
            String string = scenario[1];
            String result = ProcessFiles.processString(string);
            assertEquals(
                    "The result was expected to equal the expected result",
                    expResult,
                    result
            );
        }
    }
}
