package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wk3 extends kc1 implements ClickCallback {
    public lv4 l0;
    public FloatingActionButton m0;
    public ExtendedFloatingActionButton n0;
    public ExtendedFloatingActionButton o0;
    public ExtendedFloatingActionButton p0;
    public ExtendedFloatingActionButton q0;
    public ExtendedFloatingActionButton r0;
    public boolean s0;
    public aj3 t0;
    public li3 u0;
    public bl2 v0;
    public yk3 w0;
    public List x0;

    public wk3() {
        this.s0 = false;
        this.x0 = new ArrayList();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        final int r0 = 0;
        View r14 = r11.inflate(R.layout.inner_fragment_player_queue, r12, false);
        int r15 = R.id.fab_clear_queue;
        ExtendedFloatingActionButton r3 = (ExtendedFloatingActionButton) uo.s(r14, R.id.fab_clear_queue);
        if (r3 == null) goto L31;
        r15 = R.id.fab_download_all;
        ExtendedFloatingActionButton r4 = (ExtendedFloatingActionButton) uo.s(r14, R.id.fab_download_all);
        if (r4 == null) goto L31;
        r15 = R.id.fab_load_queue;
        ExtendedFloatingActionButton r5 = (ExtendedFloatingActionButton) uo.s(r14, R.id.fab_load_queue);
        if (r5 == null) goto L31;
        r15 = R.id.fab_menu_container;
        if (((LinearLayout) uo.s(r14, R.id.fab_menu_container)) == null) goto L31;
        r15 = R.id.fab_menu_toggle;
        FloatingActionButton r6 = (FloatingActionButton) uo.s(r14, R.id.fab_menu_toggle);
        if (r6 == null) goto L31;
        r15 = R.id.fab_save_to_playlist;
        ExtendedFloatingActionButton r7 = (ExtendedFloatingActionButton) uo.s(r14, R.id.fab_save_to_playlist);
        if (r7 == null) goto L31;
        r15 = R.id.fab_shuffle_queue;
        ExtendedFloatingActionButton r8 = (ExtendedFloatingActionButton) uo.s(r14, R.id.fab_shuffle_queue);
        if (r8 == null) goto L31;
        r15 = R.id.player_queue_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r14, R.id.player_queue_recycler_view);
        if (r9 == null) goto L31;
        CoordinatorLayout r2 = (CoordinatorLayout) r14;
        this.l0 = new lv4(r2, r3, r4, r5, r6, r7, r8, r9);
        nc1 r16 = X();
        e75 r17 = r16.d();
        b75 r1 = gh0.r(r16);
        bq4 r10 = new bq4(r17, r1, b11.e(r16, r1));
        i30 r18 = kx3.a(aj3.class);
        String r19 = r18.b();
        if (r19 == null) goto L29;
        this.t0 = (aj3) r10.l(r18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r19));
        nc1 r110 = X();
        e75 r111 = r110.d();
        b75 r20 = gh0.r(r110);
        bq4 r21 = new bq4(r111, r20, b11.e(r110, r20));
        i30 r112 = kx3.a(li3.class);
        String r113 = r112.b();
        if (r113 == null) goto L27;
        this.u0 = (li3) r21.l(r112, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r113));
        lv4 r114 = this.l0;
        FloatingActionButton r115 = (FloatingActionButton) r114.q;
        this.m0 = r115;
        this.n0 = (ExtendedFloatingActionButton) r114.n;
        this.o0 = (ExtendedFloatingActionButton) r114.s;
        this.p0 = (ExtendedFloatingActionButton) r114.r;
        this.q0 = (ExtendedFloatingActionButton) r114.o;
        this.r0 = (ExtendedFloatingActionButton) r114.p;
        r115.setOnClickListener(new vk3(this, r0));
        final int r116 = 1;
        this.n0.setOnClickListener(new vk3(this, r116));
        final int r22 = 2;
        this.o0.setOnClickListener(new vk3(this, r22));
        final int r23 = 3;
        this.p0.setOnClickListener(new vk3(this, r23));
        final int r24 = 4;
        this.q0.setOnClickListener(new vk3(this, r24));
        final int r25 = 5;
        this.r0.setOnClickListener(new vk3(this, r25));
        if (ud3.Y() == true) goto L25;
        this.r0.setVisibility(8);
    L25:
        RecyclerView r117 = (RecyclerView) this.l0.t;
        Z();
        r117.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.t).setHasFixedSize(true);
        ((RecyclerView) this.l0.t).setClipToPadding(false);
        ((RecyclerView) this.l0.t).post(new tk3(this, r25));
        yk3 r118 = new yk3(this);
        this.w0 = r118;
        ((RecyclerView) this.l0.t).setAdapter(r118);
        a.f.e(v(), new uk3(this, r0));
        j0();
        ns3 r119 = this.t0.f.a;
        ((s24) r119.o).i().a(new String[]{"queue"}, new ks3(r119, r116)).e(v(), new uk3(this, r116));
        u52.c.e(v(), new uk3(this, r22));
        u52.b.e(v(), new uk3(this, r23));
        new f22(new oo1(this)).i((RecyclerView) this.l0.t);
        return r2;
    L27:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L29:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L31:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        yk3 r0 = this.w0;
        r0.r = this.v0;
        r0.d();
        this.v0.f(new tk3(this, 0), gq0.n);
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        int r9 = 4;
        if (r3.a.e() == false) goto L6;
        xc5 r0 = new xc5(r9, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.v0 = r7;
        bo2.j(r7, this.u0);
        this.u0.b.e(v(), new uk3(this, r9));
        this.u0.c.e(v(), new uk3(this, 5));
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.v0);
        this.R = true;
    }

    public final void h0(View r4, int r5) {
        r4.animate().translationY(((r5 + 1) * 70.0f) * r().getDisplayMetrics().density).alpha(0.0f).setDuration(250).withEndAction(new ni0(r4, 1)).start();
    }

    public final void i0(View r2, int r3) {
        float r4 = ((r3 + 1) * 70.0f) * r().getDisplayMetrics().density;
        r2.setVisibility(0);
        r2.setAlpha(0.0f);
        r2.setTranslationY(r4);
        r2.animate().translationY(0.0f).alpha(1.0f).setDuration(250).start();
    }

    public final void j0() {
        if (this.w0 != null) goto L5;
        return;
    L5:
        if (u52.c().a == false) goto L14;
        v52 r0 = u52.c();
        int r1 = r0.o;
        List r2 = u52.l();
        if (r1 >= 0) goto L9;
    L11:
        String r3 = null;
    L12:
        this.w0.q(r3, r0.j);
        return;
    L9:
        if (r1 >= r2.size()) goto L11;
        r3 = ((Child) r2.get(r1)).getId();
        goto L12
    L14:
        String r4 = (String) this.u0.b.d();
        Boolean r5 = (Boolean) this.u0.c.d();
        yk3 r6 = this.w0;
        if (r5 != null) goto L17;
    L19:
        boolean r7 = false;
    L20:
        r6.q(r4, r7);
        return;
    L17:
        if (r5.booleanValue() == false) goto L19;
        r7 = true;
        goto L20
    }

    public final void k0() {
        if (this.s0 == true) goto L5;
        i0(this.o0, 0);
        i0(this.q0, 1);
        i0(this.n0, 2);
        i0(this.p0, 3);
        if (ud3.Y() == false) goto L11;
        i0(this.r0, 4);
    L11:
        this.m0.animate().rotation(45.0f).setDuration(250).start();
    L12:
        this.s0 = !this.s0;
        return;
    L5:
        if (ud3.Y() == false) goto L7;
        h0(this.r0, 4);
    L7:
        h0(this.p0, 3);
        h0(this.n0, 2);
        h0(this.q0, 1);
        h0(this.o0, 0);
        this.m0.animate().rotation(0.0f).setDuration(250).start();
        goto L12
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r3) {
        bo2.q(this.v0, r3.getParcelableArrayList("TRACKS_OBJECT"), r3.getInt("ITEM_POSITION"), "queue");
    }
}
