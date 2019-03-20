package Builder;

public class TabelaNutricional {
	private final int calorias;
	private final int carboidratos;
	private final int proteinas;
	private final int gordurasTotais;
	private final int gordurasSaturadas;
	private final int fibraAlimentar;
	private final int sodio;
	
	
	private TabelaNutricional(Builder builder) {
		this.calorias = builder.calorias;
		this.carboidratos = builder.carboidratos;
		this.proteinas = builder.proteinas;
		this.gordurasTotais = builder.gordurasTotais;
		this.gordurasSaturadas = builder.gordurasSaturadas;
		this.fibraAlimentar = builder.fibraAlimentar;
		this.sodio = builder.sodio;
	}
	
		public static class Builder {
			private final int calorias;
			private int carboidratos = 0;
			private int proteinas = 0;
			private int gordurasTotais = 0;
			private int gordurasSaturadas = 0;
			private int fibraAlimentar = 0;
			private int sodio = 0;
			
			public Builder(int calorias) {
				this.calorias = calorias;
			}
			
			public Builder carboidratos(int carboidratos) {
				this.carboidratos = carboidratos;
				return this;
			}
			
			public Builder proteinas(int proteinas) {
				this.proteinas = proteinas;
				return this;
			}
			
			public Builder gordurasTotais(int gordurasTotais) {
				this.gordurasTotais = gordurasTotais;
				return this;
			}
			
			public Builder fibraAlimentar(int fibraAlimentar) {
				this.fibraAlimentar = fibraAlimentar;
				return this;
			}
			
			public Builder sodio(int sodio) {
				this.sodio = sodio;
				return this;
			}
			
			public TabelaNutricional build() {
				return new TabelaNutricional(this);
			}
			
		}
	
	@Override
	public String toString() {
		return "TabelaNutricional [calorias=" + calorias + ", carboidratos=" + carboidratos + ", proteinas=" + proteinas
				+ ", gordurasTotais=" + gordurasTotais + ", gordurasSaturadas=" + gordurasSaturadas
				+ ", fibraAlimentar=" + fibraAlimentar + ", sodio=" + sodio + "]";
	}

	public int getCalorias() {
		return calorias;
	}
	public int getCarboidratos() {
		return carboidratos;
	}
	public int getProteinas() {
		return proteinas;
	}
	public int getGordurasTotais() {
		return gordurasTotais;
	}
	public int getGordurasSaturadas() {
		return gordurasSaturadas;
	}
	public int getFibraAlimentar() {
		return fibraAlimentar;
	}
	public int getSodio() {
		return sodio;
	}	
}
