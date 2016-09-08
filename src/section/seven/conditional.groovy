package section.seven


def num = 23;
switch (num) {
    case 1:
        println 1;
        break;
//    case Integer:
    case 2:
    case 3:
    case 4:
        println "INte";
        break;
    case 10..20:
        println "Hi";
        break;
    case [21, 22, 23]:
        println "Collection";
        break;
    default:
        println "Def";
        break;
}