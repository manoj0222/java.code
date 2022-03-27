import java .util.*;
class Basicpattern{
public static void pattern1(int n){
for(int row=1; row<=n;row++){
 for(int col=n;col>=1;col--){
System.out.print(col+" ");
}
System.out.println();
}
}
public static void pattern2(int n){
for(int row= 1;row<=n;row++){
  for(int col=1;col<=n;col++){
System.out.print(col%2+" ");}
System.out.println();
}
}

public static void pattern3(int n){
for(int row =n;row>=1;row--){
  for(int col =1;col<=n;col++){
    System.out.print(row+" ");}
  System.out.println();
}
}

public static void pattern4(int n){
for(int row=1;row<=n;row++){
  for(int col =1;col<=n;col++){
    System.out.print(row%2+" ");}
    System.out.println();
}
}
public static void pattern5(int n){
for(int row=1;row<=n;row++){
  for(int col =0;col<n;col++){
     System.out.print((char)(col+65)+" ");}
  System.out.println();
}
}
public static void pattern6(int n){
int k=1;
for(int row =1;row<=n;row++){
 for(int col =1;col<=n;col++){
    System.out.print(k%2+" ");
      k++;}
   System.out.println();
}
}
public static void pattern7(int n){
int k=1;
for(int row=1;row<=n;row++){
 for(int col=1;col<=n;col++){
      System.out.print(k+" ");
      k++;
      if(k==10)
      k=1;
}
System.out.println();
}
}
public static void pattern8(int n){
 for(int row=1;row<=n;row++){
   for(int col=1;col<=row;col++){
     System.out.print(row%2+" ");}
  System.out.println();
}
}
public static void pattern9(int n){
 for(int row=1;row<=n;row++){
  for(int col=1;col<=row;col++){
    System.out.print(col%2+" ");}
System.out.println();
}
}
public static void pattern10(int n){
for(int row=1;row<=n;row++){
 for(int col=row;col>=1;col--){
    System.out.print(col+" ");}
 System.out.println();
}
}
public static void pattern11(int n){
for(int row=n;row>=1;row--){
 for(int col=row;col>=1;col--){
    System.out.print(col+" ");}
   System.out.println();
}
}
public static void pattern12(int n){
 for(int row=1;row<=n;row++){
   for(int col = 1;col<=row;col++){
     System.out.print(n-row+1+" ");}
    System.out.println();
}
}
public static void pattern13(int n){
for(int row =1;row<=n;row++){
  for(int col=1;col<=n-row;col++){
    System.out.print(" ");}
    for(int row1=1;row1<=row;row1++){
      System.out.print("*");}
System.out.println();
}
}
public static void pattern14(int n){
  for(int row=1;row<=n;row++){
     for(int col=1;col<= n-row;col++){
      System.out.print("  ");}
      for(int row1=1;row1<=2*row-1;row1++){
       System.out.print("*"+" ");}
      System.out.println();
}
}
public static void line(int n){
System.out.println("****************************");}
public static void main(String[] args){
System.out.println("Please Enter The number");
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
pattern1(n);
line(n);
pattern2(n);
line(n);
pattern3(n);
line(n);
pattern4(n);
line(n);
pattern5(n);
line(n);
pattern6(n);
line(n);
pattern7(n);
line(n);
pattern8(n);
line(n);
pattern9(n);
line(n);
pattern10(n);
line(n);
pattern11(n);
line(n);
pattern12(n);
line(n);
pattern13(n);
line(n);
pattern14(n);
line(n);
}
}

