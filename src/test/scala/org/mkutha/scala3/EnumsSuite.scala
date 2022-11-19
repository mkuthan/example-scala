package org.mkuthan.scala3

class EnumsSuite extends munit.FunSuite {

  import org.mkuthan.scala3.Enums.Color

  test("Color values") {
    assertEquals(Seq(Color.Red, Color.Green, Color.Blue), Color.values.toSeq)
  }

  def checkColor(name: String, color: Color, ordinal: Int, hex: String) =
    test(name) {
      assertEquals(color.ordinal, ordinal)
      assertEquals(color.toHex, hex)
    }

  checkColor("Color.Red", Color.Red, 0, "0xFF0000")
  checkColor("Color.Green", Color.Green, 1, "0x00FF00")
  checkColor("Color.Blue", Color.Blue, 2, "0x0000FF")

  def checkValueOfColor(name: String, color: Color) =
    test(name) {
      assertEquals(Color.valueOf(name), color)
    }

  checkValueOfColor("Red", Color.Red)
  checkValueOfColor("Green", Color.Green)
  checkValueOfColor("Blue", Color.Blue)
}
