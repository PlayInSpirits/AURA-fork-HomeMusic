package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 {
    public static final xq0 b = new xq0(0);
    public static final xq0 c = new xq0(1);
    public static final xq0 d = new xq0(2);
    public static final xq0 e = new xq0(3);
    public final /* synthetic */ int a;

    public /* synthetic */ xq0(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                return i == 2;
            case 1:
                return false;
            case 2:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }
}
