/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.au;
import defpackage.bo2;
import java.util.List;
import java.util.function.BiConsumer;

public final class om3
implements BiConsumer {
    public final int a;

    public om3(int n16) {
        this.a = n16;
    }

    public final void accept(Object object, Object object2) {
        int n16 = this.a;
        object = (MainActivity)object;
        object2 = (List)object2;
        switch (n16) {
            default: {
                bo2.e(((MainActivity)object).P, (List)object2, true);
                ((au)((MainActivity)object).V.n).d(true);
                return;
            }
            case 0: 
        }
        bo2.e(((MainActivity)object).P, (List)object2, false);
        Toast.makeText((Context)object, 2131952607, 0).show();
    }
}

