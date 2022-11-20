package org.mkuthan.scala3

object ExtensionMethods {

  private final val TokensRegex = "/[A-Z]{2,}(?=[A-Z][a-z]+[0-9]*|\b)|[A-Z]?[a-z]+[0-9]*|[A-Z]|[0-9]+/g".r

  extension (s: String)
    def toSnakeCase: String =
      tokenize("_")

    def toKebabCase: String =
      tokenize("-")

    private def tokenize(separator: String): String =
      TokensRegex
        .findAllMatchIn(s)
        .map(_.group(0))
        .map(_.toLowerCase())
        .mkString(separator)

  extension [T](xs: List[T])
    def second: T = xs.tail.head

  extension [T: Numeric](a: T)
    def add(b: T): T =
      val numeric = summon[Numeric[T]]
      numeric.plus(a, b)

  extension [T](xs: List[T])
    def sumBy[U: Numeric](f: T => U): U =
      val num = summon[Numeric[U]]
      xs.foldLeft(num.zero)((acc, b) => num.plus(acc, f(b)))
}
