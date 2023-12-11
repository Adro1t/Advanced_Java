import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class modifyTable {
	Connection con;
	Statement st;

	public modifyTable() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		st = con.createStatement();
		String update = "UPDATE StudentTbl SET stname='Pramod'" + " WHERE stid=2; ";
		st.executeUpdate(update);
		new retrieveData();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new modifyTable();
	}

}
