package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kt implements k51 {
    public final /* synthetic */ int a;
    public final df4 b;

    public kt(int r4) {
        this.a = r4;
        switch(r4) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new df4("image/bmp", 16973, 2);
        return;
    L6:
        this.b = new df4("image/png", 35152, 2);
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
        int r0 = this.a;
        df4 r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.b(r2, r3);
    L7:
        return r1.b(r2, r3);
    }

    @Override // defpackage.k51
    public final boolean c(l51 r2) {
        int r0 = this.a;
        df4 r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.c(r2);
    L7:
        return r1.c(r2);
    }

    @Override // defpackage.k51
    public final void d(long r2, long r4) {
        int r0 = this.a;
        df4 r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.d(r2, r4);
        return;
    L6:
        r1.d(r2, r4);
    }

    @Override // defpackage.k51
    public final void f(m51 r2) {
        int r0 = this.a;
        df4 r1 = this.b;
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
