package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ q81 o;
    public final /* synthetic */ jx3 p;

    public gs0(hs0 r1, jx3 r2, q81 r3) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q81
    public final Object b(Object r11, vd0 r12) {
        int r0 = this.n;
        Object r1 = j15.a;
        q81 r2 = this.o;
        xe0 r5 = xe0.n;
        switch(r0) {
            case 0: goto L27;
            default: goto L5;
        };
    L5:
        if ((r12 instanceof v81) == false) goto L9;
        v81 r3 = (v81) r12;
        int r8 = r3.q;
        if ((r8 & Integer.MIN_VALUE) == 0) goto L9;
        r3.q = r8 - Integer.MIN_VALUE;
    L10:
        Object r13 = r3.o;
        int r6 = r3.q;
        if (r6 == 0) goto L19;
        if (r6 != 1) goto L18;
        gs0 r10 = r3.n;
        kb4.X(r13);     // Catch: Throwable -> L16
        gs0 this = r10;
    L45:
        return r1;
    L18:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L19:
        kb4.X(r13);
        r3.n = this;     // Catch: Throwable -> L16
        r3.q = 1;     // Catch: Throwable -> L16
        Object r14 = r2.b(r11, r3);     // Catch: Throwable -> L16
        this = r14;
        if (r14 != r5) goto L45;
        r1 = r5;
        this = r14;
    L16:
        th = move-exception;
        this.p.n = th;
        throw th;
    L9:
        r3 = new v81(this, r12);
        goto L10
    L27:
        if ((r12 instanceof fs0) == false) goto L31;
        fs0 r4 = (fs0) r12;
        int r9 = r4.p;
        if ((r9 & Integer.MIN_VALUE) == 0) goto L31;
        r4.p = r9 - Integer.MIN_VALUE;
    L32:
        Object r15 = r4.n;
        int r7 = r4.p;
        if (r7 == 0) goto L37;
        if (r7 != 1) goto L36;
        kb4.X(r15);
        return r1;
    L36:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L37:
        kb4.X(r15);
        jx3 r16 = this.p;
        Object r17 = r16.n;
        if (r17 != xl.e) goto L40;
    L41:
        r16.n = r11;
        r4.p = 1;
        if (r2.b(r11, r4) == r5) goto L44;
        return r1;
    L44:
        return r5;
    L40:
        if (h12.c(r17, r11) == false) goto L41;
        return r1;
    L31:
        r4 = new fs0(this, r12);
        goto L32
    }

    public gs0(q81 r2, jx3 r3) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
    }
}
