package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd3 extends sl4 implements Parcelable, nh4, kl4, b13 {
    public static final Parcelable.Creator<xd3> CREATOR = null;
    public mh4 o;

    static {
        CREATOR = new b23(7);
    }

    public xd3(long r5) {
        ch4 r0 = jh4.j();
        mh4 r1 = new mh4(r0.g(), r5);
        if ((r0 instanceof yi1) == true) goto L5;
        r1.b = new mh4(1, r5);
    L5:
        this.o = r1;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 r3, tl4 r4, tl4 r5) {
        if (((mh4) r4).c != ((mh4) r5).c) goto L5;
        return r4;
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
        this.o = (mh4) r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long r5) {
        mh4 r0 = (mh4) jh4.h(this.o);
        if (r0.c == r5) goto L13;
        mh4 r1 = this.o;
        Object r2 = jh4.c;
        monitor-enter(r2);
        ch4 r3 = jh4.j();     // Catch: Throwable -> L10
        ((mh4) jh4.o(r1, this, r3, r0)).c = r5;     // Catch: Throwable -> L10
        monitor-exit(r2);
        jh4.n(r3, this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return Long.valueOf(((mh4) jh4.t(this.o, this)).c);
    }

    @Override // defpackage.b13
    public final void setValue(Object r3) {
        g(((Number) r3).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((mh4) jh4.h(this.o)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(((mh4) jh4.t(this.o, this)).c);
    }
}
