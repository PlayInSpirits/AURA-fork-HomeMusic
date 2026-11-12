package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 {
    public final f13 a;
    public final zd3 b;
    public long c;
    public final zd3 d;

    public ty1() {
        this.a = new f13(new qy1[16]);
        this.b = uc5.B(Boolean.FALSE);
        this.c = Long.MIN_VALUE;
        this.d = uc5.B(Boolean.TRUE);
    }

    public final void a(int r7, rg1 r8) {
        r8.S(-318043801);
        if (r8.g(this) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r0 | r7;
        if ((r1 & 3) == 2) goto L9;
        boolean r2 = true;
    L11:
        if (r8.K(r1 & 1, r2) == false) goto L26;
        Object r3 = r8.H();
        i80 r4 = j80.a;
        if (r3 != r4) goto L15;
        r3 = uc5.B(null);
        r8.b0(r3);
    L15:
        b13 r5 = (b13) r3;
        if (((Boolean) this.d.getValue()).booleanValue() == false) goto L18;
    L21:
        r8.R(-144841960);
        boolean r6 = r8.g(this);
        Object r9 = r8.H();
        if (r6 == true) goto L24;
        if (r9 == r4) goto L24;
    L25:
        bu.c((wf1) r9, r8, this);
        r8.o(false);
    L27:
        lv3 r10 = r8.p();
        if (r10 == null) goto L31;
        r10.d = new z(r7, 5, this);
        return;
    L31:
        return;
    L24:
        r9 = new x70(r5, this, null);
        r8.b0(r9);
        goto L25
    L18:
        if (((Boolean) this.b.getValue()).booleanValue() == true) goto L21;
        r8.R(-143455237);
        r8.o(false);
        goto L27
    L26:
        r8.N();
        goto L27
    L9:
        r2 = false;
        goto L11
    L5:
        r0 = 2;
        goto L6
    }
}
