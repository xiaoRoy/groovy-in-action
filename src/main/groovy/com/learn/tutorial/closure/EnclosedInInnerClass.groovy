package com.learn.tutorial.closure

class EnclosedInInnerClass {

    class Inner {
        Closure closure = { this }
    }

    void run () {
        Inner inner = new Inner()
        assert inner.closure() == inner
    }
}
