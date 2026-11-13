package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
            rc5 m = q05.m(dd5Var);
            String str2 = dd5Var.a;
            zp4 k = bq4Var.k(m);
            Integer valueOf = k != null ? Integer.valueOf(k.c) : null;
            xc5Var.getClass();
            w24 b = w24.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            b.h(1, str2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) xc5Var.o;
            workDatabase_Impl.b();
            Cursor H = xl.H(workDatabase_Impl, b);
            try {
                ArrayList arrayList2 = new ArrayList(H.getCount());
                while (H.moveToNext()) {
                    arrayList2.add(H.getString(0));
                }
                H.close();
                b.j();
                String B0 = q40.B0(arrayList2, ",", null, null, null, 62);
                String B02 = q40.B0(hd5Var.j(str2), ",", null, null, null, 62);
                StringBuilder j = xa3.j("\n", str2, "\t ");
                j.append(dd5Var.c);
                j.append("\t ");
                j.append(valueOf);
                j.append("\t ");
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
                j.append(str);
                j.append("\t ");
                j.append(B0);
                j.append("\t ");
                j.append(B02);
                j.append('\t');
                sb.append(j.toString());
            } catch (Throwable th) {
                H.close();
                b.j();
                throw th;
            }
        }
        return sb.toString();
    }
}
