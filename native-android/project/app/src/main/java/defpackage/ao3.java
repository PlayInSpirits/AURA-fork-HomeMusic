package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ao3 implements qu3, yn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ao3(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.yn3
    public final Object b(String r2, if1 r3, wd0 r4) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((uo4) r1).b(r2, r3, r4);
    L7:
        return ((go3) r1).b(r2, r3, r4);
    }

    @Override // defpackage.qu3
    public final x34 c() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((uo4) r1).a;
    L7:
        return ((go3) r1).a;
    }
}
