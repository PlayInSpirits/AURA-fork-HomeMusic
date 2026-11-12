package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ cp1 c;

    public /* synthetic */ bp1(cp1 r1, List r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // defpackage.a83
    public final void b(Object r20) {
        int r1 = this.a;
        cp1 r5 = this.c;
        int r6 = 0;
        List r8 = this.b;
        switch(r1) {
            case 0: goto L63;
            default: goto L4;
        };
    L4:
        List r2 = (List) r20;
        if (r2 == null) goto L178;
        ArrayList r11 = new ArrayList();
        if (ud3.o() != null) goto L23;
        eu0 r12 = au0.w(r5.Z());
        Iterator r9 = r8.iterator();
        int r13 = 0;
    L10:
        if (r9.hasNext() == false) goto L38;
        ArtistID3 r14 = (ArtistID3) r9.next();
        Iterator r15 = r2.iterator();
        boolean r16 = false;
    L13:
        if (r15.hasNext() == false) goto L21;
        Child r17 = (Child) r15.next();
        if (r17.getArtistId() == null) goto L13;
        if (r17.getArtistId().equals(r14.getId()) == false) goto L13;
        String r7 = r17.getId();
        r12.getClass();
        if (eu0.d(r7) == true) goto L13;
        r13 = r13 + 1;
        r16 = true;
        goto L13
    L21:
        if (r16 == false) goto L10;
        r11.add(r14.getName());
    L38:
        tc1 r3 = r5.l0;
        if (r13 <= 0) goto L61;
        r3.D.setVisibility(0);
        StringBuilder r4 = new StringBuilder();
        ArrayList r10 = new ArrayList();
    L42:
        if (r6 >= Math.min(r11.size(), 3)) goto L45;
        r10.add((String) r11.get(r6));
        r6 = r6 + 1;
        goto L42
    L45:
        if (r10.isEmpty() == true) goto L54;
        StringBuilder r18 = new StringBuilder();
        Iterator r19 = r10.iterator();
        if (r19.hasNext() == false) goto L51;
    L48:
        r18.append((CharSequence) r19.next());
        if (r19.hasNext() == false) goto L51;
        r18.append(", ");
    L51:
        r4.append(r18.toString());
        if (r11.size() <= 3) goto L54;
        r4.append("...");
    L54:
        String r21 = r5.r().getQuantityString(R.plurals.home_sync_starred_artists_count, r11.size(), new Object[]{Integer.valueOf(r11.size())});
        int r22 = r4.length();
        tc1 r23 = r5.l0;
        if (r22 <= 0) goto L57;
        r23.F.setText(r4.toString() + "\n" + r21);
    L59:
        if (r5.l() == null) goto L179;
        r5.l().runOnUiThread(new qa1(10, this));
        return;
    L179:
        return;
    L57:
        r23.F.setText(r21);
        goto L59
    L61:
        r3.D.setVisibility(8);
        return;
    L23:
        Iterator r24 = r8.iterator();
        r13 = 0;
    L25:
        if (r24.hasNext() == false) goto L38;
        ArtistID3 r25 = (ArtistID3) r24.next();
        Iterator r110 = r2.iterator();
        boolean r111 = false;
    L28:
        if (r110.hasNext() == false) goto L36;
        Child r112 = (Child) r110.next();
        if (r112.getArtistId() == null) goto L28;
        if (r112.getArtistId().equals(r25.getId()) == false) goto L28;
        if (g51.e(r112) != null) goto L28;
        r13 = r13 + 1;
        r111 = true;
        goto L28
    L36:
        if (r111 == false) goto L25;
        r11.add(r25.getName());
        goto L25
    L178:
        return;
    L63:
        List r26 = (List) r20;
        if (r26 == null) goto L181;
        ArrayList r27 = new ArrayList();
        if (ud3.o() != null) goto L84;
        eu0 r28 = au0.w(r5.Z());
        Iterator r29 = r8.iterator();
        int r113 = 0;
    L69:
        if (r29.hasNext() == false) goto L99;
        AlbumID3 r114 = (AlbumID3) r29.next();
        Iterator r115 = r26.iterator();
        int r116 = r6;
    L72:
        if (r115.hasNext() == false) goto L81;
        Child r117 = (Child) r115.next();
        if (r117.getAlbumId() == null) goto L72;
        if (r117.getAlbumId().equals(r114.getId()) == false) goto L72;
        String r30 = r117.getId();
        r28.getClass();
        if (eu0.d(r30) == true) goto L72;
        r113 = r113 + 1;
        r116 = 1;
        goto L72
    L81:
        if (r116 == 0) goto L83;
        r27.add(r114.getName());
    L83:
        r6 = 0;
    L99:
        tc1 r31 = r5.l0;
        if (r113 <= 0) goto L122;
        int r32 = 0;
        r31.z.setVisibility(0);
        StringBuilder r33 = new StringBuilder();
        ArrayList r34 = new ArrayList();
    L103:
        if (r32 >= Math.min(r27.size(), 3)) goto L106;
        r34.add((String) r27.get(r32));
        r32 = r32 + 1;
        goto L103
    L106:
        if (r34.isEmpty() == true) goto L115;
        StringBuilder r35 = new StringBuilder();
        Iterator r36 = r34.iterator();
        if (r36.hasNext() == false) goto L112;
    L109:
        r35.append((CharSequence) r36.next());
        if (r36.hasNext() == false) goto L112;
        r35.append(", ");
    L112:
        r33.append(r35.toString());
        if (r27.size() <= 3) goto L115;
        r33.append("...");
    L115:
        String r37 = r5.r().getQuantityString(R.plurals.home_sync_starred_albums_count, r27.size(), new Object[]{Integer.valueOf(r27.size())});
        int r38 = r33.length();
        tc1 r39 = r5.l0;
        if (r38 <= 0) goto L118;
        r39.B.setText(r33.toString() + "\n" + r37);
    L120:
        if (r5.l() == null) goto L182;
        r5.l().runOnUiThread(new qa1(8, this));
        return;
    L182:
        return;
    L118:
        r39.B.setText(r37);
        goto L120
    L122:
        r31.z.setVisibility(8);
        return;
    L84:
        Iterator r40 = r8.iterator();
        r113 = 0;
    L86:
        if (r40.hasNext() == false) goto L99;
        AlbumID3 r41 = (AlbumID3) r40.next();
        Iterator r42 = r26.iterator();
        boolean r118 = false;
    L89:
        if (r42.hasNext() == false) goto L97;
        Child r119 = (Child) r42.next();
        if (r119.getAlbumId() == null) goto L89;
        if (r119.getAlbumId().equals(r41.getId()) == false) goto L89;
        if (g51.e(r119) != null) goto L89;
        r113 = r113 + 1;
        r118 = true;
        goto L89
    L97:
        if (r118 == false) goto L86;
        r27.add(r41.getName());
        goto L86
    }
}
