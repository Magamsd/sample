package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
System.out.println("savings=100000");
}
	public void fixed() {
System.out.println("fixed=1000");

}
public static void main(String[] args) {
	BankInfo b=new BankInfo();
	b.saving();
	b.fixed();
	b.deposit();
}
}
