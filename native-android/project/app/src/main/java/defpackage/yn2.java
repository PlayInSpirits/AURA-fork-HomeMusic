package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn2 implements ao2 {
    public final /* synthetic */ bj2 n;

    public yn2(bj2 bj2Var) {
        this.n = bj2Var;
    }

    @Override // defpackage.ao2
    public final void a(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("play_next_insert_pos", i);
        bundle.putInt("play_next_count", i2);
        bundle.putInt("play_next_target_count", i3);
        hw.b(this.n.b1(new va4("com.eddyizm.tempus.PLAY_NEXT_FIXUP", Bundle.EMPTY), bundle), new tv1(), gq0.n);
    }

    @Override // defpackage.ao2
    public final qi3 b() {
        return this.n;
    }
}
