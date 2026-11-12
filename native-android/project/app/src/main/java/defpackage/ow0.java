package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<ow0> CREATOR = null;
    public final nw0[] n;
    public int o;
    public final String p;
    public final int q;

    static {
        CREATOR = new w4(28);
    }

    public ow0(Parcel r2) {
        this.p = r2.readString();
        nw0[] r3 = (nw0[]) r2.createTypedArray(nw0.CREATOR);
        String r0 = f35.a;
        this.n = r3;
        this.q = r3.length;
    }

    public final ow0 a(String r3) {
        if (Objects.equals(this.p, r3) == false) goto L6;
        return this;
    L6:
        return new ow0(r3, false, this.n);
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        nw0 r4 = (nw0) r2;
        nw0 r5 = (nw0) r3;
        UUID r1 = ax.a;
        if (r1.equals(r4.o) == false) goto L11;
        if (r1.equals(r5.o) == false) goto L8;
        return 0;
    L8:
        return 1;
    L11:
        return r4.o.compareTo(r5.o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (ow0.class != r5.getClass()) goto L15;
        ow0 r6 = (ow0) r5;
        if (Objects.equals(this.p, r6.p) == false) goto L15;
        if (Arrays.equals(this.n, r6.n) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        if (this.o != 0) goto L10;
        String r0 = this.p;
        if (r0 != null) goto L7;
        int r1 = 0;
    L8:
        this.o = (r1 * 31) + Arrays.hashCode(this.n);
        goto L10
    L7:
        r1 = r0.hashCode();
    L10:
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.p);
        r1.writeTypedArray(this.n, 0);
    }

    public ow0(String r1, boolean r2, nw0... r3) {
        this.p = r1;
        if (r2 == false) goto L5;
        r3 = (nw0[]) r3.clone();
    L5:
        this.n = r3;
        this.q = r3.length;
        Arrays.sort(r3, this);
    }
}
