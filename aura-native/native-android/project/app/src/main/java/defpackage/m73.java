package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m73 implements cz4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bz4 o;

    public /* synthetic */ m73(bz4 bz4Var, int i) {
        this.n = i;
        this.o = bz4Var;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        int i = this.n;
        bz4 bz4Var = this.o;
        switch (i) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (n73) bz4Var;
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (lk1) bz4Var;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.n) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((lk1) this.o) + "]";
            default:
                return super.toString();
        }
    }
}
