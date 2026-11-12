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
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new hz0(6);
    public final List n;
    public final Bundle o;
    public final String p;
    public final ResultReceiver q;

    public GetCredentialRequest(ArrayList arrayList, Bundle bundle, String str, ResultReceiver resultReceiver) {
        arrayList.getClass();
        bundle.getClass();
        resultReceiver.getClass();
        this.n = arrayList;
        this.o = bundle;
        this.p = str;
        this.q = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iR0 = ud3.R0(parcel, 20293);
        ud3.Q0(parcel, 1, this.n);
        ud3.K0(parcel, 2, this.o);
        ud3.O0(parcel, 3, this.p);
        ud3.M0(parcel, 4, this.q, i);
        ud3.S0(parcel, iR0);
    }
}
