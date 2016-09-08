package section.six.closure

/**
 * Created by cravo on 07/09/2016.
 */
class ScopeDemo {


    Closure outerClosure = {
        println this.class.name;
        println owner.class.name;
        println delegate.class.name;
        Closure nestedClosure = {
            println this.class.name;
            println owner.class.name;
            println delegate.class.name;
        }
        nestedClosure();
    }

}

