package com.ooooo.chapter5

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */

def what = new StringBuilder("fence")
def text = "The cow jumped over $what"
println text

what.replace(0, 5, "moon")

println text


stocks = [Apple: 663.01, Microsoft: 30.95]
def quote = "Today ${-> company} stock closed at ${-> price}"
stocks.forEach { k, v ->
  company = k
  price = v
  println quote
}