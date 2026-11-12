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

    public pq(Context context, MediaService mediaService) {
        this.a = context;
        this.b = mediaService;
        i60 i60Var = new i60(1040452);
        i60Var.f = context.getString(R.string.exo_controls_shuffle_on_description);
        Bundle bundle = Bundle.EMPTY;
        i60Var.d(new va4("android.media3.session.demo.SHUFFLE_ON", bundle));
        i60Var.f(6);
        j60 j60VarA = i60Var.a();
        this.c = j60VarA;
        i60 i60Var2 = new i60(57411);
        i60Var2.f = context.getString(R.string.exo_controls_shuffle_off_description);
        i60Var2.d(new va4("android.media3.session.demo.SHUFFLE_OFF", bundle));
        i60Var2.f(6);
        j60 j60VarA2 = i60Var2.a();
        this.d = j60VarA2;
        i60 i60Var3 = new i60(1040448);
        i60Var3.f = context.getString(R.string.exo_controls_repeat_off_description);
        i60Var3.d(new va4("android.media3.session.demo.REPEAT_OFF", bundle));
        i60Var3.f(6);
        j60 j60VarA3 = i60Var3.a();
        this.e = j60VarA3;
        i60 i60Var4 = new i60(57409);
        i60Var4.f = context.getString(R.string.exo_controls_repeat_one_description);
        i60Var4.d(new va4("android.media3.session.demo.REPEAT_ONE", bundle));
        i60Var4.f(6);
        j60 j60VarA4 = i60Var4.a();
        this.f = j60VarA4;
        i60 i60Var5 = new i60(57408);
        i60Var5.f = context.getString(R.string.exo_controls_repeat_all_description);
        i60Var5.d(new va4("android.media3.session.demo.REPEAT_ALL", bundle));
        i60Var5.f(6);
        j60 j60VarA5 = i60Var5.a();
        this.g = j60VarA5;
        i60 i60Var6 = new i60(0);
        i60Var6.f = context.getString(R.string.exo_controls_heart_on_description);
        i60Var6.d(new va4("android.media3.session.demo.HEART_ON", bundle));
        i60Var6.d = R.drawable.ic_favorite;
        i60Var6.f(6);
        j60 j60VarA6 = i60Var6.a();
        this.h = j60VarA6;
        i60 i60Var7 = new i60(0);
        i60Var7.f = context.getString(R.string.exo_controls_heart_off_description);
        i60Var7.d(new va4("android.media3.session.demo.HEART_OFF", bundle));
        i60Var7.d = R.drawable.ic_favorites_outlined;
        i60Var7.f(6);
        j60 j60VarA7 = i60Var7.a();
        this.i = j60VarA7;
        i60 i60Var8 = new i60(0);
        i60Var8.f = context.getString(R.string.cast_expanded_controller_loading);
        i60Var8.d(new va4("android.media3.session.demo.HEART_LOADING", bundle));
        i60Var8.d = R.drawable.ic_bookmark_sync;
        i60Var8.f(6);
        j60 j60VarA8 = i60Var8.a();
        i60 i60Var9 = new i60(0);
        i60Var9.f = "instantmix on";
        i60Var9.d(new va4("android.media3.session.demo.INSTANT_MIX_ON", bundle));
        i60Var9.d = R.drawable.ic_instantmix_on;
        i60Var9.f(6);
        j60 j60VarA9 = i60Var9.a();
        this.j = j60VarA9;
        i60 i60Var10 = new i60(0);
        i60Var10.f = "instantmix off";
        i60Var10.d(new va4("android.media3.session.demo.INSTANT_MIX_OFF", bundle));
        i60Var10.d = R.drawable.media3_icon_minus_circle_unfilled;
        i60Var10.f(6);
        j60 j60VarA10 = i60Var10.a();
        this.k = j60VarA10;
        i60 i60Var11 = new i60(57413);
        i60Var11.c(7);
        i60Var11.f = "Previous";
        this.l = i60Var11.a();
        i60 i60Var12 = new i60(57399);
        i60Var12.c(1);
        i60Var12.f = "Play/Pause";
        this.m = i60Var12.a();
        i60 i60Var13 = new i60(57412);
        i60Var13.c(8);
        i60Var13.f = "Next";
        this.n = i60Var13.a();
        List listP = gb.P(j60VarA, j60VarA2, j60VarA3, j60VarA4, j60VarA5, j60VarA6, j60VarA7, j60VarA8, j60VarA9, j60VarA10);
        this.o = new oq(this);
        this.q = new Handler(Looper.getMainLooper());
        this.r = new mq(this, 0);
        wa4 wa4Var = dr2.e;
        wa4Var.getClass();
        HashSet hashSet = new HashSet(wa4Var.a);
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            va4 va4Var = ((j60) it.next()).a;
            if (va4Var != null) {
                hashSet.add(va4Var);
            }
        }
        this.s = new wa4(hashSet);
    }

    public static boolean c(qi3 qi3Var) {
        gn2 gn2VarA = qi3Var.a();
        boolean z = false;
        if (gn2VarA == null) {
            return false;
        }
        lu3 lu3Var = qi3Var.K0().i;
        vl1 vl1Var = lu3Var instanceof vl1 ? (vl1) lu3Var : null;
        if (vl1Var != null && vl1Var.c) {
            z = true;
        }
        Bundle bundle = gn2VarA.d.I;
        return !h12.c(bundle != null ? bundle.getString("type") : null, "music") ? z : n61.f(1, gn2VarA.a, z);
    }

    public final yw1 a(qi3 qi3Var, boolean z) {
        ArrayList arrayListQ = gb.Q(this.l, this.m, this.n);
        ArrayList arrayList = new ArrayList();
        List listP = gb.P("[heartID]", "[repeatID]", "[shuffleID]", "[instantMixID]");
        List listT0 = q40.t0(ti.i0(new String[]{b11.m("custom_command_first_button", "[heartID]"), b11.m("custom_command_second_button", "[repeatID]")}));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listP) {
            if (!listT0.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = listT0.iterator();
        while (it.hasNext()) {
            j60 j60VarB = b((String) it.next(), qi3Var, z);
            if (j60VarB != null) {
                arrayList.add(j60VarB);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            j60 j60VarB2 = b((String) obj2, qi3Var, z);
            if (j60VarB2 != null) {
                arrayList.add(j60VarB2);
            }
        }
        yw1 yw1VarK = yw1.k(arrayList);
        yw1VarK.getClass();
        arrayListQ.addAll(yw1VarK);
        yw1 yw1VarK2 = yw1.k(arrayListQ);
        yw1VarK2.getClass();
        return yw1VarK2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final j60 b(String str, qi3 qi3Var, boolean z) {
        switch (str.hashCode()) {
            case -1358202580:
                if (!str.equals("[repeatID]")) {
                    return null;
                }
                int iH = qi3Var.h();
                if (iH != 1) {
                    return iH != 2 ? this.e : this.g;
                }
                return this.f;
            case 669700004:
                if (str.equals("[shuffleID]")) {
                    return qi3Var.D0() ? this.d : this.c;
                }
                return null;
            case 1381209996:
                if (str.equals("[instantMixID]")) {
                    return !bo2.c.get() ? this.j : this.k;
                }
                return null;
            case 1923445239:
                if (!str.equals("[heartID]") || qi3Var.a() == null || z) {
                    return null;
                }
                return c(qi3Var) ? this.h : this.i;
            default:
                return null;
        }
    }

    public final mw1 d(kn2 kn2Var, fr2 fr2Var, List list) {
        kn2Var.getClass();
        fr2Var.getClass();
        list.getClass();
        Log.d("BaseSessionCallback", "onAddMediaItems");
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gn2 gn2Var = (gn2) it.next();
            do2 do2Var = gn2Var.d;
            do2Var.getClass();
            co2 co2VarA = do2Var.a();
            CharSequence string = do2Var.b;
            if (string == null) {
                Bundle bundle = do2Var.I;
                string = bundle != null ? bundle.getString("uri") : null;
                if (string == null) {
                    string = "";
                }
            }
            co2VarA.b = string;
            do2 do2Var2 = new do2(co2VarA);
            tm2 tm2VarA = gn2Var.a();
            tm2VarA.b = gn2Var.f.a;
            tm2VarA.k = do2Var2;
            tm2VarA.c = "audio";
            arrayList.add(tm2VarA.a());
        }
        return new mw1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    public final ic2 e(kn2 kn2Var, fr2 fr2Var, String str, lu3 lu3Var) {
        Object obj;
        l61 l61VarG;
        Call<ApiResponse> callB;
        kn2Var.getClass();
        fr2Var.getClass();
        str.getClass();
        lu3Var.getClass();
        boolean z = ((vl1) lu3Var).c;
        if (ot1.c(str)) {
            io1.b.post(new bs1(this.a, str, z, 2));
            return new mw1(new ab4(0));
        }
        j02 j02VarG0 = gb.g0(0, kn2Var.a().Q0());
        ArrayList arrayList = new ArrayList(r40.k0(j02VarG0, 10));
        Iterator it = j02VarG0.iterator();
        while (((i02) it).p) {
            arrayList.add(kn2Var.a().Y(((b02) it).nextInt()));
        }
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!h12.c(((gn2) obj).a, str));
        gn2 gn2Var = (gn2) obj;
        if (gn2Var == null) {
            l61VarG = null;
        } else {
            Bundle bundle = gn2Var.d.I;
            if (!h12.c(bundle != null ? bundle.getString("type") : null, "music")) {
                gn2Var = null;
            }
            if (gn2Var != null) {
                l61VarG = n61.g(1, str, z);
            } else {
                l61VarG = null;
            }
        }
        if (z) {
            gp3 gp3VarE = App.f(false).e();
            gp3VarE.getClass();
            Log.d("MediaAnnotationClient", "star()");
            callB = ((zi2) gp3VarE.p).c(((pn4) gp3VarE.o).f(), str, null, null);
        } else {
            gp3 gp3VarE2 = App.f(false).e();
            gp3VarE2.getClass();
            Log.d("MediaAnnotationClient", "unstar()");
            callB = ((zi2) gp3VarE2.p).b(((pn4) gp3VarE2.o).f(), str, null, null);
        }
        lb4 lb4Var = new lb4();
        callB.enqueue(new nq(l61VarG, kn2Var, str, z, this, lb4Var));
        return lb4Var;
    }

    public final void f(kn2 kn2Var, boolean z) {
        kn2Var.getClass();
        tn2 tn2Var = kn2Var.a;
        fr2 fr2VarG = tn2Var.g();
        if (fr2VarG == null) {
            return;
        }
        qi3 qi3VarA = kn2Var.a();
        qi3VarA.getClass();
        yw1 yw1VarK = yw1.k(a(qi3VarA, z));
        ls2 ls2Var = tn2Var.h;
        if (tn2Var.k(fr2VarG)) {
            ls2Var.x = yw1VarK;
            ls2Var.O();
            ls2Var.P(tn2Var.s);
        }
        tn2Var.d(fr2VarG, new vr2(yw1VarK));
    }
}
