package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import app.homemusic.R;
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
import defpackage.ys1;
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
    public static WeakReference a;
    public static SmartSession b;
    public static u6 c;
    public static boolean d;
    public static final HashMap e = null;
    public static final k03 f = null;

    static {
        a = new WeakReference(null);
        e = new HashMap();
        f = new k03(0L);
    }

    public static final CharSequence a(String r1, String r2) {
        if (r1 != null) goto L4;
        return r1;
    L4:
        if (r1.length() == 0) goto L15;
        SmartSession r0 = b;
        if (r0 != null) goto L9;
        return r1;
    L9:
        if (r0.isRec(r2) == true) goto L11;
        return r1;
    L11:
        return "✨ " + r1;
    L15:
        return r1;
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
    public static void b() {
        SmartSession r2 = b;
        if (r2 != null) goto L6;
        return;
    L6:
        if (r2.getInFlight() == false) goto L9;
        r2.setAgain(true);
        return;
    L9:
        qi3 r0 = h();
        String r9 = null;
        if (r0 != null) goto L13;
    L20:
        r0 = null;
    L21:
        if (r0 != null) goto L23;
        return;
    L23:
        d();
        SmartPlan r10 = SmartPlan.INSTANCE;
        ArrayList r1 = e(r0);
        ArrayList r11 = new ArrayList(r40.k0(r1, 10));
        int r3 = r1.size();
        int r4 = 0;
    L24:
        if (r4 >= r3) goto L26;
        Object r5 = r1.get(r4);
        r4 = r4 + 1;
        gn2 r6 = (gn2) r5;
        String r7 = r6.a;
        r7.getClass();
        r11.add(new s11(r7, r2.isRec(r6.a)));
        goto L24
    L26:
        String r8 = r10.anchor(r11, r0.o0(), new q(1, r2, SmartSession.class, "isListed", "isListed(Ljava/lang/String;)Z", 0, 5));
        if (r8 == null) goto L29;
        r9 = SmartContexts.INSTANCE.hubId(r8);
    L29:
        SmartNextIn r12 = r2.snapshot(r9);
        String r13 = r2.getId();
        r2.setInFlight(true);
        r2.setAgain(false);
        io1.a.execute(new v6(r12, r13, r2, 17));
        return;
    L13:
        if (j(r0) == true) goto L16;
        r0 = null;
    L16:
        if (r0 == null) goto L20;
        if (b != r2) goto L20;
        goto L20
    }

    public static void c() {
        k03 r0 = f;
        Long r1 = (Long) r0.d();
        if (r1 == null) goto L5;
        long r2 = r1.longValue();
    L6:
        r0.k(Long.valueOf(r2 + 1));
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public static void d() {
        u6 r0 = c;
        if (r0 == null) goto L5;
        io1.b.removeCallbacks(r0);
    L5:
        c = null;
    }

    public static ArrayList e(qi3 r3) {
        j02 r0 = gb.g0(0, r3.Q0());
        ArrayList r1 = new ArrayList(r40.k0(r0, 10));
        Iterator r2 = r0.iterator();
    L4:
        if (((i02) r2).p == false) goto L6;
        r1.add(r3.Y(((b02) r2).nextInt()));
        goto L4
    L6:
        return r1;
    }

    public static Map f(SmartSession r4) {
        Iterator<T> r0 = r4.getOriginal().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        String r1 = (String) r0.next();
        rs1 r2 = rs1.a;
        String r3 = SmartContexts.INSTANCE.mediaId(r1);
        r3.getClass();
        k62 r5 = (k62) rs1.o.get(r3);
        if (r5 == null) goto L4;
    L9:
        if (r5 == null) goto L11;
        Set<String> r6 = r4.recIds();
        int r7 = lg2.W(r40.k0(r6, 10));
        if (r7 >= 16) goto L15;
        r7 = 16;
    L15:
        LinkedHashMap r8 = new LinkedHashMap(r7);
        Iterator<T> r9 = r6.iterator();
    L17:
        if (r9.hasNext() == false) goto L19;
        Object r10 = r9.next();
        String r11 = (String) r10;
        r8.put(r10, r5);
        goto L17
    L19:
        return r8;
    L11:
        return v01.n;
    L8:
        r5 = null;
        goto L9
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
    public static void g(qi3 r15) {
        SmartSession r2 = b;
        if (r2 == null) goto L56;
        b = null;
        d();
        c();
        ao2 r8 = (ao2) a.get();
        if (r8 == null) goto L57;
        ArrayList r9 = e(r15);
        int r16 = r15.o0();
        if (r16 >= 0) goto L11;
        return;
    L11:
        if (r16 >= r9.size()) goto L54;
        int r10 = r16 + 1;
        List r11 = q40.u0(r9, r10);
        SmartPlan r12 = SmartPlan.INSTANCE;
        ArrayList r13 = new ArrayList(r40.k0(r9, 10));
        int r0 = r9.size();
        int r1 = 0;
    L13:
        if (r1 >= r0) goto L15;
        Object r3 = r9.get(r1);
        r1 = r1 + 1;
        gn2 r4 = (gn2) r3;
        String r5 = r4.a;
        r5.getClass();
        r13.add(new s11(r5, r2.isRec(r4.a)));
        goto L13
    L15:
        String r17 = r12.anchor(r13, r16, new q(1, r2, SmartSession.class, "isListed", "isListed(Ljava/lang/String;)Z", 0, 4));
        SmartPlan r6 = SmartPlan.INSTANCE;
        List<String> r7 = r2.getOriginal();
        ArrayList r14 = new ArrayList(r40.k0(r11, 10));
        Iterator r18 = r11.iterator();
    L17:
        if (r18.hasNext() == false) goto L19;
        gn2 r19 = (gn2) r18.next();
        String r20 = r19.a;
        r20.getClass();
        r14.add(new s11(r20, r2.isRec(r19.a)));
        goto L17
    L19:
        List<String> r110 = r6.restore(r7, r14, r17);
        int r21 = lg2.W(r40.k0(r11, 10));
        if (r21 >= 16) goto L22;
        r21 = 16;
    L22:
        LinkedHashMap r22 = new LinkedHashMap(r21);
        Iterator r23 = r11.iterator();
    L24:
        if (r23.hasNext() == false) goto L26;
        Object r24 = r23.next();
        r22.put(((gn2) r24).a, r24);
        goto L24
    L26:
        ArrayList r25 = new ArrayList();
        ArrayList r26 = new ArrayList();
        Iterator<String> r111 = r110.iterator();
    L28:
        if (r111.hasNext() == false) goto L37;
        gn2 r27 = (gn2) r22.get(r111.next());
        if (r27 == null) goto L28;
        Child r28 = gi1.N(r27);
        if (r28 == null) goto L28;
        r25.add(r28);
        r26.add(r27);
        goto L28
    L37:
        if (r10 >= r9.size()) goto L40;
        bo2.k(r8, r10, r9.size());
    L40:
        if (r25.isEmpty() == true) goto L55;
        bo2.h(r8, r10, r25, r26);
        return;
    L55:
        return;
    L54:
        return;
    L57:
        return;
    }

    public static qi3 h() {
        if (u52.c().a == true) goto L11;
        ao2 r0 = (ao2) a.get();
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.b();
    L11:
        return null;
    }

    public static String i(qi3 r6) {
        if (xa3.u("homemusic_smart_shuffle_in_modes", true) == true) goto L5;
        return null;
    L5:
        if (cx.h() == false) goto L15;
        SmartContexts r0 = SmartContexts.INSTANCE;
        ArrayList r7 = e(r6);
        ArrayList r1 = new ArrayList(r40.k0(r7, 10));
        int r2 = r7.size();
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L11;
        Object r4 = r7.get(r3);
        r3 = r3 + 1;
        rs1 r5 = rs1.a;
        String r8 = ((gn2) r4).a;
        r8.getClass();
        r1.add(rs1.c(r8));
        goto L8
    L11:
        return r0.dominant(r1);
    L15:
        return null;
    }

    public static final boolean j(qi3 r3) {
        r3.getClass();
        SmartSession r0 = b;
        if (r0 != null) goto L5;
        return false;
    L5:
        gn2 r4 = r3.a();
        if (r4 == null) goto L8;
        String r5 = r4.a;
    L10:
        if (r0.isRec(r5) == false) goto L12;
        return true;
    L12:
        if (r0.isOwn(r5) == true) goto L17;
        return false;
    L17:
        return true;
    L8:
        r5 = null;
        goto L10
    }

    public static void k(final Context r17, final String r18, final ArrayList r19, final SmartOut r20, final List r21, final String r22, final int r23) {
        if (r22 != null) goto L5;
    L16:
        d = false;
        ao2 r3 = (ao2) a.get();
        qi3 r4 = h();
        String r6 = r20.getSessionId();
        if (r6 != null) goto L19;
    L21:
        r6 = null;
    L22:
        if (r3 == null) goto L95;
        if (r4 == null) goto L95;
        if (r6 == null) goto L95;
        ArrayList r7 = e(r4);
        int r8 = r4.o0();
        if (r8 >= 0) goto L29;
    L96:
        c();
        return;
    L29:
        if (r8 >= r7.size()) goto L96;
        SmartContexts r9 = SmartContexts.INSTANCE;
        ArrayList r10 = new ArrayList(r40.k0(r7, 10));
        int r12 = r7.size();
        int r13 = 0;
    L31:
        if (r13 >= r12) goto L34;
        Object r14 = r7.get(r13);
        r13 = r13 + 1;
        rs1 r15 = rs1.a;
        String r16 = ((gn2) r14).a;
        r16.getClass();
        r10.add(rs1.c(r16));
        goto L31
    L34:
        if (h12.c(r9.dominant(r10), r18) == false) goto L96;
        r4.s(false);
        gn2 r1 = (gn2) r7.get(r8);
        int r11 = r8 + 1;
        List r5 = q40.u0(r7, r11);
        int r24 = lg2.W(r40.k0(r5, 10));
        int r110 = 16;
        if (r24 >= 16) goto L39;
        r24 = 16;
    L39:
        LinkedHashMap r111 = new LinkedHashMap(r24);
        Iterator r25 = r5.iterator();
    L41:
        if (r25.hasNext() == false) goto L43;
        Object r112 = r25.next();
        r111.put(((gn2) r112).a, r112);
        goto L41
    L43:
        SmartSession r26 = new SmartSession(r6, r18, (String) e.get(r18), r19);
        SmartPlan r2 = SmartPlan.INSTANCE;
        ArrayList r27 = new ArrayList(r40.k0(r5, 10));
        Iterator r113 = r5.iterator();
    L45:
        if (r113.hasNext() == false) goto L47;
        String r114 = ((gn2) r113.next()).a;
        r114.getClass();
        r27.add(r114);
        goto L45
    L47:
        List<String> r115 = r20.getOwn();
        if (r115 != null) goto L50;
        r115 = u01.n;
    L50:
        ArrayList r116 = new ArrayList(r40.k0(r21, 10));
        Iterator r117 = r21.iterator();
    L52:
        if (r117.hasNext() == false) goto L54;
        r116.add(((dt1) r117.next()).a);
        goto L52
    L54:
        List<gg4> r0 = r2.build(r27, r115, r116, r1.a);
        int r28 = lg2.W(r40.k0(r21, 10));
        if (r28 >= 16) goto L57;
        r28 = 16;
    L57:
        LinkedHashMap r29 = new LinkedHashMap(r28);
        Iterator r30 = r21.iterator();
    L59:
        if (r30.hasNext() == false) goto L61;
        Object r31 = r30.next();
        r29.put(((dt1) r31).a.getQueueId(), r31);
        goto L59
    L61:
        ArrayList r32 = new ArrayList();
        ArrayList r33 = new ArrayList();
        Iterator<gg4> r34 = r0.iterator();
    L63:
        if (r34.hasNext() == false) goto L77;
        gg4 r118 = r34.next();
        SmartRec r119 = r118.b;
        String r120 = r118.a;
        if (r119 == null) goto L67;
        dt1 r121 = (dt1) r29.get(r120);
    L68:
        if (r121 != null) goto L69;
        gn2 r122 = (gn2) r111.get(r120);
        if (r122 == null) goto L63;
        Child r123 = gi1.N(r122);
        if (r123 == null) goto L63;
        r32.add(r123);
        r33.add(r122);
        goto L63
    L69:
        r32.add(r121.b);
        r33.add(r121.c);
        goto L63
    L67:
        r121 = null;
        goto L68
    L77:
        ArrayList r35 = new ArrayList();
        Iterator<T> r36 = r0.iterator();
    L79:
        if (r36.hasNext() == false) goto L83;
        SmartRec r37 = ((gg4) r36.next()).b;
        if (r37 == null) goto L79;
        r35.add(r37);
        goto L79
    L83:
        List<String> r38 = r26.register(r35);
        d();
        b = r26;
        rs1 r39 = rs1.a;
        int r40 = lg2.W(r40.k0(r38, 10));
        if (r40 < 16) goto L87;
        r110 = r40;
    L87:
        LinkedHashMap r41 = new LinkedHashMap(r110);
        Iterator<T> r42 = r38.iterator();
    L89:
        if (r42.hasNext() == false) goto L91;
        Object r124 = r42.next();
        String r125 = (String) r124;
        r41.put(r124, r26.getRecContext());
        goto L89
    L91:
        rs1.b(r41, f(r26));
        if (r11 >= r7.size()) goto L94;
        bo2.k(r3, r11, r7.size());
    L94:
        bo2.h(r3, r11, r32, r33);
        Log.i("HubSmart", "start " + r26.getId() + ": " + r32.size() + " entries after the playing one, " + r38.size() + " recommendations (was " + r5.size() + ")");
    L95:
        Toast.makeText(r17, R.string.homemusic_smart_unavailable, 0).show();
        goto L96
    L19:
        if (qm4.u0(r6) == true) goto L21;
    L5:
        if (r23 >= 20) goto L16;
        qi3 r43 = h();
        if (r43 == null) goto L11;
        gn2 r44 = r43.a();
        if (r44 == null) goto L11;
        String r45 = r44.a;
    L13:
        if (h12.c(r45, r22) == true) goto L16;
        io1.b.postDelayed(new ys1(r17, r18, r19, r20, r21, r22, r23), 250);
        return;
    L11:
        r45 = null;
        goto L13
    }

    public static ArrayList l(List r10) {
        ArrayList r0 = new ArrayList(r40.k0(r10, 10));
        Iterator r1 = r10.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r0.add(((SmartRec) r1.next()).item(null));
        goto L4
    L6:
        ExecutorService r2 = ms1.a;
        ArrayList r3 = ms1.b(r0);
        ArrayList r4 = new ArrayList();
        int r5 = r3.size();
        int r6 = 0;
        int r7 = 0;
    L7:
        if (r7 >= r5) goto L22;
        Object r8 = r3.get(r7);
        r7 = r7 + 1;
        int r9 = r6 + 1;
        if (r6 < 0) goto L20;
        Child r11 = (Child) r8;
        if (r11 != null) goto L13;
    L12:
        dt1 r12 = null;
    L17:
        if (r12 == null) goto L19;
        r4.add(r12);
    L19:
        r6 = r9;
        goto L7
    L13:
        gn2 r13 = (gn2) q40.x0(gi1.M(gb.O(r11)));
        if (r13 == null) goto L12;
        r12 = new dt1((SmartRec) r10.get(r6), r11, r13);
        goto L17
    L20:
        gb.c0();
        throw null;
    L22:
        return r4;
    }

    public static final void m(MainActivity r9, String r10, String r11, List r12, Runnable r13) {
        r9.getClass();
        r12.getClass();
        if (r12.isEmpty() == false) goto L5;
    L49:
        r13.run();
        return;
    L5:
        if (SmartContexts.INSTANCE.offered(r10) == false) goto L49;
        if (xa3.u("homemusic_smart_shuffle_in_modes", true) == false) goto L49;
        if (xa3.u("homemusic_smart_shuffle_chosen", false) == false) goto L49;
        if (u52.c().a == true) goto L49;
        if (cx.h() == true) goto L18;
        Toast.makeText(r9, R.string.homemusic_smart_offline, 0).show();
        r13.run();
        return;
    L18:
        if (d == false) goto L20;
        return;
    L20:
        if (r11 != null) goto L22;
    L25:
        ju3 r14 = ku3.n;
        if (r12.isEmpty() == true) goto L47;
        int r15 = r12.size();
        Child r16 = (Child) r12.get(ku3.o.a(r15));
        List r17 = gb.O(r16);
        ArrayList r0 = new ArrayList();
        Iterator r3 = r12.iterator();
    L29:
        if (r3.hasNext() == false) goto L33;
        Object r4 = r3.next();
        if (((Child) r4) == r16) goto L29;
        r0.add(r4);
        goto L29
    L33:
        List r1 = q40.S0(r0);
        Collections.shuffle(r1);
        List r18 = q40.L0(q40.G0(r17, r1), SmartPlan.MAX_QUEUE);
        ud3.x0(false);
        qi3 r2 = h();
        if (r2 == null) goto L36;
        r2.s(false);
    L36:
        bo2.q(r9.P, r18, 0, r10);
        ((au) r9.V.n).d(true);
        if (r10.equals(SmartContexts.LIKED) == false) goto L40;
        String r19 = "liked_page";
    L39:
        String r6 = r19;
        ArrayList r5 = new ArrayList(r40.k0(r12, 10));
        Iterator r110 = r12.iterator();
    L43:
        if (r110.hasNext() == false) goto L45;
        Child r111 = (Child) r110.next();
        r5.add(SmartContexts.INSTANCE.hubId(r111.getId()));
        goto L43
    L45:
        String r7 = r16.getId();
        String r8 = r16.getId();
        Context r20 = r9.getApplicationContext();
        Toast.makeText(r20, R.string.homemusic_smart_starting, 1).show();
        d = true;
        c();
        io1.a.execute(new up(r10, r5, r7, r6, r20, r8));
        return;
    L40:
        r19 = "playlist_page";
        goto L39
    L47:
        kf2.m("Collection is empty.");
        return;
    L22:
        if (qm4.u0(r11) == true) goto L25;
        e.put(r10, r11);
        goto L25
    }
}
