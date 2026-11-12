package defpackage;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg5 {
    public static final SecureRandom a = null;

    static {
        a = new SecureRandom();
    }

    public static String a() {
        byte[] r0 = new byte[16];
        a.nextBytes(r0);
        return Base64.encodeToString(r0, 11);
    }
}
