package com.learn.tutorial.closure

def addition = { one, another -> one + another }
assert addition(1, 1) == 2
assert addition('1', '1') == '11'

def greeting = { "Hello, $it" }
assert greeting("Smith") == 'Hello, Smith'

def emptyParameter = { -> 'Hello, Groovy'}
assert emptyParameter() == 'Hello, Groovy'

def concatA = { String... args -> args.join('')}
assert concatA('abc', 'def') == 'abcdef'
def concatB = { String[] args -> args.join('') }
assert concatB('abc', 'def') == 'abcdef'
def multiConcat = { int multiple, String... args -> args.join('') * multiple }
assert multiConcat(2, 'abc', 'def') == 'abcdefabcdef'
