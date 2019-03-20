package JavaBean;

public class TabelaNutricional {
	private int calorias;
	private int carboidratos;
	private int proteinas;
	private int gordurasTotais;
	private int gordurasSaturadas;
	private int fibraAlimentar;
	private int sodio;
	
	
	public TabelaNutricional(int calorias, int carboidratos, int proteinas, int gordurasTotais,
			int gordurasSaturadas, int fibraAlimentar, int sodio) {
		this.calorias = calorias;
		this.carboidratos = carboidratos;
		this.proteinas = proteinas;
		this.gordurasTotais = gordurasTotais;
		this.gordurasSaturadas = gordurasSaturadas;
		this.fibraAlimentar = fibraAlimentar;
		this.sodio = sodio;
	}
	
	@Override
	public String toString() {
		return "TabelaNutricional [calorias=" + calorias + ", carboidratos=" + carboidratos + ", proteinas=" + proteinas
				+ ", gordurasTotais=" + gordurasTotais + ", gordurasSaturadas=" + gordurasSaturadas
				+ ", fibraAlimentar=" + fibraAlimentar + ", sodio=" + sodio + "]";
	}
}
