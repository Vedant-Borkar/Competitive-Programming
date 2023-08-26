import java.util.*;
public class SimplifyingWordCase {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,fin;
        int i,lc=0,uc=0,len;
        str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                uc++;
            else if(Character.isLowerCase(str.charAt(i)))
                lc++;
        }
        if(uc>lc)
            fin=str.toUpperCase();
        else
            fin=str.toLowerCase();
        System.out.println(fin);
    }
}
