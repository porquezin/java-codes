package exercicios.atv1;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isRuning = true;

        String[] nipes = { "ouro", "paus", "copas", "espadas" };
        String[] faces = { "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "valete", "rainha", "rei" };

        while (isRuning) {
            String coordinates = null;
            String chooseUser = null;

            System.out.print("     Digite sua carta!\n     <Quit> para sair:\n      --> ");
            chooseUser = input.nextLine().toLowerCase();

            isRuning = chooseUser.equals("quit") ? false : true;

            if (isRuning) {
                coordinates = "     Carta não encontrada!";
                search: for (int i = 0; i < nipes.length; i++) {
                    for (int j = 0; j < faces.length; j++) {
                        if (chooseUser.equals(String.format("%s de %s", faces[j], nipes[i]))) {
                            coordinates = String.format("     Eixo X = %d\n     Eixo Y = %d", j + 1, i + 1);
                            break search;
                        }
                    }
                }
                System.out.println(coordinates + "\n|-=-=-=-=-=-=-=-=-=-=-=-=-|");
            }
        }
        input.close();
    }
}