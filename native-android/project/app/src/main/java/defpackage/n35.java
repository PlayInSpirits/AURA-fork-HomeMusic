package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n35 extends i35 {
    public final gk1 b;
    public String c;
    public boolean d;
    public final pv0 e;
    public gf1 f;
    public final zd3 g;
    public dt h;
    public final zd3 i;
    public long j;
    public float k;
    public float l;
    public final m35 m;

    public n35(gk1 gk1Var) {
        this.b = gk1Var;
        gk1Var.i = new m35(this, 0);
        this.c = "";
        this.d = true;
        this.e = new pv0();
        this.f = new rd2(10);
        this.g = uc5.B(null);
        this.i = uc5.B(new qf4(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new m35(this, 1);
    }

    @Override // defpackage.i35
    public final void a(sv0 sv0Var) {
        e(sv0Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:0x015d  */
    public final void e(sv0 sv0Var, float f, dt dtVar) {
        int i;
        dt dtVar2;
        cc ccVar;
        char c;
        r62 r62Var;
        int i2;
        int i3;
        k24 k24Var;
        Bitmap.Config configO;
        Bitmap bitmapCreateBitmap;
        sv0 sv0Var2;
        long jB;
        dt dtVar3;
        int i4;
        int i5;
        gk1 gk1Var = this.b;
        boolean z = gk1Var.d;
        int i6 = 3;
        zd3 zd3Var = this.g;
        if (!z || gk1Var.e == 16) {
            i = 0;
        } else {
            dt dtVar4 = (dt) zd3Var.getValue();
            int i7 = c45.a;
            if (!(dtVar4 instanceof dt) ? dtVar4 == null : (i5 = dtVar4.c) == 5 || i5 == 3) {
                i = 0;
            } else if (!(dtVar instanceof dt) ? dtVar == null : (i4 = dtVar.c) == 5 || i4 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        pv0 pv0Var = this.e;
        if (z2 || !qf4.a(this.j, sv0Var.P())) {
            if (i == 1) {
                jB = gk1Var.e;
                int i8 = c45.a;
                if (x40.d(jB) != 1.0f) {
                    jB = x40.b(jB, 1.0f);
                }
                dtVar2 = new dt(5, jB);
            } else {
                dtVar2 = null;
            }
            this.h = dtVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (sv0Var.P() >> 32));
            zd3 zd3Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((qf4) zd3Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (sv0Var.P() & 4294967295L)) / Float.intBitsToFloat((int) (((qf4) zd3Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv0Var.P() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv0Var.P() & 4294967295L))))) & 4294967295L);
            r62 layoutDirection = sv0Var.getLayoutDirection();
            ccVar = pv0Var.a;
            aa aaVar = pv0Var.b;
            if (ccVar != null || aaVar == null) {
                c = ' ';
            } else {
                int i9 = (int) (jCeil >> 32);
                Bitmap bitmap = ccVar.a;
                c = ' ';
                if (i9 <= bitmap.getWidth()) {
                    r62Var = layoutDirection;
                    if (((int) (jCeil & 4294967295L)) > bitmap.getHeight() || pv0Var.d != i) {
                    }
                    pv0Var.c = jCeil;
                    mz mzVar = pv0Var.e;
                    long jO0 = l93.o0(jCeil);
                    lz lzVar = mzVar.n;
                    oo0 oo0Var = lzVar.a;
                    r62 r62Var2 = lzVar.b;
                    jz jzVar = lzVar.c;
                    long j = lzVar.d;
                    sv0Var2 = sv0Var;
                    lzVar.a = sv0Var2;
                    lzVar.b = r62Var;
                    lzVar.c = aaVar;
                    lzVar.d = jO0;
                    aaVar.e();
                    sv0.l(mzVar, x40.b, 0L, 62);
                    this.m.invoke(mzVar);
                    aaVar.k();
                    lz lzVar2 = mzVar.n;
                    lzVar2.a = oo0Var;
                    lzVar2.b = r62Var2;
                    lzVar2.c = jzVar;
                    lzVar2.d = j;
                    ccVar.a.prepareToDraw();
                    this.d = false;
                    this.j = sv0Var2.P();
                }
                i2 = (int) (jCeil >> c);
                i3 = (int) (jCeil & 4294967295L);
                k24Var = s50.e;
                configO = fu.O(i);
                if (Build.VERSION.SDK_INT >= 26) {
                    bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, fu.O(i), true, r50.a(k24Var));
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configO);
                    bitmapCreateBitmap.setHasAlpha(true);
                }
                ccVar = new cc(bitmapCreateBitmap);
                Canvas canvas = ba.a;
                aaVar = new aa();
                aaVar.a = new Canvas(bitmapCreateBitmap);
                pv0Var.a = ccVar;
                pv0Var.b = aaVar;
                pv0Var.d = i;
                pv0Var.c = jCeil;
                mz mzVar2 = pv0Var.e;
                long jO1 = l93.o0(jCeil);
                lz lzVar3 = mzVar2.n;
                oo0 oo0Var2 = lzVar3.a;
                r62 r62Var3 = lzVar3.b;
                jz jzVar2 = lzVar3.c;
                long j2 = lzVar3.d;
                sv0Var2 = sv0Var;
                lzVar3.a = sv0Var2;
                lzVar3.b = r62Var;
                lzVar3.c = aaVar;
                lzVar3.d = jO1;
                aaVar.e();
                sv0.l(mzVar2, x40.b, 0L, 62);
                this.m.invoke(mzVar2);
                aaVar.k();
                lz lzVar4 = mzVar2.n;
                lzVar4.a = oo0Var2;
                lzVar4.b = r62Var3;
                lzVar4.c = jzVar2;
                lzVar4.d = j2;
                ccVar.a.prepareToDraw();
                this.d = false;
                this.j = sv0Var2.P();
            }
            r62Var = layoutDirection;
            i2 = (int) (jCeil >> c);
            i3 = (int) (jCeil & 4294967295L);
            k24Var = s50.e;
            configO = fu.O(i);
            if (Build.VERSION.SDK_INT >= 26) {
                bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, fu.O(i), true, r50.a(k24Var));
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configO);
                bitmapCreateBitmap.setHasAlpha(true);
            }
            ccVar = new cc(bitmapCreateBitmap);
            Canvas canvas2 = ba.a;
            aaVar = new aa();
            aaVar.a = new Canvas(bitmapCreateBitmap);
            pv0Var.a = ccVar;
            pv0Var.b = aaVar;
            pv0Var.d = i;
            pv0Var.c = jCeil;
            mz mzVar3 = pv0Var.e;
            long jO2 = l93.o0(jCeil);
            lz lzVar5 = mzVar3.n;
            oo0 oo0Var3 = lzVar5.a;
            r62 r62Var4 = lzVar5.b;
            jz jzVar3 = lzVar5.c;
            long j3 = lzVar5.d;
            sv0Var2 = sv0Var;
            lzVar5.a = sv0Var2;
            lzVar5.b = r62Var;
            lzVar5.c = aaVar;
            lzVar5.d = jO2;
            aaVar.e();
            sv0.l(mzVar3, x40.b, 0L, 62);
            this.m.invoke(mzVar3);
            aaVar.k();
            lz lzVar6 = mzVar3.n;
            lzVar6.a = oo0Var3;
            lzVar6.b = r62Var4;
            lzVar6.c = jzVar3;
            lzVar6.d = j3;
            ccVar.a.prepareToDraw();
            this.d = false;
            this.j = sv0Var2.P();
        } else {
            cc ccVar2 = pv0Var.a;
            if (ccVar2 != null) {
                Bitmap.Config config = ccVar2.a.getConfig();
                config.getClass();
                if (config == Bitmap.Config.ALPHA_8) {
                    i6 = 1;
                } else if (config == Bitmap.Config.RGB_565) {
                    i6 = 2;
                } else if (config != Bitmap.Config.ARGB_4444) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 26 || config != Bitmap.Config.RGBA_F16) {
                        if (i10 < 26 || config != Bitmap.Config.HARDWARE) {
                            i6 = 0;
                        } else {
                            i6 = 4;
                        }
                    }
                } else {
                    i6 = 0;
                }
            } else {
                i6 = 0;
            }
            if (i == i6) {
                sv0Var2 = sv0Var;
            } else {
                if (i == 1) {
                    jB = gk1Var.e;
                    int i11 = c45.a;
                    if (x40.d(jB) != 1.0f) {
                        jB = x40.b(jB, 1.0f);
                    }
                    dtVar2 = new dt(5, jB);
                } else {
                    dtVar2 = null;
                }
                this.h = dtVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sv0Var.P() >> 32));
                zd3 zd3Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((qf4) zd3Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (sv0Var.P() & 4294967295L)) / Float.intBitsToFloat((int) (((qf4) zd3Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv0Var.P() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv0Var.P() & 4294967295L))))) & 4294967295L);
                r62 layoutDirection2 = sv0Var.getLayoutDirection();
                ccVar = pv0Var.a;
                aa aaVar2 = pv0Var.b;
                if (ccVar != null) {
                    c = ' ';
                    r62Var = layoutDirection2;
                    i2 = (int) (jCeil2 >> c);
                    i3 = (int) (jCeil2 & 4294967295L);
                    k24Var = s50.e;
                    configO = fu.O(i);
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, fu.O(i), true, r50.a(k24Var));
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configO);
                        bitmapCreateBitmap.setHasAlpha(true);
                    }
                    ccVar = new cc(bitmapCreateBitmap);
                    Canvas canvas3 = ba.a;
                    aaVar2 = new aa();
                    aaVar2.a = new Canvas(bitmapCreateBitmap);
                    pv0Var.a = ccVar;
                    pv0Var.b = aaVar2;
                    pv0Var.d = i;
                } else {
                    c = ' ';
                    r62Var = layoutDirection2;
                    i2 = (int) (jCeil2 >> c);
                    i3 = (int) (jCeil2 & 4294967295L);
                    k24Var = s50.e;
                    configO = fu.O(i);
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, fu.O(i), true, r50.a(k24Var));
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configO);
                        bitmapCreateBitmap.setHasAlpha(true);
                    }
                    ccVar = new cc(bitmapCreateBitmap);
                    Canvas canvas4 = ba.a;
                    aaVar2 = new aa();
                    aaVar2.a = new Canvas(bitmapCreateBitmap);
                    pv0Var.a = ccVar;
                    pv0Var.b = aaVar2;
                    pv0Var.d = i;
                }
                pv0Var.c = jCeil2;
                mz mzVar4 = pv0Var.e;
                long jO3 = l93.o0(jCeil2);
                lz lzVar7 = mzVar4.n;
                oo0 oo0Var4 = lzVar7.a;
                r62 r62Var5 = lzVar7.b;
                jz jzVar4 = lzVar7.c;
                long j4 = lzVar7.d;
                sv0Var2 = sv0Var;
                lzVar7.a = sv0Var2;
                lzVar7.b = r62Var;
                lzVar7.c = aaVar2;
                lzVar7.d = jO3;
                aaVar2.e();
                sv0.l(mzVar4, x40.b, 0L, 62);
                this.m.invoke(mzVar4);
                aaVar2.k();
                lz lzVar8 = mzVar4.n;
                lzVar8.a = oo0Var4;
                lzVar8.b = r62Var5;
                lzVar8.c = jzVar4;
                lzVar8.d = j4;
                ccVar.a.prepareToDraw();
                this.d = false;
                this.j = sv0Var2.P();
            }
        }
        if (dtVar != null) {
            dtVar3 = dtVar;
        } else {
            dtVar3 = ((dt) zd3Var.getValue()) != null ? (dt) zd3Var.getValue() : this.h;
        }
        cc ccVar3 = pv0Var.a;
        if (ccVar3 == null) {
            cz1.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        sv0.p(sv0Var2, ccVar3, pv0Var.c, 0L, f, dtVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        zd3 zd3Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((qf4) zd3Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((qf4) zd3Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
