package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.ParserException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wr1 {
    public static final z95 a = null;
    public static final z95 b = null;
    public static final z95 c = null;
    public static final z95 d = null;
    public static final float[] e = null;
    public static final wv3 f = null;
    public static Field g = null;
    public static boolean h = false;
    public static boolean i = true;

    static {
        a = new z95(0.31006f, 0.31616f);
        b = new z95(0.34567f, 0.3585f);
        c = new z95(0.32168f, 0.33767f);
        d = new z95(0.31271f, 0.32902f);
        e = new float[]{0.964212f, 1.0f, 0.825188f};
        f = new wv3(0.0f, 0.0f, 10.0f, 10.0f);
    }

    public static final ho3 A(View r2) {
        ho3 r1 = (ho3) r2.getTag(R.id.pooling_container_listener_holder_tag);
        if (r1 != null) goto L6;
        ho3 r3 = new ho3();
        r2.setTag(R.id.pooling_container_listener_holder_tag, r3);
        return r3;
    L6:
        return r1;
    }

    public static File C(Context r5) {
        File r6 = r5.getCacheDir();
        if (r6 != null) goto L5;
        return null;
    L5:
        String r1 = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int r2 = 0;
    L7:
        if (r2 >= 100) goto L13;
        File r3 = new File(r6, r1 + r2);
        if (r3.createNewFile() == false) goto L12;
        return r3;
    L12:
        r2 = r2 + 1;
        goto L7
    L13:
        return null;
    }

    public static final boolean E(AssertionError r2) {
        Logger r0 = p83.a;
        if (r2.getCause() == null) goto L11;
        String r3 = r2.getMessage();
        if (r3 == null) goto L7;
        boolean r4 = qm4.o0(r3, "getsockname failed");
    L8:
        if (r4 == false) goto L11;
        return true;
    L7:
        r4 = false;
    L11:
        return false;
    }

    public static final boolean F(KeyEvent r4) {
        long r0 = fh0.a(r4.getKeyCode());
        if (g42.a(r0, g42.h) == false) goto L5;
        return true;
    L5:
        if (g42.a(r0, g42.k) == false) goto L7;
        return true;
    L7:
        if (g42.a(r0, g42.o) == false) goto L9;
        return true;
    L9:
        if (g42.a(r0, g42.j) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public static final boolean H(i94 r2) {
        f63 r0 = r2.d();
        w03 r3 = r2.d.n;
        if (r0 == null) goto L5;
        boolean r1 = r0.J0();
    L6:
        if (r1 == false) goto L9;
        return true;
    L9:
        if (r3.c(n94.p) == false) goto L12;
        return true;
    L12:
        if (r3.c(n94.o) == false) goto L15;
        return true;
    L15:
        return false;
    L5:
        r1 = false;
        goto L6
    }

    public static final boolean I(i94 r14) {
        if (H(r14) == true) goto L25;
        e94 r15 = r14.d;
        if (r15.p == true) goto L19;
        w03 r16 = r15.n;
        Object[] r0 = r16.b;
        Object[] r2 = r16.c;
        long[] r17 = r16.a;
        int r3 = r17.length - 2;
        if (r3 < 0) goto L25;
        int r4 = 0;
    L11:
        long r5 = r17[r4];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r7 = 8 - ((~(r4 - r3)) >>> 31);
        int r9 = 0;
    L14:
        if (r9 >= r7) goto L22;
        if ((255 & r5) >= 128) goto L21;
        int r10 = (r4 << 3) + r9;
        Object r11 = r0[r10];
        Object r12 = r2[r10];
        if (((p94) r11).c == false) goto L21;
        return true;
    L21:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L14
    L22:
        if (r7 != 8) goto L25;
    L23:
        if (r4 == r3) goto L25;
        r4 = r4 + 1;
        goto L11
    L19:
        return true;
    L25:
        return false;
    }

    public static final boolean K(g34 r6) {
        long r0 = r6.e;
        if ((r0 >>> 32) == (4294967295L & r0)) goto L5;
        return false;
    L5:
        if (r0 == r6.f) goto L7;
        return false;
    L7:
        if (r0 == r6.g) goto L9;
        return false;
    L9:
        if (r0 != r6.h) goto L16;
        return true;
    L16:
        return false;
    }

    public static mx2 M(ExecutorService r1) {
        if ((r1 instanceof mx2) == false) goto L7;
        return (mx2) r1;
    L7:
        if ((r1 instanceof ScheduledExecutorService) == false) goto L11;
        return new px2((ScheduledExecutorService) r1);
    L11:
        return new mx2(r1);
    }

    public static MappedByteBuffer N(Context r8, Uri r9) {
        ParcelFileDescriptor r10 = r8.getContentResolver().openFileDescriptor(r9, "r", null);     // Catch: IOException -> L30
        if (r10 != null) goto L31;
        if (r10 == null) goto L29;
        r10.close();     // Catch: IOException -> L30
        return null;
    L31:
        FileInputStream r11 = new FileInputStream(r10.getFileDescriptor());     // Catch: Throwable -> L13
        FileChannel r2 = r11.getChannel();     // Catch: Throwable -> L15
        long r6 = r2.size();     // Catch: Throwable -> L15
        MappedByteBuffer r0 = r2.map(FileChannel.MapMode.READ_ONLY, 0, r6);     // Catch: Throwable -> L15
        r11.close();     // Catch: Throwable -> L13
        r10.close();     // Catch: IOException -> L30
        return r0;
    L15:
        th = move-exception;
        r11.close();     // Catch: Throwable -> L19
        goto L29
    L39:
        throw th;     // Catch: Throwable -> L13
    L19:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r10.close();     // Catch: Throwable -> L25
        goto L29
    L40:
        throw th;     // Catch: IOException -> L30
    L25:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L30
        throw th;     // Catch: IOException -> L30
    L29:
        return null;
    }

    public static void O(EditorInfo r0, InputConnection r1, TextView r2) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (r0.hintText != null) goto L11;
        ViewParent r3 = r2.getParent();
    L7:
        if ((r3 instanceof View) == false) goto L12;
        r3 = r3.getParent();
        goto L7
    L12:
        return;
    }

    public static final void P(cz r2, vd0 r3, boolean r4) {
        Object r0 = r2.s();
        Throwable r1 = r2.e(r0);
        if (r1 == null) goto L5;
        Object r5 = new s14(r1);
    L6:
        if (r4 == false) goto L25;
        r3.getClass();
        mr0 r6 = (mr0) r3;
        wd0 r7 = r6.r;
        Object r8 = r6.t;
        ne0 r9 = r7.getContext();
        Object r10 = te5.R(r9, r8);
        if (r10 == te5.b) goto L10;
        f15 r11 = jz4.Q(r7, r9, r10);
    L27:
        r7.resumeWith(r5);     // Catch: Throwable -> L19
        if (r11 != null) goto L14;
    L17:
        te5.K(r9, r10);
        return;
    L14:
        if (r11.m0() == true) goto L17;
        return;
    L19:
        th = move-exception;
        if (r11 != null) goto L22;
    L23:
        te5.K(r9, r10);
    L24:
        throw th;
    L22:
        if (r11.m0() == false) goto L24;
    L10:
        r11 = null;
        goto L27
    L25:
        r3.resumeWith(r5);
        return;
    L5:
        r5 = r2.f(r0);
        goto L6
    }

    public static final int Q(b94 r4, int r5) {
        int[] r0 = r4.s;
        int r6 = r5 + 1;
        int r7 = r4.r.length;
        r0.getClass();
        int r8 = r7 - 1;
        int r1 = 0;
    L3:
        if (r1 > r8) goto L9;
        int r2 = (r1 + r8) >>> 1;
        int r3 = r0[r2];
        if (r3 < r6) goto L6;
        if (r3 <= r6) goto L10;
        r8 = r2 - 1;
    L10:
        if (r2 < 0) goto L13;
        return r2;
    L13:
        return ~r2;
    L6:
        r1 = r2 + 1;
        goto L3
    L9:
        r2 = (-r1) - 1;
        goto L10
    }

    public static final g34 a(float r17, float r18, float r19, float r20, long r21) {
        float r1 = Float.intBitsToFloat((int) (r21 >> 32));
        float r4 = Float.intBitsToFloat((int) (r21 & 4294967295L));
        long r9 = (Float.floatToRawIntBits(r1) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(r4)));
        return new g34(r17, r18, r19, r20, r9, r9, r9, r9);
    }

    public static final ExecutorService b(boolean r2) {
        ExecutorService r3 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new s90(r2));
        r3.getClass();
        return r3;
    }

    public static final wv3 c(q62 r6) {
        q62 r0 = r6.u();
        if (r0 == null) goto L7;
        return r0.C(r6, true);
    L7:
        return new wv3(0.0f, 0.0f, (int) (r6.k() >> 32), (int) (r6.k() & 4294967295L));
    }

    public static final wv3 d(q62 r14, boolean r15) {
        q62 r0 = n(r14);
        float r1 = (int) (r0.k() >> 32);
        float r2 = (int) (r0.k() & 4294967295L);
        wv3 r16 = r0.C(r14, r15);
        float r4 = r16.a;
        float r5 = 0.0f;
        if (r15 == true) goto L5;
    L10:
        float r8 = r16.b;
        if (r15 == true) goto L13;
    L18:
        float r9 = r16.c;
        if (r15 == true) goto L21;
    L28:
        float r17 = r16.d;
        if (r15 == false) goto L40;
        if (r17 < 0.0f) goto L35;
        r5 = r17;
    L35:
        if (r5 > r2) goto L38;
        r2 = r5;
    L38:
        r17 = r2;
    L40:
        if (r4 == r9) goto L45;
        if (r8 == r17) goto L45;
        long r3 = r0.b((Float.floatToRawIntBits(r4) << 32) | (((long) Float.floatToRawIntBits(r8)) & 4294967295L));
        long r10 = r0.b((Float.floatToRawIntBits(r9) << 32) | (((long) Float.floatToRawIntBits(r8)) & 4294967295L));
        long r11 = r0.b((Float.floatToRawIntBits(r9) << 32) | (((long) Float.floatToRawIntBits(r17)) & 4294967295L));
        long r6 = Float.floatToRawIntBits(r4);
        long r18 = r0.b((((long) Float.floatToRawIntBits(r17)) & 4294967295L) | (r6 << 32));
        float r7 = Float.intBitsToFloat((int) (r3 >> 32));
        float r12 = Float.intBitsToFloat((int) (r10 >> 32));
        float r13 = Float.intBitsToFloat((int) (r18 >> 32));
        float r19 = Float.intBitsToFloat((int) (r11 >> 32));
        float r110 = Math.min(r7, Math.min(r12, Math.min(r13, r19)));
        float r20 = Math.max(r7, Math.max(r12, Math.max(r13, r19)));
        float r21 = Float.intBitsToFloat((int) (r3 & 4294967295L));
        float r22 = Float.intBitsToFloat((int) (r10 & 4294967295L));
        float r111 = Float.intBitsToFloat((int) (r18 & 4294967295L));
        float r112 = Float.intBitsToFloat((int) (r11 & 4294967295L));
        return new wv3(r110, Math.min(r21, Math.min(r22, Math.min(r111, r112))), r20, Math.max(r21, Math.max(r22, Math.max(r111, r112))));
    L45:
        return wv3.e;
    L21:
        if (r9 >= 0.0f) goto L24;
        r9 = 0.0f;
    L24:
        if (r9 > r1) goto L27;
        r1 = r9;
    L27:
        r9 = r1;
        goto L28
    L13:
        if (r8 >= 0.0f) goto L16;
        r8 = 0.0f;
    L16:
        if (r8 <= r2) goto L18;
        r8 = r2;
        goto L18
    L5:
        if (r4 >= 0.0f) goto L8;
        r4 = 0.0f;
    L8:
        if (r4 <= r1) goto L10;
        r4 = r1;
        goto L10
    }

    public static final void g(View r3) {
        r3.getClass();
        ba4 r4 = si0.C(new sb(r3, null, 1));
    L4:
        if (r4.hasNext() == false) goto L9;
        ArrayList r0 = A((View) r4.next()).a;
        int r1 = gb.E(r0);
    L7:
        if ((-1) >= r1) goto L4;
        ((k65) r0.get(r1)).a.d();
        r1 = r1 - 1;
        goto L7
    }

    public static final void h(sc5 r8, String r9) {
        WorkDatabase r0 = r8.c;
        r0.getClass();
        fd5 r1 = r0.A();
        wo0 r2 = r0.v();
        ArrayList r3 = gb.Q(new String[]{r9});
    L4:
        if (r3.isEmpty() == true) goto L22;
        String r4 = (String) v40.q0(r3);
        int r5 = r1.g(r4);
        if (r5 == 3) goto L21;
        if (r5 == 4) goto L21;
        WorkDatabase_Impl r6 = r1.a;
        r6.b();
        aq4 r7 = r1.e;
        df1 r10 = r7.a();
        r10.h(1, r4);
        r6.c();     // Catch: Throwable -> L14
        r10.b();     // Catch: Throwable -> L16
        r6.t();     // Catch: Throwable -> L16
        r6.o();     // Catch: Throwable -> L14
        r7.h(r10);
        goto L21
    L16:
        th = move-exception;
        r6.o();     // Catch: Throwable -> L14
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r7.h(r10);
        throw th;
    L21:
        r3.addAll(r2.w(r4));
        goto L4
    L22:
        pq3 r11 = r8.f;
        r11.getClass();
        Object r12 = r11.k;
        monitor-enter(r12);
        cx.f().b(pq3.l, "Processor cancelling " + r9);     // Catch: Throwable -> L31
        r11.i.add(r9);     // Catch: Throwable -> L31
        td5 r13 = r11.b(r9);     // Catch: Throwable -> L31
        monitor-exit(r12);     // Catch: Throwable -> L31
        pq3.d(r9, r13, 1);
        Iterator r14 = r8.e.iterator();
    L28:
        if (r14.hasNext() == false) goto L30;
        ((a64) r14.next()).d(r9);
        goto L28
    L30:
        return;
    L31:
        th = move-exception;
        throw th;
    }

    public static void i(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw ParserException.a(null, r0);
    }

    public static dx2 j(dx2 r1, gf1 r2) {
        return r1.c(new t30(r2));
    }

    public static boolean k(File r0, Resources r1, int r2) {
        InputStream r3 = r1.openRawResource(r2);     // Catch: Throwable -> L9
        boolean r4 = l(r0, r3);     // Catch: Throwable -> L7
        if (r3 != null) goto L20;
    L6:
        return r4;
    L20:
        r3.close();     // Catch: IOException -> L14
    L7:
        th = th;
    L11:
        if (r3 != null) goto L18;
    L13:
        throw th;
    L18:
        r3.close();     // Catch: IOException -> L15
    L9:
        th = th;
        r3 = null;
        goto L11
    }

    public static boolean l(File r5, InputStream r6) {
        StrictMode.ThreadPolicy r0 = StrictMode.allowThreadDiskWrites();
        FileOutputStream r2 = null;
        FileOutputStream r3 = new FileOutputStream(r5, false);     // Catch: Throwable -> L17 IOException -> L19
        byte[] r7 = new byte[1024];     // Catch: Throwable -> L10 IOException -> L12
    L6:
        int r4 = r6.read(r7);     // Catch: Throwable -> L10 IOException -> L12
        if (r4 == (-1)) goto L38;
        r3.write(r7, 0, r4);     // Catch: Throwable -> L10 IOException -> L12
    L38:
        r3.close();     // Catch: IOException -> L29
    L15:
        StrictMode.setThreadPolicy(r0);
        return true;
    L12:
        e = e;
        r2 = r3;
    L20:
        Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());     // Catch: Throwable -> L17
        if (r2 != null) goto L32;
    L23:
        StrictMode.setThreadPolicy(r0);
        return false;
    L32:
        r2.close();     // Catch: IOException -> L31
    L10:
        th = th;
        r2 = r3;
    L25:
        if (r2 != null) goto L36;
    L27:
        StrictMode.setThreadPolicy(r0);
        throw th;
    L36:
        r2.close();     // Catch: IOException -> L30
    L19:
        e = e;
    L17:
        th = th;
        goto L25
    }

    public static Handler m(Looper r5) {
        if (Build.VERSION.SDK_INT < 28) goto L29;
        return ne.b(r5);
    L29:
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{r5, null, Boolean.TRUE});
    L15:
        e = e;
    L27:
        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
        return new Handler(r5);
    L13:
        e = e;
    L11:
        e = e;
    L9:
        e = move-exception;
        Throwable r6 = e.getCause();
        if ((r6 instanceof RuntimeException) == true) goto L26;
        if ((r6 instanceof Error) == true) goto L24;
        er1.m(r6);
        return null;
    L24:
        throw ((Error) r6);
    L26:
        throw ((RuntimeException) r6);
    }

    public static final q62 n(q62 r2) {
        q62 r0 = r2.u();
    L3:
        q62 r1 = r0;
        q62 r3 = r2;
        r2 = r1;
        if (r2 == null) goto L7;
        r0 = r2.u();
        goto L3
    L7:
        if ((r3 instanceof f63) == false) goto L9;
        f63 r4 = (f63) r3;
    L10:
        if (r4 != null) goto L12;
        return r3;
    L12:
        f63 r5 = r4.J;
    L13:
        f63 r6 = r5;
        f63 r7 = r4;
        r4 = r6;
        if (r4 == null) goto L16;
        r5 = r4.J;
        goto L13
    L16:
        return r7;
    L9:
        r4 = null;
        goto L10
    }

    public static final i03 o(l94 r7, if1 r8) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        i94 r5 = r7.a();     // Catch: Throwable -> L14
        c72 r9 = r5.c;     // Catch: Throwable -> L14
        if (r9.H() == true) goto L6;
    L11:
        i03 r10 = f02.a;     // Catch: Throwable -> L14
        r10.getClass();     // Catch: Throwable -> L14
        Trace.endSection();
        return r10;
    L6:
        if (r9.G() == false) goto L11;
        wv3 r11 = r5.g();     // Catch: Throwable -> L14
        i03 r4 = new i03(48);     // Catch: Throwable -> L14
        si1 r3 = new si1(23);     // Catch: Throwable -> L14
        r3.L(rr2.Q(r11));     // Catch: Throwable -> L14
        r(r8, new si1(23), r3, r4, r5, r5);     // Catch: Throwable -> L14
        Trace.endSection();
        return r4;
    L14:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public static final void p(if1 r16, si1 r17, si1 r18, i03 r19, i94 r20, i94 r21) {
        si1 r1 = r17;
        Region r0 = (Region) r1.o;
        si1 r2 = r18;
        Region r7 = (Region) r2.o;
        c72 r3 = r21.c;
        c72 r4 = r21.c;
        if (r3.H() == false) goto L38;
        if (r4.G() == false) goto L38;
        if (r7.isEmpty() == true) goto L38;
        wv3 r5 = r21.m();
        if (r5.d() == false) goto L21;
        eo0 r6 = r21.f();
        if (r6 != null) goto L14;
        iz1 r8 = (iz1) r4.Q.d;
        r5 = n(r8).C(r8, false);
        goto L21
    L14:
        cx2 r9 = ((cx2) r6).n;
        e94 r10 = r21.d;
        Object r11 = r10.n.g(d94.b);
        if (r11 != null) goto L17;
        r11 = null;
    L17:
        if (r11 == null) goto L19;
        boolean r12 = true;
    L20:
        r5 = fu.s(r9, r12, false);
        goto L21
    L19:
        r12 = false;
    L21:
        k02 r13 = rr2.Q(r5);
        r1.L(r13);
        if (r0.op(r7, Region.Op.INTERSECT) == false) goto L44;
        int r14 = r21.f;
        i94 r15 = r20;
        if (r14 != r15.f) goto L26;
        r14 = -1;
    L26:
        Rect r22 = r0.getBounds();
        k94 r23 = new k94(r21, new k02(r22.left, r22.top, r22.right, r22.bottom));
        i03 r24 = r19;
        r24.i(r14, r23);
        List r110 = i94.j(4, r21);
        int r25 = r110.size() - 1;
    L27:
        if ((-1) >= r25) goto L34;
        if (((Boolean) r16.invoke(r110.get(r25))).booleanValue() == true) goto L32;
        p(r16, r1, r2, r24, r15, (i94) r110.get(r25));
    L32:
        r25 = r25 - 1;
        r1 = r17;
        r2 = r18;
        r24 = r19;
        r15 = r20;
        goto L27
    L34:
        if (I(r21) == false) goto L45;
        r7.op(r13.a, r13.b, r13.c, r13.d, Region.Op.DIFFERENCE);
        return;
    L45:
        return;
    L44:
        return;
    L38:
        if (r21.o() == false) goto L46;
        q(r19, r20, r21);
        return;
    }

    public static final void q(i03 r3, i94 r4, i94 r5) {
        i94 r0 = r5.l();
        if (r0 == null) goto L9;
        c72 r1 = r0.c;
        if (r1 == null) goto L9;
        if (r1.H() != true) goto L9;
        wv3 r2 = r0.g();
    L10:
        int r6 = r5.f;
        if (r6 != r4.f) goto L13;
        r6 = -1;
    L13:
        r3.i(r6, new k94(r5, rr2.Q(r2)));
        return;
    L9:
        r2 = f;
        goto L10
    }

    public static final void r(if1 r17, si1 r18, si1 r19, i03 r20, i94 r21, i94 r22) {
        if1 r0 = r17;
        i94 r4 = r21;
        int r2 = r4.f;
        Region r5 = (Region) r18.o;
        si1 r7 = r19;
        Region r8 = (Region) r7.o;
        c72 r9 = r22.c;
        e94 r10 = r22.d;
        c72 r11 = r22.c;
        int r12 = r22.f;
        if (r9.H() == true) goto L5;
    L8:
        boolean r13 = true;
    L10:
        if (r8.isEmpty() == false) goto L12;
        if (r12 == r2) goto L12;
        return;
    L12:
        if (r13 == true) goto L14;
    L16:
        k02 r14 = rr2.Q(r22.m());
        r18.L(r14);
        if (r12 != r2) goto L20;
        r12 = -1;
    L20:
        if (r5.op(r8, Region.Op.INTERSECT) == false) goto L90;
        Rect r6 = r5.getBounds();
        r20.i(r12, new k94(r22, new k02(r6.left, r6.top, r6.right, r6.bottom)));
        List r15 = i94.j(4, r22);
        if (r10.p == false) goto L77;
        i94 r1 = r22.l();
    L24:
        if (r1 == null) goto L31;
        w03 r16 = r1.d.n;
        if (r16.c(n94.v) == true) goto L32;
        if (r16.c(n94.u) == true) goto L32;
        r1 = r1.l();
    L32:
        if (r1 == null) goto L55;
        f63 r23 = r22.d();
        if (r23 != null) goto L36;
    L41:
        r23 = null;
    L42:
        f63 r3 = r1.d();
        if (r3 != null) goto L45;
    L50:
        r3 = null;
    L51:
        if (r23 == null) goto L55;
        if (r3 == null) goto L55;
        wv3 r24 = r3.C(r23, false);
        boolean r25 = !r24.equals(r24.c(bu.d(0, l93.o0(r3.p))));
    L56:
        if (r25 == false) goto L77;
        si1 r26 = new si1(23);
        eo0 r27 = r22.f();
        if (r27 != null) goto L60;
        iz1 r28 = (iz1) r11.Q.d;
        wv3 r29 = n(r28).C(r28, false);
    L69:
        r26.L(rr2.Q(r29));
        int r110 = r15.size() - 1;
    L71:
        if ((-1) >= r110) goto L86;
        if (((Boolean) r0.invoke(r15.get(r110))).booleanValue() == true) goto L76;
        p(r0, new si1(23), r26, r20, r4, (i94) r15.get(r110));
    L76:
        r110 = r110 - 1;
        r4 = r21;
    L86:
        if (I(r22) == false) goto L107;
        r8.op(r14.a, r14.b, r14.c, r14.d, Region.Op.DIFFERENCE);
        return;
    L107:
        return;
    L60:
        cx2 r30 = ((cx2) r27).n;
        Object r31 = r10.n.g(d94.b);
        if (r31 != null) goto L63;
        Object r32 = null;
    L64:
        if (r32 == null) goto L67;
        boolean r111 = true;
    L68:
        r29 = fu.s(r30, r111, false);
        goto L69
    L67:
        r111 = false;
        goto L68
    L63:
        r32 = r31;
        goto L64
    L45:
        if (r3.A0().A == true) goto L48;
        r3 = null;
    L48:
        if (r3 == null) goto L50;
    L36:
        if (r23.A0().A == true) goto L39;
        r23 = null;
    L39:
        if (r23 == null) goto L41;
    L55:
        r25 = false;
        goto L56
    L31:
        r1 = null;
    L77:
        int r112 = r15.size() - 1;
    L79:
        if ((-1) >= r112) goto L86;
        if (((Boolean) r0.invoke(r15.get(r112))).booleanValue() == true) goto L84;
        r(r0, r18, r7, r20, r21, (i94) r15.get(r112));
    L84:
        r112 = r112 - 1;
        r0 = r17;
        r7 = r19;
        goto L79
    L90:
        if (r22.o() == false) goto L94;
        q(r20, r21, r22);
        return;
    L94:
        if (r12 != (-1)) goto L108;
        Rect r33 = r5.getBounds();
        r20.i(r12, new k94(r22, new k02(r33.left, r33.top, r33.right, r33.bottom)));
        return;
    L108:
        return;
    L14:
        if (r22.o() == true) goto L16;
        return;
    L5:
        if (r11.G() == false) goto L8;
        r13 = false;
        goto L10
    }

    public static int w(int r1) {
        if (r1 != 20) goto L5;
        return 63750;
    L5:
        if (r1 == 30) goto L32;
        switch(r1) {
            case 5: goto L30;
            case 6: goto L28;
            case 7: goto L26;
            case 8: goto L37;
            case 9: goto L24;
            case 10: goto L22;
            case 11: goto L20;
            case 12: goto L18;
            default: goto L7;
        };
    L7:
        switch(r1) {
            case 14: goto L16;
            case 15: goto L14;
            case 16: goto L12;
            case 17: goto L10;
            case 18: goto L36;
            default: goto L8;
        };
    L8:
        return -2147483647;
    L10:
        return 336000;
    L12:
        return 256000;
    L14:
        return 8000;
    L16:
        return 3062500;
    L36:
        return 768000;
    L18:
        return 7000;
    L20:
        return 16000;
    L22:
        return 100000;
    L24:
        return 40000;
    L26:
        return 192000;
    L28:
        return 768000;
    L30:
        return 80000;
    L37:
        return 2250000;
    L32:
        return 2250000;
    }

    public abstract int B();

    public float D(View r1) {
        if (i == false) goto L8;
        return lm4.a(r1);
    L6:
        i = false;
    L8:
        return r1.getAlpha();
    }

    public abstract boolean G(float r1);

    public abstract boolean J(View r1);

    public abstract boolean L(float r1, float r2);

    public void R(View r1, float r2) {
        if (i == true) goto L9;
    L7:
        r1.setAlpha(r2);
        return;
    L9:
        lm4.r(r1, r2);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        i = false;
        goto L7
    }

    public abstract boolean S(View r1, float r2);

    public abstract void T(ViewGroup.MarginLayoutParams r1, int r2);

    public abstract void U(ViewGroup.MarginLayoutParams r1, int r2, int r3);

    public abstract int e(ViewGroup.MarginLayoutParams r1);

    public abstract float f(int r1);

    public abstract int s(ViewGroup.MarginLayoutParams r1);

    public abstract int t();

    public abstract int u();

    public abstract int v();

    public abstract int x();

    public abstract int y(View r1);

    public abstract int z(CoordinatorLayout r1);
}
