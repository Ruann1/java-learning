package services;

import java.time.LocalDate;

import entities.Contract;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	
	public void processContract(Contract contract, Integer months) {
		double valorBasico = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i++) {
			LocalDate DataPagamento = contract.getDate().plusMonths(i);
			
		}
	}
	
}
