package section.six.closure.exercises

/**
 * Created by cravo on 07/09/2016.
 */


def multiParams = { p1, p2, p3 ->
    println "Got parameters ${p1}, ${p2}, ${p3}";
}

multiParams("arg1", "arg2", "arg3");
def firstCurry = multiParams.curry("STATIC PARAMETER");
firstCurry("arg1", "arg2");
def lastCurry = multiParams.rcurry("LAST PARAMETER");
lastCurry("arg1", "arg2");

def nCurry = multiParams.ncurry(1, "Middle");
nCurry("arg1", "arg2");