package com.learn.groovyinaction.chap7

class Summer {

    def sumWithDefaults (first, second, third = 0) {
        first + second + third
    }

    def sumWithList (List args) {
        args.inject(0) {
            sum, element -> sum += element
        }
    }

    def sumWithOptionals (first, second, Object[] optionals) {
        first + second + sumWithList(optionals.toList())
    }

    def sumNamed (Map args) {
        ['first', 'second', 'third'].each { args.get(it, 0) }
        args.first + args.second + args.third
    }

    static main (args) {
        def summer = new Summer()

        assert 2 == summer.sumWithDefaults(1, 1)
        assert 3 == summer.sumWithDefaults(1, 1, 1)

        assert 2 == summer.sumWithList([1, 1])
        assert 3 == summer.sumWithList([1, 1, 1])

        assert 2 == summer.sumWithOptionals(1, 1)
        assert 3 == summer.sumWithOptionals(1, 1, 1)

        assert 1 == summer.sumNamed('first':1)
        assert 1 == summer.sumNamed('second':1)
        assert 1 == summer.sumNamed('third':1)
        assert 3 == summer.sumNamed('first':1, 'second':2)
        assert 4 == summer.sumNamed('first':1, 'third':3)
        assert 5 == summer.sumNamed('second':2, 'third':3)
        assert 6 == summer.sumNamed('first':1, 'second':2, 'third':3)
    }
}
