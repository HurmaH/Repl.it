package repl.it;

public class tolowerTOUPPER {
	
	public static void main(String[] args) {
		
		String s= "Firdevs";
		
        String modified = "";
        
        int j = 1;
        for(int i =0; i < s.length()-1; i= i+2) {
            modified = modified + s.substring(i,i+1).toLowerCase() + s.substring(j,j+1).toUpperCase();
                    j = j+2;
            }
            
        System.out.println(modified);
//		s=s.toLowerCase();
//		String sNew="";
//		for (int i=0; i<s.length(); i++) {
//			if (i%2==0) {
//				sNew += s.substring(i, i+1); 
//			}else {
//				sNew += s.substring(i, i+1).toUpperCase();
//			}
//		}
//		
//		System.out.println(sNew);
	}

}
