package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w02 extends ef5 {
    public final /* synthetic */ cr4 f;

    public w02(cr4 r2) {
        this.f = r2;
        super(2, "com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
    }

    @Override // defpackage.ef5
    public final boolean K0(Parcel r4, int r5) {
        if (r5 != 1) goto L10;
        Status r6 = (Status) yh5.a(r4, Status.CREATOR);
        rh1 r1 = (rh1) yh5.a(r4, rh1.CREATOR);
        int r2 = yh5.a;
        int r7 = r4.dataAvail();
        if (r7 > 0) goto L9;
        r6.getClass();
        r1.getClass();
        g12.R(r6, r1, this.f);
        return true;
    L9:
        throw new BadParcelableException(f34.f(r7, "Parcel data not fully consumed, unread size: "));
    L10:
        return false;
    }
}
