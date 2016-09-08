package section.four.exercise

/**
 * Created by cravo on 31/08/2016.
 */
class Account {
    BigDecimal balance;
    String type;

    Account() {
        balance = 0;
    }


    void deposit(BigDecimal value) {
        this.balance += value;
    }

    void withdraw(BigDecimal value) {
        if (this.balance >= value) {
            this.balance -= value;
            return;
        }
        throw RuntimeException("Not enough balance available");
    }

    BigDecimal plus(Account other) {
        return this.balance + other.balance;
    }

    String toString() {
        return balance;
    }
}

Account checking = new Account(type: "Checking")
checking.deposit(100.00)
Account savings = new Account(type: "Savings")
savings.deposit(50.00)

println checking;
println savings;
println checking + savings;
