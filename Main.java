import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("An electrogaz billing machine");
        System.out.println("-------------------------------");
        System.out.println("choose option 1 for electricity");
        System.out.println("choose option 2 for water");
        int option;
        option=input.nextInt();
        switch(option){
            case 1:
                try{
                    FileWriter Writer=  new FileWriter("electricity_data.txt");
                    Writer.write("invoice is here");
                    Writer.close();
                    System.out.println("File has been written");
                }catch(IOException e){
                    System.out.println("Could not write file ");

                }
                case 2:
                    String name;
                    float total_amount,units ,amount;
                    try{
                        FileWriter writer=new FileWriter("Water_data.txt",true);
                        System.out.println("enter your customer name");
                        name = input.next();
                        writer.write("name: "+name+"\n");
                        System.out.println("enter customer units");
                        units=input.nextFloat();
                        writer.write("units: "+units+"\n");
                        if(units<500){
                            amount = 100;
 
                         }else if(units<1000){
                             amount = 150;
                         }else if(units<1500){
                             amount = 200;
 
                         }else{
                             amount = 250;
                         }
                        writer.close();
                        System.out.println("File has been written");


                    }catch(IOException e){
                        System.out.println("Could not write file ");
                    }


        }
    }
    
}
