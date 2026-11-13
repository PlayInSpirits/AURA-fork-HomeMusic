package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p14 extends a {
    public p14(android.content.Context a0, android.os.Looper a1, int a2, defpackage.ml3 a3, defpackage.gj1 a4, defpackage.hj1 a5, int a6) {
        super(a0, a1, a2, a3, a4, a5, a6);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        iBinder.getClass();
        int i = bv1.f;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        return queryLocalInterface instanceof cv1 ? (cv1) queryLocalInterface : new av1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final p61[] c() {
        return si0.f;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean h() {
        return true;
    }
}
