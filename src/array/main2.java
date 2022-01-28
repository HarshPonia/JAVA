package array;
import java.util.Scanner;
public class main2 {
            void Answer(String s)
            {
                System.out.println("Modifying string");
                StringBuffer st = new StringBuffer("");
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
                    {
                        continue;
                    }
                    else
                    {
                        st.append(s.charAt(i));
                    }
                }
                System.out.println(st);
            }
            public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
                String s;
                System.out.println("Enter your string");
                s = sc.next();
                main2 obj = new main2();
                obj.Answer(s);

            }
        }


