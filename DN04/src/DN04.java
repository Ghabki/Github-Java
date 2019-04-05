import java.util.Arrays;
import java.util.List;

public class DN04 {

    static String[] prva   = {"Miha", "Micka", "Tone", "Lojze", "Mojca", "Pepca", "Franci", "Francka"};
    static String[] druga  = {"vozi", "seka", "potrebuje", "gleda", "barva", "voha", "lomi", "popravlja"};
    static String[] tretja = {"kolo", "avto", "likalnik", "sonce", "vrtnico", "drevo", "lopato", "sekiro"};

    public static void main(String[] args) {

        int velikost = args.length;
        if (velikost==3){


            String beseda = args[0];
            String beseda1 = args[1];
            String beseda2 = args[2];

            if (Arrays.asList(prva).contains(beseda)){
                if (Arrays.asList(druga).contains(beseda1)){
                    if (Arrays.asList(tretja).contains(beseda2)){
                        System.out.printf("true");

                    }else{
                        System.out.printf ("false");
                    }
                }else{
                    System.out.printf ("false");
                }
            }else{
                System.out.printf ("false");
            }

        }else{
            System.out.printf ("false");
        }
    }
}