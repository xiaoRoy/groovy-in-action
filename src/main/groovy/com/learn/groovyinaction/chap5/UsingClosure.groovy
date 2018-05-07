package com.learn.groovyinaction.chap5

def adder = { one, another -> return one + another }
assert adder(3, 4) == 7
assert adder.call(3, 4) == 7

def static benchmark (int repeat, Closure worker) {
    def start = System.nanoTime()
    repeat.times(worker)
    def stop = System.nanoTime()
    return stop - start
}

def slow = benchmark(10000) { (int) it / 2 }
def fast = benchmark(10000) { int number -> number.intdiv(2) }
assert fast < slow

def adderB = { one, another = 3 -> one + another }
assert adderB(1) == 4
assert adderB.call(1, 5) == 6


def static numOfParams (Closure closure) {
    closure.maximumNumberOfParameters
}

assert numOfParams(adder) == 2
assert numOfParams { one -> } == 1

def static paramType (Closure closure) {
    closure.getParameterTypes()
}

assert paramType { String text -> } == [String]
assert paramType { Number number, String text -> } == [Number, String]

def mul = { one, another -> one * another }
def twoTimes = mul.curry(2)
assert twoTimes(5) == 10
def twoTimesB = { another -> mul(2, another) }
assert twoTimesB(6) == 12
def twoTimesC = { another -> mul 2, another }
assert twoTimesC.call(7) == 14

def configurator = { format, filter, line -> filter(line) ? format(line) : null }
def appender = { config, append, line ->
    def out = config(line)
    if (out) append(out)
}

def dateFormatter = { line -> "${new Date()}:$line" }
def debugFilter = { line -> line.contains('debug') }
def consoleAppender = { line -> println line }

def defaultConfig = configurator.curry(dateFormatter, debugFilter)
def defaultLog = appender.curry(defaultConfig, consoleAppender)

defaultLog('here is some debug message')
defaultLog('this will not be printed')

def fourTimes = twoTimes >> twoTimes
def eightTimes = fourTimes << twoTimes
assert eightTimes(1) == twoTimes(fourTimes(1))

def fib
fib = { it < 2 ? 1 : fib(it - 1) + fib(it - 2)}
fib = fib.memoize()
assert fib(40) == 165_580_141
