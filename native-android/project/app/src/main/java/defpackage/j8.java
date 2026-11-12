package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.radiobrowser.RadioBrowserStation;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.AlbumInfo;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistInfo2;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ j8(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View r15) {
        int r0 = this.n;
        int r2 = 2;
        int r3 = 10;
        int r4 = 1;
        int r5 = 0;
        ik r6 = null;
        String r7 = null;
        r7 = null;
        String r8 = null;
        Object r9 = this.p;
        Object r14 = this.o;
        switch(r0) {
            case 0: goto L181;
            case 1: goto L179;
            case 2: goto L175;
            case 3: goto L169;
            case 4: goto L167;
            case 5: goto L165;
            case 6: goto L163;
            case 7: goto L161;
            case 8: goto L159;
            case 9: goto L154;
            case 10: goto L152;
            case 11: goto L150;
            case 12: goto L148;
            case 13: goto L84;
            case 14: goto L64;
            case 15: goto L62;
            case 16: goto L60;
            case 17: goto L58;
            case 18: goto L56;
            case 19: goto L54;
            case 20: goto L39;
            case 21: goto L28;
            case 22: goto L23;
            case 23: goto L21;
            case 24: goto L16;
            case 25: goto L11;
            case 26: goto L6;
            default: goto L4;
        };
    L4:
        uv4 r16 = (uv4) r14;
        ik r10 = (ik) r9;
        r16.i0(true, false);
        ((MainActivity) r16.X()).F(r10, !"song".equals(r10.c));
        return;
    L6:
        f9 r11 = (f9) r9;
        ud3.A0(false);
        rb4 r17 = (rb4) ((zk4) r14).D0;
        if (r17 == null) goto L9;
        r17.run();
    L9:
        r11.dismiss();
        return;
    L11:
        f9 r12 = (f9) r9;
        xa3.t("sync_starred_artists_for_offline_use", false);
        rb4 r18 = (rb4) ((zk4) r14).D0;
        if (r18 == null) goto L14;
        r18.run();
    L14:
        r12.dismiss();
        return;
    L16:
        f9 r13 = (f9) r9;
        ud3.z0(false);
        rb4 r19 = (rb4) ((zk4) r14).D0;
        if (r19 == null) goto L19;
        r19.run();
    L19:
        r13.dismiss();
        return;
    L21:
        ((View.OnClickListener) r9).onClick(r15);
        ((qg4) r14).a(1);
        return;
    L23:
        f9 r20 = (f9) r9;
        MainActivity r110 = (MainActivity) ((sa4) r14).l();
        if (r110 == null) goto L26;
        r110.H();
    L26:
        r20.dismiss();
        return;
    L28:
        RadioBrowserStation r21 = (RadioBrowserStation) r9;
        eu3 r111 = (eu3) ((ss2) ((zd0) r14).s).o;
        String r112 = r21.urlResolved;
        if (r112 != null) goto L32;
        r112 = r21.url;
    L32:
        ((TextInputEditText) r111.B0.f).setText(r21.name);
        ((TextInputEditText) r111.B0.g).setText(r112);
        ((TextInputEditText) r111.B0.e).setText(r21.homepage);
        String r113 = r21.favicon;
        if (r113 != null) goto L35;
    L37:
        ((TextInputEditText) r111.B0.d).setText(r7);
        r111.I0.dismiss();
        return;
    L35:
        if (r113.isEmpty() == true) goto L37;
        r7 = r21.favicon;
        goto L37
    L39:
        yk3 r114 = (yk3) r14;
        xk3 r22 = (xk3) r9;
        if (u52.c().a == false) goto L52;
        int r115 = r22.c();
        if (r115 == (-1)) goto L198;
        v52 r116 = u52.c();
        if (r115 == r116.o) goto L47;
        u52.q("select", r115, r115);
        return;
    L47:
        if (r116.k == false) goto L49;
        String r117 = "pause";
    L50:
        u52.a(r117, 0);
        return;
    L49:
        r117 = "play";
        goto L50
    L198:
        return;
    L52:
        r114.r.f(new ur2(r3, r114, r22), gq0.n);
        return;
    L54:
        new uv4((do2) r9).m0(((PlayerControllerFragment) r14).K0.k(), null);
        return;
    L56:
        PlayerControllerFragment r118 = (PlayerControllerFragment) r14;
        Bundle r119 = new Bundle();
        r119.putParcelable("ALBUM_OBJECT", (AlbumID3) r9);
        q05.l(r118).m(R.id.albumPageFragment, r119, null);
        r118.K0.q();
        return;
    L58:
        PlayerControllerFragment r120 = (PlayerControllerFragment) r14;
        r120.L0.h(r120.Z(), (Child) r9);
        return;
    L60:
        PlayerControllerFragment r121 = (PlayerControllerFragment) r14;
        Bundle r122 = new Bundle();
        r122.putParcelable("ARTIST_OBJECT", (ArtistID3) r9);
        q05.l(r121).m(R.id.artistPageFragment, r122, null);
        r121.K0.q();
        return;
    L62:
        PlayerControllerFragment r123 = (PlayerControllerFragment) r14;
        xf4 r124 = new xf4();
        r124.B0 = new pz1(r123, (bj2) r9);
        r124.m0(r123.X().k(), null);
        return;
    L64:
        View r23 = (View) r9;
        Child r125 = (Child) ((ad2) r14).d();
        if (r125 == null) goto L199;
        Context r126 = r23.getContext();
        r126.getClass();
        String r127 = r125.getId();
        WeakReference r1 = a.a;
        r127.getClass();
        SmartSession r24 = a.b;
        if (r24 != null) goto L70;
        return;
    L70:
        if (r24.isRec(r127) == false) goto L201;
        Context r128 = r126.getApplicationContext();
        qi3 r25 = a.h();
        if (r25 == null) goto L82;
        gn2 r26 = r25.a();
        if (r26 == null) goto L78;
        r8 = r26.a;
    L78:
        if (h12.c(r8, r127) == false) goto L82;
        if (r25.f0() == false) goto L82;
        r25.c0();
    L82:
        io1.a.execute(new ct1(r24, r127, r128, r4));
        return;
    L201:
        return;
    L199:
        return;
    L84:
        wj3 r27 = (wj3) r9;
        Context r129 = ((View) r14).getContext();
        r129.getClass();
        qi3 r130 = a.h();
        if (r130 != null) goto L90;
        qi3 r131 = (qi3) r27.get();
        if (r131 == null) goto L202;
        r131.s(!r131.D0());
        return;
    L202:
        return;
    L90:
        if (a.d == true) goto L206;
        boolean r28 = r130.D0();
        if (a.b == null) goto L95;
        Object[] r29 = true;
    L96:
        od4.n.getClass();
        od4 r30 = od4.o;
        od4 r31 = od4.p;
        od4 r32 = od4.q;
        if (r29 == false) goto L99;
        od4 r33 = r32;
    L103:
        if (a.i(r130) == null) goto L105;
        Object[] r34 = true;
    L106:
        int r132 = r33.ordinal();
        if (r132 == 0) goto L114;
        if (r132 == 1) goto L112;
        if (r132 == 2) goto L115;
        er1.n();
        return;
    L115:
        int r35 = r30.ordinal();
        if (r35 == 0) goto L143;
        if (r35 == 1) goto L142;
        if (r35 != 2) goto L141;
        ud3.y0(true);
        Context r133 = r129.getApplicationContext();
        r133.getClass();
        String r36 = a.i(r130);
        ArrayList r37 = a.e(r130);
        int r38 = r130.o0();
        if (r36 == null) goto L140;
        if (r38 < 0) goto L140;
        if (r38 >= r37.size()) goto L140;
        ArrayList r134 = new ArrayList(r40.k0(r37, 10));
        int r39 = r37.size();
        int r40 = 0;
    L125:
        if (r40 >= r39) goto L127;
        Object r41 = r37.get(r40);
        r40 = r40 + 1;
        r134.add(((gn2) r41).a);
        goto L125
    L127:
        ArrayList r42 = new ArrayList();
        int r43 = r134.size();
        int r44 = 0;
    L128:
        if (r44 >= r43) goto L132;
        Object r135 = r134.get(r44);
        r44 = r44 + 1;
        String r136 = (String) r135;
        rs1 r137 = rs1.a;
        r136.getClass();
        if (rs1.c(r136).equals(r36) == false) goto L128;
        r42.add(r135);
        goto L128
    L132:
        SmartContexts r138 = SmartContexts.INSTANCE;
        ArrayList r45 = new ArrayList(r40.k0(r42, 10));
        int r46 = r42.size();
    L133:
        if (r5 >= r46) goto L135;
        Object r47 = r42.get(r5);
        r5 = r5 + 1;
        r45.add(r138.hubId((String) r47));
        goto L133
    L135:
        String r139 = ((gn2) r37.get(r38)).a;
        if (r42.contains(r139) == false) goto L138;
        String r140 = r139;
    L139:
        Context r141 = r133.getApplicationContext();
        Toast.makeText(r141, R.string.homemusic_smart_starting, 1).show();
        a.d = true;
        a.c();
        io1.a.execute(new up(r36, r45, r140, WaveOrigin.PLAYER, r141, null));
    L146:
        a.c();
        return;
    L138:
        r140 = null;
    L140:
        Toast.makeText(r133, R.string.homemusic_smart_unavailable_list, 0).show();
        r130.s(false);
        goto L146
    L141:
        er1.n();
        return;
    L142:
        r130.s(true);
        goto L146
    L143:
        if (r33 != r32) goto L145;
        a.g(r130);
    L145:
        r130.s(false);
        ud3.y0(false);
        goto L146
    L112:
        if (r34 == false) goto L115;
        r30 = r32;
        goto L115
    L114:
        r30 = r31;
        goto L115
    L105:
        r34 = false;
        goto L106
    L99:
        if (r28 == false) goto L101;
        r33 = r31;
        goto L103
    L101:
        r33 = r30;
        goto L103
    L95:
        r29 = false;
        goto L96
    L206:
        return;
    L148:
        ur1.a.execute(new k6(29, (fx3) r14, (String) r9));
        return;
    L150:
        SongBottomSheetDialog r142 = (SongBottomSheetDialog) r14;
        ld1 r143 = r142.q();
        r142.h0();
        Bundle r144 = new Bundle();
        r144.putParcelable("TRACK_OBJECT", (Child) r9);
        r143.Z("homemusic_remove_from_liked", r144);
        return;
    L152:
        mo1 r48 = (mo1) r9;
        ClickCallback r145 = ((q7) r14).u;
        Bundle r146 = new Bundle();
        r146.putParcelable("PLAYLIST_OBJECT", (Parcelable) r48.x.t.get(r48.c()));
        r145.onPlaylistClick(r146);
        return;
    L154:
        FilterFragment r147 = (FilterFragment) r14;
        Bundle r49 = (Bundle) r9;
        if (r147.n0.d.size() <= 1) goto L157;
        r147.l0.T.m(R.id.action_filterFragment_to_songListPageFragment, r49, null);
        return;
    L157:
        Toast.makeText(r147.Z(), r147.s(R.string.filter_info_selection), 0).show();
        return;
    L159:
        new Thread(new lf(((jo0) r14).Z(), r2)).start();
        ((f9) r9).dismiss();
        return;
    L161:
        int r148 = DefaultErrorActivity.N;
        sg0.d((DefaultErrorActivity) r14, (oz) r9);
        return;
    L163:
        f50 r149 = (f50) r14;
        Bundle r150 = new Bundle();
        r150.putString("color_key", (String) ((jx3) r9).n);
        r149.q().Z("dialog_result_key", r150);
        r149.i0(false, false);
        return;
    L165:
        b.m(((ArtistPageFragment) r14).m0, (String) r9, WaveOrigin.ARTIST_PAGE);
        return;
    L167:
        Intent r151 = new Intent("android.intent.action.VIEW");
        r151.setData(Uri.parse(((ArtistInfo2) r9).getLastFmUrl()));
        ((ArtistPageFragment) r14).g0(r151);
        return;
    L169:
        ArtistPageFragment r152 = (ArtistPageFragment) r14;
        List r50 = (List) r9;
        Bundle r153 = b11.h("ALBUM_LIST_TITLE", r152.s(R.string.artist_page_title_appears_on_section));
        ArrayList<? extends Parcelable> r51 = new ArrayList(r50.size());
        Iterator r52 = r50.iterator();
    L171:
        if (r52.hasNext() == false) goto L173;
        r51.add(((AlbumID3) r52.next()).strippedForNav());
        goto L171
    L173:
        r153.putParcelableArrayList("ALBUMS_OBJECT", r51);
        gb.x(r152.a0()).m(R.id.albumListPageFragment, r153, null);
        return;
    L175:
        ArtistBottomSheetDialog r154 = (ArtistBottomSheetDialog) r14;
        String r53 = (String) r9;
        MainActivity r155 = (MainActivity) r154.l();
        r154.h0();
        if (r155 == null) goto L208;
        b.m(r155, r53, WaveOrigin.ARTIST_MENU);
        return;
    L208:
        return;
    L179:
        Intent r156 = new Intent("android.intent.action.VIEW");
        r156.setData(Uri.parse(((AlbumInfo) r9).getLastFmUrl()));
        ((AlbumPageFragment) r14).g0(r156);
        return;
    L181:
        AlbumPageFragment r157 = (AlbumPageFragment) r14;
        int r158 = ((AlbumID3) r9).getYear();
        if (r158 <= 0) goto L185;
        r6 = l93.h("year", String.valueOf(r158));
    L185:
        if (r6 == null) goto L209;
        r157.m0.F(r6, true);
        return;
    }
}
