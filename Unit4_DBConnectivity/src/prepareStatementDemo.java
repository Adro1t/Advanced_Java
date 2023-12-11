import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prepareStatementDemo {
	Connection con;
	PreparedStatement pst;

	public prepareStatementDemo() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
//		String insert = "INSERT INTO StudentTbl VALUES(?,?)";
//		pst = con.prepareStatement(insert);
//		pst.setInt(1, 3);
//		pst.setString(2, "UTSAV");
//		pst.execute();
//
//		pst.setInt(1, 4);
//		pst.setString(2, "Ram");
//		pst.execute();

		String update = "UPDATE StudentTbl SET stname=? WHERE stid=?";
		pst = con.prepareStatement(update);
		pst.setString(1, "Mahesh");
		pst.setInt(2, 3);
		pst.execute();

		new retrieveData();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new prepareStatementDemo();
	}

}
