package net.andreinc.jvbe.str;

import net.andreinc.jvbe.str.validators.BlankValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Checks if the string can be a valid credit card number.
 */
@Documented
@Constraint(validatedBy = BlankValidator.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface CC {
    String message() default "{str.creditcard}";
    CreditCardType[] value() default CreditCardType.ALL;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
