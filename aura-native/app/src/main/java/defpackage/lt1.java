package defpackage;

import android.widget.CompoundButton;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class lt1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CompoundButton o;
    public final /* synthetic */ Supplier p;

    public /* synthetic */ lt1(CompoundButton compoundButton, Supplier supplier, int i) {
        this.n = i;
        this.o = compoundButton;
        this.p = supplier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Child child;
        int i = this.n;
        Supplier supplier = this.p;
        CompoundButton compoundButton = this.o;
        int i2 = 1;
        switch (i) {
            case 0:
                compoundButton.post(new lt1(compoundButton, supplier, i2));
                break;
            default:
                if (compoundButton.isAttachedToWindow() && (child = (Child) supplier.get()) != null) {
                    compoundButton.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                    break;
                }
                break;
        }
    }
}
