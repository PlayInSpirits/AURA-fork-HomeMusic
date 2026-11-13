package defpackage;

import com.eddyizm.tempus.ui.fragment.HomeFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lo1 extends ee1 {
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList z;

    public lo1(HomeFragment homeFragment) {
        super(homeFragment.m(), homeFragment.c0);
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.z.size();
    }

    @Override // defpackage.ee1
    public final kc1 r(int i) {
        return (kc1) this.z.get(i);
    }

    public final void w(int i, kc1 kc1Var, String str) {
        this.z.add(kc1Var);
        this.A.add(str);
        this.B.add(Integer.valueOf(i));
    }
}
