package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lg0 {
    public final yw1 a;
    public final long b;
    public final long c;
    public final long d;

    public lg0(long r3, long r5, List r7) {
        this.a = yw1.k(r7);
        this.b = r3;
        this.c = r5;
        long r0 = -9223372036854775807L;
        if (r3 != (-9223372036854775807L)) goto L5;
    L8:
        this.d = r0;
        return;
    L5:
        if (r5 == (-9223372036854775807L)) goto L8;
        r0 = r3 + r5;
        goto L8
    }
}
