import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class insertTable {
	Connection con;
	Statement st;
	public insertTable() throws ClassNotFoundException, SQLException {
		con=new Database().getCon();
		st=con.createStatement();
		String insert="INSERT INTO StudentTbl VALUES(2,'Harendra')";
		st.executeUpdate(insert);
		System.out.println("Data inserted successfully");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new insertTable();
	}

}
