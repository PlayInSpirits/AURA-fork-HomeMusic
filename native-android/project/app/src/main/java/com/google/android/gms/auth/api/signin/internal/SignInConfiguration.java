package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ch5;
import defpackage.h2;
import defpackage.ji2;
import defpackage.ud3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends h2 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = null;
    public final String n;
    public final GoogleSignInOptions o;

    static {
        CREATOR = new ch5(0);
    }

    public SignInConfiguration(String r1, GoogleSignInOptions r2) {
        ji2.k(r1);
        this.n = r1;
        this.o = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof SignInConfiguration) == true) goto L5;
        return false;
    L5:
        SignInConfiguration r5 = (SignInConfiguration) r4;
        if (this.n.equals(r5.n) == false) goto L16;
        GoogleSignInOptions r6 = r5.o;
        GoogleSignInOptions r3 = this.o;
        if (r3 != null) goto L12;
        if (r6 != null) goto L16;
        return true;
    L12:
        if (r3.equals(r6) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = 1 * 31;
        int r1 = 0;
        String r2 = this.n;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        GoogleSignInOptions r5 = this.o;
        if (r5 == null) goto L11;
        r1 = r5.hashCode();
    L11:
        return r4 + r1;
    L5:
        r3 = r2.hashCode();
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.O0(r4, 2, this.n);
        ud3.M0(r4, 5, this.o, r5);
        ud3.S0(r4, r0);
    }
}
