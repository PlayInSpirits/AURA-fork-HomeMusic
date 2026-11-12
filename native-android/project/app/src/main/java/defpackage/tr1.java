package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Child o;

    public /* synthetic */ tr1(Child r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r3) {
        int r0 = this.n;
        Child r2 = this.o;
        switch(r0) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        Context r1 = r3.getContext();
        r1.getClass();
        ot1.e(r1, r2);
        if ((r3 instanceof CompoundButton) == false) goto L7;
        CompoundButton r4 = (CompoundButton) r3;
    L8:
        if (r4 == null) goto L21;
        String r5 = r2.getId();
        if (r2.getStarred() == null) goto L12;
        boolean r6 = true;
    L13:
        r4.setChecked(n61.f(1, r5, r6));
        return;
    L12:
        r6 = false;
        goto L13
    L21:
        return;
    L7:
        r4 = null;
        goto L8
    L15:
        ExecutorService r7 = ur1.a;
        MainActivity r8 = ur1.a(r3.getContext());
        if (r8 == null) goto L23;
        if (r2 == null) goto L22;
        ur1.c(r8, r2);
        return;
    L22:
        return;
    }
}
