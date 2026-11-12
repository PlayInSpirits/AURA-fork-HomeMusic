package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd4 extends a {
    public final boolean L;
    public final ml3 M;
    public final Bundle N;
    public final Integer O;

    public sd4(Context context, Looper looper, ml3 ml3Var, Bundle bundle, gj1 gj1Var, hj1 hj1Var) {
        super(context, looper, 44, ml3Var, gj1Var, hj1Var, 0);
        this.L = true;
        this.M = ml3Var;
        this.N = bundle;
        this.O = (Integer) ml3Var.f;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof wf5 ? (wf5) iInterfaceQueryLocalInterface : new wf5(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        ml3 ml3Var = this.M;
        boolean zEquals = this.p.getPackageName().equals((String) ml3Var.c);
        Bundle bundle = this.N;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) ml3Var.c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.me
    public final boolean i0() {
        return this.L;
    }
}
