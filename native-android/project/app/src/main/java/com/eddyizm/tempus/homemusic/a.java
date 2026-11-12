package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.ao2;
import defpackage.au;
import defpackage.b02;
import defpackage.bo2;
import defpackage.cx;
import defpackage.dt1;
import defpackage.gb;
import defpackage.gg4;
import defpackage.gi1;
import defpackage.gn2;
import defpackage.h12;
import defpackage.i02;
import defpackage.io1;
import defpackage.j02;
import defpackage.ju3;
import defpackage.k03;
import defpackage.k62;
import defpackage.kf2;
import defpackage.ku3;
import defpackage.lg2;
import defpackage.ms1;
import defpackage.q;
import defpackage.q40;
import defpackage.qi3;
import defpackage.qm4;
import defpackage.r40;
import defpackage.rs1;
import defpackage.s11;
import defpackage.u01;
import defpackage.u52;
import defpackage.u6;
import defpackage.ud3;
import defpackage.up;
import defpackage.v01;
import defpackage.v6;
import defpackage.xa3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static SmartSession b;
    public static u6 c;
    public static boolean d;
    public static WeakReference a = new WeakReference(null);
    public static final HashMap e = new HashMap();
    public static final k03 f = new k03(0L);

    public static final CharSequence a(String str, String str2) {
        SmartSession smartSession;
        if (str == null || str.length() == 0 || (smartSession = b) == null || !smartSession.isRec(str2)) {
            return str;
        }
        return "✨ " + ((Object) str);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0027  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b() {
        SmartSession smartSession = b;
        if (smartSession == null) {
            return;
        }
        if (smartSession.getInFlight()) {
            smartSession.setAgain(true);
            return;
        }
        qi3 qi3VarH = h();
        if (qi3VarH != null) {
            if (!j(qi3VarH)) {
                qi3VarH = null;
            }
            if (qi3VarH == null || b != smartSession) {
                qi3VarH = null;
            }
        } else {
            qi3VarH = null;
        }
        if (qi3VarH == null) {
            return;
        }
        d();
        SmartPlan smartPlan = SmartPlan.INSTANCE;
        ArrayList arrayListE = e(qi3VarH);
        ArrayList arrayList = new ArrayList(r40.k0(arrayListE, 10));
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            gn2 gn2Var = (gn2) obj;
            String str = gn2Var.a;
            str.getClass();
            arrayList.add(new s11(str, smartSession.isRec(gn2Var.a)));
        }
        String strAnchor = smartPlan.anchor(arrayList, qi3VarH.o0(), new q(1, smartSession, SmartSession.class, "isListed", "isListed(Ljava/lang/String;)Z", 0, 5));
        SmartNextIn smartNextInSnapshot = smartSession.snapshot(strAnchor != null ? SmartContexts.INSTANCE.hubId(strAnchor) : null);
        String id = smartSession.getId();
        smartSession.setInFlight(true);
        smartSession.setAgain(false);
        io1.a.execute(new v6(smartNextInSnapshot, id, smartSession, 17));
    }

    public static void c() {
        k03 k03Var = f;
        Long l = (Long) k03Var.d();
        k03Var.k(Long.valueOf((l != null ? l.longValue() : 0L) + 1));
    }

    public static void d() {
        u6 u6Var = c;
        if (u6Var != null) {
            io1.b.removeCallbacks(u6Var);
        }
        c = null;
    }

    public static ArrayList e(qi3 qi3Var) {
        j02 j02VarG0 = gb.g0(0, qi3Var.Q0());
        ArrayList arrayList = new ArrayList(r40.k0(j02VarG0, 10));
        Iterator it = j02VarG0.iterator();
        while (((i02) it).p) {
            arrayList.add(qi3Var.Y(((b02) it).nextInt()));
        }
        return arrayList;
    }

    public static Map f(SmartSession smartSession) {
        k62 k62Var;
        Iterator<T> it = smartSession.getOriginal().iterator();
        do {
            if (!it.hasNext()) {
                k62Var = null;
                break;
            }
            String str = (String) it.next();
            rs1 rs1Var = rs1.a;
            String strMediaId = SmartContexts.INSTANCE.mediaId(str);
            strMediaId.getClass();
            k62Var = (k62) rs1.o.get(strMediaId);
        } while (k62Var == null);
        if (k62Var == null) {
            return v01.n;
        }
        Set<String> setRecIds = smartSession.recIds();
        int iW = lg2.W(r40.k0(setRecIds, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj : setRecIds) {
            linkedHashMap.put(obj, k62Var);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void g(qi3 qi3Var) {
        Child childN;
        SmartSession smartSession = b;
        if (smartSession == null) {
            return;
        }
        b = null;
        d();
        c();
        ao2 ao2Var = (ao2) a.get();
        if (ao2Var == null) {
            return;
        }
        ArrayList arrayListE = e(qi3Var);
        int iO0 = qi3Var.o0();
        if (iO0 < 0 || iO0 >= arrayListE.size()) {
            return;
        }
        int i = iO0 + 1;
        List<gn2> listU0 = q40.u0(arrayListE, i);
        SmartPlan smartPlan = SmartPlan.INSTANCE;
        ArrayList arrayList = new ArrayList(r40.k0(arrayListE, 10));
        int size = arrayListE.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListE.get(i2);
            i2++;
            gn2 gn2Var = (gn2) obj;
            String str = gn2Var.a;
            str.getClass();
            arrayList.add(new s11(str, smartSession.isRec(gn2Var.a)));
        }
        String strAnchor = smartPlan.anchor(arrayList, iO0, new q(1, smartSession, SmartSession.class, "isListed", "isListed(Ljava/lang/String;)Z", 0, 4));
        SmartPlan smartPlan2 = SmartPlan.INSTANCE;
        List<String> original = smartSession.getOriginal();
        ArrayList arrayList2 = new ArrayList(r40.k0(listU0, 10));
        for (gn2 gn2Var2 : listU0) {
            String str2 = gn2Var2.a;
            str2.getClass();
            arrayList2.add(new s11(str2, smartSession.isRec(gn2Var2.a)));
        }
        List<String> listRestore = smartPlan2.restore(original, arrayList2, strAnchor);
        int iW = lg2.W(r40.k0(listU0, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj2 : listU0) {
            linkedHashMap.put(((gn2) obj2).a, obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<String> it = listRestore.iterator();
        while (it.hasNext()) {
            gn2 gn2Var3 = (gn2) linkedHashMap.get(it.next());
            if (gn2Var3 != null && (childN = gi1.N(gn2Var3)) != null) {
                arrayList3.add(childN);
                arrayList4.add(gn2Var3);
            }
        }
        if (i < arrayListE.size()) {
            bo2.k(ao2Var, i, arrayListE.size());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        bo2.h(ao2Var, i, arrayList3, arrayList4);
    }

    public static qi3 h() {
        ao2 ao2Var;
        if (u52.c().a || (ao2Var = (ao2) a.get()) == null) {
            return null;
        }
        return ao2Var.b();
    }

    public static String i(qi3 qi3Var) {
        if (!xa3.u("homemusic_smart_shuffle_in_modes", true) || !cx.h()) {
            return null;
        }
        SmartContexts smartContexts = SmartContexts.INSTANCE;
        ArrayList arrayListE = e(qi3Var);
        ArrayList arrayList = new ArrayList(r40.k0(arrayListE, 10));
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            rs1 rs1Var = rs1.a;
            String str = ((gn2) obj).a;
            str.getClass();
            arrayList.add(rs1.c(str));
        }
        return smartContexts.dominant(arrayList);
    }

    public static final boolean j(qi3 qi3Var) {
        qi3Var.getClass();
        SmartSession smartSession = b;
        if (smartSession == null) {
            return false;
        }
        gn2 gn2VarA = qi3Var.a();
        String str = gn2VarA != null ? gn2VarA.a : null;
        return smartSession.isRec(str) || smartSession.isOwn(str);
    }

    public static void k(final Context context, final String str, final ArrayList arrayList, final SmartOut smartOut, final List list, final String str2, final int i) {
        Child childN;
        gn2 gn2VarA;
        if (str2 != null && i < 20) {
            qi3 qi3VarH = h();
            if (!h12.c((qi3VarH == null || (gn2VarA = qi3VarH.a()) == null) ? null : gn2VarA.a, str2)) {
                io1.b.postDelayed(new Runnable() { // from class: ys1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.k(context, str, arrayList, smartOut, list, str2, i + 1);
                    }
                }, 250L);
                return;
            }
        }
        d = false;
        ao2 ao2Var = (ao2) a.get();
        qi3 qi3VarH2 = h();
        String sessionId = smartOut.getSessionId();
        if (sessionId == null || qm4.u0(sessionId)) {
            sessionId = null;
        }
        if (ao2Var == null || qi3VarH2 == null || sessionId == null) {
            Toast.makeText(context, R.string.homemusic_smart_unavailable, 0).show();
        } else {
            ArrayList arrayListE = e(qi3VarH2);
            int iO0 = qi3VarH2.o0();
            if (iO0 >= 0 && iO0 < arrayListE.size()) {
                SmartContexts smartContexts = SmartContexts.INSTANCE;
                ArrayList arrayList2 = new ArrayList(r40.k0(arrayListE, 10));
                int size = arrayListE.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListE.get(i2);
                    i2++;
                    rs1 rs1Var = rs1.a;
                    String str3 = ((gn2) obj).a;
                    str3.getClass();
                    arrayList2.add(rs1.c(str3));
                }
                if (h12.c(smartContexts.dominant(arrayList2), str)) {
                    qi3VarH2.s(false);
                    gn2 gn2Var = (gn2) arrayListE.get(iO0);
                    int i3 = iO0 + 1;
                    List listU0 = q40.u0(arrayListE, i3);
                    int iW = lg2.W(r40.k0(listU0, 10));
                    if (iW < 16) {
                        iW = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                    for (Object obj2 : listU0) {
                        linkedHashMap.put(((gn2) obj2).a, obj2);
                    }
                    SmartSession smartSession = new SmartSession(sessionId, str, (String) e.get(str), arrayList);
                    SmartPlan smartPlan = SmartPlan.INSTANCE;
                    ArrayList arrayList3 = new ArrayList(r40.k0(listU0, 10));
                    Iterator it = listU0.iterator();
                    while (it.hasNext()) {
                        String str4 = ((gn2) it.next()).a;
                        str4.getClass();
                        arrayList3.add(str4);
                    }
                    List<String> own = smartOut.getOwn();
                    if (own == null) {
                        own = u01.n;
                    }
                    ArrayList arrayList4 = new ArrayList(r40.k0(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((dt1) it2.next()).a);
                    }
                    List<gg4> listBuild = smartPlan.build(arrayList3, own, arrayList4, gn2Var.a);
                    int iW2 = lg2.W(r40.k0(list, 10));
                    if (iW2 < 16) {
                        iW2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW2);
                    for (Object obj3 : list) {
                        linkedHashMap2.put(((dt1) obj3).a.getQueueId(), obj3);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (gg4 gg4Var : listBuild) {
                        SmartRec smartRec = gg4Var.b;
                        String str5 = gg4Var.a;
                        dt1 dt1Var = smartRec != null ? (dt1) linkedHashMap2.get(str5) : null;
                        if (dt1Var != null) {
                            arrayList5.add(dt1Var.b);
                            arrayList6.add(dt1Var.c);
                        } else {
                            gn2 gn2Var2 = (gn2) linkedHashMap.get(str5);
                            if (gn2Var2 != null && (childN = gi1.N(gn2Var2)) != null) {
                                arrayList5.add(childN);
                                arrayList6.add(gn2Var2);
                            }
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it3 = listBuild.iterator();
                    while (it3.hasNext()) {
                        SmartRec smartRec2 = ((gg4) it3.next()).b;
                        if (smartRec2 != null) {
                            arrayList7.add(smartRec2);
                        }
                    }
                    List<String> listRegister = smartSession.register(arrayList7);
                    d();
                    b = smartSession;
                    rs1 rs1Var2 = rs1.a;
                    int iW3 = lg2.W(r40.k0(listRegister, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iW3 >= 16 ? iW3 : 16);
                    for (Object obj4 : listRegister) {
                        linkedHashMap3.put(obj4, smartSession.getRecContext());
                    }
                    rs1.b(linkedHashMap3, f(smartSession));
                    if (i3 < arrayListE.size()) {
                        bo2.k(ao2Var, i3, arrayListE.size());
                    }
                    bo2.h(ao2Var, i3, arrayList5, arrayList6);
                    Log.i("HubSmart", "start " + smartSession.getId() + ": " + arrayList5.size() + " entries after the playing one, " + listRegister.size() + " recommendations (was " + listU0.size() + ")");
                }
            }
        }
        c();
    }

    public static ArrayList l(List list) {
        gn2 gn2Var;
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SmartRec) it.next()).item(null));
        }
        ExecutorService executorService = ms1.a;
        ArrayList arrayListB = ms1.b(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            Child child = (Child) obj;
            dt1 dt1Var = (child == null || (gn2Var = (gn2) q40.x0(gi1.M(gb.O(child)))) == null) ? null : new dt1((SmartRec) list.get(i), child, gn2Var);
            if (dt1Var != null) {
                arrayList2.add(dt1Var);
            }
            i = i3;
        }
        return arrayList2;
    }

    public static final void m(MainActivity mainActivity, String str, String str2, List list, Runnable runnable) {
        mainActivity.getClass();
        list.getClass();
        if (list.isEmpty() || !SmartContexts.INSTANCE.offered(str) || !xa3.u("homemusic_smart_shuffle_in_modes", true) || !xa3.u("homemusic_smart_shuffle_chosen", false) || u52.c().a) {
            runnable.run();
            return;
        }
        if (!cx.h()) {
            Toast.makeText(mainActivity, R.string.homemusic_smart_offline, 0).show();
            runnable.run();
            return;
        }
        if (d) {
            return;
        }
        if (str2 != null && !qm4.u0(str2)) {
            e.put(str, str2);
        }
        ju3 ju3Var = ku3.n;
        if (list.isEmpty()) {
            kf2.m("Collection is empty.");
            return;
        }
        Child child = (Child) list.get(ku3.o.a(list.size()));
        List listO = gb.O(child);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Child) obj) != child) {
                arrayList.add(obj);
            }
        }
        List listS0 = q40.S0(arrayList);
        Collections.shuffle(listS0);
        List listL0 = q40.L0(q40.G0(listO, listS0), SmartPlan.MAX_QUEUE);
        ud3.x0(false);
        qi3 qi3VarH = h();
        if (qi3VarH != null) {
            qi3VarH.s(false);
        }
        bo2.q(mainActivity.P, listL0, 0, str);
        ((au) mainActivity.V.n).d(true);
        String str3 = str.equals(SmartContexts.LIKED) ? "liked_page" : "playlist_page";
        ArrayList arrayList2 = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(SmartContexts.INSTANCE.hubId(((Child) it.next()).getId()));
        }
        String id = child.getId();
        String id2 = child.getId();
        Context applicationContext = mainActivity.getApplicationContext();
        Toast.makeText(applicationContext, R.string.homemusic_smart_starting, 1).show();
        d = true;
        c();
        io1.a.execute(new up(str, arrayList2, id, str3, applicationContext, id2));
    }
}
