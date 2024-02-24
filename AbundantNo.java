import java.util.*;
class AbundantNo{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int n,sum=0;
  n = in.nextInt();
  for(int i=1;i<n;i++){
   if(n%i==0)
    sum+=i;
  }
  String res = (sum>n)?"An Abundant number":"Not an Abundant number";
  System.out.println(res);
 }
}