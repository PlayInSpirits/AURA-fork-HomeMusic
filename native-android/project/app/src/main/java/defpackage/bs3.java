package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bs3 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    bs3 EF5;
    public static final /* synthetic */ bs3[] n = {new bs3("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<bs3> CREATOR = new ch5(18);

    public static bs3 a(String str) throws PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException {
        for (bs3 bs3Var : values()) {
            bs3Var.getClass();
            if (str.equals("public-key")) {
                return bs3Var;
            }
        }
        throw new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(xa3.h("PublicKeyCredentialType ", str, " not supported"));
    }

    public static bs3 valueOf(String str) {
        return (bs3) Enum.valueOf(bs3.class, str);
    }

    public static bs3[] values() {
        return (bs3[]) n.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
