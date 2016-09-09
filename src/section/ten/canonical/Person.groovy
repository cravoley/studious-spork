package section.ten.canonical

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

/**
 * Created by cravo on 09/09/2016.
 */

@Canonical
@EqualsAndHashCode(excludes = ["last"])
class Person {
    String first;
    String last;
    String email;
}
