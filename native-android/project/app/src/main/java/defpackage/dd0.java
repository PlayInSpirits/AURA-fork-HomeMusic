package defpackage;

import android.content.Context;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ dd0(gd0 r1, b25 r2, s22 r3, e74 r4) {
        this.n = 0;
        this.o = r1;
        this.p = r3;
        this.q = r4;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r15) {
        int r0 = this.n;
        boolean r1 = false;
        j15 r5 = j15.a;
        Object r6 = this.q;
        Object r7 = this.p;
        Object r14 = this.o;
        switch(r0) {
            case 0: goto L68;
            case 1: goto L64;
            case 2: goto L55;
            case 3: goto L27;
            case 4: goto L19;
            case 5: goto L14;
            default: goto L4;
        };
    L4:
        jx3 r8 = (jx3) r7;
        lu2 r9 = (lu2) r6;
        ad2 r16 = (ad2) ((if1) r14).invoke(r15);
        Object r17 = r8.n;
        if (r17 == r16) goto L13;
        if (r17 == null) goto L10;
        ku2 r18 = (ku2) r9.l.b((ad2) r17);
        if (r18 == null) goto L10;
        r18.a.j(r18);
    L10:
        r8.n = r16;
        if (r16 == null) goto L13;
        r9.l(r16, new ht1(new kl3(13, r9), 2));
    L13:
        return r5;
    L14:
        w44 r19 = (w44) r14;
        a54 r10 = (a54) r6;
        yr0 r110 = (yr0) r15;
        w03 r111 = r19.o;
        if (r111.b(r7) == true) goto L17;
        r19.n.remove(r7);
        r111.l(r7, r10);
        return new v44(r19, r7, r10);
    L17:
        nz2.k(r7, " was used multiple times ", "Key ");
        return null;
    L19:
        String r112 = (String) r14;
        Context r11 = (Context) r7;
        b13 r12 = (b13) r6;
        ((yr0) r15).getClass();
        if (r112 != null) goto L22;
    L25:
        r12.setValue(null);
        return new j73();
    L22:
        if (r112.length() == 0) goto L25;
        String r113 = wg0.b(ud3.t(), r112);
        wq4 r114 = new i73(r12, 1);
        vz3 r115 = (vz3) a.c(r11).g().P(r113).e(wg0.b);
        r115.J(r114, null, r115, fh0.g);
        return new vy1(3, r11, r114);
    L27:
        kz2 r13 = (kz2) r7;
        jx3 r20 = (jx3) r6;
        if (((Set) r14).contains(r15) == false) goto L54;
        Object r116 = r13.b.g(r15);
        if (r116 == null) goto L54;
        if ((r116 instanceof x03) == false) goto L50;
        x03 r117 = (x03) r116;
        Object[] r118 = r117.b;
        long[] r119 = r117.a;
        int r2 = r119.length - 2;
        if (r2 < 0) goto L54;
        int r3 = 0;
    L36:
        long r4 = r119[r3];
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L48;
        int r21 = 8 - ((~(r3 - r2)) >>> 31);
        int r22 = 0;
    L39:
        if (r22 >= r21) goto L47;
        if ((255 & r4) >= 128) goto L46;
        y94 r120 = (y94) r118[(r3 << 3) + r22];
        if (r20.n != null) goto L45;
        r20.n = new ArrayList();
    L45:
        ((List) r20.n).add(r120);
    L46:
        r4 = r4 >> 8;
        r22 = r22 + 1;
        goto L39
    L47:
        if (r21 != 8) goto L54;
    L48:
        if (r3 == r2) goto L54;
        r3 = r3 + 1;
        goto L36
    L50:
        y94 r121 = (y94) r116;
        if (r20.n != null) goto L53;
        r20.n = new ArrayList();
    L53:
        ((List) r20.n).add(r121);
    L54:
        return r5;
    L55:
        ey r23 = (ey) r7;
        if1 r24 = (if1) r6;
        ba1 r122 = (ba1) r15;
        if (h12.c(r122, (ba1) r14) == true) goto L83;
        if (h12.c(r122, (ba1) r23.c) == true) goto L62;
        r1 = ((Boolean) r24.invoke(r122)).booleanValue();
        goto L83
    L62:
        kf2.o("Focus search landed at the root.");
        return null;
    L83:
        return Boolean.valueOf(r1);
    L64:
        gx3 r123 = (gx3) r14;
        vd r124 = (vd) r15;
        float r25 = ((Number) r124.e.getValue()).floatValue() - r123.n;
        float r26 = ((c74) r7).a(r25);
        r123.n = ((Number) r124.e.getValue()).floatValue();
        ((gx3) r6).n = ((Number) ((if1) r124.a.p).invoke(r124.f)).floatValue();
        if (Math.abs(r25 - r26) <= 0.5f) goto L67;
        r124.a();
    L67:
        return r5;
    L68:
        gd0 r125 = (gd0) r14;
        s22 r27 = (s22) r7;
        e74 r28 = (e74) r6;
        float r126 = ((Float) r15).floatValue();
        if (r125.D == false) goto L71;
        float r29 = 1.0f;
    L72:
        g74 r127 = r125.C;
        long r30 = r127.f(r127.i(r29 * r126));
        g74 r31 = r28.a;
        float r128 = r127.h(r127.f(r31.d(r31.k, r30, 1))) * r29;
        if (Math.abs(r128) >= Math.abs(r126)) goto L75;
        CancellationException r129 = new CancellationException(xa3.f("Scroll animation cancelled because scroll was not consumed (", r128, " < ", r126, ")"));
        r129.initCause(null);
        r27.f(r129);
    L75:
        return r5;
    L71:
        r29 = -1.0f;
        goto L72
    }

    public /* synthetic */ dd0(gx3 r1, c74 r2, gx3 r3, uk0 r4) {
        this.n = 1;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    public /* synthetic */ dd0(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
