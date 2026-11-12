package defpackage;

import android.app.Application;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class f8 extends hd {
    public final rv2 c;
    public String d;
    public ArtistID3 e;
    public ArrayList f;
    public k03 g;
    public final int h;

    public f8(Application application) {
        super(application);
        this.h = SmartPlan.MAX_QUEUE;
        this.c = new rv2(27);
    }
}
