package BankAccount;

public class Bank_Account {
    int Acc_num;
    Address address;
    String Name,contact_num;
    Bank_Account(int Anum,String name,String contact_num,Address address){

        this.Acc_num=Anum;
        this.Name=name;
        this.contact_num=contact_num;
        this.address=address;
    }
    void display(){
        System.out.println("Account number: "+Acc_num+" Acount holder name :  "+Name+ " Contact number :"+contact_num);
        System.out.println("Address : "+address.f+" "+address.city+" "+address.state+" "+address.country);

    }

    public static void main(String[] args) {
        Address add1= new Address("plat no. 3","thane","maharashtra","india");
        Address add2= new Address("plot 5","pratapgarh","uttar pradesh","india");
        Bank_Account Holderdetails1= new Bank_Account(1051,"Rahul maurya","9930854589" ,add1);
        Bank_Account Holderdetails2= new Bank_Account(1052,"Rohit maurya","9819336328" ,add2);
        Holderdetails1.display();
        Holderdetails2.display();
    }
}
