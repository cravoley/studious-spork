package section.seven.ex

import java.security.InvalidParameterException


def acc = new Account();
println acc.balance;
acc.deposit(2);
println acc.balance;
try {
    acc.deposit(-1);
} catch (InvalidParameterException e) {
    println "Invalid amount";
} finally{
    println acc.balance;
}

acc.deposit([1, 44, 23]);
println acc.balance;
