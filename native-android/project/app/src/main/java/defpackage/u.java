package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ rm2 q;
    public final /* synthetic */ bq3 r;
    public final /* synthetic */ u30 s;

    public /* synthetic */ u(rm2 r1, bq3 r2, u30 r3, vd0 r4, int r5) {
        this.o = r5;
        this.q = r1;
        this.r = r2;
        this.s = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r8, vd0 r9) {
        switch(this.o) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        rm2 r1 = this.q;
        bq3 r2 = this.r;
        return new u(r1, r2, this.s, r9, 1);
    L6:
        rm2 r3 = this.q;
        bq3 r4 = this.r;
        return new u(r3, r4, this.s, r9, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((u) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((u) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        int r0 = this.o;
        j15 r1 = j15.a;
        u30 r2 = this.s;
        rm2 r3 = this.q;
        xe0 r6 = xe0.n;
        bq3 r9 = this.r;
        switch(r0) {
            case 0: goto L19;
            default: goto L4;
        };
    L4:
        int r4 = this.p;
        if (r4 == 0) goto L11;
        if (r4 == 1) goto L10;
        if (r4 != 2) goto L9;
        kb4.X(r11);
    L17:
        r2.M = r9;
        return r1;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        kb4.X(r11);
    L14:
        this.p = 2;
        if (r3.e(r9, this) != r6) goto L17;
    L35:
        return r6;
    L11:
        kb4.X(r11);
        long r5 = v30.a;
        this.p = 1;
        if (au0.j(r5, this) != r6) goto L14;
    L19:
        int r7 = this.p;
        if (r7 == 0) goto L26;
        if (r7 == 1) goto L25;
        if (r7 != 2) goto L24;
        kb4.X(r11);
    L32:
        r2.P = r9;
        return r1;
    L24:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L25:
        kb4.X(r11);
    L29:
        this.p = 2;
        if (r3.e(r9, this) != r6) goto L32;
    L37:
        return r6;
    L26:
        kb4.X(r11);
        long r8 = v30.a;
        this.p = 1;
        if (au0.j(r8, this) != r6) goto L29;
        goto L29
    }
}
