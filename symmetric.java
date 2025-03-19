import java.util.Scanner;
public class symmetric{
public static void main(String[] args){
int r,c,i,j;
Boolean s=true;
Scanner in =new Scanner(System.in);
System.out.println("enter the no of row ");
r= in.nextInt();
System.out.println("enter the no of column ");
c= in.nextInt();
int m[][]=new int[r][c];
System.out.println("enter the elements of matrix ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
m[i][j]=in.nextInt();
System.out.println();
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++){
if(m[i][j]!=m[j][i]){
s=false;
break;
}
}
}
System.out.println("the  matrix is: ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(m[i][j]+"\t");
System.out.println();
}
System.out.println("the transpose matrix:  ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(m[j][i]+"\t");
System.out.println();
}
if(s)
{
System.out.println(" the  matrix is symmetric ");
}
else{
System.out.println("the  matrix is antisymmetric ");
}
}
}