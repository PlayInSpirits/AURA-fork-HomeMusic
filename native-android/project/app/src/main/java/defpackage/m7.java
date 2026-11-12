package defpackage;

import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m7 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ m7(int r1) {
        this.a = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r4) {
        long r1 = 0;
        switch(this.a) {
            case 0: goto L104;
            case 1: goto L100;
            case 2: goto L99;
            case 3: goto L93;
            case 4: goto L88;
            case 5: goto L83;
            case 6: goto L82;
            case 7: goto L80;
            case 8: goto L78;
            case 9: goto L76;
            case 10: goto L74;
            case 11: goto L72;
            case 12: goto L70;
            case 13: goto L68;
            case 14: goto L47;
            case 15: goto L46;
            case 16: goto L44;
            case 17: goto L42;
            case 18: goto L40;
            case 19: goto L38;
            case 20: goto L36;
            case 21: goto L34;
            case 22: goto L32;
            case 23: goto L30;
            case 24: goto L28;
            case 25: goto L26;
            case 26: goto L24;
            case 27: goto L22;
            case 28: goto L10;
            default: goto L5;
        };
    L10:
        d64 r5 = (d64) r4;
        boolean r3 = tv1.C(r5);
        boolean r6 = r5.c;
        if (r3 == false) goto L16;
        if (r6 == false) goto L14;
        double r7 = 90.0d;
    L108:
        return Double.valueOf(r7);
    L14:
        r7 = 25.0d;
        goto L108
    L16:
        if (r6 == false) goto L18;
        double r8 = 80.0d;
    L20:
        return Double.valueOf(r8);
    L18:
        r8 = 40.0d;
        goto L20
    L47:
        AlbumID3 r9 = (AlbumID3) r4;
        List<String> r10 = r9.getReleaseTypes();
        int r0 = 0;
        if (r10 == null) goto L57;
        if (r10.isEmpty() == true) goto L57;
        if (r10.get(0) == null) goto L57;
        String r11 = r10.get(0).trim().toLowerCase();
        if (r11.isEmpty() == true) goto L57;
        return r11;
    L57:
        if (r9.getSongCount() == null) goto L60;
        r0 = r9.getSongCount().intValue();
    L60:
        if (r0 < 8) goto L63;
        return "album";
    L63:
        if (r0 > 2) goto L65;
        return "single";
    L65:
        return "ep";
    L83:
        AlbumID3 r12 = (AlbumID3) r4;
        if (r12.getPlayCount() == null) goto L87;
        r1 = r12.getPlayCount().longValue();
    L87:
        return Long.valueOf(r1);
    L88:
        AlbumID3 r13 = (AlbumID3) r4;
        if (r13.getPlayed() == null) goto L92;
        return r13.getPlayed();
    L92:
        return new Date(0);
    L93:
        AlbumID3 r14 = (AlbumID3) r4;
        if (r14.getCreated() == null) goto L97;
        return r14.getCreated();
    L97:
        return new Date(0);
    L100:
        AlbumID3 r15 = (AlbumID3) r4;
        if (r15.getArtist() != null) goto L103;
        return "";
    L103:
        return r15.getArtist();
    L104:
        AlbumID3 r16 = (AlbumID3) r4;
        if (r16.getName() != null) goto L107;
        return "";
    L107:
        return r16.getName();
    L5:
        if (((d64) r4).c == false) goto L7;
        double r17 = 100.0d;
    L9:
        return Double.valueOf(r17);
    L7:
        r17 = 0.0d;
        goto L9
    L22:
        return ((d64) r4).g;
    L24:
        return ((d64) r4).h;
    L26:
        return (Chronology) r4;
    L28:
        return ((Genre) r4).getGenre();
    L30:
        return (Double) r4;
    L32:
        return (Download) r4;
    L34:
        return ((Child) r4).getGenre();
    L36:
        return ((Child) r4).getArtist();
    L38:
        return ((Child) r4).getArtistId();
    L40:
        return ((Child) r4).getAlbumId();
    L42:
        return ((Child) r4).getId();
    L44:
        return ((Download) ((Child) r4)).getPlaylistId();
    L46:
        return ((Child) r4).getYear();
    L68:
        return ((Download) r4).getArtist();
    L70:
        return new ArrayList((TreeSet) r4);
    L72:
        return ((ArtistID3) r4).getStarred();
    L74:
        return Integer.valueOf(((ArtistID3) r4).getAlbumCount());
    L76:
        return ((ArtistID3) r4).getName();
    L78:
        return ((AlbumID3) r4).getCreated();
    L80:
        return ((AlbumID3) r4).getStarred();
    L82:
        return ((AlbumID3) r4).getName();
    L99:
        return Integer.valueOf(((AlbumID3) r4).getYear());
    }
}
