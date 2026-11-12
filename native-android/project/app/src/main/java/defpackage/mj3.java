package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ qj3 o;

    public /* synthetic */ mj3(qj3 qj3Var, int i) {
        this.n = i;
        this.o = qj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7 A[LOOP:3: B:37:0x00b1->B:39:0x00b7, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        qj3 qj3Var = this.o;
        switch (i) {
            case 0:
                if (qj3Var.D) {
                    int i2 = qj3Var.A;
                    if (i2 == 1) {
                        qj3Var.p.start();
                    } else if (i2 == 2) {
                        qj3Var.q.start();
                    } else if (i2 == 3) {
                        qj3Var.C = true;
                    } else if (i2 == 4) {
                    }
                    qj3Var.g();
                } else {
                    qj3Var.i(0);
                    qj3Var.g();
                }
                break;
            case 1:
                View view = qj3Var.k;
                ViewGroup viewGroup = qj3Var.f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(qj3Var.B ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = qj3Var.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (qj3Var.B) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        Rect rect = defaultTimeBar.n;
                        ValueAnimator valueAnimator = defaultTimeBar.R;
                        if (qj3Var.B) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.T = true;
                            defaultTimeBar.S = 0.0f;
                            defaultTimeBar.invalidate(rect);
                        } else {
                            int i3 = qj3Var.A;
                            if (i3 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                defaultTimeBar.T = false;
                                defaultTimeBar.S = 0.0f;
                                defaultTimeBar.invalidate(rect);
                            } else if (i3 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                defaultTimeBar.T = false;
                                defaultTimeBar.S = 1.0f;
                                defaultTimeBar.invalidate(rect);
                            }
                        }
                    }
                }
                ArrayList arrayList = qj3Var.z;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    View view2 = (View) obj;
                    view2.setVisibility((qj3Var.B && qj3.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = qj3Var.s;
                View view3 = qj3Var.l;
                PlayerControlView playerControlView = qj3Var.a;
                ViewGroup viewGroup2 = qj3Var.h;
                ViewGroup viewGroup3 = qj3Var.g;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int iC = qj3.c(qj3Var.j);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        iC += qj3.c(viewGroup3.getChildAt(i5));
                    }
                    if (iC > width) {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            iC += qj3.c(view3);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i6 = 0; i6 < childCount2; i6++) {
                            View childAt2 = viewGroup3.getChildAt(i6);
                            iC -= qj3.c(childAt2);
                            arrayList2.add(childAt2);
                            if (iC <= width) {
                                if (!arrayList2.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList2.size());
                                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                        viewGroup2.addView((View) arrayList2.get(i7), viewGroup2.getChildCount() - 1);
                                    }
                                }
                            }
                            break;
                        }
                        if (!arrayList2.isEmpty()) {
                            viewGroup3.removeViews(0, arrayList2.size());
                            while (i7 < arrayList2.size()) {
                                viewGroup2.addView((View) arrayList2.get(i7), viewGroup2.getChildCount() - 1);
                            }
                        }
                        break;
                    } else {
                        ViewGroup viewGroup4 = qj3Var.i;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            qj3Var.r.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                qj3Var.o.start();
                break;
            case 4:
                qj3Var.n.start();
                break;
            case 5:
                qj3Var.m.start();
                qj3Var.e(qj3Var.v, 2000L);
                break;
            default:
                qj3Var.i(2);
                break;
        }
    }
}
