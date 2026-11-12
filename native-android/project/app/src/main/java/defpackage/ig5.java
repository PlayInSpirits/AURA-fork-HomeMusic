package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ig5 extends h2 {
    public static final Parcelable.Creator<ig5> CREATOR = null;
    public final int n;
    public final IBinder o;
    public final ka0 p;
    public final boolean q;
    public final boolean r;

    static {
        CREATOR = new j84(19);
    }

    public ig5(int r1, IBinder r2, ka0 r3, boolean r4, boolean r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    public final boolean equals(Object r5) {
        if (r5 == null) goto L33;
        if (this != r5) goto L7;
        return true;
    L7:
        if ((r5 instanceof ig5) == false) goto L34;
        ig5 r6 = (ig5) r5;
        if (this.p.equals(r6.p) == false) goto L29;
        Object r1 = null;
        IBinder r4 = this.o;
        if (r4 != null) goto L14;
        Object r2 = null;
    L18:
        IBinder r7 = r6.o;
        if (r7 == null) goto L26;
        int r8 = g4.f;
        IInterface r9 = r7.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if ((r9 instanceof eu1) == false) goto L24;
        r1 = (eu1) r9;
        goto L26
    L24:
        r1 = new vk5(r7);
    L26:
        if (au0.n(r2, r1) == false) goto L32;
        return true;
    L32:
        return false;
    L14:
        int r3 = g4.f;
        IInterface r10 = r4.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if ((r10 instanceof eu1) == false) goto L17;
        r2 = (eu1) r10;
        goto L18
    L17:
        r2 = new vk5(r4);
        goto L18
    L29:
        return false;
    L34:
        return false;
    L33:
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        IBinder r1 = this.o;
        if (r1 == null) goto L6;
        int r3 = ud3.R0(r5, 2);
        r5.writeStrongBinder(r1);
        ud3.S0(r5, r3);
    L6:
        ud3.M0(r5, 3, this.p, r6);
        ud3.T0(r5, 4, 4);
        r5.writeInt(this.q ? 1 : 0);
        ud3.T0(r5, 5, 4);
        r5.writeInt(this.r ? 1 : 0);
        ud3.S0(r5, r0);
    }
}
