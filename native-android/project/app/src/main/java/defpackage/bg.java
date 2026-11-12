package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bg extends pf implements ou2, LayoutInflater.Factory2 {
    public static final yd4 u0 = null;
    public static final int[] v0 = null;
    public static final boolean w0 = false;
    public l93 A;
    public no4 B;
    public CharSequence C;
    public ActionBarOverlayLayout D;
    public zh0 E;
    public rf F;
    public d5 G;
    public ActionBarContextView H;
    public PopupWindow I;
    public qf J;
    public s75 K;
    public final boolean L;
    public boolean M;
    public ViewGroup N;
    public TextView O;
    public View P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public ag[] Y;
    public ag Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public Configuration e0;
    public final int f0;
    public int g0;
    public int h0;
    public boolean i0;
    public yf j0;
    public yf k0;
    public boolean l0;
    public int m0;
    public final qf n0;
    public boolean o0;
    public Rect p0;
    public Rect q0;
    public th r0;
    public OnBackInvokedDispatcher s0;
    public OnBackInvokedCallback t0;
    public final Object w;
    public final Context x;
    public Window y;
    public xf z;

    static {
        u0 = new yd4(0);
        v0 = new int[]{R.attr.windowBackground};
        w0 = !"robolectric".equals(Build.FINGERPRINT);
    }

    public bg(Context r4, Window r5, gf r6, Object r7) {
        df r8 = null;
        this.K = null;
        this.L = true;
        this.f0 = -100;
        this.n0 = new qf(this, 0);
        this.x = r4;
        this.w = r7;
        if ((r7 instanceof Dialog) == false) goto L14;
    L4:
        if (r4 == null) goto L11;
        if ((r4 instanceof df) == true) goto L7;
        if ((r4 instanceof ContextWrapper) == false) goto L11;
        r4 = ((ContextWrapper) r4).getBaseContext();
        goto L4
    L7:
        r8 = (df) r4;
    L11:
        if (r8 == null) goto L14;
        this.f0 = ((bg) r8.m()).f0;
    L14:
        if (this.f0 != (-100)) goto L18;
        String r9 = this.w.getClass().getName();
        yd4 r10 = u0;
        Integer r11 = (Integer) r10.get(r9);
        if (r11 == null) goto L18;
        this.f0 = r11.intValue();
        r10.remove(this.w.getClass().getName());
    L18:
        if (r5 == null) goto L20;
        s(r5);
    L20:
        fg.d();
    }

    public static wd2 t(Context r6) {
        if (Build.VERSION.SDK_INT >= 33) goto L30;
        wd2 r0 = pf.p;
        if (r0 != null) goto L9;
        return null;
    L9:
        xd2 r1 = r0.a;
        wd2 r7 = uf.b(r6.getApplicationContext().getResources().getConfiguration());
        if (r1.a.isEmpty() == false) goto L12;
        wd2 r2 = wd2.b;
    L24:
        if (r2.a.a.isEmpty() == false) goto L26;
        return r7;
    L26:
        return r2;
    L12:
        LinkedHashSet r3 = new LinkedHashSet();
        int r4 = 0;
    L13:
        int r5 = r0.b();
        if (r4 >= (r7.b() + r5)) goto L22;
        if (r4 >= r0.b()) goto L18;
        Locale r8 = r1.a.get(r4);
    L19:
        if (r8 == null) goto L21;
        r3.add(r8);
    L21:
        r4 = r4 + 1;
        goto L13
    L18:
        int r9 = r4 - r0.b();
        r8 = r7.a.a.get(r9);
        goto L19
    L22:
        r2 = new wd2(new xd2(new LocaleList((Locale[]) r3.toArray(new Locale[r3.size()]))));
        goto L24
    L30:
        return null;
    }

    public static Configuration x(Context r1, int r2, wd2 r3, Configuration r4, boolean r5) {
        if (r2 != 1) goto L5;
        int r6 = 16;
    L11:
        Configuration r7 = new Configuration();
        r7.fontScale = 0.0f;
        if (r4 == null) goto L14;
        r7.setTo(r4);
    L14:
        r7.uiMode = r6 | (r7.uiMode & (-49));
        if (r3 == null) goto L17;
        uf.d(r7, r3);
    L17:
        return r7;
    L5:
        if (r2 == 2) goto L9;
        if (r5 == false) goto L8;
        r6 = 0;
        goto L11
    L8:
        r6 = r1.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        goto L11
    L9:
        r6 = 32;
        goto L11
    }

    public final void A(int r4) {
        ag r0 = F(r4);
        if (r0.h == null) goto L8;
        Bundle r1 = new Bundle();
        r0.h.u(r1);
        if (r1.size() <= 0) goto L7;
        r0.p = r1;
    L7:
        r0.h.y();
        r0.h.clear();
    L8:
        r0.o = true;
        r0.n = true;
        if (r4 == 108) goto L12;
        if (r4 == 0) goto L12;
        return;
    L12:
        if (this.D == null) goto L16;
        ag r2 = F(0);
        r2.k = false;
        M(r2, null);
        return;
    }

    public final void B() {
        if (this.M == true) goto L110;
        Context r0 = this.x;
        int[] r1 = st3.j;
        TypedArray r2 = r0.obtainStyledAttributes(r1);
        if (r2.hasValue(117) == true) goto L7;
        r2.recycle();
        kf2.o("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        return;
    L7:
        if (r2.getBoolean(126, false) == false) goto L10;
        i(1);
    L13:
        if (r2.getBoolean(118, false) == false) goto L16;
        i(109);
    L16:
        if (r2.getBoolean(119, false) == false) goto L18;
        i(10);
    L18:
        this.V = r2.getBoolean(0, false);
        r2.recycle();
        C();
        this.y.getDecorView();
        LayoutInflater r3 = LayoutInflater.from(r0);
        if (this.W == true) goto L40;
        if (this.V == false) goto L24;
        ViewGroup r4 = (ViewGroup) r3.inflate(app.homemusic.R.layout.abc_dialog_title_material, null);
        this.T = false;
        this.S = false;
    L43:
        if (r4 == null) goto L104;
        rf r5 = new rf(this);
        WeakHashMap r6 = j65.a;
        a65.c(r4, r5);
        if (this.D != null) goto L47;
        this.O = (TextView) r4.findViewById(app.homemusic.R.id.title);
    L47:
        boolean r7 = e85.a;
        Method r9 = r4.getClass().getMethod("makeOptionalFitsSystemWindows", null);     // Catch: IllegalAccessException -> L51 InvocationTargetException -> L53 NoSuchMethodException -> L59
        if (r9.isAccessible() == true) goto L55;
        r9.setAccessible(true);     // Catch: IllegalAccessException -> L51 InvocationTargetException -> L53 NoSuchMethodException -> L59
    L55:
        r9.invoke(r4, null);     // Catch: IllegalAccessException -> L51 InvocationTargetException -> L53 NoSuchMethodException -> L59
    L60:
        ContentFrameLayout r8 = (ContentFrameLayout) r4.findViewById(app.homemusic.R.id.action_bar_activity_content);
        ViewGroup r10 = (ViewGroup) this.y.findViewById(R.id.content);
        if (r10 != null) goto L63;
    L68:
        this.y.setContentView(r4);
        r8.setAttachListener(new zg5(this));
        this.N = r4;
        Object r11 = this.w;
        if ((r11 instanceof Activity) == false) goto L71;
        CharSequence r12 = ((Activity) r11).getTitle();
    L73:
        if (TextUtils.isEmpty(r12) == true) goto L83;
        ActionBarOverlayLayout r13 = this.D;
        if (r13 == null) goto L77;
        r13.setWindowTitle(r12);
        goto L83
    L77:
        l93 r14 = this.A;
        if (r14 == null) goto L80;
        r14.l0(r12);
        goto L83
    L80:
        TextView r15 = this.O;
        if (r15 == null) goto L83;
        r15.setText(r12);
    L83:
        ContentFrameLayout r16 = (ContentFrameLayout) this.N.findViewById(R.id.content);
        View r17 = this.y.getDecorView();
        r16.t.set(r17.getPaddingLeft(), r17.getPaddingTop(), r17.getPaddingRight(), r17.getPaddingBottom());
        if (r16.isLaidOut() == false) goto L86;
        r16.requestLayout();
    L86:
        TypedArray r18 = r0.obtainStyledAttributes(r1);
        r18.getValue(124, r16.getMinWidthMajor());
        r18.getValue(125, r16.getMinWidthMinor());
        if (r18.hasValue(122) == false) goto L90;
        r18.getValue(122, r16.getFixedWidthMajor());
    L90:
        if (r18.hasValue(123) == false) goto L93;
        r18.getValue(123, r16.getFixedWidthMinor());
    L93:
        if (r18.hasValue(120) == false) goto L96;
        r18.getValue(120, r16.getFixedHeightMajor());
    L96:
        if (r18.hasValue(121) == false) goto L98;
        r18.getValue(121, r16.getFixedHeightMinor());
    L98:
        r18.recycle();
        r16.requestLayout();
        this.M = true;
        ag r19 = F(0);
        if (this.d0 == false) goto L101;
        return;
    L101:
        if (r19.h != null) goto L112;
        H(108);
        return;
    L112:
        return;
    L71:
        r12 = this.C;
    L63:
        if (r10.getChildCount() <= 0) goto L65;
        View r110 = r10.getChildAt(0);
        r10.removeViewAt(0);
        r8.addView(r110);
        goto L63
    L65:
        r10.setId(-1);
        r8.setId(R.id.content);
        if ((r10 instanceof FrameLayout) == false) goto L68;
        ((FrameLayout) r10).setForeground(null);
        goto L68
    L51:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
    L59:
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
    L53:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        goto L60
    L104:
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.S + ", windowActionBarOverlay: " + this.T + ", android:windowIsFloating: " + this.V + ", windowActionModeOverlay: " + this.U + ", windowNoTitle: " + this.W + " }");
    L24:
        if (this.S == false) goto L38;
        TypedValue r20 = new TypedValue();
        r0.getTheme().resolveAttribute(app.homemusic.R.attr.actionBarTheme, r20, true);
        if (r20.resourceId == 0) goto L28;
        Context r21 = new ud0(r0, r20.resourceId);
    L29:
        r4 = (ViewGroup) LayoutInflater.from(r21).inflate(app.homemusic.R.layout.abc_screen_toolbar, null);
        ActionBarOverlayLayout r22 = (ActionBarOverlayLayout) r4.findViewById(app.homemusic.R.id.decor_content_parent);
        this.D = r22;
        r22.setWindowCallback(this.y.getCallback());
        if (this.T == false) goto L33;
        this.D.j(109);
    L33:
        if (this.Q == false) goto L36;
        this.D.j(2);
    L36:
        if (this.R == false) goto L43;
        this.D.j(5);
        goto L43
    L28:
        r21 = r0;
        goto L29
    L38:
        r4 = null;
        goto L43
    L40:
        if (this.U == false) goto L42;
        r4 = (ViewGroup) r3.inflate(app.homemusic.R.layout.abc_screen_simple_overlay_action_mode, null);
        goto L43
    L42:
        r4 = (ViewGroup) r3.inflate(app.homemusic.R.layout.abc_screen_simple, null);
        goto L43
    L10:
        if (r2.getBoolean(117, false) == false) goto L13;
        i(108);
        goto L13
    }

    public final void C() {
        if (this.y != null) goto L8;
        Object r0 = this.w;
        if ((r0 instanceof Activity) == false) goto L8;
        s(((Activity) r0).getWindow());
    L8:
        if (this.y == null) goto L10;
        return;
    L10:
        kf2.o("We have not been given a Window");
    }

    public final Context D() {
        G();
        l93 r0 = this.A;
        if (r0 == null) goto L5;
        Context r1 = r0.J();
    L6:
        if (r1 == null) goto L8;
        return r1;
    L8:
        return this.x;
    L5:
        r1 = null;
        goto L6
    }

    public final b3 E(Context r4) {
        if (this.j0 != null) goto L9;
        if (qp4.d != null) goto L7;
        Context r5 = r4.getApplicationContext();
        qp4.d = new qp4(r5, (LocationManager) r5.getSystemService("location"));
    L7:
        this.j0 = new yf(this, qp4.d);
    L9:
        return this.j0;
    }

    public final ag F(int r5) {
        ag[] r0 = this.Y;
        if (r0 != null) goto L5;
    L6:
        ag[] r2 = new ag[r5 + 1];
        if (r0 == null) goto L9;
        System.arraycopy(r0, 0, r2, 0, r0.length);
    L9:
        this.Y = r2;
        r0 = r2;
    L10:
        ag r4 = r0[r5];
        if (r4 != null) goto L14;
        ag r6 = new ag();
        r6.a = r5;
        r6.n = false;
        r0[r5] = r6;
        return r6;
    L14:
        return r4;
    L5:
        if (r0.length > r5) goto L10;
        goto L6
    }

    public final void G() {
        B();
        if (this.S == true) goto L5;
        return;
    L5:
        if (this.A != null) goto L19;
        Object r0 = this.w;
        if ((r0 instanceof Activity) == false) goto L11;
        this.A = new ia5((Activity) r0, this.T);
    L13:
        l93 r1 = this.A;
        if (r1 == null) goto L18;
        r1.e0(this.o0);
        return;
    L18:
        return;
    L11:
        if ((r0 instanceof Dialog) == false) goto L13;
        this.A = new ia5((Dialog) r0);
        goto L13
    }

    public final void H(int r3) {
        int r4 = 1 << r3;
        this.m0 = r4 | this.m0;
        if (this.l0 == true) goto L6;
        View r5 = this.y.getDecorView();
        WeakHashMap r0 = j65.a;
        r5.postOnAnimation(this.n0);
        this.l0 = true;
        return;
    }

    public final int I(Context r3, int r4) {
        if (r4 == (-100)) goto L25;
        if (r4 == (-1)) goto L24;
        if (r4 == 0) goto L20;
        if (r4 == 1) goto L24;
        if (r4 == 2) goto L24;
        if (r4 == 3) goto L13;
        kf2.o("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        return 0;
    L13:
        if (this.k0 != null) goto L16;
        this.k0 = new yf(this, r3);
    L16:
        return this.k0.g();
    L20:
        if (((UiModeManager) r3.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) goto L25;
        return E(r3).g();
    L24:
        return r4;
    L25:
        return -1;
    }

    public final boolean J() {
        boolean r0 = this.a0;
        this.a0 = false;
        ag r2 = F(0);
        if (r2.m == false) goto L7;
        if (r0 == true) goto L15;
        w(r2, true);
        return true;
    L15:
        return true;
    L7:
        d5 r1 = this.G;
        if (r1 == null) goto L11;
        r1.a();
        return true;
    L11:
        G();
        l93 r5 = this.A;
        if (r5 != null) goto L14;
    L16:
        return false;
    L14:
        if (r5.s() == false) goto L16;
        goto L15
    }

    public final void K(ag r14, KeyEvent r15) {
        boolean r0 = r14.m;
        int r1 = r14.a;
        if (r0 == false) goto L5;
        return;
    L5:
        if (this.d0 == true) goto L99;
        Context r2 = this.x;
        if (r1 == 0) goto L10;
    L12:
        Window.Callback r3 = this.y.getCallback();
        if (r3 != null) goto L15;
    L18:
        WindowManager r4 = (WindowManager) r2.getSystemService("window");
        if (r4 != null) goto L22;
        return;
    L22:
        if (M(r14, r15) == false) goto L102;
        zf r16 = r14.e;
        if (r16 != null) goto L27;
    L36:
        if (r16 != null) goto L46;
        Context r17 = D();
        TypedValue r5 = new TypedValue();
        Resources.Theme r6 = r17.getResources().newTheme();
        r6.setTo(r17.getTheme());
        r6.resolveAttribute(app.homemusic.R.attr.actionBarPopupTheme, r5, true);
        int r7 = r5.resourceId;
        if (r7 == 0) goto L40;
        r6.applyStyle(r7, true);
    L40:
        r6.resolveAttribute(app.homemusic.R.attr.panelMenuListTheme, r5, true);
        int r8 = r5.resourceId;
        if (r8 == 0) goto L43;
        r6.applyStyle(r8, true);
    L44:
        ud0 r9 = new ud0(r17, 0);
        r9.getTheme().setTo(r6);
        r14.j = r9;
        TypedArray r18 = r9.obtainStyledAttributes(st3.j);
        r14.b = r18.getResourceId(86, 0);
        r14.d = r18.getResourceId(1, 0);
        r18.recycle();
        r14.e = new zf(this, r14.j);
        r14.c = 81;
    L50:
        View r19 = r14.g;
        if (r19 == null) goto L54;
        r14.f = r19;
    L71:
        if (r14.f != null) goto L74;
    L95:
        r14.n = true;
        return;
    L74:
        if (r14.g != null) goto L81;
        ub2 r110 = r14.i;
        if (r110.s != null) goto L80;
        r110.s = new tb2(r110);
    L80:
        if (r110.s.getCount() <= 0) goto L95;
    L81:
        ViewGroup.LayoutParams r111 = r14.f.getLayoutParams();
        if (r111 != null) goto L84;
        r111 = new ViewGroup.LayoutParams(-2, -2);
    L84:
        r14.e.setBackgroundResource(r14.b);
        ViewParent r10 = r14.f.getParent();
        if ((r10 instanceof ViewGroup) == false) goto L87;
        ((ViewGroup) r10).removeView(r14.f);
    L87:
        r14.e.addView(r14.f, r111);
        if (r14.f.hasFocus() == true) goto L90;
        r14.f.requestFocus();
    L90:
        int r11 = -2;
    L91:
        r14.l = false;
        WindowManager.LayoutParams r12 = new WindowManager.LayoutParams(r11, -2, 0, 0, 1002, 8519680, -3);
        r12.gravity = r14.c;
        r12.windowAnimations = r14.d;
        r4.addView(r14.e, r12);
        r14.m = true;
        if (r1 != 0) goto L98;
        O();
        return;
    L98:
        return;
    L54:
        if (r14.h == null) goto L95;
        if (this.F != null) goto L59;
        this.F = new rf(this);
    L59:
        rf r112 = this.F;
        if (r14.i != null) goto L62;
        ub2 r13 = new ub2(r14.j);
        r14.i = r13;
        r13.r = r112;
        qu2 r113 = r14.h;
        r113.b(r13, r113.a);
    L62:
        ub2 r114 = r14.i;
        zf r20 = r14.e;
        if (r114.q != null) goto L68;
        r114.q = (ExpandedMenuView) r114.o.inflate(app.homemusic.R.layout.abc_expanded_menu_layout, r20, false);
        if (r114.s != null) goto L67;
        r114.s = new tb2(r114);
    L67:
        r114.q.setAdapter(r114.s);
        r114.q.setOnItemClickListener(r114);
    L68:
        ExpandedMenuView r115 = r114.q;
        r14.f = r115;
        if (r115 == null) goto L95;
    L43:
        r6.applyStyle(app.homemusic.R.style.Theme_AppCompat_CompactMenu, true);
        goto L44
    L46:
        if (r14.n == false) goto L50;
        if (r16.getChildCount() <= 0) goto L50;
        r14.e.removeAllViews();
        goto L50
    L27:
        if (r14.n == true) goto L36;
        View r116 = r14.g;
        if (r116 == null) goto L90;
        ViewGroup.LayoutParams r117 = r116.getLayoutParams();
        if (r117 == null) goto L90;
        if (r117.width != (-1)) goto L90;
        r11 = -1;
        goto L91
    L102:
        return;
    L15:
        if (r3.onMenuOpened(r1, r14.h) == true) goto L18;
        w(r14, true);
        return;
    L10:
        if ((r2.getResources().getConfiguration().screenLayout & 15) != 4) goto L12;
        return;
    }

    public final boolean L(ag r3, int r4, KeyEvent r5) {
        if (r5.isSystem() == false) goto L6;
        return false;
    L6:
        if (r3.k == false) goto L8;
    L9:
        qu2 r2 = r3.h;
        if (r2 != null) goto L12;
        return false;
    L12:
        return r2.performShortcut(r4, r5, 1);
    L8:
        if (M(r3, r5) == true) goto L9;
        return false;
    }

    public final boolean M(ag r13, KeyEvent r14) {
        if (this.d0 == true) goto L81;
        boolean r0 = r13.k;
        int r2 = r13.a;
        if (r0 == false) goto L8;
        return true;
    L8:
        ag r1 = this.Z;
        if (r1 == null) goto L12;
        if (r1 == r13) goto L12;
        w(r1, false);
    L12:
        Window.Callback r3 = this.y.getCallback();
        if (r3 == null) goto L16;
        r13.g = r3.onCreatePanelView(r2);
    L16:
        if (r2 == 0) goto L20;
        if (r2 == 108) goto L20;
        boolean r5 = false;
    L21:
        if (r5 == false) goto L26;
        ActionBarOverlayLayout r6 = this.D;
        if (r6 == null) goto L26;
        r6.k();
        ((gv4) r6.r).l = true;
    L26:
        if (r13.g != null) goto L102;
        if (r5 == true) goto L29;
    L30:
        qu2 r7 = r13.h;
        if (r7 != null) goto L33;
    L34:
        if (r7 != null) goto L62;
        Context r8 = this.x;
        if (r2 == 0) goto L39;
        if (r2 == 108) goto L39;
    L51:
        qu2 r4 = new qu2(r8);
        r4.e = this;
        qu2 r9 = r13.h;
        if (r4 == r9) goto L60;
        if (r9 == null) goto L56;
        r9.r(r13.i);
    L56:
        r13.h = r4;
        ub2 r10 = r13.i;
        if (r10 == null) goto L60;
        r4.b(r10, r4.a);
    L60:
        if (r13.h != null) goto L62;
    L39:
        if (this.D == null) goto L51;
        TypedValue r11 = new TypedValue();
        Resources.Theme r12 = r8.getTheme();
        r12.resolveAttribute(app.homemusic.R.attr.actionBarTheme, r11, true);
        if (r11.resourceId == 0) goto L43;
        Resources.Theme r15 = r8.getResources().newTheme();
        r15.setTo(r12);
        r15.applyStyle(r11.resourceId, true);
        r15.resolveAttribute(app.homemusic.R.attr.actionBarWidgetTheme, r11, true);
    L45:
        if (r11.resourceId == 0) goto L49;
        if (r15 != null) goto L48;
        r15 = r8.getResources().newTheme();
        r15.setTo(r12);
    L48:
        r15.applyStyle(r11.resourceId, true);
    L49:
        if (r15 == null) goto L51;
        ud0 r16 = new ud0(r8, 0);
        r16.getTheme().setTo(r15);
        r8 = r16;
        goto L51
    L43:
        r12.resolveAttribute(app.homemusic.R.attr.actionBarWidgetTheme, r11, true);
        r15 = null;
    L62:
        if (r5 == false) goto L69;
        ActionBarOverlayLayout r17 = this.D;
        if (r17 == null) goto L69;
        if (this.E != null) goto L68;
        this.E = new zh0(6, this);
    L68:
        r17.l(r13.h, this.E);
    L69:
        r13.h.y();
        if (r3.onCreatePanelMenu(r2, r13.h) == true) goto L82;
        qu2 r18 = r13.h;
        if (r18 == null) goto L77;
        if (r18 == null) goto L76;
        r18.r(r13.i);
    L76:
        r13.h = null;
    L77:
        if (r5 == false) goto L81;
        ActionBarOverlayLayout r19 = this.D;
        if (r19 == null) goto L81;
        r19.l(null, this.E);
        goto L81
    L82:
        r13.o = false;
    L83:
        r13.h.y();
        Bundle r20 = r13.p;
        if (r20 == null) goto L87;
        r13.h.s(r20);
        r13.p = null;
    L87:
        if (r3.onPreparePanel(0, r13.g, r13.h) == true) goto L94;
        if (r5 == false) goto L92;
        ActionBarOverlayLayout r110 = this.D;
        if (r110 == null) goto L92;
        r110.l(null, this.E);
    L92:
        r13.h.x();
        return false;
    L94:
        if (r14 == null) goto L96;
        int r111 = r14.getDeviceId();
    L98:
        if (KeyCharacterMap.load(r111).getKeyboardType() == 1) goto L100;
        boolean r112 = true;
    L101:
        r13.h.setQwertyMode(r112);
        r13.h.x();
        goto L102
    L100:
        r112 = false;
        goto L101
    L96:
        r111 = -1;
        goto L98
    L33:
        if (r13.o == false) goto L83;
    L29:
        if ((this.A instanceof cv4) == false) goto L30;
    L102:
        r13.k = true;
        r13.l = false;
        this.Z = r13;
        return true;
    L20:
        r5 = true;
    L81:
        return false;
    }

    public final void N() {
        if (this.M == true) goto L6;
        return;
    L6:
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void O() {
        if (Build.VERSION.SDK_INT < 33) goto L23;
        boolean r1 = false;
        if (this.s0 != null) goto L8;
    L13:
        if (r1 == true) goto L15;
    L18:
        if (r1 == true) goto L24;
        OnBackInvokedCallback r0 = this.t0;
        if (r0 == null) goto L25;
        wf.c(this.s0, r0);
        this.t0 = null;
        return;
    L25:
        return;
    L24:
        return;
    L15:
        if (this.t0 != null) goto L18;
        this.t0 = wf.b(this.s0, this);
        return;
    L8:
        if (F(0).m == false) goto L11;
    L9:
        r1 = true;
        goto L13
    L11:
        if (this.G == null) goto L13;
    }

    @Override // defpackage.pf
    public final void c() {
        LayoutInflater r0 = LayoutInflater.from(this.x);
        if (r0.getFactory() != null) goto L7;
        r0.setFactory2(this);
        return;
    L7:
        if ((r0.getFactory2() instanceof bg) == true) goto L10;
        Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        return;
    }

    @Override // defpackage.pf
    public final void d() {
        if (this.A == null) goto L9;
        G();
        if (this.A.L() == true) goto L10;
        H(0);
        return;
    L10:
        return;
    }

    @Override // defpackage.pf
    public final void f() {
        this.b0 = true;
        r(false, true);
        C();
        Object r1 = this.w;
        if ((r1 instanceof Activity) == true) goto L26;
    L24:
        this.e0 = new Configuration(this.x.getResources().getConfiguration());
        this.c0 = true;
        return;
    L26:
        Activity r2 = (Activity) r1;     // Catch: IllegalArgumentException -> L10
        String r3 = te5.A(r2, r2.getComponentName());     // Catch: PackageManager.NameNotFoundException -> L7 IllegalArgumentException -> L10
    L11:
        if (r3 == null) goto L16;
        l93 r4 = this.A;
        if (r4 != null) goto L15;
        this.o0 = true;
        goto L16
    L15:
        r4.e0(true);
    L16:
        Object r5 = pf.u;
        monitor-enter(r5);
        pf.h(this);     // Catch: Throwable -> L21
        pf.t.add(new WeakReference(this));     // Catch: Throwable -> L21
        monitor-exit(r5);     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        throw th;
    L7:
        e = move-exception;
        throw new IllegalArgumentException(e);     // Catch: IllegalArgumentException -> L10
    L10:
        r3 = null;
        goto L11
    }

    @Override // defpackage.pf
    public final void g() {
        if ((this.w instanceof Activity) == false) goto L13;
        Object r0 = pf.u;
        monitor-enter(r0);
        pf.h(this);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    L13:
        if (this.l0 == false) goto L15;
        this.y.getDecorView().removeCallbacks(this.n0);
    L15:
        this.d0 = true;
        if (this.f0 == (-100)) goto L22;
        Object r1 = this.w;
        if ((r1 instanceof Activity) == false) goto L22;
        if (((Activity) r1).isChangingConfigurations() == false) goto L22;
        u0.put(this.w.getClass().getName(), Integer.valueOf(this.f0));
    L23:
        l93 r2 = this.A;
        if (r2 == null) goto L26;
        r2.O();
    L26:
        yf r3 = this.j0;
        if (r3 == null) goto L29;
        r3.c();
    L29:
        yf r4 = this.k0;
        if (r4 == null) goto L35;
        r4.c();
        return;
    L35:
        return;
    L22:
        u0.remove(this.w.getClass().getName());
        goto L23
    }

    @Override // defpackage.pf
    public final boolean i(int r6) {
        if (r6 != 8) goto L6;
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
        r6 = 108;
    L9:
        if (this.W == false) goto L13;
        if (r6 != 108) goto L13;
        return false;
    L13:
        if (this.S == false) goto L16;
        if (r6 != 1) goto L16;
        this.S = false;
    L16:
        if (r6 != 1) goto L18;
        N();
        this.W = true;
        return true;
    L18:
        if (r6 != 2) goto L20;
        N();
        this.Q = true;
        return true;
    L20:
        if (r6 != 5) goto L22;
        N();
        this.R = true;
        return true;
    L22:
        if (r6 == 10) goto L31;
        if (r6 == 108) goto L29;
        if (r6 != 109) goto L26;
        N();
        this.T = true;
        return true;
    L26:
        return this.y.requestFeature(r6);
    L29:
        N();
        this.S = true;
        return true;
    L31:
        N();
        this.U = true;
        return true;
    L6:
        if (r6 != 9) goto L9;
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        r6 = 109;
        goto L9
    }

    @Override // defpackage.pf
    public final void k(int r3) {
        B();
        ViewGroup r0 = (ViewGroup) this.N.findViewById(R.id.content);
        r0.removeAllViews();
        LayoutInflater.from(this.x).inflate(r3, r0);
        this.z.a(this.y.getCallback());
    }

    @Override // defpackage.pf
    public final void l(View r3) {
        B();
        ViewGroup r0 = (ViewGroup) this.N.findViewById(R.id.content);
        r0.removeAllViews();
        r0.addView(r3);
        this.z.a(this.y.getCallback());
    }

    @Override // defpackage.ou2
    public final boolean m(qu2 r7, MenuItem r8) {
        Window.Callback r0 = this.y.getCallback();
        if (r0 != null) goto L5;
    L22:
        return false;
    L5:
        if (this.d0 == true) goto L22;
        qu2 r9 = r7.k();
        ag[] r6 = this.Y;
        if (r6 == null) goto L9;
        int r2 = r6.length;
    L10:
        int r3 = 0;
    L11:
        if (r3 >= r2) goto L18;
        ag r4 = r6[r3];
        if (r4 == null) goto L17;
        if (r4.h != r9) goto L17;
    L19:
        if (r4 == null) goto L22;
        return r0.onMenuItemSelected(r4.a, r8);
    L17:
        r3 = r3 + 1;
        goto L11
    L18:
        r4 = null;
        goto L19
    L9:
        r2 = 0;
        goto L10
    }

    @Override // defpackage.pf
    public final void n(View r3, ViewGroup.LayoutParams r4) {
        B();
        ViewGroup r0 = (ViewGroup) this.N.findViewById(R.id.content);
        r0.removeAllViews();
        r0.addView(r3, r4);
        this.z.a(this.y.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View r9, String r10, Context r11, AttributeSet r12) {
        View r1 = null;
        if (this.r0 != null) goto L11;
        int[] r13 = st3.j;
        Context r0 = this.x;
        TypedArray r14 = r0.obtainStyledAttributes(r13);
        String r2 = r14.getString(116);
        r14.recycle();
        if (r2 != null) goto L143;
        this.r0 = new th();
        goto L11
    L143:
        this.r0 = (th) r0.getClassLoader().loadClass(r2).getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + r2 + ". Falling back to default.", th);
        this.r0 = new th();
    L11:
        th r8 = this.r0;
        int r15 = a45.a;
        r8.getClass();
        TypedArray r16 = r11.obtainStyledAttributes(r12, st3.A, 0, 0);
        byte r3 = 4;
        int r4 = r16.getResourceId(4, 0);
        if (r4 == 0) goto L14;
        Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
    L14:
        r16.recycle();
        if (r4 != 0) goto L17;
    L21:
        Context r17 = r11;
    L22:
        r10.getClass();
        switch(r10.hashCode()) {
            case -1946472170: goto L77;
            case -1455429095: goto L73;
            case -1346021293: goto L69;
            case -938935918: goto L65;
            case -937446323: goto L62;
            case -658531749: goto L58;
            case -339785223: goto L54;
            case 776382189: goto L50;
            case 799298502: goto L46;
            case 1125864064: goto L42;
            case 1413872058: goto L38;
            case 1601505219: goto L34;
            case 1666676343: goto L30;
            case 2001146706: goto L26;
            default: goto L24;
        };
    L24:
        r3 = -1;
    L80:
        switch(r3) {
            case 0: goto L95;
            case 1: goto L94;
            case 2: goto L93;
            case 3: goto L92;
            case 4: goto L91;
            case 5: goto L90;
            case 6: goto L89;
            case 7: goto L88;
            case 8: goto L87;
            case 9: goto L86;
            case 10: goto L85;
            case 11: goto L84;
            case 12: goto L83;
            case 13: goto L82;
            default: goto L81;
        };
    L81:
        View r5 = null;
    L96:
        if (r5 != null) goto L119;
        if (r11 == r17) goto L119;
        Object[] r18 = r8.a;
        if (r10.equals("view") == false) goto L145;
        r10 = r12.getAttributeValue(null, "class");
    L145:
        r18[0] = r17;     // Catch: Throwable -> L110 Exception -> L117
        r18[1] = r12;     // Catch: Throwable -> L110 Exception -> L117
        if ((-1) != r10.indexOf(46)) goto L113;
        int r6 = 0;
    L104:
        String[] r7 = th.g;     // Catch: Throwable -> L110 Exception -> L117
        if (r6 >= 3) goto L112;
        View r19 = r8.f(r17, r10, r7[r6]);     // Catch: Throwable -> L110 Exception -> L117
        if (r19 != null) goto L108;
        r6 = r6 + 1;
        goto L104
    L108:
        r18[0] = null;
        r18[1] = null;
        r1 = r19;
    L118:
        r5 = r1;
        goto L119
    L112:
        r18[0] = null;
        r18[1] = null;
        goto L118
    L113:
        View r20 = r8.f(r17, r10, null);     // Catch: Throwable -> L110 Exception -> L117
        r18[0] = null;
        r18[1] = null;
        r1 = r20;
    L117:
        r18[0] = null;
        r18[1] = null;
    L110:
        th = move-exception;
        r18[0] = null;
        r18[1] = null;
        throw th;
    L119:
        if (r5 == null) goto L142;
        Context r21 = r5.getContext();
        if ((r21 instanceof ContextWrapper) == false) goto L130;
        if (r5.hasOnClickListeners() == false) goto L130;
        TypedArray r22 = r21.obtainStyledAttributes(r12, th.c);
        String r110 = r22.getString(0);
        if (r110 == null) goto L128;
        r5.setOnClickListener(new sh(r5, r110));
    L128:
        r22.recycle();
    L130:
        if (Build.VERSION.SDK_INT > 28) goto L142;
        TypedArray r23 = r17.obtainStyledAttributes(r12, th.d);
        if (r23.hasValue(0) == false) goto L135;
        boolean r111 = r23.getBoolean(0, false);
        WeakHashMap r112 = j65.a;
        new w55(app.homemusic.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(r5, Boolean.valueOf(r111));
    L135:
        r23.recycle();
        TypedArray r24 = r17.obtainStyledAttributes(r12, th.e);
        if (r24.hasValue(0) == false) goto L138;
        j65.p(r5, r24.getString(0));
    L138:
        r24.recycle();
        TypedArray r25 = r17.obtainStyledAttributes(r12, th.f);
        if (r25.hasValue(0) == false) goto L141;
        boolean r26 = r25.getBoolean(0, false);
        WeakHashMap r113 = j65.a;
        new w55(app.homemusic.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(r5, Boolean.valueOf(r26));
    L141:
        r25.recycle();
    L142:
        return r5;
    L82:
        r5 = r8.b(r17, r12);
        goto L96
    L83:
        r5 = new hg(r17, r12, app.homemusic.R.attr.editTextStyle);
        goto L96
    L84:
        r5 = r8.c(r17, r12);
        goto L96
    L85:
        r5 = r8.a(r17, r12);
        goto L96
    L86:
        r5 = new jg(r17, r12, 0);
        goto L96
    L87:
        r5 = new AppCompatToggleButton(r17, r12);
        goto L96
    L88:
        r5 = r8.d(r17, r12);
        goto L96
    L89:
        r5 = new bh(r17, r12);
        goto L96
    L90:
        r5 = new pg(r17, r12, app.homemusic.R.attr.seekBarStyle);
        goto L96
    L91:
        r5 = new AppCompatImageButton(r17, r12);
        goto L96
    L92:
        r5 = r8.e(r17, r12);
        goto L96
    L93:
        r5 = new kg(r17, r12);
        goto L96
    L94:
        r5 = new jf(r17, r12);
        goto L96
    L95:
        r5 = new ng(r17, r12);
        goto L96
    L26:
        if (r10.equals("Button") == false) goto L148;
        r3 = 13;
        goto L80
    L148:
        r3 = -1;
        goto L80
    L30:
        if (r10.equals("EditText") == false) goto L149;
        r3 = 12;
        goto L80
    L149:
        r3 = -1;
        goto L80
    L34:
        if (r10.equals("CheckBox") == false) goto L150;
        r3 = 11;
        goto L80
    L150:
        r3 = -1;
        goto L80
    L38:
        if (r10.equals("AutoCompleteTextView") == false) goto L151;
        r3 = 10;
        goto L80
    L151:
        r3 = -1;
        goto L80
    L42:
        if (r10.equals("ImageView") == false) goto L152;
        r3 = 9;
        goto L80
    L152:
        r3 = -1;
        goto L80
    L46:
        if (r10.equals("ToggleButton") == false) goto L153;
        r3 = 8;
        goto L80
    L153:
        r3 = -1;
        goto L80
    L50:
        if (r10.equals("RadioButton") == false) goto L154;
        r3 = 7;
        goto L80
    L154:
        r3 = -1;
        goto L80
    L54:
        if (r10.equals("Spinner") == false) goto L155;
        r3 = 6;
        goto L80
    L155:
        r3 = -1;
        goto L80
    L58:
        if (r10.equals("SeekBar") == false) goto L156;
        r3 = 5;
        goto L80
    L156:
        r3 = -1;
        goto L80
    L62:
        if (r10.equals("ImageButton") == true) goto L80;
        r3 = -1;
        goto L80
    L65:
        if (r10.equals("TextView") == false) goto L158;
        r3 = 3;
        goto L80
    L158:
        r3 = -1;
        goto L80
    L69:
        if (r10.equals("MultiAutoCompleteTextView") == false) goto L159;
        r3 = 2;
        goto L80
    L159:
        r3 = -1;
        goto L80
    L73:
        if (r10.equals("CheckedTextView") == false) goto L160;
        r3 = 1;
        goto L80
    L160:
        r3 = -1;
        goto L80
    L77:
        if (r10.equals("RatingBar") == false) goto L161;
        r3 = 0;
        goto L80
    L161:
        r3 = -1;
        goto L80
    L17:
        if ((r11 instanceof ud0) == true) goto L19;
    L20:
        r17 = new ud0(r11, r4);
        goto L22
    L19:
        if (((ud0) r11).a == r4) goto L21;
        goto L20
    }

    @Override // defpackage.pf
    public final void p(CharSequence r2) {
        this.C = r2;
        ActionBarOverlayLayout r0 = this.D;
        if (r0 == null) goto L6;
        r0.setWindowTitle(r2);
        return;
    L6:
        l93 r1 = this.A;
        if (r1 == null) goto L10;
        r1.l0(r2);
        return;
    L10:
        TextView r3 = this.O;
        if (r3 == null) goto L14;
        r3.setText(r2);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(boolean r14, boolean r15) {
        boolean r1 = false;
        if (this.d0 == false) goto L5;
        return false;
    L5:
        int r2 = this.f0;
        if (r2 != (-100)) goto L9;
        r2 = pf.o;
    L9:
        Context r0 = this.x;
        int r3 = I(r0, r2);
        int r4 = Build.VERSION.SDK_INT;
        LongSparseArray r6 = null;
        if (r4 >= 33) goto L12;
        wd2 r5 = t(r0);
    L13:
        if (r15 == true) goto L16;
        if (r5 == null) goto L16;
        r5 = uf.b(r0.getResources().getConfiguration());
    L16:
        Configuration r16 = x(r0, r3, r5, null, false);
        boolean r7 = this.i0;
        boolean r8 = true;
        r8 = true;
        r8 = true;
        r8 = true;
        r8 = true;
        r8 = true;
        r8 = true;
        Object r9 = this.w;
        if (r7 == false) goto L19;
    L33:
        this.i0 = true;
        int r10 = this.h0;
    L34:
        Configuration r11 = this.e0;
        if (r11 != null) goto L37;
        r11 = r0.getResources().getConfiguration();
    L37:
        int r12 = r11.uiMode & 48;
        int r13 = r16.uiMode & 48;
        wd2 r17 = uf.b(r11);
        if (r5 != null) goto L40;
        wd2 r18 = null;
    L41:
        if (r12 == r13) goto L43;
        int r19 = 512;
    L44:
        if (r18 == null) goto L49;
        if (r17.equals(r18) == true) goto L49;
        r19 = r19 | 8196;
    L49:
        if (((~r10) & r19) == 0) goto L70;
        if (r14 == false) goto L70;
        if (this.b0 == false) goto L70;
        if (w0 == true) goto L58;
        if (this.c0 == false) goto L70;
    L58:
        if ((r9 instanceof Activity) == false) goto L70;
        Activity r110 = (Activity) r9;
        if (r110.isChild() == true) goto L70;
        int r20 = Build.VERSION.SDK_INT;
        if (r20 >= 31) goto L64;
    L66:
        if (r20 < 28) goto L68;
        r110.recreate();
    L69:
        boolean r111 = true;
    L71:
        if (r111 == true) goto L156;
        if (r19 == 0) goto L156;
        if ((r19 & r10) != r19) goto L76;
        r1 = true;
    L76:
        Resources r112 = r0.getResources();
        Configuration r113 = new Configuration(r112.getConfiguration());
        r113.uiMode = (r112.getConfiguration().uiMode & (-49)) | r13;
        if (r18 == null) goto L79;
        uf.d(r113, r18);
    L79:
        r112.updateConfiguration(r113, null);
        int r21 = Build.VERSION.SDK_INT;
        if (r21 >= 26) goto L140;
        if (r21 >= 28) goto L140;
        if (j51.r == false) goto L182;
    L90:
        Field r22 = j51.q;
        if (r22 == null) goto L140;
        Object r114 = r22.get(r112);     // Catch: IllegalAccessException -> L95
    L97:
        if (r114 == null) goto L140;
        if (j51.l == false) goto L180;
    L106:
        Field r23 = j51.k;
        if (r23 != null) goto L176;
    L112:
        Object r115 = null;
    L113:
        if (r115 == null) goto L140;
        if (j51.n == false) goto L172;
    L121:
        Class r24 = j51.m;
        if (r24 == null) goto L140;
        if (j51.p == false) goto L184;
    L131:
        Field r25 = j51.o;
        if (r25 == null) goto L140;
        r6 = (LongSparseArray) r25.get(r115);     // Catch: IllegalAccessException -> L136
    L138:
        if (r6 == null) goto L140;
        r6.clear();
    L136:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e);
        goto L138
    L184:
        Field r26 = r24.getDeclaredField("mUnthemedEntries");     // Catch: NoSuchFieldException -> L128
        j51.o = r26;     // Catch: NoSuchFieldException -> L128
        r26.setAccessible(true);     // Catch: NoSuchFieldException -> L128
    L130:
        j51.p = true;
    L128:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e);
        goto L130
    L172:
        j51.m = Class.forName("android.content.res.ThemedResourceCache");     // Catch: ClassNotFoundException -> L118
    L120:
        j51.n = true;
    L118:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
        goto L120
    L176:
        r115 = r23.get(r114);     // Catch: IllegalAccessException -> L110
    L110:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e);
        goto L112
    L180:
        Field r27 = r114.getClass().getDeclaredField("mDrawableCache");     // Catch: NoSuchFieldException -> L103
        j51.k = r27;     // Catch: NoSuchFieldException -> L103
        r27.setAccessible(true);     // Catch: NoSuchFieldException -> L103
    L105:
        j51.l = true;
    L103:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e);
    L95:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e);
        r114 = null;
        goto L97
    L182:
        Field r28 = Resources.class.getDeclaredField("mResourcesImpl");     // Catch: NoSuchFieldException -> L87
        j51.q = r28;     // Catch: NoSuchFieldException -> L87
        r28.setAccessible(true);     // Catch: NoSuchFieldException -> L87
    L89:
        j51.r = true;
    L87:
        e = move-exception;
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
    L140:
        int r116 = this.g0;
        if (r116 == 0) goto L143;
        r0.setTheme(r116);
        r0.getTheme().applyStyle(this.g0, true);
    L143:
        if (r1 == true) goto L145;
    L157:
        if (r18 == null) goto L159;
        uf.c(uf.b(r0.getResources().getConfiguration()));
    L159:
        if (r2 != 0) goto L161;
        E(r0).n();
    L164:
        yf r117 = this.k0;
        if (r2 != 3) goto L169;
        if (r117 != null) goto L168;
        this.k0 = new yf(this, r0);
    L168:
        this.k0.n();
    L171:
        return r8;
    L169:
        if (r117 == null) goto L171;
        r117.c();
        goto L171
    L161:
        yf r118 = this.j0;
        if (r118 == null) goto L164;
        r118.c();
        goto L164
    L145:
        if ((r9 instanceof Activity) == false) goto L157;
        Activity r29 = (Activity) r9;
        if ((r29 instanceof ba2) == false) goto L152;
        if (((ba2) r29).h().h.compareTo(r92.p) < 0) goto L157;
        r29.onConfigurationChanged(r113);
        goto L157
    L152:
        if (this.c0 == false) goto L157;
        if (this.d0 == true) goto L157;
        r29.onConfigurationChanged(r113);
    L156:
        r8 = r111;
        goto L157
    L68:
        new Handler(r110.getMainLooper()).post(new a0(r8 ? 1 : 0, r110));
        goto L69
    L64:
        if ((r19 & 8192) == 0) goto L66;
        r110.getWindow().getDecorView().setLayoutDirection(r16.getLayoutDirection());
    L70:
        r111 = false;
        goto L71
    L43:
        r19 = 0;
        goto L44
    L40:
        r18 = uf.b(r16);
        goto L41
    L19:
        if ((r9 instanceof Activity) == false) goto L33;
        PackageManager r30 = r0.getPackageManager();
        if (r30 != null) goto L24;
        r10 = 0;
        goto L34
    L24:
        if (r4 < 29) goto L26;
        int r31 = 269221888;
    L174:
        ActivityInfo r32 = r30.getActivityInfo(new ComponentName(r0, r9.getClass()), r31);     // Catch: PackageManager.NameNotFoundException -> L31
        if (r32 == null) goto L33;
        this.h0 = r32.configChanges;     // Catch: PackageManager.NameNotFoundException -> L31
    L31:
        e = move-exception;
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
        this.h0 = 0;
        goto L33
    L26:
        r31 = 786432;
        goto L174
    L12:
        r5 = null;
        goto L13
    }

    public final void s(Window r8) {
        if (this.y != null) goto L40;
        Window.Callback r1 = r8.getCallback();
        if ((r1 instanceof xf) == true) goto L38;
        xf r0 = new xf(this, r1);
        this.z = r0;
        r8.setCallback(r0);
        Context r2 = this.x;
        TypedArray r3 = r2.obtainStyledAttributes(null, v0);
        if (r3.hasValue(0) == false) goto L18;
        int r4 = r3.getResourceId(0, 0);
        if (r4 == 0) goto L18;
        fg r5 = fg.a();
        monitor-enter(r5);
        Drawable r6 = r5.a.e(r2, r4, true);     // Catch: Throwable -> L15
        monitor-exit(r5);
    L19:
        if (r6 == null) goto L21;
        r8.setBackgroundDrawable(r6);
    L21:
        r3.recycle();
        this.y = r8;
        if (Build.VERSION.SDK_INT < 33) goto L44;
        OnBackInvokedDispatcher r9 = this.s0;
        if (r9 != null) goto L45;
        Object r7 = this.w;
        if (r9 == null) goto L31;
        OnBackInvokedCallback r10 = this.t0;
        if (r10 == null) goto L31;
        wf.c(r9, r10);
        this.t0 = null;
    L31:
        if ((r7 instanceof Activity) == false) goto L35;
        Activity r11 = (Activity) r7;
        if (r11.getWindow() == null) goto L35;
        this.s0 = wf.a(r11);
    L36:
        O();
        return;
    L35:
        this.s0 = null;
        goto L36
    L45:
        return;
    L44:
        return;
    L15:
        th = move-exception;
        throw th;
    L18:
        r6 = null;
        goto L19
    L38:
        kf2.o("AppCompat has already installed itself into the Window");
        return;
    L40:
        kf2.o("AppCompat has already installed itself into the Window");
    }

    public final void u(int r3, ag r4, qu2 r5) {
        if (r5 != null) goto L10;
        if (r4 != null) goto L8;
        if (r3 < 0) goto L8;
        ag[] r0 = this.Y;
        if (r3 >= r0.length) goto L8;
        r4 = r0[r3];
    L8:
        if (r4 == null) goto L10;
        r5 = r4.h;
    L10:
        if (r4 == null) goto L15;
        if (r4.m == true) goto L15;
        return;
    L15:
        if (this.d0 == true) goto L23;
        xf r6 = this.z;
        Window.Callback r2 = this.y.getCallback();
        r6.getClass();
        r6.r = true;     // Catch: Throwable -> L20
        r2.onPanelClosed(r3, r5);     // Catch: Throwable -> L20
        r6.r = false;
        return;
    L20:
        th = move-exception;
        r6.r = false;
        throw th;
    }

    public final void v(qu2 r3) {
        if (this.X == false) goto L5;
        return;
    L5:
        this.X = true;
        ActionBarOverlayLayout r0 = this.D;
        r0.k();
        ActionMenuView r1 = ((gv4) r0.r).a.n;
        if (r1 == null) goto L14;
        y4 r2 = r1.G;
        if (r2 == null) goto L14;
        r2.f();
        t4 r4 = r2.H;
        if (r4 == null) goto L14;
        if (r4.b() == false) goto L14;
        r4.i.dismiss();
    L14:
        Window.Callback r5 = this.y.getCallback();
        if (r5 != null) goto L17;
    L19:
        this.X = false;
        return;
    L17:
        if (this.d0 == true) goto L19;
        r5.onPanelClosed(108, r3);
        goto L19
    }

    public final void w(ag r4, boolean r5) {
        if (r5 == true) goto L4;
    L11:
        WindowManager r0 = (WindowManager) this.x.getSystemService("window");
        if (r0 != null) goto L14;
    L20:
        r4.k = false;
        r4.l = false;
        r4.m = false;
        r4.f = null;
        r4.n = true;
        if (this.Z != r4) goto L24;
        this.Z = null;
    L24:
        if (r4.a != 0) goto L27;
        O();
        return;
    L27:
        return;
    L14:
        if (r4.m == false) goto L20;
        zf r2 = r4.e;
        if (r2 == null) goto L20;
        r0.removeView(r2);
        if (r5 == false) goto L20;
        u(r4.a, r4, null);
        goto L20
    L4:
        if (r4.a != 0) goto L11;
        ActionBarOverlayLayout r1 = this.D;
        if (r1 == null) goto L11;
        r1.k();
        if (((gv4) r1.r).a.p() == false) goto L11;
        v(r4.h);
    }

    @Override // defpackage.ou2
    public final void y(qu2 r6) {
        ActionBarOverlayLayout r7 = this.D;
        if (r7 == null) goto L47;
        r7.k();
        Toolbar r8 = ((gv4) r7.r).a;
        if (r8.getVisibility() != 0) goto L47;
        ActionMenuView r9 = r8.n;
        if (r9 == null) goto L47;
        if (r9.F == false) goto L47;
        if (ViewConfiguration.get(this.x).hasPermanentMenuKey() == false) goto L20;
        ActionBarOverlayLayout r10 = this.D;
        r10.k();
        ActionMenuView r11 = ((gv4) r10.r).a.n;
        if (r11 == null) goto L47;
        y4 r12 = r11.G;
        if (r12 == null) goto L47;
        if (r12.I != null) goto L20;
        if (r12.k() == false) goto L47;
    L20:
        Window.Callback r13 = this.y.getCallback();
        ActionBarOverlayLayout r2 = this.D;
        r2.k();
        if (((gv4) r2.r).a.p() == false) goto L31;
        ActionBarOverlayLayout r0 = this.D;
        r0.k();
        ActionMenuView r1 = ((gv4) r0.r).a.n;
        if (r1 == null) goto L28;
        y4 r3 = r1.G;
        if (r3 == null) goto L28;
        r3.f();
    L28:
        if (this.d0 == true) goto L49;
        r13.onPanelClosed(108, F(0).h);
        return;
    L49:
        return;
    L31:
        if (r13 != null) goto L33;
        return;
    L33:
        if (this.d0 == false) goto L35;
        return;
    L35:
        if (this.l0 == true) goto L37;
    L39:
        ag r4 = F(0);
        qu2 r5 = r4.h;
        if (r5 != null) goto L42;
        return;
    L42:
        if (r4.o == false) goto L44;
        return;
    L44:
        if (r13.onPreparePanel(0, r4.g, r5) == false) goto L54;
        r13.onMenuOpened(108, r4.h);
        ActionBarOverlayLayout r14 = this.D;
        r14.k();
        ((gv4) r14.r).a.v();
        return;
    L54:
        return;
    L37:
        if ((1 & this.m0) == 0) goto L39;
        View r15 = this.y.getDecorView();
        qf r16 = this.n0;
        r15.removeCallbacks(r16);
        r16.run();
    L47:
        ag r17 = F(0);
        r17.n = true;
        w(r17, false);
        K(r17, null);
    }

    public final boolean z(KeyEvent r7) {
        Object r0 = this.w;
        boolean r2 = true;
        if ((r0 instanceof h42) == false) goto L5;
    L6:
        View r1 = this.y.getDecorView();
        if (r1 != null) goto L9;
    L12:
        if (r7.getKeyCode() != 82) goto L21;
        xf r3 = this.z;
        Window.Callback r4 = this.y.getCallback();
        r3.getClass();
        r3.q = true;     // Catch: Throwable -> L18
        boolean r5 = r4.dispatchKeyEvent(r7);     // Catch: Throwable -> L18
        r3.q = false;
        if (r5 == false) goto L21;
    L93:
        return true;
    L18:
        th = move-exception;
        r3.q = false;
        throw th;
    L21:
        int r6 = r7.getKeyCode();
        if (r7.getAction() != 0) goto L38;
        if (r6 == 4) goto L33;
        if (r6 == 82) goto L27;
    L94:
        return false;
    L27:
        if (r7.getRepeatCount() != 0) goto L93;
        ag r8 = F(0);
        if (r8.m == true) goto L93;
        M(r8, r7);
        return true;
    L33:
        if ((r7.getFlags() & 128) != 0) goto L36;
        r2 = false;
    L36:
        this.a0 = r2;
        return false;
    L38:
        if (r6 == 4) goto L92;
        if (r6 != 82) goto L94;
        if (this.G != null) goto L93;
        ag r9 = F(0);
        ActionBarOverlayLayout r10 = this.D;
        Context r11 = this.x;
        if (r10 == null) goto L68;
        r10.k();
        Toolbar r12 = ((gv4) r10.r).a;
        if (r12.getVisibility() != 0) goto L68;
        ActionMenuView r13 = r12.n;
        if (r13 == null) goto L68;
        if (r13.F == false) goto L68;
        if (ViewConfiguration.get(r11).hasPermanentMenuKey() == true) goto L68;
        ActionBarOverlayLayout r14 = this.D;
        r14.k();
        if (((gv4) r14.r).a.p() == false) goto L57;
        ActionBarOverlayLayout r15 = this.D;
        r15.k();
        ActionMenuView r16 = ((gv4) r15.r).a.n;
        if (r16 == null) goto L82;
        y4 r17 = r16.G;
        if (r17 == null) goto L82;
        if (r17.f() == false) goto L82;
    L81:
        boolean r18 = true;
    L84:
        if (r18 == false) goto L93;
        AudioManager r19 = (AudioManager) r11.getApplicationContext().getSystemService("audio");
        if (r19 == null) goto L89;
        r19.playSoundEffect(0);
        return true;
    L89:
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        return true;
    L82:
        r18 = false;
        goto L84
    L57:
        if (this.d0 == true) goto L82;
        if (M(r9, r7) == false) goto L82;
        ActionBarOverlayLayout r20 = this.D;
        r20.k();
        r18 = ((gv4) r20.r).a.v();
    L68:
        boolean r21 = r9.m;
        if (r21 == false) goto L71;
    L83:
        w(r9, true);
        r18 = r21;
        goto L84
    L71:
        if (r9.l == true) goto L83;
        if (r9.k == false) goto L82;
        if (r9.o == false) goto L78;
        r9.k = false;
        boolean r22 = M(r9, r7);
    L79:
        if (r22 == false) goto L82;
        K(r9, r7);
        goto L81
    L78:
        r22 = true;
        goto L79
    L92:
        if (J() == false) goto L94;
    L9:
        if (fu.q(r1, r7) == false) goto L12;
    L5:
        if ((r0 instanceof dg) == false) goto L12;
        goto L6
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String r2, Context r3, AttributeSet r4) {
        return onCreateView(null, r2, r3, r4);
    }
}
