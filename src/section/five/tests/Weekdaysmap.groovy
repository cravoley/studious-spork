package section.five.tests


Map week = [1: "Sunday", 2: "Mon", 3: "Tue", 4: "Wed", 5: "Thu", 6: "Fri", 7: "Sat"];

println week;
println week.getClass().getName();

println week.size();
for (value in week.values()) {
    println value;
}