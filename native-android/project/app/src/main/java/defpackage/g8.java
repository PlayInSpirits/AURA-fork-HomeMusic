package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.AlbumInfo;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ItemDate;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlbumPageFragment b;

    public /* synthetic */ g8(AlbumPageFragment r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

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
    @Override // defpackage.a83
    public final void b(Object r8) {
        int r0 = this.a;
        String r2 = null;
        boolean r3 = true;
        boolean r4 = true;
        final AlbumPageFragment r5 = this.b;
        final int r6 = 0;
        switch(r0) {
            case 0: goto L129;
            case 1: goto L112;
            case 2: goto L99;
            case 3: goto L97;
            case 4: goto L87;
            case 5: goto L82;
            case 6: goto L77;
            case 7: goto L15;
            default: goto L4;
        };
    L4:
        AlbumID3 r9 = (AlbumID3) r8;
        if (r5.l0 == null) goto L139;
        if (r9 == null) goto L140;
        Context r7 = r5.Z();
        String r10 = r9.getCoverArtId();
        c04 r1 = a.c(r7);
        if (r10 == null) goto L10;
        r2 = wg0.b(ud3.t(), r10);
    L10:
        vz3 r11 = b11.g(r7, r10, 2, r1, r2).T(xv0.b());
        if (ud3.R() == false) goto L13;
        r11 = (vz3) r11.l();
    L13:
        r11.K((ImageView) r5.l0.j);
        return;
    L140:
        return;
    L139:
        return;
    L15:
        AlbumID3 r12 = (AlbumID3) r8;
        pc1 r13 = r5.l0;
        if (r13 == null) goto L141;
        if (r12 == null) goto L142;
        ((MaterialToolbar) r13.n).setTitle(r12.getName());
        r5.l0.e.setText(r12.getName());
        r5.l0.c.setText(r12.getArtist());
        l93.g(r5.l0.c);
        if (r12.getArtistId() != null) goto L21;
    L24:
        ik r14 = null;
    L25:
        r5.l0.c.setOnLongClickListener(new i8(0, r5, r14));
        TextView r15 = r5.l0.g;
        if (r12.getYear() == 0) goto L28;
        String r16 = String.valueOf(r12.getYear());
    L29:
        r15.setText(r16);
        int r17 = r12.getYear();
        pc1 r18 = r5.l0;
        if (r17 == 0) goto L32;
        r18.g.setVisibility(0);
        l93.g(r5.l0.g);
        r5.l0.g.setOnClickListener(new j8(0, r5, r12));
        r5.l0.g.setOnLongClickListener(new i8(1, r5, r12));
    L33:
        TextView r19 = (TextView) r5.l0.i;
        Integer r20 = r12.getSongCount();
        if (r12.getDuration() == null) goto L36;
        int r21 = r12.getDuration().intValue() / 60;
    L37:
        r19.setText(r5.t(R.string.album_page_tracks_count_and_duration, new Object[]{r20, Integer.valueOf(r21)}));
        if (r12.getGenre() != null) goto L40;
    L42:
        r5.l0.d.setVisibility(8);
    L44:
        if (r12.getReleaseDate() != null) goto L46;
        return;
    L46:
        if (r12.getOriginalReleaseDate() != null) goto L48;
        return;
    L48:
        if (r12.getReleaseDate().getFormattedDate() == null) goto L50;
    L53:
        r5.l0.h.setVisibility(0);
    L55:
        if (r12.getReleaseDate().getFormattedDate() != null) goto L57;
    L58:
        TextView r22 = r5.l0.h;
        if (r12.getReleaseDate() == null) goto L62;
        ItemDate r23 = r12.getReleaseDate();
    L63:
        r22.setText(r5.t(R.string.album_page_release_date_label, new Object[]{r23.getFormattedDate()}));
    L65:
        if (r12.getReleaseDate().getFormattedDate() != null) goto L67;
        return;
    L67:
        if (r12.getOriginalReleaseDate().getFormattedDate() != null) goto L69;
        return;
    L69:
        if (Objects.equals(r12.getReleaseDate().getYear(), r12.getOriginalReleaseDate().getYear()) == true) goto L71;
    L75:
        r5.l0.h.setText(r5.t(R.string.album_page_release_dates_label, new Object[]{r12.getReleaseDate().getFormattedDate(), r12.getOriginalReleaseDate().getFormattedDate()}));
        return;
    L71:
        if (Objects.equals(r12.getReleaseDate().getMonth(), r12.getOriginalReleaseDate().getMonth()) == false) goto L75;
        if (Objects.equals(r12.getReleaseDate().getDay(), r12.getOriginalReleaseDate().getDay()) == false) goto L75;
        r5.l0.h.setText(r5.t(R.string.album_page_release_date_label, new Object[]{r12.getReleaseDate().getFormattedDate()}));
        return;
    L62:
        r23 = r12.getOriginalReleaseDate();
        goto L63
    L57:
        if (r12.getOriginalReleaseDate().getFormattedDate() != null) goto L65;
    L50:
        if (r12.getOriginalReleaseDate().getFormattedDate() != null) goto L53;
        r5.l0.h.setVisibility(8);
        goto L55
    L40:
        if (r12.getGenre().isEmpty() == true) goto L42;
        r5.l0.d.setText(r12.getGenre());
        r5.l0.d.setVisibility(0);
        goto L44
    L36:
        r21 = 0;
        goto L37
    L32:
        r18.g.setVisibility(8);
        r5.l0.g.setOnClickListener(null);
        r5.l0.g.setOnLongClickListener(null);
        l93.p(r5.l0.g);
        goto L33
    L28:
        r16 = "";
        goto L29
    L21:
        if (r12.getArtistId().isEmpty() == true) goto L24;
        r14 = l93.h("artist", r12.getArtistId());
        goto L25
    L142:
        return;
    L141:
        return;
    L77:
        AlbumID3 r24 = (AlbumID3) r8;
        AlbumPageFragment r25 = this.b;
        if (r25.l0 == null) goto L148;
        if (r24 == null) goto L149;
        ni4 r26 = new ni4(r25.v(), r25, false, false, r24);
        r25.p0 = r26;
        ((RecyclerView) r25.l0.q).setAdapter(r26);
        r25.p0.A = r25.q0;
        r25.h0();
        r25.n0.i.e(r25.v(), new g8(r25, 3));
        return;
    L149:
        return;
    L148:
        return;
    L82:
        ArtistID3 r27 = (ArtistID3) r8;
        r5.i0();
        if (r27 != null) goto L85;
        Toast.makeText(r5.Z(), R.string.album_error_retrieving_artist, 0).show();
        return;
    L85:
        Bundle r28 = new Bundle();
        r28.putParcelable("ARTIST_OBJECT", r27.strippedForNav());
        r5.m0.T.m(R.id.action_albumPageFragment_to_artistPageFragment, r28, null);
        return;
    L87:
        Boolean r29 = (Boolean) r8;
        if (r5.p0 == null) goto L151;
        String r30 = (String) r5.o0.b.d();
        ni4 r31 = r5.p0;
        if (r29 != null) goto L92;
    L94:
        r4 = false;
    L95:
        r31.s(r30, r4);
        return;
    L92:
        if (r29.booleanValue() == false) goto L94;
    L151:
        return;
    L97:
        r5.p0.r((List) r8);
        r5.h0();
        return;
    L99:
        final List r32 = (List) r8;
        if (r5.l0 == null) goto L106;
        if (r32 == null) goto L106;
        if (r32.isEmpty() == true) goto L106;
        ((Button) r5.l0.l).setOnClickListener(new h8(r5, r32, r6));
        Button r33 = r5.l0.m;
        final int r34 = r3 ? 1 : 0;
        r33.setOnClickListener(new h8(r5, r32, r34));
    L106:
        if (r5.l0 == null) goto L152;
        if (r32 != null) goto L109;
    L110:
        ((Button) r5.l0.l).setEnabled(false);
        r5.l0.m.setEnabled(false);
        return;
    L109:
        if (r32.isEmpty() == true) goto L110;
        return;
    L152:
        return;
    L112:
        AlbumInfo r35 = (AlbumInfo) r8;
        pc1 r36 = r5.l0;
        if (r35 == null) goto L126;
        if (r36 == null) goto L116;
        ((TextView) r36.f).setVisibility(0);
    L116:
        pc1 r37 = r5.l0;
        if (r37 == null) goto L120;
        ((TextView) r37.f).setText(e03.c(r35.getNotes()));
    L120:
        if (r5.l0 != null) goto L122;
        return;
    L122:
        if (r35.getLastFmUrl() != null) goto L124;
        return;
    L124:
        if (r35.getLastFmUrl().isEmpty() == true) goto L156;
        ((TextView) r5.l0.f).setOnClickListener(new j8(1, r5, r35));
        return;
    L156:
        return;
    L126:
        if (r36 == null) goto L158;
        ((TextView) r36.f).setVisibility(8);
        return;
    L158:
        return;
    L129:
        String r38 = (String) r8;
        if (r5.p0 == null) goto L159;
        Boolean r39 = (Boolean) r5.o0.c.d();
        ni4 r40 = r5.p0;
        if (r39 != null) goto L134;
    L136:
        r3 = false;
    L137:
        r40.s(r38, r3);
        return;
    L134:
        if (r39.booleanValue() == false) goto L136;
    }
}
