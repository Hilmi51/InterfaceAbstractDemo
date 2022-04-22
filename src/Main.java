public class Main {

	public static void main(String[] args) {
		BaseCustomerManager manager = new StarbucksCustomerManager(new MernisService());
		Customer customer = new Customer(1, "Hilmi", "Şafak","03.04.2005" ,"11111111111");
		manager.save(customer);
	}

}
