package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class go3 implements mw4, qu3 {
    public final sa0 a;
    public final boolean b;
    public final ii c;
    public final AtomicBoolean d;

    public go3(sa0 r1, boolean r2) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = new ii();
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.mw4
    public final Object a(lw4 r5, wf1 r6, ep4 r7) {
        if (this.d.get() == true) goto L12;
        da0 r0 = (da0) r7.getContext().K(da0.o);
        if (r0 != null) goto L7;
    L10:
        h12.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    L7:
        if (r0.n != this) goto L10;
        return g(r5, r6, r7);
    L12:
        h12.P(21, "Connection is recycled");
        throw null;
    }

    @Override // defpackage.yn3
    public final Object b(String r6, if1 r7, wd0 r8) {
        if ((r8 instanceof fo3) == false) goto L7;
        fo3 r0 = (fo3) r8;
        int r1 = r0.t;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.t = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.r;
        int r2 = r0.t;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        sa0 r5 = r0.q;
        r7 = r0.p;
        r6 = r0.o;
        go3 r3 = r0.n;
        kb4.X(r9);
        sa0 r10 = r5;
        go3 this = r3;
    L41:
        zn3 r4 = new zn3(this, this.a.U(r6));     // Catch: Throwable -> L28
        Object r11 = r7.invoke(r4);     // Catch: Throwable -> L30
        ud3.e(r4, null);     // Catch: Throwable -> L28
        r10.f(null);
        return r11;
    L30:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        ud3.e(r4, th);     // Catch: Throwable -> L28
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        r10.f(null);
        throw th;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        if (this.d.get() == true) goto L39;
        da0 r12 = (da0) r0.getContext().K(da0.o);
        if (r12 != null) goto L19;
    L37:
        h12.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    L19:
        if (r12.n != this) goto L37;
        r0.n = this;
        r0.o = r6;
        r0.p = r7;
        r10 = this.a;
        r0.q = r10;
        r0.t = 1;
        Object r13 = r10.o.b(r0);
        xe0 r14 = xe0.n;
        if (r13 != r14) goto L41;
        return r14;
    L39:
        h12.P(21, "Connection is recycled");
        throw null;
    L7:
        r0 = new fo3(this, r8);
        goto L8
    }

    @Override // defpackage.qu3
    public final x34 c() {
        return this.a;
    }

    @Override // defpackage.mw4
    public final Object d(ep4 r4) {
        if (this.d.get() == true) goto L12;
        da0 r5 = (da0) r4.getContext().K(da0.o);
        if (r5 != null) goto L7;
    L10:
        h12.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    L7:
        if (r5.n != this) goto L10;
        return Boolean.valueOf(!this.c.isEmpty());
    L12:
        h12.P(21, "Connection is recycled");
        throw null;
    }

    public final Object e(lw4 r7, wd0 r8) {
        if ((r8 instanceof co3) == false) goto L7;
        co3 r1 = (co3) r8;
        int r2 = r1.s;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.s = r2 - Integer.MIN_VALUE;
    L8:
        Object r9 = r1.q;
        int r3 = r1.s;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L12;
        sa0 r6 = r1.p;
        r7 = r1.o;
        go3 r4 = r1.n;
        kb4.X(r9);
        sa0 r10 = r6;
        go3 this = r4;
    L37:
        ii r5 = this.c;     // Catch: Throwable -> L25
        sa0 r11 = this.a;     // Catch: Throwable -> L25
        int r12 = r5.p;     // Catch: Throwable -> L25
        if (r5.isEmpty() == false) goto L31;
        int r13 = r7.ordinal();     // Catch: Throwable -> L25
        if (r13 == 0) goto L30;
        if (r13 != 1) goto L23;
        h12.n(r11, "BEGIN IMMEDIATE TRANSACTION");     // Catch: Throwable -> L25
    L32:
        r5.addLast(new bo3(r12));     // Catch: Throwable -> L25
        j15 r14 = j15.a;     // Catch: Throwable -> L25
        r10.f(null);
        return r14;
    L23:
        if (r13 != 2) goto L28;
        h12.n(r11, "BEGIN EXCLUSIVE TRANSACTION");     // Catch: Throwable -> L25
        goto L32
    L28:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L25
    L30:
        h12.n(r11, "BEGIN DEFERRED TRANSACTION");     // Catch: Throwable -> L25
        goto L32
    L31:
        h12.n(r11, "SAVEPOINT '" + r12 + '\'');     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        r10.f(null);
        throw th;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        r1.n = this;
        r1.o = r7;
        r10 = this.a;
        r1.p = r10;
        r1.s = 1;
        Object r15 = r10.o.b(r1);
        xe0 r16 = xe0.n;
        if (r15 != r16) goto L37;
        return r16;
    L7:
        r1 = new co3(this, r8);
        goto L8
    }

    public final Object f(boolean r7, wd0 r8) {
        if ((r8 instanceof do3) == false) goto L7;
        do3 r2 = (do3) r8;
        int r3 = r2.s;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.s = r3 - Integer.MIN_VALUE;
    L8:
        Object r9 = r2.q;
        int r4 = r2.s;
        if (r4 == 0) goto L14;
        if (r4 != 1) goto L12;
        r7 = r2.p;
        sa0 r6 = r2.o;
        go3 r5 = r2.n;
        kb4.X(r9);
        sa0 r10 = r6;
        go3 this = r5;
    L38:
        ii r11 = this.c;     // Catch: Throwable -> L24
        sa0 r12 = this.a;     // Catch: Throwable -> L24
        if (r11.isEmpty() == true) goto L35;
        bo3 r13 = (bo3) v40.q0(r11);     // Catch: Throwable -> L24
        if (r7 == false) goto L28;
        r13.getClass();     // Catch: Throwable -> L24
        if (r11.isEmpty() == false) goto L26;
        h12.n(r12, "END TRANSACTION");     // Catch: Throwable -> L24
    L31:
        j15 r14 = j15.a;     // Catch: Throwable -> L24
        r10.f(null);
        return r14;
    L26:
        h12.n(r12, "RELEASE SAVEPOINT '" + r13.a + '\'');     // Catch: Throwable -> L24
        goto L31
    L28:
        if (r11.isEmpty() == false) goto L30;
        h12.n(r12, "ROLLBACK TRANSACTION");     // Catch: Throwable -> L24
        goto L31
    L30:
        h12.n(r12, "ROLLBACK TRANSACTION TO SAVEPOINT '" + r13.a + '\'');     // Catch: Throwable -> L24
        goto L31
    L35:
        throw new IllegalStateException("Not in a transaction");     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r10.f(null);
        throw th;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        r2.n = this;
        r10 = this.a;
        r2.o = r10;
        r2.p = r7;
        r2.s = 1;
        Object r15 = r10.o.b(r2);
        xe0 r16 = xe0.n;
        if (r15 != r16) goto L38;
        return r16;
    L7:
        r2 = new do3(this, r8);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(lw4 r11, wf1 r12, wd0 r13) {
        if ((r13 instanceof eo3) == false) goto L7;
        eo3 r0 = (eo3) r13;
        int r1 = r0.s;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.s = r1 - Integer.MIN_VALUE;
    L8:
        Object r14 = r0.q;
        int r2 = r0.s;
        boolean r3 = false;
        Object[] r4 = 0;
        xe0 r8 = xe0.n;
        if (r2 == 0) goto L31;
        if (r2 == 1) goto L30;
        if (r2 == 2) goto L25;
        if (r2 != 3) goto L14;
    L23:
        Object r10 = r0.n;
        kb4.X(r14);
        return r10;
    L14:
        if (r2 == 4) goto L23;
        if (r2 == 5) goto L18;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        Throwable r15 = (Throwable) r0.o;
        th = (Throwable) r0.n;
        kb4.X(r14);     // Catch: SQLException -> L21
        throw r15;
    L21:
        SQLException e = e;
    L56:
        if (th == null) goto L59;
        j51.d(th, e);
        throw r15;
    L59:
        throw e;
    L25:
        int r16 = r0.p;
        go3 r17 = (go3) r0.n;
        kb4.X(r14);     // Catch: Throwable -> L28
    L41:
        if (r16 == 0) goto L43;
        r3 = true;
    L43:
        r0.n = r14;
        r0.s = 3;
        if (r17.f(r3, r0) == r8) goto L52;
        return r14;
    L52:
        return r8;
    L28:
        th = move-exception;
        th = th;
        go3 this = r17;
    L66:
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        r0.n = th;     // Catch: SQLException -> L54
        r0.o = th;     // Catch: SQLException -> L54
        r0.s = 5;     // Catch: SQLException -> L54
        if (this.f(false, r0) == r8) goto L52;
        throw th;
    L54:
        e = move-exception;
        e = e;
        r15 = th;
        goto L56
    L30:
        r12 = (wf1) r0.o;
        this = (go3) r0.n;
        kb4.X(r14);
    L64:
        ao3 r18 = new ao3(r4 == true ? 1 : 0, this);     // Catch: Throwable -> L47
        r0.n = this;     // Catch: Throwable -> L47
        r0.o = null;     // Catch: Throwable -> L47
        r0.p = 1;     // Catch: Throwable -> L47
        r0.s = 2;     // Catch: Throwable -> L47
        r14 = r12.invoke(r18, r0);     // Catch: Throwable -> L47
        if (r14 == r8) goto L52;
        r17 = this;
        r16 = 1;
    L47:
        th = th;
        goto L66
    L31:
        kb4.X(r14);
        if (r11 != null) goto L34;
        r11 = lw4.n;
    L34:
        r0.n = this;
        r0.o = (Serializable) r12;
        r0.s = 1;
        if (e(r11, r0) != r8) goto L64;
    L7:
        r0 = new eo3(this, r13);
        goto L8
    }
}
