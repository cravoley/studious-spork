package section.six.closure.exercises

@Grab(group = 'org.codehaus.gpars', module = 'gpars', version = '1.0.0')
import groovyx.gpars.GParsPool

/**
 * Created by cravo on 07/09/2016.
 */


List nums = [1, 42, 3, 4, 5, 91, 123, 14];
nums.each { println it };
nums.each { number -> println "${number} is equal to it" };
nums.eachWithIndex { int entry, int key -> println "Key: ${key} - ${entry}" };


GParsPool.withPool {
    List strings = ["123", "111", "asd", "dawdaw", "adwlawd"];
    strings.eachParallel { println it };
    nums.eachWithIndexParallel { int entry, int key -> println "Key: ${key} - ${entry}" };
}