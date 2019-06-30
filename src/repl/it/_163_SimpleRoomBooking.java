package repl.it;

public class _163_SimpleRoomBooking {
	public static void main(String[] args) {
		System.out.println(simpleRoomBook(false,2,1,2018));
		
		System.out.println(simpleRoomBook(true,7,2,2018));
	}
	
	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	    return (isAvailable && year==2018 && ((month==7 && day>8) || (month!=7 && day>=1)));
	   
	  }

}
