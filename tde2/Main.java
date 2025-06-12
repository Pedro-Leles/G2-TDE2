package tde2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		int opc;
		
		
		do {
			System.out.println("\n1 - Cadastrar novo veículo");
			System.out.println("2 - Listar veículos");
			System.out.println("3 - Sair");
			System.out.println(">> ");
			opc = sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			case 1:
				System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Ano: ");
                int ano = sc.nextInt();
                sc.nextLine();
                
                if(tipo == 1) {
                	System.out.println("Quantidade de portas: ");
                	int portas = sc.nextInt();
                	veiculos.add(new Carro(placa, modelo, ano, portas));
                }
                else if(tipo == 2) {
                	System.out.println("Quantas cilindradas: ");
                	int cc = sc.nextInt();
                	veiculos.add(new Moto(placa, modelo, ano, cc));
                }
                else {
                	System.out.println("Qual a capacidade de carga: ");
                	double carga = sc.nextDouble();
                	veiculos.add(new Caminhao(placa, modelo, ano, carga));
                }
                
			case 2:
				for (Veiculo v : veiculos) {
					v.exibir_dados();
				}
				break;
				
			case 3:
				System.out.println("Encerrando.....");
				break;
				
			default:
				System.out.println("Opção inválida!");
			}
		}
		while(opc != 3);
		
		sc.close();

	}

}
