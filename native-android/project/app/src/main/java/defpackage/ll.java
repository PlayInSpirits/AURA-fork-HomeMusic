package defpackage;

import android.content.Context;
import android.content.IntentFilter;
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

    public ll(Context context, pn0 pn0Var, Boolean bool) {
        this.n = 1;
        AudioManager audioManagerN = context == null ? null : xl.n(context);
        if (audioManagerN == null || (bool != null && bool.booleanValue())) {
            this.p = null;
            this.o = false;
            this.q = null;
            this.r = null;
            return;
        }
        Spatializer spatializer = audioManagerN.getSpatializer();
        this.p = spatializer;
        this.o = spatializer.getImmersiveAudioLevel() != 0;
        kn0 kn0Var = new kn0(pn0Var);
        this.r = kn0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.q = handler;
        spatializer.addOnSpatializerStateChangedListener(new ym(handler, 0), kn0Var);
    }

    public static void c(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public void a() {
        switch (this.n) {
            case 2:
                jr0 jr0Var = (jr0) this.r;
                synchronized (jr0Var) {
                    try {
                        if (this.o) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (h12.c(((dr0) this.p).g, this)) {
                            jr0Var.f(this, false);
                        }
                        this.o = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                kr0.b((kr0) this.r, this, false);
                return;
        }
    }

    public void b() {
        jr0 jr0Var = (jr0) this.r;
        synchronized (jr0Var) {
            try {
                if (this.o) {
                    throw new IllegalStateException("Check failed.");
                }
                if (h12.c(((dr0) this.p).g, this)) {
                    jr0Var.f(this, true);
                }
                this.o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        dr0 dr0Var = (dr0) this.p;
        if (h12.c(dr0Var.g, this)) {
            jr0 jr0Var = (jr0) this.r;
            if (jr0Var.y) {
                jr0Var.f(this, false);
            } else {
                dr0Var.f = true;
            }
        }
    }

    public qm2 e(UUID uuid, k31 k31Var) throws MediaDrmCallbackException {
        String str;
        String str2 = k31Var.b;
        if (this.o || TextUtils.isEmpty(str2)) {
            str2 = (String) this.q;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            rr2.s(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new ii0(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, ly3.t, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = ax.e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = ax.c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.r)) {
            map2.putAll((HashMap) this.r);
        }
        return gb.w(((bl0) this.p).m(), str2, k31Var.a, map2);
    }

    public qm2 f(l31 l31Var) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), l31Var.a, "\"}".getBytes(charset)};
        long length = 0;
        for (int i = 0; i < 3; i++) {
            length += (long) bArr[i].length;
        }
        int i2 = (int) length;
        rr2.m(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        byte[] bArr2 = new byte[i2];
        int length2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            byte[] bArr3 = bArr[i3];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        ci0 ci0VarM = ((bl0) this.p).m();
        String str = l31Var.b;
        String string = iu2.i.toString();
        String strValueOf = String.valueOf(i2);
        uc5.d("Content-Length", strValueOf);
        return gb.w(ci0VarM, str, bArr2, ly3.g(2, new Object[]{"Content-Type", string, "Content-Length", strValueOf}, null));
    }

    public File g() {
        File file;
        synchronized (((kr0) this.r)) {
            try {
                er0 er0Var = (er0) this.p;
                if (er0Var.f != this) {
                    throw new IllegalStateException();
                }
                if (!er0Var.e) {
                    ((boolean[]) this.q)[0] = true;
                }
                file = er0Var.d[0];
                ((kr0) this.r).n.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    @Override // defpackage.pi1
    public Object get() {
        if (this.o) {
            kf2.o("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(xl.N("Glide registry"));
        this.o = true;
        try {
            return fh0.j((a) this.p, (List) this.q, (g12) this.r);
        } finally {
            this.o = false;
            Trace.endSection();
        }
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        tn2 tn2Var = (tn2) this.r;
        fr2 fr2Var = (fr2) this.p;
        boolean z = this.o;
        mi3 mi3Var = (mi3) this.q;
        ju2.f(tn2Var.s, (gr2) obj);
        f35.I(tn2Var.s);
        if (z) {
            tn2Var.v(fr2Var, mi3Var);
        }
    }

    public of4 i(int i) {
        jr0 jr0Var = (jr0) this.r;
        synchronized (jr0Var) {
            try {
                if (this.o) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!h12.c(((dr0) this.p).g, this)) {
                    return new ct();
                }
                if (!((dr0) this.p).e) {
                    boolean[] zArr = (boolean[]) this.q;
                    zArr.getClass();
                    zArr[i] = true;
                }
                ge3 ge3Var = (ge3) ((dr0) this.p).d.get(i);
                try {
                    hr0 hr0Var = jr0Var.o;
                    hr0Var.getClass();
                    ge3Var.getClass();
                    return new f61(hr0Var.j(ge3Var), new br0(0, jr0Var, this));
                } catch (FileNotFoundException unused) {
                    return new ct();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.p;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.q;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.o = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean k(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.p;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.q;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.o = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void l(boolean z) {
        if (z == this.o) {
            return;
        }
        yp4 yp4Var = (yp4) this.r;
        if (z) {
            final int i = 0;
            yp4Var.d(new Runnable(this) { // from class: jl
                public final /* synthetic */ ll o;

                {
                    this.o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    ll llVar = this.o;
                    switch (i2) {
                        case 0:
                            ((Context) llVar.p).registerReceiver((kl) llVar.q, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) llVar.p).unregisterReceiver((kl) llVar.q);
                            break;
                    }
                }
            });
            this.o = true;
        } else {
            final int i2 = 1;
            yp4Var.d(new Runnable(this) { // from class: jl
                public final /* synthetic */ ll o;

                {
                    this.o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    ll llVar = this.o;
                    switch (i3) {
                        case 0:
                            ((Context) llVar.p).registerReceiver((kl) llVar.q, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) llVar.p).unregisterReceiver((kl) llVar.q);
                            break;
                    }
                }
            });
            this.o = false;
        }
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        tn2 tn2Var = (tn2) this.r;
        if (th instanceof UnsupportedOperationException) {
            l93.r0("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            l93.G("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
        }
        f35.I(tn2Var.s);
        if (this.o) {
            tn2Var.v((fr2) this.p, (mi3) this.q);
        }
    }

    @Override // defpackage.m51
    public void p() {
        SparseArray sparseArray = (SparseArray) this.r;
        ((m51) this.p).p();
        if (this.o) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((ao4) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    @Override // defpackage.m51
    public wv4 t(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.r;
        m51 m51Var = (m51) this.p;
        if (i2 != 3) {
            this.o = true;
            return m51Var.t(i, i2);
        }
        ao4 ao4Var = (ao4) sparseArray.get(i);
        if (ao4Var != null) {
            return ao4Var;
        }
        ao4 ao4Var2 = new ao4(m51Var.t(i, i2), (xn4) this.q);
        sparseArray.put(i, ao4Var2);
        return ao4Var2;
    }

    @Override // defpackage.m51
    public void w(m84 m84Var) {
        ((m51) this.p).w(m84Var);
    }

    public ll(m51 m51Var, xn4 xn4Var) {
        this.n = 12;
        this.p = m51Var;
        this.q = xn4Var;
        this.r = new SparseArray();
    }

    public ll(MediaService mediaService, Looper looper, Looper looper2, d41 d41Var, vp4 vp4Var) {
        this.n = 0;
        this.p = mediaService.getApplicationContext();
        this.r = vp4Var.a(looper, null);
        this.q = new kl(this, vp4Var.a(looper2, null), d41Var);
    }

    public ll(String str, boolean z, bl0 bl0Var) {
        this.n = 5;
        rr2.l((z && TextUtils.isEmpty(str)) ? false : true);
        this.p = bl0Var;
        this.q = str;
        this.o = z;
        this.r = new HashMap();
    }

    public ll(a aVar, List list, g12 g12Var) {
        this.n = 10;
        this.p = aVar;
        this.q = list;
        this.r = g12Var;
    }

    public ll(sd0 sd0Var, kf4 kf4Var) {
        this.n = 11;
        this.r = new oy1(2, this);
        this.q = sd0Var;
        this.p = kf4Var;
    }

    public ll(c82 c82Var, kn4 kn4Var, wp3 wp3Var) {
        this.n = 9;
        this.p = c82Var;
        this.q = kn4Var;
        this.r = wp3Var;
        this.o = true;
    }

    public ll(int i) {
        this.n = 8;
        this.p = new ReentrantLock();
        this.q = new long[i];
        this.r = new boolean[i];
    }

    public ll(kr0 kr0Var, er0 er0Var) {
        this.n = 3;
        this.r = kr0Var;
        this.p = er0Var;
        this.q = er0Var.e ? null : new boolean[kr0Var.t];
    }

    public ll(jr0 jr0Var, dr0 dr0Var) {
        boolean[] zArr;
        this.n = 2;
        this.r = jr0Var;
        this.p = dr0Var;
        if (dr0Var.e) {
            zArr = null;
        } else {
            jr0Var.getClass();
            zArr = new boolean[2];
        }
        this.q = zArr;
    }

    public ll(tn2 tn2Var, fr2 fr2Var, boolean z, mi3 mi3Var) {
        this.n = 7;
        this.r = tn2Var;
        this.p = fr2Var;
        this.o = z;
        this.q = mi3Var;
    }

    public ll(int i, byte b) {
        this.n = i;
        switch (i) {
            case 6:
                this.p = new Object();
                this.q = new ArrayList();
                this.r = new ArrayList();
                this.o = true;
                break;
            default:
                this.p = new float[16];
                this.q = new float[16];
                this.r = new tu();
                break;
        }
    }
}
