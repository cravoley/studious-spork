package section.seven


// boolean
assert true;
assert !false;


// Matcher
assert 'a' =~ /a/;
assert 'A' =~ /(?im)a/;
assert 'A' !=~ /(?im)b/;
assert !('A' =~ /(?im)b/);

// Collection
assert [1];
assert [1,23,4,24];
assert ["123","123","2q3"];
assert ![];
def empty = [];
assert !empty;

// Map
assert [1:23];
assert ![:];
def emptymap = [:];
assert !empty;

// Number
assert 1;
assert 1.23;
assert !0;
assert !(0);
assert 1+2;

// None of the above (NOTA)
assert new Object();
assert !null;
assert !(null);
def ob;
assert !ob;