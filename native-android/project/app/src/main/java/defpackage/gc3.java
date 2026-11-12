package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc3 implements xf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ gc3(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.xf1
    public final Object a(Object r10, Object r11, Object r12) {
        int r0 = this.n;
        int r2 = 0;
        Object r3 = this.p;
        Object r9 = this.o;
        switch(r0) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        Spannable r13 = (Spannable) r9;
        lc r4 = (lc) r3;
        ij4 r14 = (ij4) r10;
        int r15 = ((Integer) r11).intValue();
        int r16 = ((Integer) r12).intValue();
        vk0 r5 = r14.f;
        gb1 r6 = r14.c;
        if (r6 != null) goto L7;
        r6 = gb1.p;
    L7:
        eb1 r7 = r14.d;
        if (r7 == null) goto L10;
        r2 = r7.a;
    L10:
        fb1 r17 = r14.e;
        if (r17 == null) goto L13;
        int r18 = r17.a;
    L14:
        mc r8 = (mc) r4.o;
        n05 r19 = ((ia1) r8.r).b(r5, r6, r2, r18);
        if ((r19 instanceof n05) == true) goto L17;
        z05 r20 = new z05(r19, r8.w);
        r8.w = r20;
        Object r110 = r20.q;
        r110.getClass();
        Typeface r111 = (Typeface) r110;
    L18:
        r13.setSpan(new ka1(1, r111), r15, r16, 33);
        return j15.a;
    L17:
        Object r112 = r19.n;
        r112.getClass();
        r111 = (Typeface) r112;
        goto L18
    L13:
        r18 = 65535;
        goto L14
    L20:
        lm0 r21 = (lm0) r9;
        r62 r22 = (r62) r3;
        float r113 = ((Float) r10).floatValue();
        float r114 = ((Float) r11).floatValue();
        float r115 = ((Float) r12).floatValue();
        boolean r1 = xl.A(r21, r113);
        if (r21.m().e != hb3.n) goto L24;
    L29:
        int r23 = r21.m().b;
        if (r23 != 0) goto L32;
        float r24 = 0.0f;
    L33:
        float r25 = r24 - ((int) r24);
        if (Math.abs(r113) >= r21.n.M(400.0f)) goto L37;
    L40:
        if (r2 == 0) goto L42;
        if (r2 != 1) goto L54;
    L53:
        r114 = r115;
    L58:
        return Float.valueOf(r114);
    L54:
        if (r2 == 2) goto L58;
        r114 = 0.0f;
        goto L58
    L42:
        if (Math.abs(r25) <= 0.5f) goto L45;
        if (r1 == false) goto L58;
    L45:
        float r116 = Math.abs(r24);
        oo0 r26 = r21.n;
        dd3 r27 = ed3.a;
        if (r116 < Math.abs(Math.min(r26.M(56.0f), r21.o() / 2.0f) / r21.o())) goto L50;
        if (r1 == false) goto L53;
    L50:
        if (Math.abs(r114) >= Math.abs(r115)) goto L53;
    L37:
        if (r113 <= 0.0f) goto L39;
        r2 = 1;
        goto L40
    L39:
        r2 = 2;
        goto L40
    L32:
        r24 = xl.k(r21) / r23;
        goto L33
    L24:
        if (r22 == r62.n) goto L29;
        if (r1 == true) goto L28;
        r1 = true;
        goto L29
    L28:
        r1 = false;
        goto L29
    }
}
