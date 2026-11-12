package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.bumptech.glide.a;
import com.eddyizm.tempus.service.MediaService;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ll implements kg1, pi1, m51 {
    public final /* synthetic */ int n;
    public boolean o;
    public final Object p;
    public Object q;
    public Object r;

    public ll(Context r4, pn0 r5, Boolean r6) {
        boolean r0 = true;
        this.n = 1;
        if (r4 != null) goto L5;
        AudioManager r7 = null;
    L7:
        if (r7 == null) goto L17;
        if (r6 != null) goto L10;
    L12:
        Spatializer r8 = m3.c(r7);
        this.p = r8;
        if (m3.b(r8) != 0) goto L16;
        r0 = false;
    L16:
        this.o = r0;
        kn0 r9 = new kn0(r5);
        this.r = r9;
        Looper r1 = Looper.myLooper();
        r1.getClass();
        Handler r10 = new Handler(r1);
        this.q = r10;
        m3.h(r8, new ym(r10, 0), r9);
        return;
    L10:
        if (r6.booleanValue() == false) goto L12;
    L17:
        this.p = null;
        this.o = false;
        this.q = null;
        this.r = null;
        return;
    L5:
        r7 = xl.n(r4);
        goto L7
    }

    public static void c(float[] r6, float[] r7) {
        Matrix.setIdentityM(r6, 0);
        float r2 = r7[10];
        float r4 = r7[8];
        float r3 = (float) Math.sqrt((r4 * r4) + (r2 * r2));
        float r5 = r7[10] / r3;
        r6[0] = r5;
        float r8 = r7[8];
        r6[2] = r8 / r3;
        r6[8] = (-r8) / r3;
        r6[10] = r5;
    }

    public void a() {
        switch(this.n) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        kr0.b((kr0) this.r, this, false);
        return;
    L6:
        jr0 r0 = (jr0) this.r;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L9:
        if (this.o == true) goto L19;
        if (h12.c(((dr0) this.p).g, this) == false) goto L15;
        r0.f(this, false);     // Catch: Throwable -> L13
    L15:
        this.o = true;     // Catch: Throwable -> L13
        monitor-exit(r0);
        return;
    L19:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L13
    }

    public void b() {
        jr0 r0 = (jr0) this.r;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.o == true) goto L15;
        if (h12.c(((dr0) this.p).g, this) == false) goto L11;
        r0.f(this, true);     // Catch: Throwable -> L9
    L11:
        this.o = true;     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L15:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L9
    }

    public void d() {
        dr0 r0 = (dr0) this.p;
        if (h12.c(r0.g, this) == false) goto L10;
        jr0 r1 = (jr0) this.r;
        if (r1.y == false) goto L8;
        r1.f(this, false);
        return;
    L8:
        r0.f = true;
        return;
    }

    public qm2 e(UUID r17, k31 r18) {
        String r3 = r18.b;
        if (this.o == false) goto L5;
    L6:
        r3 = (String) this.q;
    L8:
        if (TextUtils.isEmpty(r3) == true) goto L28;
        HashMap r4 = new HashMap();
        UUID r5 = ax.e;
        if (r5.equals(r17) == false) goto L13;
        String r6 = "text/xml";
    L16:
        r4.put("Content-Type", r6);
        if (r5.equals(r17) == false) goto L19;
        r4.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
    L19:
        HashMap r1 = (HashMap) this.r;
        monitor-enter(r1);
        r4.putAll((HashMap) this.r);     // Catch: Throwable -> L25
        monitor-exit(r1);     // Catch: Throwable -> L25
        return gb.w(((bl0) this.p).m(), r3, r18.a, r4);
    L25:
        th = move-exception;
        throw th;
    L13:
        if (ax.c.equals(r17) == false) goto L15;
        r6 = "application/json";
        goto L16
    L15:
        r6 = "application/octet-stream";
        goto L16
    L28:
        Map r9 = Collections.EMPTY_MAP;
        Uri r7 = Uri.EMPTY;
        rr2.s(r7, "The uri must be set.");
        throw new MediaDrmCallbackException(new ii0(r7, 0, 1, null, r9, 0, -1, null, 0), r7, ly3.t, 0, new IllegalStateException("No license URL"));
    L5:
        if (TextUtils.isEmpty(r3) == false) goto L8;
        goto L6
    }

    public qm2 f(l31 r10) {
        Charset r0 = StandardCharsets.UTF_8;
        byte[][] r1 = {"{\"signedRequest\":\"".getBytes(r0), r10.a, "\"}".getBytes(r0)};
        long r2 = 0;
        int r4 = 0;
    L4:
        if (r4 >= 3) goto L6;
        r2 = r2 + ((long) r1[r4].length);
        r4 = r4 + 1;
        goto L4
    L6:
        int r5 = (int) r2;
        if (r2 != r5) goto L9;
        boolean r6 = true;
    L10:
        rr2.m(r6, "the total number of elements (%s) in the arrays must fit in an int", r2);
        byte[] r3 = new byte[r5];
        int r7 = 0;
        int r8 = 0;
    L11:
        if (r7 >= 3) goto L13;
        byte[] r9 = r1[r7];
        System.arraycopy(r9, 0, r3, r8, r9.length);
        r8 = r8 + r9.length;
        r7 = r7 + 1;
        goto L11
    L13:
        ci0 r11 = ((bl0) this.p).m();
        String r12 = r10.b;
        String r13 = iu2.i.toString();
        String r14 = String.valueOf(r5);
        uc5.d("Content-Length", r14);
        return gb.w(r11, r12, r3, ly3.g(2, new Object[]{"Content-Type", r13, "Content-Length", r14}, null));
    L9:
        r6 = false;
        goto L10
    }

    public File g() {
        kr0 r0 = (kr0) this.r;
        monitor-enter(r0);
        er0 r1 = (er0) this.p;     // Catch: Throwable -> L9
        if (r1.f != this) goto L15;
        if (r1.e == true) goto L11;
        ((boolean[]) this.q)[0] = true;     // Catch: Throwable -> L9
    L11:
        File r2 = r1.d[0];     // Catch: Throwable -> L9
        ((kr0) this.r).n.mkdirs();     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r2;
    L15:
        throw new IllegalStateException();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pi1
    public Object get() {
        if (this.o == true) goto L11;
        Trace.beginSection(xl.N("Glide registry"));
        this.o = true;
        ey3 r1 = fh0.j((a) this.p, (List) this.q, (g12) this.r);     // Catch: Throwable -> L8
        this.o = false;
        Trace.endSection();
        return r1;
    L8:
        th = move-exception;
        this.o = false;
        Trace.endSection();
        throw th;
    L11:
        kf2.o("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        return null;
    }

    @Override // defpackage.kg1
    public void h(Object r5) {
        tn2 r0 = (tn2) this.r;
        fr2 r1 = (fr2) this.p;
        boolean r2 = this.o;
        mi3 r4 = (mi3) this.q;
        al3 r3 = r0.s;
        ju2.f(r3, (gr2) r5);
        f35.I(r0.s);
        if (r2 == false) goto L6;
        r0.v(r1, r4);
        return;
    }

    public of4 i(int r5) {
        jr0 r0 = (jr0) this.r;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.o == true) goto L25;
        if (h12.c(((dr0) this.p).g, this) == true) goto L12;
        ct r4 = new ct();     // Catch: Throwable -> L14
        monitor-exit(r0);
        return r4;
    L12:
        if (((dr0) this.p).e == true) goto L16;
        boolean[] r1 = (boolean[]) this.q;     // Catch: Throwable -> L14
        r1.getClass();     // Catch: Throwable -> L14
        r1[r5] = true;     // Catch: Throwable -> L14
    L16:
        ge3 r6 = (ge3) ((dr0) this.p).d.get(r5);     // Catch: Throwable -> L14
        hr0 r2 = r0.o;     // Catch: Throwable -> L14 FileNotFoundException -> L21
        r2.getClass();     // Catch: Throwable -> L14 FileNotFoundException -> L21
        r6.getClass();     // Catch: Throwable -> L14 FileNotFoundException -> L21
        of4 r7 = r2.j(r6);     // Catch: Throwable -> L14 FileNotFoundException -> L21
        f61 r3 = new f61(r7, new br0(0, r0, this));     // Catch: Throwable -> L14
        monitor-exit(r0);
        return r3;
    L23:
        return new ct();
    L25:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L14
    }

    public boolean j(int[] r11) {
        r11.getClass();
        ReentrantLock r0 = (ReentrantLock) this.p;
        r0.lock();
        int r1 = r11.length;     // Catch: Throwable -> L9
        int r2 = 0;
        boolean r3 = false;
    L4:
        if (r2 >= r1) goto L12;
        int r4 = r11[r2];     // Catch: Throwable -> L9
        long[] r5 = (long[]) this.q;     // Catch: Throwable -> L9
        long r6 = r5[r4];     // Catch: Throwable -> L9
        r5[r4] = 1 + r6;     // Catch: Throwable -> L9
        if (r6 != 0) goto L11;
        r3 = true;
        this.o = true;     // Catch: Throwable -> L9
    L11:
        r2 = r2 + 1;
        goto L4
    L12:
        r0.unlock();
        return r3;
    L9:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public boolean k(int[] r13) {
        r13.getClass();
        ReentrantLock r0 = (ReentrantLock) this.p;
        r0.lock();
        int r1 = r13.length;     // Catch: Throwable -> L9
        int r2 = 0;
        boolean r3 = false;
    L4:
        if (r2 >= r1) goto L12;
        int r4 = r13[r2];     // Catch: Throwable -> L9
        long[] r5 = (long[]) this.q;     // Catch: Throwable -> L9
        long r6 = r5[r4];     // Catch: Throwable -> L9
        r5[r4] = r6 - 1;     // Catch: Throwable -> L9
        if (r6 != 1) goto L11;
        r3 = true;
        this.o = true;     // Catch: Throwable -> L9
    L11:
        r2 = r2 + 1;
        goto L4
    L12:
        r0.unlock();
        return r3;
    L9:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public void l(boolean r3) {
        if (r3 != this.o) goto L5;
        return;
    L5:
        yp4 r0 = (yp4) this.r;
        if (r3 == false) goto L9;
        final int r1 = 0;
        r0.d(new jl(this, r1));
        this.o = true;
        return;
    L9:
        final int r2 = 1;
        r0.d(new jl(this, r2));
        this.o = false;
    }

    @Override // defpackage.kg1
    public void o(Throwable r5) {
        tn2 r0 = (tn2) this.r;
        if ((r5 instanceof UnsupportedOperationException) == false) goto L5;
        l93.r0("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", r5);
    L6:
        f35.I(r0.s);
        if (this.o == false) goto L10;
        r0.v((fr2) this.p, (mi3) this.q);
        return;
    L10:
        return;
    L5:
        l93.G("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + r5.getMessage(), r5);
        goto L6
    }

    @Override // defpackage.m51
    public void p() {
        SparseArray r0 = (SparseArray) this.r;
        ((m51) this.p).p();
        if (this.o == false) goto L8;
        int r3 = 0;
    L6:
        if (r3 >= r0.size()) goto L10;
        ((ao4) r0.valueAt(r3)).i = true;
        r3 = r3 + 1;
        goto L6
    L10:
        return;
    }

    @Override // defpackage.m51
    public wv4 t(int r4, int r5) {
        SparseArray r0 = (SparseArray) this.r;
        m51 r1 = (m51) this.p;
        if (r5 == 3) goto L6;
        this.o = true;
        return r1.t(r4, r5);
    L6:
        ao4 r2 = (ao4) r0.get(r4);
        if (r2 == null) goto L9;
        return r2;
    L9:
        ao4 r3 = new ao4(r1.t(r4, r5), (xn4) this.q);
        r0.put(r4, r3);
        return r3;
    }

    @Override // defpackage.m51
    public void w(m84 r1) {
        ((m51) this.p).w(r1);
    }

    public ll(m51 r2, xn4 r3) {
        this.n = 12;
        this.p = r2;
        this.q = r3;
        this.r = new SparseArray();
    }

    public ll(MediaService r2, Looper r3, Looper r4, d41 r5, vp4 r6) {
        this.n = 0;
        this.p = r2.getApplicationContext();
        this.r = r6.a(r3, null);
        this.q = new kl(this, r6.a(r4, null), r5);
    }

    public ll(String r2, boolean r3, bl0 r4) {
        this.n = 5;
        if (r3 == true) goto L5;
    L8:
        boolean r0 = true;
    L9:
        rr2.l(r0);
        this.p = r4;
        this.q = r2;
        this.o = r3;
        this.r = new HashMap();
        return;
    L5:
        if (TextUtils.isEmpty(r2) == false) goto L8;
        r0 = false;
        goto L9
    }

    public ll(a r2, List r3, g12 r4) {
        this.n = 10;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    public ll(sd0 r3, kf4 r4) {
        this.n = 11;
        this.r = new oy1(2, this);
        this.q = r3;
        this.p = r4;
    }

    public ll(c82 r2, kn4 r3, wp3 r4) {
        this.n = 9;
        this.p = r2;
        this.q = r3;
        this.r = r4;
        this.o = true;
    }

    public ll(int r2) {
        this.n = 8;
        this.p = new ReentrantLock();
        this.q = new long[r2];
        this.r = new boolean[r2];
    }

    public ll(kr0 r2, er0 r3) {
        this.n = 3;
        this.r = r2;
        this.p = r3;
        if (r3.e == false) goto L5;
        boolean[] r4 = null;
    L6:
        this.q = r4;
        return;
    L5:
        r4 = new boolean[r2.t];
        goto L6
    }

    public ll(jr0 r2, dr0 r3) {
        this.n = 2;
        this.r = r2;
        this.p = r3;
        if (r3.e == false) goto L5;
        boolean[] r4 = null;
    L6:
        this.q = r4;
        return;
    L5:
        r2.getClass();
        r4 = new boolean[2];
        goto L6
    }

    public ll(tn2 r2, fr2 r3, boolean r4, mi3 r5) {
        this.n = 7;
        this.r = r2;
        this.p = r3;
        this.o = r4;
        this.q = r5;
    }

    public ll(int r1, byte r2) {
        this.n = r1;
        switch(r1) {
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        this.p = new float[16];
        this.q = new float[16];
        this.r = new tu();
        return;
    L6:
        this.p = new Object();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.o = true;
    }
}
