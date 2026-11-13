package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zd3 extends sl4 implements Parcelable, nh4 {
    public static final Parcelable.Creator<zd3> CREATOR = new yd3(0);
    public final rv2 o;
    public oh4 p;

    public zd3(Object obj, rv2 rv2Var) {
        this.o = rv2Var;
        ch4 j = jh4.j();
        oh4 oh4Var = new oh4(j.g(), obj);
        if (!(j instanceof yi1)) {
            oh4Var.b = new oh4(1L, obj);
        }
        this.p = oh4Var;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.p;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 tl4Var, tl4 tl4Var2, tl4 tl4Var3) {
        if (this.o.i(((oh4) tl4Var2).c, ((oh4) tl4Var3).c)) {
            return tl4Var2;
        }
        return null;
    }

    @Override // defpackage.nh4
    public final rv2 c() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final void d(tl4 tl4Var) {
        tl4Var.getClass();
        this.p = (oh4) tl4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return ((oh4) jh4.t(this.p, this)).c;
    }

    @Override // defpackage.b13
    public final void setValue(Object obj) {
        ch4 j;
        oh4 oh4Var = (oh4) jh4.h(this.p);
        if (this.o.i(oh4Var.c, obj)) {
            return;
        }
        oh4 oh4Var2 = this.p;
        synchronized (jh4.c) {
            j = jh4.j();
            ((oh4) jh4.o(oh4Var2, this, j, oh4Var)).c = obj;
        }
        jh4.n(j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((oh4) jh4.h(this.p)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        rv2 rv2Var = rv2.s;
        rv2 rv2Var2 = this.o;
        if (h12.c(rv2Var2, rv2Var)) {
            i2 = 0;
        } else if (h12.c(rv2Var2, rv2.D)) {
            i2 = 1;
        } else {
            if (!h12.c(rv2Var2, rv2.A)) {
                kf2.o("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
