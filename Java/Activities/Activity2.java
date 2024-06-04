package Activities;

public class Activity2 {
    public static void main(String[] args){
        int[] arr1={10,77,10, 54, -11, 10};
        int sum=0;
        for(int i :arr1)
        {
            if(i==10)
            {
                sum+=i;
            }
        }
        if(sum==30)
        {System.out.println("The sum is 30");}
        else {System.out.println("The sum is not 30");}
    }

}
