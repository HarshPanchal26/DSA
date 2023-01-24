public class settingArrangment {
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int N = 5;
            int K = 3;
            int array[] = {1,0,0,0,0};
            int count = 1;
            int i=N-1;
            boolean  verdict = false;
            while(count<=K){
                if(array[i]==1) i-=2;
                if(array[i-1]!=1)
                {
                    verdict = true;
                    count++;
                }
                else{
                    count++;
                    verdict = false;
                    break;
                }
            }
            System.out.println(verdict);
        }
    }   
}
