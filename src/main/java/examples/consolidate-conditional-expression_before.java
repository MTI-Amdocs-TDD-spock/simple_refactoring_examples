package examples;

import java.util.Random;

class ConsolidateConditionalExpressionBefore{
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getMonthsDisabled() {
        return monthsDisabled;
    }

    public void setMonthsDisabled(int monthsDisabled) {
        this.monthsDisabled = monthsDisabled;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }

    double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }
        // compute the disability amount
        int low = 1;
        int high = 100;

        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return result;
    }
}
