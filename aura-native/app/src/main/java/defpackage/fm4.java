package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fm4 implements Comparable, Parcelable {
    public static final Parcelable.Creator<fm4> CREATOR = new j84(7);
    public static final String q;
    public static final String r;
    public static final String s;
    public final int n;
    public final int o;
    public final int p;

    static {
        String str = f35.a;
        q = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
    }

    public fm4(Parcel parcel) {
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fm4 fm4Var = (fm4) obj;
        int i = this.n - fm4Var.n;
        return (i == 0 && (i = this.o - fm4Var.o) == 0) ? this.p - fm4Var.p : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fm4.class == obj.getClass()) {
            fm4 fm4Var = (fm4) obj;
            if (this.n == fm4Var.n && this.o == fm4Var.o && this.p == fm4Var.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.n * 31) + this.o) * 31) + this.p;
    }

    public final String toString() {
        return this.n + "." + this.o + "." + this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }

    public fm4(int i, int i2, int i3) {
        this.n = i;
        this.o = i2;
        this.p = i3;
    }
}
