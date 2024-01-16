import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MsgClient {

	public static void main(String[] args) throws IOException {
		// open your connection to a server at port 1254
		Socket soc = new Socket("localhost", 1255);
		//get input from the socket and read the input
		DataInputStream ins = new DataInputStream(soc.getInputStream());
		DataOutputStream outs = new DataOutputStream(soc.getOutputStream());
		// perform io
		outs.writeUTF("Hello Server");// wrrite in outs
		String s = ins.readUTF();
		System.out.println("Request from server" + s);
		// close streams and connection
		ins.close();
		outs.close();
		soc.close();
	}

}
