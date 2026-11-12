package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d83 {
    public final q12 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public d83(q12 r1, int[] r2, String[] r3) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        if (r2.length == r3.length) goto L5;
        kf2.o("Check failed.");
        throw null;
    L5:
        if (r3.length != 0) goto L7;
        boolean r4 = true;
    L8:
        if (r4 == true) goto L10;
        Set r5 = kb4.S(r3[0]);
    L11:
        this.d = r5;
        return;
    L10:
        r5 = z01.n;
        goto L11
    L7:
        r4 = false;
        goto L8
    }
}
