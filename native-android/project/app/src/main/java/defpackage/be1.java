package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 implements Parcelable {
    public static final Parcelable.Creator<be1> CREATOR = null;
    public final boolean A;
    public final String n;
    public final String o;
    public final boolean p;
    public final int q;
    public final int r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final String y;
    public final int z;

    static {
        CREATOR = new hz0(4);
    }

    public be1(Parcel r4) {
        this.n = r4.readString();
        this.o = r4.readString();
        boolean r1 = false;
        if (r4.readInt() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.p = r0;
        this.q = r4.readInt();
        this.r = r4.readInt();
        this.s = r4.readString();
        if (r4.readInt() == 0) goto L9;
        boolean r2 = true;
    L10:
        this.t = r2;
        if (r4.readInt() == 0) goto L13;
        boolean r3 = true;
    L14:
        this.u = r3;
        if (r4.readInt() == 0) goto L17;
        boolean r5 = true;
    L18:
        this.v = r5;
        if (r4.readInt() == 0) goto L21;
        boolean r6 = true;
    L22:
        this.w = r6;
        this.x = r4.readInt();
        this.y = r4.readString();
        this.z = r4.readInt();
        if (r4.readInt() == 0) goto L25;
        r1 = true;
    L25:
        this.A = r1;
        return;
    L21:
        r6 = false;
        goto L22
    L17:
        r5 = false;
        goto L18
    L13:
        r3 = false;
        goto L14
    L9:
        r2 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public final kc1 a(dd1 r3) {
        kc1 r4 = r3.a(this.n);
        r4.r = this.o;
        r4.A = this.p;
        r4.C = true;
        r4.J = this.q;
        r4.K = this.r;
        r4.L = this.s;
        r4.O = this.t;
        r4.y = this.u;
        r4.N = this.v;
        r4.M = this.w;
        r4.b0 = r92.values()[this.x];
        r4.u = this.y;
        r4.v = this.z;
        r4.V = this.A;
        return r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("FragmentState{");
        r0.append(this.n);
        r0.append(" (");
        r0.append(this.o);
        r0.append(")}:");
        if (this.p == false) goto L5;
        r0.append(" fromLayout");
    L5:
        int r1 = this.r;
        if (r1 == 0) goto L8;
        r0.append(" id=0x");
        r0.append(Integer.toHexString(r1));
    L8:
        String r2 = this.s;
        if (r2 == null) goto L14;
        if (r2.isEmpty() == true) goto L14;
        r0.append(" tag=");
        r0.append(r2);
    L14:
        if (this.t == false) goto L17;
        r0.append(" retainInstance");
    L17:
        if (this.u == false) goto L20;
        r0.append(" removing");
    L20:
        if (this.v == false) goto L23;
        r0.append(" detached");
    L23:
        if (this.w == false) goto L25;
        r0.append(" hidden");
    L25:
        String r3 = this.y;
        if (r3 == null) goto L29;
        r0.append(" targetWho=");
        r0.append(r3);
        r0.append(" targetRequestCode=");
        r0.append(this.z);
    L29:
        if (this.A == false) goto L32;
        r0.append(" userVisibleHint");
    L32:
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.n);
        r1.writeString(this.o);
        r1.writeInt(this.p ? 1 : 0);
        r1.writeInt(this.q);
        r1.writeInt(this.r);
        r1.writeString(this.s);
        r1.writeInt(this.t ? 1 : 0);
        r1.writeInt(this.u ? 1 : 0);
        r1.writeInt(this.v ? 1 : 0);
        r1.writeInt(this.w ? 1 : 0);
        r1.writeInt(this.x);
        r1.writeString(this.y);
        r1.writeInt(this.z);
        r1.writeInt(this.A ? 1 : 0);
    }

    public be1(kc1 r2) {
        this.n = r2.getClass().getName();
        this.o = r2.r;
        this.p = r2.A;
        this.q = r2.J;
        this.r = r2.K;
        this.s = r2.L;
        this.t = r2.O;
        this.u = r2.y;
        this.v = r2.N;
        this.w = r2.M;
        this.x = r2.b0.ordinal();
        this.y = r2.u;
        this.z = r2.v;
        this.A = r2.V;
    }
}
