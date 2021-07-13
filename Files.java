import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static void main(String[] args)
    {
        try {


            File file = new File("message.txt");
            File file2 = new File("art.txt");
            //Or use full directory

            if (file.exists() && file2.exists())
            {
                System.out.println("That file exists");
                System.out.println(file.isFile());

                String path = file.getAbsolutePath();
                String path2 = file2.getAbsolutePath();
                FileWriter writer = new FileWriter(path);
                FileReader reader = new FileReader(path2);

                //file.delete();
                writer.write("Default message");
                writer.append("\nAppended line");

                int data = reader.read();

                while(data != -1)
                {
                    System.out.print((char)data);
                    data = reader.read();
                }

                writer.close();
                reader.close();
            }

            else
            {
                System.out.println("That file doesn't exist");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
        finally {
            ;
        }
    }
}
