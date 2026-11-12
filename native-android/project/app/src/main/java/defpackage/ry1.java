package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ ry1(gx3 r2, hy2 r3, e74 r4, ey2 r5) {
        this.n = 2;
        this.q = r2;
        this.o = r3;
        this.p = r4;
        this.r = r5;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r17) {
        int r1 = this.n;
        j15 r3 = j15.a;
        int r4 = 0;
        Object r5 = this.o;
        Object r6 = this.r;
        Object r7 = this.q;
        Object r0 = this.p;
        switch(r1) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        Context r2 = (Context) r0;
        Uri r8 = (Uri) r7;
        ((yr0) r17).getClass();
        wq4 r9 = new i73((b13) r5, 0);
        vz3 r10 = a.c(r2).g().N(r8).G(wg0.a(8, r2, (String) r6));
        r10.getClass();
        vz3 r11 = xt3.a(r10, r8);
        r11.getClass();
        r11.J(r9, null, r11, fh0.g);
        return new vy1(2, r2, r9);
    L6:
        gx3 r12 = (gx3) r7;
        hy2 r13 = (hy2) r5;
        e74 r14 = (e74) r0;
        ey2 r15 = (ey2) r6;
        vd r16 = (vd) r17;
        float r18 = ((Number) r16.e.getValue()).floatValue() - r12.n;
        if (h12.b(r18) == true) goto L13;
        if (h12.b(r18 - r13.G(r14, r18)) == true) goto L11;
        r16.a();
    L15:
        return r3;
    L11:
        r12.n += r18;
    L13:
        if (((Boolean) r15.invoke(Float.valueOf(r12.n))).booleanValue() == false) goto L15;
        r16.a();
        goto L15
    L16:
        q82 r19 = (q82) r5;
        yr0 r20 = (yr0) r17;
        r19.c = new ll((c82) r0, (kn4) r7, (wp3) r6);
        return new a82(1, r19);
    L18:
        ty1 r21 = (ty1) r0;
        gx3 r22 = (gx3) r7;
        we0 r23 = (we0) r6;
        long r24 = ((Long) r17).longValue();
        kl4 r25 = (kl4) ((b13) r5).getValue();
        if (r25 == null) goto L21;
        long r110 = ((Number) r25.getValue()).longValue();
    L22:
        long r111 = r21.c;
        f13 r26 = r21.a;
        if (r111 != Long.MIN_VALUE) goto L25;
    L27:
        r21.c = r24;
        Object[] r27 = r26.n;
        int r28 = r26.p;
        int r29 = 0;
    L28:
        if (r29 >= r28) goto L30;
        ((qy1) r27[r29]).s = true;
        r29 = r29 + 1;
        goto L28
    L30:
        r22.n = j51.v(r23.e());
    L31:
        float r30 = r22.n;
        if (r30 != 0.0f) goto L36;
        Object[] r31 = r26.n;
        int r32 = r26.p;
    L34:
        if (r4 >= r32) goto L49;
        qy1 r33 = (qy1) r31[r4];
        r33.p.setValue(r33.q.c);
        r33.s = true;
        r4 = r4 + 1;
    L49:
        return r3;
    L36:
        long r34 = (long) ((r110 - r21.c) / r30);
        Object[] r35 = r26.n;
        int r36 = r26.p;
        boolean r37 = true;
        int r38 = 0;
    L37:
        if (r38 >= r36) goto L48;
        qy1 r112 = (qy1) r35[r38];
        if (r112.r == true) goto L45;
        r112.u.b.setValue(Boolean.FALSE);
        if (r112.s == false) goto L43;
        r112.s = false;
        r112.t = r34;
    L43:
        long r113 = r34 - r112.t;
        r112.p.setValue(r112.q.f(r113));
        r112.r = r112.q.e(r113);
    L45:
        if (r112.r == true) goto L47;
        r37 = false;
    L47:
        r38 = r38 + 1;
        goto L37
    L48:
        r21.d.setValue(Boolean.valueOf(!r37));
        goto L49
    L25:
        if (r22.n != j51.v(r23.e())) goto L27;
    L21:
        r110 = r24;
        goto L22
    }

    public /* synthetic */ ry1(Context r2, Uri r3, String r4, b13 r5) {
        this.n = 3;
        this.p = r2;
        this.q = r3;
        this.r = r4;
        this.o = r5;
    }

    public /* synthetic */ ry1(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }
}
