package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.homemusic.HubFavoriteSubject;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ca1 implements Comparator {
    public static final ca1 o = null;
    public static final ca1 p = null;
    public static final ca1 q = null;
    public static final ca1 r = null;
    public static final ca1 s = null;
    public static final ca1 t = null;
    public static final ca1 u = null;
    public static final ca1 v = null;
    public static final /* synthetic */ ca1 w = null;
    public final /* synthetic */ int n;

    static {
        o = new ca1(0);
        p = new ca1(1);
        q = new ca1(2);
        r = new ca1(3);
        s = new ca1(4);
        t = new ca1(5);
        u = new ca1(6);
        v = new ca1(7);
        w = new ca1(8);
    }

    public /* synthetic */ ca1(int r1) {
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r8, Object r9) {
        String r1 = "";
        switch(this.n) {
            case 0: goto L165;
            case 1: goto L154;
            case 2: goto L153;
            case 3: goto L151;
            case 4: goto L149;
            case 5: goto L143;
            case 6: goto L132;
            case 7: goto L127;
            case 8: goto L126;
            case 9: goto L124;
            case 10: goto L122;
            case 11: goto L120;
            case 12: goto L104;
            case 13: goto L103;
            case 14: goto L101;
            case 15: goto L92;
            case 16: goto L87;
            case 17: goto L86;
            case 18: goto L61;
            case 19: goto L52;
            case 20: goto L51;
            case 21: goto L49;
            case 22: goto L47;
            case 23: goto L37;
            case 24: goto L28;
            case 25: goto L19;
            case 26: goto L10;
            case 27: goto L9;
            case 28: goto L6;
            default: goto L5;
        };
    L6:
        String r7 = (String) ((kd3) r8).o;
        Locale r10 = Locale.ROOT;
        String r11 = r7.toLowerCase(r10);
        r11.getClass();
        String r12 = ((String) ((kd3) r9).o).toLowerCase(r10);
        r12.getClass();
        return fu.l(r11, r12);
    L10:
        String r13 = ((AlbumID3) r8).getName();
        if (r13 == null) goto L13;
        Locale r14 = Locale.ROOT;
        r14.getClass();
        String r15 = r13.toLowerCase(r14);
        r15.getClass();
    L14:
        String r16 = ((AlbumID3) r9).getName();
        if (r16 == null) goto L18;
        Locale r17 = Locale.ROOT;
        r17.getClass();
        r1 = r16.toLowerCase(r17);
        r1.getClass();
    L18:
        return fu.l(r15, r1);
    L13:
        r15 = "";
        goto L14
    L19:
        String r18 = ((Artist) r8).getName();
        if (r18 == null) goto L22;
        Locale r19 = Locale.ROOT;
        r19.getClass();
        String r20 = r18.toLowerCase(r19);
        r20.getClass();
    L23:
        String r21 = ((Artist) r9).getName();
        if (r21 == null) goto L27;
        Locale r22 = Locale.ROOT;
        r22.getClass();
        r1 = r21.toLowerCase(r22);
        r1.getClass();
    L27:
        return fu.l(r20, r1);
    L22:
        r20 = "";
        goto L23
    L28:
        String r23 = ((Child) r8).getTitle();
        if (r23 == null) goto L31;
        Locale r24 = Locale.ROOT;
        r24.getClass();
        String r25 = r23.toLowerCase(r24);
        r25.getClass();
    L32:
        String r26 = ((Child) r9).getTitle();
        if (r26 == null) goto L36;
        Locale r27 = Locale.ROOT;
        r27.getClass();
        r1 = r26.toLowerCase(r27);
        r1.getClass();
    L36:
        return fu.l(r25, r1);
    L31:
        r25 = "";
        goto L32
    L37:
        String r28 = ((ArtistID3) r8).getName();
        if (r28 == null) goto L40;
        Locale r29 = Locale.ROOT;
        r29.getClass();
        String r30 = r28.toLowerCase(r29);
        r30.getClass();
    L41:
        String r31 = ((ArtistID3) r9).getName();
        if (r31 == null) goto L45;
        Locale r32 = Locale.ROOT;
        r32.getClass();
        r1 = r31.toLowerCase(r32);
        r1.getClass();
    L45:
        return fu.l(r30, r1);
    L40:
        r30 = "";
        goto L41
    L52:
        String r33 = ((AlbumID3) r8).getArtist();
        if (r33 == null) goto L55;
        Locale r34 = Locale.ROOT;
        r34.getClass();
        String r35 = r33.toLowerCase(r34);
        r35.getClass();
    L56:
        String r36 = ((AlbumID3) r9).getArtist();
        if (r36 == null) goto L60;
        Locale r37 = Locale.ROOT;
        r37.getClass();
        r1 = r36.toLowerCase(r37);
        r1.getClass();
    L60:
        return fu.l(r35, r1);
    L55:
        r35 = "";
        goto L56
    L61:
        xg1 r38 = (xg1) r8;
        xg1 r39 = (xg1) r9;
        RecyclerView r40 = r38.d;
        if (r40 != null) goto L64;
        boolean r2 = true;
    L66:
        if (r39.d != null) goto L68;
        boolean r4 = true;
    L69:
        if (r2 == r4) goto L72;
        if (r40 == null) goto L217;
        return -1;
    L217:
        return 1;
    L72:
        boolean r41 = r38.a;
        if (r41 == r39.a) goto L77;
        if (r41 == false) goto L217;
        return -1;
    L77:
        int r0 = r39.b - r38.b;
        if (r0 != 0) goto L219;
        int r3 = r38.c - r39.c;
        if (r3 == 0) goto L84;
        return r3;
    L84:
        return 0;
    L219:
        return r0;
    L68:
        r4 = false;
        goto L69
    L64:
        r2 = false;
        goto L66
    L87:
        c72 r42 = (c72) r8;
        c72 r43 = (c72) r9;
        int r44 = h12.j(r42.B, r43.B);
        if (r44 == 0) goto L91;
        return r44;
    L91:
        return h12.j(r42.hashCode(), r43.hashCode());
    L92:
        WeakHashMap r45 = j65.a;
        float r46 = ((View) r8).getZ();
        float r47 = ((View) r9).getZ();
        if (r46 <= r47) goto L96;
        return -1;
    L96:
        if (r46 >= r47) goto L99;
        return 1;
    L99:
        return 0;
    L104:
        String r48 = (String) r8;
        String r49 = (String) r9;
        r48.getClass();
        r49.getClass();
        int r50 = Math.min(r48.length(), r49.length());
        int r5 = 4;
    L105:
        if (r5 >= r50) goto L112;
        char r6 = r48.charAt(r5);
        char r51 = r49.charAt(r5);
        if (r6 != r51) goto L109;
        r5 = r5 + 1;
        goto L105
    L109:
        if (h12.j(r6, r51) >= 0) goto L224;
        return -1;
    L224:
        return 1;
    L112:
        int r52 = r48.length();
        int r53 = r49.length();
        if (r52 == r53) goto L118;
        if (r52 >= r53) goto L224;
        return -1;
    L118:
        return 0;
    L127:
        kd3 r54 = (kd3) r8;
        kd3 r55 = (kd3) r9;
        int r56 = Float.compare(((wv3) r54.n).b, ((wv3) r55.n).b);
        if (r56 == 0) goto L131;
        return r56;
    L131:
        return Float.compare(((wv3) r54.n).d, ((wv3) r55.n).d);
    L132:
        wv3 r57 = ((i94) r8).h();
        wv3 r58 = ((i94) r9).h();
        int r59 = Float.compare(r58.c, r57.c);
        if (r59 != 0) goto L228;
        int r60 = Float.compare(r57.b, r58.b);
        if (r60 != 0) goto L229;
        int r61 = Float.compare(r57.d, r58.d);
        if (r61 == 0) goto L142;
        return r61;
    L142:
        return Float.compare(r58.a, r57.a);
    L229:
        return r60;
    L228:
        return r59;
    L143:
        c72 r62 = (c72) r8;
        c72 r63 = (c72) r9;
        int r64 = h12.j(r63.B, r62.B);
        if (r64 == 0) goto L147;
        return r64;
    L147:
        return h12.j(r62.hashCode(), r63.hashCode());
    L154:
        wv3 r65 = ((i94) r8).h();
        wv3 r66 = ((i94) r9).h();
        int r67 = Float.compare(r65.a, r66.a);
        if (r67 != 0) goto L232;
        int r68 = Float.compare(r65.b, r66.b);
        if (r68 != 0) goto L233;
        int r69 = Float.compare(r65.d, r66.d);
        if (r69 == 0) goto L164;
        return r69;
    L164:
        return Float.compare(r65.c, r66.c);
    L233:
        return r68;
    L232:
        return r67;
    L165:
        ba1 r70 = (ba1) r8;
        ba1 r71 = (ba1) r9;
        if (te5.B(r70) == false) goto L200;
        if (te5.B(r71) == false) goto L200;
        c72 r72 = j51.O(r70);
        c72 r73 = j51.O(r71);
        if (h12.c(r72, r73) == true) goto L236;
        Object[] r74 = new c72[16];
        int r75 = 0;
    L174:
        if (r72 == null) goto L181;
        int r76 = r75 + 1;
        if (r74.length >= r76) goto L178;
        int r77 = r74.length;
        Object[] r78 = new Object[Math.max(r76, r77 * 2)];
        System.arraycopy(r74, 0, r78, 0, r77);
        r74 = r78;
    L178:
        if (r75 == 0) goto L180;
        System.arraycopy(r74, 0, r74, 0 + 1, r75 + 0);
    L180:
        r74[0] = r72;
        r75 = r75 + 1;
        r72 = r72.t();
        goto L174
    L181:
        Object[] r79 = new c72[16];
        int r80 = 0;
    L182:
        if (r73 == null) goto L189;
        int r81 = r80 + 1;
        if (r79.length >= r81) goto L186;
        int r82 = r79.length;
        Object[] r83 = new Object[Math.max(r81, r82 * 2)];
        System.arraycopy(r79, 0, r83, 0, r82);
        r79 = r83;
    L186:
        if (r80 == 0) goto L188;
        System.arraycopy(r79, 0, r79, 0 + 1, r80 + 0);
    L188:
        r79[0] = r73;
        r80 = r80 + 1;
        r73 = r73.t();
        goto L182
    L189:
        int r84 = Math.min(r75 - 1, r80 - 1);
        if (r84 < 0) goto L197;
        int r85 = 0;
    L193:
        if (h12.c(r74[r85], r79[r85]) == false) goto L235;
        if (r85 == r84) goto L197;
        r85 = r85 + 1;
        goto L193
    L235:
        return h12.j(((c72) r74[r85]).u(), ((c72) r79[r85]).u());
    L197:
        kf2.o("Could not find a common ancestor between the two FocusModifiers.");
    L236:
        return 0;
    L200:
        if (te5.B(r70) == false) goto L203;
        return -1;
    L203:
        if (te5.B(r71) == false) goto L236;
        return 1;
    L5:
        return fu.l(((h52) r8).a, ((h52) r9).a);
    L9:
        return fu.l(Boolean.valueOf(!h12.c(((HubFavoriteSubject) r8).getProvenance(), "own")), Boolean.valueOf(!h12.c(((HubFavoriteSubject) r9).getProvenance(), "own")));
    L47:
        return fu.l(((AlbumID3) r9).getCreated(), ((AlbumID3) r8).getCreated());
    L49:
        return fu.l(Integer.valueOf(((AlbumID3) r8).getYear()), Integer.valueOf(((AlbumID3) r9).getYear()));
    L51:
        return fu.l(Integer.valueOf(((AlbumID3) r8).getYear()), Integer.valueOf(((AlbumID3) r9).getYear()));
    L86:
        return ((wp0) r8).a - ((wp0) r9).a;
    L101:
        return ((j50) r8).c - ((j50) r9).c;
    L103:
        return ((y40) r9).b() - ((y40) r8).b();
    L120:
        return fu.l(Integer.valueOf(((ge) r8).b), Integer.valueOf(((ge) r9).b));
    L122:
        return fu.l(Integer.valueOf(((ge) r8).b), Integer.valueOf(((ge) r9).b));
    L124:
        return ((int[]) r8)[0] - ((int[]) r9)[0];
    L126:
        return ((Scope) r8).o.compareTo(((Scope) r9).o);
    L149:
        return ((wq2) r8).d.compareToIgnoreCase(((wq2) r9).d);
    L151:
        return ((wq2) r8).d.compareToIgnoreCase(((wq2) r9).d);
    L153:
        return ((wq2) r8).d.compareToIgnoreCase(((wq2) r9).d);
    }
}
