package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                List list = HubFragment.y0;
                ((HubFragment) obj).n0();
                break;
            case 1:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                int i10 = playerControlView.F;
                PopupWindow popupWindow = playerControlView.E;
                int i11 = i4 - i2;
                int i12 = i8 - i6;
                if ((i3 - i != i7 - i5 || i11 != i12) && popupWindow.isShowing()) {
                    playerControlView.p();
                    popupWindow.update(view, (playerControlView.getWidth() - popupWindow.getWidth()) - i10, (-popupWindow.getHeight()) - i10, -1, -1);
                }
                break;
            default:
                qj3 qj3Var = (qj3) obj;
                PlayerControlView playerControlView2 = qj3Var.a;
                int width = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                int height3 = (playerControlView2.getHeight() - playerControlView2.getPaddingBottom()) - playerControlView2.getPaddingTop();
                ViewGroup viewGroup = qj3Var.d;
                int iC = qj3.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, qj3.c(qj3Var.l) + qj3.c(qj3Var.j));
                ViewGroup viewGroup2 = qj3Var.e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (qj3Var.B != z) {
                    qj3Var.B = z;
                    view.post(new mj3(qj3Var, 1));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!qj3Var.B && z2) {
                    view.post(new mj3(qj3Var, 2));
                    break;
                }
                break;
        }
    }
}
