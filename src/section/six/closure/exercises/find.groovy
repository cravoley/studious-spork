package section.six.closure.exercises

/**
 * Created by cravo on 07/09/2016.
 */


List nums = [1, 42, 3, 4, 42, 5, 91, 42, 123, 14];
def find = nums.find { return (it == 42); }
println find;
println nums.findAll { return it == 42 };



