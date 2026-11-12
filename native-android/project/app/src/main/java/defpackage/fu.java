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
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.KotlinNullPointerException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu {
    public static final int[] n = null;
    public static final int[] o = null;
    public static final int[] p = null;
    public static final int[] q = null;
    public static final int[] r = null;
    public static final int[] s = null;
    public static final ow1 t = null;
    public static final StackTraceElement[] u = null;
    public static final char[] v = null;
    public static boolean w;
    public static Method x;
    public static boolean y;
    public static Field z;

    static {
        n = new int[]{1, 2, 3, 6};
        o = new int[]{48000, 44100, 32000};
        p = new int[]{24000, 22050, 16000};
        q = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        r = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
        s = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
        t = new ow1(false);
        u = new StackTraceElement[0];
        v = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static int A(Context r2, int r3, int r4) {
        if (r3 == 0) goto L6;
        TypedArray r5 = r2.obtainStyledAttributes(r3, new int[]{r4});
        int r0 = r5.getColor(0, 0);
        r5.recycle();
        if (r0 == 0) goto L6;
        return r0;
    L6:
        TypedValue r6 = new TypedValue();
        r2.getTheme().resolveAttribute(r4, r6, true);
        if (r6.resourceId == 0) goto L11;
        return r2.getResources().getColor(r6.resourceId);
    L11:
        return r6.data;
    }

    public static int B(Context r2, int r3) {
        TypedValue r0 = new TypedValue();
        if (r2.getTheme().resolveAttribute(r3, r0, true) == true) goto L5;
        return 0;
    L5:
        return r0.resourceId;
    }

    public static final void C(g94 r0) {
        j51.O(r0).E();
    }

    public static boolean D(Context r3) {
        TypedValue r0 = new TypedValue();
        if (r3.getTheme().resolveAttribute(R.attr.isLightTheme, r0, true) == true) goto L5;
        return false;
    L5:
        if (r0.data == 0) goto L9;
        return true;
    L9:
        return false;
    }

    public static final boolean E(String r2, int r3, int r4) {
        r2.getClass();
        int r0 = r3 + 2;
        if (r0 < r4) goto L5;
        return false;
    L5:
        if (r2.charAt(r3) == '%') goto L7;
        return false;
    L7:
        if (xe5.m(r2.charAt(r3 + 1)) != (-1)) goto L9;
        return false;
    L9:
        if (xe5.m(r2.charAt(r0)) == (-1)) goto L15;
        return true;
    L15:
        return false;
    }

    public static final sk4 F(we0 r2, ne0 r3, ze0 r4, wf1 r5) {
        ne0 r6 = jz4.t(r2.e(), r3, true);
        rm0 r7 = rr0.a;
        if (r6 != r7) goto L5;
    L7:
        r4.getClass();
        if (r4 != ze0.o) goto L10;
        sk4 r8 = new a92(r6, r5);
    L11:
        r8.l0(r4, r8, r5);
        return r8;
    L10:
        r8 = new sk4(r6, true);
        goto L11
    L5:
        if (r6.K(fz0.R) != null) goto L7;
        r6 = r6.J(r7);
        goto L7
    }

    public static /* synthetic */ sk4 G(we0 r1, ne0 r2, ze0 r3, wf1 r4, int r5) {
        if ((r5 & 1) == 0) goto L6;
        r2 = q01.n;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = ze0.n;
    L9:
        return F(r1, r2, r3, r4);
    }

    public static String J(String r8, int r9, int r10, int r11) {
        boolean r1 = false;
        if ((r11 & 1) == 0) goto L6;
        r9 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r10 = r8.length();
    L9:
        if ((r11 & 4) != 0) goto L12;
        r1 = true;
    L12:
        r8.getClass();
        int r12 = r9;
    L13:
        if (r12 >= r10) goto L37;
        char r0 = r8.charAt(r12);
        if (r0 == '%') goto L20;
        if (r0 != '+') goto L19;
        if (r1 == true) goto L20;
    L19:
        r12 = r12 + 1;
    L20:
        tv r2 = new tv();
        r2.e0(r8, r9, r12);
    L21:
        if (r12 >= r10) goto L35;
        int r13 = r8.codePointAt(r12);
        if (r13 != 37) goto L30;
        int r4 = r12 + 2;
        if (r4 >= r10) goto L30;
        int r5 = xe5.m(r8.charAt(r12 + 1));
        int r6 = xe5.m(r8.charAt(r4));
        if (r5 == (-1)) goto L33;
        if (r6 == (-1)) goto L33;
        r2.Y((r5 << 4) + r6);
        r12 = Character.charCount(r13) + r4;
    L33:
        r2.f0(r13);
        r12 = r12 + Character.charCount(r13);
    L30:
        if (r13 != 43) goto L33;
        if (r1 == false) goto L33;
        r2.Y(32);
        r12 = r12 + 1;
        goto L21
    L35:
        return r2.M();
    L37:
        return r8.substring(r9, r10);
    }

    public static final void K(View r6, qi3 r7) {
        if (r6 == null) goto L50;
        ImageView r8 = (ImageView) r6.findViewById(R.id.exo_shuffle);
        if (r8 == null) goto L53;
        Object r1 = r8.getTag(R.id.exo_shuffle);
        PlayerControlView r3 = null;
        if ((r1 instanceof Drawable) == false) goto L9;
        Drawable r2 = (Drawable) r1;
    L10:
        WeakReference r4 = a.a;
        boolean r5 = false;
        if (r7 != null) goto L13;
    L15:
        boolean r9 = false;
    L17:
        if (a.b != null) goto L21;
        if (a.d == true) goto L21;
    L23:
        od4.n.getClass();
        od4 r10 = od4.q;
        if (r5 == false) goto L26;
        od4 r11 = r10;
    L29:
        if (r11 != r10) goto L36;
        if (r2 != null) goto L32;
    L34:
        Drawable r12 = zz1.r(r8.getContext(), R.drawable.ic_shuffle_smart);
        r8.setImageDrawable(r12);
        r8.setTag(R.id.exo_shuffle, r12);
        r8.setContentDescription(r8.getContext().getString(R.string.homemusic_smart_shuffle_on));
        return;
    L32:
        if (r8.getDrawable() != r2) goto L34;
        return;
    L36:
        if (r2 == null) goto L51;
        r8.setTag(R.id.exo_shuffle, null);
        ViewParent r13 = r8.getParent();
    L38:
        if (r13 == null) goto L43;
        if ((r13 instanceof PlayerControlView) == true) goto L43;
        r13 = r13.getParent();
    L43:
        if ((r13 instanceof PlayerControlView) == false) goto L45;
        r3 = (PlayerControlView) r13;
    L45:
        if (r3 == null) goto L52;
        r3.setShowShuffleButton(r3.getShowShuffleButton());
        return;
    L52:
        return;
    L51:
        return;
    L26:
        if (r9 == false) goto L28;
        r11 = od4.p;
        goto L29
    L28:
        r11 = od4.o;
    L21:
        if (u52.c().a == true) goto L23;
        r5 = true;
        goto L23
    L13:
        if (r7.D0() != true) goto L15;
        r9 = true;
        goto L17
    L9:
        r2 = null;
        goto L10
    L53:
        return;
    }

    public static final Object L(ne0 r5, wf1 r6) {
        Thread r0 = Thread.currentThread();
        me0 r1 = fz0.R;
        pe0 r2 = (pe0) r5.K(r1);
        q01 r3 = q01.n;
        if (r2 != null) goto L9;
        g21 r4 = it4.a();
        ne0 r7 = jz4.t(r3, r5.J(r4), true);
        rm0 r8 = rr0.a;
        if (r7 != r8) goto L7;
    L14:
        ht r9 = new ht(r7, r0, r4);
        r9.l0(ze0.n, r9, r6);
        g21 r10 = r9.t;
        if (r10 == null) goto L43;
        int r11 = g21.s;
        r10.c0(false);
    L43:
    L21:
        th = move-exception;
        if (r10 == null) goto L42;
        int r12 = g21.s;
        r10.a0(false);
    L42:
        throw th;
    L18:
        if (Thread.interrupted() == true) goto L38;
        if (r10 == null) goto L23;
        long r13 = r10.d0();     // Catch: Throwable -> L21
    L25:
        if ((r9.H() instanceof mx1) == false) goto L28;
        LockSupport.parkNanos(r9, r13);     // Catch: Throwable -> L21
        goto L43
    L28:
        if (r10 == null) goto L30;
        int r14 = g21.s;
        r10.a0(false);
    L30:
        Object r15 = zz1.M(r9.H());
        if ((r15 instanceof a70) == false) goto L33;
        a70 r16 = (a70) r15;
    L34:
        if (r16 != null) goto L37;
        return r15;
    L37:
        throw r16.a;
    L33:
        r16 = null;
        goto L34
    L23:
        r13 = Long.MAX_VALUE;
        goto L25
    L38:
        InterruptedException r17 = new InterruptedException();     // Catch: Throwable -> L21
        r9.o(r17);     // Catch: Throwable -> L21
        throw r17;     // Catch: Throwable -> L21
    L7:
        if (r7.K(r1) != null) goto L14;
        r7 = r7.J(r8);
        goto L14
    L9:
        r4 = (g21) it4.a.get();
        r7 = jz4.t(r3, r5, true);
        rm0 r18 = rr0.a;
        if (r7 == r18) goto L14;
        if (r7.K(r1) != null) goto L14;
        r7 = r7.J(r18);
        goto L14
    }

    public static void M(Context r1, ProgressBar r2) {
        if (r2.isIndeterminate() == true) goto L6;
        return;
    L6:
        if (D(r1) == false) goto L8;
        int r0 = R.color.mr_cast_progressbar_progress_and_thumb_light;
    L9:
        int r3 = r1.getColor(r0);
        r2.getIndeterminateDrawable().setColorFilter(r3, PorterDuff.Mode.SRC_IN);
        return;
    L8:
        r0 = R.color.mr_cast_progressbar_progress_and_thumb_dark;
        goto L9
    }

    public static final lu2 N(k03 r4, if1 r5) {
        r4.getClass();
        jx3 r0 = new jx3();
        Object r1 = r4.e;
        Object r2 = ad2.k;
        if (r1 == r2) goto L10;
        ad2 r3 = (ad2) r5.invoke(r4.d());
        if (r3 != null) goto L7;
    L9:
        lu2 r6 = new lu2();
    L11:
        r6.l(r4, new ht1(new dd0(r5, r0, r6, 6), 2));
        return r6;
    L7:
        if (r3.e == r2) goto L9;
        r6 = new lu2(r3.d());
        r6.l = new i44();
        goto L11
    L10:
        r6 = new lu2();
        goto L11
    }

    public static final Bitmap.Config O(int r3) {
        if (r3 != 0) goto L6;
        return Bitmap.Config.ARGB_8888;
    L6:
        if (r3 != 1) goto L10;
        return Bitmap.Config.ALPHA_8;
    L10:
        if (r3 == 2) goto L12;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) goto L16;
    L19:
        if (r0 < 26) goto L25;
        if (r3 != 4) goto L25;
        return j3.D();
    L25:
        return Bitmap.Config.ARGB_8888;
    L16:
        if (r3 != 3) goto L19;
        return j3.d();
    L12:
        return Bitmap.Config.RGB_565;
    }

    public static final Object P(ne0 r5, wf1 r6, wd0 r7) {
        ne0 r0 = r7.getContext();
        Boolean r1 = Boolean.FALSE;
        if (((Boolean) r5.s(new d60(10, 0), r1)).booleanValue() == true) goto L5;
        ne0 r8 = r0.J(r5);
    L6:
        gb.u(r8);
        if (r8 != r0) goto L9;
        e64 r2 = new e64(r7, r8);
        return h12.O(r2, r2, r6);
    L9:
        fz0 r3 = fz0.R;
        if (h12.c(r8.K(r3), r0.K(r3)) == false) goto L17;
        f15 r4 = new f15(r8, r7);
        ne0 r9 = r4.r;
        Object r10 = te5.R(r9, null);
        Object r11 = h12.O(r4, r4, r6);     // Catch: Throwable -> L14
        te5.K(r9, r10);
        return r11;
    L14:
        th = move-exception;
        te5.K(r9, r10);
        throw th;
    L17:
        nr0 r12 = new nr0(r7, r8);
        uc5.T(ya4.x(ya4.i(r12, r12, r6)), j15.a);     // Catch: Throwable -> L35
        AtomicIntegerFieldUpdater r13 = nr0.t;
    L20:
        int r14 = r13.get(r12);
        if (r14 != 0) goto L23;
        if (r13.compareAndSet(r12, 0, 1) == false) goto L20;
        return xe0.n;
    L23:
        if (r14 != 2) goto L29;
        Object r15 = zz1.M(r12.H());
        if ((r15 instanceof a70) == true) goto L28;
        return r15;
    L28:
        throw ((a70) r15).a;
    L29:
        kf2.o("Already suspended");
        return null;
    L35:
        th = move-exception;
        r12.resumeWith(new s14(th));
        throw th;
    L5:
        r8 = jz4.t(r0, r5, false);
        goto L6
    }

    public static void Q(int r2, int r3) {
        if (r2 < 0) goto L7;
        if (r2 >= r3) goto L7;
        return;
    L7:
        if (r2 < 0) goto L12;
        if (r3 >= 0) goto L11;
        kf2.n(f34.f(r3, "negative size: "));
        return;
    L11:
        String r4 = hw.S("%s (%s) must be less than size (%s)", new Object[]{"index", Integer.valueOf(r2), Integer.valueOf(r3)});
    L14:
        throw new IndexOutOfBoundsException(r4);
    L12:
        r4 = hw.S("%s (%s) must not be negative", new Object[]{"index", Integer.valueOf(r2)});
        goto L14
    }

    public static void R(int r1, int r2, int r3) {
        if (r1 < 0) goto L8;
        if (r2 < r1) goto L8;
        if (r2 > r3) goto L8;
        return;
    L8:
        if (r1 < 0) goto L15;
        if (r1 > r3) goto L15;
        if (r2 < 0) goto L14;
        if (r2 > r3) goto L14;
        String r4 = hw.S("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(r2), Integer.valueOf(r1)});
    L17:
        throw new IndexOutOfBoundsException(r4);
    L14:
        r4 = S("end index", r2, r3);
    L15:
        r4 = S("start index", r1, r3);
        goto L17
    }

    public static String S(String r0, int r1, int r2) {
        if (r1 < 0) goto L4;
        if (r2 >= 0) goto L7;
        kf2.n(f34.f(r2, "negative size: "));
        return null;
    L7:
        return hw.S("%s (%s) must not be greater than size (%s)", new Object[]{r0, Integer.valueOf(r1), Integer.valueOf(r2)});
    L4:
        return hw.S("%s (%s) must not be negative", new Object[]{r0, Integer.valueOf(r1)});
    }

    public static final boolean b(zs4 r2) {
        eh3 r3 = r2.c;
        if (r3 == null) goto L7;
        zg3 r4 = r3.a;
        if (r4 == null) goto L7;
        h01 r0 = new h01(r4.b);
    L8:
        boolean r5 = false;
        if (r0 == null) goto L15;
        if (r0.a != 1) goto L15;
        r5 = true;
    L15:
        return !r5;
    L7:
        r0 = null;
        goto L8
    }

    public static final fa c(b0 r3, ea2 r4) {
        if (r4.h.compareTo(r92.n) <= 0) goto L6;
        pd1 r0 = new pd1(3, r3);
        r4.a(r0);
        return new fa(17, r4, r0);
    L6:
        nz2.p("Cannot configure ", r3, " to disposeComposition at Lifecycle ON_DESTROY: ", r4, "is already destroyed");
        return null;
    }

    public static final Object e(ic2 r2, ep4 r3) {
    L8:
        e = move-exception;
        Throwable r4 = e.getCause();
        if (r4 == null) goto L12;
        throw r4;
    L12:
        KotlinNullPointerException r5 = new KotlinNullPointerException();
        h12.M(r5, h12.class.getName());
        throw r5;
    L3:
        if (r2.isDone() == false) goto L6;
        return g2.e(r2);
    L6:
        cz r0 = new cz(1, ya4.x(r3));
        r2.f(new nu4(r2, r0, 1), hq0.n);
        r0.w(new ir0(3, r2));
        return r0.q();
    }

    public static String g(String r11, int r12, int r13, String r14, int r15) {
        if ((r15 & 1) == 0) goto L5;
        int r3 = 0;
    L7:
        if ((r15 & 2) == 0) goto L9;
        r13 = r11.length();
    L9:
        int r4 = r13;
        if ((r15 & 8) == 0) goto L12;
        boolean r6 = false;
    L14:
        if ((r15 & 16) == 0) goto L16;
        boolean r7 = false;
    L18:
        if ((r15 & 32) == 0) goto L20;
        boolean r8 = false;
    L22:
        if ((r15 & 64) == 0) goto L24;
        boolean r9 = false;
    L25:
        r11.getClass();
        return i(r11, r3, r4, r14, r6, r7, r8, r9, 128);
    L24:
        r9 = true;
        goto L25
    L20:
        r8 = true;
        goto L22
    L16:
        r7 = true;
        goto L18
    L12:
        r6 = true;
        goto L14
    L5:
        r3 = r12;
        goto L7
    }

    public static String i(String r17, int r18, int r19, String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        boolean r3 = false;
        if ((r25 & 1) == 0) goto L5;
        int r2 = 0;
    L7:
        if ((r25 & 2) == 0) goto L9;
        int r4 = r17.length();
    L11:
        if ((r25 & 8) == 0) goto L13;
        boolean r5 = false;
    L15:
        if ((r25 & 16) == 0) goto L17;
        boolean r6 = false;
    L19:
        if ((r25 & 64) != 0) goto L22;
        r3 = r24;
    L22:
        r17.getClass();
        int r7 = r2;
    L23:
        if (r7 >= r4) goto L89;
        int r8 = r17.codePointAt(r7);
        int r9 = 128;
        if (r8 < 32) goto L40;
        if (r8 == 127) goto L40;
        if (r8 < 128) goto L30;
        if (r3 == false) goto L40;
    L30:
        if (qm4.n0(r20, (char) r8) == true) goto L40;
        if (r8 != 37) goto L36;
        if (r5 == false) goto L40;
        if (r6 == false) goto L36;
        if (E(r17, r7, r4) == false) goto L40;
    L36:
        if (r8 != 43) goto L39;
        if (r23 == true) goto L40;
    L39:
        r7 = r7 + Character.charCount(r8);
    L40:
        tv r10 = new tv();
        r10.e0(r17, r2, r7);
        tv r11 = null;
    L41:
        if (r7 >= r4) goto L87;
        int r14 = r17.codePointAt(r7);
        if (r5 == true) goto L45;
    L53:
        String r15 = "+";
        if (r14 == 32) goto L56;
    L58:
        if (r14 != 43) goto L64;
        if (r23 == false) goto L64;
        if (r5 == true) goto L63;
        r15 = "%2B";
    L63:
        r10.d0(r15);
    L85:
        r7 = r7 + Character.charCount(r14);
        r9 = 128;
    L64:
        if (r14 < 32) goto L79;
        if (r14 == 127) goto L79;
        if (r14 < r9) goto L69;
        if (r3 == false) goto L79;
    L69:
        if (qm4.n0(r20, (char) r14) == true) goto L79;
        if (r14 != 37) goto L77;
        if (r5 == false) goto L79;
        if (r6 == false) goto L77;
        if (E(r17, r7, r4) == false) goto L79;
    L77:
        r10.f0(r14);
    L79:
        if (r11 != null) goto L81;
        r11 = new tv();
    L81:
        r11.f0(r14);
    L83:
        if (r11.l() == true) goto L85;
        byte r12 = r11.readByte();
        r10.Y(37);
        char[] r16 = v;
        r10.Y(r16[((r12 & 255) >> 4) & 15]);
        r10.Y(r16[r12 & 15]);
        goto L83
    L56:
        if (r20 != " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") goto L58;
        r10.d0("+");
        goto L85
    L45:
        if (r14 == 9) goto L85;
        if (r14 == 10) goto L85;
        if (r14 == 12) goto L85;
        if (r14 != 13) goto L53;
    L87:
        return r10.M();
    L89:
        return r17.substring(r2, r4);
    L17:
        r6 = r22;
        goto L19
    L13:
        r5 = r21;
        goto L15
    L9:
        r4 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public static Object j(Class r2, InvocationHandler r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return r2.cast(Proxy.newProxyInstance(fu.class.getClassLoader(), new Class[]{r2}, r3));
    }

    public static void k(ci0 r0) {
        if (r0 == null) goto L8;
        r0.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    public static int l(Comparable r0, Comparable r1) {
        if (r0 != r1) goto L5;
        return 0;
    L5:
        if (r0 != null) goto L8;
        return -1;
    L8:
        if (r1 != null) goto L12;
        return 1;
    L12:
        return r0.compareTo(r1);
    }

    public static StaticLayout m(CharSequence r1, TextPaint r2, int r3, int r4, TextDirectionHeuristic r5, Layout.Alignment r6, int r7, TextUtils.TruncateAt r8, int r9, int r10, boolean r11, int r12, int r13, int r14, int r15) {
        if (r4 >= 0) goto L5;
        dz1.a("invalid start value");
    L5:
        int r0 = r1.length();
        if (r4 < 0) goto L9;
        if (r4 > r0) goto L9;
    L10:
        if (r7 >= 0) goto L13;
        dz1.a("invalid maxLines value");
    L13:
        if (r3 >= 0) goto L16;
        dz1.a("invalid width value");
    L16:
        if (r9 >= 0) goto L19;
        dz1.a("invalid ellipsizedWidth value");
    L19:
        StaticLayout.Builder r16 = StaticLayout.Builder.obtain(r1, 0, r4, r2, r3);
        r16.setTextDirection(r5);
        r16.setAlignment(r6);
        r16.setMaxLines(r7);
        r16.setEllipsize(r8);
        r16.setEllipsizedWidth(r9);
        r16.setLineSpacing(0.0f, 1.0f);
        r16.setIncludePad(r11);
        r16.setBreakStrategy(r12);
        r16.setHyphenationFrequency(r15);
        r16.setIndents(null, null);
        int r17 = Build.VERSION.SDK_INT;
        if (r17 < 26) goto L23;
        rg3.j(r16, r10);
    L23:
        if (r17 < 28) goto L26;
        vl4.g(r16);
    L26:
        if (r17 < 33) goto L29;
        n3.s(r16, n3.e(n3.A(n3.d(n3.c(), r13), r14)));
    L29:
        if (r17 < 35) goto L32;
        vk.h(r16);
    L32:
        return r16.build();
    L9:
        dz1.a("invalid end value");
        goto L10
    }

    public static o53 n(int[] r11, int[] r12) {
        NetworkRequest.Builder r1 = new NetworkRequest.Builder();
        int r2 = r11.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L12;
        int r5 = r11[r4];
        r1.addCapability(r5);     // Catch: IllegalArgumentException -> L7
    L11:
        r4 = r4 + 1;
    L7:
        e = move-exception;
        cx r7 = cx.f();
        String r8 = o53.b;
        String r9 = o53.b;
        String r6 = "Ignoring adding capability '" + r5 + '\'';
        if (r7.a > 5) goto L11;
        Log.w(r9, r6, e);
        goto L11
    L12:
        int r13 = r12.length;
    L13:
        if (r3 >= r13) goto L15;
        r1.addTransportType(r12[r3]);
        r3 = r3 + 1;
        goto L13
    L15:
        NetworkRequest r14 = r1.build();
        r14.getClass();
        return new o53(r14);
    }

    public static ContextThemeWrapper o(Context r1, boolean r2) {
        if (r2 == true) goto L4;
        int r3 = R.attr.dialogTheme;
    L5:
        ContextThemeWrapper r0 = new ContextThemeWrapper(r1, B(r1, r3));
        if (B(r0, R.attr.mediaRouteTheme) != 0) goto L8;
        return r0;
    L8:
        return new ContextThemeWrapper(r0, z(r0));
    L4:
        r3 = R.attr.alertDialogTheme;
        goto L5
    }

    public static final void p(TextView r4, String r5) {
        if (r4 == null) goto L26;
        CharSequence r0 = r4.getText();
        String r1 = null;
        if (r0 == null) goto L7;
        String r2 = r0.toString();
    L8:
        String r3 = "";
        if (r2 != null) goto L11;
        r2 = "";
    L11:
        CharSequence r6 = a.a(qm4.z0(r2, "✨ "), r5);
        if (r6 == null) goto L14;
        String r7 = r6.toString();
    L15:
        if (r7 == null) goto L18;
        r3 = r7;
    L18:
        CharSequence r8 = r4.getText();
        if (r8 == null) goto L22;
        r1 = r8.toString();
    L22:
        if (h12.c(r1, r3) == true) goto L25;
        r4.setText(r3);
        return;
    L25:
        return;
    L14:
        r7 = null;
        goto L15
    L7:
        r2 = null;
        goto L8
    }

    public static boolean q(View r4, KeyEvent r5) {
        WeakHashMap r0 = j65.a;
        if (Build.VERSION.SDK_INT >= 28) goto L36;
        ArrayList r1 = i65.d;
        i65 r2 = (i65) r4.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference r3 = null;
        if (r2 != null) goto L8;
        r2 = new i65();
        r2.a = null;
        r2.b = null;
        r2.c = null;
        r4.setTag(R.id.tag_unhandled_key_event_manager, r2);
    L8:
        WeakReference r6 = r2.c;
        if (r6 != null) goto L11;
    L13:
        r2.c = new WeakReference(r5);
        if (r2.b != null) goto L16;
        r2.b = new SparseArray();
    L16:
        SparseArray r7 = r2.b;
        if (r5.getAction() != 1) goto L21;
        int r8 = r7.indexOfKey(r5.getKeyCode());
        if (r8 < 0) goto L21;
        r3 = (WeakReference) r7.valueAt(r8);
        r7.removeAt(r8);
    L21:
        if (r3 != null) goto L23;
        r3 = (WeakReference) r7.get(r5.getKeyCode());
    L23:
        if (r3 == null) goto L36;
        View r9 = (View) r3.get();
        if (r9 != null) goto L27;
    L35:
        return true;
    L27:
        if (r9.isAttachedToWindow() == false) goto L35;
        ArrayList r10 = (ArrayList) r9.getTag(R.id.tag_unhandled_key_listeners);
        if (r10 == null) goto L35;
        int r11 = r10.size() - 1;
        if (r11 < 0) goto L35;
        r10.get(r11).getClass();
        kf2.k();
        return false;
    L11:
        if (r6.get() != r5) goto L13;
    L36:
        return false;
    }

    public static boolean r(h42 r6, View r7, Window.Callback r8, KeyEvent r9) {
        boolean r0 = false;
        if (r6 != null) goto L6;
    L69:
        return false;
    L6:
        if (Build.VERSION.SDK_INT >= 28) goto L8;
        KeyEvent.DispatcherState r2 = null;
        if ((r8 instanceof Activity) == false) goto L39;
        Activity r10 = (Activity) r8;
        r10.onUserInteraction();
        Window r11 = r10.getWindow();
        if (r11.hasFeature(8) == false) goto L29;
        ActionBar r12 = r10.getActionBar();
        if (r9.getKeyCode() != 82) goto L29;
        if (r12 == null) goto L29;
        if (w == false) goto L78;
    L20:
        Method r1 = x;
        if (r1 != null) goto L80;
    L26:
        if (r0 == false) goto L29;
        return true;
    L80:
        Object r13 = r1.invoke(r12, new Object[]{r9});     // Catch: Throwable -> L70
        if (r13 == null) goto L26;
        r0 = ((Boolean) r13).booleanValue();     // Catch: Throwable -> L70
        goto L26
    L78:
        x = r12.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});     // Catch: NoSuchMethodException -> L71
    L19:
        w = true;
    L29:
        if (r11.superDispatchKeyEvent(r9) == true) goto L83;
        View r14 = r11.getDecorView();
        if (j65.c(r14, r9) == true) goto L84;
        if (r14 == null) goto L37;
        r2 = r14.getKeyDispatcherState();
    L37:
        return r9.dispatch(r10, r2, r10);
    L84:
        return true;
    L83:
        return true;
    L39:
        if ((r8 instanceof Dialog) == false) goto L63;
        Dialog r15 = (Dialog) r8;
        if (y == false) goto L74;
    L44:
        Field r16 = z;
        if (r16 != null) goto L76;
    L48:
        DialogInterface.OnKeyListener r17 = null;
    L49:
        if (r17 != null) goto L51;
    L53:
        Window r18 = r15.getWindow();
        if (r18.superDispatchKeyEvent(r9) == true) goto L86;
        View r19 = r18.getDecorView();
        if (j65.c(r19, r9) == true) goto L87;
        if (r19 == null) goto L62;
        r2 = r19.getKeyDispatcherState();
    L62:
        return r9.dispatch(r15, r2, r15);
    L87:
        return true;
    L86:
        return true;
    L51:
        if (r17.onKey(r15, r9.getKeyCode(), r9) == false) goto L53;
        return true;
    L76:
        r17 = (DialogInterface.OnKeyListener) r16.get(r15);     // Catch: IllegalAccessException -> L72
    L74:
        Field r20 = Dialog.class.getDeclaredField("mOnKeyListener");     // Catch: NoSuchFieldException -> L73
        z = r20;     // Catch: NoSuchFieldException -> L73
        r20.setAccessible(true);     // Catch: NoSuchFieldException -> L73
    L43:
        y = true;
        goto L44
    L63:
        if (r7 == null) goto L67;
        if (j65.c(r7, r9) == false) goto L67;
    L68:
        return true;
    L67:
        if (r6.c(r9) == false) goto L69;
    L8:
        return r6.c(r9);
    }

    public static final wv3 s(cx2 r1, boolean r2, boolean r3) {
        if (r1.n.A == true) goto L7;
        return wv3.e;
    L7:
        if (r2 == true) goto L11;
        f63 r4 = j51.M(r1, 8);
        return wr1.n(r4).C(r4, r3);
    L11:
        return j51.M(r1, 8).X0();
    }

    public static int t(int r2, int r3) {
        int r0 = r3 / 2;
        if (r2 >= 0) goto L5;
        return -1;
    L5:
        if (r2 >= 3) goto L22;
        if (r3 >= 0) goto L8;
        return -1;
    L8:
        if (r0 >= 19) goto L24;
        int r4 = o[r2];
        if (r4 != 44100) goto L14;
        int r5 = r3 % 2;
        return (r5 + s[r0]) * 2;
    L14:
        int r6 = r[r0];
        if (r4 != 32000) goto L19;
        return r6 * 6;
    L19:
        return r6 * 4;
    L24:
        return -1;
    L22:
        return -1;
    }

    public static int u(Context r4, int r5) {
        if (v50.d(-1, A(r4, r5, R.attr.colorPrimary)) < 3.0d) goto L5;
        return -1;
    L5:
        return -570425344;
    }

    public static float v(Context r3) {
        TypedValue r0 = new TypedValue();
        if (r3.getTheme().resolveAttribute(android.R.attr.disabledAlpha, r0, true) == true) goto L5;
        return 0.5f;
    L5:
        return r0.getFloat();
    }

    public static Set w() {
        Object r0 = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);     // Catch: Throwable -> L13
        if (r0 == null) goto L5;
        Set r1 = (Set) r0;     // Catch: Throwable -> L13
        Iterator r2 = r1.iterator();     // Catch: Throwable -> L13
    L8:
        if (r2.hasNext() == false) goto L19;
        if ((r2.next() instanceof int[]) == true) goto L8;
        return Collections.EMPTY_SET;
    L19:
        return r1;
    L5:
        return Collections.EMPTY_SET;
    L14:
        return Collections.EMPTY_SET;
    }

    public static void x(List r1) {
        Iterator r2 = r1.iterator();
        if (r2.hasNext() == true) goto L6;
        return;
    L6:
        throw xa3.d(r2);
    }

    public static Drawable y(Context r2, int r3) {
        TypedArray r4 = r2.obtainStyledAttributes(new int[]{r3});
        Drawable r0 = zz1.r(r2, r4.getResourceId(0, 0));
        if (D(r2) == false) goto L5;
        r0.setTint(r2.getColor(R.color.mr_dynamic_dialog_icon_light));
    L5:
        r4.recycle();
        return r0;
    }

    public static int z(Context r3) {
        if (D(r3) == false) goto L11;
        if (u(r3, 0) != (-570425344)) goto L8;
        return R.style.Theme_MediaRouter_Light;
    L8:
        return R.style.Theme_MediaRouter_Light_DarkControlPanel;
    L11:
        if (u(r3, 0) != (-570425344)) goto L14;
        return R.style.Theme_MediaRouter_LightControlPanel;
    L14:
        return R.style.Theme_MediaRouter;
    }

    public abstract View H(int r1);

    public abstract boolean I();
}
