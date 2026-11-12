package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rj4 implements GLSurfaceView.Renderer, jb3 {
    public final z54 n;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public float t;
    public float u;
    public final /* synthetic */ sj4 x;
    public final float[] o = new float[16];
    public final float[] p = new float[16];
    public final float[] v = new float[16];
    public final float[] w = new float[16];

    public rj4(sj4 sj4Var, z54 z54Var) {
        this.x = sj4Var;
        float[] fArr = new float[16];
        this.q = fArr;
        float[] fArr2 = new float[16];
        this.r = fArr2;
        float[] fArr3 = new float[16];
        this.s = fArr3;
        this.n = z54Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.u = 3.1415927f;
    }

    @Override // defpackage.jb3
    public final synchronized void a(float f, float[] fArr) {
        float[] fArr2 = this.q;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.u = f2;
        Matrix.setRotateM(this.r, 0, -this.t, (float) Math.cos(f2), (float) Math.sin(this.u), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objD;
        synchronized (this) {
            Matrix.multiplyMM(this.w, 0, this.q, 0, this.s, 0);
            Matrix.multiplyMM(this.v, 0, this.r, 0, this.w, 0);
        }
        Matrix.multiplyMM(this.p, 0, this.o, 0, this.v, 0);
        z54 z54Var = this.n;
        float[] fArr2 = this.p;
        GLES20.glClear(16384);
        try {
            j51.l();
        } catch (GlUtil$GlException e) {
            l93.G("SceneRenderer", "Failed to draw a frame", e);
        }
        if (z54Var.n.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = z54Var.w;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                j51.l();
            } catch (GlUtil$GlException e2) {
                l93.G("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (z54Var.o.compareAndSet(true, false)) {
                Matrix.setIdentityM(z54Var.t, 0);
            }
            long timestamp = z54Var.w.getTimestamp();
            tu tuVar = z54Var.r;
            synchronized (tuVar) {
                objD = tuVar.d(false, timestamp);
            }
            Long l = (Long) objD;
            if (l != null) {
                ll llVar = z54Var.q;
                float[] fArr3 = z54Var.t;
                float[] fArr4 = (float[]) ((tu) llVar.r).f(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) llVar.q;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!llVar.o) {
                        ll.c((float[]) llVar.p, (float[]) llVar.q);
                        llVar.o = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) llVar.p, 0, (float[]) llVar.q, 0);
                }
            }
            mr3 mr3Var = (mr3) z54Var.s.f(timestamp);
            if (mr3Var != null) {
                nr3 nr3Var = z54Var.p;
                nr3Var.getClass();
                if (nr3.c(mr3Var)) {
                    nr3Var.a = mr3Var.c;
                    tu tuVar2 = mr3Var.a.a[0];
                    tu tuVar3 = new tu();
                    float[] fArr6 = (float[]) tuVar2.c;
                    tuVar3.a = fArr6.length / 3;
                    tuVar3.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr6.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr6).flip();
                    float[] fArr7 = (float[]) tuVar2.d;
                    tuVar3.d = (FloatBuffer) ByteBuffer.allocateDirect(fArr7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr7).flip();
                    int i = tuVar2.b;
                    if (i == 1) {
                        tuVar3.b = 5;
                    } else if (i != 2) {
                        tuVar3.b = 4;
                    } else {
                        tuVar3.b = 6;
                    }
                    nr3Var.g = tuVar3;
                    if (!mr3Var.d) {
                        tu tuVar4 = mr3Var.b.a[0];
                        float[] fArr8 = (float[]) tuVar4.c;
                        int length2 = fArr8.length;
                        float[] fArr9 = (float[]) tuVar4.d;
                    }
                }
            }
        }
        Matrix.multiplyMM(z54Var.u, 0, fArr2, 0, z54Var.t, 0);
        nr3 nr3Var2 = z54Var.p;
        int i2 = z54Var.v;
        float[] fArr10 = z54Var.u;
        tu tuVar5 = (tu) nr3Var2.g;
        if (tuVar5 == null) {
            return;
        }
        int i3 = nr3Var2.a;
        if (i3 == 1) {
            fArr = nr3.j;
        } else {
            fArr = i3 == 2 ? nr3.k : nr3.i;
        }
        GLES20.glUniformMatrix3fv(nr3Var2.c, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(nr3Var2.b, 1, false, fArr10, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(nr3Var2.f, 0);
        try {
            j51.l();
        } catch (GlUtil$GlException e3) {
            l93.G("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(nr3Var2.d, 3, 5126, false, 12, (Buffer) tuVar5.c);
        try {
            j51.l();
        } catch (GlUtil$GlException e4) {
            l93.G("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(nr3Var2.e, 2, 5126, false, 8, (Buffer) tuVar5.d);
        try {
            j51.l();
        } catch (GlUtil$GlException e5) {
            l93.G("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(tuVar5.b, 0, tuVar5.a);
        try {
            j51.l();
        } catch (GlUtil$GlException e6) {
            l93.G("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.o, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        sj4 sj4Var = this.x;
        sj4Var.r.post(new ur2(22, sj4Var, this.n.c()));
    }
}
