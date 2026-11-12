package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.h2;
import defpackage.hz0;
import defpackage.ud3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class GetCredentialRequest extends h2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = null;
    public final List n;
    public final Bundle o;
    public final String p;
    public final ResultReceiver q;

    static {
        CREATOR = new hz0(6);
    }

    public GetCredentialRequest(ArrayList r1, Bundle r2, String r3, ResultReceiver r4) {
        r1.getClass();
        r2.getClass();
        r4.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        r4.getClass();
        int r0 = ud3.R0(r4, 20293);
        ud3.Q0(r4, 1, this.n);
        ud3.K0(r4, 2, this.o);
        ud3.O0(r4, 3, this.p);
        ud3.M0(r4, 4, this.q, r5);
        ud3.S0(r4, r0);
    }
}
