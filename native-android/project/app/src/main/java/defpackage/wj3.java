package defpackage;

import androidx.media3.ui.PlayerControlView;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj3 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerControllerFragment b;

    public /* synthetic */ wj3(PlayerControllerFragment r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int r0 = this.a;
        PlayerControllerFragment r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((PlayerControlView) r1.l0.p).getPlayer();
    L7:
        return (Child) r1.L0.n.d();
    }
}
