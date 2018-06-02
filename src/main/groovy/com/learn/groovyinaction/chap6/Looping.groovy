package com.learn.groovyinaction.chap6

def list = [1, 2, 3]
while (list) {
    list.remove(0)
}
assert list.isEmpty()

while (list.size() < 3) {
    list << list.size() + 1
}
assert list == [1, 2, 3]


def store = ''
for (String character in 'a'..'c') store += character
assert store == 'abc'

store = ''
for (number in [1, 2, 3]) {
    store += number
}
assert store == '123'

store = ''
def title = 'Groovy range index'
for (index in 0..title.size()) {
    store += title[index]
}
assert store == title


store = ''
title = 'groovy iterator'
for (character in title) {
    store += character
}
assert store == title
