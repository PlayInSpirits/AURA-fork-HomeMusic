package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sj4 extends GLSurfaceView {
    public final CopyOnWriteArrayList n;
    public final SensorManager o;
    public final Sensor p;
    public final kb3 q;
    public final Handler r;
    public final z54 s;
    public SurfaceTexture t;
    public Surface u;
    public boolean v;
    public boolean w;
    public boolean x;

    public sj4(Context r7) {
        super(r7, null);
        this.n = new CopyOnWriteArrayList();
        this.r = new Handler(Looper.getMainLooper());
        Object r0 = r7.getSystemService("sensor");
        r0.getClass();
        SensorManager r1 = (SensorManager) r0;
        this.o = r1;
        Sensor r2 = r1.getDefaultSensor(15);
        if (r2 != null) goto L5;
        r2 = r1.getDefaultSensor(11);
    L5:
        this.p = r2;
        z54 r3 = new z54();
        this.s = r3;
        rj4 r4 = new rj4(this, r3);
        View.OnTouchListener r5 = new mv4(r7, r4);
        WindowManager r8 = (WindowManager) r7.getSystemService("window");
        r8.getClass();
        this.q = new kb3(r8.getDefaultDisplay(), new jb3[]{r5, r4});
        this.v = true;
        setEGLContextClientVersion(2);
        setRenderer(r4);
        setOnTouchListener(r5);
    }

    public final void a() {
        if (this.v == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        Sensor r2 = this.p;
        if (r2 != null) goto L11;
        return;
    L11:
        if (r0 == this.x) goto L20;
        kb3 r3 = this.q;
        SensorManager r4 = this.o;
        if (r0 == false) goto L16;
        r4.registerListener(r3, r2, 0);
    L17:
        this.x = r0;
        return;
    L16:
        r4.unregisterListener(r3);
        goto L17
    L20:
        return;
    L5:
        if (this.w == false) goto L7;
        r0 = true;
        goto L8
    }

    public uy getCameraMotionListener() {
        return this.s;
    }

    public c55 getVideoFrameMetadataListener() {
        return this.s;
    }

    public Surface getVideoSurface() {
        return this.u;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jq3 r0 = new jq3(10, this);
        this.r.post(r0);
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.w = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.w = true;
        a();
    }

    public void setDefaultStereoMode(int r1) {
        this.s.x = r1;
    }

    public void setUseSensorRotation(boolean r1) {
        this.v = r1;
        a();
    }
}
