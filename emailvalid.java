import java.util.Scanner;

public class emailvalid {
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in); 
	String[] maillist = {"Anilkumle@gmail.com", "Sam@rediffmail.com", "preetam12@gmail.com", "Sachin.k@yahool.com"};
	System.out.print("enter your email address: ");
	String mail=sc.next();
	int flag=0;
	for(int i=0; i<maillist.length; i++) {
		if(mail.equals(maillist[i])) {
			flag = 1;
		}
	}
	if(flag==1) {
		System.out.print("email found");
	}
	else {
		System.out.print("email not found");
	}
}
}