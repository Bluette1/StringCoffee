package stringcoffee;

import java.util.Arrays;

/**
 * This will retrieve the number of bytes for each file type
 *
 * @see /instructions/screencapture-app-codility-c-run-2B2NS8-M7X-2019-05-20-07_40_15.pdf
 *
 * @author marylene
 */
public class ProcessFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\n"
                + "video.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";

        String result = processString(s);

        System.out.println(result);
    }

    static String processString(String string) {
        String processedString = "";
        String[] lines = string.split("\\n");

        int music = 0;
        int images = 0;
        int movies = 0;
        int other = 0;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            int indexOfSpace = line.indexOf(" ");
            String fileName = line.substring(0, indexOfSpace);
            if (fileName.endsWith(".mp3") || fileName.endsWith(".aac")
                    || fileName.endsWith(".flac")) {
                String bytes = line.substring(indexOfSpace + 1, line.lastIndexOf('b'));

                music += Integer.parseInt(bytes);
            } else if (fileName.endsWith(".jpg") || fileName.endsWith(".bmp")
                    || fileName.endsWith(".gif")) {
                String bytes = line.substring(indexOfSpace + 1, line.lastIndexOf('b'));

                images += Integer.parseInt(bytes);
            } else if (fileName.endsWith(".mp4") || fileName.endsWith(".avi")
                    || fileName.endsWith(".mkv")) {
                String bytes = line.substring(indexOfSpace + 1, line.lastIndexOf('b'));

                movies += Integer.parseInt(bytes);
            } else {

                String bytes = line.substring(indexOfSpace + 1, line.lastIndexOf('b'));

                other += Integer.parseInt(bytes);

            }

            processedString = "music " + music + "b\nimages " + images + "b\n"
                    + "movies " + movies + "b\nother " + other + "b";

        }

        return processedString;

    }
}
