package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class og3 extends HandlerThread implements Handler.Callback {
    public qy0 n;
    public Handler o;
    public Error p;
    public RuntimeException q;
    public pg3 r;

    public final void a(int r19) {
        this.n.getClass();
        qy0 r2 = this.n;
        int[] r3 = r2.o;
        boolean r4 = false;
        EGLDisplay r5 = EGL14.eglGetDisplay(0);
        if (r5 == null) goto L5;
        boolean r6 = true;
    L6:
        j51.m("eglGetDisplay failed", r6);
        int[] r7 = new int[2];
        j51.m("eglInitialize failed", EGL14.eglInitialize(r5, r7, 0, r7, 1));
        r2.p = r5;
        EGLConfig[] r8 = new EGLConfig[1];
        int[] r11 = new int[1];
        boolean r9 = EGL14.eglChooseConfig(r5, qy0.t, 0, r8, 0, 1, r11, 0);
        if (r9 == true) goto L9;
    L13:
        boolean r10 = false;
    L14:
        Object[] r12 = {Boolean.valueOf(r9), Integer.valueOf(r11[0]), r8[0]};
        String r13 = f35.a;
        j51.m(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", r12), r10);
        EGLConfig r14 = r8[0];
        EGLDisplay r15 = r2.p;
        if (r19 != 0) goto L17;
        int[] r16 = {12440, 2, 12344};
    L18:
        EGLContext r17 = EGL14.eglCreateContext(r15, r14, EGL14.EGL_NO_CONTEXT, r16, 0);
        if (r17 == null) goto L21;
        boolean r18 = true;
    L22:
        j51.m("eglCreateContext failed", r18);
        r2.q = r17;
        EGLDisplay r110 = r2.p;
        if (r19 != 1) goto L26;
        EGLSurface r20 = EGL14.EGL_NO_SURFACE;
    L34:
        j51.m("eglMakeCurrent failed", EGL14.eglMakeCurrent(r110, r20, r20, r17));
        r2.r = r20;
        GLES20.glGenTextures(1, r3, 0);
        j51.l();
        SurfaceTexture r21 = new SurfaceTexture(r3[0]);
        r2.s = r21;
        r21.setOnFrameAvailableListener(r2);
        SurfaceTexture r22 = this.n.s;
        r22.getClass();
        if (r19 == 0) goto L37;
        r4 = true;
    L37:
        this.r = new pg3(this, r22, r4);
        return;
    L26:
        if (r19 != 2) goto L28;
        int[] r23 = {12375, 1, 12374, 1, 12992, 1, 12344};
    L29:
        r20 = EGL14.eglCreatePbufferSurface(r110, r14, r23, 0);
        if (r20 == null) goto L32;
        boolean r24 = true;
    L33:
        j51.m("eglCreatePbufferSurface failed", r24);
        goto L34
    L32:
        r24 = false;
        goto L33
    L28:
        r23 = new int[]{12375, 1, 12374, 1, 12344};
        goto L29
    L21:
        r18 = false;
        goto L22
    L17:
        r16 = new int[]{12440, 2, 12992, 1, 12344};
        goto L18
    L9:
        if (r11[0] <= 0) goto L13;
        if (r8[0] == null) goto L13;
        r10 = true;
        goto L14
    L5:
        r6 = false;
        goto L6
    }

    public final void b() {
        this.n.getClass();
        qy0 r5 = this.n;
        r5.n.removeCallbacks(r5);
        SurfaceTexture r1 = r5.s;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.release();     // Catch: Throwable -> L7
        GLES20.glDeleteTextures(1, r5.o, 0);     // Catch: Throwable -> L7
    L9:
        EGLDisplay r2 = r5.p;
        if (r2 != null) goto L12;
    L14:
        EGLSurface r3 = r5.r;
        if (r3 != null) goto L17;
    L19:
        EGLContext r4 = r5.q;
        if (r4 == null) goto L22;
        EGL14.eglDestroyContext(r5.p, r4);
    L22:
        EGL14.eglReleaseThread();
        EGLDisplay r6 = r5.p;
        if (r6 != null) goto L25;
    L27:
        r5.p = null;
        r5.q = null;
        r5.r = null;
        r5.s = null;
        return;
    L25:
        if (r6.equals(EGL14.EGL_NO_DISPLAY) == true) goto L27;
        EGL14.eglTerminate(r5.p);
        goto L27
    L17:
        if (r3.equals(EGL14.EGL_NO_SURFACE) == true) goto L19;
        EGL14.eglDestroySurface(r5.p, r5.r);
        goto L19
    L12:
        if (r2.equals(EGL14.EGL_NO_DISPLAY) == true) goto L14;
        EGLDisplay r7 = r5.p;
        EGLSurface r8 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(r7, r8, r8, EGL14.EGL_NO_CONTEXT);
    L7:
        th = move-exception;
        EGLDisplay r9 = r5.p;
        if (r9 != null) goto L32;
    L34:
        EGLSurface r10 = r5.r;
        if (r10 != null) goto L37;
    L39:
        EGLContext r11 = r5.q;
        if (r11 == null) goto L42;
        EGL14.eglDestroyContext(r5.p, r11);
    L42:
        EGL14.eglReleaseThread();
        EGLDisplay r12 = r5.p;
        if (r12 != null) goto L45;
    L47:
        r5.p = null;
        r5.q = null;
        r5.r = null;
        r5.s = null;
        throw th;
    L45:
        if (r12.equals(EGL14.EGL_NO_DISPLAY) == true) goto L47;
        EGL14.eglTerminate(r5.p);
        goto L47
    L37:
        if (r10.equals(EGL14.EGL_NO_SURFACE) == true) goto L39;
        EGL14.eglDestroySurface(r5.p, r5.r);
        goto L39
    L32:
        if (r9.equals(EGL14.EGL_NO_DISPLAY) == true) goto L34;
        EGLDisplay r13 = r5.p;
        EGLSurface r14 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(r13, r14, r14, EGL14.EGL_NO_CONTEXT);
        goto L34
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r4) {
        int r0 = r4.what;
        if (r0 != 1) goto L5;
        a(r4.arg1);     // Catch: Throwable -> L25 Error -> L27 GlUtil$GlException -> L29 RuntimeException -> L31
        monitor-enter(this);
        notify();     // Catch: Throwable -> L22
        monitor-exit(this);     // Catch: Throwable -> L22
        return true;
    L22:
        th = move-exception;
        throw th;
    L29:
        e = move-exception;
        l93.G("PlaceholderSurface", "Failed to initialize placeholder surface", e);     // Catch: Throwable -> L25
        this.q = new IllegalStateException(e);     // Catch: Throwable -> L25
        monitor-enter(this);
        notify();     // Catch: Throwable -> L46
    L53:
        return true;
    L46:
        th = move-exception;
        throw th;
    L27:
        e = move-exception;
        l93.G("PlaceholderSurface", "Failed to initialize placeholder surface", e);     // Catch: Throwable -> L25
        this.p = e;     // Catch: Throwable -> L25
        monitor-enter(this);
        notify();     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        throw th;
    L31:
        e = move-exception;
        l93.G("PlaceholderSurface", "Failed to initialize placeholder surface", e);     // Catch: Throwable -> L25
        this.q = e;     // Catch: Throwable -> L25
        monitor-enter(this);
        notify();     // Catch: Throwable -> L54
    L54:
        th = move-exception;
        throw th;
    L5:
        if (r0 != 2) goto L53;
        b();     // Catch: Throwable -> L10
        quit();
        return true;
    L10:
        th = move-exception;
        l93.G("PlaceholderSurface", "Failed to release placeholder surface", th);     // Catch: Throwable -> L14
        quit();
        return true;
    L14:
        th = move-exception;
        quit();
        throw th;
    L25:
        th = move-exception;
        monitor-enter(this);
        notify();     // Catch: Throwable -> L61
        throw th;
    L61:
        th = move-exception;
        throw th;
    }
}
