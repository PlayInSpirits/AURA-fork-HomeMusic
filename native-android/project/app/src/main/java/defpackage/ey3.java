package defpackage;

import com.bumptech.glide.Registry$NoImageHeaderParserException;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey3 {
    public final rf2 a;
    public final hg3 b;
    public final rf2 c;
    public final b52 d;
    public final zh0 e;
    public final c52 f;
    public final xv1 g;
    public final qr2 h;
    public final gd2 i;
    public final i61 j;

    public ey3() {
        this.h = new qr2(13);
        this.i = new gd2();
        i61 r4 = new i61(new ko3(20), new y41(4), new y41(5), 5);
        this.j = r4;
        tv1 r2 = na4.r;
        na4 r1 = new na4();
        r1.n = new ArrayList();
        r1.p = new HashSet();
        r1.q = r4;
        r1.o = r2;
        rf2 r0 = new rf2();
        int r5 = 0;
        r0.o = new om1(12, (byte) 0);
        r0.n = r1;
        this.a = r0;
        this.b = new hg3(16);
        this.c = new rf2(19);
        this.d = new b52();
        this.e = new zh0(0);
        c52 r3 = new c52();
        r3.a = new ArrayList();
        this.f = r3;
        this.g = new xv1(0);
        List r6 = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList r7 = new ArrayList(r6.size());
        r7.add("legacy_prepend_all");
        Iterator r8 = r6.iterator();
    L4:
        if (r8.hasNext() == false) goto L6;
        r7.add((String) r8.next());
        goto L4
    L6:
        r7.add("legacy_append");
        rf2 r9 = this.c;
        monitor-enter(r9);
        ArrayList r10 = new ArrayList((ArrayList) r9.n);     // Catch: Throwable -> L11
        ((ArrayList) r9.n).clear();     // Catch: Throwable -> L11
        int r11 = r7.size();     // Catch: Throwable -> L11
        int r12 = 0;
    L9:
        if (r12 >= r11) goto L13;
        Object r13 = r7.get(r12);     // Catch: Throwable -> L11
        r12 = r12 + 1;     // Catch: Throwable -> L11
        ((ArrayList) r9.n).add((String) r13);     // Catch: Throwable -> L11
        goto L9
    L13:
        int r14 = r10.size();     // Catch: Throwable -> L11
    L14:
        if (r5 >= r14) goto L19;
        Object r15 = r10.get(r5);     // Catch: Throwable -> L11
        r5 = r5 + 1;     // Catch: Throwable -> L11
        String r16 = (String) r15;     // Catch: Throwable -> L11
        if (r7.contains(r16) == true) goto L14;
        ((ArrayList) r9.n).add(r16);     // Catch: Throwable -> L11
        goto L14
    L19:
        monitor-exit(r9);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final void a(Class r3, c11 r4) {
        hg3 r2 = this.b;
        monitor-enter(r2);
        ((ArrayList) r2.o).add(new d11(r3, r4));     // Catch: Throwable -> L7
        monitor-exit(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void b(Class r3, w04 r4) {
        b52 r2 = this.d;
        monitor-enter(r2);
        r2.a.add(new x04(r3, r4));     // Catch: Throwable -> L7
        monitor-exit(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void c(Class r2, Class r3, vw2 r4) {
        rf2 r1 = this.a;
        monitor-enter(r1);
        ((na4) r1.n).e(r2, r3, r4);     // Catch: Throwable -> L7
        ((HashMap) ((om1) r1.o).o).clear();     // Catch: Throwable -> L7
        monitor-exit(r1);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void d(String r2, Class r3, Class r4, t04 r5) {
        rf2 r1 = this.c;
        monitor-enter(r1);
        r1.d(r2).add(new u04(r3, r4, r5));     // Catch: Throwable -> L7
        monitor-exit(r1);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final ArrayList e() {
        xv1 r1 = this.g;
        monitor-enter(r1);
        ArrayList r0 = r1.a;     // Catch: Throwable -> L11
        monitor-exit(r1);
        if (r0.isEmpty() == true) goto L10;
        return r0;
    L10:
        throw new Registry$NoImageHeaderParserException();
    L11:
        th = move-exception;
        throw th;
    }

    public final List f(Object r8) {
        rf2 r7 = this.a;
        r7.getClass();
        Class<?> r0 = r8.getClass();
        monitor-enter(r7);
        ww2 r1 = (ww2) ((HashMap) ((om1) r7.o).o).get(r0);     // Catch: Throwable -> L14
        if (r1 != null) goto L7;
        List r2 = null;
    L8:
        if (r2 != null) goto L16;
        r2 = Collections.unmodifiableList(((na4) r7.n).h(r0));     // Catch: Throwable -> L14
        if (((ww2) ((HashMap) ((om1) r7.o).o).put(r0, new ww2(r2))) == null) goto L16;
        throw new IllegalStateException("Already cached loaders for model: " + r0);     // Catch: Throwable -> L14
    L16:
        monitor-exit(r7);
        if (r2.isEmpty() == true) goto L33;
        int r9 = r2.size();
        List r3 = Collections.EMPTY_LIST;
        boolean r4 = true;
        int r5 = 0;
    L20:
        if (r5 >= r9) goto L28;
        uw2 r6 = (uw2) r2.get(r5);
        if (r6.a(r8) == false) goto L26;
        if (r4 == false) goto L25;
        r3 = new ArrayList(r9 - r5);
        r4 = false;
    L25:
        r3.add(r6);
    L26:
        r5 = r5 + 1;
        goto L20
    L28:
        if (r3.isEmpty() == true) goto L31;
        return r3;
    L31:
        throw new Registry$NoModelLoaderAvailableException("Found ModelLoaders for model class: " + r2 + ", but none that handle this specific model instance: " + r8);
    L33:
        throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + r8.getClass());
    L7:
        r2 = r1.a;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    public final yh0 g(Object r6) {
        zh0 r5 = this.e;
        monitor-enter(r5);
        h12.e(r6);     // Catch: Throwable -> L12
        xh0 r0 = (xh0) ((HashMap) r5.o).get(r6.getClass());     // Catch: Throwable -> L12
        if (r0 != null) goto L14;
        Iterator r1 = ((HashMap) r5.o).values().iterator();     // Catch: Throwable -> L12
    L8:
        if (r1.hasNext() == false) goto L14;
        xh0 r2 = (xh0) r1.next();     // Catch: Throwable -> L12
        if (r2.a().isAssignableFrom(r6.getClass()) == false) goto L8;
        r0 = r2;
    L14:
        if (r0 != null) goto L16;
        r0 = zh0.p;     // Catch: Throwable -> L12
    L16:
        yh0 r7 = r0.b(r6);     // Catch: Throwable -> L12
        monitor-exit(r5);
        return r7;
    L12:
        th = move-exception;
        throw th;
    }

    public final void h(xh0 r3) {
        zh0 r2 = this.e;
        monitor-enter(r2);
        ((HashMap) r2.o).put(r3.a(), r3);     // Catch: Throwable -> L7
        monitor-exit(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void i(Class r3, Class r4, d14 r5) {
        c52 r2 = this.f;
        monitor-enter(r2);
        r2.a.add(new nw4(r3, r4, r5));     // Catch: Throwable -> L7
        monitor-exit(r2);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
