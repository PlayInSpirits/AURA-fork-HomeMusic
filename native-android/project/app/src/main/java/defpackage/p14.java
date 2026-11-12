package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p14 extends a {
    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        iBinder.getClass();
        int i = bv1.f;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        return iInterfaceQueryLocalInterface instanceof cv1 ? (cv1) iInterfaceQueryLocalInterface : new av1(iBinder);
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
