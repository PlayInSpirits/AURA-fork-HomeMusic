package defpackage;

import com.eddyizm.tempus.ui.fragment.HomeFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 extends ee1 {
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList z;

    public lo1(HomeFragment r2) {
        super(r2.m(), r2.c0);
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.z.size();
    }

    @Override // defpackage.ee1
    public final kc1 r(int r1) {
        return (kc1) this.z.get(r1);
    }

    public final void w(int r2, kc1 r3, String r4) {
        this.z.add(r3);
        this.A.add(r4);
        this.B.add(Integer.valueOf(r2));
    }
}
