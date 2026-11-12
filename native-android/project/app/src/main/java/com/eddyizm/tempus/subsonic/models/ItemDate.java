package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.xa3;
import defpackage.xj0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ItemDate implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ItemDate> CREATOR = null;
    private Integer day;
    private Integer month;
    private Integer year;

    static {
        CREATOR = new hz0(12);
    }

    public /* synthetic */ ItemDate(Integer r2, Integer r3, Integer r4, int r5, xj0 r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer getDay() {
        return this.day;
    }

    public final String getFormattedDate() {
        if (this.year == null) goto L5;
    L10:
        Calendar r0 = Calendar.getInstance();
        if (this.month != null) goto L16;
        if (this.day != null) goto L16;
        SimpleDateFormat r1 = new SimpleDateFormat("yyyy", Locale.getDefault());
    L19:
        Integer r2 = this.year;
        if (r2 == null) goto L22;
        int r3 = r2.intValue();
    L23:
        Integer r4 = this.month;
        int r5 = 1;
        if (r4 == null) goto L26;
        int r6 = r4.intValue();
    L27:
        int r7 = r6 - 1;
        Integer r8 = this.day;
        if (r8 == null) goto L30;
        r5 = r8.intValue();
    L30:
        r0.set(r3, r7, r5);
        return r1.format(r0.getTime());
    L26:
        r6 = 1;
        goto L27
    L22:
        r3 = 0;
    L16:
        if (this.day != null) goto L18;
        r1 = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
        goto L19
    L18:
        r1 = new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault());
        goto L19
    L5:
        if (this.month != null) goto L10;
        if (this.day != null) goto L10;
        return null;
    }

    public final Integer getMonth() {
        return this.month;
    }

    public final Integer getYear() {
        return this.year;
    }

    public final void setDay(Integer r1) {
        this.day = r1;
    }

    public final void setMonth(Integer r1) {
        this.month = r1;
    }

    public final void setYear(Integer r1) {
        this.year = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        Integer r5 = this.year;
        if (r5 != null) goto L5;
        r3.writeInt(0);
    L6:
        Integer r6 = this.month;
        if (r6 != null) goto L9;
        r3.writeInt(0);
    L10:
        Integer r2 = this.day;
        if (r2 != null) goto L14;
        r3.writeInt(0);
        return;
    L14:
        xa3.q(r3, 1, r2);
        return;
    L9:
        xa3.q(r3, 1, r6);
        goto L10
    L5:
        xa3.q(r3, 1, r5);
        goto L6
    }

    public ItemDate(Integer r1, Integer r2, Integer r3) {
        this.year = r1;
        this.month = r2;
        this.day = r3;
    }

    public ItemDate() {
        Integer r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        this(r1, r2, r3, 7, null);
    }
}
