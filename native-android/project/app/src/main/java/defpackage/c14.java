package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c14 {
    public static final PorterDuff.Mode f = null;
    public static c14 g;
    public static final b14 h = null;
    public WeakHashMap a;
    public final WeakHashMap b;
    public TypedValue c;
    public boolean d;
    public ml3 e;

    static {
        f = PorterDuff.Mode.SRC_IN;
        h = new b14(6);
    }

    public c14() {
        this.b = new WeakHashMap(0);
    }

    public static synchronized c14 c() {
        monitor-enter(c14.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (g != null) goto L9;
        g = new c14();     // Catch: Throwable -> L7
    L9:
        c14 r1 = g;     // Catch: Throwable -> L7
        monitor-exit(c14.class);
        return r1;
    }

    public static synchronized PorterDuffColorFilter f(int r4, PorterDuff.Mode r5) {
        monitor-enter(c14.class);
        b14 r1 = h;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        int r3 = (31 + r4) * 31;     // Catch: Throwable -> L8
        PorterDuffColorFilter r2 = (PorterDuffColorFilter) r1.g(Integer.valueOf(r5.hashCode() + r3));     // Catch: Throwable -> L8
        if (r2 != null) goto L10;
        r2 = new PorterDuffColorFilter(r4, r5);     // Catch: Throwable -> L8
        PorterDuffColorFilter r6 = (PorterDuffColorFilter) r1.l(Integer.valueOf(r5.hashCode() + r3), r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(c14.class);
        return r2;
    L8:
        th = move-exception;
        throw th;
    }

    public final void a(Context r6, int r7, ColorStateList r8) {
        if (this.a != null) goto L5;
        this.a = new WeakHashMap();
    L5:
        mj4 r0 = (mj4) this.a.get(r6);
        if (r0 != null) goto L8;
        r0 = new mj4(0);
        this.a.put(r6, r0);
    L8:
        int r5 = r0.q;
        if (r5 == 0) goto L15;
        if (r7 > r0.o[r5 - 1]) goto L15;
        r0.d(r7, r8);
        return;
    L15:
        if (r0.n == true) goto L17;
    L19:
        int r9 = r0.q;
        if (r9 < r0.o.length) goto L29;
        int r10 = (r9 + 1) * 4;
        int r3 = 4;
    L23:
        if (r3 >= 32) goto L28;
        int r4 = (1 << r3) - 12;
        if (r10 <= r4) goto L26;
        r3 = r3 + 1;
        goto L23
    L26:
        r10 = r4;
    L28:
        int r11 = r10 / 4;
        r0.o = Arrays.copyOf(r0.o, r11);
        r0.p = Arrays.copyOf(r0.p, r11);
    L29:
        r0.o[r9] = r7;
        r0.p[r9] = r8;
        r0.q = r9 + 1;
        return;
    L17:
        if (r5 < r0.o.length) goto L19;
        su3.f(r0);
        goto L19
    }

    public final Drawable b(Context r7, int r8) {
        if (this.c != null) goto L5;
        this.c = new TypedValue();
    L5:
        TypedValue r0 = this.c;
        r7.getResources().getValue(r8, r0, true);
        long r1 = (((long) r0.assetCookie) << 32) | ((long) r0.data);
        monitor-enter(this);
        xe2 r3 = (xe2) this.b.get(r7);     // Catch: Throwable -> L19
        Object r4 = null;
        if (r3 != null) goto L12;
        monitor-exit(this);
    L11:
        Drawable r5 = null;
    L24:
        if (r5 == null) goto L27;
        return r5;
    L27:
        if (this.e != null) goto L30;
    L28:
        LayerDrawable r9 = null;
    L41:
        if (r9 == null) goto L58;
        r9.setChangingConfigurations(r0.changingConfigurations);
        monitor-enter(this);
        Drawable.ConstantState r2 = r9.getConstantState();     // Catch: Throwable -> L49
        if (r2 == null) goto L54;
        xe2 r6 = (xe2) this.b.get(r7);     // Catch: Throwable -> L49
        if (r6 != null) goto L51;
        r6 = new xe2(r4);     // Catch: Throwable -> L49
        this.b.put(r7, r6);     // Catch: Throwable -> L49
    L51:
        r6.f(r1, new WeakReference(r2));     // Catch: Throwable -> L49
        monitor-exit(this);
        return r9;
    L54:
        monitor-exit(this);
        return r9;
    L49:
        th = move-exception;
        throw th;
    L58:
        return r9;
    L30:
        if (r8 != R.drawable.abc_cab_background_top_material) goto L33;
        r9 = new LayerDrawable(new Drawable[]{d(r7, R.drawable.abc_cab_background_internal_bg), d(r7, R.drawable.abc_cab_background_top_mtrl_alpha)});
        goto L41
    L33:
        if (r8 != R.drawable.abc_ratingbar_material) goto L36;
        r9 = ml3.n(this, r7, R.dimen.abc_star_big);
        goto L41
    L36:
        if (r8 != R.drawable.abc_ratingbar_indicator_material) goto L39;
        r9 = ml3.n(this, r7, R.dimen.abc_star_medium);
        goto L41
    L39:
        if (r8 != R.drawable.abc_ratingbar_small_material) goto L28;
        r9 = ml3.n(this, r7, R.dimen.abc_star_small);
        goto L41
    L12:
        WeakReference r10 = (WeakReference) r3.b(r1);     // Catch: Throwable -> L19
        if (r10 == null) goto L22;
        Drawable.ConstantState r11 = (Drawable.ConstantState) r10.get();     // Catch: Throwable -> L19
        if (r11 == null) goto L21;
        r5 = r11.newDrawable(r7.getResources());     // Catch: Throwable -> L19
        monitor-exit(this);
        goto L24
    L21:
        r3.g(r1);     // Catch: Throwable -> L19
    L22:
        monitor-exit(this);
    L19:
        th = move-exception;
        throw th;
    }

    public final synchronized Drawable d(Context r2, int r3) {
        monitor-enter(this);
        Drawable r4 = e(r2, r3, false);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r4;
    L7:
        th = move-exception;
        throw th;
    }

    public final synchronized Drawable e(Context r3, int r4, boolean r5) {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.d == true) goto L12;
        this.d = true;     // Catch: Throwable -> L15
        Drawable r0 = d(r3, R.drawable.abc_vector_test);     // Catch: Throwable -> L15
        if (r0 == null) goto L24;
        if ((r0 instanceof z35) == true) goto L12;
        if ("android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName()) == true) goto L12;
    L24:
        this.d = false;     // Catch: Throwable -> L15
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");     // Catch: Throwable -> L15
    L12:
        Drawable r1 = b(r3, r4);     // Catch: Throwable -> L15
        if (r1 != null) goto L17;
        r1 = r3.getDrawable(r4);     // Catch: Throwable -> L15
    L17:
        if (r1 == null) goto L19;
        r1 = h(r3, r4, r5, r1);     // Catch: Throwable -> L15
    L19:
        if (r1 == null) goto L21;
        aw0.a(r1);     // Catch: Throwable -> L15
    L21:
        monitor-exit(this);
        return r1;
    }

    public final synchronized ColorStateList g(Context r3, int r4) {
        monitor-enter(this);
        WeakHashMap r0 = this.a;     // Catch: Throwable -> L17
        ColorStateList r1 = null;
        if (r0 == null) goto L8;
        mj4 r2 = (mj4) r0.get(r3);     // Catch: Throwable -> L17
        if (r2 == null) goto L8;
        ColorStateList r5 = (ColorStateList) r2.b(r4);     // Catch: Throwable -> L17
    L9:
        if (r5 != null) goto L20;
        ml3 r6 = this.e;     // Catch: Throwable -> L17
        if (r6 == null) goto L14;
        r1 = r6.o(r3, r4);     // Catch: Throwable -> L17
    L14:
        if (r1 == null) goto L19;
        a(r3, r4, r1);     // Catch: Throwable -> L17
    L19:
        r5 = r1;
    L20:
        monitor-exit(this);
        return r5;
    L8:
        r5 = null;
    L17:
        th = move-exception;
        throw th;
    }

    public final Drawable h(Context r9, int r10, boolean r11, Drawable r12) {
        ColorStateList r0 = g(r9, r10);
        PorterDuff.Mode r1 = null;
        if (r0 == null) goto L13;
        Drawable r13 = r12.mutate();
        r13.setTintList(r0);
        if (this.e != null) goto L8;
    L10:
        if (r1 == null) goto L12;
        r13.setTintMode(r1);
    L12:
        return r13;
    L8:
        if (r10 != R.drawable.abc_switch_thumb_material) goto L10;
        r1 = PorterDuff.Mode.MULTIPLY;
        goto L10
    L13:
        ml3 r2 = this.e;
        int r3 = R.attr.colorControlNormal;
        if (r2 != null) goto L16;
    L27:
        ml3 r8 = this.e;
        boolean r4 = false;
        if (r8 == null) goto L51;
        PorterDuff.Mode r5 = fg.b;
        if (ml3.i((int[]) r8.a, r10) == false) goto L34;
    L31:
        boolean r14 = true;
    L32:
        int r15 = -1;
    L46:
        if (r14 == false) goto L51;
        Drawable r16 = r12.mutate();
        r16.setColorFilter(fg.c(gt4.c(r9, r3), r5));
        if (r15 == (-1)) goto L50;
        r16.setAlpha(r15);
    L50:
        r4 = true;
        goto L51
    L34:
        if (ml3.i((int[]) r8.c, r10) == false) goto L36;
        r3 = R.attr.colorControlActivated;
        goto L31
    L36:
        boolean r17 = ml3.i((int[]) r8.d, r10);
        r3 = android.R.attr.colorBackground;
        if (r17 == false) goto L40;
        r5 = PorterDuff.Mode.MULTIPLY;
        goto L31
    L40:
        if (r10 != R.drawable.abc_list_divider_mtrl_alpha) goto L43;
        r15 = Math.round(40.8f);
        r3 = android.R.attr.colorForeground;
        r14 = true;
        goto L46
    L43:
        if (r10 == R.drawable.abc_dialog_material_background) goto L31;
        r14 = false;
        r3 = 0;
    L51:
        if (r4 == true) goto L54;
        if (r11 == false) goto L54;
        return null;
    L54:
        return r12;
    L16:
        if (r10 != R.drawable.abc_seekbar_track_material) goto L20;
        LayerDrawable r18 = (LayerDrawable) r12;
        Drawable r19 = r18.findDrawableByLayerId(android.R.id.background);
        int r110 = gt4.c(r9, R.attr.colorControlNormal);
        PorterDuff.Mode r6 = fg.b;
        ml3.t(r19, r110, r6);
        ml3.t(r18.findDrawableByLayerId(android.R.id.secondaryProgress), gt4.c(r9, R.attr.colorControlNormal), r6);
        ml3.t(r18.findDrawableByLayerId(android.R.id.progress), gt4.c(r9, R.attr.colorControlActivated), r6);
        return r12;
    L20:
        if (r10 != R.drawable.abc_ratingbar_material) goto L22;
    L25:
        LayerDrawable r20 = (LayerDrawable) r12;
        Drawable r111 = r20.findDrawableByLayerId(android.R.id.background);
        int r112 = gt4.b(r9, R.attr.colorControlNormal);
        PorterDuff.Mode r7 = fg.b;
        ml3.t(r111, r112, r7);
        ml3.t(r20.findDrawableByLayerId(android.R.id.secondaryProgress), gt4.c(r9, R.attr.colorControlActivated), r7);
        ml3.t(r20.findDrawableByLayerId(android.R.id.progress), gt4.c(r9, R.attr.colorControlActivated), r7);
        return r12;
    L22:
        if (r10 == R.drawable.abc_ratingbar_indicator_material) goto L25;
        if (r10 != R.drawable.abc_ratingbar_small_material) goto L27;
        goto L25
    }
}
