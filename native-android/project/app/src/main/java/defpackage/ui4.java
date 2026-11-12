package defpackage;

import android.app.Application;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Genre;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ui4 extends hd {
    public final xi4 c;
    public final pa d;
    public String e;
    public String f;
    public Genre g;
    public ArtistID3 h;
    public AlbumID3 i;
    public k03 j;
    public ArrayList k;
    public ArrayList l;
    public int m;
    public final int n;
    public final int o;

    public ui4(Application r2) {
        super(r2);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        this.n = SmartPlan.MAX_QUEUE;
        this.o = SmartPlan.MAX_QUEUE;
        this.c = new xi4(2);
        this.d = new pa(12);
    }

    public final k03 c() {
        this.j = new k03(new ArrayList());
        String r0 = this.e;
        r0.getClass();
        int r2 = 4;
        int r3 = 3;
        switch(r0.hashCode()) {
            case -1749690986: goto L22;
            case -241049756: goto L18;
            case 1434555764: goto L14;
            case 1594154365: goto L10;
            case 2022304170: goto L6;
            default: goto L4;
        };
    L4:
        byte r1 = -1;
    L25:
        xi4 r6 = this.c;
        switch(r1) {
            case 0: goto L35;
            case 1: goto L34;
            case 2: goto L33;
            case 3: goto L29;
            case 4: goto L28;
            default: goto L37;
        };
    L28:
        Integer r4 = Integer.valueOf(this.m);
        Integer r5 = Integer.valueOf(this.m + 10);
        r6.getClass();
        this.j = xi4.q(this.n, r4, r5);
        goto L37
    L29:
        ArrayList r7 = this.k;
        r6.getClass();
        k03 r8 = new k03();
        int r9 = r7.size();
        int r10 = 0;
    L30:
        if (r10 >= r9) goto L32;
        Object r11 = r7.get(r10);
        r10 = r10 + 1;
        String r12 = (String) r11;
        xc5 r13 = App.f(false).a();
        r13.getClass();
        Log.d("BrowsingClient", "getSongsByGenre()");
        ((w8) r13.p).e(((pn4) r13.o).f(), r12, SmartPlan.MAX_QUEUE, 0, ud3.k()).enqueue(new r8(r8, r3));
        goto L30
    L32:
        this.j = r8;
        goto L37
    L33:
        String r14 = this.h.getName();
        this.d.getClass();
        this.j = pa.z(50, r14);
        goto L37
    L34:
        r6.getClass();
        this.j = xi4.s(-1, false, true);
        goto L37
    L35:
        String r15 = this.g.getGenre();
        r6.getClass();
        k03 r16 = new k03();
        xc5 r17 = App.f(false).a();
        r17.getClass();
        Log.d("BrowsingClient", "getRandomSongs()");
        ((w8) r17.p).a(((pn4) r17.o).f(), this.o, 0, 3000, r15, ud3.k()).enqueue(new ck(r16, r2));
        this.j = r16;
    L37:
        return this.j;
    L6:
        if (r0.equals("MEDIA_BY_YEAR") == false) goto L39;
        r1 = 4;
        goto L25
    L39:
        r1 = -1;
        goto L25
    L10:
        if (r0.equals("MEDIA_BY_GENRES") == false) goto L40;
        r1 = 3;
        goto L25
    L40:
        r1 = -1;
        goto L25
    L14:
        if (r0.equals("MEDIA_BY_ARTIST") == false) goto L41;
        r1 = 2;
        goto L25
    L41:
        r1 = -1;
        goto L25
    L18:
        if (r0.equals("MEDIA_STARRED") == false) goto L42;
        r1 = 1;
        goto L25
    L42:
        r1 = -1;
        goto L25
    L22:
        if (r0.equals("MEDIA_BY_GENRE") == false) goto L43;
        r1 = 0;
        goto L25
    L43:
        r1 = -1;
        goto L25
    }
}
