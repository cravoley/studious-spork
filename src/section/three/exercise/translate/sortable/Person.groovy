package section.three.exercise.translate.sortable

import groovy.transform.Immutable
import groovy.transform.Sortable
import groovy.transform.ToString

/**
 * Created by cravo on 31/08/2016.
 */
@Immutable
@ToString
@Sortable
class Person {
    String first;
    String last;
    Date dob;
}
