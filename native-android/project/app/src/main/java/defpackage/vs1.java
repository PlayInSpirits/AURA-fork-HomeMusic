package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.nsd.NsdServiceInfo;
import androidx.preference.Preference;
import app.homemusic.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vs1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ vs1(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r10, int r11) {
        int r12 = this.n;
        Object r13 = this.r;
        Object r0 = this.q;
        Object r1 = this.p;
        Object r9 = this.o;
        switch(r12) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        SharedPreferences r14 = (SharedPreferences) r9;
        Set<String> r15 = r14.getStringSet("receivers", z01.n);
        r15.getClass();
        LinkedHashSet r16 = kb4.Q(q40.T0(r15), ((y42) r1).a);
        r14.edit().putStringSet("receivers", r16).apply();
        ((h62) r0).k0((NsdServiceInfo) r13);
        return;
    L6:
        vb4 r6 = (vb4) r9;
        e90 r2 = new e90(18);
        String r4 = r6.s(R.string.homemusic_settings_google_unlinked);
        r4.getClass();
        io1.a.execute(new up(r2, (jx3) r1, r4, (jx3) r0, r6, (Preference) r13, 2));
    }
}
