package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yr extends h2 {
    public static final Parcelable.Creator<yr> CREATOR = new j84(24);
    public final boolean n;
    public final String o;
    public final String p;
    public final boolean q;
    public final String r;
    public final ArrayList s;
    public final boolean t;

    public yr(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        ji2.h("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.n = z;
        if (z) {
            ji2.n(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.o = str;
        this.p = str2;
        this.q = z2;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.s = arrayList2;
        this.r = str3;
        this.t = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return this.n == yrVar.n && au0.n(this.o, yrVar.o) && au0.n(this.p, yrVar.p) && this.q == yrVar.q && au0.n(this.r, yrVar.r) && au0.n(this.s, yrVar.s) && this.t == yrVar.t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), this.o, this.p, Boolean.valueOf(this.q), this.r, this.s, Boolean.valueOf(this.t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n ? 1 : 0);
        ud3.O0(parcel, 2, this.o);
        ud3.O0(parcel, 3, this.p);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ud3.O0(parcel, 5, this.r);
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            int R02 = ud3.R0(parcel, 6);
            parcel.writeStringList(arrayList);
            ud3.S0(parcel, R02);
        }
        ud3.T0(parcel, 7, 4);
        parcel.writeInt(this.t ? 1 : 0);
        ud3.S0(parcel, R0);
    }
}
