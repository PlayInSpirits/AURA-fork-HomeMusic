package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 extends a {
    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder r2) {
        r2.getClass();
        int r1 = gu1.f;
        IInterface r3 = r2.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if ((r3 instanceof hu1) == false) goto L7;
        return (hu1) r3;
    L7:
        return new fu1(r2);
    }

    @Override // com.google.android.gms.common.internal.a
    public final p61[] c() {
        return kb4.d;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean i() {
        return true;
    }
}
