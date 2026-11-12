package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w02 extends ef5 {
    public final /* synthetic */ cr4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w02(cr4 cr4Var) {
        super(2, "com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        this.f = cr4Var;
    }

    @Override // defpackage.ef5
    public final boolean K0(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) yh5.a(parcel, Status.CREATOR);
        rh1 rh1Var = (rh1) yh5.a(parcel, rh1.CREATOR);
        int i2 = yh5.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(f34.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        status.getClass();
        rh1Var.getClass();
        g12.R(status, rh1Var, this.f);
        return true;
    }
}
