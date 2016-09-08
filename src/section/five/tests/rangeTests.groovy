package section.five.tests


Range nums = 1..20;
println nums;

Range letters = 'a'..'z';
printcln letters;




enum WEEK_DAYS{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

Range a = WEEK_DAYS.SUNDAY..WEEK_DAYS.THURSDAY;
println a;
println a.size();
println a.from;
println a.to;
assert a.contains(WEEK_DAYS.WEDNESDAY);