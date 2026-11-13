/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.Menu;
import defpackage.a83;

public final class cm3
implements a83 {
    public final int a;
    public final Menu b;

    public cm3(int n16, Menu menu) {
        this.a = n16;
        this.b = menu;
    }

    @Override
    public final void b(Object object) {
        int n16 = this.a;
        Menu menu = this.b;
        object = (Boolean)object;
        switch (n16) {
            default: {
                menu.findItem(2131361896).setChecked((Boolean)object);
                return;
            }
            case 0: 
        }
        menu.findItem(2131361932).setVisible((Boolean)object);
        menu.findItem(2131361917).setVisible((Boolean)object ^ true);
    }
}

