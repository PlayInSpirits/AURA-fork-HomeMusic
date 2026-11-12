package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn1 extends p44 {
    public final Map H;
    public ow0 I;

    public kn1(n9 r1, ww0 r2, sw0 r3, Map r4) {
        super(r1, r2, r3);
        this.H = r4;
    }

    @Override // defpackage.p44
    public final tb1 m(tb1 r11) {
        ow0 r0 = this.I;
        if (r0 != null) goto L6;
        r0 = r11.r;
    L6:
        if (r0 == null) goto L10;
        ow0 r1 = (ow0) this.H.get(r0.p);
        if (r1 == null) goto L10;
        r0 = r1;
    L10:
        qv2 r2 = r11.l;
        qv2 r3 = null;
        if (r2 != null) goto L13;
    L12:
        r2 = r3;
    L38:
        if (r0 == r11.r) goto L40;
    L41:
        sb1 r12 = r11.a();
        r12.q = r0;
        r12.k = r2;
        r11 = new tb1(r12);
    L43:
        return super.m(r11);
    L40:
        if (r2 == r11.l) goto L43;
    L13:
        pv2[] r4 = r2.a;
        int r5 = r4.length;
        int r6 = 0;
        int r7 = 0;
    L15:
        if (r7 >= r5) goto L22;
        pv2 r8 = r4[r7];
        if ((r8 instanceof hq3) == false) goto L21;
        if ("com.apple.streaming.transportStreamTimestamp".equals(((hq3) r8).b) == false) goto L21;
    L23:
        if (r7 == (-1)) goto L38;
        if (r5 == 1) goto L12;
        pv2[] r9 = new pv2[r5 - 1];
    L29:
        if (r6 >= r5) goto L36;
        if (r6 == r7) goto L35;
        if (r6 >= r7) goto L33;
        int r10 = r6;
    L34:
        r9[r10] = r4[r6];
        goto L35
    L33:
        r10 = r6 - 1;
    L35:
        r6 = r6 + 1;
        goto L29
    L36:
        r3 = new qv2(r9);
    L21:
        r7 = r7 + 1;
        goto L15
    L22:
        r7 = -1;
        goto L23
    }
}
