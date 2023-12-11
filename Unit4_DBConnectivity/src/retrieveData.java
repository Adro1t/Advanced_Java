import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrieveData {
	Connection con;
	Statement st;
	ResultSet set;

	public retrieveData() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		st = con.createStatement();
		String data = "SELECT * FROM StudentTbl";
		set = st.executeQuery(data);
		while (set.next()) {
			System.out.println("Student id = " + set.getInt("stid"));
			System.out.println("Name= " + set.getString("stname"));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new retrieveData();
	}

}
