package com.learn.groovyinaction.chap6

/*
def input = new File('Not Existed')
assert input.exists(), "File Not Found"
*/

def hostRegex = /\/\/([a-zA-Z0-9-]+(\.[a-zA-Z0-9-])*?)(:|\/)/

assertHost 'http://a.b.c:8080/bla', hostRegex, 'a.b.c'
assertHost 'http://a.b.c/bla', hostRegex, 'a.b.c'
assertHost 'http://127.0.0.1:8080/bla', hostRegex,'127.0.0.1'
assertHost 'http://t-online.de/bla', hostRegex, 't-online.de'
assertHost 'http://T-online.de/bla', hostRegex, 'T-online.de'

def static assertHost (String candidate, String hostRegex, String expected) {
    candidate.eachMatch(hostRegex) {
        assert it[1] == expected
    }
}
/*
* After the inline unit test, we could sure the hostRegex works as expected
* */
