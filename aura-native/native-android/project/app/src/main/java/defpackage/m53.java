package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m53 extends ip {
    public static final String c = cx.i("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(xb0 xb0Var) {
        super(xb0Var);
        xb0Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 dd5Var) {
        dd5Var.getClass();
        return dd5Var.j.a == 5;
    }

    @Override // defpackage.ip
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ip
    public final boolean e(Object obj) {
        q53 q53Var = (q53) obj;
        q53Var.getClass();
        boolean z = q53Var.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && q53Var.c) ? false : true;
        }
        cx.f().b(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }
}
