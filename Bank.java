import java.util.*;

/*class OurBank{
    // all the data of the customers.
    private ArrayList<String> AccNo = new ArrayList<String>();
    private ArrayList<Integer> pin = new ArrayList<Integer>();
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<Long> balance = new ArrayList<Long>();
    private ArrayList<String> aadharNo = new ArrayList<String>();

    //methods for getting the index in the list.
    public int getIndex(String accno){
        // getting the index.
        int index =-1,i=0;
        while(i<AccNo.size()){
            if(AccNo.get(i) == accno){
                index = i;
                break;
            }   
        }
        return index;
    }


    // getters for the lists'
    int get_size(){
        return this.AccNo.size();
    }


    String getName(int indexnum){
        String result = this.name.get(indexnum);
        return result;
    }
    String getAddress(int indexnum){
        
        String result = this.address.get(indexnum);
        return result;
    }
    String getAadhar(int indexnum){
        
        String result = this.aadharNo.get(indexnum);
        return result;
    }
    
    // updating address.
    public void update_Address(String accno,String Address){
       
        int index = getIndex(accno);
        if(index!=-1)
            address.set(index,Address);// updating the address.
        else
            System.out.println("No user data available!!"); 
    }
    // updating the pin
    public void update_pin(String accno,int new_pin){
        int index = getIndex(accno);
        // setting the user pin.
        if(index!=-1)
            pin.set(index,new_pin);
        else 
            System.out.println("No user data now!");

    }
    // verifying the details accno and pin.
    public boolean verify(String accno,int pin){
        // getting the index.
        boolean result = false;
        int index = getIndex(accno);
        if(index!=-1 && this.pin.get(index) == pin){
            result = true;
        }
        return result;
    }
    // checking whether an existing user have the same credentials as the existing user
    boolean check_existing_user(String aadharnum){
        boolean result = false;
        // checking for aadhar in the existing aadhar array list.if there return true.
        for(int i=0;i<this.aadharNo.size();i++){
            if(this.aadharNo.get(i) == aadharnum){
                result = true;
                break;
            }
        }
        return result;
    }
    // account number generator 
    String accountNo_generator(){
        String bank = "ourbankXX";
        int size = AccNo.size();
        String accno = bank + size;
        return accno;
    }
    // for new users . updating the lists.
    public void add_list(String name,String address,String aadharNo,int pin){
        //will have the same indices.
        this.name.add(name);
        this.address.add(address);
        this.aadharNo.add(aadharNo);
        this.balance.add(0L);
        // updating pin in the pin list
        this.pin.add(pin);
        // updating accno in the accno list
        this.AccNo.add(accountNo_generator());
        System.out.println("The account number :"+accountNo_generator()+",current balance is 0");

    }

    long check_balance(String accno,int pin){
        long balance = -1;
        int index =getIndex(accno);
        balance = this.balance.get(index);
        return balance;
    }
    void withdrawAmount(String accno,int pin,long withdraw){
    
            int index = getIndex(accno);
            if(this.balance.get(index)>=withdraw)
            {
                long diff = this.balance.get(index) - withdraw;
                this.balance.set(index,diff);//changed the balance after the withdraw.
                System.out.println("The balance after withdraw is "+this.balance.get(index));
            }
        }

    void depositAmount(String accno,int pin,long deposit){
        int index = getIndex(accno);
        long add = this.balance.get(index) + deposit;
        this.balance.set(index,add);//changed the balance after the withdraw.
        System.out.println("The balance after deposit is "+this.balance.get(index));
    }

}*/

/*class HasAccount extends Bank{// Inheritance .
 
}

class CreateNewAccount extends Bank{
    
    
}
*/
// modifued in only one class.
public class Bank{

// all the data of the customers.
    private ArrayList<String> AccNo = new ArrayList<String>();
    private ArrayList<Integer> pin = new ArrayList<Integer>();
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<Long> balance = new ArrayList<Long>();
    private ArrayList<String> aadharNo = new ArrayList<String>();

    //methods for getting the index in the list.
    public int getIndex(String accno){
        // getting the index.
        int index =-1,i=0;
        while(i<AccNo.size()){
            if(AccNo.get(i) == accno){
                index = i;
                break;
            }   
            i++;
        }
        return index;
    }


    // getters for the lists'
    int get_size(){
        return this.AccNo.size();
    }


    String getName(int indexnum){
        String result = this.name.get(indexnum);
        return result;
    }
    String getAddress(int indexnum){
        
        String result = this.address.get(indexnum);
        return result;
    }
    String getAadhar(int indexnum){
        
        String result = this.aadharNo.get(indexnum);
        return result;
    }
    
