package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements k51 {
    public final /* synthetic */ int a;
    public final Object b;

    public cm0(int r4) {
        this.a = 1;
        if ((r4 & 1) == 0) goto L5;
        this.b = new df4("image/jpeg", 65496, 2);
        return;
    L5:
        this.b = new d32();
    }

    private final void g() {
    }

    private final void h(long r1, long r3) {
    }

    @Override // defpackage.k51
    public final void a() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((k51) this.b).a();
        return;
    }

    @Override // defpackage.k51
    public final int b(l51 r2, t71 r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((k51) this.b).b(r2, r3);
    L7:
        if (r2.h(Integer.MAX_VALUE) == (-1)) goto L11;
        return 0;
    L11:
        return -1;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return true;
    L5:
        return ((k51) this.b).c(r2);
    }

    @Override // defpackage.k51
    public final void d(long r2, long r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((k51) this.b).d(r2, r4);
        return;
    }

    @Override // defpackage.k51
    public final void f(m51 r5) {
        int r0 = this.a;
        Object r4 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((k51) r4).f(r5);
        return;
    L6:
        wv4 r1 = r5.t(0, 3);
        r5.w(new bo(-9223372036854775807L));
        r5.p();
        tb1 r6 = (tb1) r4;
        sb1 r7 = r6.a();
        r7.m = lw2.m("text/x-unknown");
        r7.j = r6.n;
        f34.l(r7, r1);
    }

    public cm0(tb1 r2) {
        this.a = 0;
        this.b = r2;
    }
}
