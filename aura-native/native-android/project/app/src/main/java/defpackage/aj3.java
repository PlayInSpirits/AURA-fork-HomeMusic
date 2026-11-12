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

    public aj3(Application application) {
        super(application);
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

    public static boolean d(LyricsList lyricsList) {
        return (lyricsList == null || lyricsList.getStructuredLyrics() == null || lyricsList.getStructuredLyrics().isEmpty() || lyricsList.getStructuredLyrics().get(0) == null || lyricsList.getStructuredLyrics().get(0).getLine() == null || lyricsList.getStructuredLyrics().get(0).getLine().isEmpty()) ? false : true;
    }

    public final k03 c() {
        this.f.getClass();
        k03 k03Var = new k03();
        Log.d("QueueRepository", "Getting play queue from server...");
        rm3 rm3VarB = App.f(false).b();
        rm3VarB.getClass();
        Log.d("BookmarksClient", "getPlayQueue()");
        ((mt) rm3VarB.o).a(((pn4) rm3VarB.n).f()).enqueue(new p8(k03Var, 3));
        return k03Var;
    }

    public final void e(LyricsCache lyricsCache) {
        k03 k03Var = this.l;
        if (lyricsCache == null) {
            k03Var.i(Boolean.FALSE);
            return;
        }
        k03Var.i(Boolean.TRUE);
        boolean zIsEmpty = TextUtils.isEmpty(lyricsCache.getStructuredLyrics());
        k03 k03Var2 = this.j;
        k03 k03Var3 = this.k;
        if (zIsEmpty) {
            k03Var3.i(null);
            k03Var2.i(lyricsCache.getLyrics());
            return;
        }
        try {
            k03Var3.i((LyricsList) this.r.d(LyricsList.class, lyricsCache.getStructuredLyrics()));
            k03Var2.i(null);
        } catch (Exception unused) {
            k03Var3.i(null);
            k03Var2.i(lyricsCache.getLyrics());
        }
    }

    public final void f(ba2 ba2Var, final Child child) {
        LyricsCache lyricsCache;
        this.j.i(null);
        this.k.i(null);
        this.l.i(Boolean.FALSE);
        t24 t24Var = this.t;
        d8 d8Var = this.v;
        if (t24Var != null) {
            t24Var.j(d8Var);
            this.t = null;
        }
        String id = child != null ? child.getId() : this.u;
        if (TextUtils.isEmpty(id) || ba2Var == null) {
            return;
        }
        this.u = id;
        boolean zIsEmpty = TextUtils.isEmpty(id);
        om1 om1Var = this.i;
        if (!zIsEmpty) {
            t24 t24VarA = ((s24) ((rf2) om1Var.o).n).i().a(new String[]{"lyrics_cache"}, new rs0(9, id));
            this.t = t24VarA;
            t24VarA.e(ba2Var, d8Var);
        }
        rf2 rf2Var = (rf2) om1Var.o;
        int i = 3;
        pb0 pb0Var = new pb0(rf2Var, id, i);
        Thread thread = new Thread(pb0Var);
        thread.start();
        try {
            thread.join();
            lyricsCache = (LyricsCache) pb0Var.q;
        } catch (InterruptedException e) {
            e.printStackTrace();
            lyricsCache = null;
        }
        if (lyricsCache != null) {
            e(lyricsCache);
        }
        if (hw.t() || child == null) {
            return;
        }
        final int i2 = 0;
        if (a.a("songLyrics") != null) {
            String id2 = child.getId();
            this.h.getClass();
            k03 k03Var = new k03();
            pn4 pn4VarF = App.f(false);
            if (pn4VarF.o == null) {
                pn4VarF.o = new xc5(pn4VarF, 16);
            }
            xc5 xc5Var = pn4VarF.o;
            xc5Var.getClass();
            Log.d("OpenClient", "getLyricsBySongId()");
            ((n93) xc5Var.p).a(((pn4) xc5Var.o).f(), id2).enqueue(new q8(k03Var, i));
            k03Var.e(ba2Var, new a83(this) { // from class: yi3
                public final /* synthetic */ aj3 b;

                {
                    this.b = this;
                }

                @Override // defpackage.a83
                public final void b(Object obj) {
                    int i3 = i2;
                    Child child2 = child;
                    aj3 aj3Var = this.b;
                    switch (i3) {
                        case 0:
                            LyricsList lyricsList = (LyricsList) obj;
                            aj3Var.k.i(lyricsList);
                            aj3Var.j.i(null);
                            if (ud3.O() && aj3.d(lyricsList)) {
                                aj3Var.g(child2, null, lyricsList);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            aj3Var.j.i(str);
                            aj3Var.k.i(null);
                            if (ud3.O() && !TextUtils.isEmpty(str)) {
                                aj3Var.g(child2, str, null);
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        this.c.getClass();
        k03 k03Var2 = new k03(null);
        pn4 pn4VarF2 = App.f(false);
        if (pn4VarF2.e == null) {
            pn4VarF2.e = new xc5(pn4VarF2, 14);
        }
        xc5 xc5Var2 = pn4VarF2.e;
        String artist = child.getArtist();
        String title = child.getTitle();
        xc5Var2.getClass();
        Log.d("MediaRetrievalClient", "getLyrics()");
        ((so2) xc5Var2.p).a(((pn4) xc5Var2.o).f(), artist, title).enqueue(new p8(k03Var2, 6));
        final int i3 = 1;
        k03Var2.e(ba2Var, new a83(this) { // from class: yi3
            public final /* synthetic */ aj3 b;

            {
                this.b = this;
            }

            @Override // defpackage.a83
            public final void b(Object obj) {
                int i4 = i3;
                Child child2 = child;
                aj3 aj3Var = this.b;
                switch (i4) {
                    case 0:
                        LyricsList lyricsList = (LyricsList) obj;
                        aj3Var.k.i(lyricsList);
                        aj3Var.j.i(null);
                        if (ud3.O() && aj3.d(lyricsList)) {
                            aj3Var.g(child2, null, lyricsList);
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        aj3Var.j.i(str);
                        aj3Var.k.i(null);
                        if (ud3.O() && !TextUtils.isEmpty(str)) {
                            aj3Var.g(child2, str, null);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void g(Child child, String str, LyricsList lyricsList) {
        if (child == null) {
            return;
        }
        if ((lyricsList == null || !d(lyricsList)) && TextUtils.isEmpty(str)) {
            return;
        }
        LyricsCache lyricsCache = new LyricsCache(child.getId());
        lyricsCache.setArtist(child.getArtist());
        lyricsCache.setTitle(child.getTitle());
        lyricsCache.setUpdatedAt(System.currentTimeMillis());
        if (lyricsList == null || !d(lyricsList)) {
            lyricsCache.setLyrics(str);
            lyricsCache.setStructuredLyrics(null);
        } else {
            lyricsCache.setStructuredLyrics(this.r.j(lyricsList));
            lyricsCache.setLyrics(null);
        }
        new Thread(new lg1(18, (rf2) this.i.o, lyricsCache)).start();
        this.l.i(Boolean.TRUE);
    }

    public final void h(Context context, Child child) {
        if (child != null && ot1.c(child.getId())) {
            ot1.e(context, child);
            return;
        }
        if (child != null) {
            int i = 1;
            int i2 = 0;
            boolean zF = n61.f(1, child.getId(), child.getStarred() != null);
            d34 d34Var = this.g;
            if (zF) {
                if (hw.t()) {
                    d34Var.J(child.getId(), null, false, null);
                    child.setStarred(null);
                    return;
                }
                String id = child.getId();
                zi3 zi3Var = new zi3(this, child, i2);
                d34Var.getClass();
                d34.K(id, null, null, zi3Var);
                child.setStarred(null);
                return;
            }
            if (hw.t()) {
                d34Var.J(child.getId(), null, true, null);
                child.setStarred(new Date());
                return;
            }
            String id2 = child.getId();
            zi3 zi3Var2 = new zi3(this, child, i);
            d34Var.getClass();
            d34.I(id2, null, null, zi3Var2);
            child.setStarred(new Date());
            if (ud3.X() && ud3.o() == null) {
                au0.w(context).b(gi1.G(child), new Download(child), false);
            }
        }
    }

    public final void i(le1 le1Var, String str, String str2) {
        this.u = str2;
        if (TextUtils.isEmpty(str2)) {
            t24 t24Var = this.t;
            if (t24Var != null) {
                t24Var.j(this.v);
                this.t = null;
            }
            this.j.i(null);
            this.k.i(null);
            this.l.i(Boolean.FALSE);
        } else {
            f(le1Var, null);
        }
        k03 k03Var = this.n;
        if (str == null) {
            k03Var.i(null);
            return;
        }
        if (str.equals("podcast")) {
            k03Var.i(null);
            return;
        }
        if (!str.equals("music")) {
            k03Var.i(null);
            return;
        }
        if (ot1.c(str2)) {
            k03Var.i(ot1.h(str2));
        } else if (TextUtils.isEmpty(str2)) {
            k03Var.i(null);
        } else {
            this.c.getClass();
            xi4.r(str2).e(le1Var, new f7(3, this, str2));
        }
        this.m.i(null);
    }
}
