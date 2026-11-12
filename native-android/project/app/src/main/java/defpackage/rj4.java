package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rj4 implements GLSurfaceView.Renderer, jb3 {
    public final z54 n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public float t;
    public float u;
    public final float[] v;
    public final float[] w;
    public final /* synthetic */ sj4 x;

    public rj4(sj4 r5, z54 r6) {
        this.x = r5;
        this.o = new float[16];
        this.p = new float[16];
        float[] r0 = new float[16];
        this.q = r0;
        float[] r1 = new float[16];
        this.r = r1;
        float[] r2 = new float[16];
        this.s = r2;
        this.v = new float[16];
        this.w = new float[16];
        this.n = r6;
        Matrix.setIdentityM(r0, 0);
        Matrix.setIdentityM(r1, 0);
        Matrix.setIdentityM(r2, 0);
        this.u = 3.1415927f;
    }

    @Override // defpackage.jb3
    public final synchronized void a(float r7, float[] r8) {
        monitor-enter(this);
        float[] r0 = this.q;     // Catch: Throwable -> L6
        System.arraycopy(r8, 0, r0, 0, r0.length);     // Catch: Throwable -> L6
        float r9 = -r7;
        this.u = r9;     // Catch: Throwable -> L6
        Matrix.setRotateM(this.r, 0, -this.t, (float) Math.cos(r9), (float) Math.sin(this.u), 0.0f);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 r19) {
        monitor-enter(this);
        Matrix.multiplyMM(this.w, 0, this.q, 0, this.s, 0);     // Catch: Throwable -> L86
        Matrix.multiplyMM(this.v, 0, this.r, 0, this.w, 0);     // Catch: Throwable -> L86
        monitor-exit(this);     // Catch: Throwable -> L86
        Matrix.multiplyMM(this.p, 0, this.o, 0, this.v, 0);
        z54 r2 = this.n;
        float[] r5 = this.p;
        GLES20.glClear(16384);
        j51.l();     // Catch: GlUtil$GlException -> L9
    L12:
        if (r2.n.compareAndSet(true, false) == false) goto L56;
        SurfaceTexture r0 = r2.w;
        r0.getClass();
        r0.updateTexImage();
        j51.l();     // Catch: GlUtil$GlException -> L16
    L19:
        if (r2.o.compareAndSet(true, false) == false) goto L21;
        Matrix.setIdentityM(r2.t, 0);
    L21:
        long r3 = r2.w.getTimestamp();
        tu r6 = r2.r;
        monitor-enter(r6);
        Object r1 = r6.d(false, r3);     // Catch: Throwable -> L53
        monitor-exit(r6);
        Long r4 = (Long) r1;
        if (r4 == null) goto L38;
        ll r7 = r2.q;
        float[] r11 = r2.t;
        float[] r8 = (float[]) ((tu) r7.r).f(r4.longValue());
        if (r8 == null) goto L38;
        float[] r12 = (float[]) r7.q;
        float r9 = r8[0];
        float r10 = -r8[1];
        float r13 = -r8[2];
        float r14 = Matrix.length(r9, r10, r13);
        if (r14 == 0.0f) goto L33;
        Matrix.setRotateM(r12, 0, (float) Math.toDegrees(r14), r9 / r14, r10 / r14, r13 / r14);
    L35:
        if (r7.o == true) goto L37;
        ll.c((float[]) r7.p, (float[]) r7.q);
        r7.o = true;
    L37:
        Matrix.multiplyMM(r11, 0, (float[]) r7.p, 0, (float[]) r7.q, 0);
        goto L38
    L33:
        Matrix.setIdentityM(r12, 0);
    L38:
        mr3 r15 = (mr3) r2.s.f(r3);
        if (r15 == null) goto L56;
        nr3 r16 = r2.p;
        r16.getClass();
        if (nr3.c(r15) == false) goto L56;
        r16.a = r15.c;
        tu r17 = r15.a.a[0];
        tu r18 = new tu();
        float[] r20 = (float[]) r17.c;
        r18.a = r20.length / 3;
        r18.c = (FloatBuffer) ByteBuffer.allocateDirect(r20.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(r20).flip();
        float[] r21 = (float[]) r17.d;
        r18.d = (FloatBuffer) ByteBuffer.allocateDirect(r21.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(r21).flip();
        int r22 = r17.b;
        if (r22 == 1) goto L48;
        if (r22 == 2) goto L47;
        r18.b = 4;
    L49:
        r16.g = r18;
        if (r15.d == true) goto L56;
        tu r23 = r15.b.a[0];
        float[] r24 = (float[]) r23.c;
        int r25 = r24.length;
        FloatBuffer r26 = (FloatBuffer) ByteBuffer.allocateDirect(r24.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(r24).flip();
        float[] r27 = (float[]) r23.d;
        FloatBuffer r28 = (FloatBuffer) ByteBuffer.allocateDirect(r27.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(r27).flip();
        goto L56
    L47:
        r18.b = 6;
        goto L49
    L48:
        r18.b = 5;
    L53:
        th = move-exception;
        throw th;
    L16:
        e = move-exception;
        l93.G("SceneRenderer", "Failed to draw a frame", e);
    L56:
        Matrix.multiplyMM(r2.u, 0, r5, 0, r2.t, 0);
        nr3 r29 = r2.p;
        int r30 = r2.v;
        float[] r31 = r2.u;
        tu r32 = (tu) r29.g;
        if (r32 == null) goto L105;
        int r33 = r29.a;
        if (r33 != 1) goto L62;
        float[] r34 = nr3.j;
    L65:
        GLES20.glUniformMatrix3fv(r29.c, 1, false, r34, 0);
        GLES20.glUniformMatrix4fv(r29.b, 1, false, r31, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, r30);
        GLES20.glUniform1i(r29.f, 0);
        j51.l();     // Catch: GlUtil$GlException -> L68
    L70:
        GLES20.glVertexAttribPointer(r29.d, 3, 5126, false, 12, (FloatBuffer) r32.c);
        j51.l();     // Catch: GlUtil$GlException -> L73
    L75:
        GLES20.glVertexAttribPointer(r29.e, 2, 5126, false, 8, (FloatBuffer) r32.d);
        j51.l();     // Catch: GlUtil$GlException -> L78
    L80:
        GLES20.glDrawArrays(r32.b, 0, r32.a);
        j51.l();     // Catch: GlUtil$GlException -> L83
        return;
    L83:
        e = move-exception;
        l93.G("ProjectionRenderer", "Failed to render", e);
        return;
    L78:
        e = move-exception;
        l93.G("ProjectionRenderer", "Failed to load texture data", e);
    L73:
        e = move-exception;
        l93.G("ProjectionRenderer", "Failed to load position data", e);
    L68:
        e = move-exception;
        l93.G("ProjectionRenderer", "Failed to bind uniforms", e);
        goto L70
    L62:
        if (r33 != 2) goto L64;
        r34 = nr3.k;
        goto L65
    L64:
        r34 = nr3.i;
        goto L65
    L105:
        return;
    L9:
        e = move-exception;
        l93.G("SceneRenderer", "Failed to draw a frame", e);
    L86:
        th = move-exception;
        throw th;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 r7, int r8, int r9) {
        GLES20.glViewport(0, 0, r8, r9);
        float r3 = r8 / r9;
        if (r3 <= 1.0f) goto L6;
        float r10 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) r3))) * 2.0d);
    L7:
        Matrix.perspectiveM(this.o, 0, r10, r3, 0.1f, 100.0f);
        return;
    L6:
        r10 = 90.0f;
        goto L7
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 r4, EGLConfig r5) {
        monitor-enter(this);
        sj4 r6 = this.x;     // Catch: Throwable -> L6
        SurfaceTexture r7 = this.n.c();     // Catch: Throwable -> L6
        r6.r.post(new ur2(22, r6, r7));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
