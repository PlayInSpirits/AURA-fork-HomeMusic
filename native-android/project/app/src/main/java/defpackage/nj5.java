package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj5 {
    public static final Comparator a = null;

    static {
        Object[] r0 = Class.forName(nj5.class.getName().concat("$UnsafeComparator")).getEnumConstants();     // Catch: Throwable -> L5
        Objects.requireNonNull(r0);     // Catch: Throwable -> L5
        Comparator r1 = (Comparator) r0[0];     // Catch: Throwable -> L5
    L6:
        a = r1;
        return;
    L5:
        r1 = mj5.n;
        goto L6
    }
}
