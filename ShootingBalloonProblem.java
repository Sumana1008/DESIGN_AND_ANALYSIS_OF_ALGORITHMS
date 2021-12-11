Shooting balloon problem

 
Assume you are a 100% hitting person. 2 scenarios are there.
1. For every 2 balloons you shoot, one new balloon will be inserted. For example, if you shoot the first 2 balloons, then one balloon will be inserted. Suppose , if the number of balloons = ‘n’, then it will be n-2+1. Likewise, it goes on . If you want to complete the shooting process for n=30, then how many balloons do you shoot before it is empty?
Write a java code to implement.
Code:
import java.util.*;
public class Main{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the initial number of ballons: ");
int n = sc.nextInt();
int sum = 0;
for(int i = 1;i<=n;i++)
{
if(i%2 == 0)
{
n++;
}
sum++;
}
int ans = n+sum;
System.out.println("Number of balloons shot "+sum);
}
}

2. If  you shoot ‘n’ balloons, n-1 balloons would be inserted, if n-1 are done, then n-2 is inserted. The pattern continues in this way. This process continues where you will not have any balloons to shoot. How many balloons you might have shooted at the end?
Implement in Java.

Code:
import java.util.*;
public class ballon2{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the initial number of balloons: ");
int n = sc.nextInt();
int y = n;
int x = 0;
for(int i = 1;i<=n;i++)
{
x = x+1;
if(i==n)
{
n =n + y-1;
y--;
}
} 
System.out.println("Number of ballons shot: "+"   "+ x);
}
}

 
3. Perform DFS/BFS on
Start from 0.
Write down the pseudocode for both traversals.
Ans.
DFS (vertex v){
    v← visited;
    for(all u ∈(adjacent vertices of v)){
        if(u!=visited){
            DFS_recursive(u);
        }
    }
}
 
BFS_queue (vertex v){
    queue q;
    v←enqueued;
    enqueue(q,v);
    while(!isEmpty(q)){
        u←dequeue(q);
        u←visited;
        for(all w∈(adjacent vertices)){
            if(w!=enqueued){
                w←enqueued;
                enqueue(q,w);
            }
        }
    }
}
4. Combination locks are mechanisms that remain locked until a certain number sequence is entered. Either a single dial that must be rotated in a specified manner or three discs fixed in specific positions are used as inputs. You will be asked to calculate how much you must spin a single-face lock to open it with a supplied three-digit code in this challenge.
Our lock's procedure is as follows: (lock-face has up to N numbers and starts at 0)
Rotate the lock a total of one time clockwise, then to the first digit of the code.
Spin the lock once counter-clockwise, then continue rotating to the second digit of the code.
Spin the lock clockwise to the last digit of the code.
CODE:
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the lock combination: ");
int n = sc.nextInt();
if(n>999 || n<100){
System.out.println("Invalid number");
}
else{
int i = 0; 
int a[]=new int[3];
       // Printing the last digit of the number
        while (n > 0) {
 
            // Finding the remainder (Last Digit)
            int remainder = n % 10;
 	a[i] = remainder;
	i++;
            // Removing the last digit/current last digit
            n = n / 10;
        }
int y = 10-a[1];
System.out.println("Rotate " + a[2] + " in clockwise direction for 1st digit");
System.out.println("Rotate " + y + " in counter clockwise direction for 2nd digit");
System.out.println("Rotate " + a[0] + " in clockwise direction for 3rd digit");
}
}
}



