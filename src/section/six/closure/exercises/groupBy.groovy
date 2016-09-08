package section.six.closure.exercises

/**
 * Created by cravo on 07/09/2016.
 */


List nums = [1, 42, 3, 4, 42, 5, 91, 42, 123, 14];
List evenNumbers = [2, 4, 42, 42, 6, 92, 42, 1234, 14];

println nums.groupBy { it % 2; };
println evenNumbers.groupBy({ it % 2; }, { it / 2 });

