package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatImageButton;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi3 b;

    public /* synthetic */ si3(xi3 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r18) {
        int r1 = this.a;
        xi3 r0 = this.b;
        switch(r1) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        Long r2 = (Long) r18;
        Child r3 = (Child) r0.p0.n.d();
        ns3 r4 = r0.o0;
        if (r4 == null) goto L107;
        TextView r5 = ((ae1) r4.q).a;
        if (r3 == null) goto L9;
        String r6 = r3.getId();
    L10:
        fu.p(r5, r6);
        return;
    L9:
        r6 = null;
        goto L10
    L107:
        return;
    L12:
        v52 r7 = (v52) r18;
        ns3 r8 = r0.o0;
        if (r8 == null) goto L114;
        AppCompatImageButton r9 = (AppCompatImageButton) ((ae1) r8.q).k;
        boolean r10 = r7.a;
        String r11 = r7.g;
        String r12 = r7.d;
        String r13 = r7.c;
        boolean r14 = r7.b;
        r9.setSelected(r10);
        AppCompatImageButton r15 = (AppCompatImageButton) ((ae1) r0.o0.q).k;
        if (r10 == false) goto L18;
        String r16 = r0.t(R.string.lan_controlling, new Object[]{r13});
    L19:
        r15.setContentDescription(r16);
        AppCompatImageButton r17 = (AppCompatImageButton) ((ae1) r0.o0.q).k;
        e35.S(r17, r17.getContentDescription());
        boolean r19 = r0.l0;
        r0.l0 = r10;
        boolean r20 = true;
        if (r10 == false) goto L95;
        if (r19 == true) goto L23;
        ((au) ((MainActivity) r0.X()).V.n).d(true);
    L23:
        Child r21 = u52.d();
        String r22 = r21.getId() + ":" + r21.getAlbumId() + ":" + r21.getArtistId();
        if (Objects.equals(r0.n0, r22) == true) goto L56;
        r0.n0 = r22;
        if (r21.getId().isEmpty() == false) goto L28;
        String r23 = null;
    L29:
        r0.p0.i(r0.v(), r23, r21.getId());
        aj3 r110 = r0.p0;
        le1 r111 = r0.v();
        if (TextUtils.isEmpty(r21.getAlbumId()) == false) goto L32;
        String r112 = null;
    L33:
        String r113 = r21.getAlbumId();
        k03 r114 = r110.o;
        if (r112 != null) goto L36;
    L42:
        aj3 r115 = r0.p0;
        le1 r116 = r0.v();
        if (TextUtils.isEmpty(r21.getArtistId()) == false) goto L45;
        r23 = null;
    L45:
        String r24 = r21.getArtistId();
        k03 r117 = r115.p;
        if (r23 != null) goto L48;
    L53:
        Object r118 = null;
    L55:
        r0.p0.m.i(r118);
        goto L56
    L48:
        if (r23.equals("podcast") == false) goto L50;
        r118 = null;
        r117.i(null);
        goto L55
    L50:
        if (r23.equals("music") == false) goto L53;
        r115.e.getClass();
        k03 r25 = pa.v(r24);
        Objects.requireNonNull(r117);
        r25.e(r116, new g7(r117, 2));
        goto L53
    L36:
        if (r112.equals("podcast") == false) goto L38;
        r114.i(null);
        goto L42
    L38:
        if (r112.equals("music") == false) goto L42;
        r110.d.getClass();
        k03 r119 = rv2.j(r113);
        Objects.requireNonNull(r114);
        r119.e(r111, new g7(r114, 1));
        goto L42
    L32:
        r112 = r23;
        goto L33
    L28:
        r23 = "music";
    L56:
        TextView r26 = (TextView) ((ae1) r0.o0.q).i;
        if (r12.isEmpty() == false) goto L59;
        r12 = r0.s(R.string.lan_no_track);
    L59:
        r26.setText(r12);
        ((TextView) ((ae1) r0.o0.q).i).setVisibility(0);
        TextView r27 = ((ae1) r0.o0.q).a;
        int r28 = r7.r;
        if (r28 != 0) goto L65;
        if (r14 == false) goto L64;
        r28 = R.string.lan_remote_active;
        goto L65
    L64:
        r28 = R.string.lan_connecting;
    L65:
        r27.setText(r0.t(R.string.lan_device_status, new Object[]{r13, r0.s(r28)}));
        ((ae1) r0.o0.q).a.setVisibility(0);
        ((ToggleButton) ((ae1) r0.o0.q).f).setChecked(r7.k);
        ToggleButton r29 = (ToggleButton) ((ae1) r0.o0.q).f;
        if (r14 == true) goto L68;
    L70:
        boolean r30 = false;
    L71:
        r29.setEnabled(r30);
        ((ImageButton) ((ae1) r0.o0.q).j).setVisibility(0);
        ImageButton r31 = (ImageButton) ((ae1) r0.o0.q).j;
        if (r14 == true) goto L74;
    L76:
        r20 = false;
    L77:
        r31.setEnabled(r20);
        ImageButton r32 = (ImageButton) ((ae1) r0.o0.q).j;
        if (r14 == false) goto L80;
        float r33 = 1.0f;
    L81:
        r32.setAlpha(r33);
        ((ImageButton) ((ae1) r0.o0.q).l).setVisibility(8);
        ((ImageButton) ((ae1) r0.o0.q).g).setVisibility(8);
        ((ImageButton) ((ae1) r0.o0.q).e).setVisibility(8);
        ((SeekBar) ((ae1) r0.o0.q).m).setMax((int) (r7.i / 1000));
        ((SeekBar) ((ae1) r0.o0.q).m).setProgress((int) (r7.h / 1000));
        if (Objects.equals(r0.m0, r11) == true) goto L108;
        r0.m0 = r11;
        Context r34 = r0.Z();
        if (r0.m0.isEmpty() == false) goto L86;
        String r120 = null;
    L87:
        c04 r35 = a.c(r34);
        if (r120 == null) goto L90;
        String r36 = wg0.b(ud3.t(), r120);
    L91:
        vz3 r37 = b11.g(r34, r120, 9, r35, r36).T(xv0.b());
        if (ud3.R() == false) goto L94;
        r37 = (vz3) r37.l();
    L94:
        r37.K((ImageView) ((ae1) r0.o0.q).h);
        return;
    L90:
        r36 = null;
        goto L91
    L86:
        r120 = r0.m0;
        goto L87
    L108:
        return;
    L80:
        r33 = 0.3f;
        goto L81
    L74:
        if (r7.v == false) goto L76;
    L68:
        if (r7.p <= 0) goto L70;
        r30 = true;
        goto L71
    L95:
        if (r19 == false) goto L110;
        r0.m0 = null;
        r0.n0 = null;
        ((ToggleButton) ((ae1) r0.o0.q).f).setEnabled(true);
        bl2 r38 = r0.q0;
        if (r38 != null) goto L99;
        return;
    L99:
        if (r38.isDone() == false) goto L112;
        bj2 r39 = (bj2) r0.q0.get();     // Catch: Exception -> L104
        r0.k0(r39);     // Catch: Exception -> L104
        r0.l0(r39.K0());     // Catch: Exception -> L104
        r0.m0(r39.h0());     // Catch: Exception -> L104
        r0.h0(r39.x());     // Catch: Exception -> L104
        r0.i0(r39.f0());     // Catch: Exception -> L104
        r0.n0(r39);     // Catch: Exception -> L104
        if (r39.Q0() != 0) goto L113;
        ((au) ((MainActivity) r0.X()).V.n).d(false);     // Catch: Exception -> L104
        return;
    L113:
        return;
    L115:
        return;
    L112:
        return;
    L110:
        return;
    L18:
        r16 = r0.s(R.string.lan_play_on);
        goto L19
    }
}
