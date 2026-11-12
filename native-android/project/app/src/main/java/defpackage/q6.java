package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q6 implements View.OnLongClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ q6(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View r9) {
        int r10 = this.n;
        int r0 = 0;
        Object r8 = this.o;
        switch(r10) {
            case 0: goto L70;
            case 1: goto L68;
            case 2: goto L66;
            case 3: goto L64;
            case 4: goto L62;
            case 5: goto L60;
            case 6: goto L58;
            case 7: goto L56;
            case 8: goto L54;
            case 9: goto L53;
            case 10: goto L50;
            case 11: goto L48;
            case 12: goto L36;
            case 13: goto L32;
            case 14: goto L30;
            case 15: goto L28;
            case 16: goto L26;
            case 17: goto L24;
            case 18: goto L23;
            case 19: goto L20;
            case 20: goto L15;
            case 21: goto L13;
            case 22: goto L11;
            case 23: goto L9;
            default: goto L4;
        };
    L4:
        mi4 r11 = (mi4) r8;
        if (r11.v.B != null) goto L72;
        r11.s();
        return true;
    L72:
        return r11.t();
    L9:
        SongBottomSheetDialog r12 = (SongBottomSheetDialog) r8;
        Bundle r13 = new Bundle();
        r13.putParcelable("TRACK_OBJECT", r12.D0);
        ou3 r1 = new ou3();
        r1.c0(r13);
        r1.m0(r12.X().k(), null);
        r12.h0();
        return true;
    L11:
        xd4 r14 = (xd4) r8;
        Bundle r15 = new Bundle();
        s6 r2 = r14.v;
        r15.putParcelable("TRACK_OBJECT", (Parcelable) r2.r.get(r14.c()));
        ((cp1) r2.t).onMediaLongClick(r15);
        return true;
    L13:
        ((tc4) r8).s();
        return true;
    L15:
        ra4 r16 = (ra4) r8;
        se2 r17 = r16.C0;
        pz1 r3 = r17.c;
        Server r18 = r17.d;
        if (r18 == null) goto L18;
        new Thread(new oa4((na4) r3.o, r18, r0)).start();
    L18:
        Dialog r19 = r16.w0;
        Objects.requireNonNull(r19);
        r19.dismiss();
        return true;
    L20:
        la4 r20 = (la4) r8;
        Bundle r21 = new Bundle();
        zd0 r4 = r20.v;
        r21.putParcelable("server_object", (Parcelable) r4.r.get(r20.c()));
        ((LoginFragment) r4.s).onServerLongClick(r21);
        return true;
    L24:
        ((zm3) r8).s();
        return true;
    L26:
        vm3 r22 = (vm3) r8;
        Bundle r23 = new Bundle();
        ej r5 = r22.v;
        r23.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) r5.r.get(r22.c()));
        ((PodcastChannelCatalogueFragment) r5.t).onPodcastChannelLongClick(r23);
        return true;
    L28:
        ((yl3) r8).s();
        return true;
    L30:
        ((ImageButton) ((ae1) ((xi3) r8).o0.q).e).setVisibility(8);
        return true;
    L32:
        yz2 r24 = (yz2) r8;
        zd0 r25 = r24.v;
        if (((Child) r25.r.get(r24.c())).isDir() == true) goto L73;
        Bundle r6 = new Bundle();
        r6.putParcelable("TRACK_OBJECT", (Parcelable) r25.r.get(r24.c()));
        ((DirectoryFragment) r25.s).onMediaLongClick(r6);
        return true;
    L73:
        return false;
    L36:
        oe2 r26 = (oe2) r8;
        ArrayList r27 = r26.n0;
        if (r27 == null) goto L46;
        Server r28 = (Server) r27.get(r26.o0);
        String r7 = r28.getServerName();
        String r29 = r28.getUsername();
        String r30 = r28.getPassword();
        String r31 = r28.getAddress();
        String r32 = r28.getLocalAddress();
        if (r32 != null) goto L41;
        r32 = r28.getAddress();
    L41:
        String r33 = r28.getClientCert();
        if (r33 != null) goto L44;
        r33 = "";
    L44:
        App.b().getClass();
        SharedPreferences r34 = App.c();
        r34.getClass();
        SharedPreferences.Editor r35 = r34.edit();
        r35.putString("server", r7);
        r35.apply();
        App.b().getClass();
        SharedPreferences r36 = App.c();
        r36.getClass();
        SharedPreferences.Editor r37 = r36.edit();
        r37.putString("user", r29);
        r37.apply();
        App.b().getClass();
        SharedPreferences r38 = App.c();
        r38.getClass();
        SharedPreferences.Editor r39 = r38.edit();
        r39.putString("password", r30);
        r39.apply();
        App.b().getClass();
        SharedPreferences r40 = App.c();
        r40.getClass();
        SharedPreferences.Editor r41 = r40.edit();
        r41.putString("in_use_server_address", r31);
        r41.apply();
        App.b().getClass();
        SharedPreferences r42 = App.c();
        r42.getClass();
        SharedPreferences.Editor r43 = r42.edit();
        r43.putString("local_address", r32);
        r43.apply();
        App.b().getClass();
        SharedPreferences r44 = App.c();
        r44.getClass();
        SharedPreferences.Editor r45 = r44.edit();
        r45.putString("client_cert", r33);
        r45.apply();
        App.f(true);
        new mm3().h();
        r26.X().finish();
        r26.g0(new Intent(r26.n(), MainActivity.class));
        return true;
    L46:
        h12.Q("serverList");
        throw null;
    L48:
        ((z02) r8).s();
        return true;
    L50:
        hp1 r46 = (hp1) r8;
        r46.n0.c(r46.v());
        return true;
    L54:
        uq0 r47 = (uq0) r8;
        Bundle r48 = new Bundle();
        vq0 r49 = r47.v;
        r48.putParcelable("TRACK_OBJECT", (Parcelable) r49.r.get(r47.c()));
        r49.q.onMediaLongClick(r48);
        return true;
    L56:
        ((jj) r8).s();
        return true;
    L58:
        dj r50 = (dj) r8;
        Bundle r51 = new Bundle();
        ej r52 = r50.v;
        r51.putParcelable("ARTIST_OBJECT", (Parcelable) r52.r.get(r50.c()));
        ((ArtistCatalogueFragment) r52.t).onArtistLongClick(r51);
        return true;
    L60:
        cj r53 = (cj) r8;
        Bundle r54 = new Bundle();
        s6 r55 = r53.v;
        r54.putParcelable("ARTIST_OBJECT", (Parcelable) r55.r.get(r53.c()));
        ((ArtistPageFragment) r55.t).onArtistLongClick(r54);
        return true;
    L62:
        ui r56 = (ui) r8;
        Bundle r57 = new Bundle();
        vi r58 = r56.v;
        r57.putParcelable("ARTIST_OBJECT", ((ArtistID3) r58.u.get(r56.c())).strippedForNav());
        r58.q.onArtistLongClick(r57);
        return true;
    L64:
        ((a8) r8).s();
        return true;
    L66:
        p7 r59 = (p7) r8;
        Bundle r60 = new Bundle();
        q7 r61 = r59.v;
        r60.putParcelable("ALBUM_OBJECT", ((AlbumID3) r61.s.get(r59.c())).strippedForNav());
        ((AlbumCatalogueFragment) r61.u).onAlbumLongClick(r60);
        return true;
    L68:
        k7 r62 = (k7) r8;
        Bundle r63 = new Bundle();
        l7 r64 = r62.v;
        r63.putParcelable("ALBUM_OBJECT", ((AlbumID3) r64.r.get(r62.c())).strippedForNav());
        r64.q.onAlbumLongClick(r63);
        return true;
    L70:
        r6 r65 = (r6) r8;
        Bundle r66 = new Bundle();
        s6 r67 = r65.v;
        r66.putParcelable("ALBUM_OBJECT", ((AlbumID3) r67.r.get(r65.c())).strippedForNav());
        r67.t.onAlbumLongClick(r66);
        return true;
    L23:
        return ((dn3) r8).t();
    L53:
        return ((et0) r8).s();
    }
}
