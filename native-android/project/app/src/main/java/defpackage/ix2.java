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
    public static final Parcelable.Creator<ix2> CREATOR = new hz0(27);
    public final Calendar n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final long s;
    public String t;

    public ix2(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = a35.c(calendar);
        this.n = calendarC;
        this.o = calendarC.get(2);
        this.p = calendarC.get(1);
        this.q = calendarC.getMaximum(7);
        this.r = calendarC.getActualMaximum(5);
        this.s = calendarC.getTimeInMillis();
    }

    public static ix2 b(int i, int i2) {
        Calendar calendarE = a35.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i2);
        return new ix2(calendarE);
    }

    public static ix2 c(long j) {
        Calendar calendarE = a35.e(null);
        calendarE.setTimeInMillis(j);
        return new ix2(calendarE);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ix2 ix2Var) {
        return this.n.compareTo(ix2Var.n);
    }

    public final String d() {
        if (this.t == null) {
            this.t = a35.b("yMMMM", Locale.getDefault()).format(new Date(this.n.getTimeInMillis()));
        }
        return this.t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(ix2 ix2Var) {
        if (this.n instanceof GregorianCalendar) {
            return (ix2Var.o - this.o) + ((ix2Var.p - this.p) * 12);
        }
        kf2.n("Only Gregorian calendars are supported.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix2)) {
            return false;
        }
        ix2 ix2Var = (ix2) obj;
        return this.o == ix2Var.o && this.p == ix2Var.p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o), Integer.valueOf(this.p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.o);
    }
}
