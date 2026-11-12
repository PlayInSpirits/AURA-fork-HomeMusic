package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bl implements ck2 {
    public static final ArrayDeque t = new ArrayDeque();
    public static final Object u = new Object();
    public final MediaCodec n;
    public final HandlerThread o;
    public zk p;
    public final AtomicReference q;
    public final q90 r;
    public boolean s;

    public bl(MediaCodec mediaCodec, HandlerThread handlerThread) {
        q90 q90Var = new q90();
        this.n = mediaCodec;
        this.o = handlerThread;
        this.r = q90Var;
        this.q = new AtomicReference();
    }

    public static al a() {
        ArrayDeque arrayDeque = t;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new al();
                }
                return (al) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ck2
    public final void c(Bundle bundle) {
        j();
        zk zkVar = this.p;
        String str = f35.a;
        zkVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.ck2
    public final void e(int i, fg0 fg0Var, long j, int i2) {
        j();
        al alVarA = a();
        alVarA.a = i;
        alVarA.b = 0;
        alVarA.d = j;
        alVarA.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = alVarA.c;
        cryptoInfo.numSubSamples = fg0Var.f;
        int[] iArr = fg0Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = fg0Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = fg0Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = fg0Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = fg0Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(fg0Var.g, fg0Var.h));
        zk zkVar = this.p;
        String str = f35.a;
        zkVar.obtainMessage(2, alVarA).sendToTarget();
    }

    @Override // defpackage.ck2
    public final void f(int i, int i2, int i3, long j) {
        j();
        al alVarA = a();
        alVarA.a = i;
        alVarA.b = i2;
        alVarA.d = j;
        alVarA.e = i3;
        zk zkVar = this.p;
        String str = f35.a;
        zkVar.obtainMessage(1, alVarA).sendToTarget();
    }

    @Override // defpackage.ck2
    public final void flush() {
        if (this.s) {
            try {
                zk zkVar = this.p;
                zkVar.getClass();
                zkVar.removeCallbacksAndMessages(null);
                q90 q90Var = this.r;
                synchronized (q90Var) {
                    q90Var.b = false;
                }
                zk zkVar2 = this.p;
                zkVar2.getClass();
                zkVar2.obtainMessage(3).sendToTarget();
                q90Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.ck2
    public final void j() {
        RuntimeException runtimeException = (RuntimeException) this.q.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.ck2
    public final void shutdown() {
        if (this.s) {
            flush();
            this.o.quit();
        }
        this.s = false;
    }

    @Override // defpackage.ck2
    public final void start() {
        if (this.s) {
            return;
        }
        HandlerThread handlerThread = this.o;
        handlerThread.start();
        this.p = new zk(this, handlerThread.getLooper(), 0);
        this.s = true;
    }
}
