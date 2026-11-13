package io.sigpipe.jbsdiff;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class InvalidHeaderException extends Exception {
    public InvalidHeaderException(java.lang.String a0) {
        super(a0);
    }

    public InvalidHeaderException(int i, String str) {
        super("Invalid header field; " + str + " = " + i);
    }

    public InvalidHeaderException() {
    }
}
