package com.ooooo.chapter2

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def splitName(String fullName) {
  fullName.split(' ')
}


def (firstName, lastName) = splitName("james bond")

println "$firstName, $lastName"