PRIM’S ALGORITHM:

CODE:
import java.util.Scanner; 
class Main { 
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 
int h[][]=new int[10][10]; 
int i,j,e,l=0; 
int min; 
int sum=0; 
int x=0,y=0; 
int f=0; 
int r[]=new int[10]; 
System.out.println("Enter the number of vertices"); 
int n=sc.nextInt(); 
for(i=1;i<=n;i++) 
r[i]=0; 
System.out.println("Enter the weighted graph"); 
for(i=1;i<=n;i++)
for(j=1;j<=n;j++) 
h[i][j]=sc.nextInt(); 
System.out.println("Enter the source vertex"); e=sc.nextInt(); 
r[e]=1; 
l=1; 
while (l<=n-1) 
{ 
min=99; 
for(i=1;i<=n;i++) 
for(j=1;j<=n;j++) 
if(r[i]==1&&r[j]==0) 
if(i!=j&&min>h[i][j]) 
{ 
min=h[i][j]; 
x=i; 
y=j; 
} 
r[y]=1; 
sum=sum+min; 
l++; 
System.out.println(x+"->"+y+"="+min); } 
for(i=1;i<=n;i++)
if(r[i]==0) 
f=1; 
if(f==1) 
System.out.println("No spanning tree"); 
else 
System.out.println("The cost of minimum spanning tree is "+ sum); sc.close(); 
} 
} 

KRUSKAL’S ALGORITHM:

CODE:

import java.util.Scanner;
class Main {
int g[]=new int[10];
int find(int m)
{
int p=m;
while(g[p]!=0)
p=g[p];
return p;
}
void union(int i,int j)
{
if(i<j)
g[i]=j;
else
g[j]=i;
}
void krkl(int[][]a, int n)
{
int u=0,v=0,min,k=0,i,j,sum=0;
while(k<n-1)
{
min=99;
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
if(a[i][j]<min&&i!=j)
{
min=a[i][j];
u=i;
v=j;
}
i=find(u);
j=find(v);
if(i!=j)
{
union(i,j);
System.out.println("("+u+","+v+")"+"="+a[u][v]);
sum=sum+a[u][v];
k++;
}
a[u][v]=a[v][u]=99;
}
System.out.println("The cost of minimum spanning tree = "+sum);
}
public static void main(String[] args) {
int a[][]=new int[10][10];
int i,j;
System.out.println("Enter the number of vertices of the graph");
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
System.out.println("Enter the wieghted matrix");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
a[i][j]=sc.nextInt();
Main k=new Main();
k.krkl(a,n);
sc.close();
}
}
