import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DN11 {
    public static void main(String[] args)throws IOException {
        String ime = args[0];
        int vrstice = Integer.parseInt(args[1]);
        String poravnano = args[2];
        int count=0;

        if (poravnano.equals("1")){
            Scanner lol = new Scanner(new File(ime));
            while (lol.hasNext()){
                String a = lol.next();
                count++;
            }
            lol.close();
            String[] tabelica= new String[count];
            count= 0;
            Scanner lel = new Scanner(new File(ime));
            while (lel.hasNext()){
                String b = lel.next();
                tabelica[count]=b;
                count++;
            }
            String hmm = "";
            int counter= -1;
            for (int i=0;i<count;i++){
                String v = tabelica[i];
                int c = v.length();
                //System.out.println(c);
                if ((counter+c)<vrstice) {
                    hmm += " " + v;
                    counter = counter + c + 1;



                }else{
                    hmm = hmm.trim();
                    System.out.printf(hmm+"\n");
                    hmm= "";
                    System.out.printf(v+" ");
                    counter= 0+c;
                }

            }
            System.out.printf(hmm.trim());
            lel.close();
            System.out.println();





            //System.out.println(Arrays.toString(tabelica));












        }else if(poravnano.equals("x")){

        }



    }

}
