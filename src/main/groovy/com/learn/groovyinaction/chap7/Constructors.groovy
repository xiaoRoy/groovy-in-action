package com.learn.groovyinaction.chap7

import org.codehaus.groovy.classgen.Verifier

import java.awt.Dimension

def firstVendor = new Vendor('Apple', 'iPhoneX')
assert firstVendor.name == 'Apple'

def secondVendor = ['Apple', 'iPhoneX'] as Vendor
assert secondVendor.name == 'Apple'

Vendor thirdVendor = ['Apple', 'iPhoneX']
assert thirdVendor.name == 'Apple'

def notVendor = ['Apple', 'iPhoneX']
assert notVendor instanceof List


def firstVendorNamed = new VendorWithNameParameters()
assert firstVendorNamed.name == null
assert firstVendorNamed.product == null

def secondVendorNamed = new VendorWithNameParameters(name: 'Apple')
assert secondVendorNamed.name == 'Apple'
assert secondVendorNamed.product == null

def thirdVendorNamed = new VendorWithNameParameters(product: 'iPhoneX')
assert thirdVendorNamed.name == null
assert thirdVendorNamed.product == 'iPhoneX'

def fourthVendorNamed = new VendorWithNameParameters(name: 'Apple', product: 'iPhoneX')
assert fourthVendorNamed.name == 'Apple'
assert fourthVendorNamed.product == 'iPhoneX'

Dimension area = [200, 100]
assert area.width == 200
assert area.height == 100
