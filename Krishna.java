import java.io.FileWriter;

class Krishna{
   public static void main(String [] args){
      String str="sri krishna polytechnic";
	  
	    try
		{
		FileWriter obj=new FileWriter("C:/obj.txt");
		obj.write(str);
		System.out.println("Writing data to file");
		obj.close();
		}
		
		catch(Exception e){
		   System.out.println(e);
		}
	}
}