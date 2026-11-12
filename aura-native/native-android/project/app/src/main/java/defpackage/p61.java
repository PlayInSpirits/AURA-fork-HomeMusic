package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 extends h2 {
    public static final Parcelable.Creator<p61> CREATOR = new rh5(2);
    public final String n;
    public final int o;
    public final long p;

    public p61(String str, long j) {
        this.n = str;
        this.p = j;
        this.o = -1;
    }

    public final long b() {
        long j = this.p;
        return j == -1 ? this.o : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p61) {
            p61 p61Var = (p61) obj;
            String str = p61Var.n;
            String str2 = this.n;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == p61Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, Long.valueOf(b())});
    }

    public final String toString() {
        qr2 qr2Var = new qr2(this);
        qr2Var.c(this.n, "name");
        qr2Var.c(Long.valueOf(b()), "version");
        return qr2Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 1, this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o);
        long jB = b();
        ud3.T0(parcel, 3, 8);
        parcel.writeLong(jB);
        ud3.S0(parcel, iR0);
    }

    public p61(int i, long j, String str) {
        this.n = str;
        this.o = i;
        this.p = j;
    }
}
