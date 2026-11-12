package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ad3 o;

    public /* synthetic */ uc3(ad3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
    @Override // defpackage.if1
    public final Object invoke(Object r15) {
        int r0 = this.n;
        j15 r1 = j15.a;
        qc3 r2 = null;
        ad3 r14 = this.o;
        switch(r0) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        o82 r16 = (o82) r15;
        ch4 r3 = ya4.t();
        if (r3 == null) goto L7;
        if1 r4 = r3.e();
    L8:
        ch4 r5 = ya4.z(r3);
        int r17 = r14.e;     // Catch: Throwable -> L15
        q82 r6 = r16.b;     // Catch: Throwable -> L15
        ll r7 = r6.c;     // Catch: Throwable -> L15
        if (r7 == null) goto L13;
        r16.a.add(new vp3(r7, r17, r6.b, null));     // Catch: Throwable -> L15
    L13:
        ya4.H(r3, r5, r4);
        return r1;
    L15:
        th = move-exception;
        ya4.H(r3, r5, r4);
        throw th;
    L7:
        r4 = null;
        goto L8
    L18:
        ?? r18 = (Float) r15;
        float r8 = r18.floatValue();
        long r9 = e35.t(r14);
        float r10 = r14.i + r8;
        long r11 = ji2.M(r10);
        r14.i = r10 - r11;
        if (Math.abs(r8) < 1.0E-4f) goto L56;
        long r12 = r9 + r11;
        long r13 = gb.n(r12, r14.h, r14.g);
        boolean r19 = false;
        if (r12 == r13) goto L24;
        boolean r20 = true;
    L25:
        long r21 = r13 - r9;
        float r22 = r21;
        r14.j = r22;
        float r23 = 0.0f;
        if (Math.abs(r21) == 0) goto L35;
        zd3 r24 = r14.E;
        if (r22 <= 0.0f) goto L30;
        boolean r110 = true;
    L31:
        r24.setValue(Boolean.valueOf(r110));
        zd3 r25 = r14.F;
        if (r22 >= 0.0f) goto L34;
        r19 = true;
    L34:
        r25.setValue(Boolean.valueOf(r19));
        goto L35
    L30:
        r110 = false;
    L35:
        int r26 = (int) r21;
        int r27 = -r26;
        qc3 r28 = ((qc3) r14.m.getValue()).h(r27);
        if (r28 == null) goto L42;
        qc3 r111 = r14.b;
        if (r111 == null) goto L42;
        qc3 r29 = r111.h(r27);
        if (r29 == null) goto L43;
        r14.b = r29;
    L43:
        if (r2 == null) goto L45;
        r14.h(r2, r14.a, true);
        r14.A.setValue(r1);
    L52:
        if (r20 == false) goto L54;
        r18 = Long.valueOf(r21);
    L54:
        r8 = r18.floatValue();
        goto L56
    L45:
        nq r30 = r14.d;
        ad3 r31 = (ad3) r30.o;
        vd3 r32 = (vd3) r30.q;
        if (r31.p() == 0) goto L49;
        r23 = r26 / r31.p();
    L49:
        r32.h(r32.g() + r23);
        c72 r112 = (c72) r14.x.getValue();
        if (r112 == null) goto L52;
        r112.l();
    L42:
        r2 = r28;
        goto L43
    L24:
        r20 = false;
    L56:
        return Float.valueOf(r8);
    }
}
