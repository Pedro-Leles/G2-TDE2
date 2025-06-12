package tde2;

public abstract class Veiculo implements Exibivel {
	private String placa;
	private String modelo;
	private int ano;
	
	public Veiculo(String placa, String modelo, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String get_placa() {return placa;}
	public void set_placa(String placa) {this.placa = placa;}
	public String get_modelo() {return modelo;}
	public void set_modelo(String modelo) {this.modelo = modelo;}
	public int get_ano() {return ano;}
	public void set_ano(int ano) {this.ano = ano;}
}
