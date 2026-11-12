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
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new ch5(0);
    public final String n;
    public final GoogleSignInOptions o;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        ji2.k(str);
        this.n = str;
        this.o = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.n.equals(signInConfiguration.n)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.o;
            GoogleSignInOptions googleSignInOptions2 = this.o;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1 * 31;
        String str = this.n;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.o;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 2, this.n);
        ud3.M0(parcel, 5, this.o, i);
        ud3.S0(parcel, iR0);
    }
}
