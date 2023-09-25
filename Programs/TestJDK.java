public class TestJDK{

	public static void main(String args[]){
		int len=args.length;
		//System.out.println("Test Successful");
		System.out.println("No. of words ="+len);
		System.out.printf("No. of words =%d\n",len);
		for(int i=0;i<len;i++){
			String val=args[i];
			System.out.print(val+" ");
		}
		for(String item:args){
			System.out.print(item+"");
		}
	}

}