package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 implements p81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ p81 o;
    public final /* synthetic */ sf1 p;

    public /* synthetic */ x81(p81 r1, sf1 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b1 -> B:35:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c7 -> B:38:0x00c1). Please report as a decompilation issue!!! */
    @Override // defpackage.p81
    public final Object a(q81 r14, vd0 r15) {
        int r0 = this.n;
        sf1 r2 = this.p;
        p81 r3 = this.o;
        j15 r4 = j15.a;
        xe0 r5 = xe0.n;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        Object r13 = r3.a(new lv0(2, r14, (wf1) r2), r15);
        if (r13 == r5) goto L7;
        return r4;
    L7:
        return r13;
    L8:
        Object r16 = ((f10) r3).a(new z81(new fx3(), r14, (pv3) r2), r15);
        if (r16 == r5) goto L11;
        return r4;
    L11:
        return r16;
    L13:
        if ((r15 instanceof w81) == false) goto L17;
        w81 r1 = (w81) r15;
        int r6 = r1.o;
        if ((r6 & Integer.MIN_VALUE) == 0) goto L17;
        r1.o = r6 - Integer.MIN_VALUE;
    L18:
        Object r17 = r1.n;
        int r7 = r1.o;
        if (r7 == 0) goto L25;
        if (r7 == 1) goto L24;
        if (r7 != 2) goto L23;
        long r18 = r1.t;
        Throwable r8 = r1.s;
        q81 r9 = r1.r;
        x81 r10 = r1.q;
        kb4.X(r17);
    L36:
        if (((Boolean) r17).booleanValue() == false) goto L39;
        r18 = r18 + 1;
        boolean r19 = true;
    L38:
        long r11 = r18;
        r14 = r9;
        x81 this = r10;
        long r12 = r11;
        if (r19 == false) goto L46;
    L26:
        j91 r110 = (j91) this.o;
        r1.q = this;
        r1.r = r14;
        r1.s = null;
        r1.t = r12;
        r1.o = 1;
        r17 = ya4.f(r110, r14, r1);
        if (r17 == r5) goto L45;
        long r111 = r12;
        r10 = this;
        r9 = r14;
        r18 = r111;
    L30:
        r8 = (Throwable) r17;
        if (r8 == null) goto L40;
        g15 r112 = (g15) r10.p;
        Long r20 = new Long(r18);
        r1.q = r10;
        r1.r = r9;
        r1.s = r8;
        r1.t = r18;
        r1.o = 2;
        r17 = r112.d(r9, r8, r20, r1);
        if (r17 != r5) goto L36;
    L40:
        r19 = false;
    L45:
        return r5;
    L46:
        return r4;
    L39:
        throw r8;
    L23:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L24:
        r18 = r1.t;
        q81 r21 = r1.r;
        x81 r22 = r1.q;
        kb4.X(r17);
        r10 = r22;
        r9 = r21;
        goto L30
    L25:
        kb4.X(r17);
        r12 = 0;
    L17:
        r1 = new w81(this, r15);
        goto L18
    }
}
