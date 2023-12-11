import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteRowData {
	Connection con;
	Statement st;

	public deleteRowData() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		st = con.createStatement();
		String delete = "DELETE FROM StudentTbl" + " WHERE stid=2; ";
		st.executeUpdate(delete);
		new retrieveData();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new deleteRowData();
	}

}
