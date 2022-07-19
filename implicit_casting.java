public class implicit_casting 
{  
public static void main(String[] args)  
{  
int x = 21;  
 
long y = x;  
   
float z = y;  
double a = z;
System.out.println("Before conversion, int value "+x);  
System.out.println("After conversion, long value "+y);  
System.out.println("After conversion, float value "+z); 
System.out.println("After conversion, ddouble value "+a);
}  
} 