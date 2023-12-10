import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class CreateTable {
	Connection con;// connection db
	Statement st;// SQL queries

	public CreateTable() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		st = con.createStatement();
		String create = "CREATE TABLE StudentTbl(stid int,stname varchar(50));";
		st.executeUpdate(create);
		System.out.println("DB table created");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new CreateTable();
	}

}
