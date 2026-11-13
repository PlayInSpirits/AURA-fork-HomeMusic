package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class iz3 extends fp {
    public iz3() {
        super();
    }

    public volatile float i;
    public volatile float j;
    public volatile float k;
    public volatile boolean l;
    public float m;
    public float n;
    public float o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    @Override // defpackage.fp
    public final gm a(gm gmVar) {
        int i = gmVar.c;
        if (i != 2 && i != 4) {
            return gm.e;
        }
        this.p = Math.max(1, (int) (gmVar.a * 0.01f));
        if (this.t) {
            this.u = true;
        }
        return gmVar;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        this.s = true;
        float f = this.i;
        if (!this.r && Math.abs(f - this.m) > 1.0E-4f) {
            Log.d("RGAudioProcessor", "queueInput: RAMP START active=" + this.m + " -> target=" + f);
            this.n = this.m;
            this.o = f;
            this.q = 0;
            this.r = true;
        }
        if (!this.r && Math.abs(this.m - 1.0f) < 1.0E-4f) {
            ByteBuffer l = l(remaining);
            l.put(byteBuffer);
            l.flip();
            return;
        }
        ByteBuffer l2 = l(remaining);
        l2.order(ByteOrder.nativeOrder());
        if (this.b.c == 2) {
            while (byteBuffer.remaining() >= 2) {
                float f2 = byteBuffer.getShort() * m();
                float f3 = 32767.0f;
                if (f2 <= 32767.0f) {
                    f3 = -32768.0f;
                    if (f2 >= -32768.0f) {
                        l2.putShort((short) f2);
                    }
                }
                f2 = f3;
                l2.putShort((short) f2);
            }
        } else {
            while (byteBuffer.remaining() >= 4) {
                l2.putFloat(byteBuffer.getFloat() * m());
            }
        }
        l2.flip();
    }

    @Override // defpackage.fp
    public final void i() {
        if (this.l && this.s && this.t && this.u) {
            this.m = this.j;
            this.i = this.j;
            this.l = false;
            this.r = false;
            Log.d("RGAudioProcessor", "onFlush: GAPLESS PROMOTION -> active/target=" + this.m);
        } else if (this.l && this.s && this.t) {
            this.m = this.j;
            this.i = this.j;
            this.k = this.j;
            this.l = false;
            this.r = false;
            Log.d("RGAudioProcessor", "onFlush: SAME-FORMAT GAPLESS PROMOTION -> active/target/baseline=" + this.m);
        } else {
            Log.d("RGAudioProcessor", "onFlush: SEEK/STARTUP branch, restoring to baseline=" + this.k + " (was active=" + this.m + ")");
            this.m = this.k;
            this.i = this.k;
            this.r = false;
            this.l = false;
        }
        this.t = false;
        this.s = false;
        this.u = false;
    }

    @Override // defpackage.fp
    public final void j() {
        this.t = true;
    }

    @Override // defpackage.fp
    public final void k() {
        this.m = this.k;
        this.i = this.k;
        this.j = 1.0f;
        this.l = false;
        this.t = false;
        this.u = false;
        this.r = false;
        this.s = false;
        Log.d("RGAudioProcessor", "onReset: gain reset to baseline=" + this.k);
    }

    public final float m() {
        if (!this.r) {
            return this.m;
        }
        int i = this.q;
        int i2 = this.p;
        float f = this.n;
        float f2 = this.o;
        float a = xa3.a(f2, f, i / i2, f);
        int i3 = i + 1;
        this.q = i3;
        if (i3 >= i2) {
            this.m = f2;
            this.r = false;
            Log.d("RGAudioProcessor", "advanceGain: RAMP COMPLETE -> active=" + this.m);
        }
        return a;
    }

    public final void n(float f) {
        float pow = (float) Math.pow(10.0d, Math.max(-60.0f, Math.min(15.0f, f)) / 20.0d);
        this.i = pow;
        this.k = pow;
        this.l = false;
        Log.d("RGAudioProcessor", "setGainImmediate: " + f + " dB -> linear=" + pow);
    }
}
