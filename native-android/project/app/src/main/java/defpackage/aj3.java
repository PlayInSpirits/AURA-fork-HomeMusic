package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.LyricsList;
import com.eddyizm.tempus.util.a;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class aj3 extends hd {
    public final xi4 c;
    public final rv2 d;
    public final pa e;
    public final vs3 f;
    public final d34 g;
    public final tv1 h;
    public final om1 i;
    public final k03 j;
    public final k03 k;
    public final k03 l;
    public final k03 m;
    public final k03 n;
    public final k03 o;
    public final k03 p;
    public final k03 q;
    public final nk1 r;
    public boolean s;
    public t24 t;
    public String u;
    public final d8 v;

    public aj3(Application r3) {
        super(r3);
        this.j = new k03(null);
        this.k = new k03(null);
        this.l = new k03(Boolean.FALSE);
        this.m = new k03(null);
        this.n = new k03(null);
        this.o = new k03(null);
        this.p = new k03(null);
        this.q = new k03(null);
        this.r = new nk1();
        this.s = true;
        this.v = new d8(16, this);
        this.c = new xi4(2);
        this.d = new rv2(27);
        this.e = new pa(12);
        this.f = new vs3();
        this.g = new d34(25);
        this.h = new tv1();
        this.i = new om1(5, (byte) 0);
    }

    public static boolean d(LyricsList r2) {
        if (r2 != null) goto L5;
    L16:
        return false;
    L5:
        if (r2.getStructuredLyrics() == null) goto L16;
        if (r2.getStructuredLyrics().isEmpty() == true) goto L16;
        if (r2.getStructuredLyrics().get(0) == null) goto L16;
        if (r2.getStructuredLyrics().get(0).getLine() == null) goto L16;
        if (r2.getStructuredLyrics().get(0).getLine().isEmpty() == true) goto L16;
        return true;
    }

    public final k03 c() {
        this.f.getClass();
        k03 r3 = new k03();
        Log.d("QueueRepository", "Getting play queue from server...");
        rm3 r0 = App.f(false).b();
        r0.getClass();
        Log.d("BookmarksClient", "getPlayQueue()");
        ((mt) r0.o).a(((pn4) r0.n).f()).enqueue(new p8(r3, 3));
        return r3;
    }

    public final void e(LyricsCache r6) {
        k03 r0 = this.l;
        if (r6 != null) goto L6;
        r0.i(Boolean.FALSE);
        return;
    L6:
        r0.i(Boolean.TRUE);
        boolean r1 = TextUtils.isEmpty(r6.getStructuredLyrics());
        k03 r2 = this.j;
        k03 r3 = this.k;
        if (r1 == false) goto L14;
        r3.i(null);
        r2.i(r6.getLyrics());
        return;
    L14:
        r3.i((LyricsList) this.r.d(LyricsList.class, r6.getStructuredLyrics()));     // Catch: Exception -> L10
        r2.i(null);     // Catch: Exception -> L10
        return;
    L10:
        r3.i(null);
        r2.i(r6.getLyrics());
    }

    public final void f(ba2 r9, final Child r10) {
        this.j.i(null);
        this.k.i(null);
        this.l.i(Boolean.FALSE);
        t24 r0 = this.t;
        d8 r2 = this.v;
        if (r0 == null) goto L5;
        r0.j(r2);
        this.t = null;
    L5:
        if (r10 == null) goto L7;
        String r1 = r10.getId();
    L9:
        if (TextUtils.isEmpty(r1) == true) goto L40;
        if (r9 == null) goto L43;
        this.u = r1;
        boolean r3 = TextUtils.isEmpty(r1);
        om1 r4 = this.i;
        if (r3 == true) goto L16;
        t24 r5 = ((s24) ((rf2) r4.o).n).i().a(new String[]{"lyrics_cache"}, new rs0(9, r1));
        this.t = r5;
        r5.e(r9, r2);
    L16:
        rf2 r6 = (rf2) r4.o;
        int r7 = 3;
        pb0 r8 = new pb0(r6, r1, r7);
        Thread r11 = new Thread(r8);
        r11.start();
        r11.join();     // Catch: InterruptedException -> L19
        LyricsCache r12 = (LyricsCache) r8.q;     // Catch: InterruptedException -> L19
    L21:
        if (r12 == null) goto L24;
        e(r12);
    L24:
        if (hw.t() == true) goto L41;
        if (r10 == null) goto L44;
        final int r13 = 0;
        if (a.a("songLyrics") == null) goto L33;
        String r14 = r10.getId();
        this.h.getClass();
        k03 r15 = new k03();
        pn4 r16 = App.f(false);
        if (r16.o != null) goto L32;
        r16.o = new xc5(r16, 16);
    L32:
        xc5 r17 = r16.o;
        r17.getClass();
        Log.d("OpenClient", "getLyricsBySongId()");
        ((n93) r17.p).a(((pn4) r17.o).f(), r14).enqueue(new q8(r15, r7));
        r15.e(r9, new yi3(this, r10, r13));
        return;
    L33:
        this.c.getClass();
        k03 r18 = new k03(null);
        pn4 r19 = App.f(false);
        if (r19.e != null) goto L36;
        r19.e = new xc5(r19, 14);
    L36:
        xc5 r20 = r19.e;
        String r21 = r10.getArtist();
        String r22 = r10.getTitle();
        r20.getClass();
        Log.d("MediaRetrievalClient", "getLyrics()");
        ((so2) r20.p).a(((pn4) r20.o).f(), r21, r22).enqueue(new p8(r18, 6));
        final int r23 = 1;
        r18.e(r9, new yi3(this, r10, r23));
        return;
    L44:
        return;
    L41:
        return;
    L19:
        e = move-exception;
        e.printStackTrace();
        r12 = null;
        goto L21
    L43:
        return;
    L40:
        return;
    L7:
        r1 = this.u;
        goto L9
    }

    public final void g(Child r4, String r5, LyricsList r6) {
        if (r4 == null) goto L18;
        if (r6 == null) goto L8;
        if (d(r6) == false) goto L8;
    L10:
        LyricsCache r0 = new LyricsCache(r4.getId());
        r0.setArtist(r4.getArtist());
        r0.setTitle(r4.getTitle());
        r0.setUpdatedAt(System.currentTimeMillis());
        if (r6 != null) goto L13;
    L15:
        r0.setLyrics(r5);
        r0.setStructuredLyrics(null);
    L16:
        int r7 = 18;
        new Thread(new lg1(r7, (rf2) this.i.o, r0)).start();
        this.l.i(Boolean.TRUE);
        return;
    L13:
        if (d(r6) == false) goto L15;
        r0.setStructuredLyrics(this.r.j(r6));
        r0.setLyrics(null);
    L8:
        if (TextUtils.isEmpty(r5) == false) goto L10;
        return;
    }

    public final void h(Context r7, Child r8) {
        if (r8 != null) goto L4;
    L7:
        if (r8 == null) goto L30;
        String r0 = r8.getId();
        int r2 = 1;
        int r3 = 0;
        if (r8.getStarred() == null) goto L11;
        boolean r1 = true;
    L12:
        boolean r4 = n61.f(1, r0, r1);
        d34 r5 = this.g;
        if (r4 == false) goto L21;
        if (hw.t() == false) goto L18;
        r5.J(r8.getId(), null, false, null);
        r8.setStarred(null);
        return;
    L18:
        String r9 = r8.getId();
        zi3 r6 = new zi3(this, r8, r3);
        r5.getClass();
        d34.K(r9, null, null, r6);
        r8.setStarred(null);
        return;
    L21:
        if (hw.t() == false) goto L24;
        r5.J(r8.getId(), null, true, null);
        r8.setStarred(new Date());
        return;
    L24:
        String r10 = r8.getId();
        zi3 r11 = new zi3(this, r8, r2);
        r5.getClass();
        d34.I(r10, null, null, r11);
        r8.setStarred(new Date());
        if (ud3.X() == true) goto L27;
        return;
    L27:
        if (ud3.o() != null) goto L32;
        au0.w(r7).b(gi1.G(r8), new Download(r8), false);
        return;
    L32:
        return;
    L11:
        r1 = false;
        goto L12
    L30:
        return;
    L4:
        if (ot1.c(r8.getId()) == false) goto L7;
        ot1.e(r7, r8);
    }

    public final void i(le1 r4, String r5, String r6) {
        this.u = r6;
        if (TextUtils.isEmpty(r6) == true) goto L5;
        f(r4, null);
    L9:
        k03 r0 = this.n;
        if (r5 != null) goto L12;
        r0.i(null);
        return;
    L12:
        if (r5.equals("podcast") == false) goto L14;
        r0.i(null);
        return;
    L14:
        if (r5.equals("music") == true) goto L18;
        r0.i(null);
        return;
    L18:
        if (ot1.c(r6) == false) goto L21;
        r0.i(ot1.h(r6));
    L24:
        this.m.i(null);
        return;
    L21:
        if (TextUtils.isEmpty(r6) == true) goto L23;
        this.c.getClass();
        xi4.r(r6).e(r4, new f7(3, this, r6));
        goto L24
    L23:
        r0.i(null);
        goto L24
    L5:
        t24 r1 = this.t;
        if (r1 == null) goto L8;
        r1.j(this.v);
        this.t = null;
    L8:
        this.j.i(null);
        this.k.i(null);
        this.l.i(Boolean.FALSE);
        goto L9
    }
}
