
public class Mxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=59,b=60,c=67;
		int max=0;
		if(a>b) {
			if(a>c) {
				max=a;
			}
			else {
				max=c;
			}
		} 
		if(b>a) {
			if(b>c) {
				max=b;
			}
			else {
				max=c;
			}
		}
		System.out.println("Maximum number is: " + max);

	}

}
