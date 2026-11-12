package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 {
    public static final xq0 b = null;
    public static final xq0 c = null;
    public static final xq0 d = null;
    public static final xq0 e = null;
    public final /* synthetic */ int a;

    static {
        b = new xq0(0);
        c = new xq0(1);
        d = new xq0(2);
        e = new xq0(3);
    }

    public /* synthetic */ xq0(int r1) {
        this.a = r1;
    }

    public final boolean a(int r1) {
        switch(this.a) {
            case 0: goto L19;
            case 1: goto L16;
            case 2: goto L10;
            default: goto L5;
        };
    L16:
        return false;
    L5:
        if (r1 != 2) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (r1 != 3) goto L12;
    L14:
        return false;
    L12:
        if (r1 == 5) goto L14;
        return true;
    L19:
        if (r1 != 2) goto L21;
        return true;
    L21:
        return false;
    }
}
