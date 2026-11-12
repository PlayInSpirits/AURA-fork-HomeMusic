package defpackage;

import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 implements Closeable {
    public final String n;
    public final long o;
    public final ArrayList p;
    public final /* synthetic */ jr0 q;

    public fr0(jr0 r1, String r2, long r3, ArrayList r5, long[] r6) {
        r2.getClass();
        r6.getClass();
        this.q = r1;
        this.n = r2;
        this.o = r3;
        this.p = r5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList r3 = this.p;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        xe5.b((ej4) r2);
        goto L3
    }
}
