public class explicit_casting 
{  
public static void main(String args[])  
{  
char a = 'B';
int c = a;
System.out.println("After conversion char into int:"+c);

double d = 130.36;  
   
long l = (long)d;  
  
int i = (int)l;  
System.out.println("Before conversion: "+d);  
   
System.out.println("After conversion into long type: "+l);  
  
System.out.println("After conversion into int type: "+i); 

}  
}  