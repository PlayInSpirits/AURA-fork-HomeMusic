package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yq4 implements rd {
    public final g45 a;
    public final hd5 b;
    public final Float c;
    public final Object d;
    public final ce e;
    public final ce f;
    public final ce g;
    public long h;
    public ce i;

    public yq4(wd r2, Object r3, Float r4, ce r5) {
        this.a = r2.a();
        hd5 r6 = p35.a;
        this.b = r6;
        this.c = r4;
        this.d = r3;
        if1 r7 = (if1) r6.o;
        this.e = (ce) r7.invoke(r3);
        this.f = (ce) r7.invoke(r4);
        if (r5 == null) goto L5;
        ce r8 = kb4.n(r5);
    L6:
        this.g = r8;
        this.h = -1;
        return;
    L5:
        r8 = ((ce) r7.invoke(r3)).c();
        goto L6
    }

    @Override // defpackage.rd
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.rd
    public final long b() {
        if (this.h >= 0) goto L6;
        ce r0 = this.f;
        ce r1 = this.g;
        this.h = this.a.m(this.e, r0, r1);
    L6:
        return this.h;
    }

    @Override // defpackage.rd
    public final hd5 c() {
        return this.b;
    }

    @Override // defpackage.rd
    public final ce d(long r8) {
        if (e(r8) == true) goto L6;
        ce r5 = this.f;
        ce r6 = this.g;
        return this.a.d(r8, this.e, r5, r6);
    L6:
        ce r9 = this.i;
        if (r9 != null) goto L10;
        ce r10 = this.f;
        ce r11 = this.g;
        ce r12 = this.a.l(this.e, r10, r11);
        this.i = r12;
        return r12;
    L10:
        return r9;
    }

    @Override // defpackage.rd
    public final Object f(long r8) {
        if (e(r8) == true) goto L13;
        ce r9 = this.a.k(r8, this.e, this.f, this.g);
        int r10 = r9.b();
        int r0 = 0;
    L5:
        if (r0 >= r10) goto L11;
        if (Float.isNaN(r9.a(r0)) == false) goto L9;
        qo3.b("AnimationVector cannot contain a NaN. " + r9 + ". Animation: " + this + ", playTimeNanos: " + r8);
    L9:
        r0 = r0 + 1;
        goto L5
    L11:
        return ((if1) this.b.p).invoke(r9);
    L13:
        return this.c;
    }

    @Override // defpackage.rd
    public final Object g() {
        return this.c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
