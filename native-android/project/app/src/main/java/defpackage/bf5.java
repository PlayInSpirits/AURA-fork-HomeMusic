package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf5 extends h2 implements t14 {
    public static final Parcelable.Creator<bf5> CREATOR = null;
    public final int n;
    public final int o;
    public final Intent p;

    static {
        CREATOR = new j84(12);
    }

    public bf5(int r1, int r2, Intent r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.t14
    public final Status a() {
        if (this.o != 0) goto L7;
        return Status.r;
    L7:
        return Status.v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.T0(r4, 1, 4);
        r4.writeInt(this.n);
        ud3.T0(r4, 2, 4);
        r4.writeInt(this.o);
        ud3.M0(r4, 3, this.p, r5);
        ud3.S0(r4, r0);
    }
}
