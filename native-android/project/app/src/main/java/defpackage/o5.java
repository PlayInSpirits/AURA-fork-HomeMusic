package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 implements Parcelable {
    public static final Parcelable.Creator<o5> CREATOR = null;
    public final int n;
    public final Intent o;

    static {
        CREATOR = new w4(1);
    }

    public o5(Intent r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ActivityResult{resultCode=");
        int r2 = this.n;
        if (r2 == (-1)) goto L7;
        if (r2 == 0) goto L6;
        String r1 = String.valueOf(r2);
    L8:
        r0.append(r1);
        r0.append(", data=");
        r0.append(this.o);
        r0.append('}');
        return r0.toString();
    L6:
        r1 = "RESULT_CANCELED";
        goto L8
    L7:
        r1 = "RESULT_OK";
        goto L8
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.getClass();
        r2.writeInt(this.n);
        Intent r1 = this.o;
        if (r1 != null) goto L5;
        int r0 = 0;
    L6:
        r2.writeInt(r0);
        if (r1 == null) goto L10;
        r1.writeToParcel(r2, r3);
        return;
    L10:
        return;
    L5:
        r0 = 1;
        goto L6
    }
}
