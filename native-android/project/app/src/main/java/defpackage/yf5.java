package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf5 extends h2 implements t14 {
    public static final Parcelable.Creator<yf5> CREATOR = null;
    public final List n;
    public final String o;

    static {
        CREATOR = new j84(15);
    }

    public yf5(String r1, ArrayList r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.t14
    public final Status a() {
        if (this.o == null) goto L7;
        return Status.r;
    L7:
        return Status.v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        List<String> r0 = this.n;
        if (r0 == null) goto L6;
        int r1 = ud3.R0(r3, 1);
        r3.writeStringList(r0);
        ud3.S0(r3, r1);
    L6:
        ud3.O0(r3, 2, this.o);
        ud3.S0(r3, r5);
    }
}
