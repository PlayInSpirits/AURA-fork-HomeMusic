package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft1 implements Runnable {
    public final /* synthetic */ ad2 n;
    public final /* synthetic */ View o;
    public final /* synthetic */ View p;
    public final /* synthetic */ TextView q;
    public final /* synthetic */ ImageButton r;
    public final /* synthetic */ TextView s;
    public final /* synthetic */ wj3 t;

    public /* synthetic */ ft1(k03 r1, View r2, View r3, TextView r4, ImageButton r5, TextView r6, wj3 r7) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Child r0 = (Child) this.n.d();
        View r1 = this.o;
        Context r2 = r1.getContext();
        r2.getClass();
        String r3 = null;
        if (r0 == null) goto L5;
        String r4 = r0.getId();
    L6:
        SmartSession r5 = a.b;
        if (r5 != null) goto L10;
    L8:
        String r6 = null;
    L24:
        View r7 = this.p;
        if (r7 == null) goto L30;
        if (r6 == null) goto L28;
        int r8 = 0;
    L29:
        r7.setVisibility(r8);
        goto L30
    L28:
        r8 = 8;
    L30:
        if (r6 == null) goto L45;
        TextView r9 = this.q;
        if (r9 == null) goto L34;
        r9.setText("✨ ".concat(r6));
    L34:
        ImageButton r10 = this.r;
        if (r10 == null) goto L45;
        Context r11 = r1.getContext();
        SmartSession r12 = a.b;
        if (r12 == null) goto L39;
        String r13 = r12.getContext();
    L41:
        if (h12.c(r13, SmartContexts.LIKED) == false) goto L43;
        int r14 = R.string.homemusic_smart_add_liked;
    L44:
        r10.setContentDescription(r11.getString(r14));
        goto L45
    L43:
        r14 = R.string.homemusic_smart_add_playlist;
        goto L44
    L39:
        r13 = null;
    L45:
        if (r0 == null) goto L47;
        r3 = r0.getId();
    L47:
        fu.p(this.s, r3);
        fu.K(r1, (qi3) this.t.get());
        return;
    L10:
        if (r5.isRec(r4) == false) goto L8;
        if (h12.c(r5.getContext(), SmartContexts.LIKED) == false) goto L15;
        r6 = r2.getString(R.string.homemusic_smart_label_liked);
        goto L24
    L15:
        String r15 = r5.getTitle();
        if (r15 != null) goto L18;
        r15 = (String) a.e.get(r5.getContext());
    L18:
        if (r15 == null) goto L23;
        String r16 = r2.getString(R.string.homemusic_smart_label_playlist, new Object[]{r15});
        if (r16 == null) goto L23;
        r6 = r16;
    L23:
        r6 = r2.getString(R.string.homemusic_smart_label_playlist_unnamed);
        r6.getClass();
        goto L24
    L5:
        r4 = null;
        goto L6
    }
}
