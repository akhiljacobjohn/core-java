package enums;

public class Pizza {

    private PizzaStatus status;

    public enum PizzaStatus {ORDERED, READY, DELIVERED};

    public boolean isDeliverable(){
        return status == PizzaStatus.READY;
    }

    public void setStatus(PizzaStatus status){
        this.status = status;
    }

    public PizzaStatus getStatus(){
        return status;
    }


    public int retStatusIds() {
        switch (status) {
            case READY:
                System.out.println("Pizza is Ready");
                return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Pizza obj = new Pizza();
        obj.setStatus(PizzaStatus.ORDERED);
        if(obj.isDeliverable())
            System.out.println("Pizza is ready to be delivered");
        else
            System.out.println("Pizza is being prepared");



        }
    }




