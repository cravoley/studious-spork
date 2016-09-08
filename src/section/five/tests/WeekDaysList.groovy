package section.five.tests

/**
 * Created by cravo on 07/09/2016.
 */

List weekDays = ["Sunday", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
println weekDays;

println weekDays.size();
//weekDays = weekDays - "Sat";
def sat = weekDays.pop();
println weekDays;

weekDays << sat;
println weekDays;


println weekDays[3];
