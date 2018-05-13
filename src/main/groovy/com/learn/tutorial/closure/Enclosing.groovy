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
}
