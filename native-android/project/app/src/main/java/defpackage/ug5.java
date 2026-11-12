package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug5 extends ef5 implements IInterface {
    public final /* synthetic */ int f;
    public final /* synthetic */ wg5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug5(wg5 wg5Var, int i) {
        super(1, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f = i;
        this.g = wg5Var;
    }

    @Override // defpackage.ef5
    public final boolean N0(int i, Parcel parcel, Parcel parcel2) {
        wg5 wg5Var = this.g;
        int i2 = this.f;
        switch (i) {
            case 101:
                pg5.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) pg5.a(parcel, Status.CREATOR);
                pg5.b(parcel);
                switch (i2) {
                    case 0:
                        wg5Var.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) pg5.a(parcel, Status.CREATOR);
                pg5.b(parcel);
                switch (i2) {
                    case 1:
                        wg5Var.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
