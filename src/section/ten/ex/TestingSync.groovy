package section.ten.ex

import groovy.transform.Synchronized

/**
 * Created by cravo on 12/09/2016.
 */
class Util {
    private counter = 0

    private def list = ['Groovy']

    private Object listLock = new Object[0]

    @Synchronized
    void workOnCounter() {
        println "counter";
        assert 0 == counter
        counter++
        assert 1 == counter
        counter --
        assert 0 == counter
        println "//counter";
    }

    @Synchronized
    void workOnList() {
        println "list";
        assert 'Groovy' == list[0]
        list << 'Grails'
        assert 2 == list.size()
        list = list - 'Grails'
        assert 'Groovy' == list[0]
        println "//list";
    }
}

def util = new Util()
def tc1 = Thread.start {
    100.times {
        util.workOnCounter()
        sleep 20
        util.workOnList()
        sleep 10
    }
}
def tc2 = Thread.start {
    100.times {
        util.workOnCounter()
        sleep 10
        util.workOnList()
        sleep 15
    }
}
tc1.join()
tc2.join()