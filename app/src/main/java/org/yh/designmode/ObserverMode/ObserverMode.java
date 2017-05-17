package org.yh.designmode.ObserverMode;

public class ObserverMode {
	public static void test() {
		ProductControl productControl = new ProductControl();
		NameObserver nameobs = new NameObserver();
		PriceObserver priceobs = new PriceObserver();
		Product product = new Product();
		productControl.setProduct(product);
		// productControl.register(nameobs, priceobs);
		product.setName("橘子");
		product.setPrice(1.22f);
	}
}