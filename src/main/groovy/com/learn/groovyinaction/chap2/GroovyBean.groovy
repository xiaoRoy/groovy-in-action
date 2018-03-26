package com.learn.groovyinaction.chap2

def groovyBook = new BookBean()

groovyBook.setTitle("Groovy In Action")
assert "Groovy In Action" == groovyBook.getTitle()

groovyBook.title = "Groovy In Action 2nd"
assert  "Groovy In Action 2nd" == groovyBook.getTitle()
