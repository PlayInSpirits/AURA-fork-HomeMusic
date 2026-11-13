package defpackage;

import androidx.media3.ui.PlayerControlView;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj3 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerControllerFragment b;

    public /* synthetic */ wj3(PlayerControllerFragment playerControllerFragment, int i) {
        this.a = i;
        this.b = playerControllerFragment;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        PlayerControllerFragment playerControllerFragment = this.b;
        switch (i) {
            case 0:
                return (Child) playerControllerFragment.L0.n.d();
            default:
                return ((PlayerControlView) playerControllerFragment.l0.p).getPlayer();
        }
    }
}
