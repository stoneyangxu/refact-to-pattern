package com.github.stoneyangxu.refacttopattern.creation

import java.util.Date

import org.scalatest.{FunSpec, Matchers}

class LoanSpec extends FunSpec with Matchers {

  describe("Create instance") {
    it("should be create term loan") {
      val commitment = 1
      val riskRating = 2
      val maturity = new Date()
      val termLoan: Loan = Loan.createTermLoan(commitment, riskRating, maturity)
      termLoan should not be(null)
    }

    it("should be create RCTL") {

      val commitment = 1
      val riskRating = 2
      val maturity = new Date()
      val expiry = new Date()

      val loan = new Loan(commitment, riskRating, maturity, expiry)
      loan should not be(null)
    }
  }

}
