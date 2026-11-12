package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w44 implements u44 {
    public static final xc5 r = null;
    public final Map n;
    public final w03 o;
    public x44 p;
    public final kl3 q;

    static {
        int r3 = 19;
        r = new xc5(r3, new d60(17, 0), new ms3(3));
    }

    public w44(Map r2) {
        this.n = r2;
        long[] r3 = v54.a;
        this.o = new w03();
        this.q = new kl3(5, this);
    }

    @Override // defpackage.u44
    public final void e(Object r8, r70 r9, rg1 r10, int r11) {
        r10.S(533563200);
        if ((r11 & 6) == 0) goto L5;
        int r0 = r11;
    L11:
        if ((r11 & 48) != 0) goto L18;
        if (r10.g(r9) == false) goto L15;
        int r1 = 32;
    L16:
        r0 = r0 | r1;
        goto L18
    L15:
        r1 = 16;
    L18:
        if ((r11 & 384) != 0) goto L25;
        if (r10.g(this) == false) goto L22;
        int r2 = 256;
    L23:
        r0 = r0 | r2;
        goto L25
    L22:
        r2 = 128;
    L25:
        if ((r0 & 147) == 146) goto L27;
        boolean r3 = true;
    L29:
        if (r10.K(r0 & 1, r3) == false) goto L47;
        r10.T(r8);
        Object r4 = r10.H();
        i80 r5 = j80.a;
        if (r4 != r5) goto L37;
        kl3 r6 = this.q;
        if (((Boolean) r6.invoke(r8)).booleanValue() == false) goto L35;
        Map r7 = (Map) this.n.get(r8);
        wl4 r12 = z44.a;
        a54 r13 = new a54(new y44(r7, r6));
        r10.b0(r13);
        r4 = r13;
        goto L37
    L35:
        nz2.k(r8, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
        return;
    L37:
        a54 r14 = (a54) r4;
        gi1.b(new rr3[]{z44.a.a(r14), td2.a.a(r14)}, r9, r10, (r0 & 112) | 8);
        boolean r15 = (r10.g(this) | r10.g(r8)) | r10.g(r14);
        Object r16 = r10.H();
        if (r15 == true) goto L40;
        if (r16 == r5) goto L40;
    L41:
        bu.b(j15.a, (if1) r16, r10);
        if (r10.y == true) goto L44;
    L46:
        r10.o(false);
    L48:
        lv3 r17 = r10.p();
        if (r17 == null) goto L52;
        r17.d = new o70(this, r8, r9, r11, 3);
        return;
    L52:
        return;
    L44:
        if (r10.G.i != r10.z) goto L46;
        r10.z = -1;
        r10.y = false;
    L40:
        r16 = new dd0(this, r8, r14, 5);
        r10.b0(r16);
        goto L41
    L47:
        r10.N();
        goto L48
    L27:
        r3 = false;
        goto L29
    L5:
        if (r10.g(r8) == false) goto L7;
        int r18 = 4;
    L8:
        r0 = r18 | r11;
        goto L11
    L7:
        r18 = 2;
        goto L8
    }
}
