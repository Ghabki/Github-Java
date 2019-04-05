import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DN10 {


    public static void main (String [] args)throws IOException{
        
        int stevilka = Integer.parseInt(args[1]);
        
        if (stevilka==1){
            ena(args[0]);

        }else if(stevilka==2){
            dva(args[0]);
        }
    }


    public static void ena(String datoteka)throws IOException {
        Scanner sc = new Scanner(new File(datoteka));

        int stevec = 0;
        int rak = 0;

        while (sc.hasNext()){
            String ok = sc.next();
            rak++;

        }

        sc.close();
        Scanner oke = new Scanner(new File(datoteka));
        String[] lol = new String[rak];

        while (oke.hasNext()){
            String rip = oke.next();
            rip = rip.replace(".","");
            rip = rip.replace(",","");
            rip = rip.replace("(","");
            rip = rip.replace(")","");
            rip = rip.replace(";","");
            rip = rip.replace("-","");
            String [] tabelca= rip.split(" ");
            lol[stevec]= tabelca[0];
            stevec++;
        }
        Arrays.sort(lol);
        //System.out.println(Arrays.toString(lol));



        int presteto = 0;
        String ze_uporabljen= "";
        for (int i = 0; i<rak; i++){

            String iskan = lol[i];
            for (String k: lol){
                if (iskan.equals(k) && !(iskan.equals(ze_uporabljen))){
                    presteto =presteto+ 1;
                    continue;
                }
            }
            if (!(iskan.equals(ze_uporabljen))){
                if (presteto>9){
                    System.out.printf(presteto+"    "+lol[i]+ "\n");
                    ze_uporabljen= lol[i];
                    presteto=0;
                }else{
                    System.out.printf("%d     %s\n",presteto,lol[i]);
                    ze_uporabljen= lol[i];
                    presteto=0;
                }
            }


        }

    }
    public static void dva(String datoteka){
    
    
    
    }
}
