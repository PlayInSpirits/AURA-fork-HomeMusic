package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 implements Parcelable {
    public static final Parcelable.Creator<be1> CREATOR = new hz0(4);
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

    public be1(Parcel parcel) {
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.readInt() != 0;
    }

    public final kc1 a(dd1 dd1Var) {
        kc1 kc1VarA = dd1Var.a(this.n);
        kc1VarA.r = this.o;
        kc1VarA.A = this.p;
        kc1VarA.C = true;
        kc1VarA.J = this.q;
        kc1VarA.K = this.r;
        kc1VarA.L = this.s;
        kc1VarA.O = this.t;
        kc1VarA.y = this.u;
        kc1VarA.N = this.v;
        kc1VarA.M = this.w;
        kc1VarA.b0 = r92.values()[this.x];
        kc1VarA.u = this.y;
        kc1VarA.v = this.z;
        kc1VarA.V = this.A;
        return kc1VarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.n);
        sb.append(" (");
        sb.append(this.o);
        sb.append(")}:");
        if (this.p) {
            sb.append(" fromLayout");
        }
        int i = this.r;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.s;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.t) {
            sb.append(" retainInstance");
        }
        if (this.u) {
            sb.append(" removing");
        }
        if (this.v) {
            sb.append(" detached");
        }
        if (this.w) {
            sb.append(" hidden");
        }
        String str2 = this.y;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.z);
        }
        if (this.A) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A ? 1 : 0);
    }

    public be1(kc1 kc1Var) {
        this.n = kc1Var.getClass().getName();
        this.o = kc1Var.r;
        this.p = kc1Var.A;
        this.q = kc1Var.J;
        this.r = kc1Var.K;
        this.s = kc1Var.L;
        this.t = kc1Var.O;
        this.u = kc1Var.y;
        this.v = kc1Var.N;
        this.w = kc1Var.M;
        this.x = kc1Var.b0.ordinal();
        this.y = kc1Var.u;
        this.z = kc1Var.v;
        this.A = kc1Var.V;
    }
}
