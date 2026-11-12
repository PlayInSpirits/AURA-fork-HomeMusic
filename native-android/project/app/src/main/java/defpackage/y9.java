package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends vn implements t91 {
    public final qr2 n;
    public final l94 o;
    public final ra p;
    public final yv3 q;
    public final String r;
    public final AutofillId s;
    public final j03 t;
    public boolean u;

    public y9(qr2 r1, l94 r2, ra r3, yv3 r4, String r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        new Rect();
        j3.o(r3);
        hg3 r6 = bu.l(r3);
        if (r6 == null) goto L5;
        AutofillId r7 = tn.f(r6.o);
    L6:
        if (r7 == null) goto L10;
        this.s = r7;
        this.t = new j03();
        return;
    L10:
        throw xa3.l("Required value was null.");
    L5:
        r7 = null;
        goto L6
    }

    @Override // defpackage.t91
    public final void a(ba1 r10, ba1 r11) {
        ra r0 = this.p;
        qr2 r1 = this.n;
        if (r10 == null) goto L11;
        c72 r12 = j51.O(r10);
        if (r12 == null) goto L11;
        e94 r3 = r12.v();
        if (r3 == null) goto L11;
        if (jz4.c(r3) != true) goto L11;
        int r13 = r12.o;
        gm0.u(r1.k(), r0, r13);
    L11:
        if (r11 == null) goto L24;
        c72 r14 = j51.O(r11);
        if (r14 == null) goto L25;
        e94 r15 = r14.v();
        if (r15 != null) goto L17;
        return;
    L17:
        if (jz4.c(r15) != true) goto L27;
        int r16 = r14.o;
        yv3 r9 = this.q;
        c72 r17 = (c72) r9.a.b(r16);
        if (r17 != null) goto L21;
        return;
    L21:
        if (r17.t == (-4)) goto L29;
        ue1 r4 = r9.c;
        int r18 = r9.e(r17);
        long[] r19 = (long[]) r4.p;
        long r5 = r19[r18];
        long r6 = r19[r18 + 1];
        Rect r7 = new Rect((int) (r5 >> 32), (int) r5, (int) (r6 >> 32), (int) r6);
        rg3.n(r1.k(), r0, r16, r7);
        return;
    L29:
        return;
    L27:
        return;
    L25:
        return;
    }
}
