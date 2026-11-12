package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ix2 implements Comparable, Parcelable {
    public static final Parcelable.Creator<ix2> CREATOR = null;
    public final Calendar n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final long s;
    public String t;

    static {
        CREATOR = new hz0(27);
    }

    public ix2(Calendar r4) {
        r4.set(5, 1);
        Calendar r5 = a35.c(r4);
        this.n = r5;
        this.o = r5.get(2);
        this.p = r5.get(1);
        this.q = r5.getMaximum(7);
        this.r = r5.getActualMaximum(5);
        this.s = r5.getTimeInMillis();
    }

    public static ix2 b(int r2, int r3) {
        Calendar r0 = a35.e(null);
        r0.set(1, r2);
        r0.set(2, r3);
        return new ix2(r0);
    }

    public static ix2 c(long r1) {
        Calendar r0 = a35.e(null);
        r0.setTimeInMillis(r1);
        return new ix2(r0);
    }

    public final int a(ix2 r1) {
        return this.n.compareTo(r1.n);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((ix2) r1);
    }

    public final String d() {
        if (this.t != null) goto L6;
        long r0 = this.n.getTimeInMillis();
        this.t = a35.b("yMMMM", Locale.getDefault()).format(new Date(r0));
    L6:
        return this.t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(ix2 r3) {
        if ((this.n instanceof GregorianCalendar) == false) goto L6;
        int r0 = (r3.p - this.p) * 12;
        return (r3.o - this.o) + r0;
    L6:
        kf2.n("Only Gregorian calendars are supported.");
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ix2) == true) goto L8;
        return false;
    L8:
        ix2 r6 = (ix2) r5;
        if (this.o == r6.o) goto L11;
    L13:
        return false;
    L11:
        if (this.p != r6.p) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o), Integer.valueOf(this.p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.p);
        r1.writeInt(this.o);
    }
}
