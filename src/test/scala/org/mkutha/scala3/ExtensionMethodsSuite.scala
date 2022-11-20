package org.mkuthan.scala3

class ExtensionMethodsSuite extends munit.FunSuite {
  import ExtensionMethods._

  test("Extension method - to snake case") {
    val s = "FooBarBaz"
    assertEquals(s.toSnakeCase, "foo_bar_baz")
    assertEquals(s.toSnakeCase, toSnakeCase(s))
  }

  test("Extension method - to kebab case") {
    val s = "FooBarBaz"
    assertEquals(s.toKebabCase, "foo-bar-baz")
    assertEquals(s.toKebabCase, toKebabCase(s))
  }

  test("Generic extension - second element of numeric list") {
    val xs = List(1, 2, 3)
    assertEquals(xs.second, 2)
  }

  test("Generic extension - second element of string list") {
    val xs = List("a", "b", "c")
    assertEquals(xs.second, "b")
  }

  test("Extension with type constraint - add ints") {
    val intValue = 1

    assertEquals(intValue.add(2), 3)
  }

  test("Extension with type constraint - add floats") {
    val floatValue = 1.2f

    assertEquals(floatValue.add(2.2f), 3.4f)
  }

  test("Extension with type parameter - sumBy") {
    val list = List("a", "bb", "ccc")
    println(list.sumBy[Int](_.length))
  }
}
