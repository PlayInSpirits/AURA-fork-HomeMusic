package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a82 implements xr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a82(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.xr0
    public final void a() {
        int r0 = this.a;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        l82 r4 = (l82) r3;
        r4.f = true;
        r4.d = 0;
        r4.c();
        return;
    L6:
        q82 r5 = (q82) r3;
        ll r1 = r5.c;
        if (r1 == null) goto L9;
        r1.o = false;
    L9:
        r5.c = null;
        return;
    L11:
        ((b82) r3).c = null;
    }
}
