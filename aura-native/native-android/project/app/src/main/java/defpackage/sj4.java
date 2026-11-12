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

    public sj4(Context context) {
        super(context, null);
        this.n = new CopyOnWriteArrayList();
        this.r = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.o = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.p = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        z54 z54Var = new z54();
        this.s = z54Var;
        rj4 rj4Var = new rj4(this, z54Var);
        View.OnTouchListener mv4Var = new mv4(context, rj4Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.q = new kb3(windowManager.getDefaultDisplay(), mv4Var, rj4Var);
        this.v = true;
        setEGLContextClientVersion(2);
        setRenderer(rj4Var);
        setOnTouchListener(mv4Var);
    }

    public final void a() {
        boolean z = this.v && this.w;
        Sensor sensor = this.p;
        if (sensor == null || z == this.x) {
            return;
        }
        kb3 kb3Var = this.q;
        SensorManager sensorManager = this.o;
        if (z) {
            sensorManager.registerListener(kb3Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(kb3Var);
        }
        this.x = z;
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
        this.r.post(new jq3(10, this));
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

    public void setDefaultStereoMode(int i) {
        this.s.x = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.v = z;
        a();
    }
}
