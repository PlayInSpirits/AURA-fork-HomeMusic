package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import app.homemusic.R;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bc(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                jw jwVar = (jw) obj;
                Context context = view.getContext();
                if (!jwVar.n) {
                    context.getApplicationContext().registerComponentCallbacks((ac) jwVar.r);
                    jwVar.n = true;
                }
                break;
            case 2:
                g11 g11Var = (g11) obj;
                AccessibilityManager accessibilityManager = g11Var.G;
                if (g11Var.H != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = j65.a;
                    if (g11Var.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new h3(g11Var.H));
                    }
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = j65.a;
                view2.requestApplyInsets();
                break;
            case 4:
                view.getClass();
                lt1 lt1Var = (lt1) obj;
                n61.f.addIfAbsent(lt1Var);
                lt1Var.run();
                break;
            case 5:
                SearchBar searchBar = (SearchBar) obj;
                searchBar.x0.addTouchExplorationStateChangeListener(new h3(searchBar.y0));
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                jw jwVar = (jw) obj;
                Context context = view.getContext();
                if (jwVar.n) {
                    context.getApplicationContext().unregisterComponentCallbacks((ac) jwVar.r);
                    jwVar.n = false;
                }
                break;
            case 1:
                uz uzVar = (uz) obj;
                ViewTreeObserver viewTreeObserver = uzVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        uzVar.K = view.getViewTreeObserver();
                    }
                    uzVar.K.removeGlobalOnLayoutListener(uzVar.v);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                g11 g11Var = (g11) obj;
                g3 g3Var = g11Var.H;
                if (g3Var != null && (accessibilityManager = g11Var.G) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new h3(g3Var));
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            case 4:
                view.getClass();
                n61.f.remove((lt1) obj);
                break;
            case 5:
                SearchBar searchBar = (SearchBar) obj;
                searchBar.x0.removeTouchExplorationStateChangeListener(new h3(searchBar.y0));
                break;
            case 6:
                wk4 wk4Var = (wk4) obj;
                ViewTreeObserver viewTreeObserver2 = wk4Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        wk4Var.B = view.getViewTreeObserver();
                    }
                    wk4Var.B.removeGlobalOnLayoutListener(wk4Var.v);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                b0 b0Var = (b0) obj;
                for (Object obj2 : fa4.c0(s65.n, b0Var.getParent())) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                b0Var.d();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((sk4) obj).f(null);
                break;
        }
    }
}
