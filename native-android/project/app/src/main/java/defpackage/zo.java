package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zo implements Parcelable {
    public static final Parcelable.Creator<zo> CREATOR = null;
    public Locale A;
    public CharSequence B;
    public CharSequence C;
    public int D;
    public int E;
    public Integer F;
    public Boolean G;
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
    public int v;
    public String w;
    public int x;
    public int y;
    public int z;

    static {
        CREATOR = new w4(10);
    }

    public zo() {
        this.v = 255;
        this.x = -2;
        this.y = -2;
        this.z = -2;
        this.G = Boolean.TRUE;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.n);
        r2.writeSerializable(this.o);
        r2.writeSerializable(this.p);
        r2.writeSerializable(this.q);
        r2.writeSerializable(this.r);
        r2.writeSerializable(this.s);
        r2.writeSerializable(this.t);
        r2.writeSerializable(this.u);
        r2.writeInt(this.v);
        r2.writeString(this.w);
        r2.writeInt(this.x);
        r2.writeInt(this.y);
        r2.writeInt(this.z);
        CharSequence r4 = this.B;
        String r0 = null;
        if (r4 == null) goto L5;
        String r5 = r4.toString();
    L6:
        r2.writeString(r5);
        CharSequence r6 = this.C;
        if (r6 == null) goto L9;
        r0 = r6.toString();
    L9:
        r2.writeString(r0);
        r2.writeInt(this.D);
        r2.writeSerializable(this.F);
        r2.writeSerializable(this.H);
        r2.writeSerializable(this.I);
        r2.writeSerializable(this.J);
        r2.writeSerializable(this.K);
        r2.writeSerializable(this.L);
        r2.writeSerializable(this.M);
        r2.writeSerializable(this.P);
        r2.writeSerializable(this.N);
        r2.writeSerializable(this.O);
        r2.writeSerializable(this.G);
        r2.writeSerializable(this.A);
        r2.writeSerializable(this.Q);
        return;
    L5:
        r5 = null;
        goto L6
    }
}
