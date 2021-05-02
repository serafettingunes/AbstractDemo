
public class Main {

	public static void main(String[] args) {
		CustomerManager cm=new CustomerManager();
		cm.databaseManager=new MysqlDatabase();
		cm.getCustomers();
	}

}
