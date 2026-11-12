package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.eddyizm.tempus.homemusic.PlayEvent;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements yf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ lc(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.yf1
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.n;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                mc mcVar = (mc) obj5;
                n05 n05VarB = ((ia1) mcVar.r).b((vk0) obj, (gb1) obj2, ((eb1) obj3).a, ((fb1) obj4).a);
                if (n05VarB instanceof n05) {
                    Object obj6 = n05VarB.n;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                z05 z05Var = new z05(n05VarB, mcVar.w);
                mcVar.w = z05Var;
                Object obj7 = z05Var.q;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((wo4) obj5).n(new cf1(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                LinkedHashMap linkedHashMap = ((ps1) obj5).o;
                String str = (String) obj;
                oh3 oh3Var = (oh3) obj2;
                Long l = (Long) obj3;
                ((Long) obj4).getClass();
                str.getClass();
                oh3Var.getClass();
                if (str.equals(PlayEvent.START)) {
                    String str2 = oh3Var.f;
                    b00 b00Var = b00.a;
                    linkedHashMap.put(str2, b00.a());
                }
                ih3 ih3Var = PlayEvent.Companion;
                String str3 = oh3Var.a;
                String strF = rs1.f();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long lValueOf = Long.valueOf(oh3Var.b);
                String str4 = oh3Var.c;
                String str5 = oh3Var.f;
                rs1 rs1Var = rs1.a;
                String str6 = (String) rs1.k.getValue();
                Long lValueOf2 = Long.valueOf(oh3Var.g);
                String str7 = (String) linkedHashMap.get(oh3Var.f);
                ag2 ag2Var = oh3Var.d;
                k62 k62Var = oh3Var.e;
                String str8 = k62Var != null ? k62Var.a : null;
                String str9 = k62Var != null ? k62Var.b : null;
                ih3Var.getClass();
                rs1.j(ih3.b(str, str3, strF, jCurrentTimeMillis, l, lValueOf, str4, str5, str6, lValueOf2, str7, ag2Var, str8, str9));
                if (ti.t0(new String[]{PlayEvent.SKIP, PlayEvent.FINISH, "interrupted", "error"}).contains(str)) {
                    linkedHashMap.remove(oh3Var.f);
                }
                return j15.a;
        }
    }
}
