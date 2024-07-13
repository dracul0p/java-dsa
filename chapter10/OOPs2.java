// acess modifiers  : private ,  default ,protected , public.

public class OOPs2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Asheesh";
        System.out.println(myAcc.username);

    // myAcc.password = "123";    // not visible / not work . it is in private class.
       myAcc.SetPassword("123");  // can change 
    // System.out.println(myAcc.password);  //cant be acessed 
        
    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void SetPassword(String pwd){
          password = pwd;
    }

    
}
