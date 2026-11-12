package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr2 {
    public static final wa4 e = null;
    public static final mi3 f = null;
    public final wa4 a;
    public final mi3 b;
    public final yw1 c;
    public final yw1 d;

    static {
        HashSet r0 = new HashSet();
        gy3 r1 = va4.d;
        int r3 = 0;
    L4:
        if (r3 >= r1.q) goto L6;
        r0.add(new va4(((Integer) r1.get(r3)).intValue()));
        r3 = r3 + 1;
        goto L4
    L6:
        new wa4(r0);
        HashSet r2 = new HashSet();
        gy3 r4 = va4.e;
        int r5 = 0;
    L8:
        if (r5 >= r4.q) goto L10;
        r2.add(new va4(((Integer) r4.get(r5)).intValue()));
        r5 = r5 + 1;
        goto L8
    L10:
        int r6 = 0;
    L12:
        if (r6 >= r1.q) goto L14;
        r2.add(new va4(((Integer) r1.get(r6)).intValue()));
        r6 = r6 + 1;
        goto L12
    L14:
        e = new wa4(r2);
        SparseBooleanArray r7 = new SparseBooleanArray();
        int[] r8 = zg5.p;
        int r9 = r8.length;
        int r10 = 0;
    L16:
        if (r10 >= r9) goto L18;
        int r11 = r8[r10];
        rr2.w(!false);
        r7.append(r11, true);
        r10 = r10 + 1;
        goto L16
    L18:
        rr2.w(!false);
        f = new mi3(new w71(r7));
    }

    public dr2(wa4 r1, mi3 r2, yw1 r3, yw1 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }
}
