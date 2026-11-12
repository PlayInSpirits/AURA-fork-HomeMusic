package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements Closeable {
    public final zq0 A;
    public final File n;
    public final File o;
    public final File p;
    public final File q;
    public final int r;
    public final long s;
    public final int t;
    public long u;
    public BufferedWriter v;
    public final LinkedHashMap w;
    public int x;
    public long y;
    public final ThreadPoolExecutor z;

    public kr0(File r17, long r18) {
        this.u = 0;
        this.w = new LinkedHashMap(0, 0.75f, true);
        this.y = 0;
        LinkedBlockingQueue r14 = new LinkedBlockingQueue();
        ar0 r15 = new ar0();
        this.z = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, r14, r15);
        this.A = new zq0(0, this);
        this.n = r17;
        this.r = 1;
        this.o = new File(r17, "journal");
        this.p = new File(r17, "journal.tmp");
        this.q = new File(r17, "journal.bkp");
        this.t = 1;
        this.s = r18;
    }

    public static void M(File r0, File r1, boolean r2) {
        if (r2 == false) goto L5;
        j(r1);
    L5:
        if (r0.renameTo(r1) == false) goto L8;
        return;
    L8:
        throw new IOException();
    }

    public static void b(kr0 r9, ll r10, boolean r11) {
        monitor-enter(r9);
        er0 r0 = (er0) r10.p;     // Catch: Throwable -> L19
        if (r0.f != r10) goto L47;
        int r1 = 0;
        if (r11 == false) goto L25;
        if (r0.e == true) goto L25;
        int r2 = 0;
    L11:
        if (r2 >= r9.t) goto L25;
        if (((boolean[]) r10.q)[r2] == false) goto L22;
        if (r0.d[r2].exists() == false) goto L16;
        r2 = r2 + 1;
        goto L11
    L16:
        r10.a();     // Catch: Throwable -> L19
        monitor-exit(r9);
        return;
    L22:
        r10.a();     // Catch: Throwable -> L19
        throw new IllegalStateException("Newly created entry didn't create value for index " + r2);     // Catch: Throwable -> L19
    L25:
        if (r1 >= r9.t) goto L33;
        File r12 = r0.d[r1];     // Catch: Throwable -> L19
        if (r11 == true) goto L29;
        j(r12);     // Catch: Throwable -> L19
    L32:
        r1 = r1 + 1;     // Catch: Throwable -> L19
        goto L25
    L29:
        if (r12.exists() == false) goto L32;
        File r3 = r0.c[r1];     // Catch: Throwable -> L19
        r12.renameTo(r3);     // Catch: Throwable -> L19
        long r4 = r0.b[r1];     // Catch: Throwable -> L19
        long r5 = r3.length();     // Catch: Throwable -> L19
        r0.b[r1] = r5;     // Catch: Throwable -> L19
        r9.u = (r9.u - r4) + r5;     // Catch: Throwable -> L19
        goto L32
    L33:
        r9.x++;     // Catch: Throwable -> L19
        r0.f = null;     // Catch: Throwable -> L19
        if ((r0.e | r11) == false) goto L38;
        r0.e = true;     // Catch: Throwable -> L19
        r9.v.append("CLEAN");     // Catch: Throwable -> L19
        r9.v.append(' ');     // Catch: Throwable -> L19
        r9.v.append(r0.a);     // Catch: Throwable -> L19
        r9.v.append(r0.a());     // Catch: Throwable -> L19
        r9.v.append('\n');     // Catch: Throwable -> L19
        if (r11 == false) goto L39;
        r9.y++;     // Catch: Throwable -> L19
    L39:
        q(r9.v);     // Catch: Throwable -> L19
        if (r9.u <= r9.s) goto L42;
    L43:
        r9.z.submit(r9.A);     // Catch: Throwable -> L19
    L44:
        monitor-exit(r9);
        return;
    L42:
        if (r9.u() == false) goto L44;
    L38:
        r9.w.remove(r0.a);     // Catch: Throwable -> L19
        r9.v.append("REMOVE");     // Catch: Throwable -> L19
        r9.v.append(' ');     // Catch: Throwable -> L19
        r9.v.append(r0.a);     // Catch: Throwable -> L19
        r9.v.append('\n');     // Catch: Throwable -> L19
        goto L39
    L47:
        throw new IllegalStateException();     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    public static void f(BufferedWriter r2) {
        if (Build.VERSION.SDK_INT >= 26) goto L6;
        r2.close();
        return;
    L6:
        StrictMode.ThreadPolicy r0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(gm0.i(new StrictMode.ThreadPolicy.Builder(r0)).build());
        r2.close();     // Catch: Throwable -> L10
        StrictMode.setThreadPolicy(r0);
        return;
    L10:
        th = move-exception;
        StrictMode.setThreadPolicy(r0);
        throw th;
    }

    public static void j(File r1) {
        if (r1.exists() == true) goto L5;
        return;
    L5:
        if (r1.delete() == false) goto L8;
        return;
    L8:
        throw new IOException();
    }

    public static void q(BufferedWriter r2) {
        if (Build.VERSION.SDK_INT >= 26) goto L6;
        r2.flush();
        return;
    L6:
        StrictMode.ThreadPolicy r0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(gm0.i(new StrictMode.ThreadPolicy.Builder(r0)).build());
        r2.flush();     // Catch: Throwable -> L10
        StrictMode.setThreadPolicy(r0);
        return;
    L10:
        th = move-exception;
        StrictMode.setThreadPolicy(r0);
        throw th;
    }

    public static kr0 v(File r5, long r6) {
        if (r6 <= 0) goto L18;
        File r0 = new File(r5, "journal.bkp");
        if (r0.exists() == false) goto L10;
        File r1 = new File(r5, "journal");
        if (r1.exists() == false) goto L9;
        r0.delete();
        goto L10
    L9:
        M(r0, r1, false);
    L10:
        kr0 r2 = new kr0(r5, r6);
        if (r2.o.exists() == true) goto L20;
    L16:
        r5.mkdirs();
        kr0 r3 = new kr0(r5, r6);
        r3.K();
        return r3;
    L20:
        r2.H();     // Catch: IOException -> L14
        r2.F();     // Catch: IOException -> L14
        return r2;
    L14:
        e = move-exception;
        System.out.println("DiskLruCache " + r5 + " is corrupt: " + e.getMessage() + ", removing");
        r2.close();
        d35.a(r2.n);
        goto L16
    L18:
        kf2.n("maxSize <= 0");
        return null;
    }

    public final void F() {
        j(this.p);
        Iterator r0 = this.w.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        er0 r1 = (er0) r0.next();
        ll r2 = r1.f;
        int r3 = this.t;
        int r4 = 0;
        if (r2 == null) goto L7;
        r1.f = null;
    L10:
        if (r4 >= r3) goto L12;
        j(r1.c[r4]);
        j(r1.d[r4]);
        r4 = r4 + 1;
        goto L10
    L12:
        r0.remove();
    L7:
        if (r4 >= r3) goto L4;
        this.u += r1.b[r4];
        r4 = r4 + 1;
        goto L7
    }

    public final void H() {
        File r4 = this.o;
        nm4 r2 = new nm4(new FileInputStream(r4), d35.a);
        String r3 = r2.b();     // Catch: Throwable -> L16
        String r5 = r2.b();     // Catch: Throwable -> L16
        String r6 = r2.b();     // Catch: Throwable -> L16
        String r7 = r2.b();     // Catch: Throwable -> L16
        String r8 = r2.b();     // Catch: Throwable -> L16
        if ("libcore.io.DiskLruCache".equals(r3) == false) goto L27;
        if ("1".equals(r5) == false) goto L27;
        if (Integer.toString(this.r).equals(r6) == false) goto L27;
        if (Integer.toString(this.t).equals(r7) == false) goto L27;
        if ("".equals(r8) == false) goto L27;
        int r0 = 0;
    L34:
        J(r2.b());     // Catch: Throwable -> L16 EOFException -> L18
        r0 = r0 + 1;
        goto L34
    L18:
        this.x = r0 - this.w.size();     // Catch: Throwable -> L16
        if (r2.r != (-1)) goto L21;
        K();     // Catch: Throwable -> L16
    L37:
        r2.close();     // Catch: Exception -> L32 RuntimeException -> L24
        return;
    L24:
        e = move-exception;
        throw e;
    L41:
        return;
    L21:
        this.v = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r4, true), d35.a));     // Catch: Throwable -> L16
    L27:
        throw new IOException("unexpected journal header: [" + r3 + ", " + r5 + ", " + r7 + ", " + r8 + "]");     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r2.close();     // Catch: Exception -> L33 RuntimeException -> L30
    L30:
        e = move-exception;
        throw e;
    L29:
        throw th;
    }

    public final void J(String r8) {
        int r1 = r8.indexOf(32);
        if (r1 == (-1)) goto L46;
        int r4 = r1 + 1;
        int r0 = r8.indexOf(32, r4);
        LinkedHashMap r5 = this.w;
        if (r0 != (-1)) goto L12;
        String r6 = r8.substring(r4);
        if (r1 == 6) goto L9;
    L13:
        er0 r7 = (er0) r5.get(r6);
        if (r7 != null) goto L17;
        r7 = new er0(this, r6);
        r5.put(r6, r7);
    L17:
        if (r0 == (-1)) goto L32;
        if (r1 != 5) goto L32;
        if (r8.startsWith("CLEAN") == false) goto L32;
        String[] r9 = r8.substring(r0 + 1).split(" ");
        r7.e = true;
        r7.f = null;
        if (r9.length != r7.g.t) goto L30;
        int r10 = 0;
    L48:
    L28:
        mj0.m(Arrays.toString(r9), "unexpected journal line: ");
        return;
    L25:
        if (r10 >= r9.length) goto L51;
        r7.b[r10] = Long.parseLong(r9[r10]);     // Catch: NumberFormatException -> L28
        r10 = r10 + 1;
        goto L48
    L51:
        return;
    L30:
        mj0.m(Arrays.toString(r9), "unexpected journal line: ");
        return;
    L32:
        if (r0 != (-1)) goto L38;
        if (r1 != 5) goto L38;
        if (r8.startsWith("DIRTY") == false) goto L38;
        r7.f = new ll(this, r7);
        return;
    L38:
        if (r0 == (-1)) goto L40;
    L44:
        mj0.i("unexpected journal line: ".concat(r8));
        return;
    L40:
        if (r1 != 4) goto L44;
        if (r8.startsWith("READ") == false) goto L44;
        return;
    L9:
        if (r8.startsWith("REMOVE") == false) goto L13;
        r5.remove(r6);
        return;
    L12:
        r6 = r8.substring(r4, r0);
        goto L13
    L46:
        mj0.i("unexpected journal line: ".concat(r8));
    }

    public final synchronized void K() {
        monitor-enter(this);
        BufferedWriter r0 = this.v;     // Catch: Throwable -> L6
        if (r0 == null) goto L8;
        f(r0);     // Catch: Throwable -> L6
    L8:
        BufferedWriter r1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.p), d35.a));     // Catch: Throwable -> L6
        r1.write("libcore.io.DiskLruCache");     // Catch: Throwable -> L15
        r1.write("\n");     // Catch: Throwable -> L15
        r1.write("1");     // Catch: Throwable -> L15
        r1.write("\n");     // Catch: Throwable -> L15
        r1.write(Integer.toString(this.r));     // Catch: Throwable -> L15
        r1.write("\n");     // Catch: Throwable -> L15
        r1.write(Integer.toString(this.t));     // Catch: Throwable -> L15
        r1.write("\n");     // Catch: Throwable -> L15
        r1.write("\n");     // Catch: Throwable -> L15
        Iterator r2 = this.w.values().iterator();     // Catch: Throwable -> L15
    L10:
        if (r2.hasNext() == false) goto L19;
        er0 r3 = (er0) r2.next();     // Catch: Throwable -> L15
        if (r3.f != null) goto L14;
        r1.write("CLEAN " + r3.a + r3.a() + '\n');     // Catch: Throwable -> L15
        goto L10
    L14:
        r1.write("DIRTY " + r3.a + '\n');     // Catch: Throwable -> L15
        goto L10
    L19:
        f(r1);     // Catch: Throwable -> L6
        if (this.o.exists() == false) goto L22;
        M(this.o, this.q, true);     // Catch: Throwable -> L6
    L22:
        M(this.p, this.o, false);     // Catch: Throwable -> L6
        this.q.delete();     // Catch: Throwable -> L6
        this.v = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.o, true), d35.a));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        f(r1);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public final void R() {
    L3:
        if (this.u <= this.s) goto L37;
        String r0 = (String) ((Map.Entry) this.w.entrySet().iterator().next()).getKey();
        monitor-enter(this);
    L23:
        th = move-exception;
        throw th;
    L7:
        if (this.v == null) goto L34;
        er0 r1 = (er0) this.w.get(r0);     // Catch: Throwable -> L23
        if (r1 == null) goto L31;
        if (r1.f != null) goto L31;
        int r2 = 0;
    L15:
        if (r2 >= this.t) goto L26;
        File r3 = r1.c[r2];     // Catch: Throwable -> L23
        if (r3.exists() == false) goto L25;
        if (r3.delete() == true) goto L25;
        throw new IOException("failed to delete " + r3);     // Catch: Throwable -> L23
    L25:
        long r4 = this.u;     // Catch: Throwable -> L23
        long[] r5 = r1.b;     // Catch: Throwable -> L23
        this.u = r4 - r5[r2];     // Catch: Throwable -> L23
        r5[r2] = 0;     // Catch: Throwable -> L23
        r2 = r2 + 1;     // Catch: Throwable -> L23
        goto L15
    L26:
        this.x++;     // Catch: Throwable -> L23
        this.v.append("REMOVE");     // Catch: Throwable -> L23
        this.v.append(' ');     // Catch: Throwable -> L23
        this.v.append(r0);     // Catch: Throwable -> L23
        this.v.append('\n');     // Catch: Throwable -> L23
        this.w.remove(r0);     // Catch: Throwable -> L23
        if (u() == false) goto L29;
        this.z.submit(this.A);     // Catch: Throwable -> L23
    L29:
        monitor-exit(this);
    L31:
        monitor-exit(this);
        goto L3
    L34:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L23
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.v != null) goto L7;
        monitor-exit(this);
        return;
    L7:
        ArrayList r0 = new ArrayList(this.w.values());     // Catch: Throwable -> L12
        int r1 = r0.size();     // Catch: Throwable -> L12
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L14;
        Object r3 = r0.get(r2);     // Catch: Throwable -> L12
        r2 = r2 + 1;     // Catch: Throwable -> L12
        ll r4 = ((er0) r3).f;     // Catch: Throwable -> L12
        if (r4 == null) goto L8;
        r4.a();     // Catch: Throwable -> L12
        goto L8
    L14:
        R();     // Catch: Throwable -> L12
        f(this.v);     // Catch: Throwable -> L12
        this.v = null;     // Catch: Throwable -> L12
        monitor-exit(this);
    }

    public final ll n(String r4) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.v == null) goto L19;
        er0 r0 = (er0) this.w.get(r4);     // Catch: Throwable -> L8
        if (r0 != null) goto L11;
        r0 = new er0(this, r4);     // Catch: Throwable -> L8
        this.w.put(r4, r0);     // Catch: Throwable -> L8
    L15:
        ll r1 = new ll(this, r0);     // Catch: Throwable -> L8
        r0.f = r1;     // Catch: Throwable -> L8
        this.v.append("DIRTY");     // Catch: Throwable -> L8
        this.v.append(' ');     // Catch: Throwable -> L8
        this.v.append(r4);     // Catch: Throwable -> L8
        this.v.append('\n');     // Catch: Throwable -> L8
        q(this.v);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r1;
    L11:
        if (r0.f == null) goto L15;
        monitor-exit(this);
        return null;
    L19:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L8
    }

    public final synchronized d34 s(String r7) {
        monitor-enter(this);
    L21:
        th = move-exception;
        throw th;
    L4:
        if (this.v == null) goto L30;
        er0 r0 = (er0) this.w.get(r7);     // Catch: Throwable -> L21
        if (r0 != null) goto L11;
        monitor-exit(this);
        return null;
    L11:
        if (r0.e == true) goto L14;
        monitor-exit(this);
        return null;
    L14:
        File[] r2 = r0.c;     // Catch: Throwable -> L21
        int r3 = r2.length;     // Catch: Throwable -> L21
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L23;
        if (r2[r4].exists() == false) goto L18;
        r4 = r4 + 1;
        goto L15
    L18:
        monitor-exit(this);
        return null;
    L23:
        this.x++;     // Catch: Throwable -> L21
        this.v.append("READ");     // Catch: Throwable -> L21
        this.v.append(' ');     // Catch: Throwable -> L21
        this.v.append(r7);     // Catch: Throwable -> L21
        this.v.append('\n');     // Catch: Throwable -> L21
        if (u() == false) goto L26;
        this.z.submit(this.A);     // Catch: Throwable -> L21
    L26:
        d34 r8 = new d34(22, r0.c);     // Catch: Throwable -> L21
        monitor-exit(this);
        return r8;
    L30:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L21
    }

    public final boolean u() {
        int r0 = this.x;
        if (r0 >= 2000) goto L5;
        return false;
    L5:
        if (r0 < this.w.size()) goto L10;
        return true;
    L10:
        return false;
    }
}
