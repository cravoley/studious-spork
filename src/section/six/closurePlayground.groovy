package section.six

List nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

nums.each {println it};

println nums.collect {it + 1};
