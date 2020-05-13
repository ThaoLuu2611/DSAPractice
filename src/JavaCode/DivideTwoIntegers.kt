package JavaCode

class DivideTwoIntegers{
    fun divide (dividend: Int, divisor: Int): Int {
        var isNegative:Boolean = false
        if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
            isNegative = true;
        var dividendAbs: Long = Math.abs(dividend.toLong());
        var divisorAbs: Long = Math.abs(divisor.toLong());
        if(divisorAbs == 1.toLong()){
            if(isNegative)
                return -dividendAbs.toInt();
            else{
                if(dividendAbs >= Int.MAX_VALUE)
                    return Int.MAX_VALUE;
                else
                    return dividendAbs.toInt();
            }
        }
        var quotion = 1;
        var result = quotion;5
        var track = divisorAbs;
        while(track + track <= dividendAbs){
            track += track;
            quotion += quotion;
            result += quotion;
            if(track + track > dividendAbs){
                if(dividendAbs - track >= divisorAbs){
                    dividendAbs = dividendAbs - track;
                    track = divisorAbs;
                    quotion = 1;
                    result += quotion;
                }
                else
                    break;
            }
        }

        return if(isNegative)  -result else result;
    }
}

