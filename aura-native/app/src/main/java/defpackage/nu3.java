/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.widget.RatingBar;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.a83;
import defpackage.ou3;

public final class nu3
implements a83 {
    public final int a;
    public final ou3 b;

    public nu3(ou3 ou32, int n16) {
        this.a = n16;
        this.b = ou32;
    }

    @Override
    public final void b(Object object) {
        int n16 = this.a;
        float f16 = 0.0f;
        float f17 = 0.0f;
        Object object2 = this.b;
        switch (n16) {
            default: {
                object = (ArtistID3)object;
                ((RatingBar)((ou3)object2).B0.o).setRating(0.0f);
                return;
            }
            case 1: {
                object = (AlbumID3)object;
                if (object != null) {
                    object2 = (RatingBar)((ou3)object2).B0.o;
                    if (((AlbumID3)object).getUserRating() != null) {
                        f17 = ((AlbumID3)object).getUserRating().intValue();
                    }
                    ((RatingBar)object2).setRating(f17);
                }
                return;
            }
            case 0: 
        }
        object = (Child)object;
        object2 = (RatingBar)((ou3)object2).B0.o;
        f17 = f16;
        if (((Child)object).getUserRating() != null) {
            f17 = ((Child)object).getUserRating().intValue();
        }
        ((RatingBar)object2).setRating(f17);
    }
}

