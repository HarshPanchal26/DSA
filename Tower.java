public class Tower {
    public static void towerofHanoi(int n , String source , String Helper , String Destination ){
      if(n==1){
        System.out.println(" Disk transfer form "+ source + " to " + Destination);
        return; 
      }
      towerofHanoi(n-1, source,  Destination, Helper);
      System.out.println(" transfer disk " + n + " from " +source + " to " + Destination );
      System.out.println();
      towerofHanoi(n-1, Helper, source, Destination);
    }
    public static void main(String[] args) {
        towerofHanoi(2," S "," H "," D ");
    }
} 
