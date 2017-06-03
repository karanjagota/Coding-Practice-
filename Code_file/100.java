import java.util.Arrays;	


public class OneHundredDoors {

	static int[] doors= new int [100];

	public static void main(String[] args) {
		
		//Open all doors
		Arrays.fill(doors, 0);
		for(int i = 1; i<=99; i++){
			passDoors(i);
		}
		
		System.out.println(printDoors(100));
		
	}
	public static void passDoors(int pass)
	{
		for(int i = pass-1; i <= 99; i+=pass)
		{
			
			if(doors[i]==1)
				{
					doors[i]=0;
				}
			else
				{
					doors[i]=1;
				}
		}
	
	}
	public static String printDoors(int pass){
		String s="The following doors are open after "+pass+" passes:\n";
		for(int i=0;i<=99;i++){
			if(doors[i]==1){
				s+= i;
				s+= ", ";
			}
		}
		return s;
	}
}
