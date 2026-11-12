package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum bs3 extends Enum implements Parcelable {
    public static final Parcelable.Creator<bs3> CREATOR = null;
    public static final /* synthetic */ bs3[] n = null;

    static {
        n = new bs3[]{new bs3("PUBLIC_KEY", 0)};
        CREATOR = new ch5(18);
    }

    public static bs3 a(String r5) {
        bs3[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        bs3 r3 = r0[r2];
        r3.getClass();
        if (r5.equals("public-key") == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(xa3.h("PublicKeyCredentialType ", r5, " not supported"));
    }

    public static bs3 valueOf(String r1) {
        return (bs3) Enum.valueOf(bs3.class, r1);
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
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString("public-key");
    }
}
