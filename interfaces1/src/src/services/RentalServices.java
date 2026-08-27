package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalServices {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxServices taxServices;

	public RentalServices(Double pricePerDay, Double pricePerHour, TaxServices taxServices) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxServices = taxServices;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxServices.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	};
}
