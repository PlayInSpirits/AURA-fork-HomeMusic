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
    public static final Parcelable.Creator<ItemDate> CREATOR = new hz0(12);
    private Integer day;
    private Integer month;
    private Integer year;

    public /* synthetic */ ItemDate(Integer num, Integer num2, Integer num3, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer getDay() {
        return this.day;
    }

    public final String getFormattedDate() {
        SimpleDateFormat simpleDateFormat;
        if (this.year == null && this.month == null && this.day == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        if (this.month == null && this.day == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        } else {
            simpleDateFormat = this.day == null ? new SimpleDateFormat("MMMM yyyy", Locale.getDefault()) : new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault());
        }
        Integer num = this.year;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.month;
        int iIntValue2 = (num2 != null ? num2.intValue() : 1) - 1;
        Integer num3 = this.day;
        calendar.set(iIntValue, iIntValue2, num3 != null ? num3.intValue() : 1);
        return simpleDateFormat.format(calendar.getTime());
    }

    public final Integer getMonth() {
        return this.month;
    }

    public final Integer getYear() {
        return this.year;
    }

    public final void setDay(Integer num) {
        this.day = num;
    }

    public final void setMonth(Integer num) {
        this.month = num;
    }

    public final void setYear(Integer num) {
        this.year = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.year;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num);
        }
        Integer num2 = this.month;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num2);
        }
        Integer num3 = this.day;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num3);
        }
    }

    public ItemDate(Integer num, Integer num2, Integer num3) {
        this.year = num;
        this.month = num2;
        this.day = num3;
    }

    public ItemDate() {
        this(null, null, null, 7, null);
    }
}
