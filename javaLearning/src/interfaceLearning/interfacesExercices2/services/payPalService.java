package services;

public class payPalService implements OnlinePaymentService{
	
	private static final double taxaPaypal = 0.02;
	private static final double taxaMes = 0.01;
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * taxaPaypal;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		return amount * taxaMes;
	}
	
}
