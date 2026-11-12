package io.sigpipe.jbsdiff;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class InvalidHeaderException extends Exception {
    public InvalidHeaderException(int r3, String r4) {
        super("Invalid header field; " + r4 + " = " + r3);
    }

    public InvalidHeaderException() {
    }
}
