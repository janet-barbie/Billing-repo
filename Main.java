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
        int option,registration_number;
        String name;
        float total_amount,units ,amount,additional_charges=0,service_charge;
        option=input.nextInt();
        switch(option){
            case 1:
                service_charge=100;
                
                try{
                    FileWriter writer=  new FileWriter("electricity_data.txt",true);
                    System.out.println("enter  customer name");
                    name = input.next();
                    writer.write("name: "+name+"\n");
                    System.out.println("enter customer registration number");                  
                    registration_number = input.nextInt();
                    System.out.println("enter customer units");
                    writer.write("registration_number: "+registration_number+"\n");
                    units=input.nextFloat();
                    writer.write("units: "+units+"\n");
                    if(units<100){
                        amount=60*units;
            

                    }else if(units<=200){
                        amount = 80*units;
                      
                    }else if(units <=300){
                        amount = 90*units;
                        System.out.println("amount:"+amount);
                       
                     
                       
                    }else{
                        amount = 120*units;

                    }
                    total_amount= (service_charge+amount);
                    if(total_amount<100){
                        total_amount = 100;
                        System.out.println("total_amount:"+total_amount);

                    }
                    if(total_amount<=500){
                        additional_charges= (0.2f* amount);
                        total_amount = (amount+additional_charges+service_charge);

                    }
                    System.out.println("the Registration number is "+ registration_number);
                    System.out.println("individual charges is: "+ service_charge);
                    System.out.println("units consumed: "+units);
                    System.out.println("other charges: "+additional_charges);
                    System.out.println("Total amount to be paid: "+total_amount);
                    writer.write("service charge: " + service_charge + "\n");
                    writer.write("amount: " + amount + "\n");
                    writer.write("additional charges: " + additional_charges + "\n");
                    writer.write("total amount: " + total_amount + "\n");
                    writer.write("------------------------------\n");
                    
                    
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
                        System.out.println("enter  customer name");
                        name = input.next();
                        writer.write("name: "+name+"\n");
                        System.out.println("enter customer registration number");
                        registration_number = input.nextInt();
                        writer.write("registration_number: "+registration_number+"\n");
                        System.out.println("enter customer units");
                        units=input.nextFloat();
                        writer.write("units: "+units+"\n");
                        if(units<500){
                            amount = 100*units;
         

                         }else if(units<1000){
                            amount = 150*units;
                         
                           

                         }else if(units<1500){
                             amount = 200*units;

 
                         }else{
                             amount = 250*units;
                            
                         }
                         total_amount= (service_charge+amount);
                         if(total_amount<30){
                            total_amount = 30;
    
                        }
                        if(total_amount<=500){
                            additional_charges= (0.2f* amount);
                            total_amount = (amount+additional_charges+service_charge);
    
                        }
                        System.out.println("the Registration number is "+ registration_number);
                        System.out.println("individual charges is: "+ service_charge);
                        System.out.println("units consumed: "+units);
                        System.out.println("other charges: "+additional_charges);
                        System.out.println("Total amount to be paid: "+total_amount);
                        writer.write("service charge: " + service_charge + "\n");
                        writer.write("amount: " + amount + "\n");
                        writer.write("additional charges: " + additional_charges + "\n");
                        writer.write("total amount: " + total_amount + "\n");
                        writer.write("------------------------------\n");

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
