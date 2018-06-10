package com.learn.groovyinaction.chap7.objectoriented

//intrusive way of applying traits
Entity gina = new Book(id:1, version:1, title:"gina", isbn:"111111")
gina.save()
assert gina.version == 2
