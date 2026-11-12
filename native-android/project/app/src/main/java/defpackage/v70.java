package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v70 extends r14 implements wf1 {
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ w70 t;

    public v70(w70 r1, vd0 r2) {
        this.t = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        v70 r0 = new v70(this.t, r3);
        r0.s = r2;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((v70) create((ba4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        w70 r0 = this.t;
        q03 r1 = r0.n;
        h03 r2 = r0.p;
        int r3 = this.r;
        if (r3 == 0) goto L8;
        if (r3 != 1) goto L6;
        int r4 = this.q;
        int r5 = this.p;
        int r6 = this.o;
        ba4 r7 = (ba4) this.s;
        kb4.X(r11);
    L10:
        if (r6 >= Math.min(r0.q + 10, r2.b)) goto L28;
        int r12 = r6 + 1;
        int r8 = r2.b(r6);
        switch(r8) {
            case 0: goto L24;
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L21;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L17;
            case 7: goto L16;
            case 8: goto L15;
            case 9: goto L14;
            default: goto L13;
        };
    L13:
        String r9 = f34.f(r8, "unknown op: ");
    L25:
        this.s = r7;
        this.o = r12;
        this.p = r5;
        this.q = r4;
        this.r = 1;
        r7.b(this, r6 + ": " + r9);
        return xe0.n;
    L14:
        r9 = "recompose pending";
        goto L25
    L15:
        r9 = "reuse " + r0.o.f(r4);
        r4 = r4 + 1;
        goto L25
    L16:
        Object r10 = r1.f(r5);
        r10.getClass();
        jz4.j(2, r10);
        r5 = r5 + 2;
        r9 = "apply " + ((wf1) r10);
        goto L25
    L17:
        int r13 = r6 + 2;
        int r14 = r2.b(r12);
        int r15 = r5 + 1;
        String r16 = "insertTopDown " + r14 + " " + r1.f(r5);
    L18:
        int r17 = r13;
        r9 = r16;
        r12 = r17;
        r5 = r15;
        goto L25
    L19:
        r13 = r6 + 2;
        int r18 = r2.b(r12);
        r15 = r5 + 1;
        r16 = "insertBottomUp " + r18 + " " + r1.f(r5);
        goto L18
    L20:
        r9 = "clear";
        goto L25
    L21:
        int r19 = r2.b(r12);
        int r20 = r2.b(r6 + 2);
        int r21 = r2.b(r6 + 3);
        StringBuilder r110 = b11.t("move ", " ", r19, r20, " ");
        r110.append(r21);
        r9 = r110.toString();
        r12 = r6 + 4;
        goto L25
    L22:
        r9 = xa3.e(r2.b(r12), r2.b(r6 + 2), "remove ", " ");
        r12 = r6 + 3;
        goto L25
    L23:
        Object r22 = r1.f(r5);
        r5 = r5 + 1;
        r9 = "down " + r22;
        goto L25
    L24:
        r9 = "up";
        goto L25
    L28:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r11);
        r7 = (ba4) this.s;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        goto L10
    }
}
