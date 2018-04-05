package com.learn.groovyinaction.chap3

def sql = """
select *
from Student
where age >= 15
"""

def price = '5.32$'
assert price == "5.32\$"

def you = "You"
def yours = "Yours"
def line = "You $you and Yours $yours"
assert line instanceof GString
assert line.strings[0] == "You "
assert line.values[0] == "You"
