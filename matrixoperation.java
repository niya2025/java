import java.util.Scanner;
public class matrixoperation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("__Enter dimensions for matrix A__");
System.out.print("Rows:");
int r1=sc.nextInt();
System.out.print("cols:");
int c1=sc.nextInt();
System.out.println("__Enter dimensions for matrix B__");
System.out.print("Rows:");
int r2=sc.nextInt();
System.out.print("cols:");
int c2=sc.nextInt();
int[] [] A=new int[r1][c1];
int[] [] B=new int[r2][c2];
System.out.println("Enter elements for matrix A:");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter elements for matrix B:");
for(int i=0;i<2;i++){
for(int j=0;j<c2;j++){
B[i][j]=sc.nextInt();
}
}

while(true){
System.out.println("\n__menu__");
System.out.println("1.Addittion");
System.out.println("2.multiplication");
System.out.println("3.Exit");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
if(choice==3)break;
switch (choice){
case 1://addition
if(r1==r2&&c1==c2){
System.out.println("sum matrix:");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
System.out.print((A[i][j]+B[i][j])+"\t");
}
System.out.println();
}
}else{
System.out.println("Error:Dimensions must be same for Addittion");
}
break;
case 2:
if(c1==r2){
System.out.println("product matrix:");
int[][] c= new int [r1][c2];
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
c[i][j]=0;
for(int k=0;k<c1;k++){
c[i][j]+=A[i][k]*B[k][j];
}
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}else{
System.out.println("Error:col of A must equal row of B.");
}
break;
default:
System.out.println("lnvalid choice!");
}
}
}
}
