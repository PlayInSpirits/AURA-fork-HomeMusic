package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf5 extends h2 implements t14 {
    public static final Parcelable.Creator<yf5> CREATOR = new j84(15);
    public final List n;
    public final String o;

    public yf5(String str, ArrayList arrayList) {
        this.n = arrayList;
        this.o = str;
    }

    @Override // defpackage.t14
    public final Status a() {
        return this.o != null ? Status.r : Status.v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        List<String> list = this.n;
        if (list != null) {
            int iR1 = ud3.R0(parcel, 1);
            parcel.writeStringList(list);
            ud3.S0(parcel, iR1);
        }
        ud3.O0(parcel, 2, this.o);
        ud3.S0(parcel, iR0);
    }
}
