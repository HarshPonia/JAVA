import java.util.ArrayList;
import java.util.List;

public class listdemo {
    void func()
    {
        List ls = new ArrayList();
        ls.add("Name");
        ls.add(3);
        ls.add(2.5);
        ls.add("Dairymilk");
        ls.add("Name");
        System.out.println(ls.get(1)); // find
        ls.set(1,"Harsh");
        ls.add(1,"kitkat");
        //ls.remove(3);
//        ls.clear();
        System.out.println(ls);
        System.out.println("length of List : "+ls.size());
    }

    public static void main(String[] args) {
        listdemo obj= new listdemo();
        obj.func();
    }
}
