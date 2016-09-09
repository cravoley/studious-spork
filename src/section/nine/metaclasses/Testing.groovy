package section.nine.metaclasses

import java.text.NumberFormat

/**
 * Created by cravo on 09/09/2016.
 */

def exchangeRates = ['GBP':0.501882, 'EUR':0.630159,
                     'CAD':1.0127, 'JPY':105.87] // (7/2/2008)

BigDecimal.metaClass.methodMissing = { String methodName, args ->
    println "method missing called"

    def cachedMethod = { Object[] cmArgs ->
        conversionType = methodName[2..-1]
        conversionRate = exchangeRates[conversionType]

        if(conversionRate){
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US)
            nf.setCurrency(Currency.getInstance(conversionType))

            return nf.format(delegate * conversionRate)
        }

        "No conversion for USD to ${conversionType}"
    }

    BigDecimal.metaClass."${methodName}" = cachedMethod

    return cachedMethod(args)
}

println 2500.00.inJPY()
println 2500.00.inGBP()
println 2500.00.inGBP()