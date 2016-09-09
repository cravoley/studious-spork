package section.nine.metaclasses

import groovy.transform.ToString

/**
 * Created by cravo on 09/09/2016.
 */
@ToString
class Developer {
    String name;
    List languages = [];

    def methodMissing(String name, def args) {
        println "Method $name with args $args is missing.";
        if (name.startsWith("code")) {
            String language = name.split("code")[1];
            if (this.languages.contains(language)) {
                def impl = { Object[] mArgs ->
                    println "${this.name} knows how to code in ${language} with args ${mArgs}}";
                    if (mArgs) {
                        if (mArgs[0] instanceof Closure) return mArgs[0]();
                    }
                }
                getMetaClass()."$name" = impl;
                return impl(args);
            }
        }
    }
}

def valdo = new Developer();
valdo.name = "Valdo Raya";
valdo.languages << "Java";
valdo.languages << "Groovy";
valdo.languages << "PHP";
valdo.languages << "Javascript";

valdo.codeJava({ -> println "Coding in groovy" });
valdo.codeJava();
valdo.codeJava({ -> println "Coding in groovy is nice" });
valdo.codeJava({ -> println "Groovy is great" });
valdo.codeJava({ -> println "Groovy is great" });
valdo.codePHP();
