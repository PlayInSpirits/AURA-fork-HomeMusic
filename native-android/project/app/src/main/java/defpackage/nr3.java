package defpackage;

import android.opengl.GLES20;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nr3 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public nr3(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean b(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean c(mr3 mr3Var) {
        lr3 lr3Var = mr3Var.a;
        lr3 lr3Var2 = mr3Var.b;
        tu[] tuVarArr = lr3Var.a;
        if (tuVarArr.length == 1 && tuVarArr[0].a == 0) {
            tu[] tuVarArr2 = lr3Var2.a;
            if (tuVarArr2.length == 1 && tuVarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        try {
            ew4 ew4Var = new ew4();
            this.h = ew4Var;
            this.b = GLES20.glGetUniformLocation(ew4Var.o, "uMvpMatrix");
            this.c = GLES20.glGetUniformLocation(((ew4) this.h).o, "uTexMatrix");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(((ew4) this.h).o, "aPosition");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            j51.l();
            this.d = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(((ew4) this.h).o, "aTexCoords");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
            j51.l();
            this.e = iGlGetAttribLocation2;
            this.f = GLES20.glGetUniformLocation(((ew4) this.h).o, "uTexture");
        } catch (GlUtil$GlException e) {
            l93.G("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01af  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x0206  */
    /* JADX WARN: Code duplicated, block: B:151:0x020b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0210  */
    /* JADX WARN: Code duplicated, block: B:157:0x0218  */
    /* JADX WARN: Code duplicated, block: B:159:0x021f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0225  */
    /* JADX WARN: Code duplicated, block: B:165:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x0254  */
    /* JADX WARN: Code duplicated, block: B:179:0x0258  */
    /* JADX WARN: Code duplicated, block: B:181:0x025e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0263  */
    /* JADX WARN: Code duplicated, block: B:185:0x0280  */
    /* JADX WARN: Code duplicated, block: B:186:0x0282  */
    /* JADX WARN: Code duplicated, block: B:193:0x028e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0295  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    public void d(jc0 jc0Var, kr krVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iW;
        int iMakeMeasureSpec3;
        kc0 kc0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        mb0 mb0Var;
        int i2;
        int measuredWidth;
        int measuredHeight;
        int i3;
        int iMin;
        int i4;
        int i5;
        int iMin2;
        int i6;
        int i7;
        int iMakeMeasureSpec4;
        boolean z7;
        int baseline;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        int i9;
        boolean z11;
        int i10;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
        hb0 hb0Var = jc0Var.J;
        hb0 hb0Var2 = jc0Var.H;
        if (jc0Var.f0 == 8) {
            krVar.e = 0;
            krVar.f = 0;
            krVar.g = 0;
            return;
        }
        if (jc0Var.S == null) {
            return;
        }
        fd4 fd4Var = ConstraintLayout.C;
        int i11 = krVar.a;
        int i12 = krVar.b;
        int i13 = krVar.c;
        int i14 = krVar.d;
        int i15 = this.a + this.b;
        int i16 = this.c;
        View view = jc0Var.e0;
        int iW2 = xa3.w(i11);
        if (iW2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else {
            if (iW2 != 1) {
                if (iW2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i16, -2);
                    boolean z12 = jc0Var.r == 1;
                    int i17 = krVar.j;
                    if (i17 == 1 || i17 == 2) {
                        boolean z13 = view.getMeasuredHeight() == jc0Var.i();
                        if (krVar.j == 2 || !z12 || ((z12 && z13) || jc0Var.y())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jc0Var.o(), 1073741824);
                        }
                    }
                } else if (iW2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i18 = this.e;
                    int i19 = hb0Var2 != null ? hb0Var2.g : 0;
                    if (hb0Var != null) {
                        i19 += hb0Var.g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i16 + i19, -1);
                }
                iW = xa3.w(i12);
                if (iW != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else if (iW != 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
                } else if (iW != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
                    if (jc0Var.s == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i9 = krVar.j;
                    if (i9 != 1 || i9 == 2) {
                        if (view.getMeasuredWidth() == jc0Var.o()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (krVar.j != 2 || !z10 || ((z10 && z11) || jc0Var.z())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(jc0Var.i(), 1073741824);
                        }
                    }
                } else if (iW != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i20 = this.f;
                    if (hb0Var2 != null) {
                        i10 = jc0Var.I.g;
                    } else {
                        i10 = 0;
                    }
                    if (hb0Var != null) {
                        i10 += jc0Var.K.g;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i20, i15 + i10, -1);
                }
                kc0Var = (kc0) jc0Var.S;
                if (kc0Var == null && uo.q(constraintLayout.v, 256) && view.getMeasuredWidth() == jc0Var.o() && view.getMeasuredWidth() < kc0Var.o() && view.getMeasuredHeight() == jc0Var.i() && view.getMeasuredHeight() < kc0Var.i() && view.getBaseline() == jc0Var.Z && !jc0Var.x() && b(jc0Var.F, iMakeMeasureSpec2, jc0Var.o()) && b(jc0Var.G, iMakeMeasureSpec3, jc0Var.i())) {
                    krVar.e = jc0Var.o();
                    krVar.f = jc0Var.i();
                    krVar.g = jc0Var.Z;
                    return;
                }
                if (i11 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i12 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i12 != 4 || i12 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i11 != 4 || i11 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z || jc0Var.V <= 0.0f) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || jc0Var.V <= 0.0f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (view == null) {
                    return;
                }
                mb0Var = (mb0) view.getLayoutParams();
                i2 = krVar.j;
                if (i2 == 1 && i2 != 2 && z && jc0Var.r == 0 && z2 && jc0Var.s == 0) {
                    z7 = false;
                    baseline = 0;
                    i8 = -1;
                    iMin = 0;
                    iMin2 = 0;
                } else {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    jc0Var.F = iMakeMeasureSpec2;
                    jc0Var.G = iMakeMeasureSpec3;
                    jc0Var.g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    i3 = jc0Var.u;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = jc0Var.v;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = jc0Var.x;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = iMakeMeasureSpec3;
                    i7 = jc0Var.y;
                    if (i7 > 0) {
                        iMin2 = Math.min(i7, iMin2);
                    }
                    if (!uo.q(constraintLayout.v, 1)) {
                        if (!z5 && z3) {
                            iMin = (int) ((iMin2 * jc0Var.V) + 0.5f);
                        } else if (z6 && z4) {
                            iMin2 = (int) ((iMin / jc0Var.V) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMin || measuredHeight != iMin2) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i6;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        jc0Var.F = iMakeMeasureSpec2;
                        jc0Var.G = iMakeMeasureSpec4;
                        z7 = false;
                        jc0Var.g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        iMin = measuredWidth2;
                        iMin2 = measuredHeight2;
                    } else {
                        baseline = baseline2;
                        z7 = false;
                    }
                    i8 = -1;
                }
                if (baseline != i8) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (iMin == krVar.c || iMin2 != krVar.d) {
                    z9 = true;
                } else {
                    z9 = z7;
                }
                krVar.i = z9;
                if (mb0Var.c0) {
                    z8 = true;
                }
                if (z8 && baseline != -1 && jc0Var.Z != baseline) {
                    krVar.i = true;
                }
                krVar.e = iMin;
                krVar.f = iMin2;
                krVar.h = z8;
                krVar.g = baseline;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i16, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iW = xa3.w(i12);
        if (iW != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else if (iW != 1) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
        } else if (iW != 2) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
            if (jc0Var.s == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i9 = krVar.j;
            if (i9 != 1) {
                if (view.getMeasuredWidth() == jc0Var.o()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (krVar.j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(jc0Var.i(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(jc0Var.i(), 1073741824);
                }
            } else {
                if (view.getMeasuredWidth() == jc0Var.o()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (krVar.j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(jc0Var.i(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(jc0Var.i(), 1073741824);
                }
            }
        } else if (iW != 3) {
            iMakeMeasureSpec3 = 0;
        } else {
            int i21 = this.f;
            if (hb0Var2 != null) {
                i10 = jc0Var.I.g;
            } else {
                i10 = 0;
            }
            if (hb0Var != null) {
                i10 += jc0Var.K.g;
            }
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i21, i15 + i10, -1);
        }
        kc0Var = (kc0) jc0Var.S;
        if (kc0Var == null) {
        }
        if (i11 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i12 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i12 != 4) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (i11 != 4) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (z2) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (view == null) {
            return;
        }
        mb0Var = (mb0) view.getLayoutParams();
        i2 = krVar.j;
        if (i2 == 1) {
            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            jc0Var.F = iMakeMeasureSpec2;
            jc0Var.G = iMakeMeasureSpec3;
            jc0Var.g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline3 = view.getBaseline();
            i3 = jc0Var.u;
            if (i3 > 0) {
                iMin = Math.max(i3, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i4 = jc0Var.v;
            if (i4 > 0) {
                iMin = Math.min(i4, iMin);
            }
            i5 = jc0Var.x;
            if (i5 > 0) {
                iMin2 = Math.max(i5, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i6 = iMakeMeasureSpec3;
            i7 = jc0Var.y;
            if (i7 > 0) {
                iMin2 = Math.min(i7, iMin2);
            }
            if (!uo.q(constraintLayout.v, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / jc0Var.V) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / jc0Var.V) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                jc0Var.F = iMakeMeasureSpec2;
                jc0Var.G = iMakeMeasureSpec4;
                z7 = false;
                jc0Var.g = false;
                int measuredWidth3 = view.getMeasuredWidth();
                int measuredHeight3 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth3;
                iMin2 = measuredHeight3;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                jc0Var.F = iMakeMeasureSpec2;
                jc0Var.G = iMakeMeasureSpec4;
                z7 = false;
                jc0Var.g = false;
                int measuredWidth4 = view.getMeasuredWidth();
                int measuredHeight4 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth4;
                iMin2 = measuredHeight4;
            }
            i8 = -1;
        } else {
            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            jc0Var.F = iMakeMeasureSpec2;
            jc0Var.G = iMakeMeasureSpec3;
            jc0Var.g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline4 = view.getBaseline();
            i3 = jc0Var.u;
            if (i3 > 0) {
                iMin = Math.max(i3, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i4 = jc0Var.v;
            if (i4 > 0) {
                iMin = Math.min(i4, iMin);
            }
            i5 = jc0Var.x;
            if (i5 > 0) {
                iMin2 = Math.max(i5, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i6 = iMakeMeasureSpec3;
            i7 = jc0Var.y;
            if (i7 > 0) {
                iMin2 = Math.min(i7, iMin2);
            }
            if (!uo.q(constraintLayout.v, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / jc0Var.V) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / jc0Var.V) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                jc0Var.F = iMakeMeasureSpec2;
                jc0Var.G = iMakeMeasureSpec4;
                z7 = false;
                jc0Var.g = false;
                int measuredWidth5 = view.getMeasuredWidth();
                int measuredHeight5 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth5;
                iMin2 = measuredHeight5;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                jc0Var.F = iMakeMeasureSpec2;
                jc0Var.G = iMakeMeasureSpec4;
                z7 = false;
                jc0Var.g = false;
                int measuredWidth6 = view.getMeasuredWidth();
                int measuredHeight6 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth6;
                iMin2 = measuredHeight6;
            }
            i8 = -1;
        }
        if (baseline != i8) {
            z8 = true;
        } else {
            z8 = z7;
        }
        if (iMin == krVar.c) {
            z9 = true;
        } else {
            z9 = true;
        }
        krVar.i = z9;
        if (mb0Var.c0) {
            z8 = true;
        }
        if (z8) {
            krVar.i = true;
        }
        krVar.e = iMin;
        krVar.f = iMin2;
        krVar.h = z8;
        krVar.g = baseline;
    }
}
