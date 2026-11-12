package defpackage;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaylistPageFragment b;

    public /* synthetic */ zl3(PlaylistPageFragment r1, int r2) {
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
    public final void b(Object r9) {
        int r0 = this.a;
        int r1 = 8;
        boolean r2 = true;
        boolean r3 = true;
        final int r4 = 0;
        final PlaylistPageFragment r8 = this.b;
        switch(r0) {
            case 0: goto L99;
            case 1: goto L87;
            case 2: goto L77;
            case 3: goto L68;
            case 4: goto L17;
            default: goto L4;
        };
    L4:
        List r10 = (List) r9;
        r8.p0.r(r10);
        if (r10 == null) goto L15;
        TextView r5 = r8.l0.c;
        if (r10.isEmpty() == false) goto L9;
        r1 = 0;
    L9:
        r5.setVisibility(r1);
        r8.l0.m.setText(r8.t(R.string.playlist_song_count, new Object[]{Integer.valueOf(r10.size())}));
        r8.l0.h.setText(r8.t(R.string.playlist_duration, new Object[]{e03.h(Long.valueOf(r10.stream().mapToLong(new bm3()).sum()), false)}));
        if (r8.s0 == false) goto L15;
        List r6 = (List) r10.stream().map(new m7(17)).collect(Collectors.toList());
        if (r6.equals(r8.u0) == true) goto L15;
        r8.u0 = r6;
        r8.h0(r10);
    L15:
        r8.i0();
        return;
    L17:
        List r11 = (List) r9;
        if (r8.l0 == null) goto L109;
        if (r11 != null) goto L21;
        return;
    L21:
        if (r11.isEmpty() == true) goto L111;
        ArrayList r7 = new ArrayList(r11);
        Collections.shuffle(r7);
        Context r12 = r8.Z();
        String r13 = null;
        if (r7.isEmpty() == true) goto L25;
        String r14 = ((Child) r7.get(0)).getCoverArtId();
    L26:
        c04 r15 = a.c(r12);
        if (r14 == null) goto L29;
        String r16 = wg0.b(ud3.t(), r14);
    L30:
        vz3 r17 = b11.g(r12, r14, 9, r15, r16).T(xv0.b());
        if (ud3.R() == false) goto L33;
        r17 = (vz3) r17.l();
    L33:
        float r18 = wg0.a;
        ((vz3) r17.A(new qj1(r18, 0.0f, 0.0f, 0.0f))).K(r8.l0.f);
        Context r19 = r8.Z();
        if (r7.size() <= 1) goto L36;
        String r20 = ((Child) r7.get(1)).getCoverArtId();
    L37:
        c04 r21 = a.c(r19);
        if (r20 == null) goto L40;
        String r22 = wg0.b(ud3.t(), r20);
    L41:
        vz3 r23 = b11.g(r19, r20, 9, r21, r22).T(xv0.b());
        if (ud3.R() == false) goto L44;
        r23 = (vz3) r23.l();
    L44:
        ((vz3) r23.A(new qj1(0.0f, r18, 0.0f, 0.0f))).K(r8.l0.g);
        Context r24 = r8.Z();
        if (r7.size() <= 2) goto L47;
        String r25 = ((Child) r7.get(2)).getCoverArtId();
    L48:
        c04 r26 = a.c(r24);
        if (r25 == null) goto L51;
        String r27 = wg0.b(ud3.t(), r25);
    L52:
        vz3 r28 = b11.g(r24, r25, 9, r26, r27).T(xv0.b());
        if (ud3.R() == false) goto L55;
        r28 = (vz3) r28.l();
    L55:
        ((vz3) r28.A(new qj1(0.0f, 0.0f, 0.0f, r18))).K(r8.l0.d);
        Context r29 = r8.Z();
        if (r7.size() <= 3) goto L58;
        String r30 = ((Child) r7.get(3)).getCoverArtId();
    L59:
        c04 r31 = a.c(r29);
        if (r30 == null) goto L62;
        r13 = wg0.b(ud3.t(), r30);
    L62:
        vz3 r32 = b11.g(r29, r30, 9, r31, r13).T(xv0.b());
        if (ud3.R() == false) goto L65;
        r32 = (vz3) r32.l();
    L65:
        ((vz3) r32.A(new qj1(0.0f, 0.0f, r18, 0.0f))).K(r8.l0.e);
        return;
    L58:
        r30 = null;
        goto L59
    L51:
        r27 = null;
        goto L52
    L47:
        r25 = null;
        goto L48
    L40:
        r22 = null;
        goto L41
    L36:
        r20 = null;
        goto L37
    L29:
        r16 = null;
        goto L30
    L25:
        r14 = null;
        goto L26
    L111:
        return;
    L109:
        return;
    L77:
        Boolean r33 = (Boolean) r9;
        if (r8.p0 == null) goto L115;
        String r34 = (String) r8.o0.b.d();
        ni4 r35 = r8.p0;
        if (r33 != null) goto L82;
    L84:
        r3 = false;
    L85:
        r35.s(r34, r3);
        return;
    L82:
        if (r33.booleanValue() == false) goto L84;
    L115:
        return;
    L87:
        final List r36 = (List) r9;
        if (r36 == null) goto L116;
        Playlist r37 = r8.n0.e;
        if (r37 == null) goto L97;
        String r38 = v13.a(r37.getId());
        String r39 = r8.n0.e.getName();
        WeakReference r40 = com.eddyizm.tempus.homemusic.a.a;
        if (r39 == null) goto L97;
        if (qm4.u0(r39) == true) goto L97;
        com.eddyizm.tempus.homemusic.a.e.put(r38, r39);
    L97:
        r8.l0.k.setEnabled(!r36.isEmpty());
        r8.l0.l.setEnabled(!r36.isEmpty());
        r8.l0.o.setVisibility(8);
        r8.l0.k.setOnClickListener(new am3(r8, r36, r4));
        Button r41 = r8.l0.l;
        final int r42 = r2 ? 1 : 0;
        r41.setOnClickListener(new am3(r8, r36, r42));
        return;
    L116:
        return;
    L99:
        String r43 = (String) r9;
        if (r8.p0 == null) goto L117;
        Boolean r44 = (Boolean) r8.o0.c.d();
        ni4 r45 = r8.p0;
        if (r44 != null) goto L104;
    L106:
        r2 = false;
    L107:
        r45.s(r43, r2);
        return;
    L104:
        if (r44.booleanValue() == false) goto L106;
    L117:
        return;
    L68:
        if (((Boolean) r9).booleanValue() == true) goto L70;
        return;
    L70:
        if (r8.n() == null) goto L113;
        f9 r46 = r8.q0;
        if (r46 != null) goto L74;
    L75:
        e9 r47 = new e9(r8.n());
        a9 r48 = r47.a;
        r48.d = r48.a.getText(R.string.playlist_error_not_found_title);
        r48.f = r48.a.getText(R.string.playlist_error_not_found_message);
        r8.q0 = r47.setPositiveButton(android.R.string.ok, new vr(4, r8)).a().h();
        return;
    L74:
        if (r46.isShowing() == false) goto L75;
        return;
    }
}
