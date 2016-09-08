package section.six.closure


def doSomething(String msg, Closure action) {
    if (msg)
        return action(msg);
    else
        return action();
}

def doSomething(Closure action) {
    return doSomething(null, action);
}


def clos = {
    println "Some action - ${it}";
}

doSomething("Action executed", clos);
doSomething("Action executed 2") { String msg ->
    println "This '${msg}' was send by ${delegate.class.name}";
}


def defaultValued = { String msg = "Default" ->
    println "This '${msg}' was send by ${delegate.class.name}";
};

doSomething("Action executed 3", defaultValued);
defaultValued();
println "Escape";
doSomething(defaultValued);