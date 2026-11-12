package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistInfo2;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArtistPageFragment b;

    public /* synthetic */ oj(ArtistPageFragment r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r11) {
        int r0 = this.a;
        int r1 = 5;
        boolean r2 = true;
        int r3 = 3;
        int r4 = 8;
        ArtistPageFragment r10 = this.b;
        switch(r0) {
            case 0: goto L109;
            case 1: goto L64;
            case 2: goto L56;
            case 3: goto L46;
            case 4: goto L35;
            case 5: goto L20;
            default: goto L4;
        };
    L4:
        ArtistInfo2 r12 = (ArtistInfo2) r11;
        sc1 r5 = r10.l0;
        if (r12 != null) goto L8;
        if (r5 == null) goto L119;
        r5.u.setVisibility(8);
        return;
    L119:
        return;
    L8:
        if (r5 != null) goto L10;
    L15:
        ArrayList r6 = new ArrayList();
        if (r12.getSimilarArtists() == null) goto L18;
        r6.addAll(r12.getSimilarArtists());
    L18:
        s6 r13 = r10.s0;
        r13.r = r6;
        r13.d();
        return;
    L10:
        if (r12.getSimilarArtists() == null) goto L15;
        LinearLayout r7 = r10.l0.u;
        if (r12.getSimilarArtists().isEmpty() == true) goto L14;
        r4 = 0;
    L14:
        r7.setVisibility(r4);
        goto L15
    L20:
        List r14 = (List) r11;
        sc1 r8 = r10.l0;
        if (r8 == null) goto L121;
        LinearLayout r9 = r8.g;
        if (r14 != null) goto L25;
    L27:
        int r15 = 8;
    L28:
        r9.setVisibility(r15);
        if (r14 == null) goto L122;
        TextView r16 = r10.l0.e;
        if (r14.size() <= 5) goto L33;
        r4 = 0;
    L33:
        r16.setVisibility(r4);
        l7 r17 = r10.r0;
        r17.r = r14;
        r17.d();
        r10.l0.e.setOnClickListener(new j8(r3, r10, r14));
        return;
    L122:
        return;
    L25:
        if (r14.isEmpty() == true) goto L27;
        r15 = 0;
        goto L28
    L121:
        return;
    L35:
        Map r18 = (Map) r11;
        sc1 r19 = r10.l0;
        if (r19 == null) goto L123;
        RecyclerView r20 = r19.b;
        if (r18 != null) goto L40;
    L42:
        r20.setVisibility(r4);
        if (r18 == null) goto L124;
        v8 r110 = r10.q0;
        r110.s = r18;
        r110.d();
        return;
    L124:
        return;
    L40:
        if (r18.isEmpty() == true) goto L42;
        r4 = 0;
        goto L42
    L123:
        return;
    L46:
        Boolean r111 = (Boolean) r11;
        if (r10.p0 == null) goto L125;
        String r21 = (String) r10.o0.b.d();
        ni4 r112 = r10.p0;
        if (r111 != null) goto L51;
    L53:
        r2 = false;
    L54:
        r112.s(r21, r2);
        return;
    L51:
        if (r111.booleanValue() == false) goto L53;
    L125:
        return;
    L56:
        List r113 = (List) r11;
        Handler r22 = r10.w0;
        a0 r23 = r10.x0;
        r22.removeCallbacks(r23);
        boolean r24 = r113.isEmpty();
        sc1 r25 = r10.l0;
        if (r24 == false) goto L59;
        r25.k.setVisibility(0);
        r10.l0.p.setVisibility(8);
        r10.l0.s.setVisibility(8);
        r10.l0.r.setVisibility(0);
        r10.l0.q.setVisibility(8);
        r22.postDelayed(r23, 3000);
        return;
    L59:
        r25.t.setVisibility(0);
        r10.l0.k.setVisibility(0);
        r10.l0.p.setVisibility(0);
        r10.l0.s.setVisibility(0);
        r10.l0.r.setVisibility(8);
        r10.l0.q.setVisibility(8);
        TextView r26 = r10.l0.t;
        if (r113.size() <= 3) goto L62;
        r4 = 0;
    L62:
        r26.setVisibility(r4);
        r10.p0.r((List) r113.stream().limit(3).collect(Collectors.toList()));
        r10.i0();
        return;
    L64:
        ArtistInfo2 r114 = (ArtistInfo2) r11;
        if (r114 != null) goto L70;
        sc1 r115 = r10.l0;
        if (r115 == null) goto L127;
        r115.h.setVisibility(8);
        return;
    L127:
        return;
    L70:
        if (r10.n() == null) goto L92;
        if (r10.l0 == null) goto L92;
        ArtistID3 r27 = r10.n0.e;
        if (r27.getCoverArtId() != null) goto L76;
    L78:
        String r28 = r27.getId();
    L79:
        Objects.requireNonNull(r28);
        if (r28.equals(r27.getCoverArtId()) == true) goto L82;
    L86:
        String r29 = null;
    L87:
        Context r30 = r10.Z();
        vz3 r31 = b11.g(r30, r28, 3, a.c(r30), wg0.b(ud3.t(), r28)).T(xv0.b());
        if (ud3.R() == false) goto L90;
        r31 = (vz3) r31.l();
    L90:
        r31.L(new rj(r10, r29)).K(r10.l0.f);
        goto L92
    L82:
        if (r27.getId() == null) goto L86;
        if (r27.getId().equals(r28) == true) goto L86;
        r29 = r27.getId();
        goto L87
    L76:
        if (r27.getCoverArtId().trim().isEmpty() == true) goto L78;
        r28 = r27.getCoverArtId();
    L92:
        if (r10.l0 == null) goto L129;
        String r32 = e03.c(r114.getBiography()).trim();
        String r33 = r114.getLastFmUrl();
        boolean r34 = r32.isEmpty();
        sc1 r35 = r10.l0;
        if (r34 == false) goto L96;
        r35.m.setVisibility(8);
    L97:
        sc1 r36 = r10.l0;
        if (r33 != null) goto L100;
        r36.l.setVisibility(8);
    L102:
        if (r32.isEmpty() == false) goto L104;
        if (r33 != null) goto L104;
        return;
    L104:
        ((Button) r10.l0.a.findViewById(R.id.button_toggle_bio)).setOnClickListener(new pj(r10, r1));
        App.b().getClass();
        boolean r116 = App.c().getBoolean("artist_display_biography", true);
        LinearLayout r117 = r10.l0.h;
        if (r116 == false) goto L107;
        r4 = 0;
    L107:
        r117.setVisibility(r4);
        return;
    L100:
        r36.l.setOnClickListener(new j8(4, r10, r114));
        r10.l0.l.setVisibility(0);
        goto L102
    L96:
        r35.m.setText(r32);
        goto L97
    L129:
        return;
    L109:
        String r118 = (String) r11;
        if (r10.p0 == null) goto L131;
        Boolean r37 = (Boolean) r10.o0.c.d();
        ni4 r119 = r10.p0;
        if (r37 != null) goto L114;
    L116:
        r2 = false;
    L117:
        r119.s(r118, r2);
        return;
    L114:
        if (r37.booleanValue() == false) goto L116;
    }
}
