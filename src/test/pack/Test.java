package test.pack;

import geek.courses.java.MyMath;
import ua.in.sceinces.Program;
import java.io.IOException;
import java.io.SyncFailedException;
import java.util.Arrays;


/**
 * Program for testing
 */
public class Test {

    public static void main(String[] args) throws IOException {
        double a = readFrase("A=1");
        readAndParse(a,-4,4);
    }
    public static void deleteElements(){
        MyStringList myList = new MyStringList();
        for(int i=0;i<7;i++){
            myList.add("element"+i);
        }
        myList.remove(2,4);
        for(int i=0;i<myList.count();i++){
            System.out.format("List element\"%s\",\n",myList.get(i));
        }

        MyStringList expectedList = new MyStringList();
        expectedList.add("element"+0);
        expectedList.add("element"+1);
        expectedList.add("element"+6);
        System.out.print(myList.equals(expectedList));
    }
    public static double readFrase(String frase) throws IOException
    {
        //String frase = Program.stdIn.readLine();
        double a;
        String[] someList = frase.split(" ");
        MyStringList someWords = new MyStringList();
        MyDoubleList someNumbers = new MyDoubleList();
        for (String aSomeList : someList)
        {
            if(aSomeList.length()!=0)
            {
                try
                {
                    someNumbers.add( Double.parseDouble(aSomeList));
                }
                catch (NumberFormatException e)
                {
                    someWords.add(aSomeList);
                }
            }
        }
        //someNumbers.sort();
        for(int i=0;i<someNumbers.count();i++)
        {
                System.out.format("Number[%s] from list: '%s'\n",i,someNumbers.get(i));
        }
        someWords.sort();
        someWords.lower();
        if(someWords.find("a")){
            a = someNumbers.get(0);
            System.out.println(a);
            return a;
        }
        for(int i=0;i<someWords.count();i++)
        {
            System.out.format("Word[%s] from list: '%s'\n",i,someWords.get(i));

        }
        return 0;
    }


     static void loop(){
        int i=1;
        int a=9;
        int b=4;
        while(i<a){
            System.out.format("i[%S] = %s%s\n",i,a,b);
            i++;
            a=1+b;
            b--;
        }
        System.out.format("End of while!!\n");
    }


    public  static void stringConcat() throws IOException {
        String text = "";
        String symbol;
        while (true) {
            System.out.format("Write some exprestions\n");
            symbol = Program.stdIn.readLine();
            if(symbol.length()==0){
                break;
            }
            text = text + symbol;
        }
        System.out.format(symbol);
    }
    public static void array() throws IOException {
        String[] strList = new String[100];
        String[] strList2 = null;
        strList[10]="davz,mnvkajddADFC";
        System.out.println(strList[10]);
        strList2=strList;
        strList2[3]="adf";
        System.out.println(strList[3]);
        System.out.print(strList[3].charAt(1));

    }
    public static void stringArray() throws IOException {
        String[] strList = new String[100];
        int i=0;
        Integer number;
        System.out.println("Write the list of words or press \"Enter\" for stop writing:");
        while (true){
            System.out.format("Write the %s argument of list:",i+1);
            strList[i]=Program.stdIn.readLine();
            if(strList[i].length()==0) {
                break;
            }
            i++;
        }
        System.out.println("Write the number of list expresion or press \"Enter\" for stop writing:");
        while(true){
            number = ReadNumbers.readInteger("Write number:","You write the real number needs integer");
            if(number==null) break;
            if(number>0) {
                System.out.format("The %s element of list: \"%s\"\n", i + 1, strList[number - 1]);
            }else{
                System.out.println("You not have 0 or minus words idiot )");
            }
        }
    }
    public static void readAndParse(double a,double b,double c) throws IOException {
        //double a=0;
        //double b=0;
        //double c=0;
        double d;
        double x1;
        double x2;
        boolean isNumber = true;
      /*  System.out.print("Write the first constant: ");
        String line1 = Program.stdIn.readLine();
        System.out.print("Write the second constant: ");
        String line2 = Program.stdIn.readLine();
        System.out.print("Write the last constant: ");
        String line3 = Program.stdIn.readLine();
        try{
            a = Double.parseDouble(line1);
            b = Double.parseDouble(line2);
            c = Double.parseDouble(line3);
        }catch (NumberFormatException e){
            isNumber = false;
        }*/
        if (isNumber){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("c = "+c);
            System.out.format("%sx^2 + %sx + %s = 0;\n",a,b,c);
            d = MyMath.discriminant(a,b,c);
            System.out.format("D = %s\n",d);
            if (a != 0) {
                if (d > 0 | d == 0) {
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("x1 = "+x1);
                    System.out.println("x2 = "+x2);
                }else {
                    System.out.print("The expreshion hasn't real roots!");
                }
            }else if(b != 0) {
                x1 = (-c)/b;
                System.out.print("You have only one root, x = "+x1+";");
            }else{
                System.out.print("The expreshion hasn't any roots!");
            }
        }
        else {
            System.out.println("You are not right write values! Please write values in number type!");
        }
    }
}
