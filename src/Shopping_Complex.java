import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

class Admins{
    static String name1,name2,name3,name4;
    static void adminsnames(){
        name1 = "Sandra";
        name2 = "Maria";
        name3 = "Joseph";
        name4 = "Gopika";
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("                   Administrators                          ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Admininistrator :"+ name1);
        System.out.println("Manager :"+name2);
        System.out.println("HR :"+name3);
        System.out.println("FInance Manager :"+name4);
    }
    void transactions(){
        System.out.println("Todays TRansactions");

        // Creates an array of character
        char[] array = new char[100];
        try {
            //creating a file reader
            FileReader input = new FileReader("filename.txt");

            //reads character
            input.read(array);
            System.out.println(" The file is opened...............");
            System.out.println(array);

            //closing the reader
            input.close();
        }catch(Exception e) {
            e.getStackTrace();
        }

        }
    }



class Billing{
    String nameofItem;
    int amount,quantity,total;
    double discount,total1;
    void bill(){
        try {
            Scanner insert = new Scanner(System.in);
            System.out.println("Enter the item purchased: ");
            nameofItem = insert.nextLine();
            System.out.println("Enter the amount: ");
            amount = insert.nextInt();
            System.out.println("Enter the Quantity of Item:");
            quantity = insert.nextInt();

            total = amount * quantity;
            discount = 0.1 * total;
            total1 = total - discount;


            System.out.println();
            System.out.println("_______________________________________________________________________");
            System.out.println("|                            Your Bill                                |");
            System.out.println("_______________________________________________________________________");
            System.out.println("|Total Amount      :" + total + "                                             ");
            System.out.println("|Discount          :" + discount + "                                       ");
            System.out.println("|Amount To Be Paid :" + total1 + "                                              ");
            System.out.println("_______________________________________________________________________");

            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("Total Amount =" + total + "\n" + "Discount =" + discount + "\n" + "Amount To Be paid =" + total1);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }catch (Exception e){
            System.out.println("Invalid Entry");
        }

    }
}
class Staff{
    String name,id,desg,sex;
    int salary;

    void new_staff() throws IOException{
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("ID - ");
            id = input.nextLine();
            System.out.println("Name - ");
            name = input.nextLine();

            //buffered Reader
            BufferedReader bufreadr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Designation - ");
            desg = bufreadr.readLine();

            System.out.println("Sex - ");
            sex = input.nextLine();
            System.out.println("Salary - ");
            salary = input.nextInt();

            try {
                FileWriter file = new FileWriter("staff_details");
                BufferedWriter output = new BufferedWriter(file);
                output.write("Name :" + name + "\n" + "desg" + desg + "\n" + "sex" + sex + "\n" + "Salary" + salary);
                output.flush();
                output.close();
            } catch(Exception e) {
                e.getStackTrace();
            }
          
        } catch (Exception e) {
            System.out.println("Error in Entered value!!!!!!!!!!!!!11");
        }
    }

    void staff_info(){
        System.out.println(id + "\t"+ name+"\t"+ desg +"\t"+sex+"\t"+ salary);
    }
}


public class Shopping_Complex {

    //STATIC METHOD
    static void shopAddress(){
        System.out.println("Kiliyanthara, Kunnoth");
    }

    public static void main(String[] args) throws IOException {
        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "may",
                "June",
                "July",
                "Aug",
                "Sept",
                "Oct",
                "Nov",
                "Dec"
        };

        boolean count = true;
        Calendar calendar = Calendar.getInstance();
        System.out.println("*******************************************************");
        System.out.println("                       WELCOME                         ");
        System.out.println("*******************************************************");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println();
        shopAddress();
        

        while(count){
            Scanner input1 = new Scanner(System.in);
            System.out.println("1. Admin Login"+"\t"+"2. Staff Login"+"\t"+"3. Customer Login");
            int option = input1.nextInt();
            if(option == 1){
                Admins.adminsnames();
                Staff xyz = new Staff();
                xyz.new_staff();
                Admins zxc = new Admins();
                zxc.transactions();
            }else if(option ==2){
                System.out.println();
            }else if(option ==3){
                Billing newbill = new Billing();
                newbill.bill();
            }else {
                System.out.println(" INVALID ENTRY........Give Correct Option....................");
                System.out.println();
                count = true;
            }
        }
        
        System.out.println();

        
        

        





    }
}
