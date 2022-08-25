package exercicios.atv4;

public class app {
    public static void main(String[] args) {

        boolean isRuning=true;
        
        while(isRuning){
            
            int chooseUser = Integer.parseInt(System.console().readLine(
                "1- De graus Celsius (C) para graus Fahrenheit (F)\n2- De graus Fahrenheit (F) para graus Celsius (C)\n3- De graus Celsius (C) para graus Kelvin (K)\n4- De graus Kelvin (K) para graus Celsius (C)\n5- De graus Celsius (C) para graus Réaumur (Re)\n6- De graus Réaumur (Re) para graus Celsius (C)\n7- De graus Kelvin (K) para graus Rankine (R)\n8- De graus Rankine (R) para graus Kelvin (K)\nEscolha: "
                ));
            
            switch(chooseUser){
                case 1:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.cToF(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 2:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.fToC(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 3:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.cToK(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 4:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.kToC(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 5:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.cToRe(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 6:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.reToC(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 7:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.kToR(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
                case 8:
                    System.out.println(ConversaoDeUnidadesDeTemperatura.rToK(Double.parseDouble(System.console().readLine("--> ")))+ " Graus");
                    break;
            }
            isRuning = System.console().readLine("Deseja sair? [S/N]\n--> ").toLowerCase().equals("s") ? false:true;
        }

    }
}
