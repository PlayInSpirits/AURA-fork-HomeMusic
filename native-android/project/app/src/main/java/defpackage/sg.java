package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.skydoves.colorpickerview.ColorPickerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ sg(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        int i = this.n;
        boolean z = true;
        int i2 = 0;
        Object obj = this.o;
        switch (i) {
            case 0:
                bh bhVar = (bh) obj;
                if (!bhVar.getInternalPopup().b()) {
                    bhVar.s.n(bhVar.getTextDirection(), bhVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = bhVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                yg ygVar = (yg) obj;
                bh bhVar2 = ygVar.T;
                if (bhVar2.isAttachedToWindow() && bhVar2.getGlobalVisibleRect(ygVar.R)) {
                    ygVar.s();
                    ygVar.f();
                } else {
                    ygVar.dismiss();
                }
                break;
            case 2:
                uz uzVar = (uz) obj;
                ArrayList arrayList = uzVar.u;
                if (uzVar.b() && arrayList.size() > 0 && !((tz) arrayList.get(0)).a.L) {
                    View view = uzVar.B;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ((tz) obj2).a.f();
                        }
                    } else {
                        uzVar.dismiss();
                    }
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ColorPickerView colorPickerView = (ColorPickerView) obj;
                colorPickerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                hg3 hg3Var = colorPickerView.G;
                if (colorPickerView.getParent() != null && (colorPickerView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) colorPickerView.getParent()).setClipChildren(false);
                }
                if (colorPickerView.getPreferenceName() == null) {
                    Point pointZ = kb4.z(colorPickerView, new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2));
                    int iD = colorPickerView.d(pointZ.x, pointZ.y);
                    colorPickerView.n = iD;
                    colorPickerView.o = iD;
                    colorPickerView.p = new Point(pointZ.x, pointZ.y);
                    colorPickerView.i(pointZ.x, pointZ.y);
                    colorPickerView.a(colorPickerView.getColor());
                    colorPickerView.f(colorPickerView.p);
                    colorPickerView.e();
                    break;
                } else {
                    hg3Var.getClass();
                    SharedPreferences sharedPreferences = (SharedPreferences) hg3Var.o;
                    if (colorPickerView.getPreferenceName() != null) {
                        String preferenceName = colorPickerView.getPreferenceName();
                        colorPickerView.setPureColor(sharedPreferences.getInt(preferenceName + "_COLOR", -1));
                        Point point = new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2);
                        int i3 = hg3Var.D(preferenceName, point).x;
                        int i4 = hg3Var.D(preferenceName, point).y;
                        int i5 = sharedPreferences.getInt(preferenceName + "_COLOR", -1);
                        colorPickerView.n = i5;
                        colorPickerView.o = i5;
                        colorPickerView.p = new Point(i3, i4);
                        colorPickerView.i(i3, i4);
                        colorPickerView.a(colorPickerView.getColor());
                        colorPickerView.f(colorPickerView.p);
                    }
                    int i6 = sharedPreferences.getInt(colorPickerView.getPreferenceName() + "_COLOR", -1);
                    if ((colorPickerView.q.getDrawable() instanceof b50) && i6 != -1) {
                        colorPickerView.post(new g50(colorPickerView, i6, 1));
                        break;
                    }
                }
                break;
            case 4:
                qp2 qp2Var = (qp2) obj;
                qp2Var.R.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = qp2Var.U;
                if (hashSet == null || hashSet.size() == 0) {
                    qp2Var.n(true);
                } else {
                    gp2 gp2Var = new gp2(i2, qp2Var);
                    int firstVisiblePosition = qp2Var.R.getFirstVisiblePosition();
                    boolean z2 = false;
                    while (i2 < qp2Var.R.getChildCount()) {
                        View childAt = qp2Var.R.getChildAt(i2);
                        if (qp2Var.U.contains((wq2) qp2Var.S.getItem(firstVisiblePosition + i2))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(qp2Var.u0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z2) {
                                alphaAnimation.setAnimationListener(gp2Var);
                                z2 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i2++;
                    }
                }
                break;
            case 5:
                NavigationView navigationView = (NavigationView) obj;
                int[] iArr = navigationView.y;
                navigationView.getLocationOnScreen(iArr);
                boolean z3 = iArr[1] == 0;
                l43 l43Var = navigationView.v;
                if (l43Var.K != z3) {
                    l43Var.K = z3;
                    int i7 = (l43Var.o.getChildCount() <= 0 && l43Var.K) ? l43Var.M : 0;
                    NavigationMenuView navigationMenuView = l43Var.n;
                    navigationMenuView.setPadding(0, i7, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z3 && navigationView.B);
                int i8 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i8 == 0 || navigationView.getWidth() + i8 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    Rect rectU = ya4.u(activity);
                    navigationView.setDrawBottomInsetForeground((rectU.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.C);
                    if (rectU.width() != iArr[0] && rectU.width() - navigationView.getWidth() != iArr[0]) {
                        z = false;
                    }
                    navigationView.setDrawRightInsetForeground(z);
                }
                break;
            default:
                wk4 wk4Var = (wk4) obj;
                ev2 ev2Var = wk4Var.u;
                if (wk4Var.b() && !ev2Var.L) {
                    View view2 = wk4Var.z;
                    if (view2 != null && view2.isShown()) {
                        ev2Var.f();
                    } else {
                        wk4Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
