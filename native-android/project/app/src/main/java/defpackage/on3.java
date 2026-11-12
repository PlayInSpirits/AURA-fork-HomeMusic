package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on3 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public on3 q;

    public on3(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16, float r18, long r19) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r11;
        this.h = r13;
        this.i = r15;
        this.j = r16;
        this.k = r18;
        this.l = r19;
        this.n = 0;
        this.o = r14;
        this.p = r14;
    }

    public final void a() {
        on3 r0 = this.q;
        if (r0 != null) goto L6;
        this.o = true;
        this.p = true;
        return;
    L6:
        if (r0 == null) goto L9;
        r0.a();
        return;
    }

    public final List b() {
        ArrayList r0 = this.m;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return u01.n;
    }

    public final boolean c() {
        on3 r0 = this.q;
        if (r0 == null) goto L7;
        return r0.c();
    L7:
        if (this.o == false) goto L9;
        return true;
    L9:
        if (this.p == true) goto L15;
        return false;
    L15:
        return true;
    }

    public final String toString() {
        return "PointerInputChange(id=" + vr1.H(this.a) + ", uptimeMillis=" + this.b + ", position=" + g83.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + g83.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + un3.a(this.i) + ", historical=" + b() + ", scrollDelta=" + g83.g(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + g83.g(this.l) + ")";
    }

    public on3(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, int r35, ArrayList r36, long r37, float r39, long r40, long r42) {
        this(r22, r24, r26, r28, r29, r30, r32, r34, false, r35, r37, r39, r40);
        this.m = r36;
        this.n = r42;
    }
}
