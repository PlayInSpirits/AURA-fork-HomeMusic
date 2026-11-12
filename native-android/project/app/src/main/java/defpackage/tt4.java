package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tt4 implements wz3, pz3 {
    public final wz3 a;
    public final Object b;
    public volatile cf4 c;
    public volatile pz3 d;
    public int e;
    public int f;
    public boolean g;

    public tt4(Object r2, wz3 r3) {
        this.e = 3;
        this.f = 3;
        this.b = r2;
        this.a = r3;
    }

    @Override // defpackage.wz3, defpackage.pz3
    public final boolean a() {
        Object r0 = this.b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.d.a() == false) goto L7;
    L12:
        boolean r2 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        if (this.c.a() == true) goto L12;
        r2 = false;
        goto L13
    }

    @Override // defpackage.wz3
    public final void b(pz3 r3) {
        Object r0 = this.b;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.c) == true) goto L11;
        this.f = 5;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L11:
        this.e = 5;     // Catch: Throwable -> L9
        wz3 r4 = this.a;     // Catch: Throwable -> L9
        if (r4 == null) goto L14;
        r4.b(this);     // Catch: Throwable -> L9
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // defpackage.pz3
    public final void c() {
        Object r0 = this.b;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (b11.c(this.f) == true) goto L10;
        this.f = 2;     // Catch: Throwable -> L7
        this.d.c();     // Catch: Throwable -> L7
    L10:
        if (b11.c(this.e) == true) goto L12;
        this.e = 2;     // Catch: Throwable -> L7
        this.c.c();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // defpackage.pz3
    public final void clear() {
        Object r0 = this.b;
        monitor-enter(r0);
        this.g = false;     // Catch: Throwable -> L8
        this.e = 3;     // Catch: Throwable -> L8
        this.f = 3;     // Catch: Throwable -> L8
        this.d.clear();     // Catch: Throwable -> L8
        this.c.clear();     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean d() {
        Object r0 = this.b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.e != 4) goto L7;
        boolean r2 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = false;
        goto L8
    }

    @Override // defpackage.pz3
    public final boolean e(pz3 r3) {
        if ((r3 instanceof tt4) == false) goto L20;
        tt4 r4 = (tt4) r3;
        if (this.c != null) goto L10;
        if (r4.c == null) goto L12;
        return false;
    L12:
        if (this.d != null) goto L17;
        if (r4.d != null) goto L25;
        return true;
    L25:
        return false;
    L17:
        if (this.d.e(r4.d) == false) goto L26;
        return true;
    L26:
        return false;
    L10:
        if (this.c.e(r4.c) == true) goto L12;
        return false;
    L20:
        return false;
    }

    @Override // defpackage.wz3
    public final void f(pz3 r3) {
        Object r0 = this.b;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.d) == false) goto L11;
        this.f = 4;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L11:
        this.e = 4;     // Catch: Throwable -> L9
        wz3 r4 = this.a;     // Catch: Throwable -> L9
        if (r4 == null) goto L15;
        r4.f(this);     // Catch: Throwable -> L9
    L15:
        if (b11.c(this.f) == true) goto L17;
        this.d.clear();     // Catch: Throwable -> L9
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // defpackage.wz3
    public final boolean g(pz3 r3) {
        Object r0 = this.b;
        monitor-enter(r0);
        wz3 r1 = this.a;     // Catch: Throwable -> L13
        if (r1 == null) goto L9;
        if (r1.g(this) == true) goto L9;
    L15:
        boolean r2 = false;
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r2;
    L9:
        if (r3.equals(this.c) == false) goto L15;
        if (this.e == 2) goto L15;
        r2 = true;
    L13:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [wz3] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.wz3
    public final wz3 getRoot() {
        Object r0 = this.b;
        monitor-enter(r0);
        wz3 r1 = this.a;     // Catch: Throwable -> L7
        ?? r2 = this;
        if (r1 == null) goto L9;
        r2 = r1.getRoot();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r2;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.wz3
    public final boolean h(pz3 r3) {
        Object r0 = this.b;
        monitor-enter(r0);
        wz3 r1 = this.a;     // Catch: Throwable -> L13
        if (r1 == null) goto L9;
        if (r1.h(this) == true) goto L9;
    L15:
        boolean r2 = false;
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r2;
    L9:
        if (r3.equals(this.c) == false) goto L15;
        if (a() == true) goto L15;
        r2 = true;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.wz3
    public final boolean i(pz3 r3) {
        Object r0 = this.b;
        monitor-enter(r0);
        wz3 r1 = this.a;     // Catch: Throwable -> L14
        if (r1 == null) goto L9;
        if (r1.i(this) == true) goto L9;
    L13:
        boolean r2 = false;
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L14
        return r2;
    L9:
        if (r3.equals(this.c) == false) goto L11;
    L16:
        r2 = true;
        goto L17
    L11:
        if (this.e == 4) goto L13;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean isRunning() {
        Object r0 = this.b;
        monitor-enter(r0);
        boolean r1 = true;
        if (this.e == 1) goto L8;
        r1 = false;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean j() {
        Object r0 = this.b;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.e != 3) goto L7;
        boolean r2 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = false;
        goto L8
    }

    @Override // defpackage.pz3
    public final void k() {
        Object r0 = this.b;
        monitor-enter(r0);
        this.g = true;     // Catch: Throwable -> L22
    L12:
        th = move-exception;
        this.g = false;     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L8:
        if (this.e == 4) goto L15;
        if (this.f == 1) goto L15;
        this.f = 1;     // Catch: Throwable -> L12
        this.d.k();     // Catch: Throwable -> L12
    L15:
        if (this.g == true) goto L17;
    L19:
        this.g = false;     // Catch: Throwable -> L22
        monitor-exit(r0);     // Catch: Throwable -> L22
        return;
    L17:
        if (this.e == 1) goto L19;
        this.e = 1;     // Catch: Throwable -> L12
        this.c.k();     // Catch: Throwable -> L12
    L22:
        th = move-exception;
        throw th;
    }
}
