package com.learn.groovyinaction.chap7

class MethodShowcase {

    void methodPublicVoid(){

    }

    def methodUntyped(){
        'hi'
    }

    String methodPublicTyped(){
        'hello'
    }

    static methodStatic(){
        'try'
    }

    static main(args){
        def methodShowcase = new MethodShowcase()
        methodShowcase.methodPublicVoid()
        assert methodShowcase.methodUntyped() == 'hi'
        assert methodShowcase.methodPublicTyped() == 'hello'
        assert methodStatic() == 'try'
    }
}
