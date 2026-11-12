package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import java.util.function.Function;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hu3 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ hu3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((InternetRadioStationCache) obj).toInternetRadioStation();
            case 1:
                return new InternetRadioStationCache((InternetRadioStation) obj);
            case 2:
                InternetRadioStation internetRadioStation = (InternetRadioStation) obj;
                return internetRadioStation.getName() == null ? "" : internetRadioStation.getName();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((Child) obj).getDiscNumber();
            case 4:
                return ((Child) obj).getTitle();
            case 5:
                return ((Child) obj).getStarred();
            default:
                return new Download((Child) obj);
        }
    }
}
