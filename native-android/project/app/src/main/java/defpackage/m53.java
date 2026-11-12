package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m53 extends ip {
    public static final String c = null;
    public final int b;

    static {
        c = cx.i("NetworkMeteredCtrlr");
    }

    public m53(xb0 r1) {
        r1.getClass();
        super(r1);
        this.b = 7;
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 r1) {
        r1.getClass();
        if (r1.j.a != 5) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.ip
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ip
    public final boolean e(Object r3) {
        q53 r4 = (q53) r3;
        r4.getClass();
        boolean r2 = r4.a;
        if (Build.VERSION.SDK_INT >= 26) goto L7;
        cx.f().b(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        if (r2 == false) goto L16;
        return false;
    L16:
        return true;
    L7:
        if (r2 == true) goto L9;
        return true;
    L9:
        if (r4.c == false) goto L17;
        return false;
    L17:
        return true;
    }
}
