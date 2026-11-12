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
    public static final Bitmap.Config w = null;
    public final tf4 n;
    public final Set o;
    public final tv1 p;
    public final long q;
    public long r;
    public int s;
    public int t;
    public int u;
    public int v;

    static {
        w = Bitmap.Config.ARGB_8888;
    }

    public nf2(long r5) {
        tf4 r0 = new tf4();
        HashSet r1 = new HashSet(Arrays.asList(Bitmap.Config.values()));
        r1.add(null);
        if (Build.VERSION.SDK_INT < 26) goto L5;
        r1.remove(j3.D());
    L5:
        Set r2 = Collections.unmodifiableSet(r1);
        this.q = r5;
        this.n = r0;
        this.o = r2;
        this.p = new tv1();
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.s + ", misses=" + this.t + ", puts=" + this.u + ", evictions=" + this.v + ", currentSize=" + this.r + ", maxSize=" + this.q + "\nStrategy=" + this.n);
    }

    public final synchronized Bitmap b(int r9, int r10, Bitmap.Config r11) {
        monitor-enter(this);
    L18:
        th = move-exception;
        throw th;
    L5:
        if (Build.VERSION.SDK_INT >= 26) goto L8;
    L9:
        tf4 r2 = this.n;     // Catch: Throwable -> L18
        if (r11 == null) goto L12;
        Bitmap.Config r3 = r11;
    L13:
        Bitmap r4 = r2.b(r9, r10, r3);     // Catch: Throwable -> L18
        if (r4 == null) goto L16;
        this.s++;     // Catch: Throwable -> L18
        long r5 = this.r;     // Catch: Throwable -> L18
        this.n.getClass();     // Catch: Throwable -> L18
        this.r = r5 - ((long) e35.v(r4));     // Catch: Throwable -> L18
        this.p.getClass();     // Catch: Throwable -> L18
        r4.setHasAlpha(true);     // Catch: Throwable -> L18
        r4.setPremultiplied(true);     // Catch: Throwable -> L18
    L23:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L26;
        this.n.getClass();     // Catch: Throwable -> L18
        Log.v("LruBitmapPool", "Get bitmap=".concat(tf4.c(e35.w(r11) * (r9 * r10), r11)));     // Catch: Throwable -> L18
    L26:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L28;
        a();     // Catch: Throwable -> L18
    L28:
        monitor-exit(this);
        return r4;
    L16:
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L20;
        this.n.getClass();     // Catch: Throwable -> L18
        Log.d("LruBitmapPool", "Missing bitmap=".concat(tf4.c(e35.w(r11) * (r9 * r10), r11)));     // Catch: Throwable -> L18
    L20:
        this.t++;     // Catch: Throwable -> L18
        goto L23
    L12:
        r3 = w;     // Catch: Throwable -> L18
        goto L13
    L8:
        if (r11 != j3.D()) goto L9;
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + r11 + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");     // Catch: Throwable -> L18
    }

    @Override // defpackage.zs
    public final Bitmap c(int r1, int r2, Bitmap.Config r3) {
        Bitmap r0 = b(r1, r2, r3);
        if (r0 != null) goto L9;
        if (r3 != null) goto L8;
        r3 = w;
    L8:
        return Bitmap.createBitmap(r1, r2, r3);
    L9:
        return r0;
    }

    @Override // defpackage.zs
    public final synchronized void d(Bitmap r9) {
        monitor-enter(this);
        if (r9 == null) goto L34;
        if (r9.isRecycled() == true) goto L32;
        if (r9.isMutable() == false) goto L26;
        this.n.getClass();     // Catch: Throwable -> L17
        if (e35.v(r9) > this.q) goto L26;
        if (this.o.contains(r9.getConfig()) == false) goto L26;
        this.n.getClass();     // Catch: Throwable -> L17
        int r0 = e35.v(r9);     // Catch: Throwable -> L17
        this.n.e(r9);     // Catch: Throwable -> L17
        this.p.getClass();     // Catch: Throwable -> L17
        this.u++;     // Catch: Throwable -> L17
        this.r += (long) r0;     // Catch: Throwable -> L17
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L20;
        this.n.getClass();     // Catch: Throwable -> L17
        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(tf4.c(e35.v(r9), r9.getConfig())));     // Catch: Throwable -> L17
    L20:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L22;
        a();     // Catch: Throwable -> L17
    L22:
        e(this.q);     // Catch: Throwable -> L17
        monitor-exit(this);
        return;
    L26:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L28;
        StringBuilder r2 = new StringBuilder("Reject bitmap from pool, bitmap: ");     // Catch: Throwable -> L17
        this.n.getClass();     // Catch: Throwable -> L17
        r2.append(tf4.c(e35.v(r9), r9.getConfig()));     // Catch: Throwable -> L17
        r2.append(", is mutable: ");     // Catch: Throwable -> L17
        r2.append(r9.isMutable());     // Catch: Throwable -> L17
        r2.append(", is allowed config: ");     // Catch: Throwable -> L17
        r2.append(this.o.contains(r9.getConfig()));     // Catch: Throwable -> L17
        Log.v("LruBitmapPool", r2.toString());     // Catch: Throwable -> L17
    L28:
        r9.recycle();     // Catch: Throwable -> L17
        monitor-exit(this);
        return;
    L32:
        throw new IllegalStateException("Cannot pool recycled bitmap");     // Catch: Throwable -> L17
    L34:
        throw new NullPointerException("Bitmap must not be null");     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }

    public final synchronized void e(long r7) {
        monitor-enter(this);
    L29:
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.r <= r7) goto L25;
        tf4 r0 = this.n;     // Catch: Throwable -> L12
        Bitmap r1 = (Bitmap) r0.b.l();     // Catch: Throwable -> L12
        if (r1 == null) goto L8;
        r0.a(Integer.valueOf(e35.v(r1)), r1);     // Catch: Throwable -> L12
    L8:
        if (r1 == null) goto L10;
        this.p.getClass();     // Catch: Throwable -> L12
        long r2 = this.r;     // Catch: Throwable -> L12
        this.n.getClass();     // Catch: Throwable -> L12
        this.r = r2 - ((long) e35.v(r1));     // Catch: Throwable -> L12
        this.v++;     // Catch: Throwable -> L12
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L21;
        StringBuilder r3 = new StringBuilder();     // Catch: Throwable -> L12
        r3.append("Evicting bitmap=");     // Catch: Throwable -> L12
        this.n.getClass();     // Catch: Throwable -> L12
        r3.append(tf4.c(e35.v(r1), r1.getConfig()));     // Catch: Throwable -> L12
        Log.d("LruBitmapPool", r3.toString());     // Catch: Throwable -> L12
    L21:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L23;
        a();     // Catch: Throwable -> L12
    L23:
        r1.recycle();     // Catch: Throwable -> L12
        goto L29
    L10:
        if (Log.isLoggable("LruBitmapPool", 5) == false) goto L14;
        Log.w("LruBitmapPool", "Size mismatch, resetting");     // Catch: Throwable -> L12
        a();     // Catch: Throwable -> L12
    L14:
        this.r = 0;     // Catch: Throwable -> L12
        monitor-exit(this);
        return;
    L25:
        monitor-exit(this);
    }

    @Override // defpackage.zs
    public final Bitmap h(int r1, int r2, Bitmap.Config r3) {
        Bitmap r0 = b(r1, r2, r3);
        if (r0 == null) goto L6;
        r0.eraseColor(0);
        return r0;
    L6:
        if (r3 != null) goto L10;
        r3 = w;
    L10:
        return Bitmap.createBitmap(r1, r2, r3);
    }

    @Override // defpackage.zs
    public final void j(int r5) {
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L6;
        Log.d("LruBitmapPool", "trimMemory, level=" + r5);
    L6:
        if (r5 < 40) goto L8;
    L17:
        k();
        return;
    L8:
        if (r5 >= 20) goto L17;
        if (r5 < 20) goto L12;
    L15:
        e(this.q / 2);
        return;
    L12:
        if (r5 == 15) goto L15;
    }

    @Override // defpackage.zs
    public final void k() {
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L5;
        Log.d("LruBitmapPool", "clearMemory");
    L5:
        e(0);
    }
}
