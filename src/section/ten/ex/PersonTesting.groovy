package section.ten.ex

import groovy.transform.AutoClone
import groovy.transform.Canonical

/**
 * Created by cravo on 12/09/2016.
 */
@AutoClone
@Canonical
class Person {
    String first;
    String last;
    int age;
}

Person p1 = new Person("Valdo", "Raya", 22);
Person p2 = new Person(first: "Valdo", last: "Raya", age: 22);

assert p1 == p2;
assert !p1.is(p2);
assert p1 == p2.clone();
assert p1 == p1.clone();
assert !p1.is(p1.clone());

println p1.clone();
println p2.clone();

