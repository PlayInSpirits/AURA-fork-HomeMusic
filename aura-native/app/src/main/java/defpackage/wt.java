package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wt extends ut {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ut
    public final void b(View view, float f) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.b;
                ((au) mainActivity.V.n).a(f);
                if (!mainActivity.X) {
                    MainActivity.p(mainActivity, f);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ut
    public final void c(View view, int i) {
        ck3 ck3Var;
        PlayerControllerFragment playerControllerFragment;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 5) {
                    ((yt) obj).cancel();
                    break;
                }
                break;
            case 1:
                if (i == 4 || i == 5) {
                    ((au) obj).a = false;
                    break;
                }
            case 2:
                List list = HubFragment.y0;
                ((HubFragment) obj).n0();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((bd1) obj).c(i == 3);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                xi3 xi3Var = (xi3) mainActivity.k().D("PlayerBottomSheet");
                if (i == 3) {
                    ((au) mainActivity.V.n).a(1.0f);
                    if (!mainActivity.X) {
                        MainActivity.p(mainActivity, 1.0f);
                        break;
                    }
                } else if (i == 4) {
                    ((au) mainActivity.V.n).a(0.0f);
                    if (!mainActivity.X) {
                        MainActivity.p(mainActivity, 0.0f);
                    }
                    if (xi3Var != null && xi3Var.n() != null && xi3Var.y() && xi3Var.T != null) {
                        ((ViewPager2) ((om1) xi3Var.o0.p).o).c(0, false);
                        if (xi3Var.n() != null && xi3Var.y() && xi3Var.T != null && (ck3Var = (ck3) ((ViewPager2) ((om1) xi3Var.o0.p).o).getAdapter()) != null && (playerControllerFragment = (PlayerControllerFragment) ((kc1) ck3Var.z.get(0))) != null) {
                            playerControllerFragment.o0.c(0, false);
                            break;
                        }
                    }
                } else if (i == 5) {
                    u52.f();
                    bl2 bl2Var = mainActivity.P;
                    WeakReference weakReference = bo2.a;
                    if (bl2Var != null) {
                        bl2Var.f(new jr1(bl2Var, 2), gq0.n);
                        break;
                    }
                }
                break;
        }
    }

    private final void d(View view, float f) {
    }

    private final void e(View view, float f) {
    }

    private final void f(View view, float f) {
    }

    private final void g(View view, float f) {
    }
}
