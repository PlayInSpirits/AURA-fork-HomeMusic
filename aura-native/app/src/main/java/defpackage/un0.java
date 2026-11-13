package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class un0 implements b75 {
    public static final un0 b = new un0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ un0(int i) {
        this.a = i;
    }

    @Override // defpackage.b75
    public final x65 a(Class cls) {
        switch (this.a) {
            case 0:
                return bu.h(cls);
            case 1:
                return new od1(true);
            case 2:
                return new nd2();
            default:
                return new j23();
        }
    }
}
