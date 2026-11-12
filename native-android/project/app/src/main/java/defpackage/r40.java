package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r40 extends gb {
    public static int k0(Iterable r1, int r2) {
        r1.getClass();
        if ((r1 instanceof Collection) == true) goto L5;
        return r2;
    L5:
        return ((Collection) r1).size();
    }
}
