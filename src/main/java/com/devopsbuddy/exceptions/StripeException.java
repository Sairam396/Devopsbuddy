package com.devopsbuddy.exceptions;

import com.stripe.exception.AuthenticationException;

/**
 * Created by rjeshg on 1/27/17.
 */
public class StripeException extends RuntimeException {

    public StripeException(Throwable e) {
            super(e);
    }
}
