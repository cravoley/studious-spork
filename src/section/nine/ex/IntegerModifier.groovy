package section.nine.ex

/**
 * Created by cravo on 09/09/2016.
 */


try {
    2.timesTwo();
    assert false;
} catch (Exception e) {
    assert true;
}

use (IntegerCategory){
    assert 2.timesTwo() == 4;
    assert 4.timesTwo() == 8;
    println 22.timesTwo();
}

try {
    2.timesTwo();
    assert false;
} catch (Exception e) {
    assert true;
}

Integer.metaClass.timesTwo { ->
    delegate * 2;
}

try {
    2.timesTwo();
} catch (Exception e) {
    assert false;
}

println 2.timesTwo();
println 4.timesTwo();
