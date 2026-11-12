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
    public int v;
    public SurfaceTexture w;
    public byte[] z;
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean(true);
    public final nr3 p = new nr3();
    public final ll q = new ll(4, (byte) 0);
    public final tu r = new tu();
    public final tu s = new tu();
    public final float[] t = new float[16];
    public final float[] u = new float[16];
    public volatile int x = 0;
    public int y = -1;

    @Override // defpackage.uy
    public final void a(long j, float[] fArr) {
        ((tu) this.q.r).a(j, fArr);
    }

    @Override // defpackage.uy
    public final void b() {
        this.r.b();
        ll llVar = this.q;
        ((tu) llVar.r).b();
        llVar.o = false;
        this.o.set(true);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            j51.l();
            this.p.a();
            j51.l();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            j51.l();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            j51.l();
            GLES20.glTexParameteri(36197, 10240, 9729);
            j51.l();
            GLES20.glTexParameteri(36197, 10241, 9729);
            j51.l();
            GLES20.glTexParameteri(36197, 10242, 33071);
            j51.l();
            GLES20.glTexParameteri(36197, 10243, 33071);
            j51.l();
            this.v = i;
        } catch (GlUtil$GlException e) {
            l93.G("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.v);
        this.w = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: y54
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.n.n.set(true);
            }
        });
        return this.w;
    }

    @Override // defpackage.c55
    public final void d(long j, long j2, tb1 tb1Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListK;
        this.r.a(j2, Long.valueOf(j));
        byte[] bArr = tb1Var.B;
        int i2 = tb1Var.C;
        byte[] bArr2 = this.z;
        int i3 = this.y;
        this.z = bArr;
        if (i2 == -1) {
            i2 = this.x;
        }
        this.y = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.z)) {
            return;
        }
        byte[] bArr3 = this.z;
        mr3 mr3Var = null;
        if (bArr3 != null) {
            int i4 = this.y;
            be3 be3Var = new be3(bArr3);
            try {
                be3Var.O(4);
                int iM = be3Var.m();
                be3Var.N(0);
                if (iM == 1886547818) {
                    be3Var.O(8);
                    int i5 = be3Var.b;
                    int i6 = be3Var.c;
                    while (true) {
                        if (i5 < i6) {
                            int iM2 = be3Var.m() + i5;
                            if (iM2 > i5 && iM2 <= i6) {
                                int iM3 = be3Var.m();
                                if (iM3 != 2037673328 && iM3 != 1836279920) {
                                    be3Var.N(iM2);
                                    i5 = iM2;
                                }
                                be3Var.M(iM2);
                                arrayListK = uc5.K(be3Var);
                            }
                        }
                        arrayListK = null;
                    }
                } else {
                    arrayListK = uc5.K(be3Var);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListK != null) {
                int size = arrayListK.size();
                if (size == 1) {
                    lr3 lr3Var = (lr3) arrayListK.get(0);
                    mr3Var = new mr3(lr3Var, lr3Var, i4);
                } else if (size == 2) {
                    mr3Var = new mr3((lr3) arrayListK.get(0), (lr3) arrayListK.get(1), i4);
                }
            }
        }
        if (mr3Var == null || !nr3.c(mr3Var)) {
            int i7 = this.y;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            lr3 lr3Var2 = new lr3(new tu(0, 1, fArr, fArr2));
            mr3Var = new mr3(lr3Var2, lr3Var2, i7);
        }
        this.s.a(j2, mr3Var);
    }
}
