package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s44 extends h2 {
    public static final Parcelable.Creator<s44> CREATOR = new j84(29);
    public final PendingIntent n;

    public s44(PendingIntent pendingIntent) {
        ji2.m(pendingIntent);
        this.n = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s44) {
            return au0.n(this.n, ((s44) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 1, this.n, i);
        ud3.S0(parcel, R0);
    }
}
