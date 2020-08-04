class MyFirstJavaProg{

public static void main(String vars[]){
int x=10;
int age=x;

byte a=50; // 8 bits
int b=a; // 32 bits
//implicit casting (compiler cast)


int c=200;
byte d=(byte)c;
//explicit cast (programmer cast)

System.out.println("hello world " + age);
System.out.println(" value of b =  " + b);
System.out.println(" value of d =  " + d);

}
}