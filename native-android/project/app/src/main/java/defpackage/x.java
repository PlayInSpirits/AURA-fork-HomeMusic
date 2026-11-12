package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.text.Editable;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ x(zg5 r1, pu0 r2, fx3 r3) {
        this.n = 11;
        this.o = r3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r13) {
        boolean r1 = true;
        Object r2 = null;
        Integer r3 = null;
        int r4 = 0;
        switch(this.n) {
            case 0: goto L207;
            case 1: goto L196;
            case 2: goto L176;
            case 3: goto L175;
            case 4: goto L156;
            case 5: goto L155;
            case 6: goto L153;
            case 7: goto L147;
            case 8: goto L143;
            case 9: goto L141;
            case 10: goto L130;
            case 11: goto L121;
            case 12: goto L119;
            case 13: goto L115;
            case 14: goto L110;
            case 15: goto L105;
            case 16: goto L75;
            case 17: goto L73;
            case 18: goto L71;
            case 19: goto L69;
            case 20: goto L45;
            case 21: goto L43;
            case 22: goto L41;
            case 23: goto L36;
            case 24: goto L35;
            case 25: goto L32;
            case 26: goto L30;
            case 27: goto L24;
            case 28: goto L6;
            default: goto L5;
        };
    L6:
        PlayEvent r12 = (PlayEvent) this.o;
        PlayEvent r14 = (PlayEvent) r13;
        r14.getClass();
        if (h12.c(r14.getKind(), "progress") == true) goto L9;
    L21:
        r1 = false;
    L23:
        return Boolean.valueOf(r1);
    L9:
        if (h12.c(r14.getPlaybackId(), r12.getPlaybackId()) == false) goto L21;
        if (h12.c(r14.getDeviceId(), r12.getDeviceId()) == false) goto L21;
        if (h12.c(r14.getAccount(), r12.getAccount()) == false) goto L21;
        if (qm4.J0(15, r14.getTs()).equals(qm4.J0(15, r12.getTs())) == false) goto L21;
        if (r14.getListenedMs() == null) goto L21;
        if (r14.getListenedMs().longValue() > r12.getListenedMs().longValue()) goto L21;
    L24:
        gd3 r15 = (gd3) this.o;
        float r16 = ((Float) r13).floatValue();
        lm0 r17 = r15.b;
        if (r17.p() == 0) goto L27;
        float r18 = r16 / r17.p();
    L28:
        r17.q.h(r17.j(r17.k() + ji2.L(r18)));
        return j15.a;
    L27:
        r18 = 0.0f;
        goto L28
    L30:
        ((q03) this.o).a((bx2) r13);
        return Boolean.TRUE;
    L32:
        Throwable r19 = (Throwable) r13;
        ((n13) this.o).f(null);
        return j15.a;
    L36:
        x44 r110 = (x44) this.o;
        if (r110 == null) goto L40;
        r1 = r110.b(r13);
    L40:
        return Boolean.valueOf(r1);
    L41:
        yr0 r111 = (yr0) r13;
        return new a82(2, (l82) this.o);
    L43:
        yr0 r112 = (yr0) r13;
        return new a82(r4, (b82) this.o);
    L45:
        h62 r113 = (h62) this.o;
        v52 r114 = (v52) r13;
        Preference r0 = r113.B0;
        if (r0 == null) goto L67;
        r0.A(r114.a);
        Preference r5 = r113.C0;
        if (r5 == null) goto L65;
        r5.A(r114.a);
        Preference r6 = r113.B0;
        if (r6 == null) goto L63;
        boolean r7 = r114.b;
        String r8 = r114.c;
        if (r7 == true) goto L61;
        int r115 = r114.r;
        Integer r9 = Integer.valueOf(r115);
        if (r115 == 0) goto L57;
        r3 = r9;
    L57:
        if (r3 == null) goto L59;
        int r116 = r3.intValue();
    L60:
        r8 = r113.t(R.string.lan_device_status, new Object[]{r8, r113.s(r116)});
        r8.getClass();
        goto L61
    L59:
        r116 = R.string.lan_connecting;
    L61:
        r6.x(r8);
        return j15.a;
    L63:
        h12.Q("controlledDevice");
        throw null;
    L65:
        h12.Q("releaseControl");
        throw null;
    L67:
        h12.Q("controlledDevice");
        throw null;
    L69:
        qi3 r117 = (qi3) this.o;
        int r118 = ((Integer) r13).intValue();
        boolean r10 = LanReceiverService.y;
        String r119 = r117.Y(r118).a;
        r119.getClass();
        return r119;
    L71:
        String r120 = (String) r13;
        ((IndexFragment) this.o).h0();
        return j15.a;
    L73:
        ml3 r121 = ((b) this.o).h.b;
        return ((s24) r121.a).i().a(new String[]{"playlist", "pinned_playlist"}, new il3(r121, (String) r13, r4));
    L75:
        fo1 r11 = (fo1) this.o;
        Iterable r122 = (List) r13;
        if (r122 != null) goto L78;
        r122 = u01.n;
    L78:
        r11.j = r122;
        uc1 r123 = (uc1) r11.c;
        TextInputEditText r20 = r123.z;
        TextInputEditText r21 = r123.r;
        Iterator r22 = r122.iterator();
        if (r22.hasNext() == false) goto L90;
        r2 = r22.next();
        if (r22.hasNext() == false) goto L90;
        long r124 = ((Server) r2).getTimestamp();
    L85:
        Object r23 = r22.next();
        long r24 = ((Server) r23).getTimestamp();
        if (r124 >= r24) goto L89;
        r2 = r23;
        r124 = r24;
    L89:
        if (r22.hasNext() == true) goto L85;
    L90:
        Server r25 = (Server) r2;
        if (r25 == null) goto L104;
        if (((co1) r11.d) == co1.n) goto L96;
    L98:
        Editable r125 = r20.getText();
        if (r125 != null) goto L101;
    L102:
        r20.setText(r25.getUsername());
        goto L104
    L101:
        if (r125.length() != 0) goto L104;
    L96:
        if (String.valueOf(r21.getText()).equals("http://192.168.1.129:4533") == false) goto L98;
        r21.setText(r25.getAddress());
    L104:
        return j15.a;
    L105:
        gk1 r126 = (gk1) this.o;
        i35 r127 = (i35) r13;
        r126.g(r127);
        if1 r128 = r126.i;
        if (r128 == null) goto L109;
        r128.invoke(r127);
    L109:
        return j15.a;
    L110:
        vj1 r129 = (vj1) this.o;
        sv0 r130 = (sv0) r13;
        jz r26 = r130.O().g();
        wf1 r131 = r129.q;
        if (r131 == null) goto L114;
        r131.invoke(r26, (sj1) r130.O().p);
    L114:
        return j15.a;
    L115:
        aw r132 = (aw) this.o;
        j15 r133 = j15.a;
        if (zi1.b.compareAndSet(false, true) == false) goto L118;
        r132.d(r133);
    L118:
        return r133;
    L119:
        m05 r134 = (m05) r13;
        return ((ia1) this.o).a(new m05(null, r134.b, r134.c, r134.d, r134.e)).n;
    L121:
        fx3 r135 = (fx3) this.o;
        pu0 r136 = (pu0) r13;
        if (r136.A == true) goto L125;
        return qx4.o;
    L125:
        if (r136.C == null) goto L128;
        cz1.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
    L128:
        r136.C = null;
        r135.n = r135.n;
        return qx4.n;
    L130:
        qx4 r27 = qx4.n;
        zg5 r137 = (zg5) this.o;
        pu0 r138 = (pu0) r13;
        if (r138.n.A == false) goto L221;
        pu0 r28 = r138.C;
        if (r28 == null) goto L139;
        x r29 = new x(10, r137);
        if (r29.invoke(r28) != r27) goto L139;
        gh0.J(r28, r29);
    L139:
        r138.C = null;
        r138.B = null;
        return r27;
    L221:
        return qx4.o;
    L141:
        ed5 r139 = (ed5) this.o;
        ((x34) r13).getClass();
        return r139.call();
    L143:
        h80 r140 = (h80) this.o;
        mf3 r141 = (mf3) r13;
        vc r142 = r140.w;
        if (r142 != null) goto L222;
        vc r143 = new vc(r140.a);
        r140.w = r143;
        return r143;
    L222:
        return r142;
    L147:
        CancellationSignal r144 = (CancellationSignal) this.o;
        if (((Throwable) r13) == null) goto L151;
        r144.cancel();
    L151:
        return j15.a;
    L156:
        af2 r30 = (af2) r13;
        ra r145 = ((ma) this.o).C;
        if (r145.getInsetsListener().t.g() <= 0) goto L173;
        i03 r146 = yb5.a;
        r30.n = true;
        cf2 r147 = r30.q;
        q62 r31 = r147.e0();
        if (g02.a(r30.o, 9223372034707292159L) == false) goto L161;
        r30.o = ji2.K(r31.q(0));
        r30.p = r31.k();
    L161:
        r147.g0().R.b();
        long r32 = r31.k();
        w03 r148 = r145.getInsetsListener().s;
        int r33 = (int) (r32 >> 32);
        int r34 = (int) (r32 & 4294967295L);
        wb5[] r35 = yb5.b;
        int r36 = r35.length;
        int r37 = 0;
    L162:
        if (r37 >= r36) goto L167;
        wb5 r149 = r35[r37];
        Object r38 = r148.g(r149);
        r38.getClass();
        jc5 r150 = (jc5) r38;
        yb5.a(r30, ((xb5) r149).c, r150.h, r33, r34);
        if (((Boolean) r150.b.getValue()).booleanValue() == false) goto L166;
        yb5.a(r30, r150.f, r150.j, r33, r34);
        yb5.a(r30, r150.g, r150.k, r33, r34);
    L166:
        yb5.a(r30, ((xb5) r149).d, r150.i, r33, r34);
        r37 = r37 + 1;
        goto L162
    L167:
        q03 r151 = r145.getInsetsListener().u;
        if (r151.i() == false) goto L173;
        rh4 r152 = r145.getInsetsListener().v;
        Object[] r39 = r151.a;
        int r153 = r151.b;
    L170:
        if (r4 >= r153) goto L173;
        b13 r40 = (b13) r39[r4];
        jz1 r41 = (jz1) r152.get(r4);
        Rect r42 = (Rect) r40.getValue();
        r30.a(r41.b(), r42.left);
        r30.a(r41.d(), r42.top);
        r30.a(r41.c(), r42.right);
        r30.a(r41.a(), r42.bottom);
        r4 = r4 + 1;
    L173:
        return j15.a;
    L176:
        d72 r154 = (d72) this.o;
        k9 r155 = (k9) r13;
        if (r155.n() == Integer.MAX_VALUE) goto L195;
        if (r155.a().b == false) goto L182;
        r155.y();
    L182:
        Iterator r43 = r155.a().g.entrySet().iterator();
    L184:
        if (r43.hasNext() == false) goto L186;
        Map.Entry r44 = (Map.Entry) r43.next();
        r154.a((pp1) r44.getKey(), ((Number) r44.getValue()).intValue(), r155.c());
        goto L184
    L186:
        f63 r156 = r155.c().J;
        r156.getClass();
    L188:
        if (r156.equals(r154.a.c()) == true) goto L195;
        Iterator r45 = r154.b(r156).keySet().iterator();
    L191:
        if (r45.hasNext() == false) goto L193;
        pp1 r46 = (pp1) r45.next();
        r154.a(r46, r154.c(r156, r46), r156);
        goto L191
    L193:
        r156 = r156.J;
        r156.getClass();
    L195:
        return j15.a;
    L196:
        nf3 r157 = (nf3) this.o;
        Map.Entry r158 = (Map.Entry) r13;
        r158.getClass();
        StringBuilder r47 = new StringBuilder();
        Object r48 = r158.getKey();
        String r49 = "(this Map)";
        if (r48 != r157) goto L199;
        String r50 = "(this Map)";
    L200:
        r47.append(r50);
        r47.append('=');
        Object r159 = r158.getValue();
        if (r159 == r157) goto L204;
        r49 = String.valueOf(r159);
    L204:
        r47.append(r49);
        return r47.toString();
    L199:
        r50 = String.valueOf(r48);
        goto L200
    L5:
        return ((dl3) this.o).c.e((String) r13);
    L35:
        return ((ug2) this.o).b(((Integer) r13).intValue());
    L153:
        return Boolean.valueOf(xl.z((i94) r13, (Resources) this.o));
    L155:
        return Boolean.valueOf(((e02) this.o).a(((i94) r13).f));
    L175:
        return Boolean.valueOf(((ba1) r13).y0(((o91) this.o).a));
    L207:
        if (r13 != ((y) this.o)) goto L210;
        return "(this Collection)";
    L210:
        return String.valueOf(r13);
    }

    public /* synthetic */ x(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
    }

    public /* synthetic */ x(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
