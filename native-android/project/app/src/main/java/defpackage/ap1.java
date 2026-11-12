package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp1 b;

    public /* synthetic */ ap1(cp1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r11) {
        int r0 = this.a;
        int r1 = 5;
        cp1 r5 = this.b;
        int r6 = 0;
        switch(r0) {
            case 0: goto L64;
            case 1: goto L58;
            case 2: goto L34;
            case 3: goto L28;
            default: goto L4;
        };
    L4:
        List r12 = (List) r11;
        if (r12 != null) goto L7;
    L24:
        r5.l0.D.setVisibility(8);
        if (r5.l() == null) goto L142;
        r5.l().runOnUiThread(new qa1(9, this));
        return;
    L142:
        return;
    L7:
        if (r12.isEmpty() == true) goto L24;
        if (ud3.o() != null) goto L16;
        eu0 r2 = au0.w(r5.Z());
        Iterator r13 = r12.iterator();
        int r3 = 0;
    L12:
        if (r13.hasNext() == false) goto L22;
        Child r4 = (Child) r13.next();
        String r7 = r4.getId();
        r2.getClass();
        if (eu0.d(r7) == true) goto L12;
        r2.b(gi1.G(r4), new Download(r4), false);
        r3 = r3 + 1;
    L22:
        if (r3 <= 0) goto L24;
        Toast.makeText(r5.Z(), r5.r().getQuantityString(R.plurals.songs_download_started, r3, new Object[]{Integer.valueOf(r3)}), 0).show();
        goto L24
    L16:
        Iterator r14 = r12.iterator();
        r3 = 0;
    L18:
        if (r14.hasNext() == false) goto L22;
        Child r8 = (Child) r14.next();
        if (g51.e(r8) != null) goto L18;
        i51.a(r5.Z(), r8);
        r3 = r3 + 1;
        goto L18
    L28:
        List r15 = (List) r11;
        if (r15 != null) goto L31;
        return;
    L31:
        if (r15.isEmpty() == true) goto L144;
        cl4 r10 = r5.n0.k;
        r10.c.y(-1, false).f(new np0(r1, r10));
        r10.d.e(r5.v(), new bp1(r5, r15, 1));
        return;
    L144:
        return;
    L34:
        List r16 = (List) r11;
        if (r16 != null) goto L37;
    L54:
        r5.l0.z.setVisibility(8);
        if (r5.l() == null) goto L145;
        r5.l().runOnUiThread(new qa1(7, this));
        return;
    L145:
        return;
    L37:
        if (r16.isEmpty() == true) goto L54;
        if (ud3.o() != null) goto L46;
        eu0 r9 = au0.w(r5.Z());
        Iterator r17 = r16.iterator();
        int r18 = 0;
    L42:
        if (r17.hasNext() == false) goto L52;
        Child r19 = (Child) r17.next();
        String r20 = r19.getId();
        r9.getClass();
        if (eu0.d(r20) == true) goto L42;
        r9.b(gi1.G(r19), new Download(r19), false);
        r18 = r18 + 1;
    L52:
        if (r18 <= 0) goto L54;
        Toast.makeText(r5.Z(), r5.r().getQuantityString(R.plurals.songs_download_started, r18, new Object[]{Integer.valueOf(r18)}), 0).show();
        goto L54
    L46:
        Iterator r110 = r16.iterator();
        r18 = 0;
    L48:
        if (r110.hasNext() == false) goto L52;
        Child r21 = (Child) r110.next();
        if (g51.e(r21) != null) goto L48;
        i51.a(r5.Z(), r21);
        r18 = r18 + 1;
        goto L48
    L58:
        List r111 = (List) r11;
        if (r111 != null) goto L61;
        return;
    L61:
        if (r111.isEmpty() == true) goto L147;
        bl4 r112 = r5.n0.j;
        r112.c.getClass();
        rv2.o(-1, false).f(new np0(4, r112));
        r112.d.e(r5.v(), new bp1(r5, r111, r6));
        return;
    L147:
        return;
    L64:
        List r113 = (List) r11;
        if (r113 != null) goto L67;
        return;
    L67:
        if (r113.isEmpty() == true) goto L149;
        ArrayList r22 = new ArrayList();
        if (ud3.o() != null) goto L78;
        eu0 r23 = au0.w(r5.Z());
        Iterator r114 = r113.iterator();
        int r24 = 0;
    L72:
        if (r114.hasNext() == false) goto L86;
        Child r25 = (Child) r114.next();
        String r26 = r25.getId();
        r23.getClass();
        if (eu0.d(r26) == true) goto L72;
        r24 = r24 + 1;
        if (r22.size() >= 3) goto L72;
        r22.add(r25.getTitle());
    L86:
        tc1 r115 = r5.l0;
        if (r24 <= 0) goto L105;
        r115.H.setVisibility(0);
        StringBuilder r116 = new StringBuilder();
        if (r22.isEmpty() == true) goto L98;
        StringBuilder r27 = new StringBuilder();
        Iterator r28 = r22.iterator();
        if (r28.hasNext() == false) goto L95;
    L92:
        r27.append((CharSequence) r28.next());
        if (r28.hasNext() == false) goto L95;
        r27.append(", ");
    L95:
        r116.append(r27.toString());
        if (r24 <= 3) goto L98;
        r116.append("...");
    L98:
        String r29 = r5.r().getQuantityString(R.plurals.home_sync_starred_songs_count, r24, new Object[]{Integer.valueOf(r24)});
        int r30 = r116.length();
        tc1 r31 = r5.l0;
        if (r30 <= 0) goto L101;
        r31.J.setText(r116.toString() + "\n" + r29);
    L103:
        if (r5.l() == null) goto L150;
        r5.l().runOnUiThread(new qa1(5, this));
        return;
    L150:
        return;
    L101:
        r31.J.setText(r29);
        goto L103
    L105:
        r115.H.setVisibility(8);
        return;
    L78:
        Iterator r117 = r113.iterator();
        r24 = 0;
    L80:
        if (r117.hasNext() == false) goto L86;
        Child r32 = (Child) r117.next();
        if (g51.e(r32) != null) goto L80;
        r24 = r24 + 1;
        if (r22.size() >= 3) goto L80;
        r22.add(r32.getTitle());
        goto L80
    }
}
