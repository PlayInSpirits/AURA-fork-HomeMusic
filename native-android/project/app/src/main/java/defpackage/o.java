package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [u01] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [si1] */
    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        ?? arrayList;
        Integer numValueOf;
        int i;
        long jA;
        switch (this.n) {
            case 0:
                ((rm2) this.o).l((aq3) this.p);
                return j15.a;
            case 1:
                ho hoVar = (ho) this.o;
                io ioVar = (io) this.p;
                j15 j15Var = j15.a;
                ot4 ot4Var = hoVar.B;
                if (ot4Var != null) {
                    ot4Var.b();
                }
                hoVar.B = null;
                x60 x60Var = ioVar.b;
                if (x60Var != null) {
                    x60Var.Q(j15Var);
                }
                ioVar.b = null;
                return j15Var;
            case 2:
                ig3.q((ig3) obj, (jg3) this.o, ((ft) this.p).B);
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((f13) ((zg5) this.o).n).j((cd0) this.p);
                return j15.a;
            case 4:
                ((q20) ((r20) this.o).p).I((x34) obj, (Chronology) this.p);
                return null;
            case 5:
                ((q20) ((ss0) this.o).o).I((x34) obj, (Download) this.p);
                return null;
            case 6:
                String str = (String) this.o;
                ArrayList arrayList2 = (ArrayList) this.p;
                z34 z34VarU = ((x34) obj).U(str);
                try {
                    int size = arrayList2.size();
                    int i2 = 1;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            z34VarU.e(i2);
                        } else {
                            z34VarU.r(i2, str2);
                        }
                        i2++;
                    }
                    z34VarU.O();
                    return null;
                } finally {
                    z34VarU.close();
                }
            case 7:
                ((q20) ((ss0) this.o).q).H((x34) obj, (ArrayList) this.p);
                return null;
            case 8:
                ((rm2) this.o).l((q02) this.p);
                return j15.a;
            case 9:
                ((fl1) this.o).p.removeCallbacks((lg1) this.p);
                return j15.a;
            case 10:
                jx3 jx3Var = (jx3) this.o;
                si4 si4Var = (si4) this.p;
                Long l = (Long) obj;
                if (!h12.c(l, jx3Var.n)) {
                    jx3Var.n = l;
                    si4Var.run();
                }
                return j15.a;
            case 11:
                fx3 fx3Var = (fx3) this.o;
                Runnable runnable = (Runnable) this.p;
                if (fx3Var.n) {
                    fx3Var.n = false;
                } else {
                    runnable.run();
                }
                return j15.a;
            case 12:
                ty1 ty1Var = (ty1) this.o;
                qy1 qy1Var = (qy1) this.p;
                ty1Var.a.b(qy1Var);
                ty1Var.b.setValue(Boolean.TRUE);
                return new vy1(0, ty1Var, qy1Var);
            case 13:
                ((q20) ((c12) this.o).p).H((x34) obj, (List) this.p);
                return null;
            case 14:
                jx3 jx3Var2 = (jx3) this.o;
                ArrayList arrayList3 = (ArrayList) this.p;
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                Object obj3 = jx3Var2.n;
                if (obj3 == null || obj3.equals(jSONObject.optString("revision"))) {
                    jx3Var2.n = jSONObject.optString("revision");
                    JSONArray jSONArray = jSONObject.getJSONArray("items");
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        String string = jSONObject2.getString("id");
                        string.getClass();
                        String strOptString = jSONObject2.optString("title");
                        String strOptString2 = jSONObject2.optString("artist");
                        String strOptString3 = jSONObject2.optString("album");
                        String strOptString4 = jSONObject2.optString("cover");
                        int iOptInt = jSONObject2.optInt("duration");
                        String strOptString5 = jSONObject2.optString("albumId");
                        strOptString5.getClass();
                        String str3 = !qm4.u0(strOptString5) ? strOptString5 : null;
                        String strOptString6 = jSONObject2.optString("artistId");
                        strOptString6.getClass();
                        String str4 = !qm4.u0(strOptString6) ? strOptString6 : null;
                        String strOptString7 = jSONObject2.optString("suffix");
                        strOptString7.getClass();
                        arrayList3.add(new Child(string, null, false, strOptString, strOptString3, strOptString2, null, null, null, strOptString4, null, null, !qm4.u0(strOptString7) ? strOptString7 : null, null, null, Integer.valueOf(iOptInt), Integer.valueOf(jSONObject2.optInt("bitrate")), null, null, null, false, null, null, null, null, null, null, str3, str4, null, null, null, null, null, null, -402756154, 7, null));
                    }
                    if (jSONArray.length() <= 0 || arrayList3.size() >= Math.min(jSONObject.optInt("count"), SmartPlan.MAX_QUEUE)) {
                        u52.e = false;
                        if (h12.c(u52.c().s, jx3Var2.n)) {
                            u52.d = (String) jx3Var2.n;
                            u52.c.k(q40.Q0(arrayList3));
                        }
                    } else {
                        u52.n(jx3Var2, arrayList3, arrayList3.size());
                    }
                } else {
                    u52.b.k(v52.a(u52.c(), 0, 0, R.string.lan_queue_changed, 536739839));
                    u52.e = false;
                }
                return j15.a;
            case 15:
                z82 z82Var = (z82) this.o;
                Object obj4 = this.p;
                z82Var.p.i(obj4);
                return new vy1(1, z82Var, obj4);
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new z82((x44) this.o, (Map) obj, (w44) this.p);
            case 17:
                oe2 oe2Var = (oe2) this.o;
                List<Server> list = (List) obj;
                List listO = gb.O((Server) this.p);
                if (list != null) {
                    arrayList = new ArrayList(r40.k0(list, 10));
                    for (Server server : list) {
                        arrayList.add(new Server(server.getServerId(), server.getServerName(), server.getUsername(), server.getPassword(), server.getAddress(), server.getLocalAddress(), server.getTimestamp(), server.isLowSecurity(), server.getClientCert()));
                    }
                } else {
                    arrayList = u01.n;
                }
                oe2Var.n0 = q40.G0(listO, arrayList);
                Context contextZ = oe2Var.Z();
                ArrayList arrayList4 = oe2Var.n0;
                if (arrayList4 == null) {
                    h12.Q("serverList");
                    throw null;
                }
                ArrayList arrayList5 = new ArrayList(r40.k0(arrayList4, 10));
                int size2 = arrayList4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj5 = arrayList4.get(i5);
                    i5++;
                    arrayList5.add(((Server) obj5).getServerName());
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(contextZ, R.layout.item_login_server2, arrayList5.toArray(new String[0]));
                arrayAdapter.setDropDownViewResource(R.layout.item_login_server2);
                pc1 pc1Var = oe2Var.l0;
                pc1Var.getClass();
                ((AutoCompleteTextView) pc1Var.p).setAdapter(arrayAdapter);
                if (!oe2Var.p0) {
                    ArrayList arrayList6 = oe2Var.n0;
                    if (arrayList6 == null) {
                        h12.Q("serverList");
                        throw null;
                    }
                    if (!arrayList6.isEmpty()) {
                        pc1 pc1Var2 = oe2Var.l0;
                        pc1Var2.getClass();
                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) pc1Var2.p;
                        ArrayList arrayList7 = oe2Var.n0;
                        if (arrayList7 == null) {
                            h12.Q("serverList");
                            throw null;
                        }
                        autoCompleteTextView.setText((CharSequence) ((Server) arrayList7.get(0)).getServerName(), false);
                        pc1 pc1Var3 = oe2Var.l0;
                        pc1Var3.getClass();
                        ((MaterialButton) pc1Var3.c).setText(oe2Var.s(R.string.la_server_button_create));
                        pc1 pc1Var4 = oe2Var.l0;
                        pc1Var4.getClass();
                        ((MaterialButton) pc1Var4.d).setEnabled(false);
                        pc1 pc1Var5 = oe2Var.l0;
                        pc1Var5.getClass();
                        ((MaterialButton) pc1Var5.q).setEnabled(false);
                        oe2Var.p0 = true;
                    }
                }
                return j15.a;
            case 18:
                ((q20) ((rf2) this.o).o).I((x34) obj, (LyricsCache) this.p);
                return null;
            case 19:
                ((kz2) this.o).c.add(new hz2(obj, (y94) this.p));
                return j15.a;
            case 20:
                ((wf1) this.o).invoke(Integer.valueOf(((vp3) obj).a), Integer.valueOf(((qp4) this.p).e().b));
                return j15.a;
            case 21:
                b13 b13Var = (b13) this.o;
                ig3 ig3Var = (ig3) obj;
                oc3 oc3Var = new oc3(0, (ArrayList) this.p);
                ig3Var.n = true;
                oc3Var.invoke(ig3Var);
                ig3Var.n = false;
                b13Var.getValue();
                return j15.a;
            case 22:
                ((ll3) ((ml3) this.o).b).H((x34) obj, (List) this.p);
                return null;
            case 23:
                Boolean bool = (Boolean) this.o;
                String str5 = (String) this.p;
                z34 z34VarU2 = ((x34) obj).U("UPDATE playlist SET isUniversal = ? WHERE id = ?");
                if (bool == null) {
                    numValueOf = null;
                } else {
                    try {
                        numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                    } finally {
                        z34VarU2.close();
                    }
                }
                if (numValueOf == null) {
                    z34VarU2.e(1);
                } else {
                    z34VarU2.c(1, numValueOf.intValue());
                }
                if (str5 == null) {
                    z34VarU2.e(2);
                } else {
                    z34VarU2.r(2, str5);
                }
                z34VarU2.O();
                return null;
            case 24:
                ((q20) ((rm3) this.o).o).H((x34) obj, (ArrayList) this.p);
                return null;
            case 25:
                z80 z80Var = (z80) this.o;
                x03 x03Var = (x03) this.p;
                z80Var.z(obj);
                if (x03Var != null) {
                    x03Var.a(obj);
                }
                return j15.a;
            case 26:
                tv3 tv3Var = (tv3) this.o;
                Throwable th = (Throwable) this.p;
                Throwable th2 = (Throwable) obj;
                synchronized (tv3Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                j51.d(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    tv3Var.e = th;
                    nl4 nl4Var = tv3Var.u;
                    ov3 ov3Var = ov3.n;
                    nl4Var.getClass();
                    nl4Var.j(null, ov3Var);
                }
                return j15.a;
            case 27:
                e74 e74Var = (e74) this.o;
                g74 g74Var = (g74) this.p;
                xu0 xu0Var = (xu0) obj;
                float f = xu0Var.b ? -1.0f : 1.0f;
                long j = xu0Var.a;
                if (g74Var.d == hb3.o) {
                    i = 1;
                    jA = g83.a(1, j);
                } else {
                    i = 1;
                    jA = g83.a(2, j);
                }
                e74Var.a(i, g83.f(jA, f));
                return j15.a;
            case 28:
                ig3.q((ig3) obj, (jg3) this.o, ((we4) this.p).M);
                return j15.a;
            default:
                qp4 qp4Var = (qp4) this.o;
                String str6 = (String) this.p;
                Object obj6 = qp4Var.b;
                z34 z34VarU3 = ((x34) obj).U("SELECT p.* FROM playlist p JOIN synced_playlist s ON p.id = s.playlistId WHERE s.serverId = ?");
                try {
                    z34VarU3.r(1, str6);
                    int iE = rr2.E(z34VarU3, "id");
                    int iE2 = rr2.E(z34VarU3, "name");
                    int iE3 = rr2.E(z34VarU3, "duration");
                    int iE4 = rr2.E(z34VarU3, "coverArt");
                    int iE5 = rr2.E(z34VarU3, "comment");
                    int iE6 = rr2.E(z34VarU3, "owner");
                    int iE7 = rr2.E(z34VarU3, "isUniversal");
                    int iE8 = rr2.E(z34VarU3, "songCount");
                    int iE9 = rr2.E(z34VarU3, "created");
                    int iE10 = rr2.E(z34VarU3, "changed");
                    int iE11 = rr2.E(z34VarU3, "lastPlayed");
                    int iE12 = rr2.E(z34VarU3, "allowedUsers");
                    ArrayList arrayList8 = new ArrayList();
                    while (z34VarU3.O()) {
                        Playlist playlist = new Playlist(z34VarU3.isNull(iE) ? null : z34VarU3.D(iE), z34VarU3.isNull(iE2) ? null : z34VarU3.D(iE2), z34VarU3.getLong(iE3), z34VarU3.isNull(iE4) ? null : z34VarU3.D(iE4));
                        playlist.setComment(z34VarU3.isNull(iE5) ? null : z34VarU3.D(iE5));
                        playlist.setOwner(z34VarU3.isNull(iE6) ? null : z34VarU3.D(iE6));
                        Integer numValueOf2 = z34VarU3.isNull(iE7) ? null : Integer.valueOf((int) z34VarU3.getLong(iE7));
                        playlist.setUniversal(numValueOf2 == null ? null : Boolean.valueOf(numValueOf2.intValue() != 0));
                        playlist.setSongCount((int) z34VarU3.getLong(iE8));
                        playlist.setCreated(i80.B(z34VarU3.isNull(iE9) ? null : Long.valueOf(z34VarU3.getLong(iE9))));
                        playlist.setChanged(i80.B(z34VarU3.isNull(iE10) ? null : Long.valueOf(z34VarU3.getLong(iE10))));
                        playlist.setLastPlayed(z34VarU3.getLong(iE11));
                        playlist.setAllowedUsers(((si1) qp4Var.c).E(z34VarU3.isNull(iE12) ? null : z34VarU3.D(iE12)));
                        arrayList8.add(playlist);
                        iE3 = iE3;
                        iE4 = iE4;
                        iE = iE;
                        break;
                    }
                    return arrayList8;
                } finally {
                    z34VarU3.close();
                }
        }
    }
}
