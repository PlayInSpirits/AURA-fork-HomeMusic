package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.login.LoginActivity;
import com.eddyizm.tempus.util.ClickablePreferenceCategory;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p6 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ p6(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r10) {
        int r0 = this.n;
        int r7 = 0;
        int r8 = 1;
        Object r9 = this.o;
        switch(r0) {
            case 0: goto L128;
            case 1: goto L126;
            case 2: goto L124;
            case 3: goto L122;
            case 4: goto L120;
            case 5: goto L118;
            case 6: goto L116;
            case 7: goto L108;
            case 8: goto L97;
            case 9: goto L95;
            case 10: goto L93;
            case 11: goto L80;
            case 12: goto L78;
            case 13: goto L76;
            case 14: goto L74;
            case 15: goto L72;
            case 16: goto L70;
            case 17: goto L68;
            case 18: goto L66;
            case 19: goto L64;
            case 20: goto L62;
            case 21: goto L60;
            case 22: goto L58;
            case 23: goto L56;
            case 24: goto L54;
            case 25: goto L52;
            case 26: goto L38;
            case 27: goto L36;
            case 28: goto L20;
            default: goto L4;
        };
    L4:
        PlayerControlView r11 = (PlayerControlView) r9;
        String r12 = r11.C0;
        Drawable r1 = r11.A0;
        String r2 = r11.B0;
        Drawable r3 = r11.z0;
        boolean r4 = r11.E0;
        boolean r5 = !r4;
        if (r4 == r5) goto L131;
        r11.E0 = r5;
        ImageView r6 = r11.R;
        if (r6 == null) goto L13;
        if (r4 == true) goto L12;
        r6.setImageDrawable(r3);
        r6.setContentDescription(r2);
        goto L13
    L12:
        r6.setImageDrawable(r1);
        r6.setContentDescription(r12);
    L13:
        ImageView r13 = r11.S;
        if (r13 == null) goto L132;
        if (r4 == true) goto L18;
        r13.setImageDrawable(r3);
        r13.setContentDescription(r2);
        return;
    L18:
        r13.setImageDrawable(r1);
        r13.setContentDescription(r12);
        return;
    L132:
        return;
    L131:
        return;
    L20:
        ee3 r14 = (ee3) r9;
        EditText r15 = r14.f;
        if (r15 == null) goto L133;
        int r16 = r15.getSelectionEnd();
        EditText r17 = r14.f;
        if (r17 != null) goto L26;
    L28:
        EditText r18 = r14.f;
        if (r7 == 0) goto L31;
        r18.setTransformationMethod(null);
    L32:
        if (r16 < 0) goto L34;
        r14.f.setSelection(r16);
    L34:
        r14.p();
        return;
    L31:
        r18.setTransformationMethod(PasswordTransformationMethod.getInstance());
        goto L32
    L26:
        if ((r17.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L28;
        r7 = 1;
        goto L28
    L133:
        return;
    L36:
        ((ep2) r9).dismiss();
        return;
    L38:
        xh2 r19 = (xh2) r9;
        Button r110 = r19.W0;
        if (r19.n0().n == null) goto L41;
        boolean r20 = true;
    L42:
        r110.setEnabled(r20);
        r19.U0.toggle();
        if (r19.N0 == 1) goto L46;
        r7 = 1;
    L46:
        r19.N0 = r7;
        CheckableImageButton r111 = r19.U0;
        if (r7 != 1) goto L49;
        String r112 = r111.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
    L50:
        r19.U0.setContentDescription(r112);
        r19.r0();
        return;
    L49:
        r112 = r111.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        goto L50
    L41:
        r20 = false;
        goto L42
    L52:
        ((fa) r9).invoke();
        return;
    L54:
        LoginFragment r21 = (LoginFragment) r9;
        Intent r113 = new Intent(r21.X(), LoginActivity.class);
        r113.putExtra("HIDE_TAB_LAYOUT", true);
        r113.putExtra("HIDE_TOPAPPBAR_LAYOUT", false);
        r113.putExtra("SELECT_FRAGMENT", 3);
        r21.g0(r113);
        return;
    L56:
        int r114 = LoginActivity.R;
        ((LoginActivity) r9).finish();
        return;
    L58:
        int r115 = LanPlaybackActivity.N;
        ((LanPlaybackActivity) r9).finish();
        return;
    L60:
        ((IndexFragment) r9).m0.T.o();
        return;
    L62:
        ux3 r116 = HubShareActivity.P;
        ((HubShareActivity) r9).finish();
        return;
    L64:
        hp1 r22 = (hp1) r9;
        new eu3(r22).m0(r22.m0.k(), null);
        return;
    L66:
        ((rm3) r9).z();
        return;
    L68:
        App.b().getClass();
        App.c().edit().putBoolean("music_directory_section_visibility", true).apply();
        ((l92) r9).run();
        return;
    L70:
        eh1 r23 = (eh1) r9;
        Bundle r117 = b11.h("MEDIA_BY_GENRE", "MEDIA_BY_GENRE");
        ej r24 = r23.v;
        r117.putParcelable("GENRE_OBJECT", (Parcelable) r24.r.get(r23.c()));
        ((GenreCatalogueFragment) r24.t).onGenreClick(r117);
        return;
    L72:
        dh1 r25 = (dh1) r9;
        Bundle r118 = b11.h("MEDIA_BY_GENRE", "MEDIA_BY_GENRE");
        zd0 r26 = r25.v;
        r118.putParcelable("GENRE_OBJECT", (Parcelable) r26.r.get(r25.c()));
        ((LibraryFragment) r26.s).onGenreClick(r118);
        return;
    L74:
        ((FilterFragment) r9).l0.T.o();
        return;
    L76:
        ((ix0) r9).t();
        return;
    L78:
        uq0 r27 = (uq0) r9;
        Bundle r119 = new Bundle();
        vq0 r28 = r27.v;
        r119.putParcelable("TRACK_OBJECT", (Parcelable) r28.r.get(r27.c()));
        r119.putBoolean("MEDIA_MIX", true);
        r28.q.onMediaClick(r119);
        return;
    L80:
        yd0 r29 = (yd0) r9;
        zd0 r120 = r29.v;
        int r30 = r29.c();
        if (r30 >= 0) goto L83;
        return;
    L83:
        if (r30 >= r120.r.size()) goto L136;
        sp3 r31 = (sp3) r120.r.get(r30);
        if (((bl2) r120.s) == null) goto L137;
        String r121 = r31.f;
        if (r121 != null) goto L91;
        r29.s(r31);
        return;
    L91:
        App.f(false).c().e(r121).enqueue(new gp3(r8, new xd0(r7, r29, r31), r121));
        return;
    L137:
        return;
    L136:
        return;
    L93:
        xa3.t("data_saving_mode", true);
        Dialog r32 = ((ca0) r9).w0;
        Objects.requireNonNull(r32);
        r32.dismiss();
        return;
    L95:
        ((f50) r9).i0(false, false);
        return;
    L97:
        ClickablePreferenceCategory r33 = (ClickablePreferenceCategory) r9;
        ss1 r122 = r33.j0;
        if (r122 == null) goto L138;
        vb4 r123 = r122.o;
        HashSet r34 = r123.A0;
        String r35 = r33.y;
        if ("lan_playback".equals(r35) == false) goto L103;
        r123.g0(new Intent(r123.Z(), LanPlaybackActivity.class));
        return;
    L103:
        if (r34.contains(r35) == false) goto L105;
        r34.remove(r35);
    L106:
        r123.l0();
        return;
    L105:
        r34.add(r35);
        goto L106
    L138:
        return;
    L108:
        s30 r36 = (s30) r9;
        EditText r124 = r36.i;
        if (r124 == null) goto L140;
        Editable r125 = r124.getText();
        if (r125 == null) goto L114;
        r125.clear();
    L114:
        r36.p();
        return;
    L140:
        return;
    L116:
        dj r37 = (dj) r9;
        Bundle r126 = new Bundle();
        ej r38 = r37.v;
        r126.putParcelable("ARTIST_OBJECT", (Parcelable) r38.r.get(r37.c()));
        ((ArtistCatalogueFragment) r38.t).onArtistClick(r126);
        return;
    L118:
        cj r39 = (cj) r9;
        Bundle r127 = new Bundle();
        s6 r40 = r39.v;
        r127.putParcelable("ARTIST_OBJECT", (Parcelable) r40.r.get(r39.c()));
        ((ArtistPageFragment) r40.t).onArtistClick(r127);
        return;
    L120:
        ui r41 = (ui) r9;
        Bundle r128 = new Bundle();
        vi r42 = r41.v;
        r128.putParcelable("ARTIST_OBJECT", ((ArtistID3) r42.u.get(r41.c())).strippedForNav());
        r128.putBoolean("MEDIA_MIX", r42.r);
        r128.putBoolean("MEDIA_BEST_OF", r42.s);
        r42.q.onArtistClick(r128);
        return;
    L122:
        u8 r43 = (u8) r9;
        Bundle r44 = new Bundle();
        ss0 r45 = r43.u;
        r44.putString("ALBUM_LIST_TITLE", ((TextView) r45.q).getText().toString());
        r44.putParcelableArrayList("ALBUMS_OBJECT", new ArrayList((List) r43.v.s.getOrDefault((String) ((TextView) r45.p).getTag(), Collections.EMPTY_LIST)));
        gb.x(r10).m(R.id.albumListPageFragment, r44, null);
        return;
    L124:
        p7 r46 = (p7) r9;
        Bundle r129 = new Bundle();
        q7 r47 = r46.v;
        r129.putParcelable("ALBUM_OBJECT", ((AlbumID3) r47.s.get(r46.c())).strippedForNav());
        ((AlbumCatalogueFragment) r47.u).onAlbumClick(r129);
        return;
    L126:
        k7 r48 = (k7) r9;
        Bundle r130 = new Bundle();
        l7 r49 = r48.v;
        r130.putParcelable("ALBUM_OBJECT", ((AlbumID3) r49.r.get(r48.c())).strippedForNav());
        r49.q.onAlbumClick(r130);
        return;
    L128:
        r6 r50 = (r6) r9;
        Bundle r131 = new Bundle();
        s6 r51 = r50.v;
        r131.putParcelable("ALBUM_OBJECT", ((AlbumID3) r51.r.get(r50.c())).strippedForNav());
        r51.t.onAlbumClick(r131);
    }
}
