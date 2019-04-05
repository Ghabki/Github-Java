import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DN08 {
    public static void main(String[] args) throws IOException {
        int stevec=0;
        int lala=0;
        int sestevek=0;
        String besedilo = args[0];
        String taprava = args[1];
        String dva = taprava.replace("+"," ");
        String ena = dva.replace("  "," ");
        String []rip = ena.split(" ");

        for (int i=0 ; i<rip.length;i++){
            rip[i]=rip[i].toLowerCase();
            rip[i]= rip[i].substring(0, 1).toUpperCase() + rip[i].substring(1);
        }
//------------------------------------------------------------------------------------
        Planet[] imenik = rak(besedilo);
        if (rip.length==1){



            for(int i=0;i<9;i++){
                if (imenik[i].ime.equals(rip[0])){
                    Planet lol = new Planet(imenik[i].ime,imenik[i].radius);
                    double d = lol.povrsina(imenik[i].radius);
                    int a =((int)d)/1000000;
                    System.out.println("Povrsina planetov "+ '\"'+ena+'"'+" je "+a+" milijonov km2");

                    break;
                }
            }
        }else{
            for (int q = 0;q<rip.length;q++){
                for(int i=0;i<9;i++){
                    if (imenik[i].ime.equals(rip[q])){
                        Planet lol = new Planet(imenik[i].ime,imenik[i].radius);
                        double j = lol.povrsina(imenik[i].radius);
                        j = j/1000000;
                        double k= Math.round(j*2)/2;
                        lala =(int)k;
                        sestevek = sestevek+lala;
                        break;
                    }


                    stevec++;

                }
                if (stevec==9 && q==rip.length){
                    System.out.println("Povrsina planetov "+ '\"'+taprava+'"'+" je "+0+" milijonov km2");
                    break;
                }else if (stevec==9){
                    sestevek= sestevek+0;
                    stevec=0;
                    continue;
                }
                stevec=0;


            }
            if (sestevek==0){
                System.out.println("Povrsina planetov "+ '\"'+taprava+'"'+" je "+sestevek+" milijonov km2");

            }else{


                System.out.println("Povrsina planetov "+ '\"'+taprava+'"'+" je "+sestevek+" milijonov km2");

            }

        }

    }
    static Planet[] rak(String file)throws IOException{
        int c = 0;
        Planet[]abc=new Planet[9];

        Scanner sc = new Scanner(new File(file));

        while(sc.hasNextLine()) {
            String vrstica = sc.nextLine();
            if (vrstica.contains(":")) {
                String[] line = vrstica.split(":");
                String a = line[0];

                int stevilka = Integer.parseInt(line[1]);

                abc[c]=new Planet(a,stevilka);
                c++;
                //abc[c++]= new Planet(line[0],line[1]);
            }else{
                continue;
            }
        }
        return abc;
    }
}

class Planet{
    String ime;
    int radius;
     Planet(String ime, int radius){
        this.ime=ime;
        this.radius=radius;
     }

    double povrsina(double r){
        double povrsina = 4*Math.PI*Math.pow(r,2);
        return povrsina;
    }
}
