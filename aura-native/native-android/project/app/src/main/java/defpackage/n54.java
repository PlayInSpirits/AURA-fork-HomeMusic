package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n54 implements wf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ n54(int i) {
        this.n = i;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        je jeVar;
        Object objA;
        switch (this.n) {
            case 0:
                return Integer.valueOf(((du1) obj2).a);
            case 1:
                return Integer.valueOf(((eb1) obj2).a);
            case 2:
                return Integer.valueOf(((fb1) obj2).a);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                bt4 bt4Var = (bt4) obj2;
                return bt4Var != null ? bt4.a(bt4Var.a, bt4.c) : false ? Boolean.FALSE : gb.d(Float.valueOf(bt4.c(bt4Var.a)), s54.a(new ct4(bt4.b(bt4Var.a)), s54.w, (t44) obj));
            case 4:
                gb2 gb2Var = (gb2) obj2;
                return gb.d(gb2Var.a, s54.a(gb2Var.b, s54.i, (t44) obj));
            case 5:
                long j = ((ct4) obj2).a;
                if (ct4.a(j, 8589934592L)) {
                    return 0;
                }
                if (ct4.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 6:
                g83 g83Var = (g83) obj2;
                return g83Var != null ? g83.b(g83Var.a, 9205357640488583168L) : false ? Boolean.FALSE : gb.d(Float.valueOf(Float.intBitsToFloat((int) (g83Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (g83Var.a & 4294967295L))));
            case 7:
                t44 t44Var = (t44) obj;
                ge geVar = (ge) obj2;
                Object obj3 = geVar.a;
                if (obj3 instanceof sd3) {
                    jeVar = je.n;
                } else if (obj3 instanceof ij4) {
                    jeVar = je.o;
                } else if (obj3 instanceof p45) {
                    jeVar = je.p;
                } else if (obj3 instanceof v25) {
                    jeVar = je.q;
                } else if (obj3 instanceof hb2) {
                    jeVar = je.r;
                } else if (obj3 instanceof gb2) {
                    jeVar = je.s;
                } else {
                    if (!(obj3 instanceof om4)) {
                        throw new UnsupportedOperationException();
                    }
                    jeVar = je.t;
                }
                switch (jeVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = s54.a((sd3) obj3, s54.g, t44Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = s54.a((ij4) obj3, s54.h, t44Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = s54.a((p45) obj3, s54.c, t44Var);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        obj3.getClass();
                        objA = s54.a((v25) obj3, s54.d, t44Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = s54.a((hb2) obj3, s54.e, t44Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = s54.a((gb2) obj3, s54.f, t44Var);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((om4) obj3).a;
                        break;
                    default:
                        er1.n();
                        return null;
                }
                return gb.d(jeVar, objA, Integer.valueOf(geVar.b), Integer.valueOf(geVar.c), geVar.d);
            case 8:
                t44 t44Var2 = (t44) obj;
                List list = ((vd2) obj2).n;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(s54.a((ud2) list.get(i), s54.z, t44Var2));
                }
                return arrayList;
            case 9:
                return ((ud2) obj2).a.toLanguageTag();
            case 10:
                t44 t44Var3 = (t44) obj;
                ra2 ra2Var = (ra2) obj2;
                return gb.d(s54.a(new oa2(ra2Var.a), s54.B, t44Var3), s54.a(new qa2(ra2Var.b), s54.C, t44Var3), s54.a(new pa2(ra2Var.c), s54.D, t44Var3));
            case 11:
                return Float.valueOf(((oa2) obj2).a);
            case 12:
                return Integer.valueOf(((qa2) obj2).a);
            case 13:
                return Integer.valueOf(((pa2) obj2).a);
            case 14:
                return ((p45) obj2).a;
            case 15:
                t44 t44Var4 = (t44) obj;
                sd3 sd3Var = (sd3) obj2;
                Object objA2 = s54.a(new mr4(sd3Var.a), s54.q, t44Var4);
                Object objA3 = s54.a(new ur4(sd3Var.b), s54.r, t44Var4);
                Object objA4 = s54.a(new bt4(sd3Var.c), s54.v, t44Var4);
                cs4 cs4Var = sd3Var.d;
                cs4 cs4Var2 = cs4.c;
                Object objA5 = s54.a(cs4Var, s54.l, t44Var4);
                Object objA6 = s54.a(sd3Var.e, t54.a, t44Var4);
                ra2 ra2Var2 = sd3Var.f;
                ra2 ra2Var3 = ra2.d;
                return gb.d(objA2, objA3, objA4, objA5, objA6, s54.a(ra2Var2, s54.A, t44Var4), s54.a(new ma2(sd3Var.g), t54.c, t44Var4), s54.a(new du1(sd3Var.h), s54.s, t44Var4), s54.a(sd3Var.i, t54.d, t44Var4));
            case WaveRetry.MAX_FAILURES /* 16 */:
                return ((v25) obj2).a;
            case 17:
                t44 t44Var5 = (t44) obj;
                ij4 ij4Var = (ij4) obj2;
                x40 x40Var = new x40(ij4Var.a.c());
                r54 r54Var = s54.p;
                Object objA7 = s54.a(x40Var, r54Var, t44Var5);
                bt4 bt4Var2 = new bt4(ij4Var.b);
                r54 r54Var2 = s54.v;
                Object objA8 = s54.a(bt4Var2, r54Var2, t44Var5);
                gb1 gb1Var = ij4Var.c;
                gb1 gb1Var2 = gb1.o;
                Object objA9 = s54.a(gb1Var, s54.m, t44Var5);
                Object objA10 = s54.a(ij4Var.d, s54.t, t44Var5);
                Object objA11 = s54.a(ij4Var.e, s54.u, t44Var5);
                String str = ij4Var.g;
                Object objA12 = s54.a(new bt4(ij4Var.h), r54Var2, t44Var5);
                Object objA13 = s54.a(ij4Var.i, s54.n, t44Var5);
                Object objA14 = s54.a(ij4Var.j, s54.k, t44Var5);
                vd2 vd2Var = ij4Var.k;
                vd2 vd2Var2 = vd2.p;
                Object objA15 = s54.a(vd2Var, s54.y, t44Var5);
                Object objA16 = s54.a(new x40(ij4Var.l), r54Var, t44Var5);
                Object objA17 = s54.a(ij4Var.m, s54.j, t44Var5);
                xb4 xb4Var = ij4Var.n;
                xb4 xb4Var2 = xb4.d;
                return gb.d(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, s54.a(xb4Var, s54.o, t44Var5));
            case 18:
                t44 t44Var6 = (t44) obj;
                os4 os4Var = (os4) obj2;
                ij4 ij4Var2 = os4Var.a;
                xc5 xc5Var = s54.h;
                return gb.d(s54.a(ij4Var2, xc5Var, t44Var6), s54.a(os4Var.b, xc5Var, t44Var6), s54.a(os4Var.c, xc5Var, t44Var6), s54.a(os4Var.d, xc5Var, t44Var6));
            case 19:
                zg3 zg3Var = (zg3) obj2;
                Boolean boolValueOf = Boolean.valueOf(zg3Var.a);
                xc5 xc5Var2 = s54.a;
                return gb.d(boolValueOf, s54.a(new h01(zg3Var.b), t54.b, (t44) obj));
            case 20:
                return Integer.valueOf(((h01) obj2).a);
            case 21:
                return Integer.valueOf(((ma2) obj2).a);
            case 22:
                qs4 qs4Var = (qs4) obj2;
                return gb.d(s54.a(new ps4(qs4Var.a), t54.e, (t44) obj), Boolean.valueOf(qs4Var.b));
            case 23:
                return Integer.valueOf(((ps4) obj2).a);
            case 24:
                Collection collection = (List) obj;
                List list2 = (List) obj2;
                if (collection == null) {
                    collection = u01.n;
                }
                return q40.G0(collection, list2);
            case 25:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 26:
                Float f = (Float) obj;
                ((Float) obj2).floatValue();
                return f;
            case 27:
                return (m24) obj;
            case 28:
                return (String) obj;
            default:
                return (j15) obj;
        }
    }
}
