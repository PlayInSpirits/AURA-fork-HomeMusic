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
    public static final k2 p = null;
    public static final String[] q = null;
    public static final boolean[] r = null;
    public static final byte[] s = null;
    public static final byte[] t = null;
    public final /* synthetic */ int n;

    static {
        byte r1 = 0;
        p = new k2(r1, r1);
        q = new String[0];
        r = new boolean[3];
        s = new byte[]{0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
        t = new byte[]{0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    }

    public /* synthetic */ uo(int r1) {
        this.n = r1;
    }

    public static final float[] A(float[] r21, float[] r22) {
        float[] r3 = new float[9];
        if (r21.length >= 9) goto L6;
    L7:
        return r3;
    L6:
        if (r22.length < 9) goto L7;
        float r4 = r21[0] * r22[0];
        float r6 = r21[3];
        float r8 = r22[1];
        float r10 = r21[6];
        float r12 = r22[2];
        float r13 = r10 * r12;
        r3[0] = r13 + ((r6 * r8) + r4);
        float r9 = r21[1];
        float r14 = r22[0];
        float r15 = r21[4];
        float r11 = r8 * r15;
        float r16 = r21[7];
        float r17 = r16 * r12;
        r3[1] = r17 + (r11 + (r9 * r14));
        float r18 = r21[2] * r14;
        float r19 = r21[5];
        float r110 = (r22[1] * r19) + r18;
        float r111 = r21[8];
        r3[2] = (r12 * r111) + r110;
        float r2 = r21[0];
        float r112 = r22[3] * r2;
        float r113 = r22[4];
        float r7 = (r6 * r113) + r112;
        float r114 = r22[5];
        r3[3] = (r10 * r114) + r7;
        float r20 = r21[1];
        float r23 = r22[3];
        float r115 = r15 * r113;
        float r116 = r16 * r114;
        r3[4] = r116 + (r115 + (r20 * r23));
        float r117 = r21[2];
        float r118 = r19 * r22[4];
        float r119 = r114 * r111;
        r3[5] = r119 + (r118 + (r23 * r117));
        float r5 = r2 * r22[6];
        float r24 = r21[3];
        float r25 = r22[7];
        float r26 = (r24 * r25) + r5;
        float r27 = r22[8];
        r3[6] = (r10 * r27) + r26;
        float r28 = r22[6];
        float r29 = r21[4] * r25;
        float r120 = r16 * r27;
        r3[7] = r120 + (r29 + (r20 * r28));
        float r0 = r21[5] * r22[7];
        float r121 = r111 * r27;
        r3[8] = r121 + (r0 + (r117 * r28));
        return r3;
    }

    public static final float[] B(float[] r8, float[] r9) {
        if (r8.length >= 9) goto L6;
    L7:
        return r9;
    L6:
        if (r9.length < 3) goto L7;
        float r2 = r9[0];
        float r4 = r9[1];
        float r6 = r9[2];
        float r7 = r8[0] * r2;
        float r1 = (r8[3] * r4) + r7;
        r9[0] = (r8[6] * r6) + r1;
        float r0 = r8[1] * r2;
        float r3 = (r8[4] * r4) + r0;
        r9[1] = (r8[7] * r6) + r3;
        float r5 = r8[2] * r2;
        float r10 = (r8[5] * r4) + r5;
        r9[2] = (r8[8] * r6) + r10;
        return r9;
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
    public static final boolean C(MenuItem r13, v23 r14) {
        r13.getClass();
        r14.getClass();
        r23 r0 = r14.g();
        r0.getClass();
        t23 r1 = r0.o;
        r1.getClass();
        if ((r1.h(r13.getItemId(), r1, null, false) instanceof j5) == false) goto L6;
        int r2 = R.anim.nav_default_enter_anim;
        int r3 = R.anim.nav_default_exit_anim;
        int r4 = R.anim.nav_default_pop_enter_anim;
        int r5 = R.anim.nav_default_pop_exit_anim;
    L5:
        int r9 = r2;
        int r10 = r3;
        int r11 = r4;
        int r12 = r5;
        if ((r13.getOrder() & 196608) != 0) goto L11;
        int r6 = t23.A;
        int r7 = jz4.s(r14.i()).u;
        boolean r8 = true;
    L23:
        r14.m(r13.getItemId(), null, new y23(true, true, r7, false, r8, r9, r10, r11, r12));     // Catch: IllegalArgumentException -> L18
        r23 r15 = r14.g();     // Catch: IllegalArgumentException -> L18
        if (r15 == null) goto L20;
        if (y(r13.getItemId(), r15) != true) goto L20;
        return true;
    L20:
        return false;
    L18:
        e = move-exception;
        int r16 = r23.w;
        StringBuilder r17 = xa3.j("Ignoring onNavDestinationSelected for MenuItem ", ya4.v(r14.a, r13.getItemId()), " as it cannot be found from the current destination ");
        r17.append(r14.g());
        Log.i("NavigationUI", r17.toString(), e);
        return false;
    L11:
        r7 = -1;
        r8 = false;
        goto L23
    L6:
        r2 = R.animator.nav_default_enter_anim;
        r3 = R.animator.nav_default_exit_anim;
        r4 = R.animator.nav_default_pop_enter_anim;
        r5 = R.animator.nav_default_pop_exit_anim;
        goto L5
    }

    public static final String N(z34 r6) {
        StringBuilder r0 = new StringBuilder();
        LinkedHashMap r1 = new LinkedHashMap();
        int r3 = 0;
    L3:
        if (r3 != 0) goto L5;
        r0.append("Foreign key violation(s) detected in '");
        r0.append(r6.D(0));
        r0.append("'.\n");
    L5:
        String r4 = r6.D(3);
        if (r1.containsKey(r4) == true) goto L8;
        r1.put(r4, r6.D(2));
    L8:
        r3 = r3 + 1;
        if (r6.O() == true) goto L3;
        r0.append("Number of different violations discovered: ");
        r0.append(r1.keySet().size());
        r0.append("\nNumber of rows in violation: ");
        r0.append(r3);
        r0.append("\nViolation(s) detected in the following constraint(s):\n");
        Iterator r7 = r1.entrySet().iterator();
    L12:
        if (r7.hasNext() == false) goto L15;
        Map.Entry r2 = (Map.Entry) r7.next();
        f34.n(r0, "\tParent Table = ", (String) r2.getValue(), ", Foreign Key Constraint Index = ", (String) r2.getKey());
        r0.append("\n");
        goto L12
    L15:
        return r0.toString();
    }

    public static final float O(long r4, float r6, oo0 r7) {
        long r0 = bt4.b(r4);
        if (ct4.a(r0, 4294967296L) == false) goto L12;
        if (r7.J() <= 1.05d) goto L10;
        float r5 = bt4.c(r4) / bt4.c(r7.w(r6));
    L8:
        return r5 * r6;
    L10:
        return r7.a0(r4);
    L12:
        if (ct4.a(r0, 8589934592L) == false) goto L14;
        r5 = bt4.c(r4);
        goto L8
    L14:
        return Float.NaN;
    }

    public static final void P(Spannable r2, long r3, int r5, int r6) {
        if (r3 == 16) goto L6;
        r2.setSpan(new ForegroundColorSpan(e35.U(r3)), r5, r6, 33);
        return;
    }

    public static final void Q(Spannable r6, long r7, oo0 r9, int r10, int r11) {
        long r0 = bt4.b(r7);
        if (ct4.a(r0, 4294967296L) == false) goto L7;
        r6.setSpan(new AbsoluteSizeSpan(ji2.L(r9.a0(r7)), false), r10, r11, 33);
        return;
    L7:
        if (ct4.a(r0, 8589934592L) == false) goto L10;
        r6.setSpan(new RelativeSizeSpan(bt4.c(r7)), r10, r11, 33);
        return;
    }

    public static final void R(Spannable r2, vd2 r3, int r4, int r5) {
        if (r3 == null) goto L10;
        ArrayList r0 = new ArrayList(r40.k0(r3, 10));
        Iterator r6 = r3.n.iterator();
    L5:
        if (r6.hasNext() == false) goto L7;
        r0.add(((ud2) r6.next()).a);
        goto L5
    L7:
        Locale[] r7 = (Locale[]) r0.toArray(new Locale[0]);
        r2.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(r7, r7.length))), r4, r5, 33);
        return;
    }

    public static void S(EditorInfo r2, CharSequence r3, int r4, int r5) {
        if (r2.extras != null) goto L5;
        r2.extras = new Bundle();
    L5:
        if (r3 == null) goto L7;
        SpannableStringBuilder r0 = new SpannableStringBuilder(r3);
    L8:
        r2.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", r0);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", r4);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", r5);
        return;
    L7:
        r0 = null;
        goto L8
    }

    public static dd2 T(int r10, l51 r11, be3 r12) {
        dd2 r0 = dd2.a(r11, r12);
    L3:
        int r1 = r0.a;
        if (r1 == r10) goto L13;
        xa3.m(r1, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
        long r2 = r0.b;
        long r4 = 8 + r2;
        if ((r2 % 2) == 0) goto L9;
        r4 = 9 + r2;
    L9:
        if (r4 > 2147483647L) goto L12;
        r11.l((int) r4);
        r0 = dd2.a(r11, r12);
        goto L3
    L12:
        throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + r1);
    L13:
        return r0;
    }

    public static final Rect U(k02 r4) {
        return new Rect(r4.a, r4.b, r4.c, r4.d);
    }

    public static final void V(StringBuilder r2, Iterator r3, z45 r4) {
        if (r3.hasNext() == false) goto L8;
        Map.Entry r5 = (Map.Entry) r3.next();
        r2.append(z45.a(r5.getKey()));
        r2.append(" : ");
        r2.append(z45.a(r5.getValue()));
    L6:
        if (r3.hasNext() == false) goto L10;
        r2.append(",\n  ");
        Map.Entry r6 = (Map.Entry) r3.next();
        r2.append(z45.a(r6.getKey()));
        r2.append(" : ");
        r2.append(z45.a(r6.getValue()));
        goto L6
    L10:
        return;
    }

    public static float a(EdgeEffect r8, float r9, float r10, oo0 r11) {
        float r0 = uy0.a;
        double r1 = ((r11.g() * 386.0878f) * 160.0f) * 0.84f;
        double r2 = Math.abs(r9) * 0.35f;
        double r4 = ((double) uy0.a) * r1;
        float r12 = (float) (Math.exp((uy0.b / uy0.c) * Math.log(r2 / r4)) * r4);
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 31) goto L5;
        float r5 = qe.b(r8);
    L7:
        if (r12 > (r5 * r10)) goto L16;
        int r13 = ji2.L(r9);
        if (r3 < 31) goto L13;
        r8.onAbsorb(r13);
        return r9;
    L13:
        if (r8.isFinished() == false) goto L15;
        r8.onAbsorb(r13);
    L15:
        return r9;
    L16:
        return 0.0f;
    L5:
        r5 = 0.0f;
        goto L7
    }

    public static p50 b(p50 r11) {
        z95 r3 = wr1.b;
        d34 r0 = d34.r;
        if (xl.m(r11.b, 12884901888L) == false) goto L9;
        k24 r1 = (k24) r11;
        z95 r2 = r1.d;
        if (l(r2, r3) == true) goto L9;
        float[] r12 = r3.a();
        float[] r4 = A(k((float[]) r0.o, r2.a(), r12), r1.i);
        return new k24(r1.a, r1.h, r3, r4, r1.k, r1.n, r1.e, r1.f, r1.g, -1);
    L9:
        return r11;
    }

    public static final void e(int r2, int r3) {
        if (r2 < 0) goto L5;
        if (r2 >= r3) goto L5;
        return;
    L5:
        kf2.h(xa3.e(r2, r3, "index: ", ", size: "));
    }

    public static boolean g(l51 r4) {
        be3 r0 = new be3(8);
        int r1 = dd2.a(r4, r0).a;
        if (r1 != 1380533830) goto L5;
    L7:
        r4.n(r0.a, 0, 4);
        r0.N(0);
        int r5 = r0.m();
        if (r5 == 1463899717) goto L11;
        l93.F("WavHeaderReader", "Unsupported form type: " + r5);
        return false;
    L11:
        return true;
    L5:
        if (r1 == 1380333108) goto L7;
        return false;
    }

    public static void h(kc0 r12, eb2 r13, jc0 r14) {
        r14.o = -1;
        hb0 r1 = r14.L;
        int[] r2 = r14.o0;
        hb0 r3 = r14.K;
        hb0 r4 = r14.I;
        hb0 r5 = r14.J;
        hb0 r6 = r14.H;
        r14.p = -1;
        int[] r0 = r12.o0;
        if (r0[0] == 2) goto L10;
        if (r2[0] != 4) goto L10;
        int r7 = r6.g;
        int r8 = r12.o() - r5.g;
        r6.i = r13.k(r6);
        r5.i = r13.k(r5);
        r13.d(r6.i, r7);
        r13.d(r5.i, r8);
        r14.o = 2;
        r14.X = r7;
        int r9 = r8 - r7;
        r14.T = r9;
        int r10 = r14.a0;
        if (r9 >= r10) goto L10;
        r14.T = r10;
    L10:
        if (r0[1] != 2) goto L12;
        return;
    L12:
        if (r2[1] != 4) goto L23;
        int r11 = r4.g;
        int r15 = r12.i() - r3.g;
        r4.i = r13.k(r4);
        r3.i = r13.k(r3);
        r13.d(r4.i, r11);
        r13.d(r3.i, r15);
        if (r14.Z <= 0) goto L16;
    L17:
        ai4 r16 = r13.k(r1);
        r1.i = r16;
        r13.d(r16, r14.Z + r11);
    L18:
        r14.p = 2;
        r14.Y = r11;
        int r17 = r15 - r11;
        r14.U = r17;
        int r18 = r14.b0;
        if (r17 >= r18) goto L24;
        r14.U = r18;
        return;
    L24:
        return;
    L16:
        if (r14.f0 != 8) goto L18;
    }

    public static final void i(int r2, int r3) {
        if (r2 < 0) goto L5;
        if (r2 > r3) goto L5;
        return;
    L5:
        kf2.h(xa3.e(r2, r3, "index: ", ", size: "));
    }

    public static final void j(int r4, int r5, int r6) {
        if (r4 < 0) goto L9;
        if (r5 > r6) goto L9;
        if (r4 > r5) goto L7;
        return;
    L7:
        kf2.n(xa3.e(r4, r5, "fromIndex: ", " > toIndex: "));
        return;
    L9:
        StringBuilder r7 = b11.t("fromIndex: ", ", toIndex: ", r4, r5, ", size: ");
        r7.append(r6);
        throw new IndexOutOfBoundsException(r7.toString());
    }

    public static final float[] k(float[] r20, float[] r21, float[] r22) {
        B(r20, r21);
        B(r20, r22);
        float[] r8 = {r22[0] / r21[0], r22[1] / r21[1], r22[2] / r21[2]};
        float[] r1 = w(r20);
        float r3 = r8[0];
        float r5 = r20[0] * r3;
        float r9 = r8[1];
        float r10 = r20[1] * r9;
        float r11 = r8[2];
        return A(r1, new float[]{r5, r10, r20[2] * r11, r20[3] * r3, r20[4] * r9, r20[5] * r11, r3 * r20[6], r9 * r20[7], r11 * r20[8]});
    }

    public static final boolean l(z95 r3, z95 r4) {
        if (r3 != r4) goto L6;
        return true;
    L6:
        if (Math.abs(r3.a - r4.a) < 0.001f) goto L8;
        return false;
    L8:
        if (Math.abs(r3.b - r4.b) >= 0.001f) goto L12;
        return true;
    L12:
        return false;
    }

    public static final xa0 m(p50 r4, p50 r5) {
        if (r4 != r5) goto L6;
        return new va0(r4, r4, 1);
    L6:
        if (xl.m(r4.b, 12884901888L) == false) goto L12;
        if (xl.m(r5.b, 12884901888L) == false) goto L12;
        return new wa0((k24) r4, (k24) r5);
    L12:
        return new xa0(r4, r5, 0);
    }

    public static n50 n(t41 r6) {
        long r0 = SystemClock.elapsedRealtime();
        int r2 = r6.length();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L9;
        if (r6.a(r3, r0) == false) goto L7;
        r4 = r4 + 1;
    L7:
        r3 = r3 + 1;
        goto L3
    L9:
        return new n50(r2, r4);
    }

    public static void p(lb r6, LongSparseArray r7) {
        int r0 = r7.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L23;
        long r2 = r7.keyAt(r1);
        ViewTranslationResponse r4 = db.n(r7.get(r2));
        if (r4 == null) goto L22;
        TranslationResponseValue r5 = db.k(r4);
        if (r5 == null) goto L22;
        CharSequence r8 = db.o(r5);
        if (r8 == null) goto L22;
        k94 r3 = (k94) r6.d().b((int) r2);
        if (r3 == null) goto L22;
        i94 r9 = r3.a;
        if (r9 == null) goto L22;
        e94 r10 = r9.d;
        p94 r11 = d94.l;
        Object r12 = r10.n.g(r11);
        if (r12 != null) goto L17;
        r12 = null;
    L17:
        w2 r13 = (w2) r12;
        if (r13 == null) goto L22;
        if1 r14 = (if1) r13.b;
        if (r14 == null) goto L22;
        Boolean r15 = (Boolean) r14.invoke(new he(r8.toString()));
    L22:
        r1 = r1 + 1;
        goto L3
    }

    public static final boolean q(int r0, int r1) {
        if ((r0 & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }

    public static final BottomSheetBehavior r(View r2) {
        r2.getClass();
        ViewGroup.LayoutParams r0 = r2.getLayoutParams();
        if ((r0 instanceof ge0) == true) goto L8;
        Object r3 = r2.getParent();
        if ((r3 instanceof View) == true) goto L7;
        return null;
    L7:
        return r((View) r3);
    L8:
        de0 r4 = ((ge0) r0).a;
        if ((r4 instanceof BottomSheetBehavior) == true) goto L13;
        return null;
    L13:
        return (BottomSheetBehavior) r4;
    }

    public static View s(View r4, int r5) {
        if ((r4 instanceof ViewGroup) == true) goto L5;
        return null;
    L5:
        ViewGroup r6 = (ViewGroup) r4;
        int r0 = r6.getChildCount();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L11;
        View r3 = r6.getChildAt(r2).findViewById(r5);
        if (r3 != null) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r3;
    L11:
        return null;
    }

    public static synchronized Executor t() {
        monitor-enter(uo.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (o != null) goto L9;
        String r2 = f35.a;     // Catch: Throwable -> L7
        o = Executors.newSingleThreadExecutor(new n90(1, "ExoPlayer:BackgroundExecutor"));     // Catch: Throwable -> L7
    L9:
        ExecutorService r1 = o;     // Catch: Throwable -> L7
        monitor-exit(uo.class);
        return r1;
    }

    public static final Rect u(TextPaint r16, CharSequence r17, int r18, int r19) {
        int r2 = r18;
        if ((r17 instanceof Spanned) == false) goto L20;
        Spanned r4 = (Spanned) r17;
        if (r4.nextSpanTransition(r2 - 1, r19, MetricAffectingSpan.class) == r19) goto L20;
        Rect r6 = new Rect();
        Rect r8 = new Rect();
        TextPaint r9 = new TextPaint();
    L7:
        if (r2 >= r19) goto L19;
        int r10 = r4.nextSpanTransition(r2, r19, MetricAffectingSpan.class);
        MetricAffectingSpan[] r11 = (MetricAffectingSpan[]) r4.getSpans(r2, r10, MetricAffectingSpan.class);
        r9.set(r16);
        int r12 = r11.length;
        int r13 = 0;
    L9:
        if (r13 >= r12) goto L15;
        MetricAffectingSpan r14 = r11[r13];
        if (r4.getSpanStart(r14) == r4.getSpanEnd(r14)) goto L13;
        r14.updateMeasureState(r9);
    L13:
        r13 = r13 + 1;
        goto L9
    L15:
        if (Build.VERSION.SDK_INT < 29) goto L17;
        ek2.o(r9, r17, r2, r10, r8);
    L18:
        r6.right = r8.width() + r6.right;
        r6.top = Math.min(r6.top, r8.top);
        r6.bottom = Math.max(r6.bottom, r8.bottom);
        r2 = r10;
        goto L7
    L17:
        r9.getTextBounds(r17.toString(), r2, r10, r8);
        goto L18
    L19:
        return r6;
    L20:
        Rect r5 = new Rect();
        if (Build.VERSION.SDK_INT < 29) goto L24;
        ek2.o(r16, r17, r2, r19, r5);
        return r5;
    L24:
        r16.getTextBounds(r17.toString(), r2, r19, r5);
        return r5;
    }

    public static final Class v(i30 r2) {
        r2.getClass();
        Class r3 = r2.a();
        if (r3.isPrimitive() == true) goto L5;
        return r3;
    L5:
        String r0 = r3.getName();
        switch(r0.hashCode()) {
            case -1325958191: goto L41;
            case 104431: goto L37;
            case 3039496: goto L33;
            case 3052374: goto L29;
            case 3327612: goto L25;
            case 3625364: goto L21;
            case 64711720: goto L17;
            case 97526364: goto L13;
            case 109413500: goto L9;
            default: goto L53;
        };
    L53:
        return r3;
    L9:
        if (r0.equals("short") == false) goto L54;
        return Short.class;
    L54:
        return r3;
    L13:
        if (r0.equals("float") == false) goto L55;
        return Float.class;
    L55:
        return r3;
    L17:
        if (r0.equals("boolean") == false) goto L56;
        return Boolean.class;
    L56:
        return r3;
    L21:
        if (r0.equals("void") == false) goto L57;
        return Void.class;
    L57:
        return r3;
    L25:
        if (r0.equals("long") == false) goto L58;
        return Long.class;
    L58:
        return r3;
    L29:
        if (r0.equals("char") == false) goto L59;
        return Character.class;
    L59:
        return r3;
    L33:
        if (r0.equals("byte") == false) goto L60;
        return Byte.class;
    L60:
        return r3;
    L37:
        if (r0.equals("int") == false) goto L61;
        return Integer.class;
    L61:
        return r3;
    L41:
        if (r0.equals("double") == false) goto L62;
        return Double.class;
    L62:
        return r3;
    }

    public static final float[] w(float[] r24) {
        float r2 = r24[0];
        float r4 = r24[3];
        float r6 = r24[6];
        float r8 = r24[1];
        float r10 = r24[4];
        float r12 = r24[7];
        float r14 = r24[2];
        float r16 = r24[5];
        float r18 = r24[8];
        float r19 = (r10 * r18) - (r12 * r16);
        float r20 = (r12 * r14) - (r8 * r18);
        float r21 = (r8 * r16) - (r10 * r14);
        float r23 = r4 * r20;
        float r25 = r23 + (r2 * r19);
        float r22 = (r6 * r21) + r25;
        float[] r0 = new float[r24.length];
        r0[0] = r19 / r22;
        r0[1] = r20 / r22;
        r0[2] = r21 / r22;
        r0[3] = ((r6 * r16) - (r4 * r18)) / r22;
        r0[4] = ((r18 * r2) - (r6 * r14)) / r22;
        r0[5] = ((r14 * r4) - (r16 * r2)) / r22;
        r0[6] = ((r4 * r12) - (r6 * r10)) / r22;
        r0[7] = ((r6 * r8) - (r12 * r2)) / r22;
        r0[8] = ((r2 * r10) - (r4 * r8)) / r22;
        return r0;
    }

    public static String x(String r8) {
        if (r8 == null) goto L57;
        URI r1 = new URI(r8);     // Catch: Exception -> L58
        if (h12.c(r1.getScheme(), "http") == false) goto L10;
    L12:
        String r9 = r1.getPath();
        if (r9 == null) goto L57;
        String r10 = qm4.G0(r9, '/', r9);
        if (r10.equals("stream") == false) goto L17;
    L19:
        String r11 = r1.getRawQuery();
        HashMap r2 = new HashMap();
        if (r11 == null) goto L36;
        Iterator r12 = qm4.D0(r11, new char[]{'&'}).iterator();
    L24:
        if (r12.hasNext() == false) goto L36;
        String r3 = (String) r12.next();
        String r5 = qm4.H0(r3, '=');
        if (r5.length() == 0) goto L24;
        if (r2.containsKey(r5) == true) goto L24;
        String r6 = URLDecoder.decode(r5, "UTF-8");
        int r4 = qm4.r0(r3, '=', 0, 6);
        if (r4 != (-1)) goto L34;
        String r7 = "";
    L35:
        r2.put(r6, URLDecoder.decode(r7, "UTF-8"));
        goto L24
    L34:
        r7 = r3.substring(r4 + 1, r3.length());
    L36:
        String r13 = (String) r2.get("format");
        String r14 = (String) r2.get("maxBitRate");
        if (r13 == null) goto L41;
        if (r13.equals("raw") == true) goto L41;
    L45:
        return null;
    L41:
        if (r14 != null) goto L43;
    L46:
        String r15 = (String) r2.get("timeOffset");
        if (r15 != null) goto L50;
        r15 = "0";
    L50:
        if (r15.equals("0") == false) goto L57;
        String r16 = (String) r2.get("id");
        if (r16 == null) goto L57;
        if (qm4.u0(r16) == true) goto L57;
        return r16;
    L43:
        if (r14.equals("0") == false) goto L45;
    L17:
        if (r10.equals("stream.view") == true) goto L19;
    L10:
        if (h12.c(r1.getScheme(), "https") == true) goto L12;
    L57:
        return null;
    }

    public static final boolean y(int r1, r23 r2) {
        r2.getClass();
        int r0 = r23.w;
        Iterator r3 = fa4.c0(k5.y, r2).iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (((r23) r3.next()).u != r1) goto L4;
        return true;
    L9:
        return false;
    }

    public static final ij4 z(ij4 r24, ij4 r25) {
        if (r24 != null) goto L5;
        return r25;
    L5:
        if (r25 != null) goto L7;
        return r24;
    L7:
        as4 r1 = r25.a;
        return jj4.a(r24, r1.c(), r1.f(), r1.b(), r25.b, r25.c, r25.d, r25.e, r25.f, r25.g, r25.h, r25.i, r25.j, r25.k, r25.l, r25.m, r25.n, r25.o);
    }

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public abstract void H(wq2 r1);

    public void I() {
    }

    public void J(wq2 r1) {
    }

    public void K() {
    }

    public void L(wq2 r1) {
    }

    public void M() {
    }

    public abstract void d(long r1, gc r3, float r4);

    public abstract Object o();

    public String toString() {
        switch(this.n) {
            case 10: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return o().toString();
    }
}
