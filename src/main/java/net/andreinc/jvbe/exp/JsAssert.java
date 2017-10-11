package net.andreinc.jvbe.exp;

import net.andreinc.jvbe.exp.validators.JsExpValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Repeatable(JsAsserts.class)
@Documented
@Constraint(validatedBy = JsExpValidator.class)
@Target({ TYPE, METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface JsAssert {
    String message() default "{exp.js}";
    String value() default "true";
    String attributeName() default "_";
    String fromFile() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


