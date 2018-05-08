package com.learn.groovyinaction.chap5

class Host {
    def prop = 'prop'

    def method () {
        'method'
    }

    Closure generate (param) {
        def local = 'local'
        def closure = {
            _ -> [this, prop, method(), local, param]
        }
        return closure
    }
}
