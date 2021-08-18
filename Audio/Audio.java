package Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args)
    {
        try
        {
            File file = new File("Audio\\Sound.wav");

            Scanner scanner = new Scanner(System.in);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            //Getting the clip and audio system

            char response = ' ';

            while (response != 'Q')
            {
                System.out.println("P = Play S = Stop R = Reset Q = Quit");
                response = scanner.next().charAt(0);

                switch (response)
                {
                    case 'P':
                    {
                        clip.start();
                        break;
                    }
                    case 'S':
                    {
                        clip.stop();
                        break;
                    }
                    case 'R':
                    {
                        clip.setMicrosecondPosition(0);
                        break;
                    }
                    case 'Q':
                    {
                        break;
                    }

                    default:
                    {
                        System.out.println("Invalid character");
                    }
                }
            }
            //While loop to keep the clip playing and some interactivity

        }
        catch (javax.sound.sampled.UnsupportedAudioFileException e)
        {
            System.out.println("Unsupported audio file");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("IOException");
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
        //Handling exceptions
    }

}
