package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public d61(lo loVar, boolean z) {
        this.a = 2;
        this.c = loVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            case 1:
                this.b = true;
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
        switch (i) {
            case 0:
                e61 e61Var = (e61) obj;
                if (!this.b) {
                    if (((Float) e61Var.z.getAnimatedValue()).floatValue() != 0.0f) {
                        e61Var.A = 2;
                        e61Var.s.invalidate();
                        break;
                    } else {
                        e61Var.A = 0;
                        e61Var.l(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            case 1:
                m81 m81Var = (m81) obj;
                m81Var.q = 0;
                m81Var.l = null;
                if (!this.b) {
                    m81Var.r.a(4, false);
                    break;
                }
                break;
            default:
                lo loVar = (lo) obj;
                lo.a(loVar, this.b ? 1.0f : 0.0f);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) loVar.c;
                clippableRoundedCornerLayout.n = null;
                clippableRoundedCornerLayout.o = 0.0f;
                clippableRoundedCornerLayout.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 1:
                m81 m81Var = (m81) obj;
                m81Var.r.a(0, false);
                m81Var.q = 1;
                m81Var.l = animator;
                this.b = false;
                break;
            case 2:
                lo.a((lo) obj, this.b ? 0.0f : 1.0f);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d61(m81 m81Var) {
        this.a = 1;
        this.c = m81Var;
    }

    public d61(e61 e61Var) {
        this.a = 0;
        this.c = e61Var;
        this.b = false;
    }
}
