import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DN06{

    public static void main(String []args)throws IOException{

        String a = args[0];
        Scanner binarno = new Scanner(new File(a));

        String str = "";
        while(binarno.hasNext()){
            String hmm = binarno.nextLine();
            for (int i = 0; i < hmm.length()/8; i++) {

                int b = Integer.parseInt(hmm.substring(8*i,(i+1)*8),2);
                str += (char)(b);
            }
        }
        System.out.printf(str);
    }
}

