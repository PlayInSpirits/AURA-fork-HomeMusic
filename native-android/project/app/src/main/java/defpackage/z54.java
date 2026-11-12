package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z54 implements c55, uy {
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final nr3 p;
    public final ll q;
    public final tu r;
    public final tu s;
    public final float[] t;
    public final float[] u;
    public int v;
    public SurfaceTexture w;
    public volatile int x;
    public int y;
    public byte[] z;

    public z54() {
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean(true);
        this.p = new nr3();
        this.q = new ll(4, (byte) 0);
        this.r = new tu();
        this.s = new tu();
        this.t = new float[16];
        this.u = new float[16];
        this.x = 0;
        this.y = -1;
    }

    @Override // defpackage.uy
    public final void a(long r1, float[] r3) {
        ((tu) this.q.r).a(r1, r3);
    }

    @Override // defpackage.uy
    public final void b() {
        this.r.b();
        ll r0 = this.q;
        ((tu) r0.r).b();
        r0.o = false;
        this.o.set(true);
    }

    public final SurfaceTexture c() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        this.p.a();     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        int[] r1 = new int[1];     // Catch: GlUtil$GlException -> L5
        GLES20.glGenTextures(1, r1, 0);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        int r0 = r1[0];     // Catch: GlUtil$GlException -> L5
        GLES20.glBindTexture(36197, r0);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        GLES20.glTexParameteri(36197, 10240, 9729);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        GLES20.glTexParameteri(36197, 10241, 9729);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        GLES20.glTexParameteri(36197, 10242, 33071);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        GLES20.glTexParameteri(36197, 10243, 33071);     // Catch: GlUtil$GlException -> L5
        j51.l();     // Catch: GlUtil$GlException -> L5
        this.v = r0;     // Catch: GlUtil$GlException -> L5
    L7:
        SurfaceTexture r2 = new SurfaceTexture(this.v);
        this.w = r2;
        r2.setOnFrameAvailableListener(new y54(this));
        return this.w;
    L5:
        e = move-exception;
        l93.G("SceneRenderer", "Failed to initialize the renderer", e);
        goto L7
    }

    @Override // defpackage.c55
    public final void d(long r34, long r36, tb1 r38, MediaFormat r39) {
        this.r.a(r36, Long.valueOf(r34));
        byte[] r4 = r38.B;
        int r3 = r38.C;
        byte[] r5 = this.z;
        int r6 = this.y;
        this.z = r4;
        if (r3 != (-1)) goto L5;
        r3 = this.x;
    L5:
        this.y = r3;
        if (r6 == r3) goto L8;
    L10:
        byte[] r7 = this.z;
        mr3 r8 = null;
        if (r7 == null) goto L39;
        int r9 = this.y;
        be3 r10 = new be3(r7);
        r10.O(4);     // Catch: ArrayIndexOutOfBoundsException -> L70
        int r11 = r10.m();     // Catch: ArrayIndexOutOfBoundsException -> L70
        r10.N(0);     // Catch: ArrayIndexOutOfBoundsException -> L70
        if (r11 != 1886547818) goto L28;
        r10.O(8);     // Catch: ArrayIndexOutOfBoundsException -> L70
        int r12 = r10.b;     // Catch: ArrayIndexOutOfBoundsException -> L70
        int r13 = r10.c;     // Catch: ArrayIndexOutOfBoundsException -> L70
    L16:
        if (r12 >= r13) goto L30;
        int r14 = r10.m() + r12;     // Catch: ArrayIndexOutOfBoundsException -> L70
        if (r14 <= r12) goto L30;
        if (r14 > r13) goto L30;
        int r15 = r10.m();     // Catch: ArrayIndexOutOfBoundsException -> L70
        if (r15 == 2037673328) goto L27;
        if (r15 == 1836279920) goto L27;
        r10.N(r14);     // Catch: ArrayIndexOutOfBoundsException -> L70
        r12 = r14;
    L27:
        r10.M(r14);     // Catch: ArrayIndexOutOfBoundsException -> L70
        ArrayList r16 = uc5.K(r10);     // Catch: ArrayIndexOutOfBoundsException -> L70
    L31:
        if (r16 == null) goto L39;
        int r17 = r16.size();
        if (r17 == 1) goto L38;
        if (r17 != 2) goto L39;
        r8 = new mr3((lr3) r16.get(0), (lr3) r16.get(1), r9);
        goto L39
    L38:
        lr3 r18 = (lr3) r16.get(0);
        r8 = new mr3(r18, r18, r9);
        goto L39
    L28:
        r16 = uc5.K(r10);     // Catch: ArrayIndexOutOfBoundsException -> L70
    L30:
        r16 = null;
    L39:
        if (r8 != null) goto L41;
    L43:
        int r19 = this.y;
        float r20 = (float) Math.toRadians(180.0d);
        float r21 = (float) Math.toRadians(360.0d);
        float r22 = r20 / 36.0f;
        float r110 = r21 / 72.0f;
        float[] r111 = new float[15984];
        float[] r112 = new float[10656];
        int r113 = 0;
        int r114 = 0;
        int r115 = 0;
    L45:
        if (r113 >= 36) goto L67;
        float r116 = r20 / 2.0f;
        float r23 = (r113 * r22) - r116;
        int r24 = r113 + 1;
        float r25 = (r24 * r22) - r116;
        int r26 = 0;
    L48:
        if (r26 >= 73) goto L66;
        int r117 = r24;
        int r27 = 0;
        int r28 = 2;
    L50:
        if (r27 >= r28) goto L65;
        if (r27 != 0) goto L54;
        float r29 = r23;
    L53:
        float r118 = r20;
        float r30 = r26 * r110;
        float r210 = r21;
        double r31 = (r30 + 3.1415927f) - (r21 / 2.0f);
        double r32 = r29;
        r111[r114] = -((float) (Math.cos(r32) * (Math.sin(r31) * 50.0d)));
        r111[r114 + 1] = (float) (Math.sin(r32) * 50.0d);
        int r33 = r114 + 3;
        float r211 = r22;
        r111[r114 + 2] = (float) (Math.cos(r32) * (Math.cos(r31) * 50.0d));
        r112[r115] = r30 / r210;
        int r35 = r115 + 2;
        r112[r115 + 1] = ((r113 + r27) * r211) / r118;
        if (r26 != 0) goto L59;
        if (r27 != 0) goto L59;
    L62:
        System.arraycopy(r111, r114, r111, r33, 3);
        r114 = r114 + 6;
        r28 = 2;
        System.arraycopy(r112, r115, r112, r35, 2);
        r115 = r115 + 4;
    L64:
        r27 = r27 + 1;
        r20 = r118;
        r22 = r211;
        r21 = r210;
    L59:
        if (r26 == 72) goto L61;
    L63:
        r28 = 2;
        r114 = r33;
        r115 = r35;
        goto L64
    L61:
        if (r27 != 1) goto L63;
    L54:
        r29 = r25;
        goto L53
    L65:
        r26 = r26 + 1;
        r24 = r117;
        goto L48
    L66:
        r113 = r24;
        goto L45
    L67:
        lr3 r37 = new lr3(new tu[]{new tu(0, 1, r111, r112)});
        r8 = new mr3(r37, r37, r19);
    L68:
        this.s.a(r36, r8);
        return;
    L41:
        if (nr3.c(r8) == false) goto L43;
    L8:
        if (Arrays.equals(r5, this.z) == false) goto L10;
    }
}
