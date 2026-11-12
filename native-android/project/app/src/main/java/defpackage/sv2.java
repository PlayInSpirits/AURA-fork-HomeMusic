package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv2 extends bc1 {
    public final /* synthetic */ int f;
    public final long g;

    public sv2(int r1, long r2, cu4 r4) {
        this.f = r1;
        r4.getClass();
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super(r4);
        this.g = r2;
        return;
    L6:
        super(r4);
        this.g = r2;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public zt4 f(int r2, zt4 r3, boolean r4) {
        switch(this.f) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        r3.getClass();
        super.f(r2, r3, r4);
        r3.d = this.g;
        return r3;
    L5:
        return super.f(r2, r3, r4);
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final bu4 m(int r4, bu4 r5, long r6) {
        int r0 = this.f;
        long r1 = this.g;
        r5.getClass();
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.m(r4, r5, r6);
        r5.l = r1;
        r5.g = true;
        r5.h = false;
        r5.i = null;
        return r5;
    L6:
        super.m(r4, r5, r6);
        r5.l = r1;
        return r5;
    }
}
