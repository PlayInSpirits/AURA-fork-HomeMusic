package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ok5 extends a {
    public ok5(android.content.Context a0, android.os.Looper a1, int a2, defpackage.ml3 a3, defpackage.gj1 a4, defpackage.hj1 a5, int a6) {
        super(a0, a1, a2, a3, a4, a5, a6);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof sk5 ? (sk5) queryLocalInterface : new sk5(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final p61[] c() {
        return new p61[]{gh0.i, gh0.h};
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        return b11.h("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean i() {
        return true;
    }
}
