package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tm0 extends b3 {
    public final boolean c;
    public boolean d;
    public xc5 e;

    public tm0(pj4 pj4Var, gz gzVar, boolean z) {
        super(pj4Var, gzVar);
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[Catch: RuntimeException -> 0x00eb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00eb, blocks: (B:78:0x00df, B:80:0x00e5), top: B:91:0x00df }] */
    public final xc5 o(Context context) {
        int i;
        xc5 xc5Var;
        Animator animatorLoadAnimator;
        int iD;
        if (this.d) {
            return this.e;
        }
        pj4 pj4Var = (pj4) this.a;
        kc1 kc1Var = pj4Var.c;
        boolean z = pj4Var.a == 2;
        hc1 hc1Var = kc1Var.W;
        int i2 = hc1Var == null ? 0 : hc1Var.f;
        if (this.c) {
            if (z) {
                if (hc1Var == null) {
                    i = 0;
                } else {
                    i = hc1Var.d;
                }
            } else if (hc1Var == null) {
                i = 0;
            } else {
                i = hc1Var.e;
            }
        } else if (z) {
            if (hc1Var == null) {
                i = 0;
            } else {
                i = hc1Var.b;
            }
        } else if (hc1Var == null) {
            i = 0;
        } else {
            i = hc1Var.c;
        }
        kc1Var.b0(0, 0, 0, 0);
        ViewGroup viewGroup = kc1Var.S;
        xc5 xc5Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            kc1Var.S.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = kc1Var.S;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iD = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iD = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iD = z ? bu.D(context, android.R.attr.activityCloseEnterAnimation) : bu.D(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iD = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iD = -1;
                } else {
                    iD = z ? bu.D(context, android.R.attr.activityOpenEnterAnimation) : bu.D(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iD;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            xc5Var = new xc5(animationLoadAnimation);
                            xc5Var2 = xc5Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                xc5Var = new xc5(animatorLoadAnimator);
                                xc5Var2 = xc5Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                xc5Var2 = new xc5(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        xc5Var = new xc5(animatorLoadAnimator);
                        xc5Var2 = xc5Var;
                    }
                }
            }
        }
        this.e = xc5Var2;
        this.d = true;
        return xc5Var2;
    }
}
