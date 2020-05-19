package JavaCode;

public class  DevideTwoInt {
    //dont use division, multiplication
    public int divide(int dividend, int divisor) {

        //initialize quotient to 0
        int quotient = 0;

        //Identify if the result needs to be negative or not.
        boolean isResultNegative = false;
        if((dividend < 0 && divisor > 0) || (dividend >0 && divisor < 0)){
            isResultNegative = true;
        }

        //Make both divisor and dividend non negative longs.
        //This is important because we want to hancle everything unsigned.
        //we use longs to work around integer limits.
        //for example you cant ocnvert -2e31 to positive while being an integer.
        long dividendAbs = Math.abs((long)dividend);
        long divisorAbs = Math.abs((long)divisor);


        //Handle edge cases
        //if divisor is 1, then check if result needs to be negative,
        if (divisorAbs == 1) {
            //if result needs to be negative, then just return negative number.
            if (isResultNegative) {
                return (int) -dividendAbs;
            } else {
                //in case the positive 'int' quotient we need to return is not in integer limits, then return the largest int.
                if (dividendAbs >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }else{
                    //otherwise return the positive int quotient.
                    return (int) dividendAbs;
                }
            }
        }

        long divisorTracker = 0;


        //Identify howmany times divisor needs to add up to itself to get closest possible to dividend.
        while((divisorTracker + divisorAbs) <= dividendAbs){
            divisorTracker = divisorTracker + divisorAbs;
            quotient++;//everytime divisor adds up to iself, increment quotient.
        }

        //edgecase check, again if the positive 'int' quotient we need to return is not in integer limits, then return the largest int.
        if (quotient <= Integer.MIN_VALUE || quotient >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }


        return isResultNegative ?  -(quotient) : quotient;
    }
}
