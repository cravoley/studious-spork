package section.nine.ex


Developer n = new Developer();
n.name = "Valdo Raya";
n.languages = [];

assert n.languages == null;

n.metaClass.languages = [];
assert n.languages == [];
n.languages << "Java";
n.languages << "Groovy";
n.languages << "Javascript";

assert n.languages.size() == 3;
def toMetaString = { -> "${this.class.getTypeName()} - ${name} - ${languages}" }
n.metaClass.toStringMeta = toMetaString;
println n.toStringMeta();

def developer = new Developer();
developer.name = "My name";
println developer.toStringMeta();

assert developer.toStringMeta() == null;

Developer.metaClass.toStringMeta = toMetaString;
Developer dev2 = new Developer();
dev2.name = "Another dev";

assert dev2.languages == null;
assert dev2.toStringMeta() != null;
println dev2.toStringMeta();



