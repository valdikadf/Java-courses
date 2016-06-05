package test.pack;

/**
 * Created by MAN on 01.05.2016.
 */
public class MyMethods {
    public static boolean isSpace(char ch){
        return ch == ' '||ch == '_'||ch =='\t';
    }

    public static boolean isMultiplier(char ch){
        return ch == 'a'||ch == 'b'||ch == 'c';
    }

    public static Double findDoubleInExpression(String s){
        int startIx = 0;
        int endIx = 0;
        for(;startIx<s.length()&&isNumber(s.charAt(startIx));startIx++);
        for(endIx=startIx;startIx<s.length()&&isNumber(s.charAt(endIx));endIx++);
        s = s.substring(startIx,endIx);
        if(s.length()==0)return null;
        try{
            return Double.parseDouble(s);
        }catch (NumberFormatException e){
            return null;
        }
    }

    public static boolean isNumber(char ch){
        return ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='.';
    }
}
