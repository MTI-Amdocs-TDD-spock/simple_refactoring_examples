package examples;

import java.util.Random;

class ConsolidateConditionalExpressionAfter{
    double disabilityAmount() {
        if (isNotEligableForDisability()) {
            return 0;
        }
        // compute the disability amount
        int low = 1;
        int high = 100;

        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return result;
    }

    private boolean isNotEligableForDisability() {
        return Math.random() < 0.5;
    }
}
