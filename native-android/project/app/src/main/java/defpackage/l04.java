package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public enum l04 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("preferred"),
    o("required");

    public static final Parcelable.Creator<l04> CREATOR = new ch5(20);
    public final String n;

    l04(String str) {
        this.n = str;
    }

    public static l04 a(String str) throws ResidentKeyRequirement$UnsupportedResidentKeyRequirementException {
        for (l04 l04Var : values()) {
            if (str.equals(l04Var.n)) {
                return l04Var;
            }
        }
        throw new ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(xa3.h("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
    }
}
