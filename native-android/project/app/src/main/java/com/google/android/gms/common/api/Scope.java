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
    public static final Parcelable.Creator<Scope> CREATOR = null;
    public final int n;
    public final String o;

    static {
        CREATOR = new ch5(4);
    }

    public Scope(int r2, String r3) {
        ji2.l(r3, "scopeUri must not be null or empty");
        this.n = r2;
        this.o = r3;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Scope) == true) goto L9;
        return false;
    L9:
        String r3 = ((Scope) r2).o;
        return this.o.equals(r3);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n);
        ud3.O0(r3, 2, this.o);
        ud3.S0(r3, r5);
    }
}
