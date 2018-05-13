package com.learn.tutorial.closure

class Enclosing {
    void run(){
        def whatIsThisObject = { getThisObject() }
        assert whatIsThisObject() == this
        def whatIsThis = { this }
        assert whatIsThis() == this
    }
}
