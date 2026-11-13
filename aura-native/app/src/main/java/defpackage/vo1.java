package defpackage;

import android.content.Context;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class vo1 extends ig1 implements gf1 {
    public final /* synthetic */ rm3 n;
    public final /* synthetic */ MaterialToolbar o;
    public final /* synthetic */ MaterialToolbar p;
    public final /* synthetic */ bd1 q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ ni4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo1(rm3 rm3Var, MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2, bd1 bd1Var, Context context, boolean z, ni4 ni4Var) {
        super(0, g12.class, "refresh", "attach$refresh(Lcom/eddyizm/tempus/homemusic/SongSelection;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/eddyizm/tempus/homemusic/HomeSongSelection$attach$back$1;Landroid/content/Context;ZLcom/eddyizm/tempus/ui/adapter/SongHorizontalAdapter;)V", 0);
        this.n = rm3Var;
        this.o = materialToolbar;
        this.p = materialToolbar2;
        this.q = bd1Var;
        this.r = context;
        this.s = z;
        this.t = ni4Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        jz4.h(this.n, this.o, this.p, this.q, this.r, this.s, this.t);
        return j15.a;
    }
}
