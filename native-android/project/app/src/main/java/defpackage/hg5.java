package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hg5 extends h2 {
    public static final Parcelable.Creator<hg5> CREATOR = null;
    public final int n;
    public final Account o;
    public final int p;
    public final GoogleSignInAccount q;

    static {
        CREATOR = new j84(18);
    }

    public hg5(int r1, Account r2, int r3, GoogleSignInAccount r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        ud3.M0(r5, 2, this.o, r6);
        ud3.T0(r5, 3, 4);
        r5.writeInt(this.p);
        ud3.M0(r5, 4, this.q, r6);
        ud3.S0(r5, r0);
    }
}
