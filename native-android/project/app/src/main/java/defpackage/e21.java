package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 implements wz3, pz3 {
    public final Object a;
    public final wz3 b;
    public volatile pz3 c;
    public volatile pz3 d;
    public int e;
    public int f;

    public e21(Object r2, wz3 r3) {
        this.e = 3;
        this.f = 3;
        this.a = r2;
        this.b = r3;
    }

    @Override // defpackage.wz3, defpackage.pz3
    public final boolean a() {
        Object r0 = this.a;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.c.a() == false) goto L7;
    L12:
        boolean r2 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        if (this.d.a() == true) goto L12;
        r2 = false;
        goto L13
    }

    @Override // defpackage.wz3
    public final void b(pz3 r3) {
        Object r0 = this.a;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.d) == true) goto L13;
        this.e = 5;     // Catch: Throwable -> L9
        if (this.f == 1) goto L11;
        this.f = 1;     // Catch: Throwable -> L9
        this.d.k();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L13:
        this.f = 5;     // Catch: Throwable -> L9
        wz3 r4 = this.b;     // Catch: Throwable -> L9
        if (r4 == null) goto L16;
        r4.b(this);     // Catch: Throwable -> L9
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // defpackage.pz3
    public final void c() {
        Object r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.e != 1) goto L10;
        this.e = 2;     // Catch: Throwable -> L7
        this.c.c();     // Catch: Throwable -> L7
    L10:
        if (this.f != 1) goto L12;
        this.f = 2;     // Catch: Throwable -> L7
        this.d.c();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // defpackage.pz3
    public final void clear() {
        Object r0 = this.a;
        monitor-enter(r0);
        this.e = 3;     // Catch: Throwable -> L8
        this.c.clear();     // Catch: Throwable -> L8
        if (this.f == 3) goto L10;
        this.f = 3;     // Catch: Throwable -> L8
        this.d.clear();     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean d() {
        Object r0 = this.a;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.e != 4) goto L7;
    L12:
        boolean r3 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r3;
    L7:
        if (this.f == 4) goto L12;
        r3 = false;
        goto L13
    }

    @Override // defpackage.pz3
    public final boolean e(pz3 r4) {
        if ((r4 instanceof e21) == false) goto L10;
        e21 r5 = (e21) r4;
        if (this.c.e(r5.c) == false) goto L10;
        if (this.d.e(r5.d) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.wz3
    public final void f(pz3 r4) {
        Object r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r4.equals(this.c) == false) goto L10;
        this.e = 4;     // Catch: Throwable -> L7
    L12:
        wz3 r5 = this.b;     // Catch: Throwable -> L7
        if (r5 == null) goto L15;
        r5.f(this);     // Catch: Throwable -> L7
    L15:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L10:
        if (r4.equals(this.d) == false) goto L12;
        this.f = 4;     // Catch: Throwable -> L7
        goto L12
    }

    @Override // defpackage.wz3
    public final boolean g(pz3 r3) {
        Object r0 = this.a;
        monitor-enter(r0);
        wz3 r1 = this.b;     // Catch: Throwable -> L14
        if (r1 == null) goto L9;
        if (r1.g(this) == true) goto L9;
    L11:
        boolean r2 = false;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L14
        return r2;
    L9:
        if (r3.equals(this.c) == false) goto L11;
        r2 = true;
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [wz3] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.wz3
    public final wz3 getRoot() {
        Object r0 = this.a;
        monitor-enter(r0);
        wz3 r1 = this.b;     // Catch: Throwable -> L7
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
    public final boolean h(pz3 r6) {
        Object r0 = this.a;
        monitor-enter(r0);
        wz3 r1 = this.b;     // Catch: Throwable -> L22
        boolean r2 = false;
        if (r1 == null) goto L9;
        if (r1.h(this) == true) goto L9;
    L20:
        monitor-exit(r0);     // Catch: Throwable -> L22
        return r2;
    L9:
        if (this.e == 5) goto L12;
        boolean r5 = r6.equals(this.c);     // Catch: Throwable -> L22
    L18:
        if (r5 == false) goto L20;
        r2 = true;
        goto L20
    L12:
        if (r6.equals(this.d) == false) goto L17;
        int r7 = this.f;     // Catch: Throwable -> L22
        if (r7 == 4) goto L16;
        if (r7 != 5) goto L17;
    L16:
        r5 = true;
    L17:
        r5 = false;
    L22:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.wz3
    public final boolean i(pz3 r2) {
        Object r3 = this.a;
        monitor-enter(r3);
        wz3 r0 = this.b;     // Catch: Throwable -> L13
        if (r0 != null) goto L7;
    L10:
        boolean r1 = true;
    L11:
        monitor-exit(r3);     // Catch: Throwable -> L13
        return r1;
    L7:
        if (r0.i(this) == true) goto L10;
        r1 = false;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean isRunning() {
        Object r0 = this.a;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.e != 1) goto L7;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        if (this.f == 1) goto L12;
        r2 = false;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean j() {
        Object r0 = this.a;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.e == 3) goto L7;
    L11:
        boolean r3 = false;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r3;
    L7:
        if (this.f != 3) goto L11;
        r3 = true;
        goto L12
    }

    @Override // defpackage.pz3
    public final void k() {
        Object r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.e == 1) goto L9;
        this.e = 1;     // Catch: Throwable -> L7
        this.c.k();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }
}
