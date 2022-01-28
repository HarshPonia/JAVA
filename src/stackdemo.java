import java.util.Stack;

public class stackdemo {
    void func()
    {
        Stack st = new Stack();
        st.push(5);
        st.push("pepsi");
        st.push("100000");
        st.push(4.65);
        st.push("harsh");

        System.out.println(st);
        System.out.println("---------------------------------------------");
        System.out.println("\n");
//        System.out.println("deleted : -"+st.pop());
        System.out.println("last element : "+st.peek());
        System.out.println("size " + st.size());
    }

    public static void main(String[] args) {
        stackdemo obj = new stackdemo();
        obj.func();
    }
}
