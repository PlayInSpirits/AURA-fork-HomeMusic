package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh5 {
    public static final /* synthetic */ int a = 0;

    static {
        zh5.class.getClassLoader();
    }

    public static Parcelable a(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return (Parcelable) r2.createFromParcel(r1);
    }

    public static void b(Parcel r2) {
        int r3 = r2.dataAvail();
        if (r3 > 0) goto L6;
        return;
    L6:
        throw new BadParcelableException(f34.f(r3, "Parcel data not fully consumed, unread size: "));
    }
}
