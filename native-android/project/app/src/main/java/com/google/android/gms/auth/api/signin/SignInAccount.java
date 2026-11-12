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
    public static final Parcelable.Creator<SignInAccount> CREATOR = null;
    public final String n;
    public final GoogleSignInAccount o;
    public final String p;

    static {
        CREATOR = new j84(20);
    }

    public SignInAccount(String r1, GoogleSignInAccount r2, String r3) {
        this.o = r2;
        ji2.l(r1, "8.3 and 8.4 SDKs require non-null email");
        this.n = r1;
        ji2.l(r3, "8.3 and 8.4 SDKs require non-null userId");
        this.p = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.O0(r4, 4, this.n);
        ud3.M0(r4, 7, this.o, r5);
        ud3.O0(r4, 8, this.p);
        ud3.S0(r4, r0);
    }
}
