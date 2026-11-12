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

    public kw0(dx4 r2, oi r3) {
        this.a = 1;
        this.c = r2;
        this.b = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.a) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ((u75) this.b).a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        int r0 = this.a;
        Object r1 = this.c;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ta5 r4 = (ta5) r2;
        r4.a.e(1.0f);
        pa5.f((View) r1, r4);
        return;
    L6:
        ((u75) r2).c();
        return;
    L8:
        ((oi) r2).remove(r3);
        ((dx4) r1).z.remove(r3);
        return;
    L10:
        DrawerLayout r5 = (DrawerLayout) r2;
        r5.c((NavigationView) r1, false);
        r5.setScrimColor(-1728053248);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.a) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        ((u75) this.b).b();
        return;
    L8:
        ((dx4) this.c).z.add(r2);
    }

    public /* synthetic */ kw0(int r1, View r2, Object r3) {
        this.a = r1;
        this.b = r3;
        this.c = r2;
    }
}
