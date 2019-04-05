import java.util.Scanner;
import java.util.Random;

class DN07 {c
    public static void main(String[] args) {

        System.out.printf("Povej koliko rožic želiš:  ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0 ){
            System.out.println("Nemorem narisat 0 rožic");
        }else if(num==1){
            ena_rožica();
        }else{
            for (int i = 0; i<num;i++){
                rožice();
            }
        }
    }

    public static void  rožice(){
        //random
        Random random = new Random();

        int  r = random.nextInt(255) + 1;
        int  g = random.nextInt(255) + 1;
        int  b = random.nextInt(255) + 1;

        double spremenljivka = -0.5 + Math.random() * (1 - (-0.5));
        double spremenljivka2 = -0.5 + Math.random() * (1- (-0.5));
        double velikost = -0.01 + Math.random() * (0.05 - (-0.01));


        //štibla
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(0.5+spremenljivka,0.5+spremenljivka2,0.5+spremenljivka,0.15+spremenljivka2);
        //cveti
        StdDraw.setPenRadius(0.1+velikost);
        StdDraw.setPenColor(r,g,b);
        StdDraw.point(0.42+spremenljivka,0.5+spremenljivka2);
        StdDraw.point(0.58+spremenljivka,0.5+spremenljivka2);
        StdDraw.point(0.5+spremenljivka,0.42+spremenljivka2);
        StdDraw.point(0.5+spremenljivka,0.58+spremenljivka2);
        //center cveta
        r = random.nextInt(255) + 1;
        g = random.nextInt(255) + 1;
        b = random.nextInt(255) + 1;
        StdDraw.setPenColor(r,g,b);
        StdDraw.setPenRadius(0.08+velikost);
        StdDraw.point(0.5+spremenljivka,0.5+spremenljivka2);
    }

    public static void ena_rožica(){
        Random random = new Random();
        int  r = random.nextInt(255) + 1;
        int  g = random.nextInt(255) + 1;
        int  b = random.nextInt(255) + 1;

        StdDraw.setPenRadius(0.02);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(0.5,0.5,0.5,0.15);
        //cveti
        StdDraw.setPenRadius(0.17);
        StdDraw.setPenColor(r,g,b);
        StdDraw.point(0.4,0.5);
        StdDraw.point(0.6,0.5);
        StdDraw.point(0.5,0.4);
        StdDraw.point(0.5,0.6);
        r = random.nextInt(255) + 1;
        g = random.nextInt(255) + 1;
        b = random.nextInt(255) + 1;

        StdDraw.setPenColor(r,g,b);
        StdDraw.setPenRadius(0.1);
        StdDraw.point(0.5,0.5);

    }
}



