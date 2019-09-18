/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.text.DecimalFormat;

/**
 *
 * @author Victor
 */
public class Menu {

    private String entrada, saida;
    private Validacoes vn;
    private Tarefas t;
    private DecimalFormat mt;

    public Menu() {
        vn = new Validacoes();
        entrada = "Entrada.txt";
        saida = "Saida.dat";
        t = new Tarefas();
        mt = new DecimalFormat("#,###,##0.00 Mt");
    }

    //menu de opcoes principal
    public void visualizar() {
        String erro = "Opcao invalida. Primeiro tem de entrar na opcao 1!";
        byte opc = 0;
        boolean p = false;
        do {
            opc = (byte) vn.ValidarByte((byte) 1, (byte) 15, "======== Ideia Eventos ========\n1. Ler Ficheiro de Entrada\n2. Visualizar Eventos\n3. Visualizar o Total Arrecadado\n4. Visualizar Numero de Eventos por Tipo (Pago ou Gratis)\n5. Visualizar o Total de Bilhetes\n6. Evento mais caro\n7. Evento com menor numero de bilhetes\n8. Procurar evento\n9. Editar evento\n10. Ordenar eventos por precos\n11. Gravar dados no ficheiro de objectos\n12. Remover Evento\n13. Adicionar Evento\n14. Informacoes do Programador\n15. Sair");

            switch (opc) {
                //opcao 1
                case 1: {
                    //**Defesa**//chamar o metodo le o ficheiro de texto e grava no vector
                    t.lerTxt(entrada);
                    p = true;
                }
                break;
                //opcao 2
                case 2:
                    if (p == true) {
                        visualizarEventos();
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 3
                case 3:
                    if (p == true) {
                        t.adaptadorVisualizar("O total arrecadado e de: " + mt.format(t.adaptadorCalcularTotal()));
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 4
                case 4:
                    if (p == true) {
                        t.adaptadorVisualizar("No total sao: " + Gratis.cont + " eventos gratis, e " + Normal.cont + " eventos pagos (normais) e " + Vip.cont + " eventos pagos (VIP).");
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 5
                case 5:
                    if (p == true) {
                        t.adaptadorVisualizar("O numero total de bilhetes e de: " + t.adaptadorCalcularBilhetes());
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 6
                case 6:
                    if (p == true) {
                        t.adaptadorMaisCaro();
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 7
                case 7:
                    if (p == true) {
                        t.adaptadorMenorBilhetes();
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 8
                case 8:
                    if (p == true) {
                        //**Defesa**//chamr adaptador do metodo que procura evento pelo codigo
                        t.adaptadorProcura();
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 9
                case 9:
                    if (p == true) {
                        t.adaptadorEditar(vn.ValidarByte((byte) 1, (byte) (Gratis.cont + Normal.cont + Vip.cont), "Digite o codigo do evento para editar (1-" + (Gratis.cont + Normal.cont + Vip.cont) + ")"));
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 10
                case 10:
                    if (p == true) {
                        t.adaptadorOrdenaPreco();
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 11
                case 11:
                    if (p == true) {
                        t.adaptadorGravarObj(saida);
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 12
                case 12:
                    if (p == true) {
                        t.adaptadorRemover(vn.ValidarByte((byte) 1, (byte) (Gratis.cont + Normal.cont + Vip.cont), "Digite o codigo do evento para remover (1-" + (Gratis.cont + Normal.cont + Vip.cont) + ")"));
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 13
                case 13:
                    if (p == true) {
                        adicionar();
                    } else {
                        t.adaptadorVisualizar(erro);
                    }
                    break;
                //opcao 14
                case 14:
                    t.adaptadorVisualizar("Victor Tesoura Junior | Turma B | 20180408");
                    break;
                //opcao 15
                case 15:
                    System.exit(0);
                    break;
            }
        } while (opc != 15);
    }

    //menu da adicao de eventos
    public void adicionar() {
        byte opc = 0;
        do {
            opc = (byte) vn.ValidarByte((byte) 1, (byte) 4, "******** Adicionar Eventos ********\n1. Gratis\n2. Pago (Normal)\n3. Pago (VIP)\n4. Voltar");

            switch (opc) {
                //opcao 1
                case 1: {
                    t.adaptadorAdicionarGratis(vn.ValidarString("Digite o nome do evento"), vn.ValidarString("Digite o local do evento"), vn.validarData("Digite a data do evento (dd-MM-aaaa)"), vn.validarHora("Digite a hora do evento"), vn.ValidarCategoria("Digite a categoria do evento (Festa, Musica, Gastronomia, Arte ou Conferencia)"), 'G', (int) vn.ValidarDouble(10, 99999, "Digite a lotacao do evento (10-99999"));
                }
                break;
                //opcao 2
                case 2:
                    t.adaptadorAdicionarNormal(vn.ValidarString("Digite o nome do evento"), vn.ValidarString("Digite o local do evento"), vn.validarData("Digite a data do evento (dd-MM-aaaa)"), vn.validarHora("Digite a hora do evento"), vn.ValidarCategoria("Digite a categoria do evento (Festa, Musica, Gastronomia, Arte ou Conferencia)"), 'N', (int) vn.ValidarDouble(10, 99999, "Digite o numero de bilhetes (10-99999"), vn.ValidarDouble(10, 99999, "Digite o preco dos bilhetes (10-99999"), vn.ValidarDouble(10, 99999, "Digite o consumo minimo (10-99999"));

                    break;
                //opcao 3
                case 3:
                    t.adaptadorAdicionarVip(vn.ValidarString("Digite o nome do evento"), vn.ValidarString("Digite o local do evento"), vn.validarData("Digite a data do evento(dd-MM-aaaa)"), vn.validarHora("Digite a hora do evento"), vn.ValidarCategoria("Digite a categoria do evento (Festa, Musica, Gastronomia, Arte ou Conferencia)"), 'V', (int) vn.ValidarDouble(10, 99999, "Digite o numero de bilhetes (10-99999"), vn.ValidarDouble(10, 99999, "Digite o preco dos bilhetes (10-99999"), vn.ValidarString("Digite a regalia do evento"));

                    break;
            }
        } while (opc != 4);
    }

    //menu da visualizacao de eventos
    public void visualizarEventos() {
        byte opc = 0;
        do {
            opc = (byte) vn.ValidarByte((byte) 1, (byte) 4, "******** Visualizar Eventos ********\n1. Gratis\n2. Pago (Normal)\n3. Pago (VIP)\n4. Voltar");

            switch (opc) {
                //opcao 1
                case 1: {
                    t.adaptadorVisualizarVector(opc);
                }
                break;
                //opcao 2
                case 2:
                    t.adaptadorVisualizarVector(opc);

                    break;
                //opcao 3
                case 3:
                    t.adaptadorVisualizarVector(opc);

                    break;
            }
        } while (opc != 4);
    }

}
