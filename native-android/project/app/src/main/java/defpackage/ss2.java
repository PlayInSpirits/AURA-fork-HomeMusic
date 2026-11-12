package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MenuItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.search.SearchBar;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss2 implements it2, gt2, jg2, q33, av4, tx, g3, gz3, mk, rc2, eg1, np4, fz, wc0, ro4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ss2(ip0 r1, cy3 r2) {
        this.n = 12;
        this.o = r1;
    }

    @Override // defpackage.q33
    public boolean a(MenuItem r1) {
        v23 r0 = (v23) this.o;
        r0.getClass();
        r1.getClass();
        return uo.C(r1, r0);
    }

    @Override // defpackage.wc0
    public void accept(Object r7) {
        int r0 = this.n;
        Object r6 = this.o;
        switch(r0) {
            case 21: goto L6;
            default: goto L4;
        };
    L4:
        ((uw1) r6).c((lg0) r7);
        return;
    L6:
        un4 r8 = (un4) r6;
        lg0 r9 = (lg0) r7;
        tn4 r1 = new tn4(r9.b, i80.y(r9.a, r9.c));
        r8.c.add(r1);
        long r2 = r8.j;
        if (r2 != (-9223372036854775807L)) goto L9;
    L10:
        r8.g(r1);
        return;
    L9:
        if (r9.d >= r2) goto L10;
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo77apply(Object r4) {
        int r0 = this.n;
        Object r3 = this.o;
        switch(r0) {
            case 17: goto L6;
            default: goto L5;
        };
    L6:
        Bitmap r5 = (Bitmap) r4;
        int r1 = r5.getWidth();
        int r6 = ((x7) r3).o;
        if (r1 <= r6) goto L9;
    L10:
        float r7 = r6;
        float r2 = r5.getWidth();
        float r8 = r5.getHeight();
        float r9 = Math.min(r7 / r2, r7 / r8);
        r5 = Bitmap.createScaledBitmap(r5, (int) (r2 * r9), (int) (r8 * r9), true);
    L12:
        if (Build.VERSION.SDK_INT >= 31) goto L14;
        return r5;
    L14:
        return db.c(r5);
    L9:
        if (r5.getHeight() <= r6) goto L12;
    L5:
        return ((x05) r3).b((Type) r4);
    }

    @Override // defpackage.tx
    public void b(long r7, long r9, long r11) {
        zq3 r6 = (zq3) this.o;
        if (r6.e != null) goto L6;
        return;
    L6:
        if (r7 != (-1)) goto L8;
    L12:
        float r12 = -1.0f;
    L11:
        float r5 = r12;
        kt0 r0 = r6.e;
        r0.getClass();
        r0.b(r7, r9, r5);
        return;
    L8:
        if (r7 == 0) goto L12;
        r12 = f35.U(r9, r7);
        goto L11
    }

    @Override // defpackage.ro4
    public so4 c(y10 r7) {
        Context r1 = (Context) this.o;
        String r2 = (String) r7.e;
        uv r3 = (uv) r7.f;
        r3.getClass();
        if (r2 != null) goto L5;
    L8:
        kf2.n("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    L5:
        if (r2.length() == 0) goto L8;
        return new bf1(r1, r2, r3, true, true);
    }

    public void d() {
        wf1 r8 = (wf1) this.o;
        Object r0 = jh4.c;
        monitor-enter(r0);
        List r1 = jh4.h;     // Catch: Throwable -> L17
        r1.getClass();     // Catch: Throwable -> L17
        ArrayList r2 = new ArrayList(r40.k0(r1, 10));     // Catch: Throwable -> L17
        Iterator r3 = r1.iterator();     // Catch: Throwable -> L17
        boolean r4 = false;
    L6:
        if (r3.hasNext() == false) goto L14;
        Object r5 = r3.next();     // Catch: Throwable -> L17
        boolean r6 = true;
        if (r4 == false) goto L10;
    L12:
        if (r6 == false) goto L6;
        r2.add(r5);     // Catch: Throwable -> L17
        goto L6
    L10:
        if (h12.c(r5, r8) == false) goto L12;
        r4 = true;
        r6 = false;
        goto L12
    L14:
        jh4.h = r2;     // Catch: Throwable -> L17
        monitor-exit(r0);
        return;
    L17:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.gt2
    public void e(al3 r1, fr2 r2) {
        ((wc0) this.o).accept(r1);
    }

    @Override // defpackage.rc2
    public void f(Object r2, w71 r3) {
        oi3 r4 = (oi3) r2;
        r4.B((qe4) this.o, new ni3(r3));
    }

    @Override // defpackage.jg2
    public Object g(Object r3, Object r4) {
        rm3 r0 = new rm3(((tz2) this.o).s, r3, false);
        return hw.P(r0, (List) ((Collection) r4));
    }

    @Override // defpackage.it2
    public Object h(tn2 r3, fr2 r4, int r5) {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        pq r6 = r3.e;
        kn2 r1 = r3.k;
        fr2 r7 = r3.B(r4);
        r6.getClass();
        r1.getClass();
        r7.getClass();
        gn2 r8 = r1.a().a();
        r8.getClass();
        String r9 = r8.a;
        r9.getClass();
        return r6.e(r1, r7, r9, (lu3) r2);
    L6:
        gt2 r10 = (gt2) r2;
        mw1 r11 = mw1.o;
        if (r3.l() == true) goto L10;
        r10.e(r3.s, r4);
        kt2.P0(r3, r4, r5, new ab4(0));
    L10:
        return r11;
    L12:
        return r3.s(r4, (jn2) r2);
    L14:
        return r3.z(r4, (String) r2);
    }

    @Override // defpackage.np4
    public void j() {
        SongListPageFragment r1 = (SongListPageFragment) this.o;
        r1.i0();
        ((SwipeRefreshLayout) r1.l0.h).setRefreshing(false);
    }

    @Override // defpackage.gz3
    public void k(long r2, be3 r4) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 14: goto L6;
            default: goto L4;
        };
    L4:
        ji2.t(r2, r4, (wv4[]) ((r20) r1).p);
        return;
    L6:
        ji2.s(r2, r4, (wv4[]) ((jv3) r1).o);
    }

    @Override // defpackage.fz
    public void onCancel() {
        ((pj4) this.o).a();
    }

    @Override // defpackage.av4
    public boolean onMenuItemClick(MenuItem r9) {
        PlaylistEditorFragment r8 = (PlaylistEditorFragment) this.o;
        if (r9.getItemId() != R.id.action_save_playlist) goto L31;
        r9.setEnabled(false);
        qg4 r10 = r8.p0;
        if (r10 == null) goto L7;
        r10.a(3);
    L7:
        wl3 r11 = r8.m0;
        if (r11.i == false) goto L10;
        return true;
    L10:
        r11.i = true;
        String r4 = r11.f.getName();
        rm2 r6 = new rm2(8, r11);
        List r12 = (List) r11.g.d();
        if (r12 != null) goto L13;
        ArrayList r5 = null;
    L18:
        if (r5 != null) goto L22;
        r6.g();
        return true;
    L22:
        if (r5.isEmpty() == false) goto L29;
        Integer r13 = r11.j;
        if (r13 == null) goto L29;
        if (r13.intValue() <= 0) goto L29;
        ((wl3) r6.o).h.i(Integer.valueOf(R.string.playlist_editor_dialog_action_save_empty));
        return true;
    L29:
        mm3 r2 = r11.c;
        String r3 = r11.f.getId();
        r2.getClass();
        new Thread(new mr(r2, r3, r4, r5, r6, 10)).start();
        return true;
    L13:
        ArrayList r1 = new ArrayList();
        Iterator r14 = r12.iterator();
    L15:
        if (r14.hasNext() == false) goto L17;
        r1.add(((Child) r14.next()).getId());
        goto L15
    L17:
        r5 = r1;
        goto L18
    L31:
        return false;
    }

    @Override // defpackage.g3
    public void onTouchExplorationStateChanged(boolean r2) {
        SearchBar r1 = (SearchBar) this.o;
        int r0 = SearchBar.z0;
        r1.setFocusableInTouchMode(r2);
    }

    public /* synthetic */ ss2(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.mk
    public ic2 apply(Object r1) {
        return (ic2) this.o;
    }
}
