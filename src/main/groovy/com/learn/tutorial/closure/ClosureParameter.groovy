package com.learn.tutorial.closure

def addition = { one, another -> one + another }
assert addition(1, 1) == 2
assert addition('1', '1') == '11'

def greeting = { "Hello, $it" }
assert greeting("Smith") == 'Hello, Smith'
