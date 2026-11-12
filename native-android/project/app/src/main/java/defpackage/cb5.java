package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb5 extends mb5 {
    public static boolean m;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public vz1[] d;
    public vz1 e;
    public pb5 f;
    public vz1 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public cb5(pb5 pb5Var, WindowInsets windowInsets) {
        super(pb5Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private vr0 B(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return vr0.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        j34 j34VarT = zz1.t(display, 0);
        j34 j34VarT2 = zz1.t(display, 1);
        j34 j34VarT3 = zz1.t(display, 2);
        j34 j34VarT4 = zz1.t(display, 3);
        return vr0.a(point.x, point.y, false, j34VarT != null ? j34VarT.b : 0, j34VarT2 != null ? j34VarT2.b : 0, j34VarT3 != null ? j34VarT3.b : 0, j34VarT4 != null ? j34VarT4.b : 0);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[ud3.N(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] D(vz1 vz1Var) {
        ArrayList arrayList = new ArrayList();
        int i = vz1Var.a;
        int i2 = vz1Var.d;
        int i3 = vz1Var.c;
        int i4 = vz1Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, vz1Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private vz1 E(int i, boolean z) {
        vz1 vz1VarA = vz1.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                vz1VarA = vz1.a(vz1VarA, F(i2, z));
            }
        }
        return vz1VarA;
    }

    private vz1 G() {
        pb5 pb5Var = this.f;
        return pb5Var != null ? pb5Var.a.k() : vz1.e;
    }

    private vz1 H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            er1.l("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            J();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(objInvoke));
                if (rect != null) {
                    return vz1.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.mb5
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public vz1 F(int i, boolean z) {
        vz1 vz1VarK;
        int i2;
        vz1 vz1Var = vz1.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    vz1[] vz1VarArr = this.d;
                    vz1VarK = vz1VarArr != null ? vz1VarArr[ud3.N(8)] : null;
                    if (vz1VarK != null) {
                        return vz1VarK;
                    }
                    vz1 vz1VarM = m();
                    vz1 vz1VarG = G();
                    int i3 = vz1VarM.d;
                    if (i3 > vz1VarG.d) {
                        return vz1.b(0, 0, 0, i3);
                    }
                    vz1 vz1Var2 = this.g;
                    if (vz1Var2 != null && !vz1Var2.equals(vz1Var) && (i2 = this.g.d) > vz1VarG.d) {
                        return vz1.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        pb5 pb5Var = this.f;
                        tr0 tr0VarG = pb5Var != null ? pb5Var.a.g() : g();
                        if (tr0VarG != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return vz1.b(i4 >= 28 ? ne.k(tr0VarG.a) : 0, i4 >= 28 ? ne.m(tr0VarG.a) : 0, i4 >= 28 ? ne.l(tr0VarG.a) : 0, i4 >= 28 ? ne.j(tr0VarG.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    vz1 vz1VarG2 = G();
                    vz1 vz1VarK2 = k();
                    return vz1.b(Math.max(vz1VarG2.a, vz1VarK2.a), 0, Math.max(vz1VarG2.c, vz1VarK2.c), Math.max(vz1VarG2.d, vz1VarK2.d));
                }
                if ((this.h & 2) == 0) {
                    vz1 vz1VarM2 = m();
                    pb5 pb5Var2 = this.f;
                    vz1VarK = pb5Var2 != null ? pb5Var2.a.k() : null;
                    int iMin = vz1VarM2.d;
                    if (vz1VarK != null) {
                        iMin = Math.min(iMin, vz1VarK.d);
                    }
                    return vz1.b(vz1VarM2.a, 0, vz1VarM2.c, iMin);
                }
            }
        } else {
            if (z) {
                return vz1.b(0, Math.max(G().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return vz1.b(0, m().b, 0, 0);
            }
        }
        return vz1Var;
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !F(i, false).equals(vz1.e);
    }

    public void K(vz1 vz1Var) {
        this.g = vz1Var;
    }

    @Override // defpackage.mb5
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        vz1 vz1VarH = H(view);
        if (vz1VarH == null) {
            vz1VarH = vz1.e;
        }
        K(vz1VarH);
    }

    @Override // defpackage.mb5
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.mb5
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        cb5 cb5Var = (cb5) obj;
        return Objects.equals(this.g, cb5Var.g) && L(this.h, cb5Var.h);
    }

    @Override // defpackage.mb5
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.mb5
    public vz1 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.mb5
    public vz1 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.mb5
    public final vz1 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = vz1.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.mb5
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.mb5
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iN = ud3.N(i);
            this.k[iN] = D(h(i));
            if (i != 8) {
                this.l[iN] = D(i(i));
            }
        }
    }

    @Override // defpackage.mb5
    public pb5 q(int i, int i2, int i3, int i4) {
        bb5 va5Var;
        pb5 pb5VarG = pb5.g(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            va5Var = new ab5(pb5VarG);
        } else if (i5 >= 35) {
            va5Var = new za5(pb5VarG);
        } else if (i5 >= 34) {
            va5Var = new ya5(pb5VarG);
        } else if (i5 >= 31) {
            va5Var = new xa5(pb5VarG);
        } else if (i5 >= 30) {
            va5Var = new wa5(pb5VarG);
        } else {
            va5Var = i5 >= 29 ? new va5(pb5VarG) : new ua5(pb5VarG);
        }
        va5Var.h(pb5.e(m(), i, i2, i3, i4));
        va5Var.f(pb5.e(k(), i, i2, i3, i4));
        return va5Var.b();
    }

    @Override // defpackage.mb5
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.mb5
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mb5
    public void u(vr0 vr0Var) {
    }

    @Override // defpackage.mb5
    public void v(vz1[] vz1VarArr) {
        this.d = vz1VarArr;
    }

    @Override // defpackage.mb5
    public void w(pb5 pb5Var) {
        this.f = pb5Var;
    }

    @Override // defpackage.mb5
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.mb5
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }
}
