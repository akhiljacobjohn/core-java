package builder_design_pattern;

public class BankAccount {

    private String custName;
    private long accNo;
    private String email;
    private boolean reqNewsLetter;

    public BankAccount(BankAccountBuilder builderObj) {
        this.custName = builderObj.custName;
        this.accNo = builderObj.accNo;
        this.email = builderObj.email;
        this.reqNewsLetter = builderObj.reqNewsLetter;
        System.out.println(custName + " - " + accNo + " - " +  email + " - " + reqNewsLetter);

    }




    public static class BankAccountBuilder {
        private String custName;
        private long accNo;
        private String email;
        private boolean reqNewsLetter;

        public BankAccountBuilder(String custName, long accNo) {
            this.custName = custName;
            this.accNo = accNo;
        }

        public BankAccountBuilder getEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder isNewsLetter(boolean reqNewsLetter) {
            this.reqNewsLetter = reqNewsLetter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }


    }


}
