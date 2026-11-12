package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n53 extends ip {
    public final int b;

    static {
        cx.i("NetworkNotRoamingCtrlr");
    }

    public n53(xb0 r1) {
        r1.getClass();
        super(r1);
        this.b = 7;
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 r1) {
        r1.getClass();
        if (r1.j.a != 4) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.ip
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ip
    public final boolean e(Object r1) {
        q53 r2 = (q53) r1;
        r2.getClass();
        if (r2.a == true) goto L5;
        return true;
    L5:
        if (r2.d == false) goto L11;
        return false;
    L11:
        return true;
    }
}
