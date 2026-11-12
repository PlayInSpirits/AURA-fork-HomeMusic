package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 extends h2 {
    public static final Parcelable.Creator<p61> CREATOR = null;
    public final String n;
    public final int o;
    public final long p;

    static {
        CREATOR = new rh5(2);
    }

    public p61(String r1, long r2) {
        this.n = r1;
        this.p = r2;
        this.o = -1;
    }

    public final long b() {
        long r2 = this.p;
        if (r2 == (-1)) goto L5;
        return r2;
    L5:
        return this.o;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof p61) == false) goto L14;
        p61 r6 = (p61) r5;
        String r0 = r6.n;
        String r2 = this.n;
        if (r2 != null) goto L7;
    L8:
        if (r2 != null) goto L14;
        if (r0 != null) goto L14;
    L11:
        if (b() != r6.b()) goto L14;
        return true;
    L7:
        if (r2.equals(r0) == true) goto L11;
    L14:
        return false;
    }

    public final int hashCode() {
        Long r0 = Long.valueOf(b());
        return Arrays.hashCode(new Object[]{this.n, r0});
    }

    public final String toString() {
        qr2 r0 = new qr2(this);
        r0.c(this.n, "name");
        r0.c(Long.valueOf(b()), "version");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r6 = ud3.R0(r4, 20293);
        ud3.O0(r4, 1, this.n);
        ud3.T0(r4, 2, 4);
        r4.writeInt(this.o);
        long r0 = b();
        ud3.T0(r4, 3, 8);
        r4.writeLong(r0);
        ud3.S0(r4, r6);
    }

    public p61(int r1, long r2, String r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
    }
}
