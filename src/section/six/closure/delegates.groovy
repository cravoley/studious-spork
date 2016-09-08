package section.six.closure

/**
 * Created by cravo on 07/09/2016.
 */

def append(String s) {
    println "append() blea bla wdkaw $s";
    return s;
}


def writer = {
    append("oi");
    append("tchau");
//    return delegate.toString();
}
//
//def buffer = new StringBuffer()
//writer.setResolveStrategy(Closure.DELEGATE_FIRST);
//writer.delegate = buffer;
//def writer1 = writer();
//println writer1;
//println writer1.class.name;