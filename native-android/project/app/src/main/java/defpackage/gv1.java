package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 implements ci0 {
    public final ci0 n;
    public final int o;
    public final er3 p;
    public final byte[] q;
    public int r;

    public gv1(ci0 r3, int r4, er3 r5) {
        if (r4 <= 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        this.n = r3;
        this.o = r4;
        this.p = r5;
        this.q = new byte[1];
        this.r = r4;
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.ci0
    public final long b(ii0 r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ci0
    public final void c(rw4 r1) {
        r1.getClass();
        this.n.c(r1);
    }

    @Override // defpackage.ci0
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] r15, int r16, int r17) {
        int r0 = this.r;
        ci0 r1 = this.n;
        if (r0 != 0) goto L28;
        byte[] r2 = this.q;
        int r3 = 0;
        if (r1.read(r2, 0, 1) == (-1)) goto L14;
        int r4 = (r2[0] & 255) << 4;
        if (r4 == 0) goto L27;
        byte[] r5 = new byte[r4];
        int r6 = r4;
    L11:
        if (r6 <= 0) goto L16;
        int r7 = r1.read(r5, r3, r6);
        if (r7 == (-1)) goto L14;
        r3 = r3 + r7;
        r6 = r6 - r7;
    L16:
        if (r4 <= 0) goto L20;
        if (r5[r4 - 1] != 0) goto L20;
        r4 = r4 - 1;
    L20:
        if (r4 <= 0) goto L27;
        be3 r8 = new be3(r4, r5);
        er3 r9 = this.p;
        if (r9.l == true) goto L25;
        long r10 = r9.i;
    L24:
        long r11 = r10;
        int r12 = r8.a();
        wv4 r13 = r9.k;
        r13.getClass();
        r13.e(r12, r8);
        r13.a(r11, 1, r12, 0, null);
        r9.l = true;
        goto L27
    L25:
        r10 = Math.max(r9.m.y(true), r9.i);
    L27:
        this.r = this.o;
    L14:
        return -1;
    L28:
        int r18 = r1.read(r15, r16, Math.min(this.r, r17));
        if (r18 == (-1)) goto L31;
        this.r -= r18;
    L31:
        return r18;
    }
}
