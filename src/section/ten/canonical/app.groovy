package section.ten.canonical

/**
 * Created by cravo on 09/09/2016.
 */
def p1 = new Person("Valod", "Raya", "cravoley@some.com");
def p2 = new Person("Valod", "Raya", "cravoley@some.com");
def p3 = new Person("Valod", "Raya3", "cravoley@some.com");

assert p1 == p2;
//assert p1 != p3;
//assert p2 != p3;
println p2;
