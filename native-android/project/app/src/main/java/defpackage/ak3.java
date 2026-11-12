package defpackage;

import android.widget.RatingBar;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ak3 implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ Child a;
    public final /* synthetic */ PlayerControllerFragment b;

    public ak3(PlayerControllerFragment playerControllerFragment, Child child) {
        this.b = playerControllerFragment;
        this.a = child;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        if (z) {
            int i = (int) f;
            this.b.r0.c(i);
            this.a.setUserRating(Integer.valueOf(i));
        }
    }
}
