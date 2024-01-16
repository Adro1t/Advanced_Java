import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MsgServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1255);
		// wait and accept connection
		Socket soc = ss.accept();
		// get communication stream associated with the socket
		DataInputStream ins = new DataInputStream(soc.getInputStream());
		DataOutputStream outs = new DataOutputStream(soc.getOutputStream());
		// perform io
		String s = ins.readUTF();
		System.out.println("Request from client" + s);
		outs.writeUTF("Hello Client");// wrrite in outs
		// close streams and connection
		ins.close();
		outs.close();
		soc.close();
		ss.close();
	}

}
