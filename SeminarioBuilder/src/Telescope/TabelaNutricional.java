package Telescope;

public class TabelaNutricional {
	private int calorias;
	private int carboidratos;
	private int proteinas;
	private int gordurasTotais;
	private int gordurasSaturadas;
	private int fibraAlimentar;
	private int sodio;
	
	public TabelaNutricional(int calorias) {
		this(calorias,0);
	}
	
	public TabelaNutricional(int calorias, int carboidratos) {
		this(calorias,carboidratos,0);
	}
	
	public TabelaNutricional(int calorias, int carboidratos, int proteinas) {
		this(calorias, carboidratos, proteinas, 0);
	}
	
	public TabelaNutricional(int calorias, int carboidratos, int proteinas, int gordurasTotais) {
		this(calorias, carboidratos, proteinas, gordurasTotais, 0);
	}
	
	public TabelaNutricional(int calorias, int carboidratos, int proteinas, int gordurasTotais, int gordurasSaturadas) {
		this(calorias, carboidratos, proteinas, gordurasTotais, gordurasSaturadas, 0);
	}
	
	public TabelaNutricional(int calorias, int carboidratos, int proteinas, int gordurasTotais, int gordurasSaturadas, 
			int fibraAlimentar) {
		this(calorias, carboidratos, proteinas, gordurasTotais, gordurasSaturadas, fibraAlimentar, 0);
	}

	public TabelaNutricional(int calorias, int carboidratos, int proteinas, int gordurasTotais, int gordurasSaturadas,
			int fibraAlimentar, int sodio) {
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
