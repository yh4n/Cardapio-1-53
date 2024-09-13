import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Escolha entre:\n'1' para salgado:\n'2' para doces:\n'3' para bebidas:\n'4' para sair ");
            int escolha = leia.nextInt();

            switch (escolha) {
                case 1:
                    boolean voltarSalgado = false;
                    while (!voltarSalgado) {
                        System.out.println("Salgado:\n'1' = Pastel R$6,50;\n'2' = Coxinha R$5,00;\n'3' = Risoles R$6,00;\n'4' voltar:");
                        int salgado = leia.nextInt();
                        switch (salgado) {
                            case 1:
                                System.out.println("Um Pastel adicionado ao carrinho!");
                                break;
                            case 2:
                                System.out.println("Uma Coxinha adicionada ao carrinho!");
                                break;
                            case 3:
                                System.out.println("Um Risoles adicionado ao carrinho!");
                                break;
                            case 4:
                                voltarSalgado = true;
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                        }
                    }
                    break;
                    case 2:
                    boolean voltarDoce = false;
                    while (!voltarDoce) {
                        System.out.println("Doce:\n'1' = Paçoca R$3,50;\n'2' = Amansa Sogra R$6,50;\n'3' = Cocada R$4,00;\n'4' voltar:");
                        int Doce = leia.nextInt();
                        switch (Doce) {
                            case 1:
                                System.out.println("Uma Paçoca adicionado ao carrinho!");
                                break;
                            case 2:
                                System.out.println("Uma Amansa Sogra adicionada ao carrinho!");
                                break;
                            case 3:
                                System.out.println("Uma Cocada adicionado ao carrinho!");
                                break;
                            case 4:
                                voltarDoce = true;
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                        }
                    }
                    break;
                    case 3:
                    boolean voltarBebida = false;
                    while (!voltarBebida) {
                        System.out.println("Doce:\n'1' = Coca-cola R$10,00 o Litro;\n'2' = Suco natural R$10,00;\n'3' = Água R$4,00;\n'4' voltar:");
                        int Bebida = leia.nextInt();
                        switch (Bebida) {
                            case 1:
                                System.out.println("Uma Coca-cola adicionado ao carrinho!");
                                break;
                            case 2:
                                System.out.println("Um Suco natural adicionada ao carrinho!");
                                break;
                            case 3:
                                System.out.println("Uma Água adicionado ao carrinho!");
                                break;
                            case 4:
                                voltarBebida = true;
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                        }
                    }
                        }
                        break;
                    }
                    
                }
}
        