package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hu3 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ hu3(int r1) {
        this.a = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r1) {
        switch(this.a) {
            case 0: goto L20;
            case 1: goto L18;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            default: goto L5;
        };
    L12:
        InternetRadioStation r2 = (InternetRadioStation) r1;
        if (r2.getName() != null) goto L16;
        return "";
    L16:
        return r2.getName();
    L5:
        return new Download((Child) r1);
    L7:
        return ((Child) r1).getStarred();
    L9:
        return ((Child) r1).getTitle();
    L11:
        return ((Child) r1).getDiscNumber();
    L18:
        return new InternetRadioStationCache((InternetRadioStation) r1);
    L20:
        return ((InternetRadioStationCache) r1).toInternetRadioStation();
    }
}
