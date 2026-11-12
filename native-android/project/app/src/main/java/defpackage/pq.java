package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pq {
    public final Context a;
    public final MediaService b;
    public final j60 c;
    public final j60 d;
    public final j60 e;
    public final j60 f;
    public final j60 g;
    public final j60 h;
    public final j60 i;
    public final j60 j;
    public final j60 k;
    public final j60 l;
    public final j60 m;
    public final j60 n;
    public final oq o;
    public kn2 p;
    public final Handler q;
    public final mq r;
    public final wa4 s;

    public pq(Context r14, MediaService r15) {
        this.a = r14;
        this.b = r15;
        i60 r16 = new i60(1040452);
        r16.f = r14.getString(R.string.exo_controls_shuffle_on_description);
        Bundle r1 = Bundle.EMPTY;
        r16.d(new va4("android.media3.session.demo.SHUFFLE_ON", r1));
        r16.f(new int[]{6});
        j60 r3 = r16.a();
        this.c = r3;
        i60 r17 = new i60(57411);
        r17.f = r14.getString(R.string.exo_controls_shuffle_off_description);
        r17.d(new va4("android.media3.session.demo.SHUFFLE_OFF", r1));
        r17.f(new int[]{6});
        j60 r4 = r17.a();
        this.d = r4;
        i60 r18 = new i60(1040448);
        r18.f = r14.getString(R.string.exo_controls_repeat_off_description);
        r18.d(new va4("android.media3.session.demo.REPEAT_OFF", r1));
        r18.f(new int[]{6});
        j60 r5 = r18.a();
        this.e = r5;
        i60 r19 = new i60(57409);
        r19.f = r14.getString(R.string.exo_controls_repeat_one_description);
        r19.d(new va4("android.media3.session.demo.REPEAT_ONE", r1));
        r19.f(new int[]{6});
        j60 r6 = r19.a();
        this.f = r6;
        i60 r110 = new i60(57408);
        r110.f = r14.getString(R.string.exo_controls_repeat_all_description);
        r110.d(new va4("android.media3.session.demo.REPEAT_ALL", r1));
        r110.f(new int[]{6});
        j60 r7 = r110.a();
        this.g = r7;
        i60 r111 = new i60(0);
        r111.f = r14.getString(R.string.exo_controls_heart_on_description);
        r111.d(new va4("android.media3.session.demo.HEART_ON", r1));
        r111.d = R.drawable.ic_favorite;
        r111.f(new int[]{6});
        j60 r8 = r111.a();
        this.h = r8;
        i60 r112 = new i60(0);
        r112.f = r14.getString(R.string.exo_controls_heart_off_description);
        r112.d(new va4("android.media3.session.demo.HEART_OFF", r1));
        r112.d = R.drawable.ic_favorites_outlined;
        r112.f(new int[]{6});
        j60 r9 = r112.a();
        this.i = r9;
        i60 r113 = new i60(0);
        r113.f = r14.getString(R.string.cast_expanded_controller_loading);
        r113.d(new va4("android.media3.session.demo.HEART_LOADING", r1));
        r113.d = R.drawable.ic_bookmark_sync;
        r113.f(new int[]{6});
        j60 r10 = r113.a();
        i60 r114 = new i60(0);
        r114.f = "instantmix on";
        r114.d(new va4("android.media3.session.demo.INSTANT_MIX_ON", r1));
        r114.d = R.drawable.ic_instantmix_on;
        r114.f(new int[]{6});
        j60 r11 = r114.a();
        this.j = r11;
        i60 r115 = new i60(0);
        r115.f = "instantmix off";
        r115.d(new va4("android.media3.session.demo.INSTANT_MIX_OFF", r1));
        r115.d = R.drawable.media3_icon_minus_circle_unfilled;
        r115.f(new int[]{6});
        j60 r12 = r115.a();
        this.k = r12;
        i60 r116 = new i60(57413);
        r116.c(7);
        r116.f = "Previous";
        this.l = r116.a();
        i60 r117 = new i60(57399);
        r117.c(1);
        r117.f = "Play/Pause";
        this.m = r117.a();
        i60 r118 = new i60(57412);
        r118.c(8);
        r118.f = "Next";
        this.n = r118.a();
        List r119 = gb.P(new j60[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12});
        this.o = new oq(this);
        this.q = new Handler(Looper.getMainLooper());
        this.r = new mq(this, 0);
        wa4 r120 = dr2.e;
        r120.getClass();
        HashSet r0 = new HashSet(r120.a);
        Iterator r121 = r119.iterator();
    L4:
        if (r121.hasNext() == false) goto L8;
        va4 r122 = ((j60) r121.next()).a;
        if (r122 == null) goto L4;
        r0.add(r122);
        goto L4
    L8:
        this.s = new wa4(r0);
    }

    public static boolean c(qi3 r4) {
        gn2 r0 = r4.a();
        boolean r1 = false;
        if (r0 != null) goto L5;
        return false;
    L5:
        lu3 r5 = r4.K0().i;
        String r3 = null;
        if ((r5 instanceof vl1) == false) goto L8;
        vl1 r6 = (vl1) r5;
    L10:
        if (r6 != null) goto L12;
    L14:
        Bundle r7 = r0.d.I;
        if (r7 == null) goto L18;
        r3 = r7.getString("type");
    L18:
        if (h12.c(r3, "music") == true) goto L21;
        return r1;
    L21:
        return n61.f(1, r0.a, r1);
    L12:
        if (r6.c != true) goto L14;
        r1 = true;
        goto L14
    L8:
        r6 = null;
        goto L10
    }

    public final yw1 a(qi3 r8, boolean r9) {
        j60 r0 = this.m;
        j60 r1 = this.n;
        ArrayList r2 = gb.Q(new j60[]{this.l, r0, r1});
        ArrayList r3 = new ArrayList();
        List r4 = gb.P(new String[]{"[heartID]", "[repeatID]", "[shuffleID]", "[instantMixID]"});
        List r5 = q40.t0(ti.i0(new String[]{b11.m("custom_command_first_button", "[heartID]"), b11.m("custom_command_second_button", "[repeatID]")}));
        ArrayList r6 = new ArrayList();
        Iterator r7 = r4.iterator();
    L4:
        if (r7.hasNext() == false) goto L8;
        Object r10 = r7.next();
        if (r5.contains((String) r10) == true) goto L4;
        r6.add(r10);
        goto L4
    L8:
        Iterator r11 = r5.iterator();
    L10:
        if (r11.hasNext() == false) goto L14;
        j60 r12 = b((String) r11.next(), r8, r9);
        if (r12 == null) goto L10;
        r3.add(r12);
        goto L10
    L14:
        int r13 = r6.size();
        int r14 = 0;
    L15:
        if (r14 >= r13) goto L19;
        Object r15 = r6.get(r14);
        r14 = r14 + 1;
        j60 r16 = b((String) r15, r8, r9);
        if (r16 == null) goto L15;
        r3.add(r16);
        goto L15
    L19:
        yw1 r17 = yw1.k(r3);
        r17.getClass();
        r2.addAll(r17);
        yw1 r18 = yw1.k(r2);
        r18.getClass();
        return r18;
    }

    public final j60 b(String r2, qi3 r3, boolean r4) {
        switch(r2.hashCode()) {
            case -1358202580: goto L37;
            case 669700004: goto L28;
            case 1381209996: goto L19;
            case 1923445239: goto L6;
            default: goto L51;
        };
    L51:
        return null;
    L6:
        if (r2.equals("[heartID]") == true) goto L9;
        return null;
    L9:
        if (r3.a() == null) goto L38;
        if (r4 == false) goto L13;
        return null;
    L13:
        if (c(r3) == false) goto L17;
        return this.h;
    L17:
        return this.i;
    L38:
        return null;
    L19:
        if (r2.equals("[instantMixID]") == true) goto L22;
        return null;
    L22:
        if (bo2.c.get() == true) goto L26;
        return this.j;
    L26:
        return this.k;
    L28:
        if (r2.equals("[shuffleID]") == true) goto L31;
        return null;
    L31:
        if (r3.D0() == false) goto L35;
        return this.d;
    L35:
        return this.c;
    L37:
        if (r2.equals("[repeatID]") == false) goto L50;
        int r5 = r3.h();
        if (r5 == 1) goto L49;
        if (r5 == 2) goto L47;
        return this.e;
    L47:
        return this.g;
    L49:
        return this.f;
    L50:
        return null;
    }

    public final mw1 d(kn2 r3, fr2 r4, List r5) {
        r3.getClass();
        r4.getClass();
        r5.getClass();
        Log.d("BaseSessionCallback", "onAddMediaItems");
        ArrayList r2 = new ArrayList(r40.k0(r5, 10));
        Iterator r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L17;
        gn2 r7 = (gn2) r6.next();
        do2 r8 = r7.d;
        r8.getClass();
        co2 r0 = r8.a();
        CharSequence r1 = r8.b;
        if (r1 != null) goto L15;
        Bundle r9 = r8.I;
        if (r9 == null) goto L11;
        String r10 = r9.getString("uri");
    L10:
        r1 = r10;
        if (r1 != null) goto L15;
        r1 = "";
        goto L15
    L11:
        r10 = null;
    L15:
        r0.b = r1;
        do2 r11 = new do2(r0);
        tm2 r12 = r7.a();
        r12.b = r7.f.a;
        r12.k = r11;
        r12.c = "audio";
        r2.add(r12.a());
        goto L4
    L17:
        return new mw1(r2);
    }

    public final ic2 e(kn2 r8, fr2 r9, String r10, lu3 r11) {
        r8.getClass();
        r9.getClass();
        r10.getClass();
        r11.getClass();
        boolean r4 = ((vl1) r11).c;
        if (ot1.c(r10) == false) goto L6;
        io1.b.post(new bs1(this.a, r10, r4, 2));
        return new mw1(new ab4(0));
    L6:
        j02 r12 = gb.g0(0, r8.a().Q0());
        ArrayList r0 = new ArrayList(r40.k0(r12, 10));
        Iterator r13 = r12.iterator();
    L8:
        if (((i02) r13).p == false) goto L10;
        r0.add(r8.a().Y(((b02) r13).nextInt()));
        goto L8
    L10:
        int r14 = r0.size();
        int r1 = 0;
    L12:
        if (r1 >= r14) goto L16;
        Object r3 = r0.get(r1);
        r1 = r1 + 1;
        if (h12.c(((gn2) r3).a, r10) == false) goto L12;
    L17:
        gn2 r5 = (gn2) r3;
        if (r5 == null) goto L29;
        Bundle r15 = r5.d.I;
        if (r15 == null) goto L22;
        String r16 = r15.getString("type");
    L24:
        if (h12.c(r16, "music") == true) goto L27;
        r5 = null;
    L27:
        if (r5 == null) goto L29;
        l61 r2 = n61.g(1, r10, r4);
    L31:
        if (r4 == false) goto L33;
        gp3 r17 = App.f(false).e();
        r17.getClass();
        Log.d("MediaAnnotationClient", "star()");
        Call<ApiResponse> r18 = ((zi2) r17.p).c(((pn4) r17.o).f(), r10, null, null);
    L34:
        lb4 r6 = new lb4();
        r18.enqueue(new nq(r2, r8, r10, r4, this, r6));
        return r6;
    L33:
        gp3 r19 = App.f(false).e();
        r19.getClass();
        Log.d("MediaAnnotationClient", "unstar()");
        r18 = ((zi2) r19.p).b(((pn4) r19.o).f(), r10, null, null);
        goto L34
    L22:
        r16 = null;
    L29:
        r2 = null;
        goto L31
    L16:
        r3 = null;
        goto L17
    }

    public final void f(kn2 r3, boolean r4) {
        r3.getClass();
        tn2 r0 = r3.a;
        fr2 r1 = r0.g();
        if (r1 != null) goto L5;
        return;
    L5:
        qi3 r5 = r3.a();
        r5.getClass();
        yw1 r2 = yw1.k(a(r5, r4));
        ls2 r6 = r0.h;
        if (r0.k(r1) == false) goto L8;
        r6.x = r2;
        r6.O();
        r6.P(r0.s);
    L8:
        r0.d(r1, new vr2(r2));
    }
}
