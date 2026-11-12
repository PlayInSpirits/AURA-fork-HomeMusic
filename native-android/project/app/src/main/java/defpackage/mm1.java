package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 implements du0 {
    public final long a;
    public final long b;
    public final ii0 c;
    public final ce3 d;
    public final ArrayList e;
    public final kx f;
    public final se4 g;
    public final px h;
    public final Executor i;
    public final long j;
    public final ArrayList k;
    public volatile boolean l;

    public mm1(gn2 r2, ce3 r3, kx r4, Executor r5, long r6, long r8, long r10) {
        bn2 r7 = r2.b;
        r7.getClass();
        this.c = d(r7.a);
        this.d = r3;
        this.e = new ArrayList(r7.e);
        this.f = r4;
        this.i = r5;
        this.a = r8;
        this.b = r10;
        se4 r9 = r4.n;
        r9.getClass();
        this.g = r9;
        this.h = r4.p;
        this.k = new ArrayList();
        this.j = f35.Q(r6);
    }

    public static void c(ym1 r9, vm1 r10, HashSet r11, ArrayList r12) {
        String r0 = r9.a;
        long r1 = r9.h + r10.r;
        String r13 = r10.t;
        if (r13 == null) goto L7;
        Uri r14 = jz4.H(r0, r13);
        if (r11.add(r14) == false) goto L7;
        r12.add(new x84(r1, d(r14)));
    L7:
        r12.add(new x84(r1, new ii0(jz4.H(r0, r10.n), r10.v, r10.w)));
    }

    public static ii0 d(Uri r13) {
        Map r6 = Collections.EMPTY_MAP;
        rr2.s(r13, "The uri must be set.");
        return new ii0(r13, 0, 1, null, r6, 0, -1, null, 1);
    }

    public static void g(ArrayList r21, px r22, long r23) {
        HashMap r1 = new HashMap();
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r21.size()) goto L33;
        x84 r4 = (x84) r21.get(r2);
        ii0 r5 = r4.o;
        String r7 = r22.d(r5);
        Integer r8 = (Integer) r1.get(r7);
        if (r8 != null) goto L8;
        x84 r9 = null;
    L9:
        if (r9 == null) goto L31;
        long r10 = r9.n;
        ii0 r11 = r9.o;
        if (r4.n > (r10 + r23)) goto L31;
        Uri r12 = r11.a;
        long r13 = r11.g;
        if (r12.equals(r5.a) == false) goto L31;
        long r15 = -1;
        if (r13 == (-1)) goto L31;
        if ((r11.f + r13) != r5.f) goto L31;
        if (Objects.equals(r11.h, r5.h) == false) goto L31;
        if (r11.i != r5.i) goto L31;
        if (r11.c != r5.c) goto L31;
        if (r11.e.equals(r5.e) == false) goto L31;
        long r6 = r5.g;
        if (r6 == (-1)) goto L30;
        r15 = r13 + r6;
    L30:
        ii0 r14 = r11.b(0, r15);
        r8.getClass();
        r21.set(r8.intValue(), new x84(r10, r14));
    L32:
        r2 = r2 + 1;
    L31:
        r1.put(r7, Integer.valueOf(r3));
        r21.set(r3, r4);
        r3 = r3 + 1;
        goto L32
    L8:
        r9 = (x84) r21.get(r8.intValue());
        goto L9
    L33:
        f35.X(r21, r3, r21.size());
    }

    @Override // defpackage.du0
    public final void a(kt0 r26) {
        ArrayDeque r2 = new ArrayDeque();
        ArrayDeque r3 = new ArrayDeque();
        lx r0 = this.f.b();     // Catch: Throwable -> L6
        dn1 r6 = e(r0, this.c, false);     // Catch: Throwable -> L6
        if (this.e.isEmpty() == true) goto L8;
        r6 = (dn1) r6.a(this.e);     // Catch: Throwable -> L6
    L8:
        ArrayList r1 = f(r0, r6, false);     // Catch: Throwable -> L6
        Collections.sort(r1);     // Catch: Throwable -> L6
        g(r1, this.h, this.j);     // Catch: Throwable -> L6
        int r13 = r1.size();     // Catch: Throwable -> L6
        int r7 = r1.size() - 1;     // Catch: Throwable -> L6
        int r16 = 0;
        long r11 = 0;
        long r14 = 0;
    L9:
        if (r7 < 0) goto L25;
        ii0 r8 = ((x84) r1.get(r7)).o;     // Catch: Throwable -> L6
        String r9 = this.h.d(r8);     // Catch: Throwable -> L6
        long r10 = r8.g;     // Catch: Throwable -> L6
        if (r10 != (-1)) goto L15;
        long r17 = nd0.a(this.g.i(r9));     // Catch: Throwable -> L6
        if (r17 == (-1)) goto L15;
        r10 = r17 - r8.f;     // Catch: Throwable -> L6
    L15:
        long r20 = r10;
        long r12 = this.g.g(r8.f, r20, r9);     // Catch: Throwable -> L6
        r14 = r14 + r12;     // Catch: Throwable -> L6
        if (r20 != (-1)) goto L18;
        r11 = -1;
    L24:
        r7 = r7 - 1;     // Catch: Throwable -> L6
        goto L9
    L18:
        if (r20 != r12) goto L21;
        r16 = r16 + 1;     // Catch: Throwable -> L6
        r1.remove(r7);     // Catch: Throwable -> L6
    L21:
        if (r11 == (-1)) goto L24;
        r11 = r11 + r20;     // Catch: Throwable -> L6
        goto L24
    L25:
        w84 r15 = new w84(r26, r11, r13, r14, r16);     // Catch: Throwable -> L6
        r2.addAll(r1);     // Catch: Throwable -> L6
    L27:
        if (this.l == true) goto L61;
        if (r2.isEmpty() == true) goto L61;
        if (r3.isEmpty() == true) goto L33;
        y84 r4 = (y84) r3.removeFirst();     // Catch: Throwable -> L6
        lx r5 = r4.v;     // Catch: Throwable -> L6
        byte[] r18 = r4.x;     // Catch: Throwable -> L6
    L34:
        y84 r19 = new y84((x84) r2.removeFirst(), r5, r15, r18);     // Catch: Throwable -> L6
        b(r19);     // Catch: Throwable -> L6
        this.i.execute(r19);     // Catch: Throwable -> L6
        int r21 = this.k.size() - 1;     // Catch: Throwable -> L6
    L35:
        if (r21 < 0) goto L59;
        y84 r22 = (y84) this.k.get(r21);     // Catch: Throwable -> L6
        if (r2.isEmpty() == true) goto L80;
        q90 r23 = r22.o;     // Catch: Throwable -> L6
        monitor-enter(r23);     // Catch: Throwable -> L6
        boolean r24 = r23.b;     // Catch: Throwable -> L44
        monitor-exit(r23);     // Catch: Throwable -> L6
        if (r24 == true) goto L80;
    L53:
        r21 = r21 - 1;     // Catch: Throwable -> L6
        goto L35
    L44:
        th = move-exception;
        throw th;     // Catch: Throwable -> L6
    L80:
        r22.get();     // Catch: Throwable -> L6 ExecutionException -> L49
        h(r21);     // Catch: Throwable -> L6 ExecutionException -> L49
        r3.addLast(r22);     // Catch: Throwable -> L6 ExecutionException -> L49
    L49:
        e = move-exception;
        Throwable r25 = e.getCause();     // Catch: Throwable -> L6
        r25.getClass();     // Catch: Throwable -> L6
        if ((r25 instanceof PriorityTaskManager$PriorityTooLowException) == false) goto L55;
        r2.addFirst(r22.u);     // Catch: Throwable -> L6
        h(r21);     // Catch: Throwable -> L6
        r3.addLast(r22);     // Catch: Throwable -> L6
        goto L53
    L55:
        if ((r25 instanceof IOException) == true) goto L58;
        throw r25;     // Catch: Throwable -> L6
    L58:
        throw ((IOException) r25);     // Catch: Throwable -> L6
    L59:
        r19.n.b();     // Catch: Throwable -> L6
        goto L27
    L33:
        r5 = this.f.b();     // Catch: Throwable -> L6
        r18 = new byte[131072];     // Catch: Throwable -> L6
    L61:
        int r27 = 0;
    L62:
        int r28 = this.k.size();
        ArrayList r29 = this.k;
        if (r27 >= r28) goto L65;
        ((w34) r29.get(r27)).cancel(true);
        r27 = r27 + 1;
        goto L62
    L65:
        int r30 = r29.size() - 1;
    L66:
        if (r30 < 0) goto L68;
        ((w34) this.k.get(r30)).a();
        h(r30);
        r30 = r30 - 1;
        goto L66
    L68:
        return;
    L6:
        th = move-exception;
        int r31 = 0;
    L70:
        int r32 = this.k.size();
        ArrayList r33 = this.k;
        if (r31 >= r32) goto L73;
        ((w34) r33.get(r31)).cancel(true);
        r31 = r31 + 1;
        goto L70
    L73:
        int r34 = r33.size() - 1;
    L74:
        if (r34 < 0) goto L76;
        ((w34) this.k.get(r34)).a();
        h(r34);
        r34 = r34 - 1;
        goto L74
    L76:
        throw th;
    }

    public final void b(w34 r3) {
        ArrayList r0 = this.k;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.l == true) goto L12;
        this.k.add(r3);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L12:
        throw new InterruptedException();     // Catch: Throwable -> L9
    }

    @Override // defpackage.du0
    public final void cancel() {
        ArrayList r0 = this.k;
        monitor-enter(r0);
        this.l = true;     // Catch: Throwable -> L9
        int r2 = 0;
    L7:
        if (r2 >= this.k.size()) goto L11;
        ((w34) this.k.get(r2)).cancel(true);     // Catch: Throwable -> L9
        r2 = r2 + 1;     // Catch: Throwable -> L9
        goto L7
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public final dn1 e(lx r4, ii0 r5, boolean r6) {
        if (r6 == false) goto L14;
        v84 r7 = new v84(this, r4, r5);
        r7.run();
        Object r3 = r7.get();     // Catch: ExecutionException -> L6
    L19:
        return (dn1) r3;
    L6:
        e = move-exception;
        Throwable r8 = e.getCause();
        r8.getClass();
        if ((r8 instanceof IOException) == true) goto L12;
        String r9 = f35.a;
        throw e;
    L12:
        throw ((IOException) r8);
    L14:
        if (this.l == true) goto L35;
        v84 r10 = new v84(this, r4, r5);
        b(r10);
        this.i.execute(r10);
        Object r11 = r10.get();     // Catch: Throwable -> L20 ExecutionException -> L22
    L17:
        r10.a();
        i(r10);
        r3 = r11;
    L22:
        e = move-exception;
        Throwable r1 = e.getCause();     // Catch: Throwable -> L20
        r1.getClass();     // Catch: Throwable -> L20
        if ((r1 instanceof PriorityTaskManager$PriorityTooLowException) == false) goto L27;
        r10.a();
        i(r10);
        goto L14
    L27:
        if ((r1 instanceof IOException) == true) goto L31;
        String r12 = f35.a;     // Catch: Throwable -> L20
        throw e;     // Catch: Throwable -> L20
    L31:
        throw ((IOException) r1);     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        r10.a();
        i(r10);
        throw th;
    L35:
        throw new InterruptedException();
    }

    public final ArrayList f(lx r23, dn1 r24, boolean r25) {
        ArrayList r3 = new ArrayList();
        if ((r24 instanceof cn1) == false) goto L8;
        List r0 = ((cn1) r24).d;
        int r4 = 0;
    L6:
        if (r4 >= r0.size()) goto L9;
        r3.add(d((Uri) r0.get(r4)));
        r4 = r4 + 1;
    L9:
        ArrayList r5 = new ArrayList();
        HashSet r6 = new HashSet();
        int r7 = r3.size();
        int r1 = 0;
    L10:
        if (r1 >= r7) goto L44;
        int r9 = r1 + 1;
        ii0 r8 = (ii0) r3.get(r1);
        long r10 = 0;
        r5.add(new x84(0, r8));
        ym1 r2 = (ym1) e(r23, r8, r25);     // Catch: IOException -> L39
        yw1 r11 = r2.r;
        if (r25 != 0) goto L17;
        r10 = this.a;
    L17:
        if (r25 == false) goto L19;
        long r13 = -9223372036854775807L;
        long r15 = -9223372036854775807L;
    L20:
        long r18 = r15;
        vm1 r12 = null;
        int r16 = 0;
    L22:
        if (r16 >= r11.size()) goto L37;
        vm1 r14 = (vm1) r11.get(r16);
        ArrayList r17 = r3;
        long r19 = r2.h + r14.r;
        if ((r19 + r14.p) <= r10) goto L36;
        if (r13 != r18) goto L29;
    L31:
        vm1 r20 = r14.o;
        if (r20 == null) goto L35;
        if (r20 == r12) goto L35;
        c(r2, r20, r6, r5);
        r12 = r20;
    L35:
        c(r2, r14, r6, r5);
        goto L36
    L29:
        if (r19 < (r10 + r13)) goto L31;
    L38:
        r1 = r9;
        r3 = r17;
    L36:
        r16 = r16 + 1;
        r3 = r17;
        goto L22
    L37:
        r17 = r3;
        goto L38
    L19:
        r15 = -9223372036854775807L;
        r13 = this.b;
    L39:
        e = move-exception;
        r17 = r3;
        if (r25 == true) goto L38;
        throw e;
    L44:
        return r5;
    L8:
        r3.add(d(Uri.parse(r24.a)));
        goto L9
    }

    public final void h(int r2) {
        ArrayList r0 = this.k;
        monitor-enter(r0);
        this.k.remove(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void i(w34 r2) {
        ArrayList r0 = this.k;
        monitor-enter(r0);
        this.k.remove(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.du0
    public final void remove() {
        se4 r0 = this.g;
        px r1 = this.h;
        ii0 r2 = this.c;
        kx r3 = this.f;
        lx r4 = r3.c(null, r3.s | 1);
        ArrayList r7 = f(r4, e(r4, r2, true), true);     // Catch: Throwable -> L8 Exception -> L18 InterruptedException -> L13
        int r5 = 0;
    L5:
        if (r5 >= r7.size()) goto L10;
        r0.m(r1.d(((x84) r7.get(r5)).o));     // Catch: Throwable -> L8 Exception -> L18 InterruptedException -> L13
        r5 = r5 + 1;
        goto L5
        goto L12
    L10:
        r0.m(r1.d(r2));
        return;
    L8:
        th = move-exception;
        r0.m(r1.d(r2));
        throw th;
    L13:
        Thread.currentThread().interrupt();     // Catch: Throwable -> L8
    L12:
        r0.m(r1.d(r2));
    }
}
