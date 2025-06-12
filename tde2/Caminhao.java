package tde2;

public class Caminhao extends Veiculo {
	private double carga;
	
	
	public Caminhao(String placa, String modelo, int ano, double carga) {
		super(placa, modelo, ano);
		this.carga = carga;
	}
	
	@Override
	public void exibir_dados() {
		System.out.println("Caminhão - Modelo: "+get_modelo()+ ", Placa: "+get_placa()+ ", Ano: "+get_ano()+ ", Carga: "+carga);
	}
}
