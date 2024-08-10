package bank;
class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class Bank{
    public static void main(String[]args){
        Account account1 = new Account();
        account1.name ="Anshika Srivastava";
        account1.email="Anshsdjfjfk";

        account1.setPassword("abcs");
        System.out.println(account1.getPassword());

    }
}
  