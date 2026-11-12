package defpackage;

import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck3 extends ee1 {
    public final HashMap z;

    public ck3(xi3 r2) {
        super(r2.m(), r2.c0);
        this.z = new HashMap();
    }

    @Override // defpackage.dw3
    public final int a() {
        return 2;
    }

    @Override // defpackage.ee1
    public final kc1 r(int r2) {
        HashMap r1 = this.z;
        if (r2 != 0) goto L5;
        PlayerControllerFragment r0 = new PlayerControllerFragment();
        r1.put(Integer.valueOf(r2), r0);
        return r0;
    L5:
        if (r2 == 1) goto L8;
        PlayerControllerFragment r3 = new PlayerControllerFragment();
        r1.put(Integer.valueOf(r2), r3);
        return r3;
    L8:
        wk3 r4 = new wk3();
        r1.put(Integer.valueOf(r2), r4);
        return r4;
    }
}
