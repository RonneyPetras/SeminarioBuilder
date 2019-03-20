package Mundo;

import Builder.TabelaNutricional;

public class Main {

	public static void main(String[] args) {
		
		//Modelo tradicional Java Bean
		JavaBean.TabelaNutricional javaBean = new JavaBean.TabelaNutricional(10, 50, 60, 80, 0, 10, 20);
		System.out.println(javaBean);
		
		//Modelo Padrão de contrução Telescope
		Telescope.TabelaNutricional telescope = new Telescope.TabelaNutricional(10);
		System.out.println(telescope);

		
		//Modelo Builder
		Builder.TabelaNutricional tn1 =
				new TabelaNutricional.Builder(10)
				.sodio(50)
				.gordurasTotais(40)
				.carboidratos(50)
				.build();
		
		System.out.println(tn1);
		
	}

}
