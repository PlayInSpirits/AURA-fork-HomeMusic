package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oy2 extends uv {
    public final long p;
    public final ArrayList q;
    public final ArrayList r;

    public oy2(int r2, long r3) {
        super(r2, 2);
        this.p = r3;
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public final oy2 r(int r5) {
        ArrayList r4 = this.r;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        oy2 r2 = (oy2) r4.get(r1);
        if (r2.o == r5) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    public final py2 s(int r5) {
        ArrayList r4 = this.q;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        py2 r2 = (py2) r4.get(r1);
        if (r2.o == r5) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    @Override // defpackage.uv
    public final String toString() {
        return uv.c(this.o) + " leaves: " + Arrays.toString(this.q.toArray()) + " containers: " + Arrays.toString(this.r.toArray());
    }
}
