package com.learn.tutorial.closure

class NestedClosure {

    void thisRun () {
        def outerClosureThis = {
            def innerClosureThis = { this }
            innerClosureThis()
        }
        assert outerClosureThis() == this
    }

    void ownerRun (){
        def outerClosureOwner = {
            def innerClosureOwner = { owner }
            innerClosureOwner()
        }
        assert outerClosureOwner() == outerClosureOwner
    }
}
