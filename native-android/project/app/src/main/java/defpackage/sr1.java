package defpackage;

import android.content.Context;
import android.view.View;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr1 implements View.OnClickListener {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ Child o;
    public final /* synthetic */ bi4 p;

    public /* synthetic */ sr1(bi4 bi4Var, Child child) {
        this.p = bi4Var;
        this.o = child;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        bi4 bi4Var = this.p;
        Child child = this.o;
        switch (i) {
            case 0:
                ExecutorService executorService = ur1.a;
                MainActivity mainActivityA = ur1.a(view.getContext());
                bi4Var.run();
                if (mainActivityA != null) {
                    ur1.c(mainActivityA, child);
                }
                break;
            default:
                Context context = view.getContext();
                context.getClass();
                child.getClass();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                io1.a.execute(new ws1(4, qm4.z0(child.getId(), "hub:"), applicationContext));
                bi4Var.run();
                break;
        }
    }

    public /* synthetic */ sr1(Child child, bi4 bi4Var) {
        this.o = child;
        this.p = bi4Var;
    }
}
