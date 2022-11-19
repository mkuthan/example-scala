package org.mkuthan.scala3

@main def happyNewYear(): Unit =
  println("Happy New Year")

@main def happyBirthday(age: Int, name: String, others: String*): Unit =
  val suffix =
    age % 100 match
      case 11 | 12 | 13 => "th"
      case _ =>
        age % 10 match
          case 1 => "st"
          case 2 => "nd"
          case 3 => "rd"
          case _ => "th"
  val builder = new StringBuilder(s"Happy $age$suffix birthday, $name")
  for other <- others do builder.append(" and ").append(other)
  println(builder.toString)
