package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xd3 extends sl4 implements Parcelable, nh4, kl4, b13 {
    public static final Parcelable.Creator<xd3> CREATOR = new b23(7);
    public mh4 o;

    public xd3(long j) {
        ch4 j2 = jh4.j();
        mh4 mh4Var = new mh4(j2.g(), j);
        if (!(j2 instanceof yi1)) {
            mh4Var.b = new mh4(1L, j);
        }
        this.o = mh4Var;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 tl4Var, tl4 tl4Var2, tl4 tl4Var3) {
        if (((mh4) tl4Var2).c == ((mh4) tl4Var3).c) {
            return tl4Var2;
        }
        return null;
    }

    @Override // defpackage.nh4
    public final rv2 c() {
        return rv2.D;
    }

    @Override // defpackage.rl4
    public final void d(tl4 tl4Var) {
        tl4Var.getClass();
        this.o = (mh4) tl4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j) {
        ch4 j2;
        mh4 mh4Var = (mh4) jh4.h(this.o);
        if (mh4Var.c != j) {
            mh4 mh4Var2 = this.o;
            synchronized (jh4.c) {
                j2 = jh4.j();
                ((mh4) jh4.o(mh4Var2, this, j2, mh4Var)).c = j;
            }
            jh4.n(j2, this);
        }
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return Long.valueOf(((mh4) jh4.t(this.o, this)).c);
    }

    @Override // defpackage.b13
    public final void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((mh4) jh4.h(this.o)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((mh4) jh4.t(this.o, this)).c);
    }
}
