package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.KotlinNullPointerException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu {
    public static final int[] n = {1, 2, 3, 6};
    public static final int[] o = {48000, 44100, 32000};
    public static final int[] p = {24000, 22050, 16000};
    public static final int[] q = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] r = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] s = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final ow1 t = new ow1(false);
    public static final StackTraceElement[] u = new StackTraceElement[0];
    public static final char[] v = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static boolean w;
    public static Method x;
    public static boolean y;
    public static Field z;

    public static int A(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int B(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static final void C(g94 g94Var) {
        j51.O(g94Var).E();
    }

    public static boolean D(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static final boolean E(String str, int i, int i2) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && xe5.m(str.charAt(i + 1)) != -1 && xe5.m(str.charAt(i3)) != -1;
    }

    public static final sk4 F(we0 we0Var, ne0 ne0Var, ze0 ze0Var, wf1 wf1Var) {
        ne0 ne0VarT = jz4.t(we0Var.e(), ne0Var, true);
        rm0 rm0Var = rr0.a;
        if (ne0VarT != rm0Var && ne0VarT.K(fz0.R) == null) {
            ne0VarT = ne0VarT.J(rm0Var);
        }
        ze0Var.getClass();
        sk4 a92Var = ze0Var == ze0.o ? new a92(ne0VarT, wf1Var) : new sk4(ne0VarT, true);
        a92Var.l0(ze0Var, a92Var, wf1Var);
        return a92Var;
    }

    public static /* synthetic */ sk4 G(we0 we0Var, ne0 ne0Var, ze0 ze0Var, wf1 wf1Var, int i) {
        if ((i & 1) != 0) {
            ne0Var = q01.n;
        }
        if ((i & 2) != 0) {
            ze0Var = ze0.n;
        }
        return F(we0Var, ne0Var, ze0Var, wf1Var);
    }

    public static String J(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                tv tvVar = new tv();
                tvVar.e0(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM = xe5.m(str.charAt(iCharCount + 1));
                        int iM2 = xe5.m(str.charAt(i4));
                        if (iM == -1 || iM2 == -1) {
                            tvVar.f0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            tvVar.Y((iM << 4) + iM2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        tvVar.Y(32);
                        iCharCount++;
                    } else {
                        tvVar.f0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return tvVar.M();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static final void K(View view, qi3 qi3Var) {
        ImageView imageView;
        od4 od4Var;
        if (view == null || (imageView = (ImageView) view.findViewById(R.id.exo_shuffle)) == null) {
            return;
        }
        Object tag = imageView.getTag(R.id.exo_shuffle);
        Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
        WeakReference weakReference = a.a;
        boolean z2 = false;
        boolean z3 = qi3Var != null && qi3Var.D0();
        if ((a.b != null || a.d) && !u52.c().a) {
            z2 = true;
        }
        od4.n.getClass();
        od4 od4Var2 = od4.q;
        if (z2) {
            od4Var = od4Var2;
        } else {
            od4Var = z3 ? od4.p : od4.o;
        }
        if (od4Var == od4Var2) {
            if (drawable == null || imageView.getDrawable() != drawable) {
                Drawable drawableR = zz1.r(imageView.getContext(), R.drawable.ic_shuffle_smart);
                imageView.setImageDrawable(drawableR);
                imageView.setTag(R.id.exo_shuffle, drawableR);
                imageView.setContentDescription(imageView.getContext().getString(R.string.homemusic_smart_shuffle_on));
                return;
            }
            return;
        }
        if (drawable != null) {
            imageView.setTag(R.id.exo_shuffle, null);
            ViewParent parent = imageView.getParent();
            while (parent != null && !(parent instanceof PlayerControlView)) {
                parent = parent.getParent();
            }
            PlayerControlView playerControlView = parent instanceof PlayerControlView ? (PlayerControlView) parent : null;
            if (playerControlView != null) {
                playerControlView.setShowShuffleButton(playerControlView.getShowShuffleButton());
            }
        }
    }

    public static final Object L(ne0 ne0Var, wf1 wf1Var) throws Throwable {
        g21 g21VarA;
        ne0 ne0VarT;
        Thread threadCurrentThread = Thread.currentThread();
        me0 me0Var = fz0.R;
        pe0 pe0Var = (pe0) ne0Var.K(me0Var);
        q01 q01Var = q01.n;
        if (pe0Var == null) {
            g21VarA = it4.a();
            ne0VarT = jz4.t(q01Var, ne0Var.J(g21VarA), true);
            rm0 rm0Var = rr0.a;
            if (ne0VarT != rm0Var && ne0VarT.K(me0Var) == null) {
                ne0VarT = ne0VarT.J(rm0Var);
            }
        } else {
            g21VarA = (g21) it4.a.get();
            ne0VarT = jz4.t(q01Var, ne0Var, true);
            rm0 rm0Var2 = rr0.a;
            if (ne0VarT != rm0Var2 && ne0VarT.K(me0Var) == null) {
                ne0VarT = ne0VarT.J(rm0Var2);
            }
        }
        ht htVar = new ht(ne0VarT, threadCurrentThread, g21VarA);
        htVar.l0(ze0.n, htVar, wf1Var);
        g21 g21Var = htVar.t;
        if (g21Var != null) {
            int i = g21.s;
            g21Var.c0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jD0 = g21Var != null ? g21Var.d0() : Long.MAX_VALUE;
                if (!(htVar.H() instanceof mx1)) {
                    if (g21Var != null) {
                        int i2 = g21.s;
                        g21Var.a0(false);
                    }
                    Object objM = zz1.M(htVar.H());
                    a70 a70Var = objM instanceof a70 ? (a70) objM : null;
                    if (a70Var == null) {
                        return objM;
                    }
                    throw a70Var.a;
                }
                LockSupport.parkNanos(htVar, jD0);
            } catch (Throwable th) {
                if (g21Var != null) {
                    int i3 = g21.s;
                    g21Var.a0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        htVar.o(interruptedException);
        throw interruptedException;
    }

    public static void M(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(D(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    public static final lu2 N(k03 k03Var, if1 if1Var) {
        lu2 lu2Var;
        ad2 ad2Var;
        k03Var.getClass();
        jx3 jx3Var = new jx3();
        Object obj = k03Var.e;
        Object obj2 = ad2.k;
        if (obj == obj2 || (ad2Var = (ad2) if1Var.invoke(k03Var.d())) == null || ad2Var.e == obj2) {
            lu2Var = new lu2();
        } else {
            lu2Var = new lu2(ad2Var.d());
            lu2Var.l = new i44();
        }
        lu2Var.l(k03Var, new ht1(new dd0(if1Var, jx3Var, lu2Var, 6), 2));
        return lu2Var;
    }

    public static final Bitmap.Config O(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i != 3) {
            return (i2 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final Object P(ne0 ne0Var, wf1 wf1Var, wd0 wd0Var) throws Throwable {
        ne0 context = wd0Var.getContext();
        ne0 ne0VarJ = !((Boolean) ne0Var.s(new d60(10, (byte) 0), Boolean.FALSE)).booleanValue() ? context.J(ne0Var) : jz4.t(context, ne0Var, false);
        gb.u(ne0VarJ);
        if (ne0VarJ == context) {
            e64 e64Var = new e64(wd0Var, ne0VarJ);
            return h12.O(e64Var, e64Var, wf1Var);
        }
        fz0 fz0Var = fz0.R;
        if (h12.c(ne0VarJ.K(fz0Var), context.K(fz0Var))) {
            f15 f15Var = new f15(ne0VarJ, wd0Var);
            ne0 ne0Var2 = f15Var.r;
            Object objR = te5.R(ne0Var2, null);
            try {
                return h12.O(f15Var, f15Var, wf1Var);
            } finally {
                te5.K(ne0Var2, objR);
            }
        }
        nr0 nr0Var = new nr0(wd0Var, ne0VarJ);
        try {
            uc5.T(ya4.x(ya4.i(nr0Var, nr0Var, wf1Var)), j15.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = nr0.t;
            do {
                int i = atomicIntegerFieldUpdater.get(nr0Var);
                if (i != 0) {
                    if (i != 2) {
                        kf2.o("Already suspended");
                        return null;
                    }
                    Object objM = zz1.M(nr0Var.H());
                    if (objM instanceof a70) {
                        throw ((a70) objM).a;
                    }
                    return objM;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(nr0Var, 0, 1));
            return xe0.n;
        } catch (Throwable th) {
            nr0Var.resumeWith(new s14(th));
            throw th;
        }
    }

    public static void Q(int i, int i2) {
        String strS;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strS = hw.S("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    kf2.n(f34.f(i2, "negative size: "));
                    return;
                }
                strS = hw.S("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static void R(int i, int i2, int i3) {
        String strS;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strS = S("start index", i, i3);
            } else {
                strS = (i2 < 0 || i2 > i3) ? S("end index", i2, i3) : hw.S("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static String S(String str, int i, int i2) {
        if (i < 0) {
            return hw.S("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hw.S("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        kf2.n(f34.f(i2, "negative size: "));
        return null;
    }

    public static final boolean b(zs4 zs4Var) {
        zg3 zg3Var;
        eh3 eh3Var = zs4Var.c;
        h01 h01Var = (eh3Var == null || (zg3Var = eh3Var.a) == null) ? null : new h01(zg3Var.b);
        boolean z2 = false;
        if (h01Var != null && h01Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static final fa c(b0 b0Var, ea2 ea2Var) {
        if (ea2Var.h.compareTo(r92.n) <= 0) {
            nz2.p("Cannot configure ", b0Var, " to disposeComposition at Lifecycle ON_DESTROY: ", ea2Var, "is already destroyed");
            return null;
        }
        pd1 pd1Var = new pd1(3, b0Var);
        ea2Var.a(pd1Var);
        return new fa(17, ea2Var, pd1Var);
    }

    public static final Object e(ic2 ic2Var, ep4 ep4Var) throws Throwable {
        try {
            if (ic2Var.isDone()) {
                return g2.e(ic2Var);
            }
            cz czVar = new cz(1, ya4.x(ep4Var));
            ic2Var.f(new nu4(ic2Var, czVar, 1), hq0.n);
            czVar.w(new ir0(3, ic2Var));
            return czVar.q();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            h12.M(kotlinNullPointerException, h12.class.getName());
            throw kotlinNullPointerException;
        }
    }

    public static String g(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z2 = (i3 & 8) == 0;
        boolean z3 = (i3 & 16) == 0;
        boolean z4 = (i3 & 32) == 0;
        boolean z5 = (i3 & 64) == 0;
        str.getClass();
        return i(str, i4, i5, str2, z2, z3, z4, z5, 128);
    }

    public static String i(String str, int i, int i2, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z6 = (i3 & 8) != 0 ? false : z2;
        boolean z7 = (i3 & 16) != 0 ? false : z3;
        boolean z8 = (i3 & 64) == 0 ? z5 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || qm4.n0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z7 && !E(str, iCharCount, length)))) || (iCodePointAt == 43 && z4)))) {
                tv tvVar = new tv();
                tvVar.e0(str, i4, iCharCount);
                tv tvVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            tvVar.d0("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            tvVar.d0(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z8) || qm4.n0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z7 && !E(str, iCharCount, length)))))) {
                            if (tvVar2 == null) {
                                tvVar2 = new tv();
                            }
                            tvVar2.f0(iCodePointAt2);
                            while (!tvVar2.l()) {
                                byte b = tvVar2.readByte();
                                tvVar.Y(37);
                                char[] cArr = v;
                                tvVar.Y(cArr[((b & 255) >> 4) & 15]);
                                tvVar.Y(cArr[b & 15]);
                            }
                        } else {
                            tvVar.f0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return tvVar.M();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static Object j(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(fu.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void k(ci0 ci0Var) {
        if (ci0Var != null) {
            try {
                ci0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int l(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static StaticLayout m(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            dz1.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            dz1.a("invalid end value");
        }
        if (i3 < 0) {
            dz1.a("invalid maxLines value");
        }
        if (i < 0) {
            dz1.a("invalid width value");
        }
        if (i4 < 0) {
            dz1.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z2);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            builderObtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(n3.c().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static o53 n(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                cx cxVarF = cx.f();
                String str = o53.b;
                String str2 = o53.b;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (cxVarF.a <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        for (int i2 : iArr2) {
            builder.addTransportType(i2);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new o53(networkRequestBuild);
    }

    public static ContextThemeWrapper o(Context context, boolean z2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, B(context, !z2 ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return B(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, z(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static final void p(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        CharSequence text = textView.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        CharSequence charSequenceA = a.a(qm4.z0(string, "✨ "), str);
        String string2 = charSequenceA != null ? charSequenceA.toString() : null;
        String str2 = string2 != null ? string2 : "";
        CharSequence text2 = textView.getText();
        if (h12.c(text2 != null ? text2.toString() : null, str2)) {
            return;
        }
        textView.setText(str2);
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = j65.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = i65.d;
            i65 i65Var = (i65) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (i65Var == null) {
                i65Var = new i65();
                i65Var.a = null;
                i65Var.b = null;
                i65Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, i65Var);
            }
            WeakReference weakReference2 = i65Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                i65Var.c = new WeakReference(keyEvent);
                if (i65Var.b == null) {
                    i65Var.b = new SparseArray();
                }
                SparseArray sparseArray = i65Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    kf2.k();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean r(h42 h42Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (h42Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return h42Var.c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!w) {
                            try {
                                x = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            w = true;
                        }
                        Method method = x;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (j65.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!y) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        z = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    y = true;
                }
                Field field = z;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (j65.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && j65.c(view, keyEvent)) || h42Var.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final wv3 s(cx2 cx2Var, boolean z2, boolean z3) {
        if (!cx2Var.n.A) {
            return wv3.e;
        }
        if (z2) {
            return j51.M(cx2Var, 8).X0();
        }
        f63 f63VarM = j51.M(cx2Var, 8);
        return wr1.n(f63VarM).C(f63VarM, z3);
    }

    public static int t(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = o[i];
        if (i4 == 44100) {
            return ((i2 % 2) + s[i3]) * 2;
        }
        int i5 = r[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static int u(Context context, int i) {
        return v50.d(-1, A(context, i, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float v(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Set w() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static void x(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    public static Drawable y(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawableR = zz1.r(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        if (D(context)) {
            drawableR.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableR;
    }

    public static int z(Context context) {
        if (D(context)) {
            return u(context, 0) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel;
        }
        return u(context, 0) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    public abstract View H(int i);

    public abstract boolean I();
}
