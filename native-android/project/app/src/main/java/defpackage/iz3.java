package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iz3 extends fp {
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
    public final gm a(gm r3) {
        int r0 = r3.c;
        if (r0 != 2) goto L5;
    L8:
        this.p = Math.max(1, (int) (r3.a * 0.01f));
        if (this.t == false) goto L11;
        this.u = true;
    L11:
        return r3;
    L5:
        if (r0 == 4) goto L8;
        return gm.e;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r7) {
        int r0 = r7.remaining();
        if (r0 != 0) goto L5;
        return;
    L5:
        this.s = true;
        float r2 = this.i;
        if (this.r == true) goto L11;
        if (Math.abs(r2 - this.m) <= 1.0E-4f) goto L11;
        Log.d("RGAudioProcessor", "queueInput: RAMP START active=" + this.m + " -> target=" + r2);
        this.n = this.m;
        this.o = r2;
        this.q = 0;
        this.r = true;
    L11:
        if (this.r == false) goto L13;
    L16:
        ByteBuffer r1 = l(r0);
        r1.order(ByteOrder.nativeOrder());
        if (this.b.c != 2) goto L28;
    L19:
        if (r7.remaining() < 2) goto L30;
        float r3 = r7.getShort() * m();
        float r4 = 32767.0f;
        if (r3 <= 32767.0f) goto L23;
    L22:
        r3 = r4;
    L26:
        r1.putShort((short) r3);
        goto L19
    L23:
        r4 = -32768.0f;
        if (r3 >= (-32768.0f)) goto L26;
    L30:
        r1.flip();
        return;
    L28:
        if (r7.remaining() < 4) goto L30;
        r1.putFloat(r7.getFloat() * m());
        goto L28
    L13:
        if (Math.abs(this.m - 1.0f) >= 1.0E-4f) goto L16;
        ByteBuffer r6 = l(r0);
        r6.put(r7);
        r6.flip();
    }

    @Override // defpackage.fp
    public final void i() {
        if (this.l == false) goto L12;
        if (this.s == false) goto L12;
        if (this.t == false) goto L12;
        if (this.u == false) goto L12;
        this.m = this.j;
        this.i = this.j;
        this.l = false;
        this.r = false;
        Log.d("RGAudioProcessor", "onFlush: GAPLESS PROMOTION -> active/target=" + this.m);
    L19:
        this.t = false;
        this.s = false;
        this.u = false;
        return;
    L12:
        if (this.l == true) goto L14;
    L18:
        Log.d("RGAudioProcessor", "onFlush: SEEK/STARTUP branch, restoring to baseline=" + this.k + " (was active=" + this.m + ")");
        this.m = this.k;
        this.i = this.k;
        this.r = false;
        this.l = false;
        goto L19
    L14:
        if (this.s == false) goto L18;
        if (this.t == false) goto L18;
        this.m = this.j;
        this.i = this.j;
        this.k = this.j;
        this.l = false;
        this.r = false;
        Log.d("RGAudioProcessor", "onFlush: SAME-FORMAT GAPLESS PROMOTION -> active/target/baseline=" + this.m);
        goto L19
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
        if (this.r == false) goto L5;
        int r0 = this.q;
        int r2 = this.p;
        float r3 = this.n;
        float r4 = this.o;
        float r1 = xa3.a(r4, r3, r0 / r2, r3);
        int r5 = r0 + 1;
        this.q = r5;
        if (r5 < r2) goto L9;
        this.m = r4;
        this.r = false;
        Log.d("RGAudioProcessor", "advanceGain: RAMP COMPLETE -> active=" + this.m);
    L9:
        return r1;
    L5:
        return this.m;
    }

    public final void n(float r5) {
        float r0 = (float) Math.pow(10.0d, ((double) Math.max(-60.0f, Math.min(15.0f, r5))) / 20.0d);
        this.i = r0;
        this.k = r0;
        this.l = false;
        Log.d("RGAudioProcessor", "setGainImmediate: " + r5 + " dB -> linear=" + r0);
    }
}
