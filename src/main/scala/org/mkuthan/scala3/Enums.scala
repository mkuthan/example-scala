package org.mkuthan.scala3

object Enums {
  enum Color(val rgb: Int):
    case Red extends Color(0xff0000)
    case Green extends Color(0x00ff00)
    case Blue extends Color(0x0000ff)

    def toHex: String = f"0x$rgb%06X"
}
