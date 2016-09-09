package section.nine.metaclasses

/**
 * Created by cravo on 09/09/2016.
 */
class MissingProperties {
    String prop1 = "Hey";

//    @Override
//    def getProperty(String property) {
//        println "Has? ${property} ${hasProperty(property)}";
//        if (hasProperty(property)) return metaClass.getProperty(this, property);
//        else return "Not Found";
//    }

    def myMethod() {
        return "This is a method";
    }

    def propertyMissing(String name) {
        println "missing ${name}";
    }

    @Override
    Object invokeMethod(String name, Object args) {
        println "Invoking $name with $args";
//        return super.invokeMethod(name, args)
    }

//    def methodMissing(String name, def args) {
//        println "Unable to find a method called ${name} with args: ${args}";
//    }
}

// same as declaring the method inside the class
MissingPropertyException.metaClass.methodMissing = { String name, def args ->
    println "Unable to find a method called ${name} with args: ${args}";
}

println new MissingProperties().prop1;
println new MissingProperties().prop2;
println new MissingProperties().myMethod();
println new MissingProperties().myInexistentMethod();
println new MissingProperties().myInexistentMethod("awd", [1, 23, 123]);
