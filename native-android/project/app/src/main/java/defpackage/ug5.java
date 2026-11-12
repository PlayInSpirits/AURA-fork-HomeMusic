package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug5 extends ef5 implements IInterface {
    public final /* synthetic */ int f;
    public final /* synthetic */ wg5 g;

    public ug5(wg5 r1, int r2) {
        this.f = r2;
        this.g = r1;
        super(1, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.ef5
    public final boolean N0(int r2, Parcel r3, Parcel r4) {
        wg5 r0 = this.g;
        int r1 = this.f;
        switch(r2) {
            case 101: goto L18;
            case 102: goto L11;
            case 103: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        Status r5 = (Status) pg5.a(r3, Status.CREATOR);
        pg5.b(r3);
        switch(r1) {
            case 1: goto L10;
            default: goto L9;
        };
    L10:
        r0.e(r5);
    L16:
        r4.writeNoException();
        return true;
    L9:
        throw new UnsupportedOperationException();
    L11:
        Status r6 = (Status) pg5.a(r3, Status.CREATOR);
        pg5.b(r3);
        switch(r1) {
            case 0: goto L15;
            default: goto L14;
        };
    L15:
        r0.e(r6);
        goto L16
    L14:
        throw new UnsupportedOperationException();
    L18:
        GoogleSignInAccount r7 = (GoogleSignInAccount) pg5.a(r3, GoogleSignInAccount.CREATOR);
        Status r8 = (Status) pg5.a(r3, Status.CREATOR);
        pg5.b(r3);
        throw new UnsupportedOperationException();
    }
}
