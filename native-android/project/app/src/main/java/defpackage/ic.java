package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ic {
    public final mc a;
    public final int b;
    public final long c;
    public final ks4 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:140:0x0210  */
    /* JADX WARN: Code duplicated, block: B:141:0x0212  */
    /* JADX WARN: Code duplicated, block: B:143:0x022c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0246  */
    /* JADX WARN: Code duplicated, block: B:147:0x024a A[LOOP:1: B:146:0x0248->B:147:0x024a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0273  */
    /* JADX WARN: Code duplicated, block: B:151:0x0277  */
    /* JADX WARN: Code duplicated, block: B:153:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x0246, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x0277, please report this as an issue */
    public ic(mc mcVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        ks4 ks4VarB;
        int i7;
        ic icVar;
        int i8;
        int i9;
        int i10;
        Layout layout;
        Spanned spanned;
        wb4[] wb4VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        List list;
        int spanEnd;
        int iF;
        boolean z;
        boolean z2;
        boolean z3;
        wv3 wv3Var;
        float fI;
        int iC;
        float fH;
        int iC2;
        int i12;
        int i13;
        this.a = mcVar;
        this.b = i;
        this.c = j;
        if (nc0.i(j) != 0 || nc0.j(j) != 0) {
            dz1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            dz1.a("maxLines should be greater than 0");
        }
        zs4 zs4Var = mcVar.o;
        CharSequence charSequence2 = mcVar.u;
        if (i2 == 2) {
            i3 = 0;
            if (!bt4.a(zs4Var.a.h, su3.v(0)) && !bt4.a(zs4Var.a.h, bt4.c) && (i13 = zs4Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!bu.q(spannableString, px1.class)) {
                    spannableString.setSpan(new px1(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        sd3 sd3Var = zs4Var.b;
        ij4 ij4Var = zs4Var.a;
        int i14 = sd3Var.a;
        int i15 = 3;
        int i16 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i17 = i14 == 4 ? 1 : i3;
        int i18 = sd3Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = sd3Var.g;
        int i20 = i19 & 255;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & 255;
        if (i21 == 1) {
            i15 = i3;
        } else if (i21 == 2) {
            i15 = 1;
        } else if (i21 == 3) {
            i15 = 2;
        } else if (i21 != 4) {
            i15 = i3;
        }
        int i22 = (i19 >> 16) & 255;
        if (i22 != 1) {
            i5 = 2;
            i6 = i22 == 2 ? 1 : i6;
            if (i2 == i5) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i2 == 5) {
                    if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c = ' ';
                        truncateAt = null;
                    }
                    ks4VarB = b(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                    Layout layout2 = ks4VarB.e;
                    i7 = i16;
                    if (Build.VERSION.SDK_INT < 35 || mcVar.t.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        icVar = this;
                        i8 = i;
                        i9 = i7;
                        i10 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i10 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        icVar = this;
                        i8 = i;
                        i9 = i7;
                        ks4VarB = icVar.b(i9, i17, truncateAt, i8, i18, i4, i15, i6, TextUtils.concat(charSequenceArr));
                    }
                    int i23 = ks4VarB.f;
                    if (i2 == i10 || ks4VarB.a() <= nc0.g(j) || i8 <= 1) {
                        icVar.d = ks4VarB;
                    } else {
                        int iG = nc0.g(j);
                        int i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                i24 = i23;
                                break;
                            } else if (ks4VarB.d(i24) > iG) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i24 >= 0 && i24 != icVar.b) {
                            ks4VarB = icVar.b(i9, i17, truncateAt, i24 < 1 ? 1 : i24, i18, i4, i15, i6, icVar.e);
                        }
                        icVar.d = ks4VarB;
                    }
                    icVar.f = icVar.d.a();
                    icVar.a.t.c(ij4Var.a.f(), (((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c), ij4Var.a.b());
                    layout = icVar.d.e;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), wb4.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            wb4VarArr = (wb4[]) ((Spanned) text2).getSpans(0, layout.getText().length(), wb4.class);
                        } else {
                            wb4VarArr = null;
                        }
                    } else {
                        wb4VarArr = null;
                    }
                    if (wb4VarArr != null) {
                        for (wb4 wb4Var : wb4VarArr) {
                            wb4Var.p.setValue(new qf4((((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c)));
                        }
                    }
                    charSequence = icVar.e;
                    if (charSequence instanceof Spanned) {
                        spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), ng3.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            ng3 ng3Var = (ng3) obj;
                            int spanStart = spanned2.getSpanStart(ng3Var);
                            spanEnd = spanned2.getSpanEnd(ng3Var);
                            iF = icVar.d.f(spanStart);
                            if (iF >= icVar.b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (icVar.d.e.getEllipsisCount(iF) > 0 || spanEnd <= icVar.d.e.getEllipsisStart(iF) + icVar.d.e.getLineStart(iF)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (spanEnd > icVar.d.e(iF)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && !z3 && !z) {
                                boolean z4 = icVar.d.e.getParagraphDirection(iF) == 1;
                                boolean zIsRtlCharAt = icVar.d.e.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fH = icVar.d.i(spanStart, false);
                                        iC2 = ng3Var.c();
                                    } else {
                                        ks4 ks4Var = icVar.d;
                                        if (zIsRtlCharAt) {
                                            fH = ks4Var.h(spanStart, false);
                                            iC2 = ng3Var.c();
                                        } else {
                                            fI = ks4Var.i(spanStart, false);
                                            iC = ng3Var.c();
                                        }
                                    }
                                    fI = fH - iC2;
                                    ks4 ks4Var2 = icVar.d;
                                    ng3Var.getClass();
                                    float fC = ks4Var2.c(iF) - ng3Var.b();
                                    wv3Var = new wv3(fI, fC, fH, ng3Var.b() + fC);
                                } else {
                                    fI = icVar.d.h(spanStart, false);
                                    iC = ng3Var.c();
                                }
                                fH = iC + fI;
                                ks4 ks4Var3 = icVar.d;
                                ng3Var.getClass();
                                float fC2 = ks4Var3.c(iF) - ng3Var.b();
                                wv3Var = new wv3(fI, fC2, fH, ng3Var.b() + fC2);
                            }
                            arrayList.add(wv3Var);
                        }
                        list = arrayList;
                    } else {
                        list = u01.n;
                    }
                    icVar.g = list;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c = ' ';
            truncateAt = truncateAt2;
            ks4VarB = b(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
            Layout layout3 = ks4VarB.e;
            i7 = i16;
            if (Build.VERSION.SDK_INT < 35) {
                icVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            } else {
                icVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            }
            int i25 = ks4VarB.f;
            if (i2 == i10) {
                icVar.d = ks4VarB;
            } else {
                icVar.d = ks4VarB;
            }
            icVar.f = icVar.d.a();
            icVar.a.t.c(ij4Var.a.f(), (((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c), ij4Var.a.b());
            layout = icVar.d.e;
            if (layout.getText() instanceof Spanned) {
                wb4VarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                text3.getClass();
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), wb4.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    text4.getClass();
                    wb4VarArr = (wb4[]) ((Spanned) text4).getSpans(0, layout.getText().length(), wb4.class);
                } else {
                    wb4VarArr = null;
                }
            }
            if (wb4VarArr != null) {
                while (i12 < r2) {
                    wb4Var.p.setValue(new qf4((((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c)));
                }
            }
            charSequence = icVar.e;
            if (charSequence instanceof Spanned) {
                list = u01.n;
            } else {
                spanned2 = (Spanned) charSequence;
                Object[] spans2 = spanned2.getSpans(0, charSequence.length(), ng3.class);
                arrayList = new ArrayList(spans2.length);
                while (i11 < r4) {
                    ng3 ng3Var2 = (ng3) obj;
                    int spanStart2 = spanned2.getSpanStart(ng3Var2);
                    spanEnd = spanned2.getSpanEnd(ng3Var2);
                    iF = icVar.d.f(spanStart2);
                    if (iF >= icVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (icVar.d.e.getEllipsisCount(iF) > 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > icVar.d.e(iF)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    wv3Var = z2 ? null : null;
                    arrayList.add(wv3Var);
                }
                list = arrayList;
            }
            icVar.g = list;
        }
        i5 = 2;
        i6 = i3;
        if (i2 == i5) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 == 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c = ' ';
                    truncateAt = null;
                }
                ks4VarB = b(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                Layout layout4 = ks4VarB.e;
                i7 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                    icVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                } else {
                    icVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                }
                int i26 = ks4VarB.f;
                if (i2 == i10) {
                    icVar.d = ks4VarB;
                } else {
                    icVar.d = ks4VarB;
                }
                icVar.f = icVar.d.a();
                icVar.a.t.c(ij4Var.a.f(), (((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c), ij4Var.a.b());
                layout = icVar.d.e;
                if (layout.getText() instanceof Spanned) {
                    wb4VarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    text5.getClass();
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), wb4.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        text6.getClass();
                        wb4VarArr = (wb4[]) ((Spanned) text6).getSpans(0, layout.getText().length(), wb4.class);
                    } else {
                        wb4VarArr = null;
                    }
                }
                if (wb4VarArr != null) {
                    while (i12 < r2) {
                        wb4Var.p.setValue(new qf4((((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c)));
                    }
                }
                charSequence = icVar.e;
                if (charSequence instanceof Spanned) {
                    list = u01.n;
                } else {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans3 = spanned2.getSpans(0, charSequence.length(), ng3.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i11 < r4) {
                        ng3 ng3Var3 = (ng3) obj;
                        int spanStart3 = spanned2.getSpanStart(ng3Var3);
                        spanEnd = spanned2.getSpanEnd(ng3Var3);
                        iF = icVar.d.f(spanStart3);
                        if (iF >= icVar.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (icVar.d.e.getEllipsisCount(iF) > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > icVar.d.e(iF)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                        }
                        arrayList.add(wv3Var);
                    }
                    list = arrayList;
                }
                icVar.g = list;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c = ' ';
        truncateAt = truncateAt2;
        ks4VarB = b(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
        Layout layout5 = ks4VarB.e;
        i7 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            icVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        } else {
            icVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        }
        int i27 = ks4VarB.f;
        if (i2 == i10) {
            icVar.d = ks4VarB;
        } else {
            icVar.d = ks4VarB;
        }
        icVar.f = icVar.d.a();
        icVar.a.t.c(ij4Var.a.f(), (((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c), ij4Var.a.b());
        layout = icVar.d.e;
        if (layout.getText() instanceof Spanned) {
            wb4VarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            text7.getClass();
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), wb4.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                text8.getClass();
                wb4VarArr = (wb4[]) ((Spanned) text8).getSpans(0, layout.getText().length(), wb4.class);
            } else {
                wb4VarArr = null;
            }
        }
        if (wb4VarArr != null) {
            while (i12 < r2) {
                wb4Var.p.setValue(new qf4((((long) Float.floatToRawIntBits(icVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(icVar.c())) << c)));
            }
        }
        charSequence = icVar.e;
        if (charSequence instanceof Spanned) {
            list = u01.n;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans4 = spanned2.getSpans(0, charSequence.length(), ng3.class);
            arrayList = new ArrayList(spans4.length);
            while (i11 < r4) {
                ng3 ng3Var4 = (ng3) obj;
                int spanStart4 = spanned2.getSpanStart(ng3Var4);
                spanEnd = spanned2.getSpanEnd(ng3Var4);
                iF = icVar.d.f(spanStart4);
                if (iF >= icVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (icVar.d.e.getEllipsisCount(iF) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > icVar.d.e(iF)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(wv3Var);
            }
            list = arrayList;
        }
        icVar.g = list;
    }

    public static final void a(ic icVar, jz jzVar) {
        icVar.getClass();
        Canvas canvasA = ba.a(jzVar);
        ks4 ks4Var = icVar.d;
        if (ks4Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, icVar.c(), icVar.f);
        }
        int i = ks4Var.g;
        if (canvasA.getClipBounds(ks4Var.o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = ns4.a;
            Object or4Var = threadLocal.get();
            if (or4Var == null) {
                or4Var = new or4();
                threadLocal.set(or4Var);
            }
            or4 or4Var2 = (or4) or4Var;
            or4Var2.a = canvasA;
            try {
                ks4Var.e.draw(or4Var2);
                or4Var2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                or4Var2.a = null;
                throw th;
            }
        }
        if (ks4Var.d) {
            canvasA.restore();
        }
    }

    public final ks4 b(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        zg3 zg3Var;
        float fC = c();
        mc mcVar = this.a;
        xc xcVar = mcVar.t;
        int i8 = mcVar.y;
        t62 t62Var = mcVar.v;
        zs4 zs4Var = mcVar.o;
        jc jcVar = kc.a;
        eh3 eh3Var = zs4Var.c;
        return new ks4(charSequence, fC, xcVar, i, truncateAt, i8, (eh3Var == null || (zg3Var = eh3Var.a) == null) ? false : zg3Var.a, i3, i5, i6, i7, i4, i2, t62Var);
    }

    public final float c() {
        return nc0.h(this.c);
    }

    public final void d(jz jzVar, long j, xb4 xb4Var, sr4 sr4Var, q05 q05Var) {
        xc xcVar = this.a.t;
        int i = xcVar.c;
        xcVar.d(j);
        xcVar.f(xb4Var);
        xcVar.g(sr4Var);
        xcVar.e(q05Var);
        xcVar.b(3);
        new q(1, this, ic.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, 1).invoke(jzVar);
        xcVar.b(i);
    }

    public final void e(jz jzVar, uo uoVar, float f, xb4 xb4Var, sr4 sr4Var, q05 q05Var) {
        xc xcVar = this.a.t;
        int i = xcVar.c;
        xcVar.c(uoVar, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        xcVar.f(xb4Var);
        xcVar.g(sr4Var);
        xcVar.e(q05Var);
        xcVar.b(3);
        new q(1, this, ic.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, 2).invoke(jzVar);
        xcVar.b(i);
    }
}
