package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import app.homemusic.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf implements r83, fv2 {
    public final /* synthetic */ bg n;

    public /* synthetic */ rf(bg bgVar) {
        this.n = bgVar;
    }

    @Override // defpackage.fv2
    public void a(qu2 qu2Var, boolean z) {
        ag agVar;
        qu2 qu2VarK = qu2Var.k();
        int i = 0;
        boolean z2 = qu2VarK != qu2Var;
        if (z2) {
            qu2Var = qu2VarK;
        }
        bg bgVar = this.n;
        ag[] agVarArr = bgVar.Y;
        int length = agVarArr != null ? agVarArr.length : 0;
        while (true) {
            if (i < length) {
                agVar = agVarArr[i];
                if (agVar != null && agVar.h == qu2Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                agVar = null;
                break;
            }
        }
        if (agVar != null) {
            if (!z2) {
                bgVar.w(agVar, z);
            } else {
                bgVar.u(agVar.a, agVar, qu2VarK);
                bgVar.w(agVar, true);
            }
        }
    }

    @Override // defpackage.fv2
    public boolean w(qu2 qu2Var) {
        Window.Callback callback;
        if (qu2Var != qu2Var.k()) {
            return true;
        }
        bg bgVar = this.n;
        if (!bgVar.S || (callback = bgVar.y.getCallback()) == null || bgVar.d0) {
            return true;
        }
        callback.onMenuOpened(108, qu2Var);
        return true;
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        int i;
        int i2;
        boolean z;
        pb5 pb5VarB;
        bb5 va5Var;
        boolean z2;
        int iD = pb5Var.d();
        bg bgVar = this.n;
        Context context = bgVar.x;
        int iD2 = pb5Var.d();
        ActionBarContextView actionBarContextView = bgVar.H;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bgVar.H.getLayoutParams();
            boolean z3 = true;
            if (bgVar.H.isShown()) {
                if (bgVar.p0 == null) {
                    bgVar.p0 = new Rect();
                    bgVar.q0 = new Rect();
                }
                Rect rect = bgVar.p0;
                Rect rect2 = bgVar.q0;
                rect.set(pb5Var.b(), pb5Var.d(), pb5Var.c(), pb5Var.a());
                ViewGroup viewGroup = bgVar.N;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = e85.a;
                    a85.a(viewGroup, rect, rect2);
                } else {
                    if (!e85.a) {
                        e85.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            e85.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                e85.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = e85.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = bgVar.N;
                WeakHashMap weakHashMap = j65.a;
                pb5 pb5VarA = b65.a(viewGroup2);
                int iB = pb5VarA == null ? 0 : pb5VarA.b();
                int iC = pb5VarA == null ? 0 : pb5VarA.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || bgVar.P != null) {
                    i2 = 8;
                    View view2 = bgVar.P;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            bgVar.P.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    bgVar.P = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    bgVar.N.addView(bgVar.P, -1, layoutParams);
                }
                View view4 = bgVar.P;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = bgVar.P;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!bgVar.U && z3) {
                    iD2 = 0;
                }
                i = 0;
                z = z3;
                z3 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (z3) {
                bgVar.H.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = bgVar.P;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (iD != iD2) {
            int iB2 = pb5Var.b();
            int iC2 = pb5Var.c();
            int iA = pb5Var.a();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 36) {
                va5Var = new ab5(pb5Var);
            } else if (i8 >= 35) {
                va5Var = new za5(pb5Var);
            } else if (i8 >= 34) {
                va5Var = new ya5(pb5Var);
            } else if (i8 >= 31) {
                va5Var = new xa5(pb5Var);
            } else if (i8 >= 30) {
                va5Var = new wa5(pb5Var);
            } else {
                va5Var = i8 >= 29 ? new va5(pb5Var) : new ua5(pb5Var);
            }
            va5Var.h(vz1.b(iB2, iD2, iC2, iA));
            pb5VarB = va5Var.b();
        } else {
            pb5VarB = pb5Var;
        }
        WeakHashMap weakHashMap2 = j65.a;
        WindowInsets windowInsetsF = pb5VarB.f();
        if (windowInsetsF == null) {
            return pb5VarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsF) ? pb5.g(windowInsetsOnApplyWindowInsets, view) : pb5VarB;
    }
}
