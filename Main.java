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
        String name;
        float total_amount,units ,amount,additional_charges,service_charge;
        option=input.nextInt();
        switch(option){
            case 1:
                service_charge=100;
                
                try{
                    FileWriter writer=  new FileWriter("electricity_data.txt",true);
                    System.out.println("enter your customer name");
                    name = input.next();
                    writer.write("name: "+name+"\n");
                    System.out.println("enter customer units");
                    units=input.nextFloat();
                    writer.write("units: "+units+"\n");
                    if(units<100){
                        amount=60;
                        System.out.println("amount:"+amount);
                        total_amount= (service_charge+amount);
                        System.out.println("total_amount:"+total_amount);

                    }else if(units<=200){
                        amount = 80;
                        System.out.println("amount:"+amount);
                        total_amount= (service_charge+amount);
                        System.out.println("total_amount:"+total_amount);
                    }else if(units <=300){
                        amount = 90;
                        System.out.println("amount:"+amount);
                        total_amount= (service_charge+amount);
                        System.out.println("total_amount:"+total_amount);
                       
                    }else{
                        amount = 120;
                        System.out.println("amount:"+amount);
                        total_amount= (service_charge+amount);
                        System.out.println("total_amount:"+total_amount);
                    }
                    if(total_amount<100){
                        total_amount = 100;
                        System.out.println("total_amount:"+total_amount);

                    }
                    if(total_amount<=500){
                        additional_charges= (0.2f* amount);
                        System.out.println("additional charges " + additional_charges);
                        total_amount = (amount+additional_charges+service_charge);

                    }
                    
                    
                    writer.close();
                    System.out.println("File has been written");
                }catch(IOException e){
                    System.out.println("Could not write file ");

                }
                break;
                case 2:

                    service_charge=300;
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
                            System.out.println("amount is " + amount);
                            total_amount= (amount+service_charge);
                            System.out.println("total amount "+total_amount);
                         
 
                         }else if(units<1000){
                            amount = 150;
                            System.out.println("amount is " + amount);
                            total_amount= (amount+service_charge);
                            System.out.println("total amount "+total_amount);
                           

                         }else if(units<1500){
                             amount = 200;
                             System.out.println("amount is " + amount);
                             total_amount= (service_charge+amount);
                             System.out.println("total amount "+total_amount);
 
                         }else{
                             amount = 250;
                            System.out.println("amount is " + amount);
                            total_amount= (service_charge+amount);
                            System.out.println("total amount "+total_amount);
                         }
                         if(total_amount<30){
                            total_amount = 30;
                            System.out.println("total_amount:"+total_amount);
    
                        }
                        if(total_amount<=500){
                            additional_charges= (0.2f* amount);
                            System.out.println("additional charges " + additional_charges);
                            total_amount = (amount+additional_charges+service_charge);
    
                        }
                        writer.close();
                        System.out.println("File has been written");


                    }catch(IOException e){
                        System.out.println("Could not write file ");
                    }
                    break;
                    default:
                        System.out.println("wrong input");
                        break;
        


        }
    }
    
}
