package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.PlaybackException;
import androidx.preference.Preference;
import app.homemusic.R;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class na4 implements jj1, zn4 {
    public static final tv1 r = null;
    public static final l15 s = null;
    public static na4 t;
    public Object n;
    public Object o;
    public Object p;
    public Object q;

    static {
        r = new tv1();
        s = new l15(2);
    }

    public na4(Typeface r8, wv2 r9) {
        this.q = r8;
        this.n = r9;
        this.p = new zv2(1024);
        int r0 = r9.a(6);
        if (r0 == 0) goto L5;
        int r1 = r0 + r9.n;
        int r2 = ((ByteBuffer) r9.q).getInt(((ByteBuffer) r9.q).getInt(r1) + r1);
    L6:
        this.o = new char[r2 * 2];
        int r10 = r9.a(6);
        if (r10 == 0) goto L9;
        int r11 = r10 + r9.n;
        int r12 = ((ByteBuffer) r9.q).getInt(((ByteBuffer) r9.q).getInt(r11) + r11);
    L10:
        int r13 = 0;
    L11:
        if (r13 >= r12) goto L29;
        k05 r3 = new k05(this, r13);
        vv2 r4 = r3.b();
        int r5 = r4.a(4);
        if (r5 == 0) goto L15;
        int r6 = ((ByteBuffer) r4.q).getInt(r5 + r4.n);
    L16:
        Character.toChars(r6, (char[]) this.o, r13 * 2);
        vv2 r7 = r3.b();
        int r14 = r7.a(16);
        if (r14 == 0) goto L19;
        int r15 = r14 + r7.n;
        int r16 = ((ByteBuffer) r7.q).getInt(((ByteBuffer) r7.q).getInt(r15) + r15);
    L21:
        if (r16 <= 0) goto L23;
        boolean r17 = true;
    L24:
        l93.j("invalid metadata codepoint length", r17);
        zv2 r18 = (zv2) this.p;
        vv2 r19 = r3.b();
        int r20 = r19.a(16);
        if (r20 == 0) goto L27;
        int r21 = r20 + r19.n;
        int r22 = ((ByteBuffer) r19.q).getInt(((ByteBuffer) r19.q).getInt(r21) + r21);
    L28:
        r18.a(r3, 0, r22 - 1);
        r13 = r13 + 1;
        goto L11
    L27:
        r22 = 0;
        goto L28
    L23:
        r17 = false;
        goto L24
    L19:
        r16 = 0;
        goto L21
    L15:
        r6 = 0;
        goto L16
    L29:
        return;
    L9:
        r12 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }

    public static na4 z() {
        if (t != null) goto L6;
        t = new na4(11);
    L6:
        return t;
    }

    public PlaybackException A(fr2 r2) {
        Object r0 = this.n;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (((ba0) ((oi) this.p).get(r2)) == null) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return null;
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return null;
    }

    public lk3 B(fr2 r2) {
        Object r0 = this.n;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (((ba0) ((oi) this.p).get(r2)) == null) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return null;
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return null;
    }

    public yk C(fr2 r2) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r1 = (ba0) ((oi) this.p).get(r2);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        if (r1 != null) goto L8;
        return null;
    L8:
        return r1.b;
    L11:
        th = move-exception;
        throw th;
    }

    public ce D(ce r19, ce r20) {
        na4 r0 = this;
        if (((ce) r0.q) != null) goto L5;
        r0.q = r19.c();
    L5:
        ce r1 = (ce) r0.q;
        if (r1 == null) goto L19;
        int r2 = r1.b();
        int r4 = 0;
    L8:
        ce r5 = (ce) r0.q;
        if (r4 >= r2) goto L15;
        if (r5 == null) goto L12;
        rm2 r6 = (rm2) r0.n;
        float r8 = r19.a(r4);
        float r10 = r20.a(r4);
        yx0 r7 = (yx0) r6.o;
        double r11 = r7.b(r10);
        double r13 = a81.a;
        float r3 = r7.a * r7.b;
        int r9 = r2;
        double r12 = Math.exp((r13 / (r13 - 1.0d)) * r11);
        r5.d(r4, (Math.signum(r10) * ((float) (r12 * ((double) r3)))) + r8);
        r4 = r4 + 1;
        r0 = this;
        r2 = r9;
        goto L8
    L12:
        h12.Q("targetVector");
        throw null;
    L15:
        if (r5 == null) goto L17;
        return r5;
    L17:
        h12.Q("targetVector");
        throw null;
    L19:
        h12.Q("targetVector");
        throw null;
    }

    public ce E(long r15, ce r17, ce r18) {
        if (((ce) this.p) != null) goto L5;
        this.p = r17.c();
    L5:
        ce r0 = (ce) this.p;
        if (r0 == null) goto L22;
        int r1 = r0.b();
        int r3 = 0;
    L8:
        ce r4 = (ce) this.p;
        if (r3 >= r1) goto L18;
        if (r4 == null) goto L16;
        rm2 r5 = (rm2) this.n;
        r17.getClass();
        long r8 = r15 / 1000000;
        z71 r6 = ((yx0) r5.o).a(r18.a(r3));
        long r10 = r6.c;
        if (r10 <= 0) goto L14;
        float r7 = r8 / r10;
    L15:
        r4.d(r3, (((Math.signum(r6.a) * yb.a(r7).b) * r6.b) / r10) * 1000.0f);
        r3 = r3 + 1;
        goto L8
    L14:
        r7 = 1.0f;
        goto L15
    L16:
        h12.Q("velocityVector");
        throw null;
    L18:
        if (r4 == null) goto L20;
        return r4;
    L20:
        h12.Q("velocityVector");
        throw null;
    L22:
        h12.Q("velocityVector");
        throw null;
    }

    public boolean F(fr2 r2) {
        Object r0 = this.n;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (((oi) this.p).get(r2) == null) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    public boolean G(br r1) {
        rg4 r0 = (rg4) this.p;
        if (r0 == null) goto L9;
        if (r1 != null) goto L6;
        return false;
    L6:
        if (r0.a.get() != r1) goto L12;
        return true;
    L12:
        return false;
    L9:
        return false;
    }

    public boolean H(fr2 r3, int r4) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r5 = (ba0) ((oi) this.p).get(r3);     // Catch: Throwable -> L17
        monitor-exit(r0);     // Catch: Throwable -> L17
        tn2 r2 = (tn2) ((WeakReference) this.q).get();
        if (r5 != null) goto L9;
        return false;
    L9:
        if (r5.e.a(r4) == false) goto L22;
        if (r2 != null) goto L12;
        return false;
    L12:
        if (r2.s.o().a(r4) == false) goto L24;
        return true;
    L24:
        return false;
    L22:
        return false;
    L17:
        th = move-exception;
        throw th;
    }

    public boolean I(fr2 r4, int r5) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r3 = (ba0) ((oi) this.p).get(r4);     // Catch: Throwable -> L22
        monitor-exit(r0);     // Catch: Throwable -> L22
        if (r3 == null) goto L21;
        wa4 r6 = r3.d;
        r6.getClass();
        if (r5 == 0) goto L11;
        boolean r1 = true;
    L12:
        rr2.k("Use contains(Command) for custom command", r1);
        Iterator<E> r7 = r6.a.iterator();
    L14:
        if (r7.hasNext() == false) goto L18;
        if (((va4) r7.next()).a != r5) goto L14;
        boolean r8 = true;
    L19:
        if (r8 == false) goto L21;
        return true;
    L18:
        r8 = false;
        goto L19
    L11:
        r1 = false;
    L21:
        return false;
    L22:
        th = move-exception;
        throw th;
    }

    public boolean J(fr2 r2, va4 r3) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r1 = (ba0) ((oi) this.p).get(r2);     // Catch: Throwable -> L15
        monitor-exit(r0);     // Catch: Throwable -> L15
        if (r1 == null) goto L13;
        jx1 r4 = r1.d.a;
        r3.getClass();
        if (r4.contains(r3) == false) goto L10;
        return true;
    L10:
        if (j60.n(r3.b) == false) goto L21;
        return true;
    L21:
        return false;
    L13:
        return false;
    L15:
        th = move-exception;
        throw th;
    }

    public void K(br r3) {
        Object r0 = this.n;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (G(r3) == false) goto L11;
        rg4 r4 = (rg4) this.p;     // Catch: Throwable -> L9
        if (r4.c == true) goto L11;
        r4.c = true;     // Catch: Throwable -> L9
        ((Handler) this.o).removeCallbacksAndMessages(r4);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    public void L() {
        tl1 r0 = ze5.a;
        ArrayList r1 = new ArrayList();
        monitor-enter(this);
        Iterator r2 = ((ArrayDeque) this.o).iterator();     // Catch: Throwable -> L12
        r2.getClass();     // Catch: Throwable -> L12
    L6:
        if (r2.hasNext() == false) goto L14;
        yu3 r3 = (yu3) r2.next();     // Catch: Throwable -> L12
        if (((ArrayDeque) this.p).size() >= 64) goto L14;
        if (r3.o.get() >= 5) goto L6;
        r2.remove();     // Catch: Throwable -> L12
        r3.o.incrementAndGet();     // Catch: Throwable -> L12
        r1.add(r3);     // Catch: Throwable -> L12
        ((ArrayDeque) this.p).add(r3);     // Catch: Throwable -> L12
    L14:
        monitor-enter(this);     // Catch: Throwable -> L12
        ((ArrayDeque) this.p).size();     // Catch: Throwable -> L44
        ((ArrayDeque) this.q).size();     // Catch: Throwable -> L44
        monitor-exit(this);     // Catch: Throwable -> L12
        monitor-exit(this);
        int r4 = 0;
        if (((ThreadPoolExecutor) n()).isShutdown() == false) goto L30;
        int r5 = r1.size();
    L21:
        if (r4 >= r5) goto L43;
        yu3 r6 = (yu3) r1.get(r4);
        r6.o.decrementAndGet();
        monitor-enter(this);
        ((ArrayDeque) this.p).remove(r6);     // Catch: Throwable -> L27
        monitor-exit(this);
        InterruptedIOException r7 = new InterruptedIOException("executor rejected");
        r7.initCause(null);
        bv3 r8 = r6.p;
        r8.g(r7);
        r6.n.onFailure(r8, r7);
        r4 = r4 + 1;
    L27:
        th = move-exception;
        throw th;
    L43:
        return;
    L30:
        int r9 = r1.size();
    L31:
        if (r4 >= r9) goto L66;
        yu3 r10 = (yu3) r1.get(r4);
        ExecutorService r11 = n();
        r10.getClass();
        bv3 r12 = r10.p;
        na4 r13 = r12.n.a;
        tl1 r14 = ze5.a;
        ((ThreadPoolExecutor) r11).execute(r10);     // Catch: Throwable -> L35 RejectedExecutionException -> L37
    L40:
        r4 = r4 + 1;
    L37:
        e = move-exception;
        InterruptedIOException r15 = new InterruptedIOException("executor rejected");     // Catch: Throwable -> L35
        r15.initCause(e);     // Catch: Throwable -> L35
        bv3 r16 = r10.p;     // Catch: Throwable -> L35
        r16.g(r15);     // Catch: Throwable -> L35
        r10.n.onFailure(r16, r15);     // Catch: Throwable -> L35
        r12.n.a.q(r10);
    L35:
        th = move-exception;
        r12.n.a.q(r10);
        throw th;
    L66:
        return;
    L44:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    public synchronized ArrayList M() {
        monitor-enter(this);
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L16
        Iterator r3 = ((ArrayList) this.n).iterator();     // Catch: Throwable -> L16
    L5:
        if (r3.hasNext() == false) goto L18;
        cz2 r4 = (cz2) r3.next();     // Catch: Throwable -> L16
        if (r4.a.isAssignableFrom(String.class) == true) goto L10;
    L12:
        boolean r5 = false;
    L13:
        if (r5 == false) goto L5;
        r3.remove();     // Catch: Throwable -> L16
        r2.add(r4.c);     // Catch: Throwable -> L16
        goto L5
    L10:
        if (r4.b.isAssignableFrom(InputStream.class) == false) goto L12;
        r5 = true;
        goto L13
    L18:
        monitor-exit(this);
        return r2;
    L16:
        th = move-exception;
        throw th;
    }

    public void N(fr2 r5) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r1 = (ba0) ((oi) this.p).remove(r5);     // Catch: Throwable -> L8
        if (r1 != null) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        ((oi) this.o).remove(r1.a);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        r1.b.a();
        tn2 r4 = (tn2) ((WeakReference) this.q).get();
        if (r4 != null) goto L15;
        return;
    L15:
        if (r4.l() == true) goto L23;
        f35.W(r4.l, new y90(r4, r5, 0));
        return;
    L23:
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void O(br r3) {
        Object r0 = this.n;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (G(r3) == false) goto L11;
        rg4 r4 = (rg4) this.p;     // Catch: Throwable -> L9
        if (r4.c == false) goto L11;
        r4.c = false;     // Catch: Throwable -> L9
        P(r4);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    public void P(rg4 r3) {
        Handler r2 = (Handler) this.o;
        int r0 = r3.b;
        if (r0 != (-2)) goto L5;
        return;
    L5:
        if (r0 <= 0) goto L8;
    L11:
        r2.removeCallbacksAndMessages(r3);
        r2.sendMessageDelayed(Message.obtain(r2, 0, r3), r0);
        return;
    L8:
        if (r0 != (-1)) goto L10;
        r0 = 1500;
        goto L11
    L10:
        r0 = 2750;
        goto L11
    }

    public void Q() {
        rg4 r0 = (rg4) this.q;
        if (r0 == null) goto L10;
        this.p = r0;
        this.q = null;
        br r1 = (br) r0.a.get();
        if (r1 == null) goto L8;
        Handler r2 = fr.z;
        r2.sendMessage(r2.obtainMessage(0, r1.a));
        return;
    L8:
        this.p = null;
        return;
    }

    public void R(gl4 r4) {
        r4.getClass();
        ur2 r0 = new ur2(24, this, r4);
        Object r1 = this.p;
        monitor-enter(r1);
        Runnable r5 = (Runnable) ((LinkedHashMap) this.q).put(r4, r0);     // Catch: Throwable -> L8
        monitor-exit(r1);
        ((Handler) ((hg3) this.n).o).postDelayed(r0, 5400000);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void S() {
        ArrayList r0 = (ArrayList) this.q;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L12;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        int r4 = ((o23) r3).a;
        if (o(r4) != null) goto L3;
        int r5 = r23.w;
        StringBuilder r6 = xa3.j("Navigation destination ", ya4.v((Context) this.n, r4), " cannot be found in the navigation graph ");
        kf2.g((t23) this.p, r6);
        return;
    }

    public void a(Object r4, fr2 r5, wa4 r6, mi3 r7) {
        Object r0 = this.n;
        monitor-enter(r0);
        fr2 r1 = w(r4);     // Catch: Throwable -> L7
        if (r1 != null) goto L9;
        ((oi) this.o).put(r4, r5);     // Catch: Throwable -> L7
        ((oi) this.p).put(r5, new ba0(r4, new yk(), r6, r7));     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L9:
        ba0 r3 = (ba0) ((oi) this.p).get(r1);     // Catch: Throwable -> L7
        r3.getClass();     // Catch: Throwable -> L7
        r3.d = r6;     // Catch: Throwable -> L7
        r3.e = r7;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.zn4
    public void c(byte[] r26, int r27, int r28, yn4 r29, wc0 r30) {
        be3 r2 = (be3) this.n;
        r2.L(r27 + r28, r26);
        r2.N(r27);
        be3 r1 = (be3) this.o;
        o85 r3 = (o85) this.p;
        if (((Inflater) this.q) != null) goto L5;
        this.q = new Inflater();
    L5:
        Inflater r0 = (Inflater) this.q;
        String r4 = f35.a;
        if (r2.a() > 0) goto L8;
    L12:
        r3.c = false;
        r3.g = null;
        r3.h = -1;
        r3.i = -1;
        int r5 = r2.a();
        if (r5 >= 2) goto L15;
    L88:
        ig0 r6 = null;
    L91:
        if (r6 == null) goto L94;
        gy3 r7 = yw1.o(r6);
    L95:
        r30.accept(new lg0(-9223372036854775807L, 5000000, r7));
        return;
    L94:
        vw1 r8 = yw1.o;
        r7 = gy3.r;
        goto L95
    L15:
        if (r2.H() != r5) goto L88;
        if (r3.d != null) goto L21;
        l93.q0("VobsubParser", "Skipping SPU (no palette)");
    L71:
        if (r3.d == null) goto L88;
        if (r3.b == false) goto L88;
        if (r3.c == false) goto L88;
        Rect r9 = r3.g;
        if (r9 == null) goto L88;
        if (r3.h == (-1)) goto L88;
        if (r3.i == (-1)) goto L88;
        if (r9.width() < 2) goto L88;
        if (r3.g.height() < 2) goto L88;
        Rect r10 = r3.g;
        int[] r11 = new int[r10.height() * r10.width()];
        h00 r12 = new h00();
        r2.N(r3.h);
        r12.p(r2);
        r3.b(r12, true, r10, r11);
        r2.N(r3.i);
        r12.p(r2);
        r3.b(r12, false, r10, r11);
        r6 = new ig0(null, null, null, Bitmap.createBitmap(r11, r10.width(), r10.height(), Bitmap.Config.ARGB_8888), r10.top / r3.f, 0, 0, r10.left / r3.e, 0, Integer.MIN_VALUE, -3.4028235E38f, r10.width() / r3.e, r10.height() / r3.f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        goto L91
    L21:
        if (r3.b == true) goto L23;
        l93.q0("VobsubParser", "Skipping SPU (no plane)");
        goto L71
    L23:
        int r13 = r2.b - 2;
        r2.N(r2.H() + r13);
    L24:
        int r14 = 4;
        if (r2.a() >= 4) goto L27;
        boolean r15 = false;
    L69:
        if (r15 == true) goto L24;
    L27:
        int r16 = r2.b;
        r2.O(2);
        int r17 = r2.H() + r13;
        if (r17 != r16) goto L30;
    L32:
        r15 = false;
    L33:
        if (r15 == false) goto L35;
        int r18 = r17;
    L36:
        boolean r19 = true;
    L38:
        if (r2.b >= r18) goto L67;
        if (r19 == false) goto L67;
        int[] r110 = r3.a;
        int r111 = r2.A();
        if (r111 != 255) goto L43;
    L45:
        r19 = false;
    L66:
        r14 = 4;
        goto L38
    L43:
        switch(r111) {
            case 0: goto L50;
            case 1: goto L50;
            case 2: goto L50;
            case 3: goto L63;
            case 4: goto L56;
            case 5: goto L52;
            case 6: goto L47;
            default: goto L44;
        };
    L44:
        xa3.m(r111, "Unrecognized command: ", "VobsubParser");
    L50:
        r19 = true;
        goto L66
    L47:
        if (r2.a() >= r14) goto L49;
        l93.q0("VobsubParser", "Incomplete offsets command");
        goto L45
    L49:
        r3.h = r2.H();
        r3.i = r2.H();
        goto L50
    L52:
        if (r2.a() >= 6) goto L54;
        l93.q0("VobsubParser", "Incomplete area command");
        goto L45
    L54:
        int r112 = r2.A();
        int r113 = r2.A();
        int r114 = (r112 << r14) | (r113 >> 4);
        int r115 = ((r113 & 15) << 8) | r2.A();
        int r116 = r2.A();
        int r117 = r2.A();
        r3.g = new Rect(r114, (r116 << r14) | (r117 >> 4), r115 + 1, (((r117 & 15) << 8) | r2.A()) + 1);
        goto L50
    L56:
        if (r2.a() >= 2) goto L59;
        l93.q0("VobsubParser", "Incomplete alpha command");
        goto L45
    L59:
        if (r3.c == true) goto L61;
        l93.q0("VobsubParser", "Ignoring alpha command before color command");
        goto L45
    L61:
        int r20 = r2.A();
        int r118 = r2.A();
        r110[3] = o85.c(r110[3], r20 >> 4);
        r110[2] = o85.c(r110[2], r20 & 15);
        r110[1] = o85.c(r110[1], r118 >> 4);
        r110[0] = o85.c(r110[0], r118 & 15);
        goto L50
    L63:
        if (r2.a() >= 2) goto L65;
        l93.q0("VobsubParser", "Incomplete color command");
        goto L45
    L65:
        int r21 = r2.A();
        int r119 = r2.A();
        r110[3] = o85.a(r3.d, r21 >> 4);
        r110[2] = o85.a(r3.d, r21 & 15);
        r110[1] = o85.a(r3.d, r119 >> 4);
        r110[0] = o85.a(r3.d, r119 & 15);
        r3.c = true;
    L67:
        if (r15 == false) goto L69;
        r2.N(r17);
        goto L69
    L35:
        r18 = r2.c;
        goto L36
    L30:
        if (r17 >= r2.c) goto L32;
        r15 = true;
        goto L33
    L8:
        if (r2.j() != 120) goto L12;
        if (f35.K(r2, r1, r0) == false) goto L12;
        r2.L(r1.c, r1.a);
        goto L12
    }

    public void d(fr2 r4, int r5, aa0 r6) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r3 = (ba0) ((oi) this.p).get(r4);     // Catch: Throwable -> L7
        if (r3 == null) goto L9;
        mi3 r7 = r3.g;     // Catch: Throwable -> L7
        r7.getClass();     // Catch: Throwable -> L7
        xk0 r1 = new xk0(2);     // Catch: Throwable -> L7
        r1.c(r7.a);     // Catch: Throwable -> L7
        r1.b(r5);     // Catch: Throwable -> L7
        r3.g = new mi3(r1.f());     // Catch: Throwable -> L7
        r3.c.add(r6);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void e(Class r2, Class r3, vw2 r4) {
        monitor-enter(this);
        cz2 r0 = new cz2(r2, r3, r4);     // Catch: Throwable -> L8
        ArrayList r5 = (ArrayList) this.n;     // Catch: Throwable -> L8
        r5.add(r5.size(), r0);     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public synchronized uw2 f(Class r10, Class r11) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L17
        ArrayList r1 = (ArrayList) this.n;     // Catch: Throwable -> L17
        int r2 = r1.size();     // Catch: Throwable -> L17
        boolean r4 = false;
        int r5 = 0;
    L4:
        boolean r6 = true;
        if (r5 >= r2) goto L20;
        Object r7 = r1.get(r5);     // Catch: Throwable -> L17
        r5 = r5 + 1;     // Catch: Throwable -> L17
        cz2 r8 = (cz2) r7;     // Catch: Throwable -> L17
        if (((HashSet) this.p).contains(r8) == true) goto L8;
        if (r8.a.isAssignableFrom(r10) == true) goto L12;
    L14:
        r6 = false;
    L15:
        if (r6 == false) goto L4;
        ((HashSet) this.p).add(r8);     // Catch: Throwable -> L17
        r0.add(r8.c.a(this));     // Catch: Throwable -> L17
        ((HashSet) this.p).remove(r8);     // Catch: Throwable -> L17
        goto L4
    L12:
        if (r8.b.isAssignableFrom(r11) == false) goto L14;
    L8:
        r4 = true;
        goto L4
    L20:
        if (r0.size() <= 1) goto L25;
        tv1 r12 = (tv1) this.o;     // Catch: Throwable -> L17
        i61 r13 = (i61) this.q;     // Catch: Throwable -> L17
        r12.getClass();     // Catch: Throwable -> L17
        lk r14 = new lk(2, r0, r13);     // Catch: Throwable -> L17
        monitor-exit(this);
        return r14;
    L25:
        if (r0.size() != 1) goto L29;
        uw2 r15 = (uw2) r0.get(0);     // Catch: Throwable -> L17
        monitor-exit(this);
        return r15;
    L29:
        if (r4 == false) goto L34;
        l15 r16 = s;     // Catch: Throwable -> L17
        monitor-exit(this);
        return r16;
    L34:
        throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + r10 + " and data: " + r11);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        ((HashSet) this.p).clear();     // Catch: Throwable -> L37
        throw th;     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.jj1
    public void g(String r9, String r10) {
        r9.getClass();
        jx3 r2 = (jx3) this.o;
        jx3 r4 = (jx3) this.p;
        vb4 r5 = (vb4) this.n;
        Preference r6 = (Preference) this.q;
        do1 r1 = new do1(1, r9);
        String r3 = r5.s(R.string.homemusic_settings_google_linked);
        r3.getClass();
        io1.a.execute(new up(r1, r2, r3, r4, r5, r6, 2));
    }

    public synchronized ArrayList h(Class r7) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L12
        ArrayList r1 = (ArrayList) this.n;     // Catch: Throwable -> L12
        int r2 = r1.size();     // Catch: Throwable -> L12
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L14;
        Object r4 = r1.get(r3);     // Catch: Throwable -> L12
        r3 = r3 + 1;     // Catch: Throwable -> L12
        cz2 r5 = (cz2) r4;     // Catch: Throwable -> L12
        if (((HashSet) this.p).contains(r5) == true) goto L4;
        if (r5.a.isAssignableFrom(r7) == false) goto L4;
        ((HashSet) this.p).add(r5);     // Catch: Throwable -> L12
        r0.add(r5.c.a(this));     // Catch: Throwable -> L12
        ((HashSet) this.p).remove(r5);     // Catch: Throwable -> L12
        goto L4
    L14:
        monitor-exit(this);
        return r0;
    L12:
        th = move-exception;
        ((HashSet) this.p).clear();     // Catch: Throwable -> L18
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    public void i(gl4 r3) {
        r3.getClass();
        Object r0 = this.p;
        monitor-enter(r0);
        Runnable r4 = (Runnable) ((LinkedHashMap) this.q).remove(r3);     // Catch: Throwable -> L9
        monitor-exit(r0);
        if (r4 == null) goto L14;
        ((Handler) ((hg3) this.n).o).removeCallbacks(r4);
        return;
    L14:
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public boolean j(rg4 r3, int r4) {
        br r0 = (br) r3.a.get();
        if (r0 == null) goto L6;
        ((Handler) this.o).removeCallbacksAndMessages(r3);
        Handler r2 = fr.z;
        r2.sendMessage(r2.obtainMessage(1, r4, 0, r0.a));
        return true;
    L6:
        return false;
    }

    public hr4 k() {
        Context r1 = (Context) this.n;
        ArrayList r2 = (ArrayList) this.q;
        Intent r3 = (Intent) this.o;
        t23 r4 = (t23) this.p;
        if (r4 != null) goto L5;
        kf2.o("You must call setGraph() before constructing the deep link");
        return null;
    L5:
        if (r2.isEmpty() == true) goto L28;
        ArrayList r6 = new ArrayList();
        ArrayList<? extends Parcelable> r7 = new ArrayList();
        int r8 = r2.size();
        int r9 = 0;
        int r11 = 0;
        r23 r10 = null;
    L7:
        if (r11 >= r8) goto L16;
        Object r12 = r2.get(r11);
        r11 = r11 + 1;
        o23 r13 = (o23) r12;
        int r14 = r13.a;
        Bundle r15 = r13.b;
        r23 r16 = o(r14);
        if (r16 == null) goto L14;
        int[] r17 = r16.b(r10);
        int r18 = r17.length;
        int r19 = 0;
    L11:
        if (r19 >= r18) goto L13;
        r6.add(Integer.valueOf(r17[r19]));
        r7.add(r15);
        r19 = r19 + 1;
        goto L11
    L13:
        r10 = r16;
        goto L7
    L14:
        int r0 = r23.w;
        tb4.h("Navigation destination ", ya4.v(r1, r14), " cannot be found in the navigation graph ", r4);
        return null;
    L16:
        r3.putExtra("android-support-nav:controller:deepLinkIds", q40.P0(r6));
        r3.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", r7);
        hr4 r5 = new hr4(r1);
        Intent r20 = new Intent(r3);
        ComponentName r21 = r20.getComponent();
        if (r21 != null) goto L19;
        r21 = r20.resolveActivity(r5.o.getPackageManager());
    L19:
        if (r21 == null) goto L21;
        r5.a(r21);
    L21:
        ArrayList r22 = r5.n;
        r22.add(r20);
        int r23 = r22.size();
    L22:
        if (r9 >= r23) goto L27;
        Intent r24 = (Intent) r22.get(r9);
        if (r24 == null) goto L26;
        r24.putExtra("android-support-nav:controller:deepLinkIntent", r3);
    L26:
        r9 = r9 + 1;
        goto L22
    L27:
        return r5;
    L28:
        kf2.o("You must call setDestination() or addDestination() before constructing the deep link");
        return null;
    }

    public Object l(long r8, long r10, wd0 r12) {
        if ((r12 instanceof z43) == false) goto L8;
        z43 r0 = (z43) r12;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L8;
        r0.p = r1 - Integer.MIN_VALUE;
    L7:
        z43 r13 = r0;
        Object r2 = r13.n;
        int r3 = r13.p;
        e53 r4 = null;
        if (r3 == 0) goto L17;
        if (r3 == 1) goto L16;
        if (r3 != 2) goto L14;
        kb4.X(r2);
    L37:
        long r5 = ((k45) r2).a;
    L39:
        return new k45(r5);
    L14:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L16:
        kb4.X(r2);
    L28:
        r5 = ((k45) r2).a;
        goto L39
    L17:
        kb4.X(r2);
        e53 r6 = (e53) this.n;
        if (r6 == null) goto L20;
        e53 r7 = r6.r0();
    L21:
        r5 = 0;
        xe0 r9 = xe0.n;
        if (r7 != null) goto L29;
        e53 r11 = (e53) this.o;
        if (r11 == null) goto L39;
        r13.p = 1;
        r2 = r11.b0(r8, r10, r13);
        if (r2 != r9) goto L28;
    L36:
        return r9;
    L29:
        e53 r14 = (e53) this.n;
        if (r14 == null) goto L32;
        r4 = r14.r0();
    L32:
        e53 r15 = r4;
        if (r15 == null) goto L39;
        r13.p = 2;
        r2 = r15.b0(r8, r10, r13);
        if (r2 != r9) goto L37;
    L20:
        r7 = null;
    L8:
        r0 = new z43(this, r12);
        goto L7
    }

    public Object m(long r5, wd0 r7) {
        if ((r7 instanceof a53) == false) goto L7;
        a53 r0 = (a53) r7;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.n;
        int r2 = r0.p;
        e53 r3 = null;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r8);
    L21:
        long r4 = ((k45) r8).a;
    L24:
        return new k45(r4);
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r8);
        e53 r6 = (e53) this.n;
        if (r6 == null) goto L17;
        r3 = r6.r0();
    L17:
        if (r3 == null) goto L22;
        r0.p = 1;
        r8 = r3.s(r5, r0);
        xe0 r9 = xe0.n;
        if (r8 != r9) goto L21;
        return r9;
    L22:
        r4 = 0;
    L7:
        r0 = new a53(this, r7);
        goto L8
    }

    public synchronized ExecutorService n() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (((ThreadPoolExecutor) this.n) != null) goto L8;
        this.n = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ye5(ze5.c + " Dispatcher", false));     // Catch: Throwable -> L6
    L8:
        ThreadPoolExecutor r0 = (ThreadPoolExecutor) this.n;     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    }

    public r23 o(int r3) {
        ii r0 = new ii();
        t23 r2 = (t23) this.p;
        r2.getClass();
        r0.addLast(r2);
    L4:
        if (r0.isEmpty() == true) goto L14;
        r23 r4 = (r23) r0.removeFirst();
        if (r4.u == r3) goto L7;
        if ((r4 instanceof t23) == false) goto L4;
        s23 r1 = new s23((t23) r4);
    L12:
        if (r1.hasNext() == false) goto L4;
        r0.addLast((r23) r1.next());
        goto L12
    L7:
        return r4;
    L14:
        return null;
    }

    public void p(ArrayDeque r1, Object r2) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (r1.remove(r2) == false) goto L9;
        monitor-exit(this);
        L();
        return;
    L9:
        throw new AssertionError("Call wasn't in-flight!");     // Catch: Throwable -> L10
    }

    public void q(yu3 r2) {
        r2.o.decrementAndGet();
        p((ArrayDeque) this.p, r2);
    }

    public void r(ba0 r13) {
        tn2 r0 = (tn2) ((WeakReference) this.q).get();
        if (r0 == null) goto L13;
        AtomicBoolean r6 = new AtomicBoolean(true);
    L7:
        if (r6.get() == false) goto L16;
        r6.set(false);
        aa0 r3 = (aa0) r13.c.poll();
        if (r3 == null) goto L10;
        AtomicBoolean r4 = new AtomicBoolean(true);
        na4 r2 = this;
        f35.W(r0.l, new ur2(r0, this.w(r13.a), new mr(r2, r3, r4, r13, r6, 1)));
        r4.set(false);
        na4 this = r2;
        goto L7
    L10:
        r13.f = false;
        return;
    L16:
        return;
    }

    public void s(final fr2 r6) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r1 = (ba0) ((oi) this.p).get(r6);     // Catch: Throwable -> L8
        if (r1 != null) goto L10;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L10:
        final mi3 r2 = r1.g;     // Catch: Throwable -> L8
        r1.g = mi3.b;     // Catch: Throwable -> L8
        r1.c.add(new z90(this, r6, r2));     // Catch: Throwable -> L8
        if (r1.f == false) goto L14;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L14:
        r1.f = true;     // Catch: Throwable -> L8
        r(r1);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public mi3 t(fr2 r2) {
        Object r0 = this.n;
        monitor-enter(r0);
        ba0 r1 = (ba0) ((oi) this.p).get(r2);     // Catch: Throwable -> L9
        if (r1 == null) goto L11;
        mi3 r3 = r1.e;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r3;
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return null;
    L9:
        th = move-exception;
        throw th;
    }

    public yw1 u() {
        Object r0 = this.n;
        monitor-enter(r0);
        yw1 r1 = yw1.k(((oi) this.o).values());     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.jj1
    public void v(String r1) {
        if (r1 == null) goto L5;
        bu.f((vb4) this.n, r1);
        return;
    }

    public fr2 w(Object r2) {
        Object r0 = this.n;
        monitor-enter(r0);
        fr2 r1 = (fr2) ((oi) this.o).get(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public we0 x() {
        we0 r0 = (we0) ((gf1) this.p).invoke();
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public synchronized ArrayList y(Class r7) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L11
        ArrayList r1 = (ArrayList) this.n;     // Catch: Throwable -> L11
        int r2 = r1.size();     // Catch: Throwable -> L11
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L13;
        Object r4 = r1.get(r3);     // Catch: Throwable -> L11
        r3 = r3 + 1;     // Catch: Throwable -> L11
        cz2 r5 = (cz2) r4;     // Catch: Throwable -> L11
        if (r0.contains(r5.b) == true) goto L4;
        if (r5.a.isAssignableFrom(r7) == false) goto L4;
        r0.add(r5.b);     // Catch: Throwable -> L11
        goto L4
    L13:
        monitor-exit(this);
        return r0;
    L11:
        th = move-exception;
        throw th;
    }

    public /* synthetic */ na4(Object r1, Object r2, Object r3, Object r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public na4(int r4) {
        switch(r4) {
            case 10: goto L7;
            case 11: goto L5;
            default: goto L3;
        };
    L3:
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.q = new ArrayDeque();
        return;
    L5:
        this.n = new Object();
        this.o = new Handler(Looper.getMainLooper(), new ai1(1, this));
        return;
    L7:
        this.p = new wc(14, this);
    }

    public na4(tn2 r3) {
        this.o = new oi(0);
        this.p = new oi(0);
        this.n = new Object();
        this.q = new WeakReference(r3);
    }

    public na4(v23 r6) {
        r6.getClass();
        Context r0 = r6.a;
        this.n = r0;
        g71 r1 = new g71(new h71(new tq4(fa4.c0(k5.w, r0), k5.x, 1), false, new o54(13)));
        if (r1.hasNext() == true) goto L5;
        Object r2 = null;
    L6:
        Activity r3 = (Activity) r2;
        if (r3 == null) goto L9;
        Intent r4 = new Intent(r0, r3.getClass());
    L12:
        r4.addFlags(268468224);
        this.o = r4;
        this.q = new ArrayList();
        this.p = r6.i();
        return;
    L9:
        r4 = r0.getPackageManager().getLaunchIntentForPackage(r0.getPackageName());
        if (r4 != null) goto L12;
        r4 = new Intent();
        goto L12
    L5:
        r2 = r1.next();
        goto L6
    }

    public /* synthetic */ na4(ConstraintLayout r1, View r2, View r3, View r4, View r5) {
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }

    public na4(rm2 r1) {
        this.n = r1;
    }
}
