package com.github.stoneyangxu.refacttopattern.creation;

import java.util.Date;

public class Loan {

    private double commitment;
    private double outstanding;
    private int riskRating;
    private Date maturity;
    private Date expiry;

    public static Loan createTermLoan(double commitment, int riskRating, Date maturity) {
        return new Loan(commitment, 0, riskRating, maturity, null);
    }

    public Loan(double commitment, int riskRating, Date maturity, Date expiry) {
        this(commitment, 0, riskRating, maturity, expiry);
    }

    public Loan(double commitment, double outstanding, int riskRating, Date maturity, Date expiry) {
        this.commitment = commitment;
        this.outstanding = outstanding;
        this.riskRating = riskRating;
        this.maturity = maturity;
        this.expiry = expiry;
    }
}
