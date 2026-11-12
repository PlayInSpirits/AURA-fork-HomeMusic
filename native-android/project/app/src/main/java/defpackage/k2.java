package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.eddyizm.tempus.homemusic.HubAssistantTask;
import com.eddyizm.tempus.homemusic.HubFavoriteSnapshot;
import com.eddyizm.tempus.homemusic.HubUpload;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k2 implements if1 {
    public final /* synthetic */ int n;

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = 1;
        int i2 = 0;
        switch (this.n) {
            case 0:
                return Boolean.valueOf(!false);
            case 1:
                Class cls = ra.U0;
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(fh0.p((i94) obj));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return (js4) obj;
            case 4:
                mf3 mf3Var = (mf3) obj;
                l90 l90Var = hb.a;
                mf3Var.getClass();
                vr1.C(mf3Var, l90Var);
                return ((Context) vr1.C(mf3Var, hb.b)).getResources();
            case 5:
                return Boolean.valueOf(fh0.p((i94) obj));
            case 6:
                mf3 mf3Var2 = (mf3) obj;
                wl4 wl4Var = hb.b;
                mf3Var2.getClass();
                if (((Context) vr1.C(mf3Var2, wl4Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return hv.b;
                }
                fv.a.getClass();
                return ev.c;
            case 7:
                String str = (String) obj;
                str.getClass();
                b00 b00Var = b00.a;
                return Boolean.valueOf(((SharedPreferences) b00.b.getValue()).edit().putString("queue", str).commit());
            case 8:
                vz vzVar = (vz) obj;
                vzVar.getClass();
                rr1 rr1Var = rr1.a;
                rr1.B(vzVar.a, new wc(i, vzVar));
                return j15.a;
            case 9:
                e80 e80Var = (e80) obj;
                c72 c72Var = e80Var instanceof c72 ? (c72) e80Var : null;
                if (c72Var != null && c72Var.Z) {
                    cz1.b("Apply is called on deactivated node " + e80Var);
                }
                return j15.a;
            case 10:
                return Boolean.TRUE;
            case 11:
                le0 le0Var = (le0) obj;
                if (le0Var instanceof pe0) {
                    return (pe0) le0Var;
                }
                return null;
            case 12:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new lm0(iIntValue, ((Float) obj3).floatValue(), new km0(list, i2));
            case 13:
                return Boolean.valueOf(te5.f(obj));
            case 14:
                z34 z34VarU = ((x34) obj).U("SELECT DISTINCT album_id FROM download WHERE NULLIF(album_artist, '') IS NULL AND NULLIF(album_id, '') IS NOT NULL AND download_state = 1");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (z34VarU.O()) {
                        arrayList.add(z34VarU.isNull(0) ? null : z34VarU.D(0));
                        break;
                    }
                    return arrayList;
                } finally {
                    z34VarU.close();
                }
            case 15:
                z34 z34VarU2 = ((x34) obj).U("DELETE FROM download");
                try {
                    z34VarU2.O();
                    return null;
                } finally {
                    z34VarU2.close();
                }
            case WaveRetry.MAX_FAILURES /* 16 */:
                z34 z34VarU3 = ((x34) obj).U("SELECT COUNT(*) FROM download WHERE download_state = 1");
                try {
                    return Integer.valueOf(z34VarU3.O() ? (int) z34VarU3.getLong(0) : 0);
                } finally {
                    z34VarU3.close();
                }
            case 17:
                z34 z34VarU4 = ((x34) obj).U("SELECT * FROM favorite");
                try {
                    int iE = rr2.E(z34VarU4, "timestamp");
                    int iE2 = rr2.E(z34VarU4, "songId");
                    int iE3 = rr2.E(z34VarU4, "albumId");
                    int iE4 = rr2.E(z34VarU4, "artistId");
                    int iE5 = rr2.E(z34VarU4, "toStar");
                    ArrayList arrayList2 = new ArrayList();
                    while (z34VarU4.O()) {
                        arrayList2.add(new Favorite(z34VarU4.getLong(iE), z34VarU4.isNull(iE2) ? null : z34VarU4.D(iE2), z34VarU4.isNull(iE3) ? null : z34VarU4.D(iE3), z34VarU4.isNull(iE4) ? null : z34VarU4.D(iE4), ((int) z34VarU4.getLong(iE5)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    z34VarU4.close();
                }
            case 18:
                return j15.a;
            case 19:
                return Boolean.valueOf(((ba1) obj).q0());
            case 20:
                synchronized (jh4.c) {
                    List list2 = jh4.i;
                    int size = list2.size();
                    while (i2 < size) {
                        ((if1) list2.get(i2)).invoke(obj);
                        i2++;
                    }
                }
                return j15.a;
            case 21:
                Child child = (Child) obj;
                child.getClass();
                Integer discNumber = child.getDiscNumber();
                if (discNumber != null) {
                    return discNumber;
                }
                return 0;
            case 22:
                Child child2 = (Child) obj;
                child2.getClass();
                Integer track = child2.getTrack();
                if (track != null) {
                    return track;
                }
                return 0;
            case 23:
                Child child3 = (Child) obj;
                child3.getClass();
                String title = child3.getTitle();
                return title != null ? title : "";
            case 24:
                k14 k14Var = (k14) obj;
                k14Var.getClass();
                rr1 rr1Var2 = rr1.a;
                return (HubFavoriteSnapshot) rr1.p(k14Var, HubFavoriteSnapshot.class);
            case 25:
                String str2 = (String) obj;
                nz3 nz3VarF = b11.f(str2);
                nz3VarF.d(str2.concat("/api/assistant/tasks"));
                return new oz3(nz3VarF);
            case 26:
                k14 k14Var2 = (k14) obj;
                k14Var2.getClass();
                rr1 rr1Var3 = rr1.a;
                return rr1.q(k14Var2, HubAssistantTask.class);
            case 27:
                k14 k14Var3 = (k14) obj;
                k14Var3.getClass();
                rr1 rr1Var4 = rr1.a;
                return (HubAssistantTask) rr1.p(k14Var3, HubAssistantTask.class);
            case 28:
                k14 k14Var4 = (k14) obj;
                k14Var4.getClass();
                rr1 rr1Var5 = rr1.a;
                return rr1.q(k14Var4, HubUpload.class);
            default:
                k14 k14Var5 = (k14) obj;
                k14Var5.getClass();
                rr1 rr1Var6 = rr1.a;
                return (HubAssistantTask) rr1.p(k14Var5, HubAssistantTask.class);
        }
    }

    public /* synthetic */ k2(int i, byte b) {
        this.n = i;
    }
}
