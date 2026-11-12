package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sl3 extends pp0 {
    public final /* synthetic */ int B0;
    public String C0;
    public Object D0;
    public hd E0;
    public final Object F0;

    public /* synthetic */ sl3(int r1, Object r2) {
        this.B0 = r1;
        this.F0 = r2;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        switch(this.B0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.J();
        this.D0 = null;
        return;
    L6:
        super.J();
        this.D0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        switch(this.B0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        super.R();
        f9 r0 = (f9) this.w0;
        if (r0 == null) goto L26;
        r0.i(-1).setOnClickListener(new bj3(12, this));
        return;
    L26:
        return;
    L8:
        super.R();
        if (Y().getParcelableArrayList("TRACKS_OBJECT") == null) goto L12;
        ((wl3) this.E0).e = Y().getParcelableArrayList("TRACKS_OBJECT");
        ((wl3) this.E0).c(null);
    L16:
        Dialog r1 = this.w0;
        Objects.requireNonNull(r1);
        f9 r2 = (f9) r1;
        final int r3 = 0;
        r2.i(-1).setOnClickListener(new pl3(this, r3));
        Button r4 = r2.i(-3);
        if (((wl3) this.E0).f != null) goto L19;
        r4.setVisibility(8);
    L20:
        final int r5 = 2;
        ((FrameLayout) ((c12) this.D0).q).setOnClickListener(new pl3(this, r5));
        FrameLayout r6 = (FrameLayout) ((c12) this.D0).q;
        if (ud3.V() == true) goto L24;
        r3 = 8;
    L24:
        r6.setVisibility(r3);
        return;
    L19:
        r4.setVisibility(0);
        final int r7 = 1;
        r4.setOnClickListener(new pl3(this, r7));
        goto L20
    L12:
        if (Y().getParcelable("PLAYLIST_OBJECT") == null) goto L16;
        wl3 r8 = (wl3) this.E0;
        r8.e = null;
        r8.c((Playlist) Y().getParcelable("PLAYLIST_OBJECT"));
        Playlist r9 = ((wl3) this.E0).f;
        if (r9 == null) goto L16;
        ((TextInputEditText) ((c12) this.D0).p).setText(r9.getName());
        goto L16
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r11) {
        switch(this.B0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        View r12 = o().inflate(R.layout.dialog_podcast_channel_editor, null, false);
        TextInputEditText r8 = (TextInputEditText) uo.s(r12, R.id.podcast_channel_rss_url_name_text_view);
        if (r8 == null) goto L10;
        this.D0 = new hd5(6, (LinearLayout) r12, r8);
        nc1 r13 = X();
        e75 r0 = r13.d();
        b75 r4 = gh0.r(r13);
        bq4 r7 = new bq4(r0, r4, b11.e(r13, r4));
        i30 r14 = kx3.a(xm3.class);
        String r1 = r14.b();
        if (r1 == null) goto L9;
        this.E0 = (xm3) r7.l(r14, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r1));
        vg2 r10 = new vg2(l(), 0).q((LinearLayout) ((hd5) this.D0).o);
        r10.p(R.string.podcast_channel_editor_dialog_title);
        return r10.l(R.string.radio_editor_dialog_positive_button, new wr(3)).j(R.string.radio_editor_dialog_negative_button, new wr(8)).create();
    L9:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L10:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(R.id.podcast_channel_rss_url_name_text_view)));
        return null;
    L12:
        View r15 = o().inflate(R.layout.dialog_playlist_editor, null, false);
        int r9 = R.id.playlist_name_text_view;
        TextInputEditText r16 = (TextInputEditText) uo.s(r15, R.id.playlist_name_text_view);
        if (r16 == null) goto L20;
        r9 = R.id.playlist_share_button;
        FrameLayout r17 = (FrameLayout) uo.s(r15, R.id.playlist_share_button);
        if (r17 == null) goto L20;
        this.D0 = new c12((LinearLayout) r15, r16, r17, 4);
        nc1 r18 = X();
        e75 r2 = r18.d();
        b75 r19 = gh0.r(r18);
        bq4 r20 = new bq4(r2, r19, b11.e(r18, r19));
        i30 r110 = kx3.a(wl3.class);
        String r3 = r110.b();
        if (r3 == null) goto L19;
        this.E0 = (wl3) r20.l(r110, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r3));
        vg2 r111 = new vg2(l(), 0).q((LinearLayout) ((c12) this.D0).o);
        r111.p(R.string.playlist_details_dialog_title);
        vg2 r112 = r111.l(R.string.playlist_editor_dialog_positive_button, new wr(3));
        r112.k(R.string.playlist_editor_dialog_neutral_button, new wr(6));
        return r112.j(R.string.playlist_editor_dialog_negative_button, new wr(7)).create();
    L19:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L20:
        nz2.n("Missing required view with ID: ".concat(r15.getResources().getResourceName(r9)));
        return null;
    }
}
