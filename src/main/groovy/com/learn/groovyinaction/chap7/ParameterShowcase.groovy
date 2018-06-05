package com.learn.groovyinaction.chap7

class ParameterShowcase {

    def methodParameterUnTyped(arg){
        'UnTyped'
    }

    def methodParameterTyped(String arg){
        'Typed'
    }

    def methodParameterMixed(one, String another){
        'Mixed'
    }

    static main(args){
        def parameterShowcase = new ParameterShowcase()
        assert parameterShowcase.methodParameterUnTyped(1) == 'UnTyped'
        assert parameterShowcase.methodParameterTyped('what') == 'Typed'
        assert parameterShowcase.methodParameterMixed(1, 'what') == 'Mixed'
    }
}
