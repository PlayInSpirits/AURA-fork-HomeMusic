package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pq3 {
    public static final String l = null;
    public PowerManager.WakeLock a;
    public final Context b;
    public final r90 c;
    public final bq4 d;
    public final WorkDatabase e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashSet i;
    public final ArrayList j;
    public final Object k;

    static {
        l = cx.i("Processor");
    }

    public pq3(Context r1, r90 r2, bq4 r3, WorkDatabase r4) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.a = null;
        this.k = new Object();
        this.h = new HashMap();
    }

    public static boolean d(String r2, td5 r3, int r4) {
        String r0 = l;
        if (r3 == null) goto L6;
        r3.m.o(new WorkerStoppedException(r4));
        cx.f().b(r0, "WorkerWrapper interrupted for " + r2);
        return true;
    L6:
        cx.f().b(r0, "WorkerWrapper could not be found for " + r2);
        return false;
    }

    public final void a(w21 r2) {
        Object r0 = this.k;
        monitor-enter(r0);
        this.j.add(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final td5 b(String r6) {
        td5 r0 = (td5) this.f.remove(r6);
        if (r0 == null) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L8;
        r0 = (td5) this.g.remove(r6);
    L8:
        this.h.remove(r6);
        if (r1 == false) goto L28;
        Object r7 = this.k;
        monitor-enter(r7);
    L22:
        th = move-exception;
        throw th;
    L13:
        if (this.f.isEmpty() == false) goto L24;
        Context r2 = this.b;     // Catch: Throwable -> L22
        String r3 = wp4.w;     // Catch: Throwable -> L22
        Intent r4 = new Intent(r2, SystemForegroundService.class);     // Catch: Throwable -> L22
        r4.setAction("ACTION_STOP_FOREGROUND");     // Catch: Throwable -> L22
        this.b.startService(r4);     // Catch: Throwable -> L17
    L19:
        PowerManager.WakeLock r5 = this.a;     // Catch: Throwable -> L22
        if (r5 == null) goto L24;
        r5.release();     // Catch: Throwable -> L22
        this.a = null;     // Catch: Throwable -> L22
        goto L24
    L17:
        th = move-exception;
        cx.f().e(l, "Unable to stop foreground service", th);     // Catch: Throwable -> L22
    L24:
        monitor-exit(r7);     // Catch: Throwable -> L22
    L28:
        return r0;
    L5:
        r1 = false;
        goto L6
    }

    public final td5 c(String r2) {
        td5 r0 = (td5) this.f.get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return (td5) this.g.get(r2);
    }

    public final boolean e(String r2) {
        Object r0 = this.k;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (c(r2) == null) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    public final void f(w21 r2) {
        Object r0 = this.k;
        monitor-enter(r0);
        this.j.remove(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final boolean g(gl4 r12, z45 r13) {
        rc5 r0 = r12.a;
        final String r1 = r0.a;
        final ArrayList r9 = new ArrayList();
        dd5 r8 = (dd5) this.e.r(new oq3(this, r9, r1));
        int r2 = 12;
        if (r8 != null) goto L6;
        cx.f().k(l, "Didn't find WorkSpec for id " + r0);
        ((vc5) this.d.q).execute(new ur2(r2, this, r0));
        return false;
    L6:
        Object r10 = this.k;
        monitor-enter(r10);
    L13:
        th = move-exception;
        throw th;
    L9:
        if (e(r1) == false) goto L19;
        Set r3 = (Set) this.h.get(r1);     // Catch: Throwable -> L13
        if (((gl4) r3.iterator().next()).a.b != r0.b) goto L15;
        r3.add(r12);     // Catch: Throwable -> L13
        cx.f().b(l, "Work " + r0 + " is already enqueued for processing");     // Catch: Throwable -> L13
    L16:
        monitor-exit(r10);     // Catch: Throwable -> L13
        return false;
    L15:
        ((vc5) this.d.q).execute(new ur2(r2, this, r0));     // Catch: Throwable -> L13
        goto L16
    L19:
        if (r8.t == r0.b) goto L23;
        ((vc5) this.d.q).execute(new ur2(r2, this, r0));     // Catch: Throwable -> L13
        monitor-exit(r10);     // Catch: Throwable -> L13
        return false;
    L23:
        td5 r11 = new td5(new lv4(this.b, this.c, this.d, this, this.e, r8, r9));     // Catch: Throwable -> L13
        pe0 r14 = (pe0) r11.d.o;     // Catch: Throwable -> L13
        t22 r4 = gb.a();     // Catch: Throwable -> L13
        r14.getClass();     // Catch: Throwable -> L13
        ry r15 = bu.r(ya4.F(r14, r4), new qd5(r11, null, 1));     // Catch: Throwable -> L13
        r15.o.f(new qo2(this, r15, r11, 13), (vc5) this.d.q);     // Catch: Throwable -> L13
        this.g.put(r1, r11);     // Catch: Throwable -> L13
        HashSet r16 = new HashSet();     // Catch: Throwable -> L13
        r16.add(r12);     // Catch: Throwable -> L13
        this.h.put(r1, r16);     // Catch: Throwable -> L13
        monitor-exit(r10);     // Catch: Throwable -> L13
        cx.f().b(l, pq3.class.getSimpleName() + ": processing " + r0);
        return true;
    }
}
