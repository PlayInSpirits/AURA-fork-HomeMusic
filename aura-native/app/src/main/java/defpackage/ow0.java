package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ow0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<ow0> CREATOR = new w4(28);
    public final nw0[] n;
    public int o;
    public final String p;
    public final int q;

    public ow0(Parcel parcel) {
        this.p = parcel.readString();
        nw0[] nw0VarArr = (nw0[]) parcel.createTypedArray(nw0.CREATOR);
        String str = f35.a;
        this.n = nw0VarArr;
        this.q = nw0VarArr.length;
    }

    public final ow0 a(String str) {
        return Objects.equals(this.p, str) ? this : new ow0(str, false, this.n);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        nw0 nw0Var = (nw0) obj;
        nw0 nw0Var2 = (nw0) obj2;
        UUID uuid = ax.a;
        return uuid.equals(nw0Var.o) ? uuid.equals(nw0Var2.o) ? 0 : 1 : nw0Var.o.compareTo(nw0Var2.o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ow0.class == obj.getClass()) {
            ow0 ow0Var = (ow0) obj;
            if (Objects.equals(this.p, ow0Var.p) && Arrays.equals(this.n, ow0Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.o == 0) {
            String str = this.p;
            this.o = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.n);
        }
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeTypedArray(this.n, 0);
    }

    public ow0(String str, boolean z, nw0... nw0VarArr) {
        this.p = str;
        nw0VarArr = z ? (nw0[]) nw0VarArr.clone() : nw0VarArr;
        this.n = nw0VarArr;
        this.q = nw0VarArr.length;
        Arrays.sort(nw0VarArr, this);
    }
}
