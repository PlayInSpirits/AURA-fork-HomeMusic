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

    public sd4(Context r9, Looper r10, ml3 r11, Bundle r12, gj1 r13, hj1 r14) {
        super(r9, r10, 44, r11, r13, r14, 0);
        this.L = true;
        this.M = r11;
        this.N = r12;
        this.O = (Integer) r11.f;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r3.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if ((r0 instanceof wf5) == false) goto L10;
        return (wf5) r0;
    L10:
        return new wf5(r3, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        ml3 r0 = this.M;
        String r1 = (String) r0.c;
        boolean r2 = this.p.getPackageName().equals(r1);
        Bundle r3 = this.N;
        if (r2 == true) goto L5;
        r3.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) r0.c);
    L5:
        return r3;
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
