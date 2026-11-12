package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class go implements k51 {
    public final /* synthetic */ int a;
    public final be3 b;
    public final df4 c;

    public go(int r3) {
        this.a = r3;
        switch(r3) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new be3(4);
        this.c = new df4("image/avif", -1, -1);
        return;
    L6:
        this.b = new be3(4);
        this.c = new df4("image/webp", -1, -1);
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.k51
    public final void a() {
        int r0 = this.a;
    }

    @Override // defpackage.k51
    public final int b(l51 r2, t71 r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.c.b(r2, r3);
    L7:
        return this.c.b(r2, r3);
    }

    @Override // defpackage.k51
    public final boolean c(l51 r9) {
        int r0 = this.a;
        be3 r8 = this.b;
        switch(r0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        r8.K(4);
        rk0 r10 = (rk0) r9;
        r10.e(r8.a, 0, 4, false);
        if (r8.C() != 1380533830) goto L11;
        r10.o(4, false);
        r8.K(4);
        r10.e(r8.a, 0, 4, false);
        if (r8.C() != 1464156752) goto L11;
        return true;
    L11:
        return false;
    L12:
        rk0 r11 = (rk0) r9;
        r11.o(4, false);
        r8.K(4);
        r11.e(r8.a, 0, 4, false);
        if (r8.C() != 1718909296) goto L18;
        r8.K(4);
        r11.e(r8.a, 0, 4, false);
        if (r8.C() != 1635150182) goto L18;
        return true;
    L18:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r2, long r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.c.d(r2, r4);
        return;
    L6:
        this.c.d(r2, r4);
    }

    @Override // defpackage.k51
    public final void f(m51 r2) {
        int r0 = this.a;
        df4 r1 = this.c;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.f(r2);
        return;
    L6:
        r1.f(r2);
    }
}
