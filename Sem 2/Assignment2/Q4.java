class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;

    public Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0.0;
        this.totalAmt = 0.0;
    }

    public Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
        calcAmt();
    }

    public Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        calcAmt();
    }

    public Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        calcAmt();
    }

    void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time + " years");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Total Amount: " + totalAmt);
    }

      void calcAmt() {
        this.totalAmt = principal + (principal * rate * time) / 100;
    }
}

// Optional

public class Q4 {
    public static void main(String[] args) {
        Deposit deposit1 = new Deposit(10000, 5, 8.5);

        Deposit deposit2 = new Deposit(20000, 2);

        Deposit deposit3 = new Deposit(5000, 10.0);

        System.out.println("Deposit 1:");
        deposit1.display();

        System.out.println("\nDeposit 2:");
        deposit2.display();

        System.out.println("\nDeposit 3:");
        deposit3.display();
    }
}

/*
 *  Output:
 *      Deposit 1:
 *      Principal: 10000
 *      Time: 5 years
 *      Rate: 8.5%
 *      Total Amount: 14250.0
 *
 *      Deposit 2:
 *      Principal: 20000
 *      Time: 2 years
 *      Rate: 0.0%
 *      Total Amount: 20000.0
 *
 *      Deposit 3:
 *      Principal: 5000
 *      Time: 0 years
 *      Rate: 10.0%
 *      Total Amount: 5000.0
 */