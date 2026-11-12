package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 implements Parcelable {
    public static final Parcelable.Creator<nw0> CREATOR = null;
    public int n;
    public final UUID o;
    public final String p;
    public final String q;
    public final byte[] r;

    static {
        CREATOR = new w4(29);
    }

    public nw0(Parcel r6) {
        this.o = new UUID(r6.readLong(), r6.readLong());
        this.p = r6.readString();
        String r0 = r6.readString();
        String r1 = f35.a;
        this.q = r0;
        this.r = r6.createByteArray();
    }

    public final boolean a(UUID r2) {
        UUID r0 = ax.a;
        UUID r1 = this.o;
        if (r0.equals(r1) == false) goto L5;
        return true;
    L5:
        if (r2.equals(r1) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof nw0) == true) goto L6;
        return false;
    L6:
        if (r5 != this) goto L8;
        return true;
    L8:
        nw0 r6 = (nw0) r5;
        if (Objects.equals(this.p, r6.p) == true) goto L11;
    L17:
        return false;
    L11:
        if (Objects.equals(this.q, r6.q) == false) goto L17;
        if (Objects.equals(this.o, r6.o) == false) goto L17;
        if (Arrays.equals(this.r, r6.r) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        if (this.n != 0) goto L10;
        int r0 = this.o.hashCode() * 31;
        String r2 = this.p;
        if (r2 != null) goto L7;
        int r3 = 0;
    L8:
        int r1 = (r0 + r3) * 31;
        int r4 = f34.e(this.q, r1, 31);
        this.n = Arrays.hashCode(this.r) + r4;
        goto L10
    L7:
        r3 = r2.hashCode();
    L10:
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        UUID r5 = this.o;
        r3.writeLong(r5.getMostSignificantBits());
        r3.writeLong(r5.getLeastSignificantBits());
        r3.writeString(this.p);
        r3.writeString(this.q);
        r3.writeByteArray(this.r);
    }

    public nw0(UUID r1, String r2, String r3, byte[] r4) {
        r1.getClass();
        this.o = r1;
        this.p = r2;
        r3.getClass();
        this.q = lw2.m(r3);
        this.r = r4;
    }
}
