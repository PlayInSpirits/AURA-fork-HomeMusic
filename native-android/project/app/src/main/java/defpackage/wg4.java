package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg4 implements y71 {
    public final rf2 a;
    public final ui0 b;
    public final ck4 c;
    public final sq0 d;

    public wg4(rf2 r1, ui0 r2, ck4 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = v64.b;
    }

    public static final Object b(wg4 r5, q64 r6, float r7, float r8, tg4 r9, wd0 r10) {
        if ((r10 instanceof vg4) == false) goto L8;
        vg4 r0 = (vg4) r10;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L8;
        r0.p = r1 - Integer.MIN_VALUE;
    L7:
        vg4 r11 = r0;
        Object r2 = r11.n;
        int r3 = r11.p;
        if (r3 == 0) goto L15;
        if (r3 != 1) goto L13;
        kb4.X(r2);
    L31:
        return ((ud) r2).b;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        kb4.X(r2);
        int r4 = 28;
        if (Math.abs(r7) == 0.0f) goto L21;
        if (Math.abs(r8) == 0.0f) goto L21;
        r11.p = 1;
        ui0 r12 = r5.b;
        if (Math.abs(((zd) new na4(r12.a).D(new zd(0.0f), new zd(r8))).a) < Math.abs(r7)) goto L26;
        ci r13 = new hg3(13, r12);
    L27:
        r2 = r13.z(r6, new Float(r7), new Float(r8), r9, r11);
        xe0 r14 = xe0.n;
        if (r2 != r14) goto L31;
        return r14;
    L26:
        r13 = new pz1(r4, r5.c);
    L21:
        return j51.a(r7, r8, 28);
    L8:
        r0 = new vg4(r5, r10);
        goto L7
    }

    @Override // defpackage.y71
    public Object a(c74 r2, float r3, vd0 r4) {
        return d(r2, r3, q05.c, (wd0) r4);
    }

    public final Object c(q64 r10, float r11, if1 r12, wd0 r13) {
        if ((r13 instanceof sg4) == false) goto L7;
        sg4 r0 = (sg4) r13;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r14 = r0.o;
        int r2 = r0.q;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        if1 r15 = r0.n;
        kb4.X(r14);
    L18:
        ud r16 = (ud) r14;
        r15.invoke(new Float(0.0f));
        return r16;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r14);
        tk0 r3 = new tk0(this, r11, r12, r10, null);
        r0.n = r12;
        r0.q = 1;
        r14 = fu.P(this.d, r3, r0);
        xe0 r9 = xe0.n;
        if (r14 != r9) goto L17;
        return r9;
    L17:
        r15 = r12;
    L7:
        r0 = new sg4(this, r13);
        goto L8
    }

    public final Object d(q64 r5, float r6, if1 r7, wd0 r8) {
        if ((r8 instanceof ug4) == false) goto L7;
        ug4 r0 = (ug4) r8;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.n;
        int r2 = r0.p;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r9);
    L17:
        ud r10 = (ud) r9;
        float r4 = r10.a.floatValue();
        xd r11 = r10.b;
        float r12 = 0.0f;
        if (r4 == 0.0f) goto L22;
        r12 = ((Number) r11.a()).floatValue();
    L22:
        return new Float(r12);
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        r0.p = 1;
        r9 = c(r5, r6, r7, r0);
        Object r13 = xe0.n;
        if (r9 != r13) goto L17;
        return r13;
    L7:
        r0 = new ug4(this, r8);
        goto L8
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof wg4) == false) goto L13;
        wg4 r5 = (wg4) r4;
        if (r5.c.equals(this.c) == false) goto L13;
        if (h12.c(r5.b, this.b) == false) goto L13;
        if (r5.a == this.a) goto L11;
        return false;
    L11:
        return true;
    L13:
        return false;
    }

    public final int hashCode() {
        int r0 = this.c.hashCode() * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        return this.a.hashCode() + r1;
    }
}
