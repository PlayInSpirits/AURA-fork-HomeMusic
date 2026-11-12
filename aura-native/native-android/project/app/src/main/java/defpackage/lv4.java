package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv4 implements zn4 {
    public static final byte[] u = {0, 7, 8, 15};
    public static final byte[] v = {0, 119, -120, -1};
    public static final byte[] w = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;

    public lv4(List list) {
        be3 be3Var = new be3((byte[]) list.get(0));
        int iH = be3Var.H();
        int iH2 = be3Var.H();
        Paint paint = new Paint();
        this.n = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.p = new Canvas();
        this.q = new qx0(719, 575, 0, 719, 0, 575);
        this.r = new px0(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.s = new vx0(iH, iH2);
    }

    public static byte[] a(int i, int i2, h00 h00Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) h00Var.i(i2);
        }
        return bArr;
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = f(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = f(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = f(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = f(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = f(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = f(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void g(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        h00 h00Var = new h00(bArr.length, bArr);
        int i12 = i2;
        int i13 = i3;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (h00Var.b() != 0) {
            int i14 = 8;
            int i15 = h00Var.i(8);
            if (i15 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (i15) {
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        if (i == 3) {
                            bArr2 = bArrA == null ? v : bArrA;
                        } else if (i == 2) {
                            bArr2 = bArrA3 == null ? u : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int i19 = h00Var.i(2);
                            if (i19 != 0) {
                                i4 = i19;
                                i5 = 1;
                            } else {
                                if (h00Var.h()) {
                                    int i20 = h00Var.i(3) + 3;
                                    i4 = h00Var.i(2);
                                    i5 = i20;
                                } else {
                                    if (h00Var.h()) {
                                        i5 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int i21 = h00Var.i(2);
                                        if (i21 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (i21 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            i5 = 2;
                                        } else if (i21 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            i5 = h00Var.i(4) + 12;
                                            i4 = h00Var.i(2);
                                            z3 = z3;
                                        } else if (i21 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int i22 = h00Var.i(8) + 29;
                                            i4 = h00Var.i(2);
                                            z3 = z3;
                                            i5 = i22;
                                            c2 = 4;
                                        }
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    i4 = 0;
                                }
                                if (i5 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        i4 = bArr2[i4];
                                    }
                                    paint.setColor(iArr[i4]);
                                    canvas.drawRect(i12, i13, i12 + i5, i13 + 1, paint);
                                }
                                i12 += i5;
                                if (z3) {
                                    h00Var.c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (i5 == 0) {
                            }
                            i12 += i5;
                            if (z3) {
                                h00Var.c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i == 3 ? bArrA2 == null ? w : bArrA2 : null;
                        boolean z4 = false;
                        while (true) {
                            int i23 = h00Var.i(i18);
                            if (i23 != 0) {
                                z = z4;
                                i8 = i23;
                                i6 = 1;
                            } else if (h00Var.h()) {
                                if (h00Var.h()) {
                                    int i24 = h00Var.i(i17);
                                    if (i24 == 0) {
                                        z = z4;
                                        i6 = 1;
                                    } else if (i24 != 1) {
                                        if (i24 == i17) {
                                            i6 = h00Var.i(i18) + 9;
                                            i7 = h00Var.i(i18);
                                        } else if (i24 != i16) {
                                            z = z4;
                                            i6 = 0;
                                        } else {
                                            i6 = h00Var.i(i14) + 25;
                                            i7 = h00Var.i(i18);
                                        }
                                        i8 = i7;
                                    } else {
                                        z = z4;
                                        i6 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i6 = h00Var.i(i17) + 4;
                                    i8 = h00Var.i(i18);
                                }
                                z = z4;
                            } else {
                                int i25 = h00Var.i(i16);
                                if (i25 != 0) {
                                    i6 = i25 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    i6 = 0;
                                }
                                i8 = 0;
                            }
                            if (i6 == 0 || paint == 0) {
                                i9 = i16;
                                i10 = i17;
                            } else {
                                if (bArr3 != 0) {
                                    i8 = bArr3[i8];
                                }
                                paint.setColor(iArr[i8]);
                                i9 = i16;
                                i10 = 2;
                                canvas.drawRect(i12, i13, i12 + i6, i13 + 1, paint);
                            }
                            i12 += i6;
                            if (z) {
                                h00Var.c();
                            } else {
                                z4 = z;
                                i16 = i9;
                                i17 = i10;
                                i18 = 4;
                                i14 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int i26 = h00Var.i(8);
                            if (i26 != 0) {
                                z2 = z5;
                                i11 = 1;
                            } else if (h00Var.h()) {
                                z2 = z5;
                                i11 = h00Var.i(7);
                                i26 = h00Var.i(8);
                            } else {
                                int i27 = h00Var.i(7);
                                if (i27 != 0) {
                                    z2 = z5;
                                    i11 = i27;
                                    i26 = 0;
                                } else {
                                    z2 = true;
                                    i26 = 0;
                                    i11 = 0;
                                }
                            }
                            if (i11 != 0 && paint != 0) {
                                paint.setColor(iArr[i26]);
                                canvas.drawRect(i12, i13, i12 + i11, i13 + 1, paint);
                            }
                            i12 += i11;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i15) {
                            case 32:
                                bArrA3 = a(4, 4, h00Var);
                                break;
                            case 33:
                                bArrA = a(4, 8, h00Var);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, h00Var);
                                break;
                        }
                        break;
                }
            } else {
                i13 += 2;
                i12 = i2;
            }
        }
    }

    public static px0 h(h00 h00Var, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int i8 = h00Var.i(8);
        h00Var.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrD = d();
        int[] iArrE = e();
        while (i10 > 0) {
            int i12 = h00Var.i(i7);
            int i13 = h00Var.i(i7);
            if ((i13 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i13 & 64) != 0 ? iArrD : iArrE;
            }
            if ((i13 & 1) != 0) {
                i5 = h00Var.i(i7);
                i6 = h00Var.i(i7);
                i2 = h00Var.i(i7);
                i4 = h00Var.i(i7);
                i3 = i10 - 6;
            } else {
                int i14 = h00Var.i(6) << i9;
                int i15 = h00Var.i(4) << 4;
                i2 = h00Var.i(4) << 4;
                i3 = i10 - 4;
                i4 = h00Var.i(i9) << 6;
                i5 = i14;
                i6 = i15;
            }
            if (i5 == 0) {
                i6 = i11;
                i2 = i6;
                i4 = 255;
            }
            double d = i5;
            double d2 = i6 - 128;
            double d3 = i2 - 128;
            iArr[i12] = f((byte) (255 - (i4 & 255)), f35.j((int) ((1.402d * d2) + d), 0, 255), f35.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), f35.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i3;
            i11 = 0;
            i8 = i8;
            iArrE = iArrE;
            i7 = 8;
            i9 = 2;
        }
        return new px0(i8, iArr2, iArrD, iArrE);
    }

    public static rx0 i(h00 h00Var) {
        byte[] bArr;
        int i = h00Var.i(16);
        h00Var.t(4);
        int i2 = h00Var.i(2);
        boolean zH = h00Var.h();
        h00Var.t(1);
        byte[] bArr2 = f35.b;
        if (i2 != 1) {
            if (i2 == 0) {
                int i3 = h00Var.i(16);
                int i4 = h00Var.i(16);
                if (i3 > 0) {
                    bArr2 = new byte[i3];
                    h00Var.l(i3, bArr2);
                }
                if (i4 > 0) {
                    bArr = new byte[i4];
                    h00Var.l(i4, bArr);
                }
            }
            return new rx0(i, zH, bArr2, bArr);
        }
        h00Var.t(h00Var.i(8) * 16);
        bArr = bArr2;
        return new rx0(i, zH, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:103:0x0301  */
    /* JADX WARN: Code duplicated, block: B:106:0x0316  */
    /* JADX WARN: Code duplicated, block: B:108:0x031c  */
    /* JADX WARN: Code duplicated, block: B:110:0x031f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0322  */
    /* JADX WARN: Code duplicated, block: B:113:0x0346  */
    /* JADX WARN: Code duplicated, block: B:117:0x0372  */
    /* JADX WARN: Code duplicated, block: B:119:0x0377  */
    /* JADX WARN: Code duplicated, block: B:120:0x037f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0382  */
    /* JADX WARN: Code duplicated, block: B:123:0x0389  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f9  */
    @Override // defpackage.zn4
    public void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        int i3;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i4;
        lg0 lg0Var;
        tx0 tx0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        px0 px0Var;
        SparseArray sparseArray2;
        int i11;
        tx0 tx0Var2;
        int i12;
        int i13;
        char c;
        char c2;
        int i14;
        int i15;
        char c3;
        int i16;
        int iKeyAt;
        ux0 ux0Var;
        rx0 rx0Var;
        rx0 rx0Var2;
        tx0 tx0Var3;
        int i17;
        int i18;
        int i19;
        Paint paint;
        int i20;
        int[] iArr;
        tx0 tx0Var4;
        int i21;
        int i22;
        int i23;
        int i24;
        h00 h00Var = new h00(i + i2, bArr);
        h00Var.q(i);
        Paint paint2 = (Paint) this.o;
        Canvas canvas = (Canvas) this.p;
        vx0 vx0Var = (vx0) this.s;
        while (h00Var.b() >= 48 && h00Var.i(8) == 15) {
            int i25 = h00Var.i(8);
            int i26 = 16;
            int i27 = h00Var.i(16);
            int i28 = h00Var.i(16);
            int iF = h00Var.f() + i28;
            if (i28 * 8 > h00Var.b()) {
                l93.q0("DvbParser", "Data field length exceeds limit");
                h00Var.t(h00Var.b());
            } else {
                int i29 = 4;
                switch (i25) {
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        if (i27 == vx0Var.a) {
                            j83 j83Var = vx0Var.i;
                            int i30 = 8;
                            h00Var.i(8);
                            int i31 = h00Var.i(4);
                            int i32 = h00Var.i(2);
                            h00Var.t(2);
                            int i33 = i28 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i33 > 0) {
                                int i34 = h00Var.i(i30);
                                h00Var.t(i30);
                                i33 -= 6;
                                sparseArray3.put(i34, new sx0(h00Var.i(16), h00Var.i(16)));
                                i30 = 8;
                            }
                            j83 j83Var2 = new j83();
                            j83Var2.n = i31;
                            j83Var2.o = i32;
                            j83Var2.p = sparseArray3;
                            if (i32 != 0) {
                                vx0Var.i = j83Var2;
                                vx0Var.c.clear();
                                vx0Var.d.clear();
                                vx0Var.e.clear();
                            } else if (j83Var != null && j83Var.n != i31) {
                                vx0Var.i = j83Var2;
                            }
                        }
                        break;
                    case 17:
                        j83 j83Var3 = vx0Var.i;
                        SparseArray sparseArray4 = vx0Var.c;
                        if (i27 == vx0Var.a && j83Var3 != null) {
                            int i35 = h00Var.i(8);
                            h00Var.t(4);
                            boolean zH = h00Var.h();
                            h00Var.t(3);
                            int i36 = h00Var.i(16);
                            int i37 = h00Var.i(16);
                            h00Var.i(3);
                            int i38 = h00Var.i(3);
                            h00Var.t(2);
                            int i39 = h00Var.i(8);
                            int i40 = h00Var.i(8);
                            int i41 = h00Var.i(4);
                            int i42 = h00Var.i(2);
                            h00Var.t(2);
                            int i43 = i28 - 10;
                            SparseArray sparseArray5 = new SparseArray();
                            while (i43 > 0) {
                                int i44 = h00Var.i(i26);
                                int i45 = h00Var.i(2);
                                h00Var.i(2);
                                int i46 = h00Var.i(12);
                                h00Var.t(i29);
                                int i47 = h00Var.i(12);
                                int i48 = i43 - 6;
                                if (i45 == 1 || i45 == 2) {
                                    h00Var.i(8);
                                    h00Var.i(8);
                                    i43 -= 8;
                                } else {
                                    i43 = i48;
                                }
                                sparseArray5.put(i44, new ux0(i46, i47));
                                i29 = 4;
                                i26 = 16;
                            }
                            tx0 tx0Var5 = new tx0(i35, zH, i36, i37, i38, i39, i40, i41, i42, sparseArray5);
                            if (j83Var3.o == 0 && (tx0Var4 = (tx0) sparseArray4.get(i35)) != null) {
                                SparseArray sparseArray6 = tx0Var4.j;
                                for (int i49 = 0; i49 < sparseArray6.size(); i49++) {
                                    tx0Var5.j.put(sparseArray6.keyAt(i49), (ux0) sparseArray6.valueAt(i49));
                                }
                            }
                            sparseArray4.put(tx0Var5.a, tx0Var5);
                        }
                        break;
                    case 18:
                        if (i27 == vx0Var.a) {
                            px0 px0VarH = h(h00Var, i28);
                            vx0Var.d.put(px0VarH.a, px0VarH);
                        } else if (i27 == vx0Var.b) {
                            px0 px0VarH2 = h(h00Var, i28);
                            vx0Var.f.put(px0VarH2.a, px0VarH2);
                        }
                        break;
                    case 19:
                        if (i27 == vx0Var.a) {
                            rx0 rx0VarI = i(h00Var);
                            vx0Var.e.put(rx0VarI.a, rx0VarI);
                        } else if (i27 == vx0Var.b) {
                            rx0 rx0VarI2 = i(h00Var);
                            vx0Var.g.put(rx0VarI2.a, rx0VarI2);
                        }
                        break;
                    case 20:
                        if (i27 == vx0Var.a) {
                            h00Var.t(4);
                            boolean zH2 = h00Var.h();
                            h00Var.t(3);
                            int i50 = h00Var.i(16);
                            int i51 = h00Var.i(16);
                            if (zH2) {
                                int i52 = h00Var.i(16);
                                i21 = h00Var.i(16);
                                i24 = h00Var.i(16);
                                i22 = h00Var.i(16);
                                i23 = i52;
                            } else {
                                i21 = i50;
                                i22 = i51;
                                i23 = 0;
                                i24 = 0;
                            }
                            vx0Var.h = new qx0(i50, i51, i23, i21, i24, i22);
                        }
                        break;
                }
                h00Var.u(iF - h00Var.f());
            }
        }
        j83 j83Var4 = vx0Var.i;
        if (j83Var4 == null) {
            vw1 vw1Var = yw1.o;
            lg0Var = new lg0(-9223372036854775807L, -9223372036854775807L, gy3.r);
        } else {
            qx0 qx0Var = vx0Var.h;
            if (qx0Var == null) {
                qx0Var = (qx0) this.q;
            }
            Bitmap bitmap = (Bitmap) this.t;
            if (bitmap != null) {
                i3 = 1;
                if (qx0Var.a + 1 != bitmap.getWidth() || qx0Var.b + 1 != ((Bitmap) this.t).getHeight()) {
                }
                arrayList = new ArrayList();
                sparseArray = (SparseArray) j83Var4.p;
                i4 = 0;
                while (i4 < sparseArray.size()) {
                    canvas.save();
                    sx0 sx0Var = (sx0) sparseArray.valueAt(i4);
                    tx0Var = (tx0) vx0Var.c.get(sparseArray.keyAt(i4));
                    i5 = sx0Var.a + qx0Var.c;
                    i6 = sx0Var.b + qx0Var.e;
                    i7 = tx0Var.c;
                    int i53 = tx0Var.f;
                    i8 = tx0Var.d;
                    i9 = i5 + i7;
                    i10 = i6 + i8;
                    SparseArray sparseArray7 = sparseArray;
                    canvas.clipRect(i5, i6, Math.min(i9, qx0Var.d), Math.min(i10, qx0Var.f));
                    px0Var = (px0) vx0Var.d.get(i53);
                    if (px0Var == null && (px0Var = (px0) vx0Var.f.get(i53)) == null) {
                        px0Var = (px0) this.r;
                    }
                    sparseArray2 = tx0Var.j;
                    qx0 qx0Var2 = qx0Var;
                    i11 = 0;
                    while (i11 < sparseArray2.size()) {
                        iKeyAt = sparseArray2.keyAt(i11);
                        int i54 = i4;
                        ux0Var = (ux0) sparseArray2.valueAt(i11);
                        SparseArray sparseArray8 = sparseArray2;
                        rx0Var = (rx0) vx0Var.e.get(iKeyAt);
                        if (rx0Var == null) {
                            rx0Var = (rx0) vx0Var.g.get(iKeyAt);
                        }
                        rx0Var2 = rx0Var;
                        if (rx0Var2 != null) {
                            if (rx0Var2.b) {
                                paint = null;
                            } else {
                                paint = (Paint) this.n;
                            }
                            int i55 = i5;
                            i20 = tx0Var.e;
                            int i56 = i55 + ux0Var.a;
                            int i57 = ux0Var.b + i6;
                            if (i20 == 3) {
                                iArr = px0Var.d;
                            } else if (i20 == 2) {
                                iArr = px0Var.c;
                            } else {
                                iArr = px0Var.b;
                            }
                            int i58 = i8;
                            Paint paint3 = paint;
                            tx0 tx0Var6 = tx0Var;
                            int[] iArr2 = iArr;
                            tx0Var3 = tx0Var6;
                            i17 = i55;
                            i18 = i11;
                            i19 = i58;
                            g(rx0Var2.c, iArr2, i20, i56, i57, paint3, canvas);
                            g(rx0Var2.d, iArr2, i20, i56, i57 + 1, paint3, canvas);
                        } else {
                            tx0Var3 = tx0Var;
                            i17 = i5;
                            i18 = i11;
                            i19 = i8;
                        }
                        i11 = i18 + 1;
                        tx0Var = tx0Var3;
                        i5 = i17;
                        sparseArray2 = sparseArray8;
                        i4 = i54;
                        vx0Var = vx0Var;
                        i7 = i7;
                        i8 = i19;
                    }
                    vx0 vx0Var2 = vx0Var;
                    int i59 = i4;
                    tx0Var2 = tx0Var;
                    i12 = i5;
                    int i60 = i7;
                    int i61 = i8;
                    if (tx0Var2.b) {
                        i15 = tx0Var2.e;
                        if (i15 == 3) {
                            i16 = px0Var.d[tx0Var2.g];
                            c3 = 2;
                        } else {
                            c3 = 2;
                            if (i15 == 2) {
                                i16 = px0Var.c[tx0Var2.h];
                            } else {
                                i16 = px0Var.b[tx0Var2.i];
                            }
                        }
                        paint2.setColor(i16);
                        i13 = i12;
                        c2 = c3;
                        i14 = 0;
                        c = 3;
                        canvas.drawRect(i13, i6, i9, i10, paint2);
                    } else {
                        i13 = i12;
                        c = 3;
                        c2 = 2;
                        i14 = 0;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((Bitmap) this.t, i13, i6, i60, i61);
                    float f = qx0Var2.a;
                    float f2 = i6;
                    float f3 = qx0Var2.b;
                    arrayList.add(new ig0(null, null, null, bitmapCreateBitmap, f2 / f3, 0, 0, i13 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i60 / f, i61 / f3, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                    canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    i4 = i59 + 1;
                    qx0Var = qx0Var2;
                    arrayList = arrayList;
                    sparseArray = sparseArray7;
                    vx0Var = vx0Var2;
                }
                lg0Var = new lg0(-9223372036854775807L, -9223372036854775807L, arrayList);
            } else {
                i3 = 1;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(qx0Var.a + i3, qx0Var.b + i3, Bitmap.Config.ARGB_8888);
            this.t = bitmapCreateBitmap2;
            canvas.setBitmap(bitmapCreateBitmap2);
            arrayList = new ArrayList();
            sparseArray = (SparseArray) j83Var4.p;
            i4 = 0;
            while (i4 < sparseArray.size()) {
                canvas.save();
                sx0 sx0Var2 = (sx0) sparseArray.valueAt(i4);
                tx0Var = (tx0) vx0Var.c.get(sparseArray.keyAt(i4));
                i5 = sx0Var2.a + qx0Var.c;
                i6 = sx0Var2.b + qx0Var.e;
                i7 = tx0Var.c;
                int i510 = tx0Var.f;
                i8 = tx0Var.d;
                i9 = i5 + i7;
                i10 = i6 + i8;
                SparseArray sparseArray9 = sparseArray;
                canvas.clipRect(i5, i6, Math.min(i9, qx0Var.d), Math.min(i10, qx0Var.f));
                px0Var = (px0) vx0Var.d.get(i510);
                if (px0Var == null) {
                    px0Var = (px0) this.r;
                }
                sparseArray2 = tx0Var.j;
                qx0 qx0Var3 = qx0Var;
                i11 = 0;
                while (i11 < sparseArray2.size()) {
                    iKeyAt = sparseArray2.keyAt(i11);
                    int i511 = i4;
                    ux0Var = (ux0) sparseArray2.valueAt(i11);
                    SparseArray sparseArray10 = sparseArray2;
                    rx0Var = (rx0) vx0Var.e.get(iKeyAt);
                    if (rx0Var == null) {
                        rx0Var = (rx0) vx0Var.g.get(iKeyAt);
                    }
                    rx0Var2 = rx0Var;
                    if (rx0Var2 != null) {
                        if (rx0Var2.b) {
                            paint = null;
                        } else {
                            paint = (Paint) this.n;
                        }
                        int i512 = i5;
                        i20 = tx0Var.e;
                        int i513 = i512 + ux0Var.a;
                        int i514 = ux0Var.b + i6;
                        if (i20 == 3) {
                            iArr = px0Var.d;
                        } else if (i20 == 2) {
                            iArr = px0Var.c;
                        } else {
                            iArr = px0Var.b;
                        }
                        int i515 = i8;
                        Paint paint4 = paint;
                        tx0 tx0Var7 = tx0Var;
                        int[] iArr3 = iArr;
                        tx0Var3 = tx0Var7;
                        i17 = i512;
                        i18 = i11;
                        i19 = i515;
                        g(rx0Var2.c, iArr3, i20, i513, i514, paint4, canvas);
                        g(rx0Var2.d, iArr3, i20, i513, i514 + 1, paint4, canvas);
                    } else {
                        tx0Var3 = tx0Var;
                        i17 = i5;
                        i18 = i11;
                        i19 = i8;
                    }
                    i11 = i18 + 1;
                    tx0Var = tx0Var3;
                    i5 = i17;
                    sparseArray2 = sparseArray10;
                    i4 = i511;
                    vx0Var = vx0Var;
                    i7 = i7;
                    i8 = i19;
                }
                vx0 vx0Var3 = vx0Var;
                int i516 = i4;
                tx0Var2 = tx0Var;
                i12 = i5;
                int i62 = i7;
                int i63 = i8;
                if (tx0Var2.b) {
                    i15 = tx0Var2.e;
                    if (i15 == 3) {
                        i16 = px0Var.d[tx0Var2.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        if (i15 == 2) {
                            i16 = px0Var.c[tx0Var2.h];
                        } else {
                            i16 = px0Var.b[tx0Var2.i];
                        }
                    }
                    paint2.setColor(i16);
                    i13 = i12;
                    c2 = c3;
                    i14 = 0;
                    c = 3;
                    canvas.drawRect(i13, i6, i9, i10, paint2);
                } else {
                    i13 = i12;
                    c = 3;
                    c2 = 2;
                    i14 = 0;
                }
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap((Bitmap) this.t, i13, i6, i62, i63);
                float f4 = qx0Var3.a;
                float f5 = i6;
                float f6 = qx0Var3.b;
                arrayList.add(new ig0(null, null, null, bitmapCreateBitmap3, f5 / f6, 0, 0, i13 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i62 / f4, i63 / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i4 = i516 + 1;
                qx0Var = qx0Var3;
                arrayList = arrayList;
                sparseArray = sparseArray9;
                vx0Var = vx0Var3;
            }
            lg0Var = new lg0(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        wc0Var.accept(lg0Var);
    }

    @Override // defpackage.zn4
    public void reset() {
        vx0 vx0Var = (vx0) this.s;
        vx0Var.c.clear();
        vx0Var.d.clear();
        vx0Var.e.clear();
        vx0Var.f.clear();
        vx0Var.g.clear();
        vx0Var.h = null;
        vx0Var.i = null;
    }

    public /* synthetic */ lv4(ConstraintLayout constraintLayout, View view, View view2, TextView textView, View view3, TextView textView2, View view4) {
        this.n = constraintLayout;
        this.o = view;
        this.q = view2;
        this.p = textView;
        this.r = view3;
        this.s = textView2;
        this.t = view4;
    }

    public lv4(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, ImageView imageView3, TextView textView3) {
        this.n = constraintLayout;
        this.p = textView;
        this.o = imageView;
        this.q = textView2;
        this.r = imageView2;
        this.s = imageView3;
        this.t = textView3;
    }

    public lv4(LinearLayout linearLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout, ProgressBar progressBar, Button button, TextView textView, AppBarLayout appBarLayout, MaterialToolbar materialToolbar) {
        this.n = recyclerView;
        this.o = constraintLayout;
        this.q = progressBar;
        this.r = button;
        this.p = textView;
        this.s = appBarLayout;
        this.t = materialToolbar;
    }

    public lv4(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.q = layoutParams;
        this.r = new Rect();
        this.s = new int[2];
        this.t = new int[2];
        this.n = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.o = viewInflate;
        this.p = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(lv4.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public /* synthetic */ lv4(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6, ViewGroup viewGroup2) {
        this.n = view;
        this.o = view2;
        this.p = view3;
        this.q = view4;
        this.r = view5;
        this.s = view6;
        this.t = viewGroup2;
    }

    public lv4(Context context, r90 r90Var, bq4 bq4Var, pq3 pq3Var, WorkDatabase workDatabase, dd5 dd5Var, ArrayList arrayList) {
        context.getClass();
        this.o = r90Var;
        this.p = bq4Var;
        this.q = pq3Var;
        this.r = workDatabase;
        this.s = dd5Var;
        this.t = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.n = applicationContext;
    }

    public lv4(gr4 gr4Var) {
        gr4Var.getClass();
        this.n = gr4Var;
        this.s = kq1.a;
        this.t = r81.a;
    }

    public lv4(li1 li1Var, li1 li1Var2, li1 li1Var3, li1 li1Var4, i11 i11Var, i11 i11Var2) {
        this.t = s51.a(150, new d34(24, this));
        this.n = li1Var;
        this.o = li1Var2;
        this.p = li1Var3;
        this.q = li1Var4;
        this.r = i11Var;
        this.s = i11Var2;
    }
}
