public class StarbucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService _checkService;

	public StarbucksCustomerManager(CustomerCheckService _checkService) {
		this._checkService = _checkService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (this._checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a real person!");
		}
		
	}
}