package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls1 implements Runnable {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ ls1(int i, MainActivity mainActivity, Child child, ArrayList arrayList, List list, String str) {
        this.o = i;
        this.p = mainActivity;
        this.q = child;
        this.r = arrayList;
        this.s = list;
        this.t = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x020b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [u01] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        String strConcat;
        List arrayList;
        String strConcat2;
        boolean zBooleanValue;
        switch (this.n) {
            case 0:
                int i = this.o;
                MainActivity mainActivity = (MainActivity) this.p;
                Child child = (Child) this.q;
                ArrayList arrayList2 = (ArrayList) this.r;
                List<HubTracks$Item> list = (List) this.s;
                String str = (String) this.t;
                if (i == ms1.b && !mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    if (child == null) {
                        Toast.makeText(mainActivity, R.string.homemusic_play_failed, 0).show();
                    } else {
                        rs1 rs1Var = rs1.a;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list.iterator();
                        while (true) {
                            int i2 = 10;
                            if (!it.hasNext()) {
                                Map mapZ = lg2.Z(arrayList3);
                                String string = UUID.randomUUID().toString();
                                string.getClass();
                                k62 k62Var = new k62(string, gi1.b0(str));
                                ArrayList arrayList4 = new ArrayList();
                                for (HubTracks$Item hubTracks$Item : list) {
                                    ux3 ux3Var = k62.c;
                                    String launchId = hubTracks$Item.getLaunchId();
                                    String launchOrigin = hubTracks$Item.getLaunchOrigin();
                                    if (launchOrigin == null) {
                                        launchOrigin = str;
                                    }
                                    k62 k62VarP = gi1.P(launchId, launchOrigin);
                                    if (k62VarP == null) {
                                        k62VarP = k62Var;
                                    }
                                    String songId = hubTracks$Item.getSongId();
                                    if (songId == null || qm4.u0(songId)) {
                                        songId = null;
                                    }
                                    String ref = hubTracks$Item.getRef();
                                    if (ref == null) {
                                        strConcat = null;
                                    } else {
                                        if (qm4.u0(ref)) {
                                            ref = null;
                                        }
                                        if (ref != null) {
                                            strConcat = "hub:".concat(ref);
                                        } else {
                                            strConcat = null;
                                        }
                                    }
                                    ArrayList arrayListI0 = ti.i0(new String[]{songId, strConcat});
                                    ArrayList arrayList5 = new ArrayList(r40.k0(arrayListI0, i2));
                                    int size = arrayListI0.size();
                                    int i3 = 0;
                                    while (i3 < size) {
                                        Object obj = arrayListI0.get(i3);
                                        i3++;
                                        arrayList5.add(new kd3((String) obj, k62VarP));
                                    }
                                    v40.n0(arrayList5, arrayList4);
                                    i2 = 10;
                                }
                                Map mapZ2 = lg2.Z(arrayList4);
                                rs1.m = new kd3(arrayList2, mapZ);
                                rs1.p = mapZ2;
                                bl2 bl2Var = mainActivity.P;
                                int iIndexOf = arrayList2.indexOf(child);
                                bo2.o(bl2Var, arrayList2, iIndexOf < 0 ? 0 : iIndexOf);
                                ((au) mainActivity.V.n).d(true);
                            } else {
                                HubTracks$Item hubTracks$Item2 = (HubTracks$Item) it.next();
                                String context = hubTracks$Item2.getContext();
                                if (context == null) {
                                    arrayList = u01.n;
                                } else {
                                    if (qm4.u0(context)) {
                                        context = null;
                                    }
                                    if (context != null) {
                                        String strJ0 = qm4.J0(128, context);
                                        String songId2 = hubTracks$Item2.getSongId();
                                        if (songId2 == null || qm4.u0(songId2)) {
                                            songId2 = null;
                                        }
                                        String ref2 = hubTracks$Item2.getRef();
                                        if (ref2 == null) {
                                            strConcat2 = null;
                                        } else {
                                            if (qm4.u0(ref2)) {
                                                ref2 = null;
                                            }
                                            if (ref2 != null) {
                                                strConcat2 = "hub:".concat(ref2);
                                            } else {
                                                strConcat2 = null;
                                            }
                                        }
                                        ArrayList arrayListI1 = ti.i0(new String[]{songId2, strConcat2});
                                        arrayList = new ArrayList(r40.k0(arrayListI1, 10));
                                        int size2 = arrayListI1.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            Object obj2 = arrayListI1.get(i4);
                                            i4++;
                                            arrayList.add(new kd3((String) obj2, strJ0));
                                        }
                                    } else {
                                        arrayList = u01.n;
                                    }
                                }
                                v40.n0(arrayList, arrayList3);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                kt2 kt2Var = (kt2) this.p;
                fr2 fr2Var = (fr2) this.q;
                va4 va4Var = (va4) this.r;
                String str2 = va4Var.b;
                tn2 tn2Var = (tn2) this.s;
                int i5 = this.o;
                ju1 ju1Var = (ju1) this.t;
                na4 na4Var = kt2Var.f;
                if (na4Var.F(fr2Var)) {
                    try {
                        j60 j60VarD = j60.d(va4Var);
                        Object obj3 = j60VarD.j;
                        int i6 = j60VarD.b;
                        if (j60VarD.b()) {
                            va4 va4Var2 = j60VarD.a;
                            if (va4Var2 != null) {
                                rr2.w(va4Var2.a == 40010);
                                kt2Var.U(ju1Var, i5, null, 40010, new at2(new et2(j60VarD), 1));
                            } else {
                                al3 al3Var = tn2Var.s;
                                if (i6 != 1) {
                                    zBooleanValue = false;
                                } else if (obj3 != null) {
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (al3Var.q()) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    kt2Var.M0(fr2Var, i5);
                                } else if (i6 == 31) {
                                    obj3.getClass();
                                    kt2Var.O0(fr2Var, i5, 31, new at2(new ef0(29, new ts2((gn2) obj3, true, 0), new zr2(20)), 1));
                                } else {
                                    kt2Var.O0(fr2Var, i5, i6, kt2.Q0(new et2(j60VarD)));
                                }
                                na4Var.s(fr2Var);
                            }
                        } else {
                            l93.q0("MediaSessionStub", "Can't execute predefined custom command: " + str2);
                            kt2.P0(tn2Var, fr2Var, i5, new ab4(-6));
                        }
                    } catch (RuntimeException e) {
                        l93.r0("MediaSessionStub", "Failed to convert predefined custom command: " + str2, e);
                        kt2.P0(tn2Var, fr2Var, i5, new ab4(-3));
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ls1(kt2 kt2Var, fr2 fr2Var, va4 va4Var, tn2 tn2Var, int i, ju1 ju1Var) {
        this.p = kt2Var;
        this.q = fr2Var;
        this.r = va4Var;
        this.s = tn2Var;
        this.o = i;
        this.t = ju1Var;
    }
}
