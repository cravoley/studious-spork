package section.three.exercise.translate.memorize

import groovy.transform.Memoized


class Sum {

    static int sum(int n1, int n2) {
        println "$n1 + $n2";
        return n1 + n2;
    }

    @Memoized
    static int cachedSum(int n1, n2) {
        println "Cached";
        return sum(n1, n2);
    }

}
