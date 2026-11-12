package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c23 implements Parcelable {
    public static final Parcelable.Creator<c23> CREATOR = null;
    public final String n;
    public final int o;
    public final Bundle p;
    public final Bundle q;

    static {
        CREATOR = new b23(0);
    }

    public c23(Parcel r3) {
        String r0 = r3.readString();
        r0.getClass();
        this.n = r0;
        this.o = r3.readInt();
        this.p = r3.readBundle(c23.class.getClassLoader());
        Bundle r4 = r3.readBundle(c23.class.getClassLoader());
        r4.getClass();
        this.q = r4;
    }

    public final a23 a(Context r10, r23 r11, r92 r12, j23 r13) {
        r12.getClass();
        Bundle r0 = this.p;
        if (r0 == null) goto L6;
        r0.setClassLoader(r10.getClassLoader());
    L5:
        Bundle r4 = r0;
        String r7 = this.n;
        r7.getClass();
        return new a23(r10, r11, r4, r12, r13, r7, this.q);
    L6:
        r0 = null;
        goto L5
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.n);
        r1.writeInt(this.o);
        r1.writeBundle(this.p);
        r1.writeBundle(this.q);
    }

    public c23(a23 r2) {
        r2.getClass();
        this.n = r2.s;
        this.o = r2.o.u;
        this.p = r2.c();
        Bundle r0 = new Bundle();
        this.q = r0;
        r2.v.t(r0);
    }
}
