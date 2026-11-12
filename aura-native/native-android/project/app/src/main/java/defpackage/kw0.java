package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public kw0(dx4 dx4Var, oi oiVar) {
        this.a = 1;
        this.c = dx4Var;
        this.b = oiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((u75) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) obj2;
                drawerLayout.c((NavigationView) obj, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 1:
                ((oi) obj2).remove(animator);
                ((dx4) obj).z.remove(animator);
                break;
            case 2:
                ((u75) obj2).c();
                break;
            default:
                ta5 ta5Var = (ta5) obj2;
                ta5Var.a.e(1.0f);
                pa5.f((View) obj, ta5Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((dx4) this.c).z.add(animator);
                break;
            case 2:
                ((u75) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ kw0(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = view;
    }
}
