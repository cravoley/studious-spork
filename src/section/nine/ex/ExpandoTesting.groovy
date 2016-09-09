package section.nine.ex

/**
 * Created by cravo on 09/09/2016.
 */
Expando devExpando = new Expando();

devExpando.name = "Valdo Raya";
println devExpando.name;


devExpando.getAnotherName = { -> name };
println(devExpando.getAnotherName());
