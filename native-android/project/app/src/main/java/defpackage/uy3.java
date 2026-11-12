package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uy3 {
    public Set a;
    public x80 b;
    public final f13 c;
    public x03 d;
    public f13 e;
    public final f13 f;
    public final f13 g;
    public x03 h;
    public w03 i;
    public ArrayList j;
    public x03 k;

    public uy3() {
        f13 r0 = new f13(new wg1[16]);
        this.c = r0;
        x03 r2 = w54.a;
        this.d = new x03();
        this.e = r0;
        this.f = new f13(new Object[16]);
        this.g = new f13(new gf1[16]);
    }

    public static final boolean f(wg1 r5, f13 r6) {
        Object[] r0 = r6.n;
        int r7 = r6.p;
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L14;
        vy3 r3 = ((wg1) r0[r2]).a;
        if ((r3 instanceof ff3) == false) goto L13;
        f13 r4 = ((ff3) r3).o;
        if (r4.j(r5) == true) goto L11;
        if (f(r5, r4) == false) goto L13;
        return true;
    L11:
        return true;
    L13:
        r2 = r2 + 1;
        goto L3
    L14:
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        f13 r1 = this.c;
        r1.g();
        this.d.b();
        this.e = r1;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set r1 = this.a;
        if (r1 != null) goto L6;
        return;
    L6:
        if (r1.isEmpty() == true) goto L18;
        Trace.beginSection("Compose:abandons");
        Iterator r2 = r1.iterator();     // Catch: Throwable -> L15
    L10:
        if (r2.hasNext() == false) goto L13;
        vy3 r0 = (vy3) r2.next();     // Catch: Throwable -> L15
        r2.remove();     // Catch: Throwable -> L15
        r0.a();     // Catch: Throwable -> L15
        goto L10
    L13:
        Trace.endSection();
        return;
    L15:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final void c() {
        Set r0 = this.a;
        if (r0 == null) goto L68;
        this.k = null;
        f13 r1 = this.f;
        int r3 = 4;
        if (r1.p == 0) goto L33;
        Trace.beginSection("Compose:onForgotten");
        x03 r2 = this.h;     // Catch: Throwable -> L30
        int r4 = r1.p;     // Catch: Throwable -> L30
    L9:
        r4 = r4 - 1;     // Catch: Throwable -> L30
        if ((-1) >= r4) goto L29;
        Object r5 = r1.n[r4];     // Catch: Throwable -> L30
        if ((r5 instanceof wg1) == false) goto L18;
        vy3 r6 = ((wg1) r5).a;     // Catch: Throwable -> L15
        r0.remove(r6);     // Catch: Throwable -> L15
        r6.c();     // Catch: Throwable -> L15
    L18:
        if ((r5 instanceof u70) == false) goto L9;
        if (r2 != null) goto L21;
    L23:
        ((u70) r5).b();     // Catch: Throwable -> L15
        goto L9
    L21:
        if (r2.c(r5) == false) goto L23;
        ((u70) r5).a();     // Catch: Throwable -> L15
        goto L9
    L15:
        th = move-exception;
        x80 r7 = this.b;     // Catch: Throwable -> L30
        if (r7 == null) goto L28;
        si0.T(th, new fa(r3, r7, r5));     // Catch: Throwable -> L30
    L28:
        throw th;     // Catch: Throwable -> L30
    L29:
        Trace.endSection();
    L30:
        th = move-exception;
        Trace.endSection();
        throw th;
    L33:
        f13 r8 = this.c;
        if (r8.p == 0) goto L54;
        Trace.beginSection("Compose:onRemembered");
        Set r9 = this.a;     // Catch: Throwable -> L51
        if (r9 == null) goto L49;
        Object[] r10 = r8.n;     // Catch: Throwable -> L51
        int r11 = r8.p;     // Catch: Throwable -> L51
        int r12 = 0;
    L40:
        if (r12 >= r11) goto L49;
        wg1 r13 = (wg1) r10[r12];     // Catch: Throwable -> L51
        vy3 r14 = r13.a;     // Catch: Throwable -> L51
        r9.remove(r14);     // Catch: Throwable -> L51
        r14.d();     // Catch: Throwable -> L44
        r12 = r12 + 1;
        goto L40
    L44:
        th = move-exception;
        x80 r15 = this.b;     // Catch: Throwable -> L51
        if (r15 == null) goto L48;
        si0.T(th, new fa(r3, r15, r13));     // Catch: Throwable -> L51
    L48:
        throw th;     // Catch: Throwable -> L51
    L49:
        Trace.endSection();
        return;
    L51:
        th = move-exception;
        Trace.endSection();
        throw th;
    L54:
        return;
    }

    public final void d() {
        f13 r4 = this.g;
        if (r4.p == 0) goto L14;
        Trace.beginSection("Compose:sideeffects");
        Object[] r0 = r4.n;     // Catch: Throwable -> L11
        int r1 = r4.p;     // Catch: Throwable -> L11
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        ((gf1) r0[r2]).invoke();     // Catch: Throwable -> L11
        r2 = r2 + 1;     // Catch: Throwable -> L11
        goto L6
    L8:
        r4.g();     // Catch: Throwable -> L11
        Trace.endSection();
        return;
    L11:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final void e(wg1 r3) {
        if (this.d.c(r3) == false) goto L15;
        this.d.l(r3);
        if (this.e.j(r3) == true) goto L10;
        f13 r0 = this.c;
        if (r0.j(r3) == true) goto L10;
        f(r3, r0);
    L10:
        Set r2 = this.a;
        if (r2 == null) goto L23;
        r2.add(r3.a);
        return;
    L23:
        return;
    L15:
        x03 r1 = this.k;
        if (r1 != null) goto L18;
    L21:
        this.f.b(r3);
        return;
    L18:
        if (r1.c(r3) == false) goto L21;
    }

    public final void g(Set r1, x80 r2) {
        a();
        this.a = r1;
        this.b = r2;
    }
}
