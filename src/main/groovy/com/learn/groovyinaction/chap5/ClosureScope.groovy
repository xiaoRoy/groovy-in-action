package com.learn.groovyinaction.chap5

def count = 0
10.times {
    count ++
}
assert count == 10

Host host = new Host()
def closure = host.generate('param')
def contexts = closure()
assert contexts[0] == host
assert contexts[1, 2] == ['prop', 'method']
assert contexts[3, 4] == ['local', 'param']
assert closure.thisObject == host
assert closure.owner == host
assert closure.delegate == host
assert closure.resolveStrategy == Closure.OWNER_FIRST
