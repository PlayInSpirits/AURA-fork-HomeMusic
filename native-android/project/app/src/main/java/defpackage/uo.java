package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.media3.common.ParserException;
import app.homemusic.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uo {
    public static ExecutorService o;
    public static final k2 p;
    public static final String[] q = new String[0];
    public static final boolean[] r = new boolean[3];
    public static final byte[] s = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] t = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public final /* synthetic */ int n;

    static {
        byte b = 0;
        p = new k2(b, b);
    }

    public /* synthetic */ uo(int i) {
        this.n = i;
    }

    public static final float[] A(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] B(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final boolean C(MenuItem menuItem, v23 v23Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        menuItem.getClass();
        v23Var.getClass();
        r23 r23VarG = v23Var.g();
        r23VarG.getClass();
        t23 t23Var = r23VarG.o;
        t23Var.getClass();
        if (t23Var.h(menuItem.getItemId(), t23Var, null, false) instanceof j5) {
            i = R.anim.nav_default_enter_anim;
            i2 = R.anim.nav_default_exit_anim;
            i3 = R.anim.nav_default_pop_enter_anim;
            i4 = R.anim.nav_default_pop_exit_anim;
        } else {
            i = R.animator.nav_default_enter_anim;
            i2 = R.animator.nav_default_exit_anim;
            i3 = R.animator.nav_default_pop_enter_anim;
            i4 = R.animator.nav_default_pop_exit_anim;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if ((menuItem.getOrder() & 196608) == 0) {
            int i10 = t23.A;
            i5 = jz4.s(v23Var.i()).u;
            z = true;
        } else {
            i5 = -1;
            z = false;
        }
        try {
            v23Var.m(menuItem.getItemId(), null, new y23(true, true, i5, false, z, i6, i7, i8, i9));
            r23 r23VarG2 = v23Var.g();
            return r23VarG2 != null && y(menuItem.getItemId(), r23VarG2);
        } catch (IllegalArgumentException e) {
            int i11 = r23.w;
            StringBuilder sbJ = xa3.j("Ignoring onNavDestinationSelected for MenuItem ", ya4.v(v23Var.a, menuItem.getItemId()), " as it cannot be found from the current destination ");
            sbJ.append(v23Var.g());
            Log.i("NavigationUI", sbJ.toString(), e);
            return false;
        }
    }

    public static final String N(z34 z34Var) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            if (i == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(z34Var.D(0));
                sb.append("'.\n");
            }
            String strD = z34Var.D(3);
            if (!linkedHashMap.containsKey(strD)) {
                linkedHashMap.put(strD, z34Var.D(2));
            }
            i++;
        } while (z34Var.O());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            f34.n(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final float O(long j, float f, oo0 oo0Var) {
        float fC;
        long jB = bt4.b(j);
        if (ct4.a(jB, 4294967296L)) {
            if (oo0Var.J() <= 1.05d) {
                return oo0Var.a0(j);
            }
            fC = bt4.c(j) / bt4.c(oo0Var.w(f));
        } else {
            if (!ct4.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = bt4.c(j);
        }
        return fC * f;
    }

    public static final void P(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(e35.U(j)), i, i2, 33);
        }
    }

    public static final void Q(Spannable spannable, long j, oo0 oo0Var, int i, int i2) {
        long jB = bt4.b(j);
        if (ct4.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ji2.L(oo0Var.a0(j)), false), i, i2, 33);
        } else if (ct4.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(bt4.c(j)), i, i2, 33);
        }
    }

    public static final void R(Spannable spannable, vd2 vd2Var, int i, int i2) {
        if (vd2Var != null) {
            ArrayList arrayList = new ArrayList(r40.k0(vd2Var, 10));
            Iterator it = vd2Var.n.iterator();
            while (it.hasNext()) {
                arrayList.add(((ud2) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static void S(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static dd2 T(int i, l51 l51Var, be3 be3Var) throws ParserException {
        dd2 dd2VarA = dd2.a(l51Var, be3Var);
        while (true) {
            int i2 = dd2VarA.a;
            if (i2 == i) {
                return dd2VarA;
            }
            xa3.m(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = dd2VarA.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            l51Var.l((int) j2);
            dd2VarA = dd2.a(l51Var, be3Var);
        }
    }

    public static final Rect U(k02 k02Var) {
        return new Rect(k02Var.a, k02Var.b, k02Var.c, k02Var.d);
    }

    public static final void V(StringBuilder sb, Iterator it, z45 z45Var) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(z45.a(entry.getKey()));
            sb.append(" : ");
            sb.append(z45.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(z45.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(z45.a(entry2.getValue()));
            }
        }
    }

    public static float a(EdgeEffect edgeEffect, float f, float f2, oo0 oo0Var) {
        float f3 = uy0.a;
        double dG = oo0Var.g() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) uy0.a) * dG;
        float fExp = (float) (Math.exp((uy0.b / uy0.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? qe.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iL = ji2.L(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iL);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iL);
        }
        return f;
    }

    public static p50 b(p50 p50Var) {
        z95 z95Var = wr1.b;
        d34 d34Var = d34.r;
        if (xl.m(p50Var.b, 12884901888L)) {
            k24 k24Var = (k24) p50Var;
            z95 z95Var2 = k24Var.d;
            if (!l(z95Var2, z95Var)) {
                return new k24(k24Var.a, k24Var.h, z95Var, A(k((float[]) d34Var.o, z95Var2.a(), z95Var.a()), k24Var.i), k24Var.k, k24Var.n, k24Var.e, k24Var.f, k24Var.g, -1);
            }
        }
        return p50Var;
    }

    public static final void e(int i, int i2) {
        if (i < 0 || i >= i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        }
    }

    public static boolean g(l51 l51Var) {
        be3 be3Var = new be3(8);
        int i = dd2.a(l51Var, be3Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        l51Var.n(be3Var.a, 0, 4);
        be3Var.N(0);
        int iM = be3Var.m();
        if (iM == 1463899717) {
            return true;
        }
        l93.F("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static void h(kc0 kc0Var, eb2 eb2Var, jc0 jc0Var) {
        jc0Var.o = -1;
        hb0 hb0Var = jc0Var.L;
        int[] iArr = jc0Var.o0;
        hb0 hb0Var2 = jc0Var.K;
        hb0 hb0Var3 = jc0Var.I;
        hb0 hb0Var4 = jc0Var.J;
        hb0 hb0Var5 = jc0Var.H;
        jc0Var.p = -1;
        int[] iArr2 = kc0Var.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = hb0Var5.g;
            int iO = kc0Var.o() - hb0Var4.g;
            hb0Var5.i = eb2Var.k(hb0Var5);
            hb0Var4.i = eb2Var.k(hb0Var4);
            eb2Var.d(hb0Var5.i, i);
            eb2Var.d(hb0Var4.i, iO);
            jc0Var.o = 2;
            jc0Var.X = i;
            int i2 = iO - i;
            jc0Var.T = i2;
            int i3 = jc0Var.a0;
            if (i2 < i3) {
                jc0Var.T = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = hb0Var3.g;
        int i5 = kc0Var.i() - hb0Var2.g;
        hb0Var3.i = eb2Var.k(hb0Var3);
        hb0Var2.i = eb2Var.k(hb0Var2);
        eb2Var.d(hb0Var3.i, i4);
        eb2Var.d(hb0Var2.i, i5);
        if (jc0Var.Z > 0 || jc0Var.f0 == 8) {
            ai4 ai4VarK = eb2Var.k(hb0Var);
            hb0Var.i = ai4VarK;
            eb2Var.d(ai4VarK, jc0Var.Z + i4);
        }
        jc0Var.p = 2;
        jc0Var.Y = i4;
        int i6 = i5 - i4;
        jc0Var.U = i6;
        int i7 = jc0Var.b0;
        if (i6 < i7) {
            jc0Var.U = i7;
        }
    }

    public static final void i(int i, int i2) {
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        }
    }

    public static final void j(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbT = b11.t("fromIndex: ", ", toIndex: ", i, i2, ", size: ");
            sbT.append(i3);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i <= i2) {
            return;
        }
        kf2.n(xa3.e(i, i2, "fromIndex: ", " > toIndex: "));
    }

    public static final float[] k(float[] fArr, float[] fArr2, float[] fArr3) {
        B(fArr, fArr2);
        B(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrW = w(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return A(fArrW, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final boolean l(z95 z95Var, z95 z95Var2) {
        if (z95Var == z95Var2) {
            return true;
        }
        return Math.abs(z95Var.a - z95Var2.a) < 0.001f && Math.abs(z95Var.b - z95Var2.b) < 0.001f;
    }

    public static final xa0 m(p50 p50Var, p50 p50Var2) {
        if (p50Var == p50Var2) {
            return new va0(p50Var, p50Var, 1);
        }
        return (xl.m(p50Var.b, 12884901888L) && xl.m(p50Var2.b, 12884901888L)) ? new wa0((k24) p50Var, (k24) p50Var2) : new xa0(p50Var, p50Var2, 0);
    }

    public static n50 n(t41 t41Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = t41Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (t41Var.a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new n50(length, i);
    }

    public static void p(lb lbVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        k94 k94Var;
        i94 i94Var;
        if1 if1Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseN = db.n(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseN != null && (value = viewTranslationResponseN.getValue("android:text")) != null && (text = value.getText()) != null && (k94Var = (k94) lbVar.d().b((int) jKeyAt)) != null && (i94Var = k94Var.a) != null) {
                Object objG = i94Var.d.n.g(d94.l);
                if (objG == null) {
                    objG = null;
                }
                w2 w2Var = (w2) objG;
                if (w2Var != null && (if1Var = (if1) w2Var.b) != null) {
                }
            }
        }
    }

    public static final boolean q(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final BottomSheetBehavior r(View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ge0) {
            de0 de0Var = ((ge0) layoutParams).a;
            if (de0Var instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) de0Var;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return r((View) parent);
        }
        return null;
    }

    public static View s(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static synchronized Executor t() {
        try {
            if (o == null) {
                String str = f35.a;
                o = Executors.newSingleThreadExecutor(new n90(1, "ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return o;
    }

    public static final Rect u(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final Class v(i30 i30Var) {
        i30Var.getClass();
        Class clsA = i30Var.a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static final float[] w(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static String x(String str) throws UnsupportedEncodingException {
        String path;
        String str2;
        try {
            if (str != null) {
                URI uri = new URI(str);
                if ((h12.c(uri.getScheme(), "http") || h12.c(uri.getScheme(), "https")) && (path = uri.getPath()) != null) {
                    String strG0 = qm4.G0(path, '/', path);
                    if (strG0.equals("stream") || strG0.equals("stream.view")) {
                        String rawQuery = uri.getRawQuery();
                        HashMap map = new HashMap();
                        if (rawQuery != null) {
                            for (String str3 : qm4.D0(rawQuery, new char[]{'&'})) {
                                String strH0 = qm4.H0(str3, '=');
                                if (strH0.length() != 0 && !map.containsKey(strH0)) {
                                    String strDecode = URLDecoder.decode(strH0, "UTF-8");
                                    int iR0 = qm4.r0(str3, '=', 0, 6);
                                    map.put(strDecode, URLDecoder.decode(iR0 == -1 ? "" : str3.substring(iR0 + 1, str3.length()), "UTF-8"));
                                }
                            }
                        }
                        String str4 = (String) map.get("format");
                        String str5 = (String) map.get("maxBitRate");
                        if ((str4 != null && !str4.equals("raw")) || (str5 != null && !str5.equals("0"))) {
                            return null;
                        }
                        String str6 = (String) map.get("timeOffset");
                        if (str6 == null) {
                            str6 = "0";
                        }
                        if (str6.equals("0") && (str2 = (String) map.get("id")) != null && !qm4.u0(str2)) {
                            return str2;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final boolean y(int i, r23 r23Var) {
        r23Var.getClass();
        int i2 = r23.w;
        Iterator it = fa4.c0(k5.y, r23Var).iterator();
        while (it.hasNext()) {
            if (((r23) it.next()).u == i) {
                return true;
            }
        }
        return false;
    }

    public static final ij4 z(ij4 ij4Var, ij4 ij4Var2) {
        if (ij4Var == null) {
            return ij4Var2;
        }
        if (ij4Var2 == null) {
            return ij4Var;
        }
        as4 as4Var = ij4Var2.a;
        return jj4.a(ij4Var, as4Var.c(), as4Var.f(), as4Var.b(), ij4Var2.b, ij4Var2.c, ij4Var2.d, ij4Var2.e, ij4Var2.f, ij4Var2.g, ij4Var2.h, ij4Var2.i, ij4Var2.j, ij4Var2.k, ij4Var2.l, ij4Var2.m, ij4Var2.n, ij4Var2.o);
    }

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public abstract void H(wq2 wq2Var);

    public void I() {
    }

    public void J(wq2 wq2Var) {
    }

    public void K() {
    }

    public void L(wq2 wq2Var) {
    }

    public void M() {
    }

    public abstract void d(long j, gc gcVar, float f);

    public abstract Object o();

    public String toString() {
        switch (this.n) {
            case 10:
                return o().toString();
            default:
                return super.toString();
        }
    }
}
