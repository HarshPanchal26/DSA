import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;

class Test
{
      class Node{
        int data;
        Node left;
        Node right;
 
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static int idx = 0; 
     public  Node  create(ArrayList<Integer> array ){
        idx++;
        if(array.get(idx)==-1){
          return null;
        }
        Node newNode = new Node(array.get(idx));
        newNode.left = create(array);
        newNode.right = create(array);

        return newNode;
    }
  public static void main(String []args){
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(4);
    al.add(-1);
    al.add(-1);
    al.add(5);
    al.add(-1);
    al.add(-1);
    al.add(3);
    Test obj = new Test();   
    Node root = obj.create(al);
    System.out.println(toString(root));
}
private static String toString(Test.Node root) {
    return String.valueOf(root);
}
}





// List.addAll(array);
// Collection.addAll(array);
// List<Integer> anotherList = Arrays.asList(5, 12, 9, 3, 15, 88);
// list.addAll(anotherList);
    
    
    
    
    // static method
   
    // void m1()
    // {
    //     System.out.println("from m1");
    // }

    // public static void main(String[] args)
    // {
    //       // calling m1 without creating
    //       // any object of class Test
    //       Test me =
    //  new Test(); 
    //       me.m1();
    // }
