package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn2 implements ao2 {
    public final /* synthetic */ bj2 n;

    public yn2(bj2 r1) {
        this.n = r1;
    }

    @Override // defpackage.ao2
    public final void a(int r3, int r4, int r5) {
        Bundle r0 = new Bundle();
        r0.putInt("play_next_insert_pos", r3);
        r0.putInt("play_next_count", r4);
        r0.putInt("play_next_target_count", r5);
        va4 r6 = new va4("com.eddyizm.tempus.PLAY_NEXT_FIXUP", Bundle.EMPTY);
        hw.b(this.n.b1(r6, r0), new tv1(), gq0.n);
    }

    @Override // defpackage.ao2
    public final qi3 b() {
        return this.n;
    }
}
