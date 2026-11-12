package defpackage;

import android.content.Context;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo1 extends ig1 implements gf1 {
    public final /* synthetic */ rm3 n;
    public final /* synthetic */ MaterialToolbar o;
    public final /* synthetic */ MaterialToolbar p;
    public final /* synthetic */ bd1 q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ ni4 t;

    public vo1(rm3 r1, MaterialToolbar r2, MaterialToolbar r3, bd1 r4, Context r5, boolean r6, ni4 r7) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        super(0, g12.class, "refresh", "attach$refresh(Lcom/eddyizm/tempus/homemusic/SongSelection;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/eddyizm/tempus/homemusic/HomeSongSelection$attach$back$1;Landroid/content/Context;ZLcom/eddyizm/tempus/ui/adapter/SongHorizontalAdapter;)V", 0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        boolean r5 = this.s;
        ni4 r6 = this.t;
        jz4.h(this.n, this.o, this.p, this.q, this.r, r5, r6);
        return j15.a;
    }
}
