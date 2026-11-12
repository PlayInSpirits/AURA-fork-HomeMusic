package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj3 {
    public boolean B;
    public boolean C;
    public final PlayerControlView a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final AnimatorSet q;
    public final ValueAnimator r;
    public final ValueAnimator s;
    public final mj3 t = new mj3(this, 0);
    public final mj3 u = new mj3(this, 3);
    public final mj3 v = new mj3(this, 4);
    public final mj3 w = new mj3(this, 5);
    public final mj3 x = new mj3(this, 6);
    public final cs1 y = new cs1(2, this);
    public boolean D = true;
    public int A = 0;
    public final ArrayList z = new ArrayList();

    public qj3(PlayerControlView playerControlView) {
        this.a = playerControlView;
        final int i = 0;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        this.c = (ViewGroup) playerControlView.findViewById(R.id.exo_top_controls);
        this.b = playerControlView.findViewById(R.id.exo_controls_background);
        this.d = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.f = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.e = viewGroup;
        this.j = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(R.id.exo_progress);
        this.k = viewFindViewById;
        this.g = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.h = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.i = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.l = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new bj3(i2, this));
            viewFindViewById3.setOnClickListener(new bj3(i2, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nj3
            public final /* synthetic */ qj3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i2;
                qj3 qj3Var = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = qj3Var.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = qj3Var.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = qj3Var.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = qj3Var.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = qj3Var.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = qj3Var.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = qj3Var.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = qj3Var.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new oj3(this, i));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nj3
            public final /* synthetic */ qj3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i;
                qj3 qj3Var = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = qj3Var.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = qj3Var.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = qj3Var.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = qj3Var.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = qj3Var.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = qj3Var.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = qj3Var.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = qj3Var.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new oj3(this, i4));
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new pj3(this, playerControlView, i));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new pj3(this, playerControlView, i4));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new pj3(this, playerControlView, i3));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new oj3(this, i3));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.q = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new oj3(this, i2));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nj3
            public final /* synthetic */ qj3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                qj3 qj3Var = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = qj3Var.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = qj3Var.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = qj3Var.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = qj3Var.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = qj3Var.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = qj3Var.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = qj3Var.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = qj3Var.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new oj3(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.s = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nj3
            public final /* synthetic */ qj3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                qj3 qj3Var = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = qj3Var.b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = qj3Var.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = qj3Var.d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = qj3Var.f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        qj3Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = qj3Var.b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = qj3Var.c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = qj3Var.d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = qj3Var.f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new oj3(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_media_route_button_placeholder || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.j;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.z.contains(view);
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        mj3 mj3Var = this.x;
        PlayerControlView playerControlView = this.a;
        playerControlView.removeCallbacks(mj3Var);
        playerControlView.removeCallbacks(this.u);
        playerControlView.removeCallbacks(this.w);
        playerControlView.removeCallbacks(this.v);
    }

    public final void g() {
        if (this.A == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.D) {
                e(this.x, showTimeoutMs);
            } else if (this.A == 1) {
                e(this.v, 2000L);
            } else {
                e(this.w, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.z;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.B && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i) {
        int i2 = this.A;
        this.A = i;
        PlayerControlView playerControlView = this.a;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = playerControlView.x.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    kf2.k();
                } else {
                    playerControlView.getVisibility();
                    throw null;
                }
            }
        }
    }
}
