package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fm4 implements Comparable, Parcelable {
    public static final Parcelable.Creator<fm4> CREATOR = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public final int n;
    public final int o;
    public final int p;

    static {
        CREATOR = new j84(7);
        String r0 = f35.a;
        q = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
    }

    public fm4(Parcel r2) {
        this.n = r2.readInt();
        this.o = r2.readInt();
        this.p = r2.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        fm4 r4 = (fm4) r3;
        int r0 = this.n - r4.n;
        if (r0 != 0) goto L8;
        r0 = this.o - r4.o;
        if (r0 != 0) goto L8;
        return this.p - r4.p;
    L8:
        return r0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (fm4.class != r5.getClass()) goto L17;
        fm4 r6 = (fm4) r5;
        if (this.n != r6.n) goto L17;
        if (this.o != r6.o) goto L17;
        if (this.p != r6.p) goto L17;
        return true;
    }

    public final int hashCode() {
        return (((this.n * 31) + this.o) * 31) + this.p;
    }

    public final String toString() {
        return this.n + "." + this.o + "." + this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
        r1.writeInt(this.o);
        r1.writeInt(this.p);
    }

    public fm4(int r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }
}
