package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf4 extends cu4 {
    public static final Object q = null;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final gn2 o;
    public final an2 p;

    static {
        q = new Object();
        um2 r0 = new um2();
        xm2 r1 = new xm2();
        List r7 = Collections.EMPTY_LIST;
        gy3 r9 = gy3.r;
        zm2 r12 = new zm2();
        cn2 r2 = cn2.d;
        Uri r3 = Uri.EMPTY;
        if (((Uri) r1.e) != null) goto L5;
    L8:
        boolean r4 = true;
    L9:
        rr2.w(r4);
        if (r3 != null) goto L12;
    L17:
        new wm2(r0);
        new an2(r12);
        do2 r5 = do2.K;
        return;
    L12:
        if (((UUID) r1.d) == null) goto L15;
        ym2 r6 = new ym2(r1);
    L16:
        new bn2(r3, null, r6, null, r7, null, r9, -9223372036854775807L);
        goto L17
    L15:
        r6 = null;
        goto L16
    L5:
        if (((UUID) r1.d) != null) goto L8;
        r4 = false;
        goto L9
    }

    public bf4(long r1, long r3, long r5, long r7, long r9, long r11, boolean r13, boolean r14, boolean r15, y41 r16, gn2 r17, an2 r18) {
        this.e = r1;
        this.f = r3;
        this.g = r5;
        this.h = r7;
        this.i = r9;
        this.j = r11;
        this.k = r13;
        this.l = r14;
        this.m = r15;
        this.n = r16;
        r17.getClass();
        this.o = r17;
        this.p = r18;
    }

    @Override // defpackage.cu4
    public final int b(Object r1) {
        if (q == r1) goto L6;
        return -1;
    L6:
        return 0;
    }

    @Override // defpackage.cu4
    public final zt4 f(int r11, zt4 r12, boolean r13) {
        rr2.q(r11, 1);
        if (r13 == false) goto L6;
        Object r14 = q;
    L5:
        Object r2 = r14;
        long r6 = -this.i;
        r12.getClass();
        z5 r8 = z5.f;
        r12.i(null, r2, 0, this.g, r6, r8, false);
        return r12;
    L6:
        r14 = null;
        goto L5
    }

    @Override // defpackage.cu4
    public final int h() {
        return 1;
    }

    @Override // defpackage.cu4
    public final Object l(int r1) {
        rr2.q(r1, 1);
        return q;
    }

    @Override // defpackage.cu4
    public final bu4 m(int r25, bu4 r26, long r27) {
        rr2.q(r25, 1);
        long r1 = this.j;
        boolean r14 = this.l;
        if (r14 == true) goto L5;
    L14:
        long r16 = r1;
    L15:
        r26.b(bu4.p, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, r14, this.p, r16, this.h, 0, 0, this.i);
        return r26;
    L5:
        if (this.m == true) goto L14;
        if (r27 == 0) goto L14;
        long r3 = this.h;
        if (r3 != (-9223372036854775807L)) goto L11;
    L10:
        r16 = -9223372036854775807L;
        goto L15
    L11:
        r1 = r1 + r27;
        if (r1 <= r3) goto L14;
        goto L14
    }

    @Override // defpackage.cu4
    public final int o() {
        return 1;
    }
}
