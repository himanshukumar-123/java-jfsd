import java.util.Scanner;

public class greatestproduct {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of inputs");
		int inp=sc.nextInt();
		System.out.println("Enter the inputs to the array");
		int arr[]=new int[inp];
		for(int i=0; i<inp;i++) {
			arr[i]=sc.nextInt();
		}
		int hcf=1;
		for(int i=0; i<inp; i++) {
			for(int j=i+1; j<inp; j++) {
				for(int k = 1; k <= arr[i] || k <= arr[j]; k++) {
			         if( arr[i]%k == 0 && arr[j]%k == 0 )
			         hcf = k;
			      }
				if(hcf>1) {
					arr[i]=arr[i]/hcf;
					arr[j]=arr[j]/hcf;
				}
			}
		}
		int prod=1;
		for(int i=0; i<inp; i++) {
			prod*=arr[i];
			//System.out.println(arr[i]);
		}
		System.out.print("The greatest product is: " + prod);
		
	}

}
