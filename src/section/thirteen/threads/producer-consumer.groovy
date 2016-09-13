package section.thirteen.threads

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingDeque
import java.util.concurrent.LinkedBlockingQueue

/**
 * Created by cravo on 13/09/2016.
 */

//BlockingQueue queque = [] as LinkedBlockingQueue;
def queque = [];


Thread.start('push') {
    10.times {
        println "${Thread.currentThread().name}\t: ${it}";
        queque << it;
        sleep 100;
    }
}


Thread.start('pop') {
    sleep 200
    while (queque.size() > 0) {
        println "${Thread.currentThread().name}\t: ${queque.pop()}";
        sleep 200
    }
}
