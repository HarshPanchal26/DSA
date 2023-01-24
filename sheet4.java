import java.util.ArrayList;

public class sheet4{
    public static void sort(ArrayList<Integer> list){
        // System.out.println(list.size());
        // System.out.println(list.get(5));
        int pm=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==2){
                

            }

        }
        System.out.println(pm);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1);
        // System.out.println(list);
        sort(list);
        System.out.println(Integer.MIN_VALUE);
    }
}