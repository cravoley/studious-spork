package section.six.closure.exercises

/**
 * Created by cravo on 07/09/2016.
 */


Map simpleMap = [1: "awd", 2: "ddd", 3: "awdawd"];
simpleMap.each { kv -> println kv };
simpleMap.each { k,v-> println "$k - $v - $k$v" };
