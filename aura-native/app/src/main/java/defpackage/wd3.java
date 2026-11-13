package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wd3 extends sl4 implements Parcelable, nh4, kl4, b13 {
    public static final Parcelable.Creator<wd3> CREATOR = new b23(6);
    public lh4 o;

    public wd3(int i) {
        ch4 j = jh4.j();
        lh4 lh4Var = new lh4(i, j.g());
        if (!(j instanceof yi1)) {
            lh4Var.b = new lh4(i, 1L);
        }
        this.o = lh4Var;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 tl4Var, tl4 tl4Var2, tl4 tl4Var3) {
        if (((lh4) tl4Var2).c == ((lh4) tl4Var3).c) {
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
        this.o = (lh4) tl4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((lh4) jh4.t(this.o, this)).c;
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        ch4 j;
        lh4 lh4Var = (lh4) jh4.h(this.o);
        if (lh4Var.c != i) {
            lh4 lh4Var2 = this.o;
            synchronized (jh4.c) {
                j = jh4.j();
                ((lh4) jh4.o(lh4Var2, this, j, lh4Var)).c = i;
            }
            jh4.n(j, this);
        }
    }

    @Override // defpackage.b13
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return xa3.e(((lh4) jh4.h(this.o)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
