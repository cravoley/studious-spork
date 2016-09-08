package section.three.exercise.translate.sortable;

p1 = new Person("Valdo3", "Raya", new Date());
println p1;

p2 = new Person("Valdo3", "Raya2", new Date());
p3 = new Person("Valdo3", "Raya1", new Date());

persons = [p1, p2, p3];

persons.sort();

println(persons);