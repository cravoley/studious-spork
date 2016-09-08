package section.seven.ex

import java.security.InvalidParameterException

/**
 * Created by cravo on 08/09/2016.
 */
class Account {
    BigDecimal balance = 0.0;


    void deposit(Number amount) throws InvalidParameterException {
        if (amount <= 0) throw new InvalidParameterException("Amount to be deposited must be greater than 0");
        balance += amount;
    }

    void deposit(List<Number> values) throws InvalidParameterException {
        if (values) {
            values.each { deposit(it) };
        } else throw new InvalidParameterException("A valid values list must be provided");
    }
}
