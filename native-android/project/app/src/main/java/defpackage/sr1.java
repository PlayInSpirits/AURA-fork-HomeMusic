package defpackage;

import android.content.Context;
import android.view.View;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Child o;
    public final /* synthetic */ bi4 p;

    public /* synthetic */ sr1(bi4 r2, Child r3) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r5) {
        int r0 = this.n;
        bi4 r1 = this.p;
        Child r4 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Context r6 = r5.getContext();
        r6.getClass();
        r4.getClass();
        Context r7 = r6.getApplicationContext();
        r7.getClass();
        String r8 = qm4.z0(r4.getId(), "hub:");
        io1.a.execute(new ws1(4, r8, r7));
        r1.run();
        return;
    L6:
        ExecutorService r2 = ur1.a;
        MainActivity r9 = ur1.a(r5.getContext());
        r1.run();
        if (r9 == null) goto L10;
        ur1.c(r9, r4);
        return;
    }

    public /* synthetic */ sr1(Child r2, bi4 r3) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
    }
}
