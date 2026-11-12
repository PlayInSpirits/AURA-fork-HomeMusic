package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hg5 extends h2 {
    public static final Parcelable.Creator<hg5> CREATOR = new j84(18);
    public final int n;
    public final Account o;
    public final int p;
    public final GoogleSignInAccount q;

    public hg5(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.n = i;
        this.o = account;
        this.p = i2;
        this.q = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.M0(parcel, 2, this.o, i);
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(this.p);
        ud3.M0(parcel, 4, this.q, i);
        ud3.S0(parcel, iR0);
    }
}
