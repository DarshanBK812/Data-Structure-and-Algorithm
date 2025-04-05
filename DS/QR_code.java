package DS;

public class QR_code {
	public static  void doPay(PaymentMethod p) {
		p.pay();
	}
	public static void main(String args []) {
	
	PaymentMethod pm = new CreditCard();
	PaymentMethod pm2 = new UPI();
	doPay(pm2);
	}

}
