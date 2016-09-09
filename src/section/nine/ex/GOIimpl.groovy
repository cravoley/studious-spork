package section.nine.ex

import groovy.transform.ToString

/**
 * Created by cravo on 09/09/2016.
 */
@ToString
class Developer {

    String name;

    def invokeMethod(String name, args) {
        println "Unable to find a method ${name} with args ${args}";
    }

    def getProperty(String name) {
        if (metaClass.hasProperty(this, name)) metaClass.getProperty(this, name);
        else println "Unable to find property ${name}";
    }

    void setProperty(String name, value) {
        if (metaClass.hasProperty(this, name)) {
            metaClass.setProperty(this, name, value);
            return;
        }
        println "Unable to set property ${name} to ${value} because this property doesn't exist";
    }
}

def developer = new Developer()
developer.name = "Valdo Raya";
println developer.name;


developer.anotherName = "Cravoley";
println developer.anotherName;
