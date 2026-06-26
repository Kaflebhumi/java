class InvalidGuestCountException extends RuntimeException {
    public InvalidGuestCountException(String message) {
        super(message);
    }
}

class BudgetExceededException extends RuntimeException {
    public BudgetExceededException(String message) {
        super(message);
    }
}

class TikaCeremony extends FestivalActivity {

    int expectedguests;
    String mainfamilyElder;

    TikaCeremony(int e, String mf, double estimatedCost) {
        super("Tika Ceremony", estimatedCost);
        this.expectedguests = e;
        this.mainfamilyElder = mf;
    }

    @Override
    public void planActivity() throws InvalidGuestCountException, BudgetExceededException {

        if (expectedguests < 7) {
            throw new InvalidGuestCountException("Not enough guests");
        }

        if (estimatedCost > 60000) {
            throw new BudgetExceededException("High budget");
        }

        System.out.println("Tika ceremony with " + mainfamilyElder +
                " planned successfully for " + expectedguests + " guests");
    }

    public static void main(String[] args) {

        TikaCeremony t1 = new TikaCeremony(10, "Grandfather", 8000); 
    TikaCeremony t2 = new TikaCeremony(3, "Grandmother", 6000);  
    TikaCeremony t3 = new TikaCeremony(10, "Mother", 30000);      

    try {
        t1.planActivity();
    } catch (InvalidGuestCountException | BudgetExceededException e) {
        System.out.println(e.getMessage());
    }

    try {
        t2.planActivity();
    } catch (InvalidGuestCountException | BudgetExceededException e) {
        System.out.println(e.getMessage());
    }

    try {
        t3.planActivity();
    } catch (InvalidGuestCountException | BudgetExceededException e) {
        System.out.println(e.getMessage());
    }
         }      
    }