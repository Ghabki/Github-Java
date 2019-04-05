import java.util.Arrays;
import java.util.Scanner;
import java.io.File;



public class DN05{
    //------Main--------------------------------
    public static void main(String []args)throws Exception{

        String b = args[0];
        double a =Double.parseDouble(b);
        //System.out.printf(b+"  ");
        String hehe = args[1];
        //System.out.println(hehe);

        if (a == 1){
            ena(hehe);

        }else if (a == 2){
            dva(hehe, args);

        }else if (a == 3){
            tri(hehe);
        }
    }
    //-------------konce main-----------------------------
//-------------Ena-----------------------------------
    static void ena(String datoteka)throws Exception{
        int[] tabela = new int [10];
        String[] imena = new String [10]; //tehnicno so samo podatki 10 studentov
        int o = 0;
        int indeks = 0 ;  //do 9

        Scanner sc = new Scanner(new File(datoteka));
        while (sc.hasNext()) {
            String update = sc.next();
            //System.out.println(update);
            String[] del = update.split(":");
            String ime = del[0];
            int i = Integer.parseInt(del[1]);
            //rabu dat se da pretvori v string
            //System.out.println(del[1]);
            if (i >=o){
                tabela[indeks]= i;
                imena[indeks]= ime;
                o = i;
                indeks++;
                if (indeks>9){
                    indeks = 0;
                }
            }
        }
        System.out.printf("Max %d so dosegli:",o);
        System.out.println();
        for (int z = 0 ; z<=9;z++){
            if (tabela[z]==o){
                System.out.println(imena[z]);
            }else {
                continue;
            }
        }
        sc.close();
    }
    //------------Konec ena---------------------------------
//------------Dva----------------------------------------*--------------------------
    static void dva(String datoteka,String[]caj)throws Exception{
        String q = caj[2];
        int what = Integer.parseInt(q);//rak

        int[] hehe = preberi(datoteka);//ena- tabela

        int[] bbb =duplikati(hehe);//dva duplikati
        //System.out.println(Arrays.toString(bbb));//dva isto

        int []hmm=rotiraj(bbb,what);//tri

        izpisi(hmm);//stiri izpois
    }
    //----------pretvorba v tabelp---------------------------
    static int[] preberi(String datoteka)throws Exception{
        //int[] tabela1 = new int [1000];
        int t = 0;
        //int[] koncana = new int [x];
        Scanner Stevila = new Scanner(new File(datoteka));
        int Stevilka = Stevila.nextInt();
        int[] tabela = new int [Stevilka];

        while (Stevila.hasNext()) {
            Stevilka = Stevila.nextInt();
            tabela[t] = Stevilka;
            //System.out.println(Stevilka);
            t++;
        }
        Stevila.close();
        //System.out.println(Arrays.toString(koncana));
        return tabela;
    }
    //-----------------pobrise duplikate------------------------------------
    static int[] duplikati(int[]a) {
        //ArrayUtils.contains(array, key);
        int f = a.length;
        int[] gaga = new int [f];
        int g = 0;
        //System.out.println(Arrays.toString(gaga));

        boolean found = false;

        for (int h=0;h<f;h++){
            for (int n =0;n<f;n++){
                if (gaga[n] == a[h]){
                    if (gaga[n]==0){
                        if (gaga[g-1]==0){
                            found=true;
                            break;
                        }
                        gaga[g]=a[h];
                        g++;

                    }
                    found = true;
                    break;
                }
            }
            if (found==false){

                gaga[g]=a[h];
                g++;

            }else{
                found = false;
            }
        }
        int[] lolko = new int [g];
        for (int z = 0;z<g;z++){
            lolko[z]=gaga[z];
        }
        return lolko;

    }
    //------------izpis-----------------------------------------
    static int[] izpisi(int[]a){
        int dolzina = a.length;
        for (int i=0; i<dolzina; i++) {
            System.out.print(a[i] + " ");
        }
        return null;
    }
    //------------rotacija--------------------------------------
    static  int[] rotiraj(int[]caca, int k) {
        if (k == 0){
            return caca;
        }
        int v = 1;
        //int[] wtf = new int[caca.length];
        for (int i=0;i<k;i++){
            int a = caca[0];
            for (int c=0;c<caca.length-1;c++){
                caca[c]=caca[c+1];
            }
            caca[caca.length-1]=a;
        }
        return caca;

    }
    //----------konec druge----------------------------------------------------
    static void tri(String datoteka)throws Exception{

        int lol=0;
        int a = 0;
        int indeks = 0;
        int stetje = 0;

        Scanner sc = new Scanner(new File(datoteka));
        String update = sc.nextLine();
        String[] del = update.split(" ");

        int vrstica = Integer.parseInt(del[0]);
        int stolpec = Integer.parseInt(del[1]);
        //System.out.println(Arrays.toString(del));//dva isto
        int[][] tabelca = new int[vrstica][stolpec];
        vrstica = vrstica-1;
        stolpec = stolpec-1;
        int tb = vrstica+1;
        String hmm = sc.nextLine();
        //System.out.println(hmm);
        String[] dell = hmm.split(" ");
        //Arrays.sort(dell);
        int[] zacasna = new int[tb];
        //System.out.println(Arrays.toString(dell));
        for (int i = vrstica;i>=0;i--){
            for (int j = stolpec;j>=0;j--){
                int stevilo = Integer.parseInt(dell[lol]);
                tabelca[i][j]=stevilo;
                lol++;
            }

        }
        for (int y = 0;y<stolpec+2;y++){
            for (int x = 0;x<stolpec+1;x++){
                for (int k = 0;k<vrstica+1;k++){
                    zacasna[k]=tabelca[k][x];
                }

                Arrays.sort(zacasna);
                //System.out.println(Arrays.toString(zacasna));
                if (stetje==stolpec+1){
                    indeks++;
                    //ystem.out.printf("%d ",indeks);
                    stetje=0;
                }
                if (indeks==vrstica+1){
                    //System.out.printf("%d ",a);
                    continue;
                }
                a = a+zacasna[indeks];
                //System.out.printf("%d",a);
                stetje++;
            }
            if (a != 0 ){
                System.out.printf("%d ",a);
            }
            a= 0;
        }
    sc.close();
    }
}

