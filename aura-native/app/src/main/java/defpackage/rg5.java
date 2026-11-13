package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rg5 extends a {
    public final qg5 L;

    public rg5(Context context, Looper looper, ml3 ml3Var, qg5 qg5Var, gf5 gf5Var, gf5 gf5Var2) {
        super(context, looper, 68, ml3Var, gf5Var, gf5Var2, 0);
        qg5Var = qg5Var == null ? qg5.p : qg5Var;
        rf2 rf2Var = new rf2();
        rf2Var.n = Boolean.FALSE;
        qg5 qg5Var2 = qg5.p;
        qg5Var.getClass();
        rf2Var.n = Boolean.valueOf(qg5Var.n);
        rf2Var.o = qg5Var.o;
        rf2Var.o = mg5.a();
        this.L = new qg5(rf2Var);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof tg5 ? (tg5) queryLocalInterface : new tg5(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        qg5 qg5Var = this.L;
        qg5Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", qg5Var.n);
        bundle.putString("log_session_id", qg5Var.o);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
