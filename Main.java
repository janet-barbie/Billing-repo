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
        float total_amount,units ,amount,additional_charges,service_charge;
        option=input.nextInt();
        switch(option){
            case 1:
                service_charge=100;
                additional_charges=0;
                
                try{
                    FileWriter writer=  new FileWriter("electricity_data.txt",true);
                    System.out.println("enter  customer name");
                    name = input.next();      
                    System.out.println("enter customer registration number");                  
                    registration_number = input.nextInt();
                    System.out.println("enter customer units");                  
                    units=input.nextFloat(); 
                    //validation
                    if(units<=0){
                        System.out.println("error:incorrect units");
                        writer.close();
                        return;
                        
                    }                  
                    if(units<100){
                        amount=60*units;
                    }else if(units<=200){
                        amount = (100 * 60) + ((units - 100) * 80);                    
                    }else if(units <=300){
                        amount = (100 * 60) + (100*80)+((units-200)*90);                 
                    }else{
                        amount = (100 * 60) + (100*80)+(100*90)+((units-300)*120);  
                    }
                    total_amount= (service_charge+amount);
                    System.out.println("initial"+total_amount);
                    if(total_amount<100){
                        total_amount = 100;                     
                    }
                    if(total_amount>=500){
                        additional_charges= (0.15f* amount);
                        total_amount +=additional_charges;

                    }
                    // print info message
                    System.out.println("final"+total_amount);
                    System.out.println("the Registration number is "+ registration_number);
                    System.out.println("individual charges is: "+ service_charge);
                    System.out.println("units consumed: "+units);
                    System.out.println("other charges: "+additional_charges);
                    System.out.println("Total amount to be paid: "+total_amount);
                    /////save customer to files
                    writer.write("name: "+name+"\n");
                    writer.write("registration_number: "+registration_number+"\n");
                    writer.write("units: "+units+"\n");
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
                    additional_charges=0;
                    try{
                        FileWriter writer=new FileWriter("Water_data.txt",true);
                        System.out.println("enter  customer name");
                        name = input.next();
                        System.out.println("enter customer registration number");
                        registration_number = input.nextInt();
                        System.out.println("enter customer units");
                        units=input.nextFloat();
                        //validation
                        if(units<=0){
                            System.out.println("error:incorrect units");
                            writer.close();
                            return;             
                        } 
                        if(units<500){
                            amount = 100*units;
                         }else if(units<1000){
                            amount=(500*100)+((units-500)*150);
                         }else if(units<1500){
                            amount=(500*100)+(500*150)+((units-1000)*200);
                         }else{ 
                            amount=(500*100)+(500*150)+(500*200)+((units-1500)*250);
                         }
                         total_amount= (service_charge+amount);
                         if(total_amount<30){
                            total_amount = 30;
                        }
                        if(total_amount>1000){
                            additional_charges= (0.20f* amount);
                            total_amount +=additional_charges;
                        }
                        // print info message
                        System.out.println("the Registration number is "+ registration_number);
                        System.out.println("individual charges is: "+ service_charge);
                        System.out.println("units consumed: "+units);
                        System.out.println("other charges: "+additional_charges);
                        System.out.println("Total amount to be paid: "+total_amount);
                        ///////////save customer to files
                        writer.write("name: "+name+"\n");
                        writer.write("registration_number: "+registration_number+"\n");
                        writer.write("units: "+units+"\n");
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
