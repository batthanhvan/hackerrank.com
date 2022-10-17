import java.util.*;


public class Static_Initializer_Block {
    public static boolean flag = false;
    public static int B, H;

    static {
         Scanner scan = new Scanner(System.in);
         B = scan.nextInt();
         H = scan.nextInt();
        if (B <= 0 || H <= 0){
            try{
                scan.close();

                throw new Exception("Breadth and height must be positive");

            } catch(Exception e){
                System.out.println(e);
            }         
        } else
            flag = true;
        scan.close();
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

