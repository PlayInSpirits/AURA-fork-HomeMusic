package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.navigation.fragment.NavHostFragment;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q05 {
    public static final kr a = new kr();
    public static final f01 b = new f01(1, "NO_OWNER");
    public static final o54 c = new o54(17);

    public static final BlendMode A(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode B(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static void C(int i, jc0 jc0Var, nr3 nr3Var) {
        boolean z;
        hb0 hb0Var;
        hb0 hb0Var2;
        hb0 hb0Var3;
        hb0 hb0Var4;
        if (jc0Var.n) {
            return;
        }
        if (!(jc0Var instanceof kc0) && jc0Var.x() && g(jc0Var)) {
            kc0.R(jc0Var, nr3Var, new kr());
        }
        hb0 hb0VarG = jc0Var.g(3);
        hb0 hb0VarG2 = jc0Var.g(5);
        int iC = hb0VarG.c();
        int iC2 = hb0VarG2.c();
        HashSet<hb0> hashSet = hb0VarG.a;
        if (hashSet != null && hb0VarG.c) {
            for (hb0 hb0Var5 : hashSet) {
                jc0 jc0Var2 = hb0Var5.d;
                int i2 = i + 1;
                boolean zG = g(jc0Var2);
                hb0 hb0Var6 = jc0Var2.I;
                hb0 hb0Var7 = jc0Var2.K;
                if (jc0Var2.x() && zG) {
                    kc0.R(jc0Var2, nr3Var, new kr());
                }
                boolean z2 = (hb0Var5 == hb0Var6 && (hb0Var4 = hb0Var7.f) != null && hb0Var4.c) || (hb0Var5 == hb0Var7 && (hb0Var3 = hb0Var6.f) != null && hb0Var3.c);
                int i3 = jc0Var2.o0[1];
                if (i3 != 3 || zG) {
                    if (!jc0Var2.x()) {
                        if (hb0Var5 == hb0Var6 && hb0Var7.f == null) {
                            int iD = hb0Var6.d() + iC;
                            jc0Var2.G(iD, jc0Var2.i() + iD);
                            C(i2, jc0Var2, nr3Var);
                        } else if (hb0Var5 == hb0Var7 && hb0Var6.f == null) {
                            int iD2 = iC - hb0Var7.d();
                            jc0Var2.G(iD2 - jc0Var2.i(), iD2);
                            C(i2, jc0Var2, nr3Var);
                        } else if (z2 && !jc0Var2.w()) {
                            x(i2, jc0Var2, nr3Var);
                        }
                    }
                } else if (i3 == 3 && jc0Var2.y >= 0 && jc0Var2.x >= 0 && (jc0Var2.f0 == 8 || (jc0Var2.s == 0 && jc0Var2.V == 0.0f))) {
                    if (!jc0Var2.w() && z2 && !jc0Var2.w()) {
                        y(i2, jc0Var, nr3Var, jc0Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (jc0Var instanceof pk1) {
            return;
        }
        HashSet<hb0> hashSet2 = hb0VarG2.a;
        if (hashSet2 != null && hb0VarG2.c) {
            for (hb0 hb0Var8 : hashSet2) {
                jc0 jc0Var3 = hb0Var8.d;
                int i4 = i + 1;
                boolean zG2 = g(jc0Var3);
                hb0 hb0Var9 = jc0Var3.I;
                hb0 hb0Var10 = jc0Var3.K;
                if (jc0Var3.x() && zG2) {
                    kc0.R(jc0Var3, nr3Var, new kr());
                }
                boolean z4 = (hb0Var8 == hb0Var9 && (hb0Var2 = hb0Var10.f) != null && hb0Var2.c) || (hb0Var8 == hb0Var10 && (hb0Var = hb0Var9.f) != null && hb0Var.c);
                int i5 = jc0Var3.o0[1];
                if (i5 != 3 || zG2) {
                    if (!jc0Var3.x()) {
                        if (hb0Var8 == hb0Var9 && hb0Var10.f == null) {
                            int iD3 = hb0Var9.d() + iC2;
                            jc0Var3.G(iD3, jc0Var3.i() + iD3);
                            C(i4, jc0Var3, nr3Var);
                        } else if (hb0Var8 == hb0Var10 && hb0Var9.f == null) {
                            int iD4 = iC2 - hb0Var10.d();
                            jc0Var3.G(iD4 - jc0Var3.i(), iD4);
                            C(i4, jc0Var3, nr3Var);
                        } else if (z4 && !jc0Var3.w()) {
                            x(i4, jc0Var3, nr3Var);
                        }
                    }
                } else if (i5 == 3 && jc0Var3.y >= 0 && jc0Var3.x >= 0 && (jc0Var3.f0 == 8 || (jc0Var3.s == 0 && jc0Var3.V == 0.0f))) {
                    if (!jc0Var3.w() && z4 && !jc0Var3.w()) {
                        y(i4, jc0Var, nr3Var, jc0Var3);
                    }
                }
            }
        }
        hb0 hb0VarG3 = jc0Var.g(6);
        if (hb0VarG3.a != null && hb0VarG3.c) {
            int iC3 = hb0VarG3.c();
            for (hb0 hb0Var11 : hb0VarG3.a) {
                jc0 jc0Var4 = hb0Var11.d;
                int i6 = i + 1;
                boolean zG3 = g(jc0Var4);
                hb0 hb0Var12 = jc0Var4.L;
                if (jc0Var4.x() && zG3) {
                    kc0.R(jc0Var4, nr3Var, new kr());
                }
                if (jc0Var4.o0[z3 ? 1 : 0] != 3 || zG3) {
                    if (!jc0Var4.x()) {
                        if (hb0Var11 == hb0Var12) {
                            int iD5 = hb0Var11.d() + iC3;
                            if (jc0Var4.E) {
                                int i7 = iD5 - jc0Var4.Z;
                                int i8 = jc0Var4.U + i7;
                                jc0Var4.Y = i7;
                                jc0Var4.I.i(i7);
                                jc0Var4.K.i(i8);
                                hb0Var12.i(iD5);
                                z = z3 ? 1 : 0;
                                jc0Var4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            C(i6, jc0Var4, nr3Var);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        jc0Var.n = z3;
    }

    public static final void a(r70 r70Var, rg1 rg1Var, int i) {
        rg1Var.S(-709502251);
        byte b2 = 0;
        int i2 = 6;
        if (rg1Var.K(i & 1, (i & 3) != 2)) {
            qr3 qr3Var = z44.a;
            Object obj = (x44) rg1Var.i(qr3Var);
            rg1Var.R(1967007413);
            Object[] objArr = new Object[0];
            Object objH = rg1Var.H();
            Object obj2 = j80.a;
            if (objH == obj2) {
                objH = new rd2(i2);
                rg1Var.b0(objH);
            }
            w44 w44Var = (w44) gh0.z(objArr, w44.r, (gf1) objH, rg1Var, 384);
            w44Var.p = (x44) rg1Var.i(qr3Var);
            rg1Var.o(false);
            Object[] objArr2 = {obj};
            xc5 xc5Var = new xc5(19, new d60(14, b2), new o(16, obj, w44Var));
            boolean zG = rg1Var.g(obj) | rg1Var.g(w44Var);
            Object objH2 = rg1Var.H();
            if (zG || objH2 == obj2) {
                objH2 = new fa(12, obj, w44Var);
                rg1Var.b0(objH2);
            }
            Object obj3 = (z82) gh0.z(objArr2, xc5Var, (gf1) objH2, rg1Var, 0);
            gi1.a(qr3Var.a(obj3), fh0.w(-412824043, new ib(5, r70Var, obj3), rg1Var), rg1Var, 56);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new z(i, i2, r70Var);
        }
    }

    public static ac3 b(int i) {
        return new ac3(0.0f, 0.0f);
    }

    public static void c(df dfVar, int i) {
        View viewPeekDecorView;
        Context context;
        dfVar.getTheme().applyStyle(i, true);
        Window window = dfVar.getWindow();
        Resources.Theme theme = (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) ? null : context.getTheme();
        if (theme != null) {
            theme.applyStyle(i, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean d(int i, Rect rect, Rect rect2, Rect rect3) {
        int iS;
        int i2;
        int i3;
        boolean zE = e(i, rect, rect2);
        if (!e(i, rect, rect3) && zE) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iS = s(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iS < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iS = s(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iS < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iS = s(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iS < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iS = s(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iS < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static boolean g(jc0 jc0Var) {
        int[] iArr = jc0Var.o0;
        int i = iArr[0];
        int i2 = iArr[1];
        jc0 jc0Var2 = jc0Var.S;
        kc0 kc0Var = jc0Var2 != null ? (kc0) jc0Var2 : null;
        if (kc0Var != null) {
            int i3 = kc0Var.o0[0];
        }
        if (kc0Var != null) {
            int i4 = kc0Var.o0[1];
        }
        boolean z = i == 1 || jc0Var.y() || i == 2 || (i == 3 && jc0Var.r == 0 && jc0Var.V == 0.0f && jc0Var.r(0)) || (i == 3 && jc0Var.r == 1 && jc0Var.s(0, jc0Var.o()));
        boolean z2 = i2 == 1 || jc0Var.z() || i2 == 2 || (i2 == 3 && jc0Var.s == 0 && jc0Var.V == 0.0f && jc0Var.r(1)) || (i2 == 3 && jc0Var.s == 1 && jc0Var.s(1, jc0Var.i()));
        return (jc0Var.V > 0.0f && (z || z2)) || (z && z2);
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                j51.d(th, th2);
            }
        }
    }

    public static boolean i(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = i(file2) && z;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b35] */
    public static b35 j(final Function function) {
        try {
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            return new Predicate() { // from class: b35
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return concurrentHashMap.putIfAbsent(function.apply(obj), Boolean.TRUE) == null;
                }
            };
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static int k(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            sb1 sb1Var = new sb1();
            sb1Var.m = lw2.m("video/avc");
            tb1 tb1Var = new tb1(sb1Var);
            String str = tb1Var.n;
            if (str != null) {
                List listE = jk2.e(z, false, str);
                String strC = jk2.c(tb1Var);
                Iterable iterableE = strC == null ? gy3.r : jk2.e(z, false, strC);
                uw1 uw1VarJ = yw1.j();
                uw1VarJ.d(listE);
                uw1VarJ.d(iterableE);
                gy3 gy3VarF = uw1VarJ.f();
                for (int i = 0; i < gy3VarF.q; i++) {
                    if (((dk2) gy3VarF.get(i)).d != null && (videoCapabilities = ((dk2) gy3VarF.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        ek2.m();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointG = ek2.g();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (yj1.c(supportedPerformancePoints.get(i2)).covers(performancePointG)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static v23 l(kc1 kc1Var) {
        Dialog dialog;
        Window window;
        kc1Var.getClass();
        for (kc1 kc1Var2 = kc1Var; kc1Var2 != null; kc1Var2 = kc1Var2.I) {
            if (kc1Var2 instanceof NavHostFragment) {
                return ((NavHostFragment) kc1Var2).h0();
            }
            kc1 kc1Var3 = kc1Var2.q().y;
            if (kc1Var3 instanceof NavHostFragment) {
                return ((NavHostFragment) kc1Var3).h0();
            }
        }
        View view = kc1Var.T;
        if (view != null) {
            return gb.x(view);
        }
        pp0 pp0Var = kc1Var instanceof pp0 ? (pp0) kc1Var : null;
        View decorView = (pp0Var == null || (dialog = pp0Var.w0) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return gb.x(decorView);
        }
        kf2.o(b11.l("Fragment ", kc1Var, " does not have a NavController set"));
        return null;
    }

    public static final rc5 m(dd5 dd5Var) {
        dd5Var.getClass();
        return new rc5(dd5Var.t, dd5Var.a);
    }

    public static final int n(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                kf2.n("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final void o(ne0 ne0Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = re0.a.iterator();
        while (it.hasNext()) {
            try {
                ((qe0) it.next()).n(ne0Var, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    j51.d(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            j51.d(th, new DiagnosticCoroutineContextException(ne0Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void p(int i, jc0 jc0Var, nr3 nr3Var, boolean z) {
        hb0 hb0Var;
        hb0 hb0Var2;
        boolean z2;
        hb0 hb0Var3;
        hb0 hb0Var4;
        if (jc0Var.m) {
            return;
        }
        if (!(jc0Var instanceof kc0) && jc0Var.x() && g(jc0Var)) {
            kc0.R(jc0Var, nr3Var, new kr());
        }
        hb0 hb0VarG = jc0Var.g(2);
        hb0 hb0VarG2 = jc0Var.g(4);
        int iC = hb0VarG.c();
        int iC2 = hb0VarG2.c();
        HashSet<hb0> hashSet = hb0VarG.a;
        if (hashSet != null && hb0VarG.c) {
            for (hb0 hb0Var5 : hashSet) {
                jc0 jc0Var2 = hb0Var5.d;
                int i2 = i + 1;
                boolean zG = g(jc0Var2);
                hb0 hb0Var6 = jc0Var2.H;
                hb0 hb0Var7 = jc0Var2.J;
                if (jc0Var2.x() && zG) {
                    z2 = true;
                    kc0.R(jc0Var2, nr3Var, new kr());
                } else {
                    z2 = true;
                }
                boolean z3 = ((hb0Var5 == hb0Var6 && (hb0Var4 = hb0Var7.f) != null && hb0Var4.c) || (hb0Var5 == hb0Var7 && (hb0Var3 = hb0Var6.f) != null && hb0Var3.c)) ? z2 : false;
                int i3 = jc0Var2.o0[0];
                if (i3 != 3 || zG) {
                    if (!jc0Var2.x()) {
                        if (hb0Var5 == hb0Var6 && hb0Var7.f == null) {
                            int iD = hb0Var6.d() + iC;
                            jc0Var2.F(iD, jc0Var2.o() + iD);
                            p(i2, jc0Var2, nr3Var, z);
                        } else if (hb0Var5 == hb0Var7 && hb0Var6.f == null) {
                            int iD2 = iC - hb0Var7.d();
                            jc0Var2.F(iD2 - jc0Var2.o(), iD2);
                            p(i2, jc0Var2, nr3Var, z);
                        } else if (z3 && !jc0Var2.v()) {
                            v(i2, jc0Var2, nr3Var, z);
                        }
                    }
                } else if (i3 == 3 && jc0Var2.v >= 0 && jc0Var2.u >= 0 && (jc0Var2.f0 == 8 || (jc0Var2.r == 0 && jc0Var2.V == 0.0f))) {
                    if (!jc0Var2.v() && z3 && !jc0Var2.v()) {
                        w(i2, jc0Var, nr3Var, jc0Var2, z);
                    }
                }
            }
        }
        if (jc0Var instanceof pk1) {
            return;
        }
        HashSet<hb0> hashSet2 = hb0VarG2.a;
        if (hashSet2 != null && hb0VarG2.c) {
            for (hb0 hb0Var8 : hashSet2) {
                jc0 jc0Var3 = hb0Var8.d;
                int i4 = i + 1;
                boolean zG2 = g(jc0Var3);
                hb0 hb0Var9 = jc0Var3.H;
                hb0 hb0Var10 = jc0Var3.J;
                if (jc0Var3.x() && zG2) {
                    kc0.R(jc0Var3, nr3Var, new kr());
                }
                boolean z4 = (hb0Var8 == hb0Var9 && (hb0Var2 = hb0Var10.f) != null && hb0Var2.c) || (hb0Var8 == hb0Var10 && (hb0Var = hb0Var9.f) != null && hb0Var.c);
                int i5 = jc0Var3.o0[0];
                if (i5 != 3 || zG2) {
                    if (!jc0Var3.x()) {
                        if (hb0Var8 == hb0Var9 && hb0Var10.f == null) {
                            int iD3 = hb0Var9.d() + iC2;
                            jc0Var3.F(iD3, jc0Var3.o() + iD3);
                            p(i4, jc0Var3, nr3Var, z);
                        } else if (hb0Var8 == hb0Var10 && hb0Var9.f == null) {
                            int iD4 = iC2 - hb0Var10.d();
                            jc0Var3.F(iD4 - jc0Var3.o(), iD4);
                            p(i4, jc0Var3, nr3Var, z);
                        } else if (z4 && !jc0Var3.v()) {
                            v(i4, jc0Var3, nr3Var, z);
                        }
                    }
                } else if (i5 == 3 && jc0Var3.v >= 0 && jc0Var3.u >= 0) {
                    if (jc0Var3.f0 == 8 || (jc0Var3.r == 0 && jc0Var3.V == 0.0f)) {
                        if (!jc0Var3.v() && z4 && !jc0Var3.v()) {
                            w(i4, jc0Var, nr3Var, jc0Var3, z);
                        }
                    }
                }
            }
        }
        jc0Var.m = true;
    }

    public static final boolean q(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static boolean r(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static int s(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int t(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final void u(ViewGroup viewGroup) {
        Drawable drawableMutate;
        viewGroup.getClass();
        int iL = ji2.L(24.0f * viewGroup.getResources().getDisplayMetrics().density);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                compoundDrawablesRelative.getClass();
                Drawable drawable = compoundDrawablesRelative[0];
                if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                    drawableMutate.setBounds(0, 0, iL, iL);
                    ColorStateList compoundDrawableTintList = textView.getCompoundDrawableTintList();
                    if (compoundDrawableTintList != null) {
                        drawableMutate.setTintList(compoundDrawableTintList);
                    }
                    textView.setCompoundDrawablesRelative(drawableMutate, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                }
            }
        }
    }

    public static void v(int i, jc0 jc0Var, nr3 nr3Var, boolean z) {
        float f = jc0Var.c0;
        hb0 hb0Var = jc0Var.H;
        int iC = hb0Var.f.c();
        hb0 hb0Var2 = jc0Var.J;
        int iC2 = hb0Var2.f.c();
        int iD = hb0Var.d() + iC;
        int iD2 = iC2 - hb0Var2.d();
        if (iC == iC2) {
            f = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int iO = jc0Var.o();
        int i2 = (iC2 - iC) - iO;
        if (iC > iC2) {
            i2 = (iC - iC2) - iO;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iC;
        int i4 = i3 + iO;
        if (iC > iC2) {
            i4 = i3 - iO;
        }
        jc0Var.F(i3, i4);
        p(i + 1, jc0Var, nr3Var, z);
    }

    public static void w(int i, jc0 jc0Var, nr3 nr3Var, jc0 jc0Var2, boolean z) {
        float f = jc0Var2.c0;
        hb0 hb0Var = jc0Var2.H;
        int iD = hb0Var.d() + hb0Var.f.c();
        hb0 hb0Var2 = jc0Var2.J;
        int iC = hb0Var2.f.c() - hb0Var2.d();
        if (iC >= iD) {
            int iO = jc0Var2.o();
            if (jc0Var2.f0 != 8) {
                int i2 = jc0Var2.r;
                if (i2 == 2) {
                    iO = (int) (jc0Var2.c0 * 0.5f * (jc0Var instanceof kc0 ? jc0Var.o() : jc0Var.S.o()));
                } else if (i2 == 0) {
                    iO = iC - iD;
                }
                iO = Math.max(jc0Var2.u, iO);
                int i3 = jc0Var2.v;
                if (i3 > 0) {
                    iO = Math.min(i3, iO);
                }
            }
            int i4 = iD + ((int) ((f * ((iC - iD) - iO)) + 0.5f));
            jc0Var2.F(i4, iO + i4);
            p(i + 1, jc0Var2, nr3Var, z);
        }
    }

    public static void x(int i, jc0 jc0Var, nr3 nr3Var) {
        float f = jc0Var.d0;
        hb0 hb0Var = jc0Var.I;
        int iC = hb0Var.f.c();
        hb0 hb0Var2 = jc0Var.K;
        int iC2 = hb0Var2.f.c();
        int iD = hb0Var.d() + iC;
        int iD2 = iC2 - hb0Var2.d();
        if (iC == iC2) {
            f = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int i2 = jc0Var.i();
        int i3 = (iC2 - iC) - i2;
        if (iC > iC2) {
            i3 = (iC - iC2) - i2;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = iC + i4;
        int i6 = i5 + i2;
        if (iC > iC2) {
            i5 = iC - i4;
            i6 = i5 - i2;
        }
        jc0Var.G(i5, i6);
        C(i + 1, jc0Var, nr3Var);
    }

    public static void y(int i, jc0 jc0Var, nr3 nr3Var, jc0 jc0Var2) {
        float f = jc0Var2.d0;
        hb0 hb0Var = jc0Var2.I;
        int iD = hb0Var.d() + hb0Var.f.c();
        hb0 hb0Var2 = jc0Var2.K;
        int iC = hb0Var2.f.c() - hb0Var2.d();
        if (iC >= iD) {
            int i2 = jc0Var2.i();
            if (jc0Var2.f0 != 8) {
                int i3 = jc0Var2.s;
                if (i3 == 2) {
                    i2 = (int) (f * 0.5f * (jc0Var instanceof kc0 ? jc0Var.i() : jc0Var.S.i()));
                } else if (i3 == 0) {
                    i2 = iC - iD;
                }
                i2 = Math.max(jc0Var2.x, i2);
                int i4 = jc0Var2.y;
                if (i4 > 0) {
                    i2 = Math.min(i4, i2);
                }
            }
            int i5 = iD + ((int) ((f * ((iC - iD) - i2)) + 0.5f));
            jc0Var2.G(i5, i2 + i5);
            C(i + 1, jc0Var2, nr3Var);
        }
    }

    public static final long z(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
