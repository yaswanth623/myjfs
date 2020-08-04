class TypeCast{

public static void main(String vars[]){


char x='A'; // 2 byte
int a=x; // 4 byte
//implicit cast


int y=65;
//char z=y;  error

char z=(char)y;

System.out.println(a);
System.out.println(z);

}
}