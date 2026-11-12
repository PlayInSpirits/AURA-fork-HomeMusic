package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wd3 extends sl4 implements Parcelable, nh4, kl4, b13 {
    public static final Parcelable.Creator<wd3> CREATOR = null;
    public lh4 o;

    static {
        CREATOR = new b23(6);
    }

    public wd3(int r5) {
        ch4 r0 = jh4.j();
        lh4 r1 = new lh4(r5, r0.g());
        if ((r0 instanceof yi1) == true) goto L5;
        r1.b = new lh4(r5, 1);
    L5:
        this.o = r1;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 r1, tl4 r2, tl4 r3) {
        if (((lh4) r2).c != ((lh4) r3).c) goto L5;
        return r2;
    L5:
        return null;
    }

    @Override // defpackage.nh4
    public final rv2 c() {
        return rv2.D;
    }

    @Override // defpackage.rl4
    public final void d(tl4 r1) {
        r1.getClass();
        this.o = (lh4) r1;
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

    public final void h(int r5) {
        lh4 r0 = (lh4) jh4.h(this.o);
        if (r0.c == r5) goto L13;
        lh4 r1 = this.o;
        Object r2 = jh4.c;
        monitor-enter(r2);
        ch4 r3 = jh4.j();     // Catch: Throwable -> L10
        ((lh4) jh4.o(r1, this, r3, r0)).c = r5;     // Catch: Throwable -> L10
        monitor-exit(r2);
        jh4.n(r3, this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.b13
    public final void setValue(Object r1) {
        h(((Number) r1).intValue());
    }

    public final String toString() {
        return xa3.e(((lh4) jh4.h(this.o)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(g());
    }
}
