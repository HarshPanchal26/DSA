import java.util.ArrayList;

public class Tree5{
    static class Loda {
        int data;
        Loda left;
        Loda right;

        Loda(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
        }
 static class BinaryTree {
    int idx = 0;
        public Loda buildTree(ArrayList<Integer> array){
            idx++;
            if(array.get(idx)==-1){
                return null;
            }
            Loda newNode = new Loda(array.get(idx));
            newNode.left = buildTree(array);
            newNode.right = buildTree(array);

            return newNode;
        }
    }
    // public  class Hatsh{
    //     BinaryTree bt = new BinaryTree();
    //     ArrayList<Integer> alv = new ArrayList<>();
    //     alv.add();
    //     Loda rooot = bt.buildTree(alv);
    // }
    public static void main(String []args){
    //    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       ArrayList<Integer> al = new ArrayList<>();
    //    static int vf = 3 ;its wrong we can;t use static 
       al.add(1);
       al.add(2);
       al.add(4);
       al.add(-1);
       al.add(-1);
       al.add(5);
       al.add(-1);
       al.add(-1);
       al.add(3);
       BinaryTree tree = new BinaryTree();
       Loda root = tree.buildTree(al);
       System.out.println(root.toString());
    //    System.out.println(java.util.Arrays.to(root));
    }
}
