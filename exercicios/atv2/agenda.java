package exercicios.atv2;

import java.util.ArrayList;

public class agenda {

    public static void main(String[] args) {

        int chooseMain;
        int id = 0;
        boolean isRuning = true;
        ArrayList<Contatos> contatosList = new ArrayList<>();

        // testes
        {
            contatosList.add(new Contatos("test", "test2", "test3", 98123123, id));
            id++;
            contatosList.add(new Contatos("test", "test2", "test3", 98123123, id));
            id++;
        }
        //

        while (isRuning) {
            int chooseId;

            chooseMain = Integer.parseInt(System.console().readLine(
                    "Escolha uma opção:\n0- Sair do programa.\n1- Listar contatos.\n2- Adicionar contato.\n3- Editar contato.\n4- Remover contato\n--> "));

            isRuning = chooseMain == 0 ? false : true;

            switch (chooseMain) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    id = 0;
                    for (Contatos contato : contatosList) {
                        contato.setContatoId(id);
                        id++;
                        System.out.println(Contatos.getContato(contato));
                    }
                    break;
                case 2:
                    String nome = System.console().readLine("Nome: ");
                    String email = System.console().readLine("Email: ");
                    String sexo = System.console().readLine("Sexo: ");
                    Long telefone = Long.parseLong(System.console().readLine("Telefone: "));
                    contatosList.add(new Contatos(nome, email, sexo, telefone, id));
                    id++;
                    break;
                case 3:
                    id = 0;
                    for (Contatos contato : contatosList) {
                        contato.setContatoId(id);
                        id++;
                        System.out.println(Contatos.getContato(contato));
                    }
                    chooseId = Integer.parseInt(System.console().readLine("Escolha o ID do contato para editar: "));
                    int chooseEdit = Integer.parseInt(System.console()
                            .readLine("O que deseja editar?\n1- Nome\n2- Email\n3- Sexo\n4- Telefone\n5- Tudo\n--> "));
                    switch (chooseEdit) {
                        case 1:
                            contatosList.get(chooseId).setNome(System.console().readLine("Nome: "));
                            break;
                        case 2:
                            contatosList.get(chooseId).setEmail(System.console().readLine("Email: "));
                            break;
                        case 3:
                            contatosList.get(chooseId).setSexo(System.console().readLine("Sexo: "));
                            break;
                        case 4:
                            contatosList.get(chooseId)
                                    .setTelefone(Long.parseLong(System.console().readLine("Telefone: ")));
                            break;
                        case 5:
                            contatosList.get(chooseId).setNome(System.console().readLine("Nome: "));
                            contatosList.get(chooseId).setEmail(System.console().readLine("Email: "));
                            contatosList.get(chooseId).setSexo(System.console().readLine("Sexo: "));
                            contatosList.get(chooseId)
                                    .setTelefone(Long.parseLong(System.console().readLine("Telefone: ")));
                            break;
                    }
                    break;
                case 4:
                    id = 0;
                    for (Contatos contato : contatosList) {
                        contato.setContatoId(id);
                        id++;
                        System.out.println(Contatos.getContato(contato));
                    }
                    chooseId = Integer.parseInt(System.console().readLine("Escolha o ID do contato para remover: "));
                    contatosList.remove(chooseId);

                    break;
            }
        }
    }
}