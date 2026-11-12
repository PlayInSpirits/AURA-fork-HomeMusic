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
import android.widget.ListAdapter;
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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bg extends pf implements ou2, LayoutInflater.Factory2 {
    public static final yd4 u0 = new yd4(0);
    public static final int[] v0 = {R.attr.windowBackground};
    public static final boolean w0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public s75 K = null;
    public final boolean L = true;
    public final qf n0 = new qf(this, 0);

    public bg(Context context, Window window, gf gfVar, Object obj) {
        df dfVar = null;
        this.f0 = -100;
        this.x = context;
        this.w = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof df)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    dfVar = (df) context;
                    break;
                }
            }
            if (dfVar != null) {
                this.f0 = ((bg) dfVar.m()).f0;
            }
        }
        if (this.f0 == -100) {
            String name = this.w.getClass().getName();
            yd4 yd4Var = u0;
            Integer num = (Integer) yd4Var.get(name);
            if (num != null) {
                this.f0 = num.intValue();
                yd4Var.remove(this.w.getClass().getName());
            }
        }
        if (window != null) {
            s(window);
        }
        fg.d();
    }

    public static wd2 t(Context context) {
        wd2 wd2Var;
        wd2 wd2Var2;
        if (Build.VERSION.SDK_INT >= 33 || (wd2Var = pf.p) == null) {
            return null;
        }
        xd2 xd2Var = wd2Var.a;
        wd2 wd2VarB = uf.b(context.getApplicationContext().getResources().getConfiguration());
        if (xd2Var.a.isEmpty()) {
            wd2Var2 = wd2.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < wd2VarB.b() + wd2Var.b()) {
                Locale locale = i < wd2Var.b() ? xd2Var.a.get(i) : wd2VarB.a.a.get(i - wd2Var.b());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            wd2Var2 = new wd2(new xd2(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return wd2Var2.a.a.isEmpty() ? wd2VarB : wd2Var2;
    }

    public static Configuration x(Context context, int i, wd2 wd2Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (wd2Var != null) {
            uf.d(configuration2, wd2Var);
        }
        return configuration2;
    }

    public final void A(int i) {
        ag agVarF = F(i);
        if (agVarF.h != null) {
            Bundle bundle = new Bundle();
            agVarF.h.u(bundle);
            if (bundle.size() > 0) {
                agVarF.p = bundle;
            }
            agVarF.h.y();
            agVarF.h.clear();
        }
        agVarF.o = true;
        agVarF.n = true;
        if ((i == 108 || i == 0) && this.D != null) {
            ag agVarF2 = F(0);
            agVarF2.k = false;
            M(agVarF2, null);
        }
    }

    public final void B() {
        ViewGroup viewGroup;
        if (this.M) {
            return;
        }
        Context context = this.x;
        int[] iArr = st3.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            kf2.o("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.V = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        C();
        this.y.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.W) {
            viewGroup = this.U ? (ViewGroup) layoutInflaterFrom.inflate(app.homemusic.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(app.homemusic.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.V) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(app.homemusic.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.T = false;
            this.S = false;
        } else if (this.S) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(app.homemusic.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ud0(context, typedValue.resourceId) : context).inflate(app.homemusic.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(app.homemusic.R.id.decor_content_parent);
            this.D = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.y.getCallback());
            if (this.T) {
                this.D.j(109);
            }
            if (this.Q) {
                this.D.j(2);
            }
            if (this.R) {
                this.D.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.S + ", windowActionBarOverlay: " + this.T + ", android:windowIsFloating: " + this.V + ", windowActionModeOverlay: " + this.U + ", windowNoTitle: " + this.W + " }");
        }
        rf rfVar = new rf(this);
        WeakHashMap weakHashMap = j65.a;
        a65.c(viewGroup, rfVar);
        if (this.D == null) {
            this.O = (TextView) viewGroup.findViewById(app.homemusic.R.id.title);
        }
        boolean z = e85.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(app.homemusic.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.y.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.y.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new zg5(this));
        this.N = viewGroup;
        Object obj = this.w;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.C;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.D;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                l93 l93Var = this.A;
                if (l93Var != null) {
                    l93Var.l0(title);
                } else {
                    TextView textView = this.O;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.N.findViewById(R.id.content);
        View decorView = this.y.getDecorView();
        contentFrameLayout2.t.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.M = true;
        ag agVarF = F(0);
        if (this.d0 || agVarF.h != null) {
            return;
        }
        H(108);
    }

    public final void C() {
        if (this.y == null) {
            Object obj = this.w;
            if (obj instanceof Activity) {
                s(((Activity) obj).getWindow());
            }
        }
        if (this.y != null) {
            return;
        }
        kf2.o("We have not been given a Window");
    }

    public final Context D() {
        G();
        l93 l93Var = this.A;
        Context contextJ = l93Var != null ? l93Var.J() : null;
        return contextJ == null ? this.x : contextJ;
    }

    public final b3 E(Context context) {
        if (this.j0 == null) {
            if (qp4.d == null) {
                Context applicationContext = context.getApplicationContext();
                qp4.d = new qp4(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.j0 = new yf(this, qp4.d);
        }
        return this.j0;
    }

    public final ag F(int i) {
        ag[] agVarArr = this.Y;
        if (agVarArr == null || agVarArr.length <= i) {
            ag[] agVarArr2 = new ag[i + 1];
            if (agVarArr != null) {
                System.arraycopy(agVarArr, 0, agVarArr2, 0, agVarArr.length);
            }
            this.Y = agVarArr2;
            agVarArr = agVarArr2;
        }
        ag agVar = agVarArr[i];
        if (agVar != null) {
            return agVar;
        }
        ag agVar2 = new ag();
        agVar2.a = i;
        agVar2.n = false;
        agVarArr[i] = agVar2;
        return agVar2;
    }

    public final void G() {
        B();
        if (this.S && this.A == null) {
            Object obj = this.w;
            if (obj instanceof Activity) {
                this.A = new ia5((Activity) obj, this.T);
            } else if (obj instanceof Dialog) {
                this.A = new ia5((Dialog) obj);
            }
            l93 l93Var = this.A;
            if (l93Var != null) {
                l93Var.e0(this.o0);
            }
        }
    }

    public final void H(int i) {
        this.m0 = (1 << i) | this.m0;
        if (this.l0) {
            return;
        }
        View decorView = this.y.getDecorView();
        WeakHashMap weakHashMap = j65.a;
        decorView.postOnAnimation(this.n0);
        this.l0 = true;
    }

    public final int I(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            kf2.o("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.k0 == null) {
                            this.k0 = new yf(this, context);
                        }
                        return this.k0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return E(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean J() {
        boolean z = this.a0;
        this.a0 = false;
        ag agVarF = F(0);
        if (!agVarF.m) {
            d5 d5Var = this.G;
            if (d5Var != null) {
                d5Var.a();
                return true;
            }
            G();
            l93 l93Var = this.A;
            if (l93Var == null || !l93Var.s()) {
                return false;
            }
        } else if (!z) {
            w(agVarF, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        if (r15.s.getCount() > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(ag agVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = agVar.m;
        int i2 = agVar.a;
        if (z || this.d0) {
            return;
        }
        Context context = this.x;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.y.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, agVar.h)) {
            w(agVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && M(agVar, keyEvent)) {
            zf zfVar = agVar.e;
            if (zfVar != null && !agVar.n) {
                View view = agVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                agVar.l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = agVar.c;
                layoutParams2.windowAnimations = agVar.d;
                windowManager.addView(agVar.e, layoutParams2);
                agVar.m = true;
                if (i2 == 0) {
                    O();
                }
            }
            if (zfVar == null) {
                Context contextD = D();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextD.getResources().newTheme();
                themeNewTheme.setTo(contextD.getTheme());
                themeNewTheme.resolveAttribute(app.homemusic.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(app.homemusic.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(app.homemusic.R.style.Theme_AppCompat_CompactMenu, true);
                }
                ud0 ud0Var = new ud0(contextD, 0);
                ud0Var.getTheme().setTo(themeNewTheme);
                agVar.j = ud0Var;
                TypedArray typedArrayObtainStyledAttributes = ud0Var.obtainStyledAttributes(st3.j);
                agVar.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                agVar.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                agVar.e = new zf(this, agVar.j);
                agVar.c = 81;
            } else if (agVar.n && zfVar.getChildCount() > 0) {
                agVar.e.removeAllViews();
            }
            View view2 = agVar.g;
            if (view2 == null) {
                if (agVar.h != null) {
                    if (this.F == null) {
                        this.F = new rf(this);
                    }
                    rf rfVar = this.F;
                    if (agVar.i == null) {
                        ub2 ub2Var = new ub2(agVar.j);
                        agVar.i = ub2Var;
                        ub2Var.r = rfVar;
                        qu2 qu2Var = agVar.h;
                        qu2Var.b(ub2Var, qu2Var.a);
                    }
                    ub2 ub2Var2 = agVar.i;
                    zf zfVar2 = agVar.e;
                    if (ub2Var2.q == null) {
                        ub2Var2.q = (ExpandedMenuView) ub2Var2.o.inflate(app.homemusic.R.layout.abc_expanded_menu_layout, (ViewGroup) zfVar2, false);
                        if (ub2Var2.s == null) {
                            ub2Var2.s = new tb2(ub2Var2);
                        }
                        ub2Var2.q.setAdapter((ListAdapter) ub2Var2.s);
                        ub2Var2.q.setOnItemClickListener(ub2Var2);
                    }
                    ExpandedMenuView expandedMenuView = ub2Var2.q;
                    agVar.f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                agVar.n = true;
                return;
            }
            agVar.f = view2;
            if (agVar.f != null) {
                if (agVar.g == null) {
                    ub2 ub2Var3 = agVar.i;
                    if (ub2Var3.s == null) {
                        ub2Var3.s = new tb2(ub2Var3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = agVar.f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                agVar.e.setBackgroundResource(agVar.b);
                ViewParent parent = agVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(agVar.f);
                }
                agVar.e.addView(agVar.f, layoutParams3);
                if (!agVar.f.hasFocus()) {
                    agVar.f.requestFocus();
                }
            }
            agVar.n = true;
            return;
            i = -2;
            agVar.l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = agVar.c;
            layoutParams4.windowAnimations = agVar.d;
            windowManager.addView(agVar.e, layoutParams4);
            agVar.m = true;
            if (i2 == 0) {
                O();
            }
        }
    }

    public final boolean L(ag agVar, int i, KeyEvent keyEvent) {
        qu2 qu2Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((agVar.k || M(agVar, keyEvent)) && (qu2Var = agVar.h) != null) {
            return qu2Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    public final boolean M(ag agVar, KeyEvent keyEvent) {
        qu2 qu2Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.d0) {
            boolean z = agVar.k;
            int i = agVar.a;
            if (z) {
                return true;
            }
            ag agVar2 = this.Z;
            if (agVar2 != null && agVar2 != agVar) {
                w(agVar2, false);
            }
            Window.Callback callback = this.y.getCallback();
            if (callback != null) {
                agVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.D) != null) {
                actionBarOverlayLayout4.k();
                ((gv4) actionBarOverlayLayout4.r).l = true;
            }
            if (agVar.g == null && (!z2 || !(this.A instanceof cv4))) {
                qu2 qu2Var2 = agVar.h;
                if (qu2Var2 == null || agVar.o) {
                    if (qu2Var2 == null) {
                        Context context = this.x;
                        if ((i == 0 || i == 108) && this.D != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(app.homemusic.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(app.homemusic.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(app.homemusic.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                ud0 ud0Var = new ud0(context, 0);
                                ud0Var.getTheme().setTo(themeNewTheme);
                                context = ud0Var;
                            }
                        }
                        qu2 qu2Var3 = new qu2(context);
                        qu2Var3.e = this;
                        qu2 qu2Var4 = agVar.h;
                        if (qu2Var3 != qu2Var4) {
                            if (qu2Var4 != null) {
                                qu2Var4.r(agVar.i);
                            }
                            agVar.h = qu2Var3;
                            ub2 ub2Var = agVar.i;
                            if (ub2Var != null) {
                                qu2Var3.b(ub2Var, qu2Var3.a);
                            }
                        }
                        if (agVar.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.D) != null) {
                                if (this.E == null) {
                                    this.E = new zh0(6, this);
                                }
                                actionBarOverlayLayout2.l(agVar.h, this.E);
                            }
                            agVar.h.y();
                            if (callback.onCreatePanelMenu(i, agVar.h)) {
                                agVar.o = false;
                            } else {
                                qu2Var = agVar.h;
                                if (qu2Var != null) {
                                    if (qu2Var != null) {
                                        qu2Var.r(agVar.i);
                                    }
                                    agVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.D) != null) {
                                    actionBarOverlayLayout.l(null, this.E);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.E == null) {
                                this.E = new zh0(6, this);
                            }
                            actionBarOverlayLayout2.l(agVar.h, this.E);
                        }
                        agVar.h.y();
                        if (callback.onCreatePanelMenu(i, agVar.h)) {
                            qu2Var = agVar.h;
                            if (qu2Var != null) {
                                if (qu2Var != null) {
                                    qu2Var.r(agVar.i);
                                }
                                agVar.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.E);
                            }
                        } else {
                            agVar.o = false;
                        }
                    }
                }
                agVar.h.y();
                Bundle bundle = agVar.p;
                if (bundle != null) {
                    agVar.h.s(bundle);
                    agVar.p = null;
                }
                if (!callback.onPreparePanel(0, agVar.g, agVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.D) != null) {
                        actionBarOverlayLayout3.l(null, this.E);
                    }
                    agVar.h.x();
                    return false;
                }
                agVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                agVar.h.x();
            }
            agVar.k = true;
            agVar.l = false;
            this.Z = agVar;
            return true;
        }
        return false;
    }

    public final void N() {
        if (this.M) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void O() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.s0 != null && (F(0).m || this.G != null)) {
                z = true;
            }
            if (z && this.t0 == null) {
                this.t0 = wf.b(this.s0, this);
            } else {
                if (z || (onBackInvokedCallback = this.t0) == null) {
                    return;
                }
                wf.c(this.s0, onBackInvokedCallback);
                this.t0 = null;
            }
        }
    }

    @Override // defpackage.pf
    public final void c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.x);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof bg) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.pf
    public final void d() {
        if (this.A != null) {
            G();
            if (this.A.L()) {
                return;
            }
            H(0);
        }
    }

    @Override // defpackage.pf
    public final void f() {
        String strA;
        this.b0 = true;
        r(false, true);
        C();
        Object obj = this.w;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strA = te5.A(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strA = null;
            }
            if (strA != null) {
                l93 l93Var = this.A;
                if (l93Var == null) {
                    this.o0 = true;
                } else {
                    l93Var.e0(true);
                }
            }
            synchronized (pf.u) {
                pf.h(this);
                pf.t.add(new WeakReference(this));
            }
        }
        this.e0 = new Configuration(this.x.getResources().getConfiguration());
        this.c0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.pf
    public final void g() {
        if (this.w instanceof Activity) {
            synchronized (pf.u) {
                pf.h(this);
            }
        }
        if (this.l0) {
            this.y.getDecorView().removeCallbacks(this.n0);
        }
        this.d0 = true;
        if (this.f0 != -100) {
            Object obj = this.w;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                u0.put(this.w.getClass().getName(), Integer.valueOf(this.f0));
            } else {
                u0.remove(this.w.getClass().getName());
            }
        } else {
            u0.remove(this.w.getClass().getName());
        }
        l93 l93Var = this.A;
        if (l93Var != null) {
            l93Var.O();
        }
        yf yfVar = this.j0;
        if (yfVar != null) {
            yfVar.c();
        }
        yf yfVar2 = this.k0;
        if (yfVar2 != null) {
            yfVar2.c();
        }
    }

    @Override // defpackage.pf
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.W && i == 108) {
            return false;
        }
        if (this.S && i == 1) {
            this.S = false;
        }
        if (i == 1) {
            N();
            this.W = true;
            return true;
        }
        if (i == 2) {
            N();
            this.Q = true;
            return true;
        }
        if (i == 5) {
            N();
            this.R = true;
            return true;
        }
        if (i == 10) {
            N();
            this.U = true;
            return true;
        }
        if (i == 108) {
            N();
            this.S = true;
            return true;
        }
        if (i != 109) {
            return this.y.requestFeature(i);
        }
        N();
        this.T = true;
        return true;
    }

    @Override // defpackage.pf
    public final void k(int i) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.x).inflate(i, viewGroup);
        this.z.a(this.y.getCallback());
    }

    @Override // defpackage.pf
    public final void l(View view) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.z.a(this.y.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.ou2
    public final boolean m(qu2 qu2Var, MenuItem menuItem) {
        ag agVar;
        Window.Callback callback = this.y.getCallback();
        if (callback != null && !this.d0) {
            qu2 qu2VarK = qu2Var.k();
            ag[] agVarArr = this.Y;
            int length = agVarArr != null ? agVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                agVar = agVarArr[i];
                if (agVar != null && agVar.h == qu2VarK) {
                    if (agVar != null) {
                        return callback.onMenuItemSelected(agVar.a, menuItem);
                    }
                }
            }
            agVar = null;
            if (agVar != null) {
                return callback.onMenuItemSelected(agVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.pf
    public final void n(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.z.a(this.y.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View ngVar;
        View view2 = null;
        if (this.r0 == null) {
            int[] iArr = st3.j;
            Context context2 = this.x;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.r0 = new th();
            } else {
                try {
                    this.r0 = (th) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.r0 = new th();
                }
            }
        }
        th thVar = this.r0;
        int i = a45.a;
        thVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, st3.A, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context ud0Var = (resourceId == 0 || ((context instanceof ud0) && ((ud0) context).a == resourceId)) ? context : new ud0(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ngVar = new ng(ud0Var, attributeSet);
                break;
            case 1:
                ngVar = new jf(ud0Var, attributeSet);
                break;
            case 2:
                ngVar = new kg(ud0Var, attributeSet);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ngVar = thVar.e(ud0Var, attributeSet);
                break;
            case 4:
                ngVar = new AppCompatImageButton(ud0Var, attributeSet);
                break;
            case 5:
                ngVar = new pg(ud0Var, attributeSet, app.homemusic.R.attr.seekBarStyle);
                break;
            case 6:
                ngVar = new bh(ud0Var, attributeSet);
                break;
            case 7:
                ngVar = thVar.d(ud0Var, attributeSet);
                break;
            case 8:
                ngVar = new AppCompatToggleButton(ud0Var, attributeSet);
                break;
            case 9:
                ngVar = new jg(ud0Var, attributeSet, 0);
                break;
            case 10:
                ngVar = thVar.a(ud0Var, attributeSet);
                break;
            case 11:
                ngVar = thVar.c(ud0Var, attributeSet);
                break;
            case 12:
                ngVar = new hg(ud0Var, attributeSet, app.homemusic.R.attr.editTextStyle);
                break;
            case 13:
                ngVar = thVar.b(ud0Var, attributeSet);
                break;
            default:
                ngVar = null;
                break;
        }
        if (ngVar == null && context != ud0Var) {
            Object[] objArr = thVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = ud0Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = th.g;
                        if (i2 < 3) {
                            View viewF = thVar.f(ud0Var, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = thVar.f(ud0Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            ngVar = view2;
        }
        if (ngVar != null) {
            Context context3 = ngVar.getContext();
            if ((context3 instanceof ContextWrapper) && ngVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, th.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    ngVar.setOnClickListener(new sh(ngVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = ud0Var.obtainStyledAttributes(attributeSet, th.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = j65.a;
                    new w55(app.homemusic.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(ngVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = ud0Var.obtainStyledAttributes(attributeSet, th.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    j65.p(ngVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = ud0Var.obtainStyledAttributes(attributeSet, th.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = j65.a;
                    new w55(app.homemusic.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(ngVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return ngVar;
    }

    @Override // defpackage.pf
    public final void p(CharSequence charSequence) {
        this.C = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.D;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        l93 l93Var = this.A;
        if (l93Var != null) {
            l93Var.l0(charSequence);
            return;
        }
        TextView textView = this.O;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        if (this.d0) {
            return false;
        }
        int i2 = this.f0;
        if (i2 == -100) {
            i2 = pf.o;
        }
        Context context = this.x;
        int I = I(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        wd2 wd2VarT = i3 < 33 ? t(context) : null;
        if (!z2 && wd2VarT != null) {
            wd2VarT = uf.b(context.getResources().getConfiguration());
        }
        Configuration configurationX = x(context, I, wd2VarT, null, false);
        boolean z4 = this.i0;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj3 = this.w;
        if (z4 || !(obj3 instanceof Activity)) {
            this.i0 = true;
            i = this.h0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.h0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.h0 = 0;
                }
                this.i0 = true;
                i = this.h0;
            }
        }
        Configuration configuration = this.e0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationX.uiMode & 48;
        wd2 wd2VarB = uf.b(configuration);
        wd2 wd2VarB2 = wd2VarT == null ? null : uf.b(configurationX);
        int i6 = i4 != i5 ? 512 : 0;
        if (wd2VarB2 != null && !wd2VarB.equals(wd2VarB2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.b0 && ((w0 || this.c0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationX.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new a0(z5 ? 1 : 0, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (wd2VarB2 != null) {
                uf.d(configuration2, wd2VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26 && i8 < 28) {
                if (!j51.r) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        j51.q = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                    }
                    j51.r = true;
                }
                Field field = j51.q;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!j51.l) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                j51.k = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e4) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                            }
                            j51.l = true;
                        }
                        Field field2 = j51.k;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!j51.n) {
                                try {
                                    j51.m = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e6) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
                                }
                                j51.n = true;
                            }
                            Class cls = j51.m;
                            if (cls != null) {
                                if (!j51.p) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        j51.o = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
                                    }
                                    j51.p = true;
                                }
                                Field field3 = j51.o;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i9 = this.g0;
            if (i9 != 0) {
                context.setTheme(i9);
                context.getTheme().applyStyle(this.g0, true);
            }
            if (z6 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof ba2) {
                    if (((ba2) activity2).h().h.compareTo(r92.p) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.c0 && !this.d0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (wd2VarB2 != null) {
            uf.c(uf.b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            E(context).n();
        } else {
            yf yfVar = this.j0;
            if (yfVar != null) {
                yfVar.c();
            }
        }
        yf yfVar2 = this.k0;
        if (i2 == 3) {
            if (yfVar2 == null) {
                this.k0 = new yf(this, context);
            }
            this.k0.n();
        } else if (yfVar2 != null) {
            yfVar2.c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void s(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.y != null) {
            kf2.o("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof xf) {
            kf2.o("AppCompat has already installed itself into the Window");
            return;
        }
        xf xfVar = new xf(this, callback);
        this.z = xfVar;
        window.setCallback(xfVar);
        Context context = this.x;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, v0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            fg fgVarA = fg.a();
            synchronized (fgVarA) {
                drawableE = fgVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.y = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.s0) != null) {
            return;
        }
        Object obj = this.w;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.t0) != null) {
            wf.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.t0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.s0 = wf.a(activity);
            } else {
                this.s0 = null;
            }
        } else {
            this.s0 = null;
        }
        O();
    }

    public final void u(int i, ag agVar, qu2 qu2Var) {
        if (qu2Var == null) {
            if (agVar == null && i >= 0) {
                ag[] agVarArr = this.Y;
                if (i < agVarArr.length) {
                    agVar = agVarArr[i];
                }
            }
            if (agVar != null) {
                qu2Var = agVar.h;
            }
        }
        if ((agVar == null || agVar.m) && !this.d0) {
            xf xfVar = this.z;
            Window.Callback callback = this.y.getCallback();
            xfVar.getClass();
            try {
                xfVar.r = true;
                callback.onPanelClosed(i, qu2Var);
            } finally {
                xfVar.r = false;
            }
        }
    }

    public final void v(qu2 qu2Var) {
        y4 y4Var;
        if (this.X) {
            return;
        }
        this.X = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.D;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((gv4) actionBarOverlayLayout.r).a.n;
        if (actionMenuView != null && (y4Var = actionMenuView.G) != null) {
            y4Var.f();
            t4 t4Var = y4Var.H;
            if (t4Var != null && t4Var.b()) {
                t4Var.i.dismiss();
            }
        }
        Window.Callback callback = this.y.getCallback();
        if (callback != null && !this.d0) {
            callback.onPanelClosed(108, qu2Var);
        }
        this.X = false;
    }

    public final void w(ag agVar, boolean z) {
        zf zfVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && agVar.a == 0 && (actionBarOverlayLayout = this.D) != null) {
            actionBarOverlayLayout.k();
            if (((gv4) actionBarOverlayLayout.r).a.p()) {
                v(agVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.x.getSystemService("window");
        if (windowManager != null && agVar.m && (zfVar = agVar.e) != null) {
            windowManager.removeView(zfVar);
            if (z) {
                u(agVar.a, agVar, null);
            }
        }
        agVar.k = false;
        agVar.l = false;
        agVar.m = false;
        agVar.f = null;
        agVar.n = true;
        if (this.Z == agVar) {
            this.Z = null;
        }
        if (agVar.a == 0) {
            O();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // defpackage.ou2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(qu2 qu2Var) {
        ActionMenuView actionMenuView;
        y4 y4Var;
        ActionBarOverlayLayout actionBarOverlayLayout = this.D;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((gv4) actionBarOverlayLayout.r).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.n) != null && actionMenuView.F) {
                if (ViewConfiguration.get(this.x).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.D;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((gv4) actionBarOverlayLayout2.r).a.n;
                    if (actionMenuView2 != null) {
                        y4 y4Var2 = actionMenuView2.G;
                        if (y4Var2 != null) {
                            if (y4Var2.I == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.y.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.D;
                actionBarOverlayLayout3.k();
                if (((gv4) actionBarOverlayLayout3.r).a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.D;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((gv4) actionBarOverlayLayout4.r).a.n;
                    if (actionMenuView3 != null && (y4Var = actionMenuView3.G) != null) {
                        y4Var.f();
                    }
                    if (this.d0) {
                        return;
                    }
                    callback.onPanelClosed(108, F(0).h);
                    return;
                }
                if (callback == null || this.d0) {
                    return;
                }
                if (this.l0 && (1 & this.m0) != 0) {
                    View decorView = this.y.getDecorView();
                    qf qfVar = this.n0;
                    decorView.removeCallbacks(qfVar);
                    qfVar.run();
                }
                ag agVarF = F(0);
                qu2 qu2Var2 = agVarF.h;
                if (qu2Var2 == null || agVarF.o || !callback.onPreparePanel(0, agVarF.g, qu2Var2)) {
                    return;
                }
                callback.onMenuOpened(108, agVarF.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.D;
                actionBarOverlayLayout5.k();
                ((gv4) actionBarOverlayLayout5.r).a.v();
                return;
            }
        }
        ag agVarF2 = F(0);
        agVarF2.n = true;
        w(agVarF2, false);
        K(agVarF2, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134 A[RETURN] */
    public final boolean z(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        ag agVarF;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zV;
        boolean zM;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        y4 y4Var;
        ag agVarF2;
        Object obj = this.w;
        if ((!(obj instanceof h42) && !(obj instanceof dg)) || (decorView = this.y.getDecorView()) == null || !fu.q(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                xf xfVar = this.z;
                Window.Callback callback = this.y.getCallback();
                xfVar.getClass();
                try {
                    xfVar.q = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    xfVar.q = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.a0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    agVarF2 = F(0);
                                    if (!agVarF2.m) {
                                        M(agVarF2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.G == null) {
                                    agVarF = F(0);
                                    actionBarOverlayLayout = this.D;
                                    context = this.x;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((gv4) actionBarOverlayLayout.r).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.n) == null || !actionMenuView.F || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = agVarF.m;
                                            if (!z || agVarF.l) {
                                                w(agVarF, true);
                                                zV = z;
                                            } else {
                                                if (agVarF.k) {
                                                    if (agVarF.o) {
                                                        agVarF.k = false;
                                                        zM = M(agVarF, keyEvent);
                                                    } else {
                                                        zM = true;
                                                    }
                                                    if (zM) {
                                                        K(agVarF, keyEvent);
                                                        zV = true;
                                                    }
                                                }
                                                zV = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.D;
                                            actionBarOverlayLayout2.k();
                                            if (((gv4) actionBarOverlayLayout2.r).a.p()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.D;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((gv4) actionBarOverlayLayout3.r).a.n;
                                                if (actionMenuView2 != null && (y4Var = actionMenuView2.G) != null && y4Var.f()) {
                                                    zV = true;
                                                }
                                            } else if (!this.d0 && M(agVarF, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.D;
                                                actionBarOverlayLayout4.k();
                                                zV = ((gv4) actionBarOverlayLayout4.r).a.v();
                                            }
                                            zV = false;
                                        }
                                    } else {
                                        z = agVarF.m;
                                        if (z) {
                                        }
                                        w(agVarF, true);
                                        zV = z;
                                    }
                                    if (zV) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (J()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    xfVar.q = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.a0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            agVarF2 = F(0);
                            if (!agVarF2.m) {
                                M(agVarF2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.G == null) {
                            agVarF = F(0);
                            actionBarOverlayLayout = this.D;
                            context = this.x;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((gv4) actionBarOverlayLayout.r).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = agVarF.m;
                                    if (z) {
                                    }
                                    w(agVarF, true);
                                    zV = z;
                                } else {
                                    z = agVarF.m;
                                    if (z) {
                                    }
                                    w(agVarF, true);
                                    zV = z;
                                }
                            } else {
                                z = agVarF.m;
                                if (z) {
                                }
                                w(agVarF, true);
                                zV = z;
                            }
                            if (zV) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (J()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
