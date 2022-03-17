package builder_design_pattern;

public class Client {
    public static void main(String[] args) {
        BankAccount accountObj = new BankAccount.BankAccountBuilder("Akhil", 1234567890877L).getEmail("akhilemail@email.com").isNewsLetter(true).build();
    }
}
