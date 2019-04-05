import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class DN09 {
    public static void main(String[] args) throws IOException{


        if (args[0].equals("dateTime")){
            String argument= args[1]+"."+args[2];

            System.out.println(preoblikovano(argument));

        }
        if (args[0].equals("candle")){
            String cas = args[1] +"."+args[2];
            Double open = Double.parseDouble(args[3]);
            Double high = Double.parseDouble(args[4]);
            Double low = Double.parseDouble(args[5]);
            Double close = Double.parseDouble(args[6]);

            Candle b= new Candle(cas, open, high, low,close);

            Double sredina= (b.getClose()+b.getHigh()+b.getLow()+b.getOpen())/4;

            System.out.println(preoblikovano(b.getDateTime())+": "+sredina);
        }
        if (args[0].equals("movingAverage")){
            String valuta1=args[2].substring(0, 3);
            String valuta2=args[2].substring(3, 6);
            String casAvrage = args[3] +"."+args[4];
            FinancialInstrument f = new FinancialInstrument(args[2],valuta1,valuta2);
            f.movingAvrage(casAvrage,Integer.parseInt(args[1]));

        }
    }
    static String preoblikovano(String celotenCas){
        String [] datum= celotenCas.split("\\.");
        //System.out.println(Arrays.toString(datum));

        int leto= Integer.parseInt(datum[0]);
        int mesec=Integer.parseInt(datum[1]);
        int dan=Integer.parseInt(datum[2]);

        String uraDvo= datum[3].replace(":","");
        String uraDvoUpdate = "1"+uraDvo;

        int ura=Integer.parseInt(uraDvoUpdate);

        DateTime a = new DateTime(leto, mesec, dan ,ura);
        return a.toString();
    }



    boolean isBullish(){
        return true;
    }
    boolean isBearish(){
        return false;
    }







}
class DateTime {
    int leto;
    int mesec;
    int dan;
    int ura;


    DateTime(int leto, int mesec, int dan, int ura) {
        this.leto = leto;
        this.mesec = mesec;
        this.dan = dan;
        this.ura = ura;
    }

    boolean isGreater(int dateTime) {
        return true;
    }

    boolean isLwer(int dateTime) {
        return true;
    }

    boolean isEqual(int dateTime) {
        return true;
    }

    public String toString() {
        String strLeto = Integer.toString(this.leto);
        String strMesec = Integer.toString(this.mesec);
        String strDan = Integer.toString(this.dan);
        String strUra = Integer.toString(this.ura);

        String strDanEU;
        String strMesecEU;

        String strUraEU = strUra.substring(1, 3) + "." + strUra.substring(3, 5);
        int nic = 0;

        if (strDan.charAt(0) == Integer.toString(nic).charAt(0)) {
            strDanEU = strDan.substring(1).replace("0"," ");
        } else {
            strDanEU = strDan;
        }

        if (strDan.charAt(0) == Integer.toString(nic).charAt(0)) {
            strMesecEU = strMesec.substring(1).replace("0"," ");
        } else {
            strMesecEU = strMesec;
        }
        return strDanEU + ". " + strMesecEU + ". " + strLeto + " " + strUraEU;
    }
}
class Candle{
    String dateTime;
    Double open;
    Double high;
    Double low;
    Double close;

    Candle(String dateTime,Double open, Double high,Double low,Double close){
        this.dateTime= dateTime;
        this.open=open;
        this.high=high;
        this.low=low;
        this.close=close;
    }

    public String getDateTime(){
        return this.dateTime;
    }
    public Double getOpen(){
        return this.open;
    }
    public Double getHigh(){
        return this.high;
    }
    public Double getLow(){
        return this.low;
    }
    public Double getClose(){
        return this.close;
    }
}

class FinancialInstrument{
    String []candles= new String[3900];
    String currency1;
    String currency2;

    FinancialInstrument{

    }


    FinancialInstrument(String filee, String currency1 , String currency2)throws IOException {
        int count=0;
        Scanner scan = new Scanner(new File(filee));
        while (scan.hasNextLine()){
            candles[count]= scan.nextLine();
            count++;
        }
        this.currency1=currency1;
        this.currency2=currency2;
    }
    Double movingAvrage(String dateTime, int windowSize){





        return 0.32421;
    }
    Double najvisjaVrednot(){

    }
    Double najnizjaVrednost(){

    }










}














