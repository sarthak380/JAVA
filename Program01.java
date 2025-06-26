
public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n= 10;
            int first= 0;
            int last= 1;
            System.out.println("fibonacci Series");
            for(int i=1;i<=n;i++) {
            	System.out.println(first + " ");
            	int na=first+last;
            	first=last;
            	last=na;
            }
	}

}
