package exercicios.atv4;

public class ConversaoDeUnidadesDeTemperatura {

    public static Double cToF(Double c) {
        return (9*c/5)+32;
    }
    public static Double fToC(Double f){
        return (f-32)*+5/9;
    }
    public static Double cToK(Double c) {
        return c+273.15;
    }
    public static Double kToC(Double c) {
        return c-273.15;
    }
    public static Double cToRe(Double c) {
        return c * 4/5;
    }
    public static Double reToC(Double re) {
        return re * 5/4;
    }
    public static Double kToR(Double k) {
        return k * 1.8;
    }
    public static Double rToK(Double k) {
        return k/1.8;
    }

}
