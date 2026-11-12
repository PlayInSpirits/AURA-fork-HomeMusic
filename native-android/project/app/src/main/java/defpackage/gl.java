package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum gl extends Enum implements Parcelable {
    public static final Parcelable.Creator<gl> CREATOR = null;
    public static final /* synthetic */ gl[] o = null;
    public final String n;

    static {
        o = new gl[]{new gl(0, "PLATFORM", "platform"), new gl(1, "CROSS_PLATFORM", "cross-platform")};
        CREATOR = new ch5(3);
    }

    public gl(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static gl a(String r5) {
        gl[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        gl r3 = r0[r2];
        if (r5.equals(r3.n) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new Attachment$UnsupportedAttachmentException(xa3.h("Attachment ", r5, " not supported"));
    }

    public static gl valueOf(String r1) {
        return (gl) Enum.valueOf(gl.class, r1);
    }

    public static gl[] values() {
        return (gl[]) o.clone();
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
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.n);
    }
}
