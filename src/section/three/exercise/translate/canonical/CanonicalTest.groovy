package section.three.exercise.translate.canonical

import groovy.transform.Canonical

/**
 * Created by cravo on 31/08/2016.
 */
@Canonical
class Customer {
    String first;
    String last;
    Date d;
}

c1 = new Customer("Valdo", "Raya");
c2 = new Customer("Valdo", "Raya");

println new Customer();
println new Customer("valdo");
println new Customer("Valdo", "Raya");
println new Customer("Valdo", "Raya", new Date());

assert c1 == c2

if(c1 == c2) println "equals";
