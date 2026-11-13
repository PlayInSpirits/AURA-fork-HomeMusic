/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.DialogInterface;
import defpackage.xa3;

public final class wr
implements DialogInterface.OnClickListener {
    public final int n;

    public wr(int n16) {
        this.n = n16;
    }

    private final void a(DialogInterface dialogInterface, int n16) {
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int n16) {
        switch (this.n) {
            default: {
                dialogInterface.cancel();
                return;
            }
            case 14: {
                dialogInterface.cancel();
                return;
            }
            case 13: {
                dialogInterface.cancel();
                return;
            }
            case 12: {
                dialogInterface.cancel();
                return;
            }
            case 11: {
                dialogInterface.cancel();
                return;
            }
            case 10: {
                dialogInterface.cancel();
                return;
            }
            case 9: {
                dialogInterface.cancel();
                return;
            }
            case 8: {
                dialogInterface.cancel();
                return;
            }
            case 7: {
                dialogInterface.cancel();
                return;
            }
            case 6: {
                dialogInterface.cancel();
                return;
            }
            case 5: {
                dialogInterface.cancel();
                return;
            }
            case 4: {
                dialogInterface.cancel();
            }
            case 3: {
                return;
            }
            case 2: {
                dialogInterface.cancel();
                return;
            }
            case 1: {
                dialogInterface.cancel();
                return;
            }
            case 0: 
        }
        xa3.t("battery_optimization", false);
    }
}

