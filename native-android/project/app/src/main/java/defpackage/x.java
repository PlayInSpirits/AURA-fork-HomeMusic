package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.text.Editable;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ x(zg5 zg5Var, pu0 pu0Var, fx3 fx3Var) {
        this.n = 11;
        this.o = fx3Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        Object next = null;
        int i = 0;
        switch (this.n) {
            case 0:
                return obj == ((y) this.o) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                nf3 nf3Var = (nf3) this.o;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == nf3Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != nf3Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                d72 d72Var = (d72) this.o;
                k9 k9Var = (k9) obj;
                if (k9Var.n() != Integer.MAX_VALUE) {
                    if (k9Var.a().b) {
                        k9Var.y();
                    }
                    for (Map.Entry entry2 : k9Var.a().g.entrySet()) {
                        d72Var.a((pp1) entry2.getKey(), ((Number) entry2.getValue()).intValue(), k9Var.c());
                    }
                    f63 f63Var = k9Var.c().J;
                    f63Var.getClass();
                    while (!f63Var.equals(d72Var.a.c())) {
                        for (pp1 pp1Var : d72Var.b(f63Var).keySet()) {
                            d72Var.a(pp1Var, d72Var.c(f63Var, pp1Var), f63Var);
                        }
                        f63Var = f63Var.J;
                        f63Var.getClass();
                    }
                }
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Boolean.valueOf(((ba1) obj).y0(((o91) this.o).a));
            case 4:
                af2 af2Var = (af2) obj;
                ra raVar = ((ma) this.o).C;
                if (raVar.getInsetsListener().t.g() > 0) {
                    i03 i03Var = yb5.a;
                    af2Var.n = true;
                    cf2 cf2Var = af2Var.q;
                    q62 q62VarE0 = cf2Var.e0();
                    if (g02.a(af2Var.o, 9223372034707292159L)) {
                        af2Var.o = ji2.K(q62VarE0.q(0L));
                        af2Var.p = q62VarE0.k();
                    }
                    cf2Var.g0().R.b();
                    long jK = q62VarE0.k();
                    w03 w03Var = raVar.getInsetsListener().s;
                    int i2 = (int) (jK >> 32);
                    int i3 = (int) (jK & 4294967295L);
                    for (wb5 wb5Var : yb5.b) {
                        Object objG = w03Var.g(wb5Var);
                        objG.getClass();
                        jc5 jc5Var = (jc5) objG;
                        yb5.a(af2Var, ((xb5) wb5Var).c, jc5Var.h, i2, i3);
                        if (((Boolean) jc5Var.b.getValue()).booleanValue()) {
                            yb5.a(af2Var, jc5Var.f, jc5Var.j, i2, i3);
                            yb5.a(af2Var, jc5Var.g, jc5Var.k, i2, i3);
                        }
                        yb5.a(af2Var, ((xb5) wb5Var).d, jc5Var.i, i2, i3);
                    }
                    q03 q03Var = raVar.getInsetsListener().u;
                    if (q03Var.i()) {
                        rh4 rh4Var = raVar.getInsetsListener().v;
                        Object[] objArr = q03Var.a;
                        int i4 = q03Var.b;
                        while (i < i4) {
                            b13 b13Var = (b13) objArr[i];
                            jz1 jz1Var = (jz1) rh4Var.get(i);
                            Rect rect = (Rect) b13Var.getValue();
                            af2Var.a(jz1Var.b(), rect.left);
                            af2Var.a(jz1Var.d(), rect.top);
                            af2Var.a(jz1Var.c(), rect.right);
                            af2Var.a(jz1Var.a(), rect.bottom);
                            i++;
                        }
                    }
                }
                return j15.a;
            case 5:
                return Boolean.valueOf(((e02) this.o).a(((i94) obj).f));
            case 6:
                return Boolean.valueOf(xl.z((i94) obj, (Resources) this.o));
            case 7:
                CancellationSignal cancellationSignal = (CancellationSignal) this.o;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return j15.a;
            case 8:
                h80 h80Var = (h80) this.o;
                vc vcVar = h80Var.w;
                if (vcVar != null) {
                    return vcVar;
                }
                vc vcVar2 = new vc(h80Var.a);
                h80Var.w = vcVar2;
                return vcVar2;
            case 9:
                ed5 ed5Var = (ed5) this.o;
                ((x34) obj).getClass();
                return ed5Var.call();
            case 10:
                qx4 qx4Var = qx4.n;
                zg5 zg5Var = (zg5) this.o;
                pu0 pu0Var = (pu0) obj;
                if (!pu0Var.n.A) {
                    return qx4.o;
                }
                pu0 pu0Var2 = pu0Var.C;
                if (pu0Var2 != null) {
                    x xVar = new x(10, zg5Var);
                    if (xVar.invoke(pu0Var2) == qx4Var) {
                        gh0.J(pu0Var2, xVar);
                    }
                }
                pu0Var.C = null;
                pu0Var.B = null;
                return qx4Var;
            case 11:
                fx3 fx3Var = (fx3) this.o;
                pu0 pu0Var3 = (pu0) obj;
                if (!pu0Var3.A) {
                    return qx4.o;
                }
                if (pu0Var3.C != null) {
                    cz1.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                pu0Var3.C = null;
                fx3Var.n = fx3Var.n;
                return qx4.n;
            case 12:
                m05 m05Var = (m05) obj;
                return ((ia1) this.o).a(new m05(null, m05Var.b, m05Var.c, m05Var.d, m05Var.e)).n;
            case 13:
                aw awVar = (aw) this.o;
                j15 j15Var = j15.a;
                if (zi1.b.compareAndSet(false, true)) {
                    awVar.d(j15Var);
                }
                return j15Var;
            case 14:
                vj1 vj1Var = (vj1) this.o;
                sv0 sv0Var = (sv0) obj;
                jz jzVarG = sv0Var.O().g();
                wf1 wf1Var = vj1Var.q;
                if (wf1Var != null) {
                    wf1Var.invoke(jzVarG, (sj1) sv0Var.O().p);
                }
                return j15.a;
            case 15:
                gk1 gk1Var = (gk1) this.o;
                i35 i35Var = (i35) obj;
                gk1Var.g(i35Var);
                if1 if1Var = gk1Var.i;
                if (if1Var != null) {
                    if1Var.invoke(i35Var);
                }
                return j15.a;
            case WaveRetry.MAX_FAILURES /* 16 */:
                fo1 fo1Var = (fo1) this.o;
                Iterable iterable = (List) obj;
                if (iterable == null) {
                    iterable = u01.n;
                }
                fo1Var.j = iterable;
                uc1 uc1Var = (uc1) fo1Var.c;
                TextInputEditText textInputEditText = uc1Var.z;
                TextInputEditText textInputEditText2 = uc1Var.r;
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long timestamp = ((Server) next).getTimestamp();
                        do {
                            Object next2 = it.next();
                            long timestamp2 = ((Server) next2).getTimestamp();
                            if (timestamp < timestamp2) {
                                next = next2;
                                timestamp = timestamp2;
                            }
                        } while (it.hasNext());
                    }
                }
                Server server = (Server) next;
                if (server != null) {
                    if (((co1) fo1Var.d) == co1.n && String.valueOf(textInputEditText2.getText()).equals("http://192.168.1.129:4533")) {
                        textInputEditText2.setText(server.getAddress());
                    }
                    Editable text = textInputEditText.getText();
                    if (text == null || text.length() == 0) {
                        textInputEditText.setText(server.getUsername());
                    }
                }
                return j15.a;
            case 17:
                ml3 ml3Var = ((b) this.o).h.b;
                return ((s24) ml3Var.a).i().a(new String[]{"playlist", "pinned_playlist"}, new il3(ml3Var, (String) obj, i));
            case 18:
                ((IndexFragment) this.o).h0();
                return j15.a;
            case 19:
                qi3 qi3Var = (qi3) this.o;
                int iIntValue = ((Integer) obj).intValue();
                boolean z = LanReceiverService.y;
                String str = qi3Var.Y(iIntValue).a;
                str.getClass();
                return str;
            case 20:
                h62 h62Var = (h62) this.o;
                v52 v52Var = (v52) obj;
                Preference preference = h62Var.B0;
                if (preference == null) {
                    h12.Q("controlledDevice");
                    throw null;
                }
                preference.A(v52Var.a);
                Preference preference2 = h62Var.C0;
                if (preference2 == null) {
                    h12.Q("releaseControl");
                    throw null;
                }
                preference2.A(v52Var.a);
                Preference preference3 = h62Var.B0;
                if (preference3 == null) {
                    h12.Q("controlledDevice");
                    throw null;
                }
                boolean z2 = v52Var.b;
                String strT = v52Var.c;
                if (!z2) {
                    int i5 = v52Var.r;
                    Integer numValueOf = i5 != 0 ? Integer.valueOf(i5) : null;
                    strT = h62Var.t(R.string.lan_device_status, strT, h62Var.s(numValueOf != null ? numValueOf.intValue() : R.string.lan_connecting));
                    strT.getClass();
                }
                preference3.x(strT);
                return j15.a;
            case 21:
                return new a82(i, (b82) this.o);
            case 22:
                return new a82(2, (l82) this.o);
            case 23:
                x44 x44Var = (x44) this.o;
                return Boolean.valueOf(x44Var != null ? x44Var.b(obj) : true);
            case 24:
                return ((ug2) this.o).b(((Integer) obj).intValue());
            case 25:
                ((n13) this.o).f(null);
                return j15.a;
            case 26:
                ((q03) this.o).a((bx2) obj);
                return Boolean.TRUE;
            case 27:
                gd3 gd3Var = (gd3) this.o;
                float fFloatValue = ((Float) obj).floatValue();
                lm0 lm0Var = gd3Var.b;
                lm0Var.q.h(lm0Var.j(lm0Var.k() + ji2.L(lm0Var.p() != 0 ? fFloatValue / lm0Var.p() : 0.0f)));
                return j15.a;
            case 28:
                PlayEvent playEvent = (PlayEvent) this.o;
                PlayEvent playEvent2 = (PlayEvent) obj;
                playEvent2.getClass();
                return Boolean.valueOf(h12.c(playEvent2.getKind(), "progress") && h12.c(playEvent2.getPlaybackId(), playEvent.getPlaybackId()) && h12.c(playEvent2.getDeviceId(), playEvent.getDeviceId()) && h12.c(playEvent2.getAccount(), playEvent.getAccount()) && qm4.J0(15, playEvent2.getTs()).equals(qm4.J0(15, playEvent.getTs())) && playEvent2.getListenedMs() != null && playEvent2.getListenedMs().longValue() <= playEvent.getListenedMs().longValue());
            default:
                return ((dl3) this.o).c.e((String) obj);
        }
    }

    public /* synthetic */ x(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
    }

    public /* synthetic */ x(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }
}
