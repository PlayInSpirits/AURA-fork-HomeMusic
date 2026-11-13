package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vd3 extends sl4 implements Parcelable, nh4, kl4, b13 {
    public static final Parcelable.Creator<vd3> CREATOR = new b23(5);
    public kh4 o;

    public vd3(float f) {
        ch4 j = jh4.j();
        kh4 kh4Var = new kh4(j.g(), f);
        if (!(j instanceof yi1)) {
            kh4Var.b = new kh4(1L, f);
        }
        this.o = kh4Var;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 tl4Var, tl4 tl4Var2, tl4 tl4Var3) {
        if (((kh4) tl4Var2).c == ((kh4) tl4Var3).c) {
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
        this.o = (kh4) tl4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((kh4) jh4.t(this.o, this)).c;
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        ch4 j;
        kh4 kh4Var = (kh4) jh4.h(this.o);
        if (kh4Var.c == f) {
            return;
        }
        kh4 kh4Var2 = this.o;
        synchronized (jh4.c) {
            j = jh4.j();
            ((kh4) jh4.o(kh4Var2, this, j, kh4Var)).c = f;
        }
        jh4.n(j, this);
    }

    @Override // defpackage.b13
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((kh4) jh4.h(this.o)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
