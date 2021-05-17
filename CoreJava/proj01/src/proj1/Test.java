package proj1;

public class Test {

	public static void main(String[] args) {
		OracleDb odbc = new OracleDb();
		odbc.m1();
		odbc.m2();
		MySqlDb mydb = new MySqlDb();
		mydb.m1();
		mydb.m2();

	}

}
