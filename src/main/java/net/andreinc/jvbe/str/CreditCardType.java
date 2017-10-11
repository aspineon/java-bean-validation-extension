package net.andreinc.jvbe.str;

;import org.apache.commons.validator.routines.CreditCardValidator;

public enum CreditCardType {

    AMEX(CreditCardValidator.AMEX),
    DINERS(CreditCardValidator.DINERS),
    DISCOVER(CreditCardValidator.DISCOVER),
    MASTERCARD(CreditCardValidator.MASTERCARD),
    VISA(CreditCardValidator.VISA),
    VPAY(CreditCardValidator.VPAY),
    ALL(
            CreditCardValidator.AMEX +
            CreditCardValidator.DINERS +
            CreditCardValidator.DISCOVER +
            CreditCardValidator.MASTERCARD +
            CreditCardValidator.VISA +
            CreditCardValidator.VPAY
    ),
    GENERIC_CHECK(CreditCardValidator.NONE);

    private Long internalValue;

    CreditCardType(Long internalValue) {
        this.internalValue = internalValue;
    }

    public Long getInternalValue() {
        return internalValue;
    }
}
