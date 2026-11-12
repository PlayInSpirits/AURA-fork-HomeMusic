package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Server;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o54 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ o54(m24 m24Var) {
        this.n = 12;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        x40 x40Var;
        x40 x40Var2;
        Uri uri;
        int i = this.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                obj.getClass();
                return new pa2(((Integer) obj).intValue());
            case 1:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new p45(str);
            case 2:
                String str2 = obj != null ? (String) obj : null;
                str2.getClass();
                return new v25(str2);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                r54 r54Var = s54.q;
                Boolean bool = Boolean.FALSE;
                h12.c(obj2, bool);
                mr4 mr4Var = obj2 != null ? (mr4) r54Var.o.invoke(obj2) : null;
                mr4Var.getClass();
                int i2 = mr4Var.a;
                Object obj3 = list.get(1);
                r54 r54Var2 = s54.r;
                h12.c(obj3, bool);
                ur4 ur4Var = obj3 != null ? (ur4) r54Var2.o.invoke(obj3) : null;
                ur4Var.getClass();
                int i3 = ur4Var.a;
                Object obj4 = list.get(2);
                ct4[] ct4VarArr = bt4.b;
                r54 r54Var3 = s54.v;
                h12.c(obj4, bool);
                bt4 bt4Var = obj4 != null ? (bt4) r54Var3.o.invoke(obj4) : null;
                bt4Var.getClass();
                long j = bt4Var.a;
                Object obj5 = list.get(3);
                cs4 cs4Var = cs4.c;
                cs4 cs4Var2 = (h12.c(obj5, bool) || obj5 == null) ? null : (cs4) ((if1) s54.l.p).invoke(obj5);
                Object obj6 = list.get(4);
                zg3 zg3Var = (h12.c(obj6, bool) || obj6 == null) ? null : (zg3) ((if1) t54.a.p).invoke(obj6);
                Object obj7 = list.get(5);
                ra2 ra2Var = ra2.d;
                ra2 ra2Var2 = (h12.c(obj7, bool) || obj7 == null) ? null : (ra2) ((if1) s54.A.p).invoke(obj7);
                Object obj8 = list.get(6);
                ma2 ma2Var = (h12.c(obj8, bool) || obj8 == null) ? null : (ma2) ((if1) t54.c.p).invoke(obj8);
                ma2Var.getClass();
                int i4 = ma2Var.a;
                Object obj9 = list.get(7);
                r54 r54Var4 = s54.s;
                h12.c(obj9, bool);
                du1 du1Var = obj9 != null ? (du1) r54Var4.o.invoke(obj9) : null;
                du1Var.getClass();
                int i5 = du1Var.a;
                Object obj10 = list.get(8);
                return new sd3(i2, i3, j, cs4Var2, zg3Var, ra2Var2, i4, i5, (h12.c(obj10, bool) || obj10 == null) ? null : (qs4) ((if1) t54.d.p).invoke(obj10));
            case 4:
                obj.getClass();
                List list2 = (List) obj;
                Object obj11 = list2.get(0);
                int i6 = x40.h;
                Boolean bool2 = Boolean.FALSE;
                h12.c(obj11, bool2);
                if (obj11 != null) {
                    x40Var = obj11.equals(bool2) ? new x40(x40.g) : new x40(e35.b(((Integer) obj11).intValue()));
                } else {
                    x40Var = null;
                }
                x40Var.getClass();
                long j2 = x40Var.a;
                Object obj12 = list2.get(1);
                ct4[] ct4VarArr2 = bt4.b;
                if1 if1Var = s54.v.o;
                h12.c(obj12, bool2);
                bt4 bt4Var2 = obj12 != null ? (bt4) if1Var.invoke(obj12) : null;
                bt4Var2.getClass();
                long j3 = bt4Var2.a;
                Object obj13 = list2.get(2);
                gb1 gb1Var = gb1.o;
                gb1 gb1Var2 = (h12.c(obj13, bool2) || obj13 == null) ? null : (gb1) ((if1) s54.m.p).invoke(obj13);
                Object obj14 = list2.get(3);
                eb1 eb1Var = (h12.c(obj14, bool2) || obj14 == null) ? null : (eb1) ((if1) s54.t.p).invoke(obj14);
                Object obj15 = list2.get(4);
                fb1 fb1Var = (h12.c(obj15, bool2) || obj15 == null) ? null : (fb1) ((if1) s54.u.p).invoke(obj15);
                Object obj16 = list2.get(6);
                String str3 = obj16 != null ? (String) obj16 : null;
                Object obj17 = list2.get(7);
                h12.c(obj17, bool2);
                bt4 bt4Var3 = obj17 != null ? (bt4) if1Var.invoke(obj17) : null;
                bt4Var3.getClass();
                long j4 = bt4Var3.a;
                Object obj18 = list2.get(8);
                hr hrVar = (h12.c(obj18, bool2) || obj18 == null) ? null : (hr) ((if1) s54.n.p).invoke(obj18);
                Object obj19 = list2.get(9);
                bs4 bs4Var = (h12.c(obj19, bool2) || obj19 == null) ? null : (bs4) ((if1) s54.k.p).invoke(obj19);
                Object obj20 = list2.get(10);
                vd2 vd2Var = vd2.p;
                vd2 vd2Var2 = (h12.c(obj20, bool2) || obj20 == null) ? null : (vd2) ((if1) s54.y.p).invoke(obj20);
                Object obj21 = list2.get(11);
                h12.c(obj21, bool2);
                if (obj21 != null) {
                    x40Var2 = obj21.equals(bool2) ? new x40(x40.g) : new x40(e35.b(((Integer) obj21).intValue()));
                } else {
                    x40Var2 = null;
                }
                x40Var2.getClass();
                long j5 = x40Var2.a;
                Object obj22 = list2.get(12);
                sr4 sr4Var = (h12.c(obj22, bool2) || obj22 == null) ? null : (sr4) ((if1) s54.j.p).invoke(obj22);
                Object obj23 = list2.get(13);
                xb4 xb4Var = xb4.d;
                return new ij4(j2, j3, gb1Var2, eb1Var, fb1Var, (vk0) null, str3, j4, hrVar, bs4Var, vd2Var2, j5, sr4Var, (h12.c(obj23, bool2) || obj23 == null) ? null : (xb4) ((if1) s54.o.p).invoke(obj23), 49184);
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                Object obj24 = list3.get(0);
                Boolean bool3 = obj24 != null ? (Boolean) obj24 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj25 = list3.get(1);
                h01 h01Var = (h12.c(obj25, Boolean.FALSE) || obj25 == null) ? null : (h01) ((if1) t54.b.p).invoke(obj25);
                h01Var.getClass();
                return new zg3(h01Var.a, zBooleanValue);
            case 6:
                obj.getClass();
                return new h01(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                return new ma2(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list4 = (List) obj;
                Object obj26 = list4.get(0);
                ps4 ps4Var = (h12.c(obj26, Boolean.FALSE) || obj26 == null) ? null : (ps4) ((if1) t54.e.p).invoke(obj26);
                ps4Var.getClass();
                int i7 = ps4Var.a;
                Object obj27 = list4.get(1);
                Boolean bool4 = obj27 != null ? (Boolean) obj27 : null;
                bool4.getClass();
                return new qs4(i7, bool4.booleanValue());
            case 9:
                obj.getClass();
                return new ps4(((Integer) obj).intValue());
            case 10:
                return Integer.valueOf(((j64) obj).b);
            case 11:
                k02 k02Var = ((j64) obj).c;
                return Integer.valueOf(k02Var.d - k02Var.b);
            case 12:
                o94.a((q94) obj);
                return j15Var;
            case 13:
                return Boolean.valueOf(obj == null);
            case 14:
                z34 z34VarU = ((x34) obj).U("SELECT * FROM server");
                try {
                    int iE = rr2.E(z34VarU, "id");
                    int iE2 = rr2.E(z34VarU, "server_name");
                    int iE3 = rr2.E(z34VarU, "username");
                    int iE4 = rr2.E(z34VarU, "password");
                    int iE5 = rr2.E(z34VarU, "address");
                    int iE6 = rr2.E(z34VarU, "local_address");
                    int iE7 = rr2.E(z34VarU, "timestamp");
                    int iE8 = rr2.E(z34VarU, "low_security");
                    int iE9 = rr2.E(z34VarU, "client_cert");
                    ArrayList arrayList = new ArrayList();
                    while (z34VarU.O()) {
                        arrayList.add(new Server(z34VarU.isNull(iE) ? null : z34VarU.D(iE), z34VarU.isNull(iE2) ? null : z34VarU.D(iE2), z34VarU.isNull(iE3) ? null : z34VarU.D(iE3), z34VarU.isNull(iE4) ? null : z34VarU.D(iE4), z34VarU.isNull(iE5) ? null : z34VarU.D(iE5), z34VarU.isNull(iE6) ? null : z34VarU.D(iE6), z34VarU.getLong(iE7), ((int) z34VarU.getLong(iE8)) != 0, z34VarU.isNull(iE9) ? null : z34VarU.D(iE9)));
                        break;
                    }
                    return arrayList;
                } finally {
                    z34VarU.close();
                }
            case 15:
                o54 o54Var = jh4.a;
                return j15Var;
            case WaveRetry.MAX_FAILURES /* 16 */:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 17:
                ((Float) obj).getClass();
                return j15Var;
            case 18:
                return j15Var;
            case 19:
                return j15Var;
            case 20:
                z34 z34Var = (z34) obj;
                z34Var.getClass();
                return Boolean.valueOf(z34Var.O());
            case 21:
                z34 z34Var2 = (z34) obj;
                z34Var2.getClass();
                fb4 fb4Var = new fb4();
                while (z34Var2.O()) {
                    fb4Var.add(Integer.valueOf((int) z34Var2.getLong(0)));
                }
                return kb4.l(fb4Var);
            case 22:
                kd3 kd3Var = (kd3) obj;
                kd3Var.getClass();
                String str4 = (String) kd3Var.n;
                String str5 = (String) kd3Var.o;
                List list5 = f25.c;
                return b11.q(b11.u("<", str4, ">", ud3.h(str5), "</"), str4, ">");
            case 23:
                gn2 gn2Var = (gn2) obj;
                gn2Var.getClass();
                Bundle bundle = gn2Var.d.I;
                if (h12.c(bundle != null ? bundle.getString("type") : null, "music")) {
                    return e03.j(0, gn2Var.a).toString();
                }
                bn2 bn2Var = gn2Var.b;
                if (bn2Var == null || (uri = bn2Var.a) == null) {
                    return null;
                }
                return uri.toString();
            case 24:
                return new zd(((Float) obj).floatValue());
            case 25:
                return new zd(((Integer) obj).intValue());
            case 26:
                return Integer.valueOf((int) ((zd) obj).a);
            case 27:
                return new zd(((ku0) obj).n);
            case 28:
                return new ku0(((zd) obj).a);
            default:
                mu0 mu0Var = (mu0) obj;
                return new ae(Float.intBitsToFloat((int) (mu0Var.a >> 32)), Float.intBitsToFloat((int) (mu0Var.a & 4294967295L)));
        }
    }

    public /* synthetic */ o54(int i) {
        this.n = i;
    }
}
