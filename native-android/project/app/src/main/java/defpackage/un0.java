package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class un0 implements b75 {
    public static final un0 b = null;
    public final /* synthetic */ int a;

    static {
        b = new un0(0);
    }

    public /* synthetic */ un0(int r1) {
        this.a = r1;
    }

    @Override // defpackage.b75
    public final x65 a(Class r1) {
        switch(this.a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return new j23();
    L7:
        return new nd2();
    L9:
        return new od1(true);
    L11:
        return bu.h(r1);
    }
}
