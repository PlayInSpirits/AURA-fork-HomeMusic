package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zd3 extends sl4 implements Parcelable, nh4 {
    public static final Parcelable.Creator<zd3> CREATOR = null;
    public final rv2 o;
    public oh4 p;

    static {
        CREATOR = new yd3(0);
    }

    public zd3(Object r4, rv2 r5) {
        this.o = r5;
        ch4 r6 = jh4.j();
        oh4 r0 = new oh4(r6.g(), r4);
        if ((r6 instanceof yi1) == true) goto L5;
        r0.b = new oh4(1, r4);
    L5:
        this.p = r0;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.p;
    }

    @Override // defpackage.rl4
    public final tl4 b(tl4 r1, tl4 r2, tl4 r3) {
        oh4 r4 = (oh4) r1;
        Object r5 = ((oh4) r2).c;
        Object r6 = ((oh4) r3).c;
        if (this.o.i(r5, r6) == false) goto L5;
        return r2;
    L5:
        return null;
    }

    @Override // defpackage.nh4
    public final rv2 c() {
        return this.o;
    }

    @Override // defpackage.rl4
    public final void d(tl4 r1) {
        r1.getClass();
        this.p = (oh4) r1;
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
    public final void setValue(Object r5) {
        oh4 r0 = (oh4) jh4.h(this.p);
        if (this.o.i(r0.c, r5) == true) goto L13;
        oh4 r1 = this.p;
        Object r2 = jh4.c;
        monitor-enter(r2);
        ch4 r3 = jh4.j();     // Catch: Throwable -> L10
        ((oh4) jh4.o(r1, this, r3, r0)).c = r5;     // Catch: Throwable -> L10
        monitor-exit(r2);
        jh4.n(r3, this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        return "MutableState(value=" + ((oh4) jh4.h(this.p)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeValue(getValue());
        rv2 r3 = rv2.s;
        rv2 r0 = this.o;
        if (h12.c(r0, r3) == false) goto L6;
        int r4 = 0;
    L11:
        r1.writeInt(r4);
        return;
    L6:
        if (h12.c(r0, rv2.D) == false) goto L9;
        r4 = 1;
        goto L11
    L9:
        if (h12.c(r0, rv2.A) == false) goto L13;
        r4 = 2;
        goto L11
    L13:
        kf2.o("Only known types of MutableState's SnapshotMutationPolicy are supported");
    }
}
