package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp0 {
    public static final String a = cx.i("DiagnosticsWrkr");

    public static final String a(xc5 xc5Var, hd5 hd5Var, bq4 bq4Var, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dd5 dd5Var = (dd5) obj;
            rc5 rc5VarM = q05.m(dd5Var);
            String str2 = dd5Var.a;
            zp4 zp4VarK = bq4Var.k(rc5VarM);
            Integer numValueOf = zp4VarK != null ? Integer.valueOf(zp4VarK.c) : null;
            xc5Var.getClass();
            w24 w24VarB = w24.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            w24VarB.h(1, str2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) xc5Var.o;
            workDatabase_Impl.b();
            Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
            try {
                ArrayList arrayList2 = new ArrayList(cursorH.getCount());
                while (cursorH.moveToNext()) {
                    arrayList2.add(cursorH.getString(0));
                }
                cursorH.close();
                w24VarB.j();
                String strB0 = q40.B0(arrayList2, ",", null, null, null, 62);
                String strB1 = q40.B0(hd5Var.j(str2), ",", null, null, null, 62);
                StringBuilder sbJ = xa3.j("\n", str2, "\t ");
                sbJ.append(dd5Var.c);
                sbJ.append("\t ");
                sbJ.append(numValueOf);
                sbJ.append("\t ");
                switch (dd5Var.b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbJ.append(str);
                sbJ.append("\t ");
                sbJ.append(strB0);
                sbJ.append("\t ");
                sbJ.append(strB1);
                sbJ.append('\t');
                sb.append(sbJ.toString());
            } catch (Throwable th) {
                cursorH.close();
                w24VarB.j();
                throw th;
            }
        }
        return sb.toString();
    }
}
