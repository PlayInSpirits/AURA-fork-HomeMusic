package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageButton;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.HomeFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.ToolbarFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q80 extends m75 {
    public final /* synthetic */ int a;
    public final Object b;

    public q80() {
        this.a = 0;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.m75
    public void a(int i) {
        int i2 = this.a;
        int i3 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ((m75) obj2).a(i);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    mj0.j("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                ((de1) obj).b(false);
                break;
        }
    }

    @Override // defpackage.m75
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) this.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((m75) obj).b(i, f, i2);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    mj0.j("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
        }
    }

    @Override // defpackage.m75
    public final void c(int i) {
        int i2 = this.a;
        int i3 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ((m75) obj2).c(i);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    mj0.j("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                ((de1) obj).b(false);
                break;
            case 2:
                ToolbarFragment toolbarFragment = (ToolbarFragment) ((HomeFragment) obj).m().C(R.id.toolbar_fragment);
                if (toolbarFragment != null) {
                    toolbarFragment.h0();
                    break;
                }
                break;
            default:
                PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) obj;
                xi3 xi3Var = (xi3) playerControllerFragment.X().k().D("PlayerBottomSheet");
                if (i != 0) {
                    if (i == 1) {
                        ((BottomSheetBehavior) ((au) playerControllerFragment.K0.V.n).b).X = true;
                        playerControllerFragment.o0.setUserInputEnabled(true);
                        if (xi3Var != null) {
                            ((ViewPager2) ((om1) xi3Var.o0.p).o).setUserInputEnabled(false);
                        }
                        ImageButton imageButton = playerControllerFragment.B0;
                        if (imageButton != null) {
                            playerControllerFragment.B0.setImageTintList(ColorStateList.valueOf(g12.t(imageButton, R.attr.colorPrimary)));
                            break;
                        }
                    }
                } else {
                    ((BottomSheetBehavior) ((au) playerControllerFragment.K0.V.n).b).X = true;
                    playerControllerFragment.o0.setUserInputEnabled(false);
                    if (xi3Var != null) {
                        ((ViewPager2) ((om1) xi3Var.o0.p).o).setUserInputEnabled(true);
                    }
                    ImageButton imageButton2 = playerControllerFragment.B0;
                    if (imageButton2 != null) {
                        playerControllerFragment.B0.setImageTintList(ColorStateList.valueOf(g12.t(imageButton2, R.attr.colorOnSurface)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
