package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tt0 implements Parcelable {
    public static final Parcelable.Creator<tt0> CREATOR = new w4(25);
    public final String n;
    public final Uri o;
    public final String p;
    public final List q;
    public final byte[] r;
    public final String s;
    public final byte[] t;
    public final rt0 u;
    public final st0 v;

    public tt0(Parcel parcel) {
        String string = parcel.readString();
        String str = f35.a;
        this.n = string;
        this.o = Uri.parse(parcel.readString());
        this.p = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((fm4) parcel.readParcelable(fm4.class.getClassLoader()));
        }
        this.q = Collections.unmodifiableList(arrayList);
        this.r = parcel.createByteArray();
        this.s = parcel.readString();
        this.t = parcel.createByteArray();
        this.u = (rt0) parcel.readParcelable(rt0.class.getClassLoader());
        this.v = (st0) parcel.readParcelable(st0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tt0)) {
            return false;
        }
        tt0 tt0Var = (tt0) obj;
        return this.n.equals(tt0Var.n) && this.o.equals(tt0Var.o) && Objects.equals(this.p, tt0Var.p) && this.q.equals(tt0Var.q) && Arrays.equals(this.r, tt0Var.r) && Objects.equals(this.s, tt0Var.s) && Arrays.equals(this.t, tt0Var.t) && Objects.equals(this.u, tt0Var.u) && Objects.equals(this.v, tt0Var.v);
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + (this.n.hashCode() * 961)) * 31;
        String str = this.p;
        int iHashCode2 = (Arrays.hashCode(this.r) + ((this.q.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.s;
        int iHashCode3 = (Arrays.hashCode(this.t) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        rt0 rt0Var = this.u;
        int iHashCode4 = (iHashCode3 + (rt0Var != null ? rt0Var.hashCode() : 0)) * 31;
        st0 st0Var = this.v;
        return iHashCode4 + (st0Var != null ? st0Var.hashCode() : 0);
    }

    public final String toString() {
        return this.p + ":" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
        parcel.writeString(this.o.toString());
        parcel.writeString(this.p);
        List list = this.q;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.r);
        parcel.writeString(this.s);
        parcel.writeByteArray(this.t);
        parcel.writeParcelable(this.u, 0);
        parcel.writeParcelable(this.v, 0);
    }

    public tt0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, rt0 rt0Var, st0 st0Var) {
        int iJ = f35.J(uri, str2);
        if (iJ != 0 && iJ != 2 && iJ != 1) {
            this.u = rt0Var;
            this.v = null;
        } else {
            rr2.j(iJ, "customCacheKey must be null for type: %s", str3 == null);
            this.u = null;
            this.v = st0Var;
        }
        this.n = str;
        this.o = uri;
        this.p = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.q = Collections.unmodifiableList(arrayList);
        this.r = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.s = str3;
        this.t = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : f35.b;
    }
}
