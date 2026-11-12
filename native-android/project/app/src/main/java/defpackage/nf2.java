package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nf2 implements zs {
    public static final Bitmap.Config w = Bitmap.Config.ARGB_8888;
    public final tf4 n;
    public final Set o;
    public final tv1 p;
    public final long q;
    public long r;
    public int s;
    public int t;
    public int u;
    public int v;

    public nf2(long j) {
        tf4 tf4Var = new tf4();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.q = j;
        this.n = tf4Var;
        this.o = setUnmodifiableSet;
        this.p = new tv1();
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.s + ", misses=" + this.t + ", puts=" + this.u + ", evictions=" + this.v + ", currentSize=" + this.r + ", maxSize=" + this.q + "\nStrategy=" + this.n);
    }

    public final synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.n.b(i, i2, config != null ? config : w);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.n.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(tf4.c(e35.w(config) * i * i2, config)));
                }
                this.t++;
            } else {
                this.s++;
                long j = this.r;
                this.n.getClass();
                this.r = j - ((long) e35.v(bitmapB));
                this.p.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.n.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(tf4.c(e35.w(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    @Override // defpackage.zs
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = w;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.zs
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.n.getClass();
                if (e35.v(bitmap) <= this.q && this.o.contains(bitmap.getConfig())) {
                    this.n.getClass();
                    int iV = e35.v(bitmap);
                    this.n.e(bitmap);
                    this.p.getClass();
                    this.u++;
                    this.r += (long) iV;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.n.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(tf4.c(e35.v(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    e(this.q);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.n.getClass();
                sb.append(tf4.c(e35.v(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.o.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(long j) {
        while (this.r > j) {
            try {
                tf4 tf4Var = this.n;
                Bitmap bitmap = (Bitmap) tf4Var.b.l();
                if (bitmap != null) {
                    tf4Var.a(Integer.valueOf(e35.v(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.r = 0L;
                    return;
                }
                this.p.getClass();
                long j2 = this.r;
                this.n.getClass();
                this.r = j2 - ((long) e35.v(bitmap));
                this.v++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.n.getClass();
                    sb.append(tf4.c(e35.v(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zs
    public final Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = w;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.zs
    public final void j(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            k();
        } else if (i >= 20 || i == 15) {
            e(this.q / 2);
        }
    }

    @Override // defpackage.zs
    public final void k() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
