package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cl extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public om1 o;
    public final Object a = new Object();
    public final b30 d = new b30();
    public final b30 e = new b30();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public cl(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        b30 b30Var = this.d;
        b30Var.b = b30Var.a;
        b30 b30Var2 = this.e;
        b30Var2.b = b30Var2.a;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException != null) {
            this.n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        k41 k41Var;
        synchronized (this.a) {
            this.d.a(i);
            om1 om1Var = this.o;
            if (om1Var != null && (k41Var = ((gk2) om1Var.o).V) != null) {
                k41Var.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        k41 k41Var;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                om1 om1Var = this.o;
                if (om1Var != null && (k41Var = ((gk2) om1Var.o).V) != null) {
                    k41Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
