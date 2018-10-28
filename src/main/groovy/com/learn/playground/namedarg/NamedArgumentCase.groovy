package com.learn.playground.namedarg

def sum(int first, int second) {
    first + second
}

assert sum(1, 1) == 2
// Methods can also be called with named arguments. They need to receive the parameters as a map.
def sumNamed(Map args) {
    args.first + args.second
}
assert sumNamed(first: 1, second: 1) == 2
