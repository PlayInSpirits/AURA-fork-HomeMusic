package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ch5;
import defpackage.h2;
import defpackage.ji2;
import defpackage.ud3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends h2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new ch5(4);
    public final int n;
    public final String o;

    public Scope(int i, String str) {
        ji2.l(str, "scopeUri must not be null or empty");
        this.n = i;
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.o.equals(((Scope) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.O0(parcel, 2, this.o);
        ud3.S0(parcel, iR0);
    }
}
