package com.learn.tutorial.closure

class EnclosedInInnerClass {

    class Inner {
        Closure closureThis = { this }
        Closure closureOwner = { owner }
    }

    void thisRun () {
        Inner inner = new Inner()
        assert inner.closureThis() == inner
    }

    void ownerRun(){
        Inner inner = new Inner()
        assert inner.closureOwner() == inner
    }
}
