package entities;

import java.time.LocalDateTime;

public class Contrato {
	private int idContrato;
	private LocalDateTime Data;
	private double valorTotal;
	
	public Contrato(int idContrato, LocalDateTime data, double valorTotal) {
		this.idContrato = idContrato;
		this.Data = data;
		this.valorTotal = valorTotal;
	}

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public LocalDateTime getData() {
		return Data;
	}

	public void setData(LocalDateTime Data) {
		this.Data = Data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
}
