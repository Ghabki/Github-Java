public class DN02 {

    public static void main(String[] args) {
        //int stArg = args.length;
       // System.out.println("Stevilo argumentov: " + stArg);

        /*for(int i=0; i < stArg; i=i+1) {
            System.out.println("Argument "+ args[i]);
            */
        if (args.length >0) {
            String p = args[0];
            String o = args[1];

            int a =Integer.parseInt(p);
            int b =Integer.parseInt(o) ;

            pravokotnik(a,b);
        }
       //System.out.println(a+" "+b);
        else{
            for (int i = 1; i<6;i++){
                for (int r= 1; r<6; r++ ){
                pravokotnik(i,r);
                }
            }
        }
    }


    static void pravokotnik(int a, int b) {
        String z = "a =  "+a+"," +" b =  "+b;
        int dolzina = z.length()+3;
        System.out.print(z+"   ");
        int i;
        for (i = 0; i<b; i++){
            System.out.printf("X");
        }
        for (i = 0; i<a-1;i++){
            System.out.println();
            for (int c = 0; c<dolzina;c++){
                System.out.printf(" ");

            }
            for (int u = 0; u<b;u++){
                System.out.printf("X");

            }
        }
        System.out.println();
        System.out.println();


    }
}
