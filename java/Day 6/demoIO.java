import java.io.File;
import java.io.FileReader;
class demoIO
{
        public static void main(String args[]) throws Exception
        {
                FileReader f = new FileReader(new File(args[0]));
                int i=0;
                while((i=f.read())!=-1)
                System.out.print((char)i);
        }
}