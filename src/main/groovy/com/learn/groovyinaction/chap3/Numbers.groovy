package com.learn.groovyinaction.chap3

assert 2 == 2.5.toInteger()
assert 2 == 2.5 as Integer
assert 2 == (Integer) 2.5

assert 3.142d == Math.PI.round(3)
assert 3.141d == Math.PI.trunc(3)

//BigDecimal
assert 1/2 == 0.5

def store = ''

10.times {
    store += 'x'
}
assert  store == 'xxxxxxxxxx'

store = ''
1.upto(5) {
    store += it
}
assert store == '12345'

store = ''
2.downto(-2, {
    store += it + ' '
})
assert store == '2 1 0 -1 -2 '

store = ''
0.step(0.5, 0.1){
    store += it + ' '
}
assert store == '0 0.1 0.2 0.3 0.4 '
