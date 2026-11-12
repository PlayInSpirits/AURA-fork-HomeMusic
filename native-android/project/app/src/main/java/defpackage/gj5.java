package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gj5 extends au0 implements Serializable {
    public final MessageDigest G;
    public final int H;
    public final boolean I;
    public final String J;

    public gj5() {
        MessageDigest r0 = MessageDigest.getInstance("SHA-256");     // Catch: NoSuchAlgorithmException -> L10
        this.G = r0;
        this.H = r0.getDigestLength();
        this.J = "Hashing.sha256()";
        r0.clone();     // Catch: CloneNotSupportedException -> L7
        boolean r1 = true;
    L8:
        this.I = r1;
        return;
    L7:
        r1 = false;
    L10:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final String toString() {
        return this.J;
    }
}
