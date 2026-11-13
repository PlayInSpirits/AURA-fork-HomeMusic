/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a35;
import defpackage.hz0;
import defpackage.kf2;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class ix2
implements Comparable,
Parcelable {
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
        this.n = calendar = a35.c(calendar);
        this.o = calendar.get(2);
        this.p = calendar.get(1);
        this.q = calendar.getMaximum(7);
        this.r = calendar.getActualMaximum(5);
        this.s = calendar.getTimeInMillis();
    }

    public static ix2 b(int n16, int n17) {
        Calendar calendar = a35.e(null);
        calendar.set(1, n16);
        calendar.set(2, n17);
        return new ix2(calendar);
    }

    public static ix2 c(long l16) {
        Calendar calendar = a35.e(null);
        calendar.setTimeInMillis(l16);
        return new ix2(calendar);
    }

    public final int a(ix2 ix22) {
        return this.n.compareTo(ix22.n);
    }

    public final int compareTo(Object object) {
        return this.a((ix2)object);
    }

    public final String d() {
        if (this.t == null) {
            long l16 = this.n.getTimeInMillis();
            this.t = a35.b("yMMMM", Locale.getDefault()).format(new Date(l16));
        }
        return this.t;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final int e(ix2 ix22) {
        if (this.n instanceof GregorianCalendar) {
            int n16 = ix22.p;
            int n17 = this.p;
            return ix22.o - this.o + (n16 - n17) * 12;
        }
        kf2.n("Only Gregorian calendars are supported.");
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ix2)) {
            return false;
        }
        object = (ix2)object;
        return this.o == ((ix2)object).o && this.p == ((ix2)object).p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.o, this.p});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n16) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.o);
    }
}