    // updating address.
    public void update_Address(String accno,String Address){
       
        int index = getIndex(accno);
        if(index!=-1)
            address.set(index,Address);// updating the address.
        else
            System.out.println("No user data available!!"); 
    }
    // updating the pin
    public void update_pin(String accno,int new_pin){
        int index = getIndex(accno);
        // setting the user pin.
        if(index!=-1)
            pin.set(index,new_pin);
        else 
            System.out.println("No user data now!");

    }
    // verifying the details accno and pin.
    public boolean verify(String accno,int pin){
        // getting the index.
        boolean result = false;
        int index = getIndex(accno);
        if(index!=-1 && this.pin.get(index) == pin){
            result = true;
        }
        return result;
    }
    // checking whether an existing user have the same credentials as the existing user
    boolean check_existing_user(String aadharnum){
        boolean result = false;
        // checking for aadhar in the existing aadhar array list.if there return true.
        for(int i=0;i<this.aadharNo.size();i++){
            if(this.aadharNo.get(i) == aadharnum){
                result = true;
                break;
            }
        }
        return result;
    }
    // account number generator 
    String accountNo_generator(){
        String bank = "ourbankXX";
        int size = AccNo.size();
        String accno = bank + size;
        return accno;
    }
    // for new users . updating the lists.
    public void add_list(String name,String address,String aadharNo,int pin){
        //will have the same indices.
        this.name.add(name);
        this.address.add(address);
        this.aadharNo.add(aadharNo);
        this.balance.add(0L);
        // updating pin in the pin list
        this.pin.add(pin);
        // updating accno in the accno list
        this.AccNo.add(accountNo_generator());
        System.out.println("The account number :"+accountNo_generator()+",current balance is 0");

    }

    long check_balance(String accno,int pin){
        long balance = -1;
        int index =getIndex(accno);
        balance = this.balance.get(index);
        return balance;
    }
    void withdrawAmount(String accno,int pin,long withdraw){
    
            int index = getIndex(accno);
            if(this.balance.get(index)>=withdraw)
            {
                long diff = this.balance.get(index) - withdraw;
                this.balance.set(index,diff);//changed the balance after the withdraw.
                System.out.println("The balance after withdraw is "+this.balance.get(index));
            }
        }

    void depositAmount(String accno,int pin,long deposit){
        int index = getIndex(accno);
        long add = this.balance.get(index) + deposit;
        this.balance.set(index,add);//changed the balance after the withdraw.
        System.out.println("The balance after deposit is "+this.balance.get(index));
    }
    
   public void HasAccount(){// existing user
        if(get_size()>0){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Account No:");//accno
        String accno = scanner.nextLine();
       // System.out.println();
        System.out.print("Enter the pin:");//pin
        int pin = scanner.nextInt();
        // verification of accno and pin....
        if(verify(accno, pin)){


            System.out.println("Press\n1-check balance\n2-withdraw\n3-deposit\n4-change credentials\n5-create another account");
            int op = scanner.nextInt();

            switch(op){

                case 1:

                    if(check_balance(accno,pin)!=-1)
                    System.out.println("Balance"+check_balance(accno, pin));
                    break;
                case 2:
                    System.out.print("\nEnter the amount:");
                    long withdraw = scanner.nextInt();
                    withdrawAmount(accno, pin, withdraw);
                    break;
                case 3:
                    System.out.print("\nEnter the amount:");
                    long deposit = scanner.nextInt();
                    depositAmount(accno, pin, deposit);
                    break;
                case 4:
                    System.out.println("press\n1-change pin\n2-change address");
                    int a = scanner.nextInt();
                    switch(a){
                        case 1:
                            System.out.println("Enter the new pin(four digits):");
                            int new_pin = scanner.nextInt();
                            update_pin(accno, new_pin);
                            break;
                        case 2:
                            System.out.print("\nEnter the new address:");
                            String new_address = scanner.nextLine();
                            update_Address(accno,new_address);
                            break;
                    }
                case 5:
                    System.out.println("Enter a four digit pin for new account:");
                    int new_acc_pin = scanner.nextInt();
                    int index = getIndex(accno);
                    add_list(getName(index),getAddress(index),getAadhar(index),new_acc_pin);
        }
        // closing the scanner.
       // scanner.close();1
    }
    else
        System.out.println("Incorrect Account Number or pin!");
}
else 
System.out.println("No existing user data!");
}

public void CreateNewAccount(){// no arg constructor
        Scanner scanner = new Scanner(System.in);
        // name
        System.out.print("\nEnter Your Name as per Aadhar card:");
        String name = scanner.nextLine();
        //address
        System.out.print("\nEnter Address:");
        String address = scanner.nextLine();
        // aadhar number
        System.out.print("\nEnter the aadhar no:");
        String aadharNum = scanner.nextLine();
        // checking whether the existing user have same credentials as new user.
        if(!check_existing_user(aadharNum)){
            // pin
            System.out.print("\nEnter a four digit pin for the account:");
            int new_cust_pin = scanner.nextInt();
            add_list(name,address,aadharNum,new_cust_pin);
            
        }
        else
        System.out.println("Already a existing user!");
        //scanner.close();2
        
    }


   
    public static void main(String[] args){
    Bank a = new Bank();
    Scanner scanner = new Scanner(System.in);
       while(true){
            System.out.println("\n\nWELCOME TO OurBank Services!\n");
            // for choosing the options.
                int counter =0;
                System.out.println("Press\n1-If you have an account already\n2-Create a new account\n3-exit");
		 counter = scanner.nextInt();
         
                switch(counter){
                    case 1:
                        a.HasAccount();
                        break;
                    case 2:
                        a.CreateNewAccount();
                        break;
                    case 3:
                        break;
                    default:
                    	System.out.println("Invalid");
                    	break;
                }
                System.out.println("Thank You!");
                //scanner.close();3
        }
    }
}
