public class DN03 {

    public static void main(String[] args) {

        String p = args[0];
        String o = args[1];
        String z = args[2];

        Double a =Double.parseDouble(o);
        Double b =Double.parseDouble(z);
        int zacetek =Integer.parseInt(p);

        Double min = a;
        String minimum = o;

        if (zacetek==5){
            int e = args.length;
            for(int i =0;i<e;i++){
                if (i==0){
                    System.out.printf("Minimum stevil ");
                    continue;
                }

                String h = args[i];
                Double g =Double.parseDouble(h);

                System.out.printf(h+" ");

                if (g<min) {
                    min = g;
                    minimum = h;
                }
            }
            System.out.printf("je "+minimum);

        }else if (zacetek == 1) {
            double d = a+b;
            System.out.printf(a+" + "+b+" = ");
            System.out.printf("%.1f",d);

        }else if (zacetek == 2) {
            double d = a-b;
            System.out.printf(a+" - "+b+" = ");
            System.out.printf("%.1f",d);

        }else if (zacetek == 3) {
            double d = a*b;
            System.out.printf(a+" * "+b+" = ");
            System.out.printf("%.1f",d);

        }else if (zacetek == 4) {
            double d = a/b;
            System.out.printf(a+" / "+b+" = ");
            System.out.printf("%.1f",d);

        }
    }
}
