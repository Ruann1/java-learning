package services;

import java.time.LocalDateTime;

import entities.Contrato;

public class taxaGeral{
	
	private Taxas taxas;
	
	public taxaGeral(Taxas taxas) {
		this.taxas = taxas;
	}
	
	public void processContract(Contrato contrato, int months) {
		double valorUnico = contrato.getValorTotal() / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDateTime dueDate = contrato.getData().plusMonths(i);	
		}
	}
	
}
	

