import java.util.Scanner;

public class lower_to_upper
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuffer st1 = new StringBuffer(st);
        for(int i=0;i<st.length();i++)
        {
            char a = st.charAt(i);
            if(a>=65 && a<=90)
            {
                st1.setCharAt(i,(char)(st.charAt(i)+32));
            }

        }
        System.out.println(st1);


    }
}
