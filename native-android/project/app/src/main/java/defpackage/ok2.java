package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends gk2 {
    public static final int[] M1 = null;
    public static boolean N1;
    public static boolean O1;
    public long A1;
    public s55 B1;
    public s55 C1;
    public int D1;
    public boolean E1;
    public int F1;
    public nk2 G1;
    public c55 H1;
    public long I1;
    public long J1;
    public boolean K1;
    public int L1;
    public final Context U0;
    public final boolean V0;
    public final rf2 W0;
    public final int X0;
    public final boolean Y0;
    public final e55 Z0;
    public final pu a1;
    public final long b1;
    public final f55 c1;
    public final PriorityQueue d1;
    public v2 e1;
    public boolean f1;
    public boolean g1;
    public r55 h1;
    public boolean i1;
    public int j1;
    public List k1;
    public Surface l1;
    public pg3 m1;
    public pf4 n1;
    public boolean o1;
    public int p1;
    public int q1;
    public long r1;
    public int s1;
    public int t1;
    public int u1;
    public i74 v1;
    public long w1;
    public boolean x1;
    public long y1;
    public int z1;

    static {
        M1 = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    public ok2(mk2 r8) {
        Context r0 = r8.a;
        super(r0.getApplicationContext(), 2, r8.c, 30.0f);
        Context r1 = r0.getApplicationContext();
        this.U0 = r1;
        this.X0 = r8.g;
        this.h1 = null;
        this.W0 = new rf2(r8.e, r8.f);
        if (this.h1 != null) goto L5;
        boolean r2 = true;
    L6:
        this.V0 = r2;
        this.Z0 = new e55(r1, this, r8.d);
        this.a1 = new pu();
        this.Y0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.n1 = pf4.c;
        this.p1 = 1;
        this.q1 = 0;
        this.B1 = s55.d;
        this.F1 = 0;
        this.C1 = null;
        this.D1 = -1000;
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        this.d1 = new PriorityQueue();
        this.b1 = -9223372036854775807L;
        this.c1 = null;
        this.v1 = null;
        return;
    L5:
        r2 = false;
        goto L6
    }

    public static boolean E0(String r17) {
        boolean r1 = false;
        if (r17.startsWith("OMX.google") == false) goto L6;
        return false;
    L6:
        monitor-enter(ok2.class);
    L665:
        th = move-exception;
        throw th;
    L8:
        if (N1 == true) goto L667;
        int r0 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L665
        byte r3 = 28;
        if (r0 > 28) goto L51;
        String r12 = Build.DEVICE;     // Catch: Throwable -> L665
        r12.getClass();     // Catch: Throwable -> L665
        switch(r12.hashCode()) {
            case -1339091551: goto L44;
            case -1220081023: goto L40;
            case -1220066608: goto L36;
            case -1012436106: goto L32;
            case -760312546: goto L28;
            case -64886864: goto L24;
            case 3415681: goto L20;
            case 825323514: goto L16;
            default: goto L14;
        };
    L14:
        byte r13 = -1;
    L47:
        switch(r13) {
            case 0: goto L49;
            case 1: goto L49;
            case 2: goto L49;
            case 3: goto L49;
            case 4: goto L49;
            case 5: goto L49;
            case 6: goto L49;
            case 7: goto L49;
            default: goto L51;
        };
    L49:
        r1 = true;
    L664:
        O1 = r1;     // Catch: Throwable -> L665
        N1 = true;     // Catch: Throwable -> L665
        goto L667
    L16:
        if (r12.equals("machuca") == false) goto L674;
        r13 = 7;
        goto L47
    L674:
        r13 = -1;
        goto L47
    L20:
        if (r12.equals("once") == false) goto L675;
        r13 = 6;
        goto L47
    L675:
        r13 = -1;
        goto L47
    L24:
        if (r12.equals("magnolia") == false) goto L676;
        r13 = 5;
        goto L47
    L676:
        r13 = -1;
        goto L47
    L28:
        if (r12.equals("aquaman") == false) goto L677;
        r13 = 4;
        goto L47
    L677:
        r13 = -1;
        goto L47
    L32:
        if (r12.equals("oneday") == false) goto L678;
        r13 = 3;
        goto L47
    L678:
        r13 = -1;
        goto L47
    L36:
        if (r12.equals("dangalUHD") == false) goto L679;
        r13 = 2;
        goto L47
    L679:
        r13 = -1;
        goto L47
    L40:
        if (r12.equals("dangalFHD") == false) goto L680;
        r13 = 1;
        goto L47
    L680:
        r13 = -1;
        goto L47
    L44:
        if (r12.equals("dangal") == false) goto L681;
        r13 = 0;
        goto L47
    L681:
        r13 = -1;
    L51:
        if (r0 <= 27) goto L53;
    L55:
        String r14 = Build.MODEL;     // Catch: Throwable -> L665
        r14.getClass();     // Catch: Throwable -> L665
        switch(r14.hashCode()) {
            case -349662828: goto L92;
            case -321033677: goto L88;
            case 2006354: goto L84;
            case 2006367: goto L80;
            case 2006371: goto L76;
            case 1785421873: goto L72;
            case 1785421876: goto L68;
            case 1798172390: goto L64;
            case 2119412532: goto L60;
            default: goto L58;
        };
    L58:
        byte r15 = -1;
    L95:
        switch(r15) {
            case 0: goto L49;
            case 1: goto L49;
            case 2: goto L49;
            case 3: goto L49;
            case 4: goto L49;
            case 5: goto L49;
            case 6: goto L49;
            case 7: goto L49;
            case 8: goto L49;
            default: goto L97;
        };
    L97:
        if (r0 > 26) goto L664;
        String r2 = Build.DEVICE;     // Catch: Throwable -> L665
        r2.getClass();     // Catch: Throwable -> L665
        switch(r2.hashCode()) {
            case -2144781245: goto L658;
            case -2144781185: goto L654;
            case -2144781160: goto L650;
            case -2097309513: goto L646;
            case -2022874474: goto L642;
            case -1978993182: goto L638;
            case -1978990237: goto L634;
            case -1936688988: goto L630;
            case -1936688066: goto L626;
            case -1936688065: goto L622;
            case -1931988508: goto L618;
            case -1885099851: goto L614;
            case -1696512866: goto L610;
            case -1680025915: goto L606;
            case -1615810839: goto L602;
            case -1600724499: goto L598;
            case -1554255044: goto L594;
            case -1481772737: goto L590;
            case -1481772730: goto L586;
            case -1481772729: goto L582;
            case -1320080169: goto L578;
            case -1217592143: goto L574;
            case -1180384755: goto L570;
            case -1139198265: goto L566;
            case -1052835013: goto L562;
            case -993250464: goto L558;
            case -993250458: goto L554;
            case -965403638: goto L550;
            case -958336948: goto L547;
            case -879245230: goto L543;
            case -842500323: goto L539;
            case -821392978: goto L535;
            case -797483286: goto L531;
            case -794946968: goto L527;
            case -788334647: goto L523;
            case -782144577: goto L519;
            case -575125681: goto L515;
            case -521118391: goto L511;
            case -430914369: goto L507;
            case -290434366: goto L503;
            case -282781963: goto L499;
            case -277133239: goto L495;
            case -173639913: goto L491;
            case -56598463: goto L487;
            case 2126: goto L483;
            case 2564: goto L479;
            case 2715: goto L475;
            case 2719: goto L471;
            case 3091: goto L467;
            case 3483: goto L463;
            case 73405: goto L459;
            case 75537: goto L455;
            case 75739: goto L451;
            case 76779: goto L447;
            case 78669: goto L443;
            case 79305: goto L439;
            case 80618: goto L435;
            case 88274: goto L431;
            case 98846: goto L427;
            case 98848: goto L423;
            case 99329: goto L419;
            case 101481: goto L415;
            case 1513190: goto L411;
            case 1514184: goto L407;
            case 1514185: goto L403;
            case 2133089: goto L399;
            case 2133091: goto L395;
            case 2133120: goto L391;
            case 2133151: goto L387;
            case 2133182: goto L383;
            case 2133184: goto L379;
            case 2436959: goto L375;
            case 2463773: goto L371;
            case 2464648: goto L367;
            case 2689555: goto L363;
            case 3154429: goto L359;
            case 3284551: goto L355;
            case 3351335: goto L351;
            case 3386211: goto L347;
            case 41325051: goto L343;
            case 51349633: goto L339;
            case 51350594: goto L335;
            case 55178625: goto L331;
            case 61542055: goto L327;
            case 65355429: goto L323;
            case 66214468: goto L319;
            case 66214470: goto L315;
            case 66214473: goto L311;
            case 66215429: goto L307;
            case 66215431: goto L303;
            case 66215433: goto L299;
            case 66216390: goto L295;
            case 76402249: goto L291;
            case 76404105: goto L287;
            case 76404911: goto L283;
            case 80963634: goto L279;
            case 82882791: goto L275;
            case 98715550: goto L271;
            case 101370885: goto L267;
            case 102844228: goto L263;
            case 165221241: goto L259;
            case 182191441: goto L255;
            case 245388979: goto L251;
            case 287431619: goto L247;
            case 307593612: goto L243;
            case 308517133: goto L239;
            case 316215098: goto L235;
            case 316215116: goto L231;
            case 316246811: goto L227;
            case 316246818: goto L223;
            case 407160593: goto L219;
            case 507412548: goto L215;
            case 793982701: goto L211;
            case 794038622: goto L207;
            case 794040393: goto L203;
            case 835649806: goto L199;
            case 917340916: goto L195;
            case 958008161: goto L191;
            case 1060579533: goto L187;
            case 1150207623: goto L183;
            case 1176899427: goto L179;
            case 1280332038: goto L175;
            case 1306947716: goto L171;
            case 1349174697: goto L167;
            case 1522194893: goto L163;
            case 1691543273: goto L159;
            case 1691544261: goto L155;
            case 1709443163: goto L151;
            case 1865889110: goto L147;
            case 1906253259: goto L143;
            case 1977196784: goto L139;
            case 2006372676: goto L135;
            case 2019281702: goto L131;
            case 2029784656: goto L127;
            case 2030379515: goto L123;
            case 2033393791: goto L119;
            case 2047190025: goto L115;
            case 2047252157: goto L111;
            case 2048319463: goto L107;
            case 2048855701: goto L103;
            default: goto L101;
        };
    L101:
        r3 = -1;
    L661:
        switch(r3) {
            case 0: goto L49;
            case 1: goto L49;
            case 2: goto L49;
            case 3: goto L49;
            case 4: goto L49;
            case 5: goto L49;
            case 6: goto L49;
            case 7: goto L49;
            case 8: goto L49;
            case 9: goto L49;
            case 10: goto L49;
            case 11: goto L49;
            case 12: goto L49;
            case 13: goto L49;
            case 14: goto L49;
            case 15: goto L49;
            case 16: goto L49;
            case 17: goto L49;
            case 18: goto L49;
            case 19: goto L49;
            case 20: goto L49;
            case 21: goto L49;
            case 22: goto L49;
            case 23: goto L49;
            case 24: goto L49;
            case 25: goto L49;
            case 26: goto L49;
            case 27: goto L49;
            case 28: goto L49;
            case 29: goto L49;
            case 30: goto L49;
            case 31: goto L49;
            case 32: goto L49;
            case 33: goto L49;
            case 34: goto L49;
            case 35: goto L49;
            case 36: goto L49;
            case 37: goto L49;
            case 38: goto L49;
            case 39: goto L49;
            case 40: goto L49;
            case 41: goto L49;
            case 42: goto L49;
            case 43: goto L49;
            case 44: goto L49;
            case 45: goto L49;
            case 46: goto L49;
            case 47: goto L49;
            case 48: goto L49;
            case 49: goto L49;
            case 50: goto L49;
            case 51: goto L49;
            case 52: goto L49;
            case 53: goto L49;
            case 54: goto L49;
            case 55: goto L49;
            case 56: goto L49;
            case 57: goto L49;
            case 58: goto L49;
            case 59: goto L49;
            case 60: goto L49;
            case 61: goto L49;
            case 62: goto L49;
            case 63: goto L49;
            case 64: goto L49;
            case 65: goto L49;
            case 66: goto L49;
            case 67: goto L49;
            case 68: goto L49;
            case 69: goto L49;
            case 70: goto L49;
            case 71: goto L49;
            case 72: goto L49;
            case 73: goto L49;
            case 74: goto L49;
            case 75: goto L49;
            case 76: goto L49;
            case 77: goto L49;
            case 78: goto L49;
            case 79: goto L49;
            case 80: goto L49;
            case 81: goto L49;
            case 82: goto L49;
            case 83: goto L49;
            case 84: goto L49;
            case 85: goto L49;
            case 86: goto L49;
            case 87: goto L49;
            case 88: goto L49;
            case 89: goto L49;
            case 90: goto L49;
            case 91: goto L49;
            case 92: goto L49;
            case 93: goto L49;
            case 94: goto L49;
            case 95: goto L49;
            case 96: goto L49;
            case 97: goto L49;
            case 98: goto L49;
            case 99: goto L49;
            case 100: goto L49;
            case 101: goto L49;
            case 102: goto L49;
            case 103: goto L49;
            case 104: goto L49;
            case 105: goto L49;
            case 106: goto L49;
            case 107: goto L49;
            case 108: goto L49;
            case 109: goto L49;
            case 110: goto L49;
            case 111: goto L49;
            case 112: goto L49;
            case 113: goto L49;
            case 114: goto L49;
            case 115: goto L49;
            case 116: goto L49;
            case 117: goto L49;
            case 118: goto L49;
            case 119: goto L49;
            case 120: goto L49;
            case 121: goto L49;
            case 122: goto L49;
            case 123: goto L49;
            case 124: goto L49;
            case 125: goto L49;
            case 126: goto L49;
            case 127: goto L49;
            case 128: goto L49;
            case 129: goto L49;
            case 130: goto L49;
            case 131: goto L49;
            case 132: goto L49;
            case 133: goto L49;
            case 134: goto L49;
            case 135: goto L49;
            case 136: goto L49;
            case 137: goto L49;
            case 138: goto L49;
            case 139: goto L49;
            default: goto L663;
        };
    L663:
        if (r14.equals("JSN-L21") == true) goto L49;
    L103:
        if (r2.equals("HWWAS-H") == false) goto L691;
        r3 = 139;
        goto L661
    L691:
        r3 = -1;
        goto L661
    L107:
        if (r2.equals("HWVNS-H") == false) goto L692;
        r3 = 138;
        goto L661
    L692:
        r3 = -1;
        goto L661
    L111:
        if (r2.equals("ELUGA_Prim") == false) goto L693;
        r3 = 137;
        goto L661
    L693:
        r3 = -1;
        goto L661
    L115:
        if (r2.equals("ELUGA_Note") == false) goto L694;
        r3 = 136;
        goto L661
    L694:
        r3 = -1;
        goto L661
    L119:
        if (r2.equals("ASUS_X00AD_2") == false) goto L695;
        r3 = 135;
        goto L661
    L695:
        r3 = -1;
        goto L661
    L123:
        if (r2.equals("HWCAM-H") == false) goto L696;
        r3 = 134;
        goto L661
    L696:
        r3 = -1;
        goto L661
    L127:
        if (r2.equals("HWBLN-H") == false) goto L697;
        r3 = 133;
        goto L661
    L697:
        r3 = -1;
        goto L661
    L131:
        if (r2.equals("DM-01K") == false) goto L698;
        r3 = 132;
        goto L661
    L698:
        r3 = -1;
        goto L661
    L135:
        if (r2.equals("BRAVIA_ATV3_4K") == false) goto L699;
        r3 = 131;
        goto L661
    L699:
        r3 = -1;
        goto L661
    L139:
        if (r2.equals("Infinix-X572") == false) goto L700;
        r3 = 130;
        goto L661
    L700:
        r3 = -1;
        goto L661
    L143:
        if (r2.equals("PB2-670M") == false) goto L701;
        r3 = 129;
        goto L661
    L701:
        r3 = -1;
        goto L661
    L147:
        if (r2.equals("santoni") == false) goto L702;
        r3 = 128;
        goto L661
    L702:
        r3 = -1;
        goto L661
    L151:
        if (r2.equals("iball8735_9806") == false) goto L703;
        r3 = 127;
        goto L661
    L703:
        r3 = -1;
        goto L661
    L155:
        if (r2.equals("CPH1715") == false) goto L704;
        r3 = 126;
        goto L661
    L704:
        r3 = -1;
        goto L661
    L159:
        if (r2.equals("CPH1609") == false) goto L705;
        r3 = 125;
        goto L661
    L705:
        r3 = -1;
        goto L661
    L163:
        if (r2.equals("woods_f") == false) goto L706;
        r3 = 124;
        goto L661
    L706:
        r3 = -1;
        goto L661
    L167:
        if (r2.equals("htc_e56ml_dtul") == false) goto L707;
        r3 = 123;
        goto L661
    L707:
        r3 = -1;
        goto L661
    L171:
        if (r2.equals("EverStar_S") == false) goto L708;
        r3 = 122;
        goto L661
    L708:
        r3 = -1;
        goto L661
    L175:
        if (r2.equals("hwALE-H") == false) goto L709;
        r3 = 121;
        goto L661
    L709:
        r3 = -1;
        goto L661
    L179:
        if (r2.equals("itel_S41") == false) goto L710;
        r3 = 120;
        goto L661
    L710:
        r3 = -1;
        goto L661
    L183:
        if (r2.equals("LS-5017") == false) goto L711;
        r3 = 119;
        goto L661
    L711:
        r3 = -1;
        goto L661
    L187:
        if (r2.equals("panell_d") == false) goto L712;
        r3 = 118;
        goto L661
    L712:
        r3 = -1;
        goto L661
    L191:
        if (r2.equals("j2xlteins") == false) goto L713;
        r3 = 117;
        goto L661
    L713:
        r3 = -1;
        goto L661
    L195:
        if (r2.equals("A7000plus") == false) goto L714;
        r3 = 116;
        goto L661
    L714:
        r3 = -1;
        goto L661
    L199:
        if (r2.equals("manning") == false) goto L715;
        r3 = 115;
        goto L661
    L715:
        r3 = -1;
        goto L661
    L203:
        if (r2.equals("GIONEE_WBL7519") == false) goto L716;
        r3 = 114;
        goto L661
    L716:
        r3 = -1;
        goto L661
    L207:
        if (r2.equals("GIONEE_WBL7365") == false) goto L717;
        r3 = 113;
        goto L661
    L717:
        r3 = -1;
        goto L661
    L211:
        if (r2.equals("GIONEE_WBL5708") == false) goto L718;
        r3 = 112;
        goto L661
    L718:
        r3 = -1;
        goto L661
    L215:
        if (r2.equals("QM16XE_U") == false) goto L719;
        r3 = 111;
        goto L661
    L719:
        r3 = -1;
        goto L661
    L219:
        if (r2.equals("Pixi5-10_4G") == false) goto L720;
        r3 = 110;
        goto L661
    L720:
        r3 = -1;
        goto L661
    L223:
        if (r2.equals("TB3-850M") == false) goto L721;
        r3 = 109;
        goto L661
    L721:
        r3 = -1;
        goto L661
    L227:
        if (r2.equals("TB3-850F") == false) goto L722;
        r3 = 108;
        goto L661
    L722:
        r3 = -1;
        goto L661
    L231:
        if (r2.equals("TB3-730X") == false) goto L723;
        r3 = 107;
        goto L661
    L723:
        r3 = -1;
        goto L661
    L235:
        if (r2.equals("TB3-730F") == false) goto L724;
        r3 = 106;
        goto L661
    L724:
        r3 = -1;
        goto L661
    L239:
        if (r2.equals("A7020a48") == false) goto L725;
        r3 = 105;
        goto L661
    L725:
        r3 = -1;
        goto L661
    L243:
        if (r2.equals("A7010a48") == false) goto L726;
        r3 = 104;
        goto L661
    L726:
        r3 = -1;
        goto L661
    L247:
        if (r2.equals("griffin") == false) goto L727;
        r3 = 103;
        goto L661
    L727:
        r3 = -1;
        goto L661
    L251:
        if (r2.equals("marino_f") == false) goto L728;
        r3 = 102;
        goto L661
    L728:
        r3 = -1;
        goto L661
    L255:
        if (r2.equals("CPY83_I00") == false) goto L729;
        r3 = 101;
        goto L661
    L729:
        r3 = -1;
        goto L661
    L259:
        if (r2.equals("A2016a40") == false) goto L730;
        r3 = 100;
        goto L661
    L730:
        r3 = -1;
        goto L661
    L263:
        if (r2.equals("le_x6") == false) goto L731;
        r3 = 99;
        goto L661
    L731:
        r3 = -1;
        goto L661
    L267:
        if (r2.equals("l5460") == false) goto L732;
        r3 = 98;
        goto L661
    L732:
        r3 = -1;
        goto L661
    L271:
        if (r2.equals("i9031") == false) goto L733;
        r3 = 97;
        goto L661
    L733:
        r3 = -1;
        goto L661
    L275:
        if (r2.equals("X3_HK") == false) goto L734;
        r3 = 96;
        goto L661
    L734:
        r3 = -1;
        goto L661
    L279:
        if (r2.equals("V23GB") == false) goto L735;
        r3 = 95;
        goto L661
    L735:
        r3 = -1;
        goto L661
    L283:
        if (r2.equals("Q4310") == false) goto L736;
        r3 = 94;
        goto L661
    L736:
        r3 = -1;
        goto L661
    L287:
        if (r2.equals("Q4260") == false) goto L737;
        r3 = 93;
        goto L661
    L737:
        r3 = -1;
        goto L661
    L291:
        if (r2.equals("PRO7S") == false) goto L738;
        r3 = 92;
        goto L661
    L738:
        r3 = -1;
        goto L661
    L295:
        if (r2.equals("F3311") == false) goto L739;
        r3 = 91;
        goto L661
    L739:
        r3 = -1;
        goto L661
    L299:
        if (r2.equals("F3215") == false) goto L740;
        r3 = 90;
        goto L661
    L740:
        r3 = -1;
        goto L661
    L303:
        if (r2.equals("F3213") == false) goto L741;
        r3 = 89;
        goto L661
    L741:
        r3 = -1;
        goto L661
    L307:
        if (r2.equals("F3211") == false) goto L742;
        r3 = 88;
        goto L661
    L742:
        r3 = -1;
        goto L661
    L311:
        if (r2.equals("F3116") == false) goto L743;
        r3 = 87;
        goto L661
    L743:
        r3 = -1;
        goto L661
    L315:
        if (r2.equals("F3113") == false) goto L744;
        r3 = 86;
        goto L661
    L744:
        r3 = -1;
        goto L661
    L319:
        if (r2.equals("F3111") == false) goto L745;
        r3 = 85;
        goto L661
    L745:
        r3 = -1;
        goto L661
    L323:
        if (r2.equals("E5643") == false) goto L746;
        r3 = 84;
        goto L661
    L746:
        r3 = -1;
        goto L661
    L327:
        if (r2.equals("A1601") == false) goto L747;
        r3 = 83;
        goto L661
    L747:
        r3 = -1;
        goto L661
    L331:
        if (r2.equals("Aura_Note_2") == false) goto L748;
        r3 = 82;
        goto L661
    L748:
        r3 = -1;
        goto L661
    L335:
        if (r2.equals("602LV") == false) goto L749;
        r3 = 81;
        goto L661
    L749:
        r3 = -1;
        goto L661
    L339:
        if (r2.equals("601LV") == false) goto L750;
        r3 = 80;
        goto L661
    L750:
        r3 = -1;
        goto L661
    L343:
        if (r2.equals("MEIZU_M5") == false) goto L751;
        r3 = 79;
        goto L661
    L751:
        r3 = -1;
        goto L661
    L347:
        if (r2.equals("p212") == false) goto L752;
        r3 = 78;
        goto L661
    L752:
        r3 = -1;
        goto L661
    L351:
        if (r2.equals("mido") == false) goto L753;
        r3 = 77;
        goto L661
    L753:
        r3 = -1;
        goto L661
    L355:
        if (r2.equals("kate") == false) goto L754;
        r3 = 76;
        goto L661
    L754:
        r3 = -1;
        goto L661
    L359:
        if (r2.equals("fugu") == false) goto L755;
        r3 = 75;
        goto L661
    L755:
        r3 = -1;
        goto L661
    L363:
        if (r2.equals("XE2X") == false) goto L756;
        r3 = 74;
        goto L661
    L756:
        r3 = -1;
        goto L661
    L367:
        if (r2.equals("Q427") == false) goto L757;
        r3 = 73;
        goto L661
    L757:
        r3 = -1;
        goto L661
    L371:
        if (r2.equals("Q350") == false) goto L758;
        r3 = 72;
        goto L661
    L758:
        r3 = -1;
        goto L661
    L375:
        if (r2.equals("P681") == false) goto L759;
        r3 = 71;
        goto L661
    L759:
        r3 = -1;
        goto L661
    L379:
        if (r2.equals("F04J") == false) goto L760;
        r3 = 70;
        goto L661
    L760:
        r3 = -1;
        goto L661
    L383:
        if (r2.equals("F04H") == false) goto L761;
        r3 = 69;
        goto L661
    L761:
        r3 = -1;
        goto L661
    L387:
        if (r2.equals("F03H") == false) goto L762;
        r3 = 68;
        goto L661
    L762:
        r3 = -1;
        goto L661
    L391:
        if (r2.equals("F02H") == false) goto L763;
        r3 = 67;
        goto L661
    L763:
        r3 = -1;
        goto L661
    L395:
        if (r2.equals("F01J") == false) goto L764;
        r3 = 66;
        goto L661
    L764:
        r3 = -1;
        goto L661
    L399:
        if (r2.equals("F01H") == false) goto L765;
        r3 = 65;
        goto L661
    L765:
        r3 = -1;
        goto L661
    L403:
        if (r2.equals("1714") == false) goto L766;
        r3 = 64;
        goto L661
    L766:
        r3 = -1;
        goto L661
    L407:
        if (r2.equals("1713") == false) goto L767;
        r3 = 63;
        goto L661
    L767:
        r3 = -1;
        goto L661
    L411:
        if (r2.equals("1601") == false) goto L768;
        r3 = 62;
        goto L661
    L768:
        r3 = -1;
        goto L661
    L415:
        if (r2.equals("flo") == false) goto L769;
        r3 = 61;
        goto L661
    L769:
        r3 = -1;
        goto L661
    L419:
        if (r2.equals("deb") == false) goto L770;
        r3 = 60;
        goto L661
    L770:
        r3 = -1;
        goto L661
    L423:
        if (r2.equals("cv3") == false) goto L771;
        r3 = 59;
        goto L661
    L771:
        r3 = -1;
        goto L661
    L427:
        if (r2.equals("cv1") == false) goto L772;
        r3 = 58;
        goto L661
    L772:
        r3 = -1;
        goto L661
    L431:
        if (r2.equals("Z80") == false) goto L773;
        r3 = 57;
        goto L661
    L773:
        r3 = -1;
        goto L661
    L435:
        if (r2.equals("QX1") == false) goto L774;
        r3 = 56;
        goto L661
    L774:
        r3 = -1;
        goto L661
    L439:
        if (r2.equals("PLE") == false) goto L775;
        r3 = 55;
        goto L661
    L775:
        r3 = -1;
        goto L661
    L443:
        if (r2.equals("P85") == false) goto L776;
        r3 = 54;
        goto L661
    L776:
        r3 = -1;
        goto L661
    L447:
        if (r2.equals("MX6") == false) goto L777;
        r3 = 53;
        goto L661
    L777:
        r3 = -1;
        goto L661
    L451:
        if (r2.equals("M5c") == false) goto L778;
        r3 = 52;
        goto L661
    L778:
        r3 = -1;
        goto L661
    L455:
        if (r2.equals("M04") == false) goto L779;
        r3 = 51;
        goto L661
    L779:
        r3 = -1;
        goto L661
    L459:
        if (r2.equals("JGZ") == false) goto L780;
        r3 = 50;
        goto L661
    L780:
        r3 = -1;
        goto L661
    L463:
        if (r2.equals("mh") == false) goto L781;
        r3 = 49;
        goto L661
    L781:
        r3 = -1;
        goto L661
    L467:
        if (r2.equals("b5") == false) goto L782;
        r3 = 48;
        goto L661
    L782:
        r3 = -1;
        goto L661
    L471:
        if (r2.equals("V5") == false) goto L783;
        r3 = 47;
        goto L661
    L783:
        r3 = -1;
        goto L661
    L475:
        if (r2.equals("V1") == false) goto L784;
        r3 = 46;
        goto L661
    L784:
        r3 = -1;
        goto L661
    L479:
        if (r2.equals("Q5") == false) goto L785;
        r3 = 45;
        goto L661
    L785:
        r3 = -1;
        goto L661
    L483:
        if (r2.equals("C1") == false) goto L786;
        r3 = 44;
        goto L661
    L786:
        r3 = -1;
        goto L661
    L487:
        if (r2.equals("woods_fn") == false) goto L787;
        r3 = 43;
        goto L661
    L787:
        r3 = -1;
        goto L661
    L491:
        if (r2.equals("ELUGA_A3_Pro") == false) goto L788;
        r3 = 42;
        goto L661
    L788:
        r3 = -1;
        goto L661
    L495:
        if (r2.equals("Z12_PRO") == false) goto L789;
        r3 = 41;
        goto L661
    L789:
        r3 = -1;
        goto L661
    L499:
        if (r2.equals("BLACK-1X") == false) goto L790;
        r3 = 40;
        goto L661
    L790:
        r3 = -1;
        goto L661
    L503:
        if (r2.equals("taido_row") == false) goto L791;
        r3 = 39;
        goto L661
    L791:
        r3 = -1;
        goto L661
    L507:
        if (r2.equals("Pixi4-7_3G") == false) goto L792;
        r3 = 38;
        goto L661
    L792:
        r3 = -1;
        goto L661
    L511:
        if (r2.equals("GIONEE_GBL7360") == false) goto L793;
        r3 = 37;
        goto L661
    L793:
        r3 = -1;
        goto L661
    L515:
        if (r2.equals("GiONEE_CBL7513") == false) goto L794;
        r3 = 36;
        goto L661
    L794:
        r3 = -1;
        goto L661
    L519:
        if (r2.equals("OnePlus5T") == false) goto L795;
        r3 = 35;
        goto L661
    L795:
        r3 = -1;
        goto L661
    L523:
        if (r2.equals("whyred") == false) goto L796;
        r3 = 34;
        goto L661
    L796:
        r3 = -1;
        goto L661
    L527:
        if (r2.equals("watson") == false) goto L797;
        r3 = 33;
        goto L661
    L797:
        r3 = -1;
        goto L661
    L531:
        if (r2.equals("SVP-DTV15") == false) goto L798;
        r3 = 32;
        goto L661
    L798:
        r3 = -1;
        goto L661
    L535:
        if (r2.equals("A7000-a") == false) goto L799;
        r3 = 31;
        goto L661
    L799:
        r3 = -1;
        goto L661
    L539:
        if (r2.equals("nicklaus_f") == false) goto L800;
        r3 = 30;
        goto L661
    L800:
        r3 = -1;
        goto L661
    L543:
        if (r2.equals("tcl_eu") == false) goto L801;
        r3 = 29;
        goto L661
    L801:
        r3 = -1;
        goto L661
    L547:
        if (r2.equals("ELUGA_Ray_X") == true) goto L661;
        r3 = -1;
        goto L661
    L550:
        if (r2.equals("s905x018") == false) goto L803;
        r3 = 27;
        goto L661
    L803:
        r3 = -1;
        goto L661
    L554:
        if (r2.equals("A10-70L") == false) goto L804;
        r3 = 26;
        goto L661
    L804:
        r3 = -1;
        goto L661
    L558:
        if (r2.equals("A10-70F") == false) goto L805;
        r3 = 25;
        goto L661
    L805:
        r3 = -1;
        goto L661
    L562:
        if (r2.equals("namath") == false) goto L806;
        r3 = 24;
        goto L661
    L806:
        r3 = -1;
        goto L661
    L566:
        if (r2.equals("Slate_Pro") == false) goto L807;
        r3 = 23;
        goto L661
    L807:
        r3 = -1;
        goto L661
    L570:
        if (r2.equals("iris60") == false) goto L808;
        r3 = 22;
        goto L661
    L808:
        r3 = -1;
        goto L661
    L574:
        if (r2.equals("BRAVIA_ATV2") == false) goto L809;
        r3 = 21;
        goto L661
    L809:
        r3 = -1;
        goto L661
    L578:
        if (r2.equals("GiONEE_GBL7319") == false) goto L810;
        r3 = 20;
        goto L661
    L810:
        r3 = -1;
        goto L661
    L582:
        if (r2.equals("panell_dt") == false) goto L811;
        r3 = 19;
        goto L661
    L811:
        r3 = -1;
        goto L661
    L586:
        if (r2.equals("panell_ds") == false) goto L812;
        r3 = 18;
        goto L661
    L812:
        r3 = -1;
        goto L661
    L590:
        if (r2.equals("panell_dl") == false) goto L813;
        r3 = 17;
        goto L661
    L813:
        r3 = -1;
        goto L661
    L594:
        if (r2.equals("vernee_M5") == false) goto L814;
        r3 = 16;
        goto L661
    L814:
        r3 = -1;
        goto L661
    L598:
        if (r2.equals("pacificrim") == false) goto L815;
        r3 = 15;
        goto L661
    L815:
        r3 = -1;
        goto L661
    L602:
        if (r2.equals("Phantom6") == false) goto L816;
        r3 = 14;
        goto L661
    L816:
        r3 = -1;
        goto L661
    L606:
        if (r2.equals("ComioS1") == false) goto L817;
        r3 = 13;
        goto L661
    L817:
        r3 = -1;
        goto L661
    L610:
        if (r2.equals("XT1663") == false) goto L818;
        r3 = 12;
        goto L661
    L818:
        r3 = -1;
        goto L661
    L614:
        if (r2.equals("RAIJIN") == false) goto L819;
        r3 = 11;
        goto L661
    L819:
        r3 = -1;
        goto L661
    L618:
        if (r2.equals("AquaPowerM") == false) goto L820;
        r3 = 10;
        goto L661
    L820:
        r3 = -1;
        goto L661
    L622:
        if (r2.equals("PGN611") == false) goto L821;
        r3 = 9;
        goto L661
    L821:
        r3 = -1;
        goto L661
    L626:
        if (r2.equals("PGN610") == false) goto L822;
        r3 = 8;
        goto L661
    L822:
        r3 = -1;
        goto L661
    L630:
        if (r2.equals("PGN528") == false) goto L823;
        r3 = 7;
        goto L661
    L823:
        r3 = -1;
        goto L661
    L634:
        if (r2.equals("NX573J") == false) goto L824;
        r3 = 6;
        goto L661
    L824:
        r3 = -1;
        goto L661
    L638:
        if (r2.equals("NX541J") == false) goto L825;
        r3 = 5;
        goto L661
    L825:
        r3 = -1;
        goto L661
    L642:
        if (r2.equals("CP8676_I02") == false) goto L826;
        r3 = 4;
        goto L661
    L826:
        r3 = -1;
        goto L661
    L646:
        if (r2.equals("K50a40") == false) goto L827;
        r3 = 3;
        goto L661
    L827:
        r3 = -1;
        goto L661
    L650:
        if (r2.equals("GIONEE_SWW1631") == false) goto L828;
        r3 = 2;
        goto L661
    L828:
        r3 = -1;
        goto L661
    L654:
        if (r2.equals("GIONEE_SWW1627") == false) goto L829;
        r3 = 1;
        goto L661
    L829:
        r3 = -1;
        goto L661
    L658:
        if (r2.equals("GIONEE_SWW1609") == false) goto L830;
        r3 = 0;
        goto L661
    L830:
        r3 = -1;
        goto L661
    L60:
        if (r14.equals("AFTEUFF014") == false) goto L682;
        r15 = 8;
        goto L95
    L682:
        r15 = -1;
        goto L95
    L64:
        if (r14.equals("AFTSO001") == false) goto L683;
        r15 = 7;
        goto L95
    L683:
        r15 = -1;
        goto L95
    L68:
        if (r14.equals("AFTEU014") == false) goto L684;
        r15 = 6;
        goto L95
    L684:
        r15 = -1;
        goto L95
    L72:
        if (r14.equals("AFTEU011") == false) goto L685;
        r15 = 5;
        goto L95
    L685:
        r15 = -1;
        goto L95
    L76:
        if (r14.equals("AFTR") == false) goto L686;
        r15 = 4;
        goto L95
    L686:
        r15 = -1;
        goto L95
    L80:
        if (r14.equals("AFTN") == false) goto L687;
        r15 = 3;
        goto L95
    L687:
        r15 = -1;
        goto L95
    L84:
        if (r14.equals("AFTA") == false) goto L688;
        r15 = 2;
        goto L95
    L688:
        r15 = -1;
        goto L95
    L88:
        if (r14.equals("AFTKMST12") == false) goto L689;
        r15 = 1;
        goto L95
    L689:
        r15 = -1;
        goto L95
    L92:
        if (r14.equals("AFTJMST12") == false) goto L690;
        r15 = 0;
        goto L95
    L690:
        r15 = -1;
        goto L95
    L53:
        if ("HWEML".equals(Build.DEVICE) == false) goto L55;
    L667:
        monitor-exit(ok2.class);     // Catch: Throwable -> L665
        return O1;
    }

    public static int F0(dk2 r11, tb1 r12) {
        int r0 = r12.u;
        int r1 = r12.v;
        if (r0 == (-1)) goto L71;
        if (r1 == (-1)) goto L71;
        String r3 = r12.n;
        r3.getClass();
        byte r7 = 1;
        if ("video/dolby-vision".equals(r3) == false) goto L21;
        Pair r13 = i40.b(r12);
        if (r13 == null) goto L19;
        int r14 = ((Integer) r13.first).intValue();
        if (r14 == 512) goto L18;
        if (r14 == 1) goto L18;
        if (r14 == 2) goto L18;
        if (r14 != 1024) goto L19;
        r3 = "video/av01";
    L18:
        r3 = "video/avc";
    L19:
        r3 = "video/hevc";
    L21:
        switch(r3.hashCode()) {
            case -1664118616: goto L47;
            case -1662735862: goto L44;
            case -1662541442: goto L40;
            case 1187890754: goto L36;
            case 1331836730: goto L32;
            case 1599127256: goto L28;
            case 1599127257: goto L24;
            default: goto L22;
        };
    L22:
        r7 = -1;
    L50:
        switch(r7) {
            case 0: goto L70;
            case 1: goto L70;
            case 2: goto L68;
            case 3: goto L70;
            case 4: goto L54;
            case 5: goto L70;
            case 6: goto L53;
            default: goto L71;
        };
    L54:
        String r15 = Build.MODEL;
        if ("BRAVIA 4K 2015".equals(r15) == true) goto L71;
        if ("Amazon".equals(Build.MANUFACTURER) == false) goto L66;
        if ("KFSOWI".equals(r15) == true) goto L71;
        if ("AFTS".equals(r15) == false) goto L66;
        if (r11.f == true) goto L71;
    L66:
        return ((f35.g(r1, 16) * f35.g(r0, 16)) * 768) / 4;
    L53:
        return ((r0 * r1) * 3) / 8;
    L68:
        return Math.max(2097152, ((r0 * r1) * 3) / 4);
    L70:
        return ((r0 * r1) * 3) / 4;
    L24:
        if (r3.equals("video/x-vnd.on2.vp9") == false) goto L72;
        r7 = 6;
        goto L50
    L72:
        r7 = -1;
        goto L50
    L28:
        if (r3.equals("video/x-vnd.on2.vp8") == false) goto L73;
        r7 = 5;
        goto L50
    L73:
        r7 = -1;
        goto L50
    L32:
        if (r3.equals("video/avc") == false) goto L74;
        r7 = 4;
        goto L50
    L74:
        r7 = -1;
        goto L50
    L36:
        if (r3.equals("video/mp4v-es") == false) goto L75;
        r7 = 3;
        goto L50
    L75:
        r7 = -1;
        goto L50
    L40:
        if (r3.equals("video/hevc") == false) goto L76;
        r7 = 2;
        goto L50
    L76:
        r7 = -1;
        goto L50
    L44:
        if (r3.equals("video/av01") == true) goto L50;
        r7 = -1;
        goto L50
    L47:
        if (r3.equals("video/3gpp") == false) goto L78;
        r7 = 0;
        goto L50
    L78:
        r7 = -1;
    L71:
        return -1;
    }

    public static List G0(Context r3, kf2 r4, tb1 r5, boolean r6, boolean r7) {
        String r0 = r5.n;
        if (r0 != null) goto L7;
        return gy3.r;
    L7:
        if (Build.VERSION.SDK_INT < 26) goto L20;
        if ("video/dolby-vision".equals(r0) == false) goto L20;
        if (te5.n(r3) == true) goto L20;
        String r8 = jk2.c(r5);
        if (r8 != null) goto L15;
        List r9 = gy3.r;
    L17:
        if (r9.isEmpty() == true) goto L20;
        return r9;
    L15:
        r9 = r4.a(r6, r7, r8);
    L20:
        return jk2.g(r4, r5, r6, r7);
    }

    public static int H0(dk2 r4, tb1 r5) {
        int r0 = r5.o;
        List r1 = r5.q;
        if (r0 == (-1)) goto L10;
        int r6 = r1.size();
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r2 >= r6) goto L8;
        r3 = r3 + ((byte[]) r1.get(r2)).length;
        r2 = r2 + 1;
        goto L5
    L8:
        return r5.o + r3;
    L10:
        return F0(r4, r5);
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void A(long r2, long r4) {
        r55 r0 = this.h1;
        if (r0 != null) goto L11;
    L9:
        super.A(r2, r4);
        return;
    L11:
        r0.q(r2, r4);     // Catch: VideoSink$VideoSinkException -> L6
    L6:
        e = move-exception;
        throw b(e, e.n, false, 7001);
    }

    @Override // defpackage.gk2
    public final int A0(kf2 r12, tb1 r13) {
        int r1 = 0;
        if (lw2.l(r13.n) == true) goto L7;
        return kq.a(0, 0, 0, 0);
    L7:
        if (r13.r == null) goto L9;
        boolean r0 = true;
    L10:
        Context r11 = this.U0;
        List r3 = G0(r11, r12, r13, r0, false);
        if (r0 == false) goto L16;
        if (r3.isEmpty() == false) goto L16;
        r3 = G0(r11, r12, r13, false, false);
    L16:
        if (r3.isEmpty() == true) goto L18;
        int r4 = r13.O;
        int r5 = 2;
        if (r4 == 0) goto L25;
        if (r4 == 2) goto L25;
        return kq.a(2, 0, 0, 0);
    L25:
        dk2 r6 = (dk2) r3.get(0);
        boolean r7 = r6.e(r11, r13);
        if (r7 == true) goto L34;
        int r8 = 1;
    L29:
        if (r8 >= r3.size()) goto L34;
        dk2 r9 = (dk2) r3.get(r8);
        if (r9.e(r11, r13) == true) goto L32;
        r8 = r8 + 1;
        goto L29
    L32:
        boolean r10 = false;
        r7 = true;
        r6 = r9;
    L35:
        if (r7 == false) goto L37;
        int r14 = 4;
    L39:
        if (r6.f(r13) == false) goto L41;
        int r15 = 16;
    L43:
        if (r6.g == false) goto L45;
        int r16 = 64;
    L46:
        if (r10 == false) goto L48;
        int r17 = 128;
    L50:
        if (Build.VERSION.SDK_INT >= 26) goto L52;
    L56:
        if (r7 == false) goto L65;
        List r18 = G0(r11, r12, r13, r0, true);
        if (r18.isEmpty() == true) goto L65;
        HashMap r2 = jk2.a;
        ArrayList r19 = new ArrayList(r18);
        Collections.sort(r19, new w60(r5, new ef0(10, r11, r13)));
        dk2 r110 = (dk2) r19.get(0);
        if (r110.e(r11, r13) == false) goto L65;
        if (r110.f(r13) == false) goto L65;
        r1 = 32;
    L65:
        return (((r14 | r15) | r1) | r16) | r17;
    L52:
        if ("video/dolby-vision".equals(r13.n) == false) goto L56;
        if (te5.n(r11) == true) goto L56;
        r17 = 256;
        goto L56
    L48:
        r17 = 0;
        goto L50
    L45:
        r16 = 0;
        goto L46
    L41:
        r15 = 8;
        goto L43
    L37:
        r14 = 3;
    L34:
        r10 = true;
        goto L35
    L18:
        return kq.a(1, 0, 0, 0);
    L9:
        r0 = false;
        goto L10
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void D(float r1, float r2) {
        super.D(r1, r2);
        r55 r3 = this.h1;
        if (r3 == null) goto L5;
        r3.e(r1);
    L6:
        f55 r0 = this.c1;
        if (r0 == null) goto L10;
        r0.c(r1);
        return;
    L10:
        return;
    L5:
        this.Z0.h(r1);
        goto L6
    }

    @Override // defpackage.kq
    public final boolean G(long r7) {
        if (this.D0 != (-9223372036854775807L)) goto L6;
        return false;
    L6:
        if (r7 >= this.w1) goto L8;
        return false;
    L8:
        long r4 = this.L0;
        if (r4 != (-9223372036854775807L)) goto L12;
        return true;
    L12:
        if (r7 <= r4) goto L14;
        return true;
    L14:
        return false;
    }

    public final Surface I0(dk2 r6) {
        r55 r0 = this.h1;
        if (r0 != null) goto L5;
        Surface r1 = this.l1;
        if (r1 == null) goto L10;
        return r1;
    L10:
        if (Build.VERSION.SDK_INT >= 35) goto L12;
    L14:
        rr2.w(Q0(r6));
        pg3 r2 = this.m1;
        if (r2 == null) goto L21;
        if (r2.n == r6.f) goto L21;
        if (r2 == null) goto L21;
        r2.release();
        this.m1 = null;
    L21:
        if (this.m1 != null) goto L61;
        Context r3 = this.U0;
        boolean r7 = r6.f;
        boolean r4 = false;
        if (r7 == true) goto L25;
        int r5 = pg3.q;
    L29:
        boolean r8 = true;
    L30:
        rr2.w(r8);
        og3 r9 = new og3("ExoPlayer:PlaceholderSurface");
        if (r7 == false) goto L33;
        int r10 = pg3.q;
    L34:
        r9.start();
        Handler r11 = new Handler(r9.getLooper(), r9);
        r9.o = r11;
        r9.n = new qy0(r11);
        monitor-enter(r9);
        r9.o.obtainMessage(1, r10, 0).sendToTarget();     // Catch: Throwable -> L45
    L38:
        if (r9.r != null) goto L48;
        if (r9.q != null) goto L48;
        if (r9.p != null) goto L48;
        r9.wait();     // Catch: Throwable -> L45 InterruptedException -> L47
    L47:
        r4 = true;
    L48:
        monitor-exit(r9);     // Catch: Throwable -> L45
        if (r4 == false) goto L51;
        Thread.currentThread().interrupt();
    L51:
        RuntimeException r12 = r9.q;
        if (r12 != null) goto L57;
        Error r13 = r9.p;
        if (r13 != null) goto L56;
        pg3 r14 = r9.r;
        r14.getClass();
        this.m1 = r14;
        goto L61
    L56:
        throw r13;
    L57:
        throw r12;
    L45:
        th = move-exception;
        throw th;
    L33:
        r10 = 0;
        goto L34
    L25:
        if (pg3.b(r3) == true) goto L29;
        r8 = false;
    L61:
        return this.m1;
    L12:
        if (r6.h == false) goto L14;
        return null;
    L5:
        return r0.b();
    }

    @Override // defpackage.gk2
    public final ej0 J(dk2 r9, tb1 r10, tb1 r11) {
        ej0 r0 = r9.b(r10, r11);
        int r1 = r0.e;
        v2 r2 = this.e1;
        r2.getClass();
        if (r11.u <= r2.a) goto L5;
    L6:
        r1 = r1 | 256;
    L8:
        if (H0(r9, r11) <= r2.c) goto L11;
        r1 = r1 | 64;
    L11:
        if (this.q1 == Integer.MIN_VALUE) goto L24;
        float r8 = r10.y;
        if (r8 == (-1.0f)) goto L24;
        float r3 = r11.y;
        if (r3 == (-1.0f)) goto L24;
        if (Math.abs(r3 - r8) <= 1.0f) goto L24;
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 30) goto L23;
        if (r12 != 30) goto L24;
        if (Build.MODEL.startsWith("MiTV") == false) goto L24;
    L23:
        r1 = r1 | 65536;
    L24:
        int r7 = r1;
        String r4 = r9.a;
        if (r7 == 0) goto L28;
        int r13 = 0;
    L30:
        return new ej0(r4, r10, r11, r13, r7);
    L28:
        r13 = r0.d;
        goto L30
    L5:
        if (r11.v <= r2.b) goto L8;
        goto L6
    }

    public final boolean J0(dk2 r3) {
        if (this.h1 != null) goto L18;
        Surface r0 = this.l1;
        if (r0 == null) goto L9;
        if (r0.isValid() == false) goto L9;
        return true;
    L9:
        if (Build.VERSION.SDK_INT < 35) goto L14;
        if (r3.h == false) goto L14;
        return true;
    L14:
        if (Q0(r3) == true) goto L22;
        return false;
    L22:
        return true;
    L18:
        return true;
    }

    @Override // defpackage.gk2
    public final MediaCodecDecoderException K(IllegalStateException r2, dk2 r3) {
        Surface r1 = this.l1;
        MediaCodecVideoDecoderException r0 = new MediaCodecVideoDecoderException(r2, r3);
        System.identityHashCode(r1);
        if (r1 == null) goto L5;
        r1.isValid();
    L5:
        return r0;
    }

    public final boolean K0(cj0 r7) {
        if (l() == false) goto L5;
    L15:
        return true;
    L5:
        if (r7.d(536870912) == true) goto L15;
        long r2 = this.J1;
        if (r2 != (-9223372036854775807L)) goto L11;
        return true;
    L11:
        if ((r2 - (r7.t - this.K0.c)) > 100000) goto L13;
        return true;
    L13:
        return false;
    }

    public final void L0() {
        if (this.s1 <= 0) goto L9;
        this.t.getClass();
        long r0 = SystemClock.elapsedRealtime();
        long r2 = r0 - this.r1;
        int r4 = this.s1;
        rf2 r5 = this.W0;
        Handler r6 = (Handler) r5.n;
        if (r6 == null) goto L7;
        r6.post(new m55(r5, r4, r2));
    L7:
        this.s1 = 0;
        this.r1 = r0;
        return;
    }

    public final void M0() {
        if (this.E1 == false) goto L13;
        ak2 r0 = this.a0;
        if (r0 == null) goto L14;
        this.G1 = new nk2(this, r0);
        if (Build.VERSION.SDK_INT < 33) goto L12;
        Bundle r3 = new Bundle();
        r3.putInt("tunnel-peek", 1);
        r0.c(r3);
        return;
    L12:
        return;
    L14:
        return;
    }

    public final void N0(ak2 r4, int r5, long r6) {
        Trace.beginSection("releaseOutputBuffer");
        r4.l(r5, r6);
        Trace.endSection();
        this.J0.e++;
        boolean r7 = false;
        this.t1 = 0;
        if (this.h1 != null) goto L18;
        s55 r8 = this.B1;
        boolean r9 = r8.equals(s55.d);
        rf2 r0 = this.W0;
        if (r9 == false) goto L7;
    L9:
        e55 r10 = this.Z0;
        if (r10.e == 3) goto L12;
        r7 = true;
    L12:
        r10.e = 3;
        r10.l.getClass();
        r10.g = f35.Q(SystemClock.elapsedRealtime());
        if (r7 == false) goto L19;
        Surface r11 = this.l1;
        if (r11 == null) goto L20;
        r0.j(r11);
        this.o1 = true;
        return;
    L20:
        return;
    L19:
        return;
    L7:
        if (r8.equals(this.C1) == true) goto L9;
        this.C1 = r8;
        r0.o(r8);
        goto L9
    }

    public final void O0(Object r8) {
        if ((r8 instanceof Surface) == false) goto L5;
        Surface r9 = (Surface) r8;
    L6:
        Surface r0 = this.l1;
        rf2 r2 = this.W0;
        if (r0 == r9) goto L43;
        this.l1 = r9;
        r55 r1 = this.h1;
        e55 r3 = this.Z0;
        if (r1 != null) goto L11;
        r3.g(r9);
    L11:
        this.o1 = false;
        int r4 = this.u;
        ak2 r5 = this.a0;
        if (r5 != null) goto L14;
    L28:
        if (r9 == null) goto L32;
        s55 r10 = this.C1;
        if (r10 == null) goto L36;
        r2.o(r10);
    L36:
        if (r4 != 2) goto L41;
        r55 r11 = this.h1;
        if (r11 == null) goto L40;
        r11.r(true);
        goto L41
    L40:
        r3.c(true);
    L41:
        M0();
        return;
    L32:
        this.C1 = null;
        r55 r12 = this.h1;
        if (r12 == null) goto L36;
        r12.k();
        goto L36
    L14:
        if (this.h1 != null) goto L28;
        dk2 r6 = this.h0;
        r6.getClass();
        if (J0(r6) == true) goto L18;
    L27:
        o0();
        Y();
        goto L28
    L18:
        if (this.f1 == true) goto L27;
        Surface r7 = I0(r6);
        if (r7 == null) goto L23;
        r5.r(r7);
        goto L28
    L23:
        if (Build.VERSION.SDK_INT < 35) goto L25;
        r5.i();
        goto L28
    L25:
        tb4.a();
        return;
    L43:
        if (r9 == null) goto L53;
        s55 r13 = this.C1;
        if (r13 == null) goto L47;
        r2.o(r13);
    L47:
        Surface r14 = this.l1;
        if (r14 != null) goto L50;
        return;
    L50:
        if (this.o1 == false) goto L55;
        r2.j(r14);
        return;
    L55:
        return;
    L53:
        return;
    L5:
        r9 = null;
        goto L6
    }

    @Override // defpackage.gk2
    public final int P(cj0 r5) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        return 0;
    L5:
        if (this.v1 != null) goto L10;
        if (this.E1 == true) goto L10;
        return 0;
    L10:
        if (r5.t < this.y) goto L12;
        return 0;
    L12:
        if (K0(r5) == true) goto L19;
        return 32;
    L19:
        return 0;
    }

    public final boolean P0(long r3, long r5, boolean r7, boolean r8) {
        if (this.h1 == null) goto L8;
        if (this.V0 == false) goto L8;
        r5 = r5 - (-this.I1);
    L8:
        if (r3 >= (-500000)) goto L31;
        if (r7 == true) goto L31;
        q44 r4 = this.v;
        r4.getClass();
        int r6 = r4.u(r5 - this.x);
        if (r6 == 0) goto L31;
        this.w1 = r5;
        bj0 r9 = this.J0;
        PriorityQueue r10 = this.d1;
        if (r8 == false) goto L16;
        int r11 = r9.d + r6;
        r9.d = r11;
        r9.f += this.u1;
        r9.d = r10.size() + r11;
    L18:
        if (this.a0 != null) goto L21;
    L27:
        r55 r2 = this.h1;
        if (r2 == null) goto L30;
        r2.o(false);
    L30:
        return true;
    L21:
        if (y0() == false) goto L24;
        o0();
        Y();
        goto L27
    L24:
        if (w0() == false) goto L26;
        N();
        goto L27
    L26:
        this.O0 = true;
        goto L27
    L16:
        r9.j++;
        S0(r10.size() + r6, this.u1);
    L31:
        return false;
    }

    @Override // defpackage.gk2
    public final float Q(float r7, tb1 r8, tb1[] r9) {
        int r0 = r9.length;
        int r2 = 0;
        float r3 = -1.0f;
    L3:
        if (r2 >= r0) goto L9;
        float r4 = r9[r2].y;
        if (r4 == (-1.0f)) goto L7;
        r3 = Math.max(r3, r4);
    L7:
        r2 = r2 + 1;
        goto L3
    L9:
        if (r3 != (-1.0f)) goto L11;
        float r5 = -1.0f;
    L13:
        if (this.v1 == null) goto L43;
        dk2 r6 = this.h0;
        if (r6 == null) goto L43;
        int r10 = r8.u;
        int r11 = r8.v;
        float r1 = -3.4028235E38f;
        if (r6.i == false) goto L39;
        float r12 = r6.l;
        if (r12 != (-3.4028235E38f)) goto L22;
    L26:
        r1 = 1024.0f;
        if (r6.g(r10, r11, 1024.0d) == true) goto L37;
        float r13 = 0.0f;
    L30:
        float r14 = r1 - r13;
        if (Math.abs(r14) <= 5.0f) goto L36;
        float r15 = (r14 / 2.0f) + r13;
        if (r6.g(r10, r11, r15) == true) goto L34;
        r1 = r15;
        goto L30
    L34:
        r13 = r15;
        goto L30
    L36:
        r1 = r13;
    L37:
        r6.l = r1;
        r6.j = r10;
        r6.k = r11;
        goto L39
    L22:
        if (r6.j != r10) goto L26;
        if (r6.k != r11) goto L26;
        r1 = r12;
    L39:
        if (r5 != (-1.0f)) goto L41;
        return r1;
    L41:
        return Math.max(r5, r1);
    L43:
        return r5;
    L11:
        r5 = r3 * r7;
        goto L13
    }

    public final boolean Q0(dk2 r2) {
        if (this.E1 == false) goto L5;
        return false;
    L5:
        if (E0(r2.a) == false) goto L7;
        return false;
    L7:
        if (r2.f == true) goto L9;
        return true;
    L9:
        if (pg3.b(this.U0) == false) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // defpackage.gk2
    public final ArrayList R(kf2 r2, tb1 r3, boolean r4) {
        boolean r0 = this.E1;
        Context r1 = this.U0;
        List r5 = G0(r1, r2, r3, r4, r0);
        HashMap r6 = jk2.a;
        ArrayList r7 = new ArrayList(r5);
        ef0 r8 = new ef0(10, r1, r3);
        Collections.sort(r7, new w60(2, r8));
        return r7;
    }

    public final void R0(ak2 r2, int r3) {
        Trace.beginSection("skipVideoBuffer");
        r2.g(r3);
        Trace.endSection();
        this.J0.f++;
    }

    public final void S0(int r3, int r4) {
        bj0 r0 = this.J0;
        r0.h += r3;
        int r5 = r3 + r4;
        r0.g += r5;
        this.s1 += r5;
        int r6 = this.t1 + r5;
        this.t1 = r6;
        r0.i = Math.max(r6, r0.i);
        int r7 = this.X0;
        if (r7 > 0) goto L5;
        return;
    L5:
        if (this.s1 < r7) goto L9;
        L0();
        return;
    }

    public final void T0(mt2 r5) {
        cu4 r0 = this.C;
        if (r0.p() == false) goto L6;
        this.J1 = -9223372036854775807L;
        return;
    L6:
        int r6 = r0.b(r5.a);
        if (r6 != (-1)) goto L10;
        this.J1 = -9223372036854775807L;
        return;
    L10:
        this.J1 = r0.f(r6, new zt4(), false).d;
    }

    @Override // defpackage.gk2
    public final ml3 U(dk2 r25, tb1 r26, MediaCrypto r27, float r28) {
        String r4 = r25.c;
        tb1[] r5 = this.w;
        r5.getClass();
        int r6 = r26.u;
        float r7 = r26.y;
        c50 r8 = r26.D;
        int r9 = r26.v;
        int r10 = H0(r25, r26);
        if (r5.length != 1) goto L9;
        if (r10 == (-1)) goto L8;
        int r11 = F0(r25, r26);
        if (r11 == (-1)) goto L8;
        r10 = Math.min((int) (r10 * 1.5f), r11);
    L8:
        v2 r12 = new v2(r6, r9, r10);
        c50 r19 = r8;
        int r15 = r9;
    L72:
        this.e1 = r12;
        if (this.E1 == false) goto L75;
        int r2 = this.F1;
    L76:
        MediaFormat r3 = new MediaFormat();
        r3.setString("mime", r4);
        r3.setInteger("width", r6);
        r3.setInteger("height", r15);
        e35.R(r3, r26.q);
        if (r7 == (-1.0f)) goto L79;
        r3.setFloat("frame-rate", r7);
    L79:
        e35.J(r3, "rotation-degrees", r26.z);
        if (r19 == null) goto L85;
        c50 r13 = r19;
        e35.J(r3, "color-transfer", r13.c);
        e35.J(r3, "color-standard", r13.a);
        e35.J(r3, "color-range", r13.b);
        byte[] r14 = r13.d;
        if (r14 == null) goto L85;
        r3.setByteBuffer("hdr-static-info", ByteBuffer.wrap(r14));
    L85:
        if ("video/dolby-vision".equals(r26.n) == false) goto L89;
        Pair r16 = i40.b(r26);
        if (r16 == null) goto L89;
        e35.J(r3, "profile", ((Integer) r16.first).intValue());
    L89:
        r3.setInteger("max-width", r12.a);
        r3.setInteger("max-height", r12.b);
        e35.J(r3, "max-input-size", r12.c);
        r3.setInteger("priority", 0);
        if (r28 == (-1.0f)) goto L93;
        r3.setFloat("operating-rate", r28);
    L93:
        if (this.Y0 == false) goto L95;
        boolean r17 = true;
        r3.setInteger("no-post-process", 1);
        r3.setInteger("auto-frc", 0);
    L96:
        if (r2 == 0) goto L99;
        r3.setFeatureEnabled("tunneled-playback", r17);
        r3.setInteger("audio-session-id", r2);
    L99:
        if (Build.VERSION.SDK_INT < 35) goto L101;
        r3.setInteger("importance", Math.max(0, -this.D1));
    L101:
        H(r3);
        Surface r18 = I0(r25);
        if (this.h1 == null) goto L107;
        if (f35.M(this.U0) == true) goto L107;
        r3.setInteger("allow-frame-drop", 0);
    L107:
        return new ml3(r25, r3, r26, r18, r27, null);
    L95:
        r17 = true;
        goto L96
    L75:
        r2 = 0;
        goto L76
    L9:
        int r110 = r5.length;
        int r111 = r6;
        int r112 = r9;
        int r113 = 0;
        boolean r114 = false;
    L10:
        if (r113 >= r110) goto L27;
        tb1 r115 = r5[r113];
        tb1[] r116 = r5;
        if (r8 != null) goto L14;
    L16:
        ej0 r20 = r25.b(r26, r115);
        int r117 = r110;
        int r118 = r115.v;
        if (r20.d == 0) goto L25;
        int r21 = r115.u;
        byte r119 = -1;
        if (r21 == (-1)) goto L23;
        if (r118 == (-1)) goto L23;
        boolean r120 = false;
    L24:
        r114 = r114 | r120;
        r111 = Math.max(r111, r21);
        r112 = Math.max(r112, r118);
        r10 = Math.max(r10, H0(r25, r115));
    L26:
        r110 = r117;
        r113 = r113 + 1;
        r5 = r116;
    L23:
        r120 = true;
        goto L24
    L25:
        r119 = -1;
        goto L26
    L14:
        if (r115.D != null) goto L16;
        sb1 r22 = r115.a();
        r22.C = r8;
        r115 = new tb1(r22);
        goto L16
    L27:
        if (r114 == false) goto L70;
        l93.q0("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + r111 + "x" + r112);
        if (r9 <= r6) goto L31;
        boolean r23 = true;
    L32:
        if (r23 == false) goto L34;
        int r121 = r9;
    L35:
        boolean r122 = r23;
        if (r23 == false) goto L38;
        int r24 = r6;
    L39:
        float r29 = r24 / r121;
        int r30 = 0;
    L40:
        r19 = r8;
        if (r30 >= 9) goto L67;
        int r31 = M1[r30];
        int r210 = r30;
        int r32 = (int) (r31 * r29);
        if (r31 <= r121) goto L67;
        if (r32 <= r24) goto L67;
        if (r122 == true) goto L50;
        r32 = r31;
    L50:
        if (r122 == false) goto L52;
    L51:
        int r211 = r24;
        MediaCodecInfo.CodecCapabilities r33 = r25.d;
        if (r33 != null) goto L56;
    L55:
        Point r34 = null;
    L60:
        if (r34 == null) goto L64;
        r15 = r9;
        if (r25.g(r34.x, r34.y, r7) == false) goto L65;
    L68:
        if (r34 == null) goto L71;
        r111 = Math.max(r111, r34.x);
        r112 = Math.max(r112, r34.y);
        sb1 r35 = r26.a();
        r35.t = r111;
        r35.u = r112;
        r10 = Math.max(r10, F0(r25, new tb1(r35)));
        l93.q0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + r111 + "x" + r112);
    L71:
        r12 = new v2(r111, r112, r10);
    L65:
        r30 = r210 + 1;
        r9 = r15;
        r8 = r19;
        r24 = r211;
        r121 = r121;
        goto L40
    L64:
        r15 = r9;
        goto L65
    L56:
        MediaCodecInfo.VideoCapabilities r36 = r33.getVideoCapabilities();
        if (r36 == null) goto L55;
        int r37 = r36.getWidthAlignment();
        int r123 = r36.getHeightAlignment();
        r34 = new Point(f35.g(r32, r37) * r37, f35.g(r31, r123) * r123);
        goto L60
    L52:
        r31 = r32;
    L67:
        r15 = r9;
        r34 = null;
        goto L68
    L38:
        r24 = r9;
        goto L39
    L34:
        r121 = r6;
        goto L35
    L31:
        r23 = false;
        goto L32
    L70:
        r19 = r8;
        r15 = r9;
        goto L71
    }

    public final void U0(long r4) {
        bj0 r0 = this.J0;
        r0.k += r4;
        r0.l++;
        this.y1 += r4;
        this.z1++;
    }

    @Override // defpackage.gk2
    public final void V(cj0 r8) {
        if (this.g1 == false) goto L25;
        ByteBuffer r9 = r8.u;
        r9.getClass();
        if (r9.remaining() < 7) goto L19;
        byte r0 = r9.get();
        short r1 = r9.getShort();
        short r2 = r9.getShort();
        byte r3 = r9.get();
        byte r4 = r9.get();
        r9.position(0);
        if (r0 == (-75)) goto L10;
        return;
    L10:
        if (r1 == 60) goto L12;
        return;
    L12:
        if (r2 == 1) goto L14;
        return;
    L14:
        if (r3 != 4) goto L23;
        if (r4 == 0) goto L17;
        if (r4 == 1) goto L17;
        return;
    L17:
        byte[] r5 = new byte[r9.remaining()];
        r9.get(r5);
        r9.position(0);
        ak2 r7 = this.a0;
        r7.getClass();
        Bundle r10 = new Bundle();
        r10.putByteArray("hdr10-plus-info", r5);
        r7.c(r10);
        return;
    L23:
        return;
    L19:
        return;
    }

    @Override // defpackage.gk2
    public final boolean a0(tb1 r4) {
        r55 r0 = this.h1;
        if (r0 != null) goto L5;
        return true;
    L5:
        if (r0.w() == true) goto L15;
        return this.h1.n(r4);
    L8:
        e = move-exception;
        throw b(e, r4, false, 7000);
    L15:
        return true;
    }

    @Override // defpackage.gk2
    public final void b0(Exception r4) {
        l93.G("MediaCodecVideoRenderer", "Video codec error", r4);
        rf2 r3 = this.W0;
        Handler r0 = (Handler) r3.n;
        if (r0 == null) goto L6;
        r0.post(new ur2(28, r3, r4));
        return;
    }

    @Override // defpackage.gk2, defpackage.kq, defpackage.rk3
    public final void c(int r3, Object r4) {
        boolean r0 = true;
        if (r3 != 1) goto L5;
        O0(r4);
        return;
    L5:
        if (r3 != 7) goto L7;
        r4.getClass();
        c55 r5 = (c55) r4;
        this.H1 = r5;
        r55 r2 = this.h1;
        if (r2 == null) goto L96;
        r2.t(r5);
        return;
    L96:
        return;
    L7:
        if (r3 != 10) goto L9;
        r4.getClass();
        int r6 = ((Integer) r4).intValue();
        if (this.F1 == r6) goto L94;
        this.F1 = r6;
        if (this.E1 == false) goto L95;
        o0();
        return;
    L95:
        return;
    L94:
        return;
    L9:
        if (r3 != 4) goto L11;
        r4.getClass();
        int r7 = ((Integer) r4).intValue();
        this.p1 = r7;
        ak2 r8 = this.a0;
        if (r8 == null) goto L93;
        r8.p(r7);
        return;
    L93:
        return;
    L11:
        if (r3 != 5) goto L13;
        r4.getClass();
        int r9 = ((Integer) r4).intValue();
        this.q1 = r9;
        r55 r10 = this.h1;
        if (r10 == null) goto L65;
        r10.j(r9);
        return;
    L65:
        k55 r11 = this.Z0.b;
        if (r11.j == r9) goto L99;
        r11.j = r9;
        r11.d(true);
        return;
    L99:
        return;
    L13:
        if (r3 != 13) goto L15;
        r4.getClass();
        List r12 = (List) r4;
        if (r12.equals(d55.a) == false) goto L57;
        r55 r13 = this.h1;
        if (r13 != null) goto L53;
        return;
    L53:
        if (r13.w() == false) goto L98;
        this.h1.u();
        return;
    L98:
        return;
    L57:
        this.k1 = r12;
        r55 r14 = this.h1;
        if (r14 == null) goto L92;
        r14.p(r12);
        return;
    L92:
        return;
    L15:
        if (r3 != 14) goto L17;
        r4.getClass();
        pf4 r15 = (pf4) r4;
        if (r15.a != 0) goto L43;
        return;
    L43:
        if (r15.b == 0) goto L89;
        this.n1 = r15;
        r55 r16 = this.h1;
        if (r16 == null) goto L90;
        Surface r17 = this.l1;
        r17.getClass();
        r16.v(r17, r15);
        return;
    L90:
        return;
    L89:
        return;
    L17:
        switch(r3) {
            case 16: goto L33;
            case 17: goto L31;
            case 18: goto L21;
            default: goto L18;
        };
    L18:
        super.c(r3, r4);
        return;
    L31:
        Surface r18 = this.l1;
        O0(null);
        r4.getClass();
        ((ok2) r4).c(1, r18);
        return;
    L33:
        r4.getClass();
        this.D1 = ((Integer) r4).intValue();
        ak2 r19 = this.a0;
        if (r19 != null) goto L37;
        return;
    L37:
        if (Build.VERSION.SDK_INT < 35) goto L87;
        Bundle r20 = new Bundle();
        r20.putInt("importance", Math.max(0, -this.D1));
        r19.c(r20);
        return;
    L87:
        return;
    L21:
        if (this.v1 == null) goto L23;
        boolean r21 = true;
    L24:
        i74 r22 = (i74) r4;
        this.v1 = r22;
        if (r22 != null) goto L28;
        r0 = false;
    L28:
        if (r21 == r0) goto L86;
        B0(this.b0);
        return;
    L86:
        return;
    L23:
        r21 = false;
        goto L24
    }

    @Override // defpackage.gk2
    public final void c0(long r10, long r12, String r14) {
        rf2 r1 = this.W0;
        Handler r8 = (Handler) r1.n;
        if (r8 == null) goto L5;
        String r2 = r14;
        r8.post(new om(r1, r2, r10, r12, 1));
    L6:
        this.f1 = E0(r2);
        dk2 r11 = this.h0;
        r11.getClass();
        boolean r13 = false;
        if (Build.VERSION.SDK_INT >= 29) goto L9;
    L21:
        this.g1 = r13;
        M0();
        return;
    L9:
        if ("video/x-vnd.on2.vp9".equals(r11.b) == false) goto L21;
        MediaCodecInfo.CodecCapabilities r15 = r11.d;
        if (r15 == null) goto L14;
        MediaCodecInfo.CodecProfileLevel[] r16 = r15.profileLevels;
        if (r16 == null) goto L14;
    L15:
        int r17 = r16.length;
        int r18 = 0;
    L16:
        if (r18 >= r17) goto L21;
        if (r16[r18].profile == 16384) goto L19;
        r18 = r18 + 1;
        goto L16
    L19:
        r13 = true;
    L14:
        r16 = new MediaCodecInfo.CodecProfileLevel[0];
        goto L15
    L5:
        r2 = r14;
        goto L6
    }

    @Override // defpackage.gk2
    public final void d0(h40 r4) {
        rf2 r3 = this.W0;
        Handler r0 = (Handler) r3.n;
        if (r0 == null) goto L6;
        r0.post(new ur2(26, r3, r4));
        return;
    }

    @Override // defpackage.kq
    public final void e() {
        r55 r0 = this.h1;
        if (r0 == null) goto L12;
        int r2 = this.j1;
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L10;
        r0.x();
        return;
    L10:
        this.j1 = 0;
        return;
    L12:
        e55 r3 = this.Z0;
        if (r3.e != 0) goto L16;
        r3.e = 1;
        return;
    }

    @Override // defpackage.gk2
    public final void e0(String r4) {
        rf2 r3 = this.W0;
        Handler r0 = (Handler) r3.n;
        if (r0 == null) goto L6;
        r0.post(new ur2(29, r3, r4));
        return;
    }

    @Override // defpackage.gk2
    public final ej0 f0(gp3 r6) {
        ej0 r0 = super.f0(r6);
        tb1 r7 = (tb1) r6.p;
        r7.getClass();
        rf2 r1 = this.W0;
        Handler r2 = (Handler) r1.n;
        if (r2 == null) goto L5;
        r2.post(new qo2(r1, r7, r0, 19));
    L5:
        f55 r5 = this.c1;
        if (r5 == null) goto L8;
        r5.b();
    L8:
        return r0;
    }

    @Override // defpackage.gk2
    public final void g0(tb1 r12, MediaFormat r13) {
        ak2 r0 = this.a0;
        if (r0 == null) goto L6;
        r0.p(this.p1);
    L6:
        if (this.E1 == false) goto L8;
        int r14 = r12.u;
        int r1 = r12.v;
    L25:
        float r2 = r12.A;
        int r3 = r12.z;
        if (r3 != 90) goto L28;
    L29:
        r2 = 1.0f / r2;
        int r10 = r1;
        r1 = r14;
        r14 = r10;
    L30:
        this.B1 = new s55(r14, r2, r1);
        r55 r4 = this.h1;
        if (r4 != null) goto L33;
    L39:
        this.Z0.f(r12.y);
    L40:
        this.K1 = false;
        return;
    L33:
        if (this.K1 == false) goto L39;
        sb1 r15 = r12.a();
        r15.t = r14;
        r15.u = r1;
        r15.z = r2;
        tb1 r5 = new tb1(r15);
        int r8 = this.j1;
        List r16 = this.k1;
        if (r16 != null) goto L38;
        vw1 r17 = yw1.o;
        r16 = gy3.r;
    L38:
        r4.g(r5, this.K0.b, r8, r16);
        this.j1 = 2;
        goto L40
    L28:
        if (r3 != 270) goto L30;
    L8:
        r13.getClass();
        if (r13.containsKey("crop-right") == true) goto L11;
    L17:
        boolean r6 = false;
    L18:
        if (r6 == false) goto L20;
        int r7 = (r13.getInteger("crop-right") - r13.getInteger("crop-left")) + 1;
    L21:
        if (r6 == false) goto L23;
        int r18 = (r13.getInteger("crop-bottom") - r13.getInteger("crop-top")) + 1;
    L24:
        int r11 = r7;
        r1 = r18;
        r14 = r11;
        goto L25
    L23:
        r18 = r13.getInteger("height");
        goto L24
    L20:
        r7 = r13.getInteger("width");
        goto L21
    L11:
        if (r13.containsKey("crop-left") == false) goto L17;
        if (r13.containsKey("crop-bottom") == false) goto L17;
        if (r13.containsKey("crop-top") == false) goto L17;
        r6 = true;
        goto L18
    }

    @Override // defpackage.kq
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.gk2
    public final void i0(long r1) {
        super.i0(r1);
        if (this.E1 == true) goto L6;
        this.u1--;
        return;
    }

    @Override // defpackage.gk2
    public final void j0() {
        r55 r0 = this.h1;
        if (r0 == null) goto L8;
        r0.i();
        if (this.I1 != (-9223372036854775807L)) goto L7;
        this.I1 = this.K0.b;
    L7:
        this.h1.h(-this.I1);
    L9:
        this.K1 = true;
        M0();
        return;
    L8:
        this.Z0.e(2);
        goto L9
    }

    @Override // defpackage.gk2
    public final void k0(cj0 r3) {
        this.L1 = 0;
        int r4 = P(r3);
        if (Build.VERSION.SDK_INT < 34) goto L7;
        if ((r4 & 32) == 0) goto L7;
        return;
    L7:
        if (this.E1 == true) goto L11;
        this.u1++;
        return;
    }

    @Override // defpackage.kq
    public final boolean m() {
        if (this.F0 == false) goto L10;
        r55 r1 = this.h1;
        if (r1 != null) goto L7;
        return true;
    L7:
        if (r1.c() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // defpackage.gk2
    public final boolean m0(long r19, long r21, ak2 r23, ByteBuffer r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, tb1 r32) {
        r23.getClass();
        long r4 = r28 - this.K0.c;
        int r0 = 0;
    L3:
        PriorityQueue r8 = this.d1;
        Long r9 = (Long) r8.peek();
        if (r9 == null) goto L8;
        if (r9.longValue() >= r28) goto L8;
        r0 = r0 + 1;
        r8.poll();
    L8:
        S0(r0, 0);
        r55 r10 = this.h1;
        if (r10 == null) goto L16;
        if (r30 == false) goto L15;
        if (r31 == true) goto L15;
        R0(r23, r25);
        return true;
    L15:
        return r10.m(r28, new lk2(this, r23, r25, r4));
    L16:
        int r1 = this.Z0.a(r28, r19, r21, this.K0.b, r30, r31, this.a1);
        pu r5 = this.a1;
        f55 r6 = this.c1;
        if (r6 == null) goto L21;
        if (r1 == 5) goto L21;
        if (r1 == 4) goto L21;
        r6.a(r28, r5.a);
    L21:
        if (r1 == 0) goto L46;
        if (r1 != 1) goto L24;
        long r11 = r5.b;
        long r2 = r5.a;
        if (r11 != this.A1) goto L39;
        R0(r23, r25);
    L44:
        U0(r2);
        this.A1 = r11;
        return true;
    L39:
        c55 r7 = this.H1;
        if (r7 == null) goto L42;
        int r3 = r25;
        r7.d(r4, r11, r32, this.c0);
    L43:
        N0(r23, r3, r11);
        goto L44
    L42:
        r3 = r25;
        goto L43
    L24:
        if (r1 != 2) goto L26;
        Trace.beginSection("dropVideoBuffer");
        r23.g(r25);
        Trace.endSection();
        S0(0, 1);
        U0(r5.a);
        return true;
    L26:
        if (r1 == 3) goto L32;
        if (r1 == 4) goto L31;
        if (r1 == 5) goto L31;
        kf2.o(String.valueOf(r1));
    L31:
        return false;
    L32:
        R0(r23, r25);
        U0(r5.a);
        return true;
    L46:
        this.t.getClass();
        long r12 = System.nanoTime();
        c55 r13 = this.H1;
        if (r13 == null) goto L49;
        r13.d(r4, r12, r32, this.c0);
    L49:
        N0(r23, r25, r12);
        U0(r5.a);
        return true;
    }

    @Override // defpackage.kq
    public final boolean o() {
        if (this.R != null) goto L5;
    L17:
        boolean r0 = false;
    L18:
        r55 r2 = this.h1;
        if (r2 != null) goto L21;
        if (r0 == false) goto L29;
        if (this.a0 != null) goto L26;
    L27:
        return true;
    L26:
        if (this.E1 == true) goto L27;
    L29:
        return this.Z0.b(r0);
    L21:
        return r2.s(r0);
    L5:
        if (l() == false) goto L7;
        boolean r1 = this.A;
    L8:
        if (r1 == false) goto L10;
    L16:
        r0 = true;
        goto L18
    L10:
        if (this.q0 >= 0) goto L16;
        if (this.o0 == (-9223372036854775807L)) goto L17;
        this.t.getClass();
        if (SystemClock.elapsedRealtime() >= this.o0) goto L17;
    L7:
        q44 r3 = this.v;
        r3.getClass();
        r1 = r3.c();
        goto L8
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void p() {
        rf2 r0 = this.W0;
        this.C1 = null;
        this.J1 = -9223372036854775807L;
        M0();
        this.o1 = false;
        this.G1 = null;
        this.x1 = true;
        super.p();     // Catch: Throwable -> L6
        r0.a(this.J0);
        r0.o(s55.d);
        return;
    L6:
        th = move-exception;
        r0.a(this.J0);
        r0.o(s55.d);
        throw th;
    }

    @Override // defpackage.gk2
    public final void p0() {
        r55 r0 = this.h1;
        if (r0 == null) goto L6;
        r0.i();
        return;
    }

    @Override // defpackage.kq
    public final void q(boolean r9, boolean r10) {
        this.J0 = new bj0();
        dz3 r11 = this.q;
        r11.getClass();
        boolean r12 = r11.b;
        int r0 = 0;
        if (r12 == true) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        if (this.E1 == r12) goto L12;
        this.E1 = r12;
        o0();
    L12:
        bj0 r13 = this.J0;
        rf2 r3 = this.W0;
        Handler r4 = (Handler) r3.n;
        if (r4 == null) goto L15;
        r4.post(new n55(r3, r13, r0));
    L15:
        boolean r14 = this.i1;
        e55 r5 = this.Z0;
        if (r14 == false) goto L18;
    L37:
        r55 r15 = this.h1;
        if (r15 == null) goto L52;
        r15.l(new kk2(this));
        c55 r16 = this.H1;
        if (r16 == null) goto L43;
        this.h1.t(r16);
    L43:
        if (this.l1 != null) goto L45;
    L47:
        this.h1.j(this.q1);
        this.h1.e(this.Y);
        List r17 = this.k1;
        if (r17 == null) goto L50;
        this.h1.p(r17);
    L50:
        this.j1 = !r10 ? 1 : 0;
        this.N0 = true;
        return;
    L45:
        if (this.n1.equals(pf4.c) == true) goto L47;
        this.h1.v(this.l1, this.n1);
        goto L47
    L52:
        vp4 r8 = this.t;
        r8.getClass();
        r5.l = r8;
        r5.e(!r10 ? 1 : 0);
        return;
    L18:
        if (this.k1 != null) goto L20;
    L36:
        this.i1 = true;
        goto L37
    L20:
        if (this.h1 != null) goto L36;
        fi3 r18 = new fi3(this.U0, r5);
        r18.d = true;
        long r6 = this.b1;
        long r7 = -9223372036854775807L;
        if (r6 == (-9223372036854775807L)) goto L24;
        r7 = -r6;
    L24:
        r18.g = r7;
        vp4 r19 = this.t;
        r19.getClass();
        r18.e = r19;
        rr2.w(!r18.f);
        if (r18.c != null) goto L27;
        r18.c = new ii3();
    L27:
        ki3 r20 = new ki3(r18);
        r18.f = true;
        if (1 < r20.p) goto L31;
        r20.p = 1;
    L31:
        SparseArray r21 = r20.c;
        if (f35.l(r21, 0) == false) goto L34;
        r55 r22 = (r55) r21.get(0);
    L35:
        this.h1 = r22;
        goto L36
    L34:
        gi3 r23 = new gi3(r20, r20.a);
        r20.g.add(r23);
        r21.put(0, r23);
        r22 = r23;
        goto L35
    L5:
        if (this.F1 != 0) goto L8;
        r2 = false;
        goto L9
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void r(long r5, boolean r7, boolean r8) {
        r55 r0 = this.h1;
        if (r0 == null) goto L6;
        if (r7 == true) goto L6;
        r0.o(true);
    L6:
        if (r8 == false) goto L8;
        this.w1 = r5;
    L8:
        super.r(r5, r7, r8);
        r55 r6 = this.h1;
        e55 r9 = this.Z0;
        if (r6 != null) goto L11;
        r9.b.b();
        r9.h = -9223372036854775807L;
        r9.f = -9223372036854775807L;
        r9.e = Math.min(r9.e, 1);
        r9.i = -9223372036854775807L;
    L11:
        f55 r10 = this.c1;
        if (r10 == null) goto L15;
        r10.b();
    L15:
        if (r7 == false) goto L20;
        r55 r11 = this.h1;
        if (r11 == null) goto L19;
        r11.r(false);
        goto L20
    L19:
        r9.c(false);
    L20:
        M0();
        this.t1 = 0;
    }

    @Override // defpackage.gk2
    public final void r0() {
        super.r0();
        this.d1.clear();
        this.u1 = 0;
        this.L1 = 0;
        this.x1 = false;
    }

    @Override // defpackage.kq
    public final void s() {
        r55 r0 = this.h1;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.V0 == false) goto L9;
        r0.a();
        return;
    }

    @Override // defpackage.kq
    public final void u() {
        this.t0 = false;     // Catch: Throwable -> L11
        q0();     // Catch: Throwable -> L11
        o0();     // Catch: Throwable -> L11
        pw0.b(this.U, null);     // Catch: Throwable -> L9
        this.U = null;     // Catch: Throwable -> L9
        this.i1 = false;
        this.I1 = -9223372036854775807L;
        pg3 r0 = this.m1;
        if (r0 == null) goto L20;
        r0.release();
        this.m1 = null;
        return;
    L20:
        return;
    L9:
        th = move-exception;
        this.i1 = false;
        this.I1 = -9223372036854775807L;
        pg3 r1 = this.m1;
        if (r1 == null) goto L17;
        r1.release();
        this.m1 = null;
    L17:
        throw th;
    L11:
        th = move-exception;
        pw0.b(this.U, null);     // Catch: Throwable -> L9
        this.U = null;     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    }

    @Override // defpackage.kq
    public final void v() {
        this.s1 = 0;
        this.t.getClass();
        this.r1 = SystemClock.elapsedRealtime();
        this.y1 = 0;
        this.z1 = 0;
        r55 r0 = this.h1;
        if (r0 == null) goto L6;
        r0.f();
        return;
    L6:
        this.Z0.d();
    }

    @Override // defpackage.gk2
    public final boolean v0(cj0 r13) {
        boolean r1 = false;
        if (K0(r13) == true) goto L26;
        long r2 = r13.t;
        if (r2 >= this.y) goto L8;
        boolean r0 = true;
    L9:
        f55 r5 = this.c1;
        if (r5 == null) goto L20;
        long r6 = r5.a;
        if (r6 != (-9223372036854775807L)) goto L14;
        long r3 = -9223372036854775807L;
    L16:
        if (r3 == (-9223372036854775807L)) goto L20;
        if (r3 >= this.b1) goto L20;
        boolean r4 = true;
    L21:
        if (r0 == true) goto L25;
        if (r4 == false) goto L26;
    L25:
        if (r13.d(268435456) == true) goto L26;
        if (r13.d(67108864) == false) goto L30;
        r13.r();
        r1 = true;
    L30:
        if (r1 == false) goto L34;
        if (r0 == false) goto L33;
        this.J0.d++;
        goto L34
    L33:
        this.d1.add(Long.valueOf(r13.t));
        this.L1++;
    L34:
        return r1;
    L14:
        r3 = (long) (((r2 - r6) * r5.c) + r5.b);
    L20:
        r4 = false;
        goto L21
    L8:
        r0 = false;
    L26:
        return false;
    }

    @Override // defpackage.kq
    public final void w() {
        L0();
        int r0 = this.z1;
        if (r0 == 0) goto L8;
        long r2 = this.y1;
        rf2 r4 = this.W0;
        Handler r5 = (Handler) r4.n;
        if (r5 == null) goto L7;
        r5.post(new m55(r4, r2, r0));
    L7:
        this.y1 = 0;
        this.z1 = 0;
    L8:
        r55 r1 = this.h1;
        if (r1 == null) goto L11;
        r1.d();
    L15:
        f55 r7 = this.c1;
        if (r7 == null) goto L19;
        r7.b();
        return;
    L19:
        return;
    L11:
        e55 r3 = this.Z0;
        r3.d = false;
        r3.i = -9223372036854775807L;
        k55 r6 = r3.b;
        r6.d = false;
        g55 r8 = r6.c;
        if (r8 == null) goto L14;
        r8.b();
    L14:
        r6.a();
        goto L15
    }

    @Override // defpackage.gk2
    public final boolean w0() {
        tb1 r0 = this.b0;
        long r1 = this.J1;
        if (r1 != (-9223372036854775807L)) goto L5;
    L8:
        boolean r2 = true;
    L10:
        if (this.v1 != null) goto L13;
    L24:
        return true;
    L13:
        if (this.x1 == true) goto L24;
        if (this.E1 == true) goto L24;
        if (r0 != null) goto L18;
    L19:
        if (r2 == true) goto L24;
        if (this.K0.e != (-9223372036854775807L)) goto L24;
        return false;
    L18:
        if (r0.p > 0) goto L24;
    L5:
        if ((this.P0 + (1 + r1)) > (Long.MAX_VALUE - (this.K0.c + r1))) goto L8;
        r2 = false;
        goto L10
    }

    @Override // defpackage.gk2, defpackage.kq
    public final void x(tb1[] r1, long r2, long r4, mt2 r6) {
        super.x(r1, r2, r4, r6);
        T0(r6);
        f55 r0 = this.c1;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // defpackage.gk2
    public final boolean x0(dk2 r1) {
        return J0(r1);
    }

    @Override // defpackage.kq
    public final void y() {
        mt2 r0 = this.D;
        if (r0 == null) goto L6;
        T0(r0);
        return;
    }

    @Override // defpackage.gk2
    public final boolean y0() {
        dk2 r0 = this.h0;
        if (this.h1 == null) goto L12;
        if (r0 == null) goto L12;
        String r1 = r0.a;
        if (r1.equals("c2.mtk.avc.decoder") == false) goto L8;
        return true;
    L8:
        if (r1.equals("c2.mtk.hevc.decoder") == false) goto L12;
        return true;
    L12:
        return super.y0();
    }
}
