package com.learn.tutorial.closure

class Enclosing {

    void thisRun () {
        def whatIsThisObject = { getThisObject() }
        assert whatIsThisObject() == this
        def whatIsThis = { this }
        assert whatIsThis() == this
    }

    void ownerRun () {
        def whatIsOwnerMethod = { getOwner() }
        assert whatIsOwnerMethod.call() == this
        def whatIsOwner = { owner }
        assert whatIsOwner() == this
    }

    void delegateRun () {
        def closureA = { getDelegate() }
        def closureB = { delegate }
        assert closureA() == closureB.call()
        assert closureA() == this
        def enclosed = { { -> delegate }.call() }
        assert enclosed() == enclosed
    }
}
