package comparacaoListasEncadeadas;

import java.time.Duration;
import java.time.Instant;

public class TestarListaDuplamenteEncadeada {

	public static void main(String[] args) {

		Instant start, end;
		Duration between;
				
			start = java.time.Instant.now();
			System.out.println("Criando lista duplamente encadeada com 300 mil inteiros");
			ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();

			for (int index = 1; index <= 300000; index++) {
				listaDuplamenteEncadeada.addLast(new DNode(String.valueOf(index)));
			}
			end = java.time.Instant.now();
			between = java.time.Duration.between(start, end);

			System.out.printf("Tempo de criação da lista duplamente encadeada: ");
			System.out.format(" %02ds %04d milisegundos  \n", between.getSeconds(), between.toMillis());

			/*
			start = java.time.Instant.now();
			
			System.out.println("Removendo elementos da frente da lista duplamente encadeada");
			for (int index = 1; index <= 5000; index++) {					
				listaDuplamenteEncadeada.removeFromFront();				
			}
			
			System.out.println("Removendo elementos do final da lista duplamente encadeada");
			for (int index = 1; index <= 5000; index++) {					
				listaDuplamenteEncadeada.removeFromBack();				
			}
			
			end = java.time.Instant.now();
			between = java.time.Duration.between(start, end);

			System.out.printf("Tempo de procedimentos na lista duplamente encadeada: ");
			System.out.format(" %02ds %04d milisegundos  \n", between.getSeconds(), between.toMillis());
			

			//System.out.println("Imprimindo os elementos da Duplamente encadeada \n" +	listaDuplamenteEncadeada);
			*/
			System.out.println("Header: " + listaDuplamenteEncadeada.getFirst().getElement() + " Tail: "
					+ listaDuplamenteEncadeada.getLast().getElement());
			//System.out.println("O anterior do Tail é: " + listaDuplamenteEncadeada.getLast().getPrev().getElement() + "\n");			
				
	}
}