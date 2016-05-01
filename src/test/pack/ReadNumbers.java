package test.pack;

import ua.in.sceinces.Program;

import java.io.IOException;

/**
 * Cryated by Vladyslav Khvorostianyi
 */
public class ReadNumbers {
    public static Double readDouble(String invitations,String error) throws IOException {
        while(true) {
            System.out.print(invitations);
            String symbol = Program.stdIn.readLine();
            if(symbol.length()==0){
               return null;
            }
            try {
                return Double.parseDouble(symbol);
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }

    }
    public  static Integer readInteger(String invitations,String error) throws  IOException{
        while (true){
            System.out.print(invitations);
            String symbol = Program.stdIn.readLine();
            if(symbol.length()==0) return null;
            try{
                return Integer.parseInt(symbol);
            }catch (NumberFormatException e){
                System.out.println(error);
            }
        }
    }
}
