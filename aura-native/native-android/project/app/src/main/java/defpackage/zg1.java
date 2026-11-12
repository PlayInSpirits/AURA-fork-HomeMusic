package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = f35.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public final void b(qv2 qv2Var) {
        pv2 pv2Var;
        qv2Var.getClass();
        uw1 uw1VarJ = yw1.j();
        pv2[] pv2VarArr = qv2Var.a;
        int length = pv2VarArr.length;
        int i = 0;
        while (true) {
            pv2 pv2Var2 = null;
            if (i >= length) {
                break;
            }
            pv2 pv2Var3 = pv2VarArr[i];
            if (l60.class.isAssignableFrom(pv2Var3.getClass())) {
                pv2 pv2Var4 = (pv2) l60.class.cast(pv2Var3);
                if (((l60) pv2Var4).c.equals("iTunSMPB")) {
                    pv2Var2 = pv2Var4;
                }
            }
            if (pv2Var2 != null) {
                uw1VarJ.c(pv2Var2);
            }
            i++;
        }
        vw1 vw1VarListIterator = uw1VarJ.f().listIterator(0);
        while (vw1VarListIterator.hasNext()) {
            if (a(((l60) vw1VarListIterator.next()).d)) {
                return;
            }
        }
        uw1 uw1VarJ2 = yw1.j();
        for (pv2 pv2Var5 : pv2VarArr) {
            if (s02.class.isAssignableFrom(pv2Var5.getClass())) {
                pv2Var = (pv2) s02.class.cast(pv2Var5);
                s02 s02Var = (s02) pv2Var;
                if (!(s02Var.b.equals("com.apple.iTunes") && s02Var.c.equals("iTunSMPB"))) {
                    pv2Var = null;
                }
            } else {
                pv2Var = null;
            }
            if (pv2Var != null) {
                uw1VarJ2.c(pv2Var);
            }
        }
        vw1 vw1VarListIterator2 = uw1VarJ2.f().listIterator(0);
        while (vw1VarListIterator2.hasNext() && !a(((s02) vw1VarListIterator2.next()).d)) {
        }
    }
}
