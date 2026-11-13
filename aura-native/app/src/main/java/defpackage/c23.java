package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c23 implements Parcelable {
    public static final Parcelable.Creator<c23> CREATOR = new b23(0);
    public final String n;
    public final int o;
    public final Bundle p;
    public final Bundle q;

    public c23(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.n = readString;
        this.o = parcel.readInt();
        this.p = parcel.readBundle(c23.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(c23.class.getClassLoader());
        readBundle.getClass();
        this.q = readBundle;
    }

    public final a23 a(Context context, r23 r23Var, r92 r92Var, j23 j23Var) {
        r92Var.getClass();
        Bundle bundle = this.p;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.n;
        str.getClass();
        return new a23(context, r23Var, bundle2, r92Var, j23Var, str, this.q);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeBundle(this.p);
        parcel.writeBundle(this.q);
    }

    public c23(a23 a23Var) {
        a23Var.getClass();
        this.n = a23Var.s;
        this.o = a23Var.o.u;
        this.p = a23Var.c();
        Bundle bundle = new Bundle();
        this.q = bundle;
        a23Var.v.t(bundle);
    }
}
