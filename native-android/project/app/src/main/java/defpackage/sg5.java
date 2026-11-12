package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sg5 extends a {
    public final GoogleSignInOptions L;

    public sg5(Context context, Looper looper, ml3 ml3Var, GoogleSignInOptions googleSignInOptions, gf5 gf5Var, gf5 gf5Var2) {
        mj1 mj1Var;
        super(context, looper, 91, ml3Var, gf5Var, gf5Var2, 0);
        Set<Scope> set = (Set) ml3Var.b;
        if (googleSignInOptions != null) {
            mj1Var = new mj1();
            mj1Var.a = new HashSet();
            mj1Var.h = new HashMap();
            mj1Var.a = new HashSet(googleSignInOptions.o);
            mj1Var.b = googleSignInOptions.r;
            mj1Var.c = googleSignInOptions.s;
            mj1Var.d = googleSignInOptions.q;
            mj1Var.e = googleSignInOptions.t;
            mj1Var.f = googleSignInOptions.p;
            mj1Var.g = googleSignInOptions.u;
            mj1Var.h = GoogleSignInOptions.c(googleSignInOptions.v);
            mj1Var.i = googleSignInOptions.w;
        } else {
            mj1Var = new mj1();
            mj1Var.a = new HashSet();
            mj1Var.h = new HashMap();
        }
        mj1Var.i = mg5.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = mj1Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = mj1Var.a;
        if (hashSet2.contains(GoogleSignInOptions.A)) {
            Scope scope2 = GoogleSignInOptions.z;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (mj1Var.d && (mj1Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.y);
        }
        this.L = new GoogleSignInOptions(3, new ArrayList(hashSet2), mj1Var.f, mj1Var.d, mj1Var.b, mj1Var.c, mj1Var.e, mj1Var.g, mj1Var.h, mj1Var.i);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof bh5 ? (bh5) iInterfaceQueryLocalInterface : new bh5(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
