package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cl extends MediaCodec.Callback {
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final b30 d;
    public final b30 e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public om1 o;

    public cl(HandlerThread r2) {
        this.a = new Object();
        this.b = r2;
        this.d = new b30();
        this.e = new b30();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public final void a() {
        ArrayDeque r0 = this.g;
        if (r0.isEmpty() == true) goto L5;
        this.i = (MediaFormat) r0.getLast();
    L5:
        b30 r1 = this.d;
        r1.b = r1.a;
        b30 r2 = this.e;
        r2.b = r2.a;
        this.f.clear();
        r0.clear();
    }

    public final void b() {
        IllegalStateException r0 = this.n;
        if (r0 != null) goto L13;
        MediaCodec.CodecException r1 = this.j;
        if (r1 != null) goto L11;
        MediaCodec.CryptoException r2 = this.k;
        if (r2 != null) goto L9;
        return;
    L9:
        this.k = null;
        throw r2;
    L11:
        this.j = null;
        throw r1;
    L13:
        this.n = null;
        throw r0;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec r1, MediaCodec.CryptoException r2) {
        Object r3 = this.a;
        monitor-enter(r3);
        this.k = r2;     // Catch: Throwable -> L7
        monitor-exit(r3);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec r1, MediaCodec.CodecException r2) {
        Object r3 = this.a;
        monitor-enter(r3);
        this.j = r2;     // Catch: Throwable -> L7
        monitor-exit(r3);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec r2, int r3) {
        Object r4 = this.a;
        monitor-enter(r4);
        this.d.a(r3);     // Catch: Throwable -> L11
        om1 r1 = this.o;     // Catch: Throwable -> L11
        if (r1 == null) goto L9;
        k41 r5 = ((gk2) r1.o).V;     // Catch: Throwable -> L11
        if (r5 == null) goto L9;
        r5.a();     // Catch: Throwable -> L11
    L9:
        monitor-exit(r4);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec r4, int r5, MediaCodec.BufferInfo r6) {
        Object r7 = this.a;
        monitor-enter(r7);
        MediaFormat r0 = this.i;     // Catch: Throwable -> L7
        if (r0 == null) goto L9;
        this.e.a(-2);     // Catch: Throwable -> L7
        this.g.add(r0);     // Catch: Throwable -> L7
        this.i = null;     // Catch: Throwable -> L7
    L9:
        this.e.a(r5);     // Catch: Throwable -> L7
        this.f.add(r6);     // Catch: Throwable -> L7
        om1 r3 = this.o;     // Catch: Throwable -> L7
        if (r3 == null) goto L14;
        k41 r8 = ((gk2) r3.o).V;     // Catch: Throwable -> L7
        if (r8 == null) goto L14;
        r8.a();     // Catch: Throwable -> L7
    L14:
        monitor-exit(r7);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec r3, MediaFormat r4) {
        Object r5 = this.a;
        monitor-enter(r5);
        this.e.a(-2);     // Catch: Throwable -> L7
        this.g.add(r4);     // Catch: Throwable -> L7
        this.i = null;     // Catch: Throwable -> L7
        monitor-exit(r5);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
