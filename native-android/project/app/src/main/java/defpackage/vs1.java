package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.nsd.NsdServiceInfo;
import androidx.preference.Preference;
import app.homemusic.R;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vs1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ vs1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.n;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i2) {
            case 0:
                vb4 vb4Var = (vb4) obj4;
                e90 e90Var = new e90(18);
                String strS = vb4Var.s(R.string.homemusic_settings_google_unlinked);
                strS.getClass();
                io1.a.execute(new up(e90Var, (jx3) obj3, strS, (jx3) obj2, vb4Var, (Preference) obj, 2));
                break;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                Set<String> stringSet = sharedPreferences.getStringSet("receivers", z01.n);
                stringSet.getClass();
                sharedPreferences.edit().putStringSet("receivers", kb4.Q(q40.T0(stringSet), ((y42) obj3).a)).apply();
                ((h62) obj2).k0((NsdServiceInfo) obj);
                break;
        }
    }
}
