package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kb3 implements SensorEventListener {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final Display e;
    public final jb3[] f;
    public boolean g;

    public kb3(Display r3, jb3... r4) {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[3];
        this.e = r3;
        this.f = r4;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor r1, int r2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent r11) {
        float[] r12 = r11.values;
        float[] r0 = this.a;
        SensorManager.getRotationMatrixFromVector(r0, r12);
        int r13 = this.e.getRotation();
        float[] r6 = this.b;
        int r7 = 0;
        if (r13 == 0) goto L15;
        int r1 = 129;
        if (r13 == 1) goto L13;
        int r2 = 130;
        if (r13 != 2) goto L9;
    L14:
        System.arraycopy(r0, 0, r6, 0, r6.length);
        SensorManager.remapCoordinateSystem(r6, r1, r2, r0);
        goto L15
    L9:
        if (r13 != 3) goto L11;
        r1 = 130;
        r2 = 1;
        goto L14
    L11:
        tb4.a();
        return;
    L13:
        r2 = 129;
        r1 = 2;
    L15:
        SensorManager.remapCoordinateSystem(r0, 1, 131, r6);
        float[] r14 = this.d;
        SensorManager.getOrientation(r6, r14);
        float r15 = r14[2];
        Matrix.rotateM(r0, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean r3 = this.g;
        float[] r4 = this.c;
        if (r3 == true) goto L18;
        ll.c(r4, r0);
        this.g = true;
    L18:
        System.arraycopy(r0, 0, r6, 0, r6.length);
        Matrix.multiplyMM(r0, 0, r6, 0, r4, 0);
    L19:
        if (r7 >= 2) goto L21;
        this.f[r7].a(r15, r0);
        r7 = r7 + 1;
        goto L19
    }
}
