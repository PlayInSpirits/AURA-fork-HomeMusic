package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 implements Parcelable {
    public static final Parcelable.Creator<nw0> CREATOR = new w4(29);
    public int n;
    public final UUID o;
    public final String p;
    public final String q;
    public final byte[] r;

    public nw0(Parcel parcel) {
        this.o = new UUID(parcel.readLong(), parcel.readLong());
        this.p = parcel.readString();
        String string = parcel.readString();
        String str = f35.a;
        this.q = string;
        this.r = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = ax.a;
        UUID uuid3 = this.o;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nw0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        nw0 nw0Var = (nw0) obj;
        return Objects.equals(this.p, nw0Var.p) && Objects.equals(this.q, nw0Var.q) && Objects.equals(this.o, nw0Var.o) && Arrays.equals(this.r, nw0Var.r);
    }

    public final int hashCode() {
        if (this.n == 0) {
            int iHashCode = this.o.hashCode() * 31;
            String str = this.p;
            this.n = Arrays.hashCode(this.r) + f34.e(this.q, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.o;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeByteArray(this.r);
    }

    public nw0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.o = uuid;
        this.p = str;
        str2.getClass();
        this.q = lw2.m(str2);
        this.r = bArr;
    }
}
