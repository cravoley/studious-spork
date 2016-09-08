package section.three.exercise.translate.tuple

import groovy.transform.ToString
import groovy.transform.TupleConstructor

/**
 * Created by cravo on 31/08/2016.
 */
@TupleConstructor
@ToString
class Customer {
    String first;
    String last;
    Date d;
}
