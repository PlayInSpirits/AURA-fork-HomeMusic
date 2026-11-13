package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class tr1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Child o;

    public /* synthetic */ tr1(Child child, int i) {
        this.n = i;
        this.o = child;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        Child child = this.o;
        switch (i) {
            case 0:
                ExecutorService executorService = ur1.a;
                MainActivity a = ur1.a(view.getContext());
                if (a != null && child != null) {
                    ur1.c(a, child);
                    break;
                }
                break;
            default:
                Context context = view.getContext();
                context.getClass();
                ot1.e(context, child);
                CompoundButton compoundButton = view instanceof CompoundButton ? (CompoundButton) view : null;
                if (compoundButton != null) {
                    compoundButton.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                    break;
                }
                break;
        }
    }
}
