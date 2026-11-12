package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wn3 {
    public final int a;
    public final gf1 b;
    public final ReentrantLock c;
    public int d;
    public boolean e;
    public final sa0[] f;
    public final v94 g;
    public final x20 h;

    public wn3(int r4, gf1 r5) {
        this.a = r4;
        this.b = r5;
        this.c = new ReentrantLock();
        this.f = new sa0[r4];
        int r6 = w94.a;
        this.g = new v94(r4);
        x20 r7 = new x20();
        if (r4 >= 1) goto L5;
        kf2.n("capacity must be >= 1");
        throw null;
    L5:
        if (r4 <= 1073741824) goto L7;
        kf2.n("capacity must be <= 2^30");
        throw null;
    L7:
        if (Integer.bitCount(r4) == 1) goto L9;
        r4 = Integer.highestOneBit(r4 - 1) << 1;
    L9:
        r7.c = r4 - 1;
        r7.d = new Object[r4];
        this.h = r7;
    }

    public final Object a(wd0 r8) {
        if ((r8 instanceof vn3) == false) goto L7;
        vn3 r0 = (vn3) r8;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.o;
        int r2 = r0.q;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        wn3 this = r0.n;
        kb4.X(r9);
    L68:
        ReentrantLock r10 = this.c;     // Catch: Throwable -> L51
        x20 r3 = this.h;     // Catch: Throwable -> L51
        r10.lock();     // Catch: Throwable -> L51
    L53:
        th = move-exception;
        r10.unlock();     // Catch: Throwable -> L51
        throw th;     // Catch: Throwable -> L51
    L39:
        if (this.e == false) goto L41;
        h12.P(21, "Connection pool is closed");     // Catch: Throwable -> L53
        throw null;     // Catch: Throwable -> L53
    L41:
        if (r3.a == r3.b) goto L43;
    L46:
        int r4 = r3.a;     // Catch: Throwable -> L53
        if (r4 == r3.b) goto L56;
        Object[] r5 = (Object[]) r3.d;     // Catch: Throwable -> L53
        Object r6 = r5[r4];     // Catch: Throwable -> L53
        r5[r4] = null;     // Catch: Throwable -> L53
        r3.a = (r4 + 1) & r3.c;     // Catch: Throwable -> L53
        sa0 r7 = (sa0) r6;     // Catch: Throwable -> L53
        r10.unlock();     // Catch: Throwable -> L51
        return r7;
    L56:
        throw new ArrayIndexOutOfBoundsException();     // Catch: Throwable -> L53
    L43:
        if (this.d >= this.a) goto L46;
        sa0 r11 = new sa0((x34) this.b.invoke());     // Catch: Throwable -> L53
        sa0[] r12 = this.f;     // Catch: Throwable -> L53
        int r13 = this.d;     // Catch: Throwable -> L53
        this.d = r13 + 1;     // Catch: Throwable -> L53
        r12[r13] = r11;     // Catch: Throwable -> L53
        r3.a(r11);     // Catch: Throwable -> L53
    L51:
        th = move-exception;
        this.g.c();
        throw th;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        r0.n = this;
        r0.q = 1;
        v94 r14 = this.g;
        r14.getClass();
        int r15 = r14.n;
    L15:
        int r16 = u94.t.getAndDecrement(r14);
        if (r16 > r15) goto L15;
        Object r17 = j15.a;
        xe0 r18 = xe0.n;
        if (r16 > 0) goto L35;
        cz r19 = zz1.s(ya4.x(r0));
    L63:
        th = move-exception;
        r19.B();
        throw th;
    L22:
        if (r14.a(r19) == true) goto L29;
    L23:
        int r20 = u94.t.getAndDecrement(r14);     // Catch: Throwable -> L63
        if (r20 > r15) goto L23;
        if (r20 > 0) goto L26;
        if (r14.a(r19) == false) goto L23;
    L26:
        r19.k(r17, r14.o);     // Catch: Throwable -> L63
    L29:
        Object r21 = r19.q();
        if (r21 == r18) goto L33;
        r21 = r17;
    L33:
        if (r21 != r18) goto L35;
        r17 = r21;
    L35:
        if (r17 != r18) goto L68;
        return r18;
    L7:
        r0 = new vn3(this, r8);
        goto L8
    }

    public final void b() {
        ReentrantLock r0 = this.c;
        r0.lock();
        this.e = true;     // Catch: Throwable -> L9
        sa0[] r4 = this.f;     // Catch: Throwable -> L9
        int r1 = r4.length;     // Catch: Throwable -> L9
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L12;
        sa0 r3 = r4[r2];     // Catch: Throwable -> L9
        if (r3 == null) goto L11;
        r3.close();     // Catch: Throwable -> L9
    L11:
        r2 = r2 + 1;
        goto L4
    L12:
        r0.unlock();
        return;
    L9:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public final void c(StringBuilder r13) {
        x20 r1 = this.h;
        ReentrantLock r2 = this.c;
        r2.lock();
        qb2 r3 = gb.r();     // Catch: Throwable -> L9
        int r4 = (r1.b - r1.a) & r1.c;     // Catch: Throwable -> L9
        int r5 = 0;
        int r6 = 0;
    L4:
        if (r6 >= r4) goto L13;
        if (r6 < 0) goto L12;
        int r7 = r1.b;     // Catch: Throwable -> L9
        int r8 = r1.a;     // Catch: Throwable -> L9
        int r9 = r1.c;     // Catch: Throwable -> L9
        if (r6 >= ((r7 - r8) & r9)) goto L12;
        Object r10 = ((Object[]) r1.d)[(r8 + r6) & r9];     // Catch: Throwable -> L9
        r10.getClass();     // Catch: Throwable -> L9
        r3.add(r10);     // Catch: Throwable -> L9
        r6 = r6 + 1;     // Catch: Throwable -> L9
    L12:
        throw new ArrayIndexOutOfBoundsException();     // Catch: Throwable -> L9
    L13:
        qb2 r11 = gb.f(r3);     // Catch: Throwable -> L9
        r13.append('\t' + toString() + " (");     // Catch: Throwable -> L9
        r13.append("capacity=" + this.a + ", ");     // Catch: Throwable -> L9
        StringBuilder r12 = new StringBuilder();     // Catch: Throwable -> L9
        r12.append("permits=");     // Catch: Throwable -> L9
        v94 r14 = this.g;     // Catch: Throwable -> L9
        r14.getClass();     // Catch: Throwable -> L9
        r12.append(Math.max(u94.t.get(r14), 0));     // Catch: Throwable -> L9
        r12.append(", ");     // Catch: Throwable -> L9
        r13.append(r12.toString());     // Catch: Throwable -> L9
        r13.append("queue=(size=" + r11.a() + ")[" + q40.B0(r11, null, null, null, null, 63) + "], ");     // Catch: Throwable -> L9
        r13.append(")");     // Catch: Throwable -> L9
        r13.append('\n');     // Catch: Throwable -> L9
        sa0[] r15 = this.f;     // Catch: Throwable -> L9
        int r16 = r15.length;     // Catch: Throwable -> L9
        int r17 = 0;
    L14:
        if (r5 >= r16) goto L23;
        sa0 r18 = r15[r5];     // Catch: Throwable -> L9
        r17 = r17 + 1;     // Catch: Throwable -> L9
        StringBuilder r19 = new StringBuilder();     // Catch: Throwable -> L9
        r19.append("\t\t[");     // Catch: Throwable -> L9
        r19.append(r17);     // Catch: Throwable -> L9
        r19.append("] - ");     // Catch: Throwable -> L9
        if (r18 == null) goto L18;
        String r20 = r18.n.toString();     // Catch: Throwable -> L9
    L19:
        r19.append(r20);     // Catch: Throwable -> L9
        r13.append(r19.toString());     // Catch: Throwable -> L9
        r13.append('\n');     // Catch: Throwable -> L9
        if (r18 == null) goto L22;
        r18.j(r13);     // Catch: Throwable -> L9
    L22:
        r5 = r5 + 1;
        goto L14
    L18:
        r20 = null;
        goto L19
    L23:
        r2.unlock();
        return;
    L9:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    public final void d(sa0 r3) {
        r3.getClass();
        ReentrantLock r0 = this.c;
        r0.lock();
        this.h.a(r3);     // Catch: Throwable -> L6
        r0.unlock();
        this.g.c();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }
}
