package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zo implements Parcelable {
    public static final Parcelable.Creator<zo> CREATOR = new w4(10);
    public Locale A;
    public CharSequence B;
    public CharSequence C;
    public int D;
    public int E;
    public Integer F;
    public Integer H;
    public Integer I;
    public Integer J;
    public Integer K;
    public Integer L;
    public Integer M;
    public Integer N;
    public Integer O;
    public Integer P;
    public Boolean Q;
    public int n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public Integer s;
    public Integer t;
    public Integer u;
    public String w;
    public int v = 255;
    public int x = -2;
    public int y = -2;
    public int z = -2;
    public Boolean G = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.p);
        parcel.writeSerializable(this.q);
        parcel.writeSerializable(this.r);
        parcel.writeSerializable(this.s);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        CharSequence charSequence = this.B;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.C;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.D);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.J);
        parcel.writeSerializable(this.K);
        parcel.writeSerializable(this.L);
        parcel.writeSerializable(this.M);
        parcel.writeSerializable(this.P);
        parcel.writeSerializable(this.N);
        parcel.writeSerializable(this.O);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.Q);
    }
}
