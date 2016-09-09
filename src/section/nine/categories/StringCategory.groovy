package section.nine.categories

/**
 * Created by cravo on 09/09/2016.
 */
class StringCategory {
    static def shout(def n){
        if(n instanceof String)
           n.toUpperCase();
        else
            Double.parseDouble(Integer.toString(n))
    }
}
