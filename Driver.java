public class Driver{
    public static void main(String args[])
    {
       /* Rectangular rect = new Rectangular();
        System.out.println("Area of the Rectangular: "+rect.compute ( 52.2f , 40.0f));
        */
        Account account = new Account();
        account.show_Data();
        account.setInput(101 ,  10502.5);
        account.show_Data();
        account.deposit( 500.5);
        account.show_Data();
    }
}