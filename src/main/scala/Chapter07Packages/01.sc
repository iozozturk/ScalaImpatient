package com {
package ismet {
object OtherUtils {
  def printOther() = {
    println("printed other")
  }
}

package utils {

object SomeUtils {

  def printSome() = {
    println("print called")
    OtherUtils.printOther()
  }

}

}

}

}

package com.ismet.utils {

object chainedPackage {
  def printThat() = {
    com.ismet.OtherUtils.printSome()
  }
}

}