package com.sudarshan.codecy

import org.scalatest.WordSpec

class CalculatorTest extends WordSpec {

  private[this] val calculator = new Calculator

  "add two integer numbers" should {
    "calculator 10 and 20 resulting to 30 " in {
      val a = 10
      val b = 20

      assert(calculator.add(a, b) === (a+b))
    }
  }
}