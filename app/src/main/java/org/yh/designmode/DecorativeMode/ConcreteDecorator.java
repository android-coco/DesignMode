package org.yh.designmode.DecorativeMode;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator() {
	}

	public ConcreteDecorator(Component component) {
		super(component);
	}

	public void operation() {
		this.addedOperation();
		super.operation();
	}

	public void addedOperation() {
		System.out.println("晚上");
	}
}
