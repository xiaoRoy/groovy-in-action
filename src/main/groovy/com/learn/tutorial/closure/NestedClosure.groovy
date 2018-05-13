package com.learn.tutorial.closure

class NestedClosure {

    void run(){
        def outerClosure = {
            def innerClosure = { this }
            innerClosure()
        }
        assert outerClosure() == this
    }
}
