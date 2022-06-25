import java.util.Scanner;
public class StringUtil{
    public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            String str1=in.nextLine();
            StringBuilder str2Builder=new StringBuilder();
            StringBuilder stringBuilder=new StringBuilder(str1);
            int str1Length=stringBuilder.length();
            int CharIndex=0;
            for(CharIndex=0;CharIndex<str1Length;CharIndex++){
                    if(stringBuilder.charAt(CharIndex)!=' ')str2Builder.append(stringBuilder.charAt(CharIndex));
            }
            System.out.println(str2Builder);
    }
}
