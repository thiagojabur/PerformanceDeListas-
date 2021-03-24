package comparacaoListasEncadeadas;

import java.time.Duration;
import java.time.Instant;

public class TestarListaSimplesmenteEncadeada {

	public static void main(String[] args) {

		Instant start, end;
		Duration between;
		
			start = java.time.Instant.now();
			
			ListaSimplesmenteEncadeada listaSimplesmenteEncadeada = new ListaSimplesmenteEncadeada();

			System.out.println("Criando lista simplesmente encadeada com 300 mil inteiros");
			for (int index = 1; index <= 300000; index++) {					
				listaSimplesmenteEncadeada.addLast(new Node(String.valueOf(index)));
			}
			
			end = java.time.Instant.now();
			between = java.time.Duration.between(start, end);

			System.out.printf("Tempo de criação da lista simplesmente encadeada: ");
			
			System.out.format(" %02ds %04d milisegundos  \n", between.getSeconds(), between.toMillis());

			/*
			start = java.time.Instant.now();
			System.out.println("Removendo elementos da frente da lista simplesmente encadeada");
			for (int index = 1; index <= 5000; index++) {					
				listaSimplesmenteEncadeada.removeFromFront();				
			}
			
			System.out.println("Removendo elementos do final da lista simplesmente encadeada");	
			for (int index = 1; index <= 5000; index++) {					
				listaSimplesmenteEncadeada.removeFromBack();				
			}
			
			
			end = java.time.Instant.now();
			between = java.time.Duration.between(start, end);

			System.out.printf("Tempo de procedimentos na lista simplesmente encadeada: ");

			System.out.format(" %02ds %04d milisegundos  \n", between.getSeconds(), between.toMillis());
			
			 //System.out.println("Imprimindo os elementos da Simplesmente encadeada \n" + listaSimplesmenteEncadeada);
		*/	
			System.out.println("Header: " + listaSimplesmenteEncadeada.getFirst().getElement() + " Tail: "
					+ listaSimplesmenteEncadeada.getLast().getElement() + "\n");
		
	}
}