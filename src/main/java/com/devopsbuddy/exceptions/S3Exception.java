package com.devopsbuddy.exceptions;

/**
 * Created by rjeshg on 1/28/17.
 */
public class S3Exception extends RuntimeException {

    public S3Exception(Throwable e) {
        super(e);
    }

    public S3Exception(String s) {
        super(s);
    }
}
