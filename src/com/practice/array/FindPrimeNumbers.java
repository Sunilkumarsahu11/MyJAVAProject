package com.practice.array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class FindPrimeNumbers 
{
 //partitioned Seive of Eratosthenes
   
 public static void main(String[]args)throws IOException
 {
  int max=(int)Math.sqrt(100)+1;
  boolean primes[]=new boolean[max+1];
  //primes[0] and primes[1] should be false by default 
  //because they 0 and 1 are not primes.
 
  for(int i=2;i<=max;i++)
   primes[i]=true;
  for(int i=2;i*i<=max;i++)
   if(primes[i])
    for(int j=i*i;j<=max;j+=i)
     primes[j]=false;
   
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(br.readLine());
  while(t-->0)
  {
   StringTokenizer stz=new StringTokenizer(br.readLine());
   int m=Integer.parseInt(stz.nextToken());
   int n=Integer.parseInt(stz.nextToken());
   boolean newPrimes[]=new boolean[n-m+1];
   for(int i=0;i<newPrimes.length;i++)
    newPrimes[i]=true;
   for(int i=2;i<=Math.sqrt(n);i++)
    if(primes[i]) // means i is a prime number.
     for(int j=(m/i)*i;j<=n;j+=i)
     {
      if(j-m < 0)
       continue;
      newPrimes[j-m]=false;
     }
    
   for(int i=0;i<=Math.sqrt(n);i++)
    if(i>=m && i<=n && primes[i])
     System.out.println(i);
     
   for(int i=0;i<newPrimes.length;i++)
    if(newPrimes[i] && i+m!=1)
     System.out.println(""+(i+m));
   System.out.println();
  }
 }
}