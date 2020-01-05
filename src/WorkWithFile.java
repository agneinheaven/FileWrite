import java.io.*;

public class WorkWithFile{
    public static void main(String[] args){
        try{
            File file = new File("./db.txt");
            FileWriter pw = new FileWriter(file, true);
            pw.write("Antanas1\n");
            pw.write("Antanas2\n");
            pw.write("Antanas3\n");
            pw.close();


            File file2 = new File("./db.txt");
            BufferedReader br = new BufferedReader(new FileReader(file2));
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            br.close();
            System.out.println(line1 + line2 + line3);

        }catch(IOException e)
        {
        }
    }
}