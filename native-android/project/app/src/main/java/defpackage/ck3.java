package defpackage;

import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck3 extends ee1 {
    public final HashMap z;

    public ck3(xi3 xi3Var) {
        super(xi3Var.m(), xi3Var.c0);
        this.z = new HashMap();
    }

    @Override // defpackage.dw3
    public final int a() {
        return 2;
    }

    @Override // defpackage.ee1
    public final kc1 r(int i) {
        HashMap map = this.z;
        if (i == 0) {
            PlayerControllerFragment playerControllerFragment = new PlayerControllerFragment();
            map.put(Integer.valueOf(i), playerControllerFragment);
            return playerControllerFragment;
        }
        if (i != 1) {
            PlayerControllerFragment playerControllerFragment2 = new PlayerControllerFragment();
            map.put(Integer.valueOf(i), playerControllerFragment2);
            return playerControllerFragment2;
        }
        wk3 wk3Var = new wk3();
        map.put(Integer.valueOf(i), wk3Var);
        return wk3Var;
    }
}
