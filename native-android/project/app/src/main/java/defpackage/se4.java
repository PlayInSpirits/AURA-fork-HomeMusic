package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class se4 {
    public static final HashSet k = null;
    public final File a;
    public final mx b;
    public final ml3 c;
    public final rf2 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public Cache$CacheException j;

    static {
        k = new HashSet();
    }

    public se4(File r6, mx r7, tk4 r8) {
        ml3 r0 = new ml3(r8, r6);
        if (r8 == null) goto L5;
        rf2 r2 = new rf2(r8);
    L7:
        monitor-enter(se4.class);
        boolean r3 = k.add(r6.getAbsoluteFile());     // Catch: Throwable -> L15
        monitor-exit(se4.class);
        if (r3 == false) goto L13;
        this.a = r6;
        this.b = r7;
        this.c = r0;
        this.d = r2;
        this.e = new HashMap();
        this.f = new Random();
        this.g = r7.e();
        this.h = -1;
        ConditionVariable r9 = new ConditionVariable();
        new re4(this, r9).start();
        r9.block();
        return;
    L13:
        er1.o(r6, "Another SimpleCache instance uses the folder: ");
        throw null;
    L15:
        th = move-exception;
        throw th;
    L5:
        r2 = null;
        goto L7
    }

    public static void a(se4 r13) {
        rf2 r0 = r13.d;
        ml3 r1 = r13.c;
        File r2 = r13.a;
        if (r2.exists() == false) goto L50;
    L8:
        File[] r3 = r2.listFiles();
        if (r3 != null) goto L12;
        String r4 = "Failed to list cache directory files: " + r2;
        l93.F("SimpleCache", r4);
        r13.j = new Cache$CacheException(r4);
        return;
    L12:
        int r5 = r3.length;
        int r7 = 0;
    L14:
        if (r7 >= r5) goto L22;
        File r10 = r3[r7];
        String r11 = r10.getName();
        if (r11.endsWith(".uid") == false) goto L21;
        long r6 = Long.parseLong(r11.substring(0, r11.indexOf(46)), 16);     // Catch: NumberFormatException -> L20
    L23:
        r13.h = r6;
        if (r6 == (-1)) goto L48;
    L45:
        r1.q(r13.h);     // Catch: IOException -> L32
        if (r0 == null) goto L34;
        r0.h(r13.h);     // Catch: IOException -> L32
        HashMap r8 = r0.c();     // Catch: IOException -> L32
        r13.k(r2, true, r3, r8);     // Catch: IOException -> L32
        r0.i(r8.keySet());     // Catch: IOException -> L32
    L35:
        o15 r14 = jx1.k(((HashMap) r1.a).keySet()).h();
    L37:
        if (r14.hasNext() == false) goto L46;
        r1.s((String) r14.next());
        goto L37
    L46:
        r1.u();     // Catch: IOException -> L41
        return;
    L41:
        e = move-exception;
        l93.G("SimpleCache", "Storing index file failed", e);
        return;
    L34:
        r13.k(r2, true, r3, null);     // Catch: IOException -> L32
    L32:
        e = move-exception;
        String r9 = "Failed to initialize cache indices: " + r2;
        l93.G("SimpleCache", r9, e);
        r13.j = new Cache$CacheException(r9, e);
        return;
    L48:
        r13.h = f(r2);     // Catch: IOException -> L27
    L27:
        e = move-exception;
        String r12 = "Failed to create cache UID: " + r2;
        l93.G("SimpleCache", r12, e);
        r13.j = new Cache$CacheException(r12, e);
        return;
    L20:
        l93.F("SimpleCache", "Malformed UID file: " + r10);
        r10.delete();
    L21:
        r7 = r7 + 1;
        goto L14
    L22:
        r6 = -1;
        goto L23
    L50:
        e(r2);     // Catch: Cache$CacheException -> L6
    L6:
        e = move-exception;
        r13.j = e;
    }

    public static void e(File r2) {
        if (r2.mkdirs() == false) goto L5;
        return;
    L5:
        if (r2.isDirectory() == true) goto L10;
        String r3 = "Failed to create cache directory: " + r2;
        l93.F("SimpleCache", r3);
        throw new Cache$CacheException(r3);
    }

    public static long f(File r7) {
        long r0 = new SecureRandom().nextLong();
        if (r0 != Long.MIN_VALUE) goto L5;
        long r1 = 0;
    L6:
        File r5 = new File(r7, Long.toString(r1, 16) + ".uid");
        if (r5.createNewFile() == false) goto L9;
        return r1;
    L9:
        tb4.d(r5, "Failed to create UID file: ");
        return 0;
    L5:
        r1 = Math.abs(r0);
        goto L6
    }

    public final void b(te4 r6) {
        String r0 = r6.n;
        this.c.m(r0).c.add(r6);
        this.i += r6.p;
        ArrayList r1 = (ArrayList) this.e.get(r0);
        if (r1 == null) goto L7;
        int r2 = r1.size() - 1;
    L5:
        if (r2 < 0) goto L7;
        ((mx) r1.get(r2)).b(this, r6);
        r2 = r2 - 1;
    L7:
        this.b.b(this, r6);
    }

    public final synchronized void c(String r3, xc5 r4) {
        monitor-enter(this);
        d();     // Catch: Throwable -> L9
        ml3 r0 = this.c;     // Catch: Throwable -> L9
        wx r5 = r0.m(r3);     // Catch: Throwable -> L9
        yj0 r1 = r5.e;     // Catch: Throwable -> L9
        yj0 r6 = r1.b(r4);     // Catch: Throwable -> L9
        r5.e = r6;     // Catch: Throwable -> L9
        if (r6.equals(r1) == true) goto L16;
        ((xx) r0.e).e(r5);     // Catch: Throwable -> L9
    L16:
        this.c.u();     // Catch: Throwable -> L9 IOException -> L11
        monitor-exit(this);
        return;
    L11:
        e = move-exception;
        throw new Cache$CacheException(e);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final synchronized void d() {
        monitor-enter(this);
        Cache$CacheException r0 = this.j;     // Catch: Throwable -> L8
        if (r0 != null) goto L7;
        monitor-exit(this);
        return;
    L7:
        throw r0;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public final synchronized long g(long r8, long r10, String r12) {
        monitor-enter(this);
        long r1 = Long.MAX_VALUE;
        if (r10 != (-1)) goto L6;
        long r11 = Long.MAX_VALUE;
    L8:
        if (r11 < 0) goto L11;
        r1 = r11;
    L11:
        long r5 = 0;
    L13:
        if (r8 >= r1) goto L24;
        long r13 = h(r8, r1 - r8, r12);     // Catch: Throwable -> L20
        if (r13 <= 0) goto L18;
        r5 = r5 + r13;     // Catch: Throwable -> L20
    L19:
        r8 = r8 + r13;     // Catch: Throwable -> L20
        goto L13
    L18:
        r13 = -r13;
    L20:
        th = move-exception;
        throw th;
    L24:
        monitor-exit(this);
        return r5;
    L6:
        r11 = r10 + r8;
        goto L8
    }

    public final synchronized long h(long r3, long r5, String r7) {
        monitor-enter(this);
        if (r5 != (-1)) goto L17;
        r5 = Long.MAX_VALUE;
    L17:
        wx r8 = this.c.l(r7);     // Catch: Throwable -> L10
        if (r8 == null) goto L12;
        long r4 = r8.a(r3, r5);     // Catch: Throwable -> L10
    L13:
        monitor-exit(this);
        return r4;
    L12:
        r4 = -r5;
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized yj0 i(String r2) {
        monitor-enter(this);
        wx r3 = this.c.l(r2);     // Catch: Throwable -> L9
        if (r3 == null) goto L6;
        yj0 r4 = r3.e;     // Catch: Throwable -> L9
    L7:
        monitor-exit(this);
        return r4;
    L6:
        r4 = yj0.c;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final synchronized boolean j(String r3, long r4) {
        monitor-enter(this);
        wx r5 = this.c.l(r3);     // Catch: Throwable -> L9
        if (r5 == null) goto L11;
        if (r5.a(0, r4) < r4) goto L11;
        boolean r6 = true;
    L12:
        monitor-exit(this);
        return r6;
    L11:
        r6 = false;
    L9:
        th = move-exception;
        throw th;
    }

    public final void k(File r9, boolean r10, File[] r11, Map r12) {
        if (r11 != null) goto L4;
    L31:
        if (r10 == true) goto L40;
        r9.delete();
        return;
    L40:
        return;
    L4:
        if (r11.length == 0) goto L31;
        int r13 = r11.length;
        int r1 = 0;
    L7:
        if (r1 >= r13) goto L41;
        File r2 = r11[r1];
        String r3 = r2.getName();
        if (r10 == true) goto L11;
    L13:
        if (r10 == true) goto L15;
    L19:
        if (r12 == null) goto L21;
        nx r4 = (nx) r12.remove(r3);
    L22:
        if (r4 == null) goto L25;
        long r5 = r4.a;
        long r6 = r4.b;
    L26:
        te4 r7 = te4.b(r2, r5, r6, this.c);
        if (r7 == null) goto L29;
        b(r7);
    L30:
        r1 = r1 + 1;
        goto L7
    L29:
        r2.delete();
        goto L30
    L25:
        r5 = -1;
        r6 = -9223372036854775807L;
        goto L26
    L21:
        r4 = null;
        goto L22
    L15:
        if (r3.startsWith("cached_content_index.exi") == true) goto L30;
        if (r3.endsWith(".uid") == false) goto L19;
    L11:
        if (r3.indexOf(46) != (-1)) goto L13;
        k(r2, false, r2.listFiles(), r12);
        goto L30
    }

    public final synchronized void l(te4 r7) {
        monitor-enter(this);
        wx r0 = this.c.l(r7.n);     // Catch: Throwable -> L11
        r0.getClass();     // Catch: Throwable -> L11
        long r1 = r7.o;     // Catch: Throwable -> L11
        ArrayList r8 = r0.d;     // Catch: Throwable -> L11
        int r3 = 0;
    L5:
        if (r3 >= r8.size()) goto L15;
        if (((vx) r8.get(r3)).a == r1) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        r8.remove(r3);     // Catch: Throwable -> L11
        this.c.s(r0.b);     // Catch: Throwable -> L11
        notifyAll();     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L15:
        throw new IllegalStateException();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final synchronized void m(String r2) {
        monitor-enter(this);
        monitor-enter(this);     // Catch: Throwable -> L19
        wx r3 = this.c.l(r2);     // Catch: Throwable -> L10
        if (r3 != null) goto L7;
    L12:
        TreeSet r0 = new TreeSet();     // Catch: Throwable -> L10
    L13:
        monitor-exit(this);     // Catch: Throwable -> L19
        Iterator r4 = r0.iterator();     // Catch: Throwable -> L19
    L16:
        if (r4.hasNext() == false) goto L21;
        n((te4) r4.next());     // Catch: Throwable -> L19
        goto L16
    L21:
        monitor-exit(this);
        return;
    L7:
        if (r3.c.isEmpty() == true) goto L12;
        r0 = new TreeSet(r3.c);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    public final void n(te4 r8) {
        String r0 = r8.n;
        File r1 = r8.r;
        ml3 r2 = this.c;
        wx r3 = r2.l(r0);
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.c.remove(r8) == false) goto L31;
        if (r1 == null) goto L8;
        r1.delete();
    L8:
        this.i -= r8.p;
        rf2 r4 = this.d;
        if (r4 == null) goto L18;
        r1.getClass();
        String r5 = r1.getName();
        ((String) r4.o).getClass();     // Catch: IOException -> L17
        ((tk4) r4.n).getWritableDatabase().delete((String) r4.o, "name = ?", new String[]{r5});     // Catch: SQLException -> L14 IOException -> L17
    L14:
        e = move-exception;
        throw new DatabaseIOException(e);     // Catch: IOException -> L17
    L17:
        xa3.s("Failed to remove file index entry for: ", r5, "SimpleCache");
    L18:
        r2.s(r3.b);
        ArrayList r6 = (ArrayList) this.e.get(r8.n);
        if (r6 == null) goto L23;
        int r7 = r6.size() - 1;
    L21:
        if (r7 < 0) goto L23;
        ((mx) r6.get(r7)).d(r8);
        r7 = r7 - 1;
    L23:
        this.b.d(r8);
        return;
    }

    public final void o() {
        ArrayList r0 = new ArrayList();
        Iterator r1 = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Iterator r2 = ((wx) r1.next()).c.iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        te4 r3 = (te4) r2.next();
        File r4 = r3.r;
        r4.getClass();
        if (r4.length() == r3.p) goto L7;
        r0.add(r3);
        goto L7
    L11:
        int r5 = 0;
    L13:
        if (r5 >= r0.size()) goto L15;
        n((te4) r0.get(r5));
        r5 = r5 + 1;
        goto L13
    }

    public final synchronized te4 p(long r17, long r19, String r21) {
        monitor-enter(this);
        d();     // Catch: Throwable -> L18
        wx r0 = this.c.l(r21);     // Catch: Throwable -> L18
        if (r0 != null) goto L7;
        long r4 = r17;
        te4 r2 = new te4(r21, r4, r19, -9223372036854775807L, null);     // Catch: Throwable -> L18
    L14:
        if (r2.q == false) goto L20;
        te4 r1 = q(r21, r2);     // Catch: Throwable -> L18
        monitor-exit(this);
        return r1;
    L20:
        wx r3 = this.c.m(r21);     // Catch: Throwable -> L18
        long r6 = r2.p;     // Catch: Throwable -> L18
        ArrayList r5 = r3.d;     // Catch: Throwable -> L18
        int r7 = 0;
    L22:
        if (r7 >= r5.size()) goto L40;
        vx r8 = (vx) r5.get(r7);     // Catch: Throwable -> L18
        long r9 = r8.a;     // Catch: Throwable -> L18
        if (r9 > r4) goto L32;
        long r14 = r8.b;     // Catch: Throwable -> L18
        if (r14 == (-1)) goto L37;
        if ((r9 + r14) > r4) goto L37;
    L36:
        r7 = r7 + 1;
    L37:
        monitor-exit(this);
        return null;
    L32:
        if (r6 == (-1)) goto L37;
        if ((r4 + r6) <= r9) goto L36;
    L40:
        r5.add(new vx(r4, r6));     // Catch: Throwable -> L18
        monitor-exit(this);
        return r2;
    L7:
        r4 = r17;
    L8:
        r2 = r0.b(r4, r19);     // Catch: Throwable -> L18
        if (r2.q == false) goto L14;
        File r10 = r2.r;     // Catch: Throwable -> L18
        r10.getClass();     // Catch: Throwable -> L18
        if (r10.length() == r2.p) goto L14;
        o();     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    public final te4 q(String r20, te4 r21) {
        File r2 = r21.r;
        if (this.g == true) goto L5;
        return r21;
    L5:
        r2.getClass();
        String r9 = r2.getName();
        long r5 = r21.p;
        long r14 = System.currentTimeMillis();
        rf2 r4 = this.d;
        if (r4 != null) goto L27;
        boolean r6 = true;
    L13:
        wx r7 = this.c.l(r20);
        r7.getClass();
        TreeSet r8 = r7.c;
        rr2.w(r8.remove(r21));
        r2.getClass();
        if (r6 == false) goto L19;
        File r10 = r2.getParentFile();
        r10.getClass();
        File r11 = te4.c(r10, r7.a, r21.o, r14);
        if (r2.renameTo(r11) == false) goto L18;
        File r18 = r11;
    L20:
        rr2.w(r21.q);
        te4 r12 = new te4(r21.n, r21.o, r21.p, r14, r18);
        r8.add(r12);
        ArrayList r3 = (ArrayList) this.e.get(r21.n);
        if (r3 == null) goto L25;
        int r13 = r3.size() - 1;
    L23:
        if (r13 < 0) goto L25;
        ((mx) r3.get(r13)).c(this, r21, r12);
        r13 = r13 - 1;
    L25:
        this.b.c(this, r21, r12);
        return r12;
    L18:
        l93.q0("CachedContent", "Failed to rename " + r2 + " to " + r11);
    L19:
        r18 = r2;
        goto L20
    L27:
        r4.k(r5, r14, r9);     // Catch: IOException -> L10
    L11:
        r6 = false;
    L10:
        r14 = r14;
        l93.q0("SimpleCache", "Failed to update index with new touch timestamp.");
        goto L11
    }
}
