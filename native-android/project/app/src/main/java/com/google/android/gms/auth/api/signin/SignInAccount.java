package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.h2;
import defpackage.j84;
import defpackage.ji2;
import defpackage.ud3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends h2 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new j84(20);
    public final String n;
    public final GoogleSignInAccount o;
    public final String p;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.o = googleSignInAccount;
        ji2.l(str, "8.3 and 8.4 SDKs require non-null email");
        this.n = str;
        ji2.l(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 4, this.n);
        ud3.M0(parcel, 7, this.o, i);
        ud3.O0(parcel, 8, this.p);
        ud3.S0(parcel, iR0);
    }
}
