package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bj2 extends sk2 {
    public bj2(android.content.Context a0, defpackage.cb4 a1, android.os.Bundle a2, defpackage.qk2 a3, android.os.Looper a4, defpackage.bl2 a5, defpackage.xc5 a6) {
        super(a0, a1, a2, a3, a4, a5, a6);
    }

    @Override // defpackage.sk2
    public final rk2 W0(Context context, cb4 cb4Var, Bundle bundle, Looper looper, xs xsVar) {
        if (!cb4Var.a.e()) {
            return new kj2(context, this, cb4Var, bundle, looper);
        }
        xsVar.getClass();
        return new lj2(context, this, cb4Var, bundle, looper, xsVar);
    }
}
