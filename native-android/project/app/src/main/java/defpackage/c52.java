package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c52 implements kk1 {
    public ArrayList a;

    public c52(z40 r14) {
        r14.getClass();
        rr r0 = new rr((xb0) r14.o, 0);
        rr r1 = new rr((sr) r14.p);
        rr r3 = new rr((xb0) r14.r, 4);
        xb0 r6 = (xb0) r14.q;
        rr r4 = new rr(r6, 2);
        rr r8 = new rr(r6, 3);
        n53 r10 = new n53(r6);
        m53 r11 = new m53(r6);
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Context r15 = (Context) r14.n;
        String r7 = lc5.a;
        r15.getClass();
        Object r16 = r15.getSystemService("connectivity");
        r16.getClass();
        p53 r9 = new p53((ConnectivityManager) r16);
    L6:
        this.a = ti.i0(new jb0[]{r0, r1, r3, r4, r8, r10, r11, r9});
        return;
    L5:
        r9 = null;
        goto L6
    }

    public void a(ArrayList r4) {
        if (r4.isEmpty() == true) goto L7;
        int r0 = r4.size();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        Object r2 = r4.get(r1);
        r1 = r1 + 1;
        b((String) r2);
        goto L5
    L9:
        return;
    }

    public void b(String r2) {
        if (r2 != null) goto L4;
        kf2.n("category must not be null");
        return;
    L4:
        if (this.a != null) goto L7;
        this.a = new ArrayList();
    L7:
        if (this.a.contains(r2) == true) goto L12;
        this.a.add(r2);
        return;
    }

    public boolean c(dd5 r9) {
        ArrayList r8 = this.a;
        ArrayList r0 = new ArrayList();
        int r1 = r8.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Object r3 = r8.get(r2);
        r2 = r2 + 1;
        if (((jb0) r3).a(r9) == false) goto L3;
        r0.add(r3);
        goto L3
    L8:
        if (r0.isEmpty() == true) goto L11;
        cx.f().b(lc5.a, "Work " + r9.a + " constrained by " + q40.B0(r0, null, null, null, k5.C, 31));
    L11:
        return r0.isEmpty();
    }

    public rq2 d() {
        if (this.a == null) goto L5;
        Bundle r0 = new Bundle();
        r0.putStringArrayList("controlCategories", this.a);
        return new rq2(r0, this.a);
    L5:
        return rq2.c;
    }

    public synchronized ArrayList e(Class r8, Class r9) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L8
        if (r9.isAssignableFrom(r8) == false) goto L10;
        r0.add(r9);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r0;
    L10:
        ArrayList r1 = this.a;     // Catch: Throwable -> L8
        int r2 = r1.size();     // Catch: Throwable -> L8
        int r4 = 0;
    L11:
        if (r4 >= r2) goto L23;
        Object r5 = r1.get(r4);     // Catch: Throwable -> L8
        r4 = r4 + 1;     // Catch: Throwable -> L8
        nw4 r6 = (nw4) r5;     // Catch: Throwable -> L8
        if (r6.a.isAssignableFrom(r8) == true) goto L15;
    L17:
        boolean r7 = false;
    L18:
        if (r7 == false) goto L11;
        if (r0.contains(r6.b) == true) goto L11;
        r0.add(r6.b);     // Catch: Throwable -> L8
        goto L11
    L15:
        if (r9.isAssignableFrom(r6.b) == false) goto L17;
        r7 = true;
        goto L18
    L23:
        monitor-exit(this);
        return r0;
    L8:
        th = move-exception;
        throw th;
    }

    public p81 f(dd5 r7) {
        r7.getClass();
        ArrayList r6 = this.a;
        ArrayList r0 = new ArrayList();
        int r1 = r6.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L7;
        Object r4 = r6.get(r3);
        r3 = r3 + 1;
        if (((jb0) r4).c(r7) == false) goto L3;
        r0.add(r4);
        goto L3
    L7:
        ArrayList r8 = new ArrayList(r40.k0(r0, 10));
        int r2 = r0.size();
        int r5 = 0;
    L8:
        if (r5 >= r2) goto L11;
        Object r9 = r0.get(r5);
        r5 = r5 + 1;
        r8.add(((jb0) r9).b(r7.j));
        goto L8
    L11:
        return ya4.m(new gc0(2, (p81[]) q40.Q0(r8).toArray(new p81[0])));
    }

    @Override // defpackage.kk1
    public Object keyOf(Object r1) {
        return (String) r1;
    }

    @Override // defpackage.kk1
    public Iterator sourceIterator() {
        return this.a.iterator();
    }
}
