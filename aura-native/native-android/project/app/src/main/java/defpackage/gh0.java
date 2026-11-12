package defpackage;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Path;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh0 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final float[] e = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] f = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static final p61 h = new p61("is_user_verifying_platform_authenticator_available_for_credential", 1);
    public static final p61 i = new p61("is_user_verifying_platform_authenticator_available", 1);

    public static long A(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final void B(id idVar, int i2) {
        Object next;
        Iterator<T> it = idVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((c72) ((Map.Entry) next).getKey()).o != i2);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        kf2.k();
    }

    public static final void C(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static void D(int i2, qv2 qv2Var, sb1 sb1Var, qv2 qv2Var2, qv2... qv2VarArr) {
        if (qv2Var2 == null) {
            qv2Var2 = new qv2(new pv2[0]);
        }
        if (qv2Var != null) {
            uw1 uw1VarJ = yw1.j();
            for (pv2 pv2Var : qv2Var.a) {
                if (oi2.class.isAssignableFrom(pv2Var.getClass())) {
                    uw1VarJ.c((pv2) oi2.class.cast(pv2Var));
                }
            }
            vw1 vw1VarM = uw1VarJ.f().listIterator(0);
            while (vw1VarM.hasNext()) {
                oi2 oi2Var = (oi2) vw1VarM.next();
                if (!oi2Var.a.equals("com.android.capture.fps") || i2 == 2) {
                    qv2Var2 = qv2Var2.a(oi2Var);
                }
            }
        }
        for (qv2 qv2Var3 : qv2VarArr) {
            qv2Var2 = qv2Var2.b(qv2Var3);
        }
        if (qv2Var2.a.length > 0) {
            sb1Var.k = qv2Var2;
        }
    }

    public static final void E(List list, nc ncVar) {
        bf3 bf3Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        Path path = ncVar.a;
        Path path2 = ncVar.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        bf3 bf3Var2 = list2.isEmpty() ? je3.c : (bf3) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i2 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i2 < size) {
            bf3 bf3Var3 = (bf3) list2.get(i2);
            if (bf3Var3 instanceof je3) {
                path2.close();
                path2 = path2;
                size = size;
                f10 = f10;
                i2 = i2;
                bf3Var = bf3Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (bf3Var3 instanceof ve3) {
                    ve3 ve3Var = (ve3) bf3Var3;
                    float f17 = ve3Var.c;
                    f13 += f17;
                    float f18 = ve3Var.d;
                    f14 += f18;
                    path2.rMoveTo(f17, f18);
                    path2 = path2;
                    f15 = f13;
                    f16 = f14;
                } else if (bf3Var3 instanceof ne3) {
                    ne3 ne3Var = (ne3) bf3Var3;
                    float f19 = ne3Var.c;
                    float f20 = ne3Var.d;
                    path2.moveTo(f19, f20);
                    f14 = f20;
                    f16 = f14;
                    f13 = f19;
                    f15 = f13;
                } else if (bf3Var3 instanceof ue3) {
                    ue3 ue3Var = (ue3) bf3Var3;
                    float f21 = ue3Var.d;
                    float f22 = ue3Var.c;
                    path2.rLineTo(f22, f21);
                    f13 += f22;
                    f14 += f21;
                } else if (bf3Var3 instanceof me3) {
                    me3 me3Var = (me3) bf3Var3;
                    float f23 = me3Var.d;
                    float f24 = me3Var.c;
                    path2.lineTo(f24, f23);
                    f13 = f24;
                    f14 = f23;
                } else if (bf3Var3 instanceof te3) {
                    float f25 = ((te3) bf3Var3).c;
                    path2.rLineTo(f25, f10);
                    f13 += f25;
                } else if (bf3Var3 instanceof le3) {
                    float f26 = ((le3) bf3Var3).c;
                    path2.lineTo(f26, f14);
                    f13 = f26;
                } else {
                    if (bf3Var3 instanceof ze3) {
                        f9 = ((ze3) bf3Var3).c;
                        path2.rLineTo(f10, f9);
                    } else if (bf3Var3 instanceof af3) {
                        float f27 = ((af3) bf3Var3).c;
                        path2.lineTo(f13, f27);
                        f14 = f27;
                    } else if (bf3Var3 instanceof se3) {
                        se3 se3Var = (se3) bf3Var3;
                        path2.rCubicTo(se3Var.c, se3Var.d, se3Var.e, se3Var.f, se3Var.g, se3Var.h);
                        f11 = se3Var.e + f13;
                        f12 = se3Var.f + f14;
                        f13 += se3Var.g;
                        f9 = se3Var.h;
                    } else {
                        if (bf3Var3 instanceof ke3) {
                            ke3 ke3Var = (ke3) bf3Var3;
                            path2.cubicTo(ke3Var.c, ke3Var.d, ke3Var.e, ke3Var.f, ke3Var.g, ke3Var.h);
                            f11 = ke3Var.e;
                            f12 = ke3Var.f;
                            f5 = ke3Var.g;
                            f6 = ke3Var.h;
                        } else if (bf3Var3 instanceof xe3) {
                            if (bf3Var2.a) {
                                f8 = f14 - f12;
                                f7 = f13 - f11;
                            } else {
                                f7 = f10;
                                f8 = f7;
                            }
                            xe3 xe3Var = (xe3) bf3Var3;
                            path2.rCubicTo(f7, f8, xe3Var.c, xe3Var.d, xe3Var.e, xe3Var.f);
                            f11 = xe3Var.c + f13;
                            f12 = xe3Var.d + f14;
                            f13 += xe3Var.e;
                            f9 = xe3Var.f;
                        } else if (bf3Var3 instanceof pe3) {
                            if (bf3Var2.a) {
                                f13 = (f13 * 2.0f) - f11;
                                f14 = (2.0f * f14) - f12;
                            }
                            pe3 pe3Var = (pe3) bf3Var3;
                            path2.cubicTo(f13, f14, pe3Var.c, pe3Var.d, pe3Var.e, pe3Var.f);
                            f11 = pe3Var.c;
                            f12 = pe3Var.d;
                            f5 = pe3Var.e;
                            f6 = pe3Var.f;
                        } else if (bf3Var3 instanceof we3) {
                            we3 we3Var = (we3) bf3Var3;
                            float f28 = we3Var.f;
                            float f29 = we3Var.e;
                            float f30 = we3Var.d;
                            float f31 = we3Var.c;
                            path2.rQuadTo(f31, f30, f29, f28);
                            float f32 = f31 + f13;
                            float f33 = f30 + f14;
                            f13 += f29;
                            f14 += f28;
                            f11 = f32;
                            f12 = f33;
                        } else {
                            if (bf3Var3 instanceof oe3) {
                                oe3 oe3Var = (oe3) bf3Var3;
                                float f34 = oe3Var.f;
                                float f35 = oe3Var.e;
                                float f36 = oe3Var.d;
                                f4 = oe3Var.c;
                                path2.quadTo(f4, f36, f35, f34);
                                f14 = f34;
                                f13 = f35;
                                f12 = f36;
                            } else if (bf3Var3 instanceof ye3) {
                                if (bf3Var2.b) {
                                    f2 = f13 - f11;
                                    f3 = f14 - f12;
                                } else {
                                    f2 = f10;
                                    f3 = f2;
                                }
                                ye3 ye3Var = (ye3) bf3Var3;
                                float f37 = ye3Var.d;
                                float f38 = ye3Var.c;
                                path2.rQuadTo(f2, f3, f38, f37);
                                f4 = f2 + f13;
                                float f39 = f3 + f14;
                                f13 += f38;
                                f14 += f37;
                                f12 = f39;
                            } else if (bf3Var3 instanceof qe3) {
                                if (bf3Var2.b) {
                                    f13 = (f13 * 2.0f) - f11;
                                    f14 = (2.0f * f14) - f12;
                                }
                                qe3 qe3Var = (qe3) bf3Var3;
                                float f40 = qe3Var.d;
                                float f41 = qe3Var.c;
                                path2.quadTo(f13, f14, f41, f40);
                                path2 = path2;
                                size = size;
                                f10 = f10;
                                i2 = i2;
                                f12 = f14;
                                bf3Var = bf3Var3;
                                f14 = f40;
                                f11 = f13;
                                f13 = f41;
                            } else if (bf3Var3 instanceof re3) {
                                re3 re3Var = (re3) bf3Var3;
                                float f42 = re3Var.h + f13;
                                float f43 = re3Var.i + f14;
                                size = size;
                                f10 = 0.0f;
                                path2 = path2;
                                i2 = i2;
                                i(ncVar, f13, f14, f42, f43, re3Var.c, re3Var.d, re3Var.e, re3Var.f, re3Var.g);
                                f11 = f42;
                                f13 = f11;
                                f12 = f43;
                                f14 = f12;
                                bf3Var = bf3Var3;
                            } else {
                                path2 = path2;
                                size = size;
                                f10 = f10;
                                i2 = i2;
                                if (!(bf3Var3 instanceof ie3)) {
                                    er1.n();
                                    return;
                                }
                                ie3 ie3Var = (ie3) bf3Var3;
                                float f44 = ie3Var.i;
                                float f45 = ie3Var.h;
                                bf3Var = bf3Var3;
                                i(ncVar, f13, f14, f45, f44, ie3Var.c, ie3Var.d, ie3Var.e, ie3Var.f, ie3Var.g);
                                f12 = f44;
                                f14 = f12;
                                f11 = f45;
                                f13 = f11;
                            }
                            size = size;
                            f10 = f10;
                            i2 = i2;
                            bf3Var = bf3Var3;
                            f11 = f4;
                        }
                        f14 = f6;
                        f13 = f5;
                    }
                    f14 += f9;
                }
                bf3Var = bf3Var3;
            }
            i2++;
            list2 = list;
            size = size;
            path2 = path2;
            bf3Var2 = bf3Var;
            f10 = f10;
        }
    }

    public static final String F(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final void G(final nc1 nc1Var) {
        if (u52.c().a) {
            u52.f();
            return;
        }
        if (Build.VERSION.SDK_INT >= 37 && nc1Var.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK") != 0) {
            nc1Var.startActivity(new Intent(nc1Var, (Class<?>) LanPlaybackActivity.class));
            return;
        }
        Object systemService = nc1Var.getSystemService("servicediscovery");
        systemService.getClass();
        final NsdManager nsdManager = (NsdManager) systemService;
        final Handler handler = new Handler(Looper.getMainLooper());
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final ArrayAdapter arrayAdapter = new ArrayAdapter(nc1Var, R.layout.simple_list_item_1);
        final fx3 fx3Var = new fx3();
        final fx3 fx3Var2 = new fx3();
        vg2 vg2Var = new vg2(nc1Var, 0);
        vg2Var.p(app.homemusic.R.string.lan_choose_device);
        a9 a9Var = vg2Var.a;
        a9Var.q = arrayAdapter;
        a9Var.r = null;
        vg2Var.k(app.homemusic.R.string.lan_pair_title, new vr(3, nc1Var));
        final f9 f9VarCreate = vg2Var.j(R.string.cancel, null).create();
        final v42 v42Var = new v42(handler, fx3Var, f9VarCreate, linkedHashMap, arrayAdapter);
        final wo1 wo1Var = new wo1(1, f9VarCreate);
        nc1Var.n.a(wo1Var);
        f9VarCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: s42
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NsdManager nsdManager2 = nsdManager;
                v42 v42Var2 = v42Var;
                fx3Var.n = true;
                nc1Var.n.f(wo1Var);
                try {
                    nsdManager2.stopServiceDiscovery(v42Var2);
                } catch (Throwable unused) {
                }
            }
        });
        f9VarCreate.show();
        f9VarCreate.setTitle(app.homemusic.R.string.lan_searching);
        f9VarCreate.t.f.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: t42
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                NsdManager nsdManager2 = nsdManager;
                fx3 fx3Var3 = fx3Var;
                Handler handler2 = handler;
                nc1 nc1Var2 = nc1Var;
                fx3 fx3Var4 = fx3Var2;
                if (fx3Var4.n) {
                    return;
                }
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) linkedHashMap.get(arrayAdapter.getItem(i2));
                if (nsdServiceInfo == null) {
                    return;
                }
                fx3Var4.n = true;
                f9 f9Var = f9VarCreate;
                f9Var.setTitle(app.homemusic.R.string.lan_connecting);
                try {
                    nsdManager2.resolveService(nsdServiceInfo, new u42(handler2, fx3Var4, fx3Var3, f9Var, nc1Var2));
                } catch (Exception e2) {
                    fx3Var4.n = false;
                    w42.a.a("Controller could not resolve device", e2);
                    if (fx3Var3.n) {
                        return;
                    }
                    f9Var.setTitle(app.homemusic.R.string.lan_connection_error);
                }
            }
        });
        try {
            nsdManager.discoverServices("_tempus-lan._tcp.", 1, v42Var);
        } catch (Exception unused) {
            f9VarCreate.setTitle(app.homemusic.R.string.lan_discovery_error);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [rp, tu3] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList H(hg4 hg4Var, int i2, Integer num) {
        tu3 tu3Var = new tu3(hg4Var);
        i2 = hg4Var.q(i2);
        mg1 mg1VarA = hg4Var.a(i2);
        while (i2 >= 0) {
            tu3Var.l(hg4Var.i(i2), hg4Var.k(i2) ? hg4Var.p(hg4Var.b, i2) : j80.a, hg4Var.a.g(i2), num);
            if (i2 >= 0) {
                mg1 mg1Var = mg1VarA;
                mg1VarA = hg4Var.a(i2);
                i2 = hg4Var.q(i2);
                num = mg1Var;
            } else {
                num = mg1VarA;
            }
        }
        return (ArrayList) tu3Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [eo0, java.lang.Object, rx4] */
    /* JADX WARN: Type inference failed for: r11v0, types: [if1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void I(rx4 rx4Var, if1 if1Var) {
        w12 w12Var;
        cx2 cx2Var = (cx2) rx4Var;
        if (!cx2Var.n.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var2 = cx2Var.n.r;
        c72 c72VarO = j51.O(rx4Var);
        while (c72VarO != null) {
            if ((((cx2) c72VarO.Q.g).q & 262144) != 0) {
                while (cx2Var2 != null) {
                    if ((cx2Var2.p & 262144) != 0) {
                        cx2 C = cx2Var2;
                        f13 f13Var = null;
                        while (C != 0) {
                            boolean zBooleanValue = true;
                            if (C instanceof rx4) {
                                rx4 rx4Var2 = (rx4) C;
                                if (h12.c(rx4Var.f(), rx4Var2.f()) && rx4Var.getClass() == rx4Var2.getClass()) {
                                    zBooleanValue = ((Boolean) if1Var.invoke(rx4Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((C.p & 262144) != 0 && (C instanceof fo0)) {
                                cx2 cx2Var3 = ((fo0) C).C;
                                int i2 = 0;
                                while (cx2Var3 != null) {
                                    if ((cx2Var3.p & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            C = C;
                                            f13Var = f13Var;
                                            f13Var = f13Var;
                                            C = cx2Var3;
                                        } else {
                                            if (f13Var == 0) {
                                                f13Var = new f13(new cx2[16]);
                                            }
                                            if (C != 0) {
                                                f13Var.b(C);
                                                C = 0;
                                            }
                                            f13Var.b(cx2Var3);
                                        }
                                    } else {
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                    cx2Var3 = cx2Var3.s;
                                    C = C;
                                    f13Var = f13Var;
                                }
                                if (i2 == 1) {
                                    C = C;
                                    f13Var = f13Var;
                                } else {
                                    C = C;
                                    f13Var = f13Var;
                                }
                            }
                            C = j51.c(f13Var);
                        }
                    }
                    cx2Var2 = cx2Var2.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var2 = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, rx4] */
    /* JADX WARN: Type inference failed for: r13v0, types: [if1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void J(rx4 rx4Var, if1 if1Var) {
        if (!((cx2) rx4Var).n.A) {
            cz1.b("visitSubtreeIf called on an unattached node");
        }
        f13 f13Var = new f13(new cx2[16]);
        cx2 cx2Var = ((cx2) rx4Var).n;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 == null) {
            j51.b(f13Var, cx2Var);
        } else {
            f13Var.b(cx2Var2);
        }
        while (true) {
            int i2 = f13Var.p;
            if (i2 == 0) {
                return;
            }
            cx2 cx2Var3 = (cx2) f13Var.k(i2 - 1);
            if ((cx2Var3.q & 262144) != 0) {
                cx2 cx2Var4 = cx2Var3;
                while (true) {
                    if (cx2Var4 != null && cx2Var4.A) {
                        if ((cx2Var4.p & 262144) != 0) {
                            cx2 C = cx2Var4;
                            f13 f13Var2 = null;
                            while (C != 0) {
                                if (C instanceof rx4) {
                                    rx4 rx4Var2 = (rx4) C;
                                    qx4 qx4Var = (h12.c(rx4Var.f(), rx4Var2.f()) && rx4Var.getClass() == rx4Var2.getClass()) ? (qx4) if1Var.invoke(rx4Var2) : qx4.n;
                                    if (qx4Var != qx4.p) {
                                        if (qx4Var == qx4.o) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((C.p & 262144) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var5 = ((fo0) C).C;
                                    int i3 = 0;
                                    C = C;
                                    f13Var2 = f13Var2;
                                    while (cx2Var5 != null) {
                                        if ((cx2Var5.p & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                f13Var2 = f13Var2;
                                                C = cx2Var5;
                                            } else {
                                                if (f13Var2 == 0) {
                                                    f13Var2 = new f13(new cx2[16]);
                                                }
                                                if (C != 0) {
                                                    f13Var2.b(C);
                                                    C = 0;
                                                }
                                                f13Var2.b(cx2Var5);
                                            }
                                        }
                                        cx2Var5 = cx2Var5.s;
                                        C = C;
                                        f13Var2 = f13Var2;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                C = j51.c(f13Var2);
                            }
                        }
                        cx2Var4 = cx2Var4.s;
                    }
                }
            }
            j51.b(f13Var, cx2Var3);
        }
    }

    public static final dd5 K(List list, dd5 dd5Var) {
        dd5 dd5VarB;
        list.getClass();
        dd5Var.getClass();
        oh0 oh0Var = dd5Var.e;
        boolean zB = oh0Var.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zB2 = oh0Var.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zB3 = oh0Var.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zB && zB2 && zB3) {
            String str = dd5Var.c;
            nh0 nh0Var = new nh0(0);
            nh0Var.a(oh0Var.a);
            LinkedHashMap linkedHashMap = nh0Var.a;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            oh0 oh0Var2 = new oh0(linkedHashMap);
            bu.E(oh0Var2);
            dd5VarB = dd5.b(dd5Var, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", oh0Var2, 0, 0L, 0, 0, 0L, 0, 16777195);
        } else {
            dd5VarB = dd5Var;
        }
        if (Build.VERSION.SDK_INT < 26) {
            mc0 mc0Var = dd5VarB.j;
            String str2 = dd5VarB.c;
            if (!h12.c(str2, ConstraintTrackingWorker.class.getName()) && (mc0Var.e || mc0Var.f)) {
                nh0 nh0Var2 = new nh0(0);
                oh0 oh0Var3 = dd5VarB.e;
                oh0Var3.getClass();
                nh0Var2.a(oh0Var3.a);
                LinkedHashMap linkedHashMap2 = nh0Var2.a;
                linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                oh0 oh0Var4 = new oh0(linkedHashMap2);
                bu.E(oh0Var4);
                return dd5.b(dd5VarB, null, 0, ConstraintTrackingWorker.class.getName(), oh0Var4, 0, 0L, 0, 0, 0L, 0, 16777195);
            }
        }
        return dd5VarB;
    }

    public static void L(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int M(gi5 gi5Var) {
        Iterator it = gi5Var.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            L(parcel, (Parcelable) list.get(i2));
        }
    }

    public static void c(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [rp, tu3] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [mg1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List d(lg4 lg4Var, Integer num, int i2, Integer num2) {
        int iE;
        int iS;
        q03 q03Var;
        if (lg4Var.w || lg4Var.p() == 0) {
            return u01.n;
        }
        tu3 tu3Var = new tu3(lg4Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = lg4Var.v;
            if (iE < 0) {
                iE = lg4Var.E(lg4Var.b, i2);
            }
        }
        if (num == 0) {
            int iN = lg4Var.i - lg4Var.N(lg4Var.b, lg4Var.r(i2));
            i03 i03Var = lg4Var.s;
            num = Integer.valueOf(iN + ((i03Var == null || (q03Var = (q03) i03Var.b(i2)) == null) ? 0 : q03Var.b));
        }
        int iR = lg4Var.r(i2) * 5;
        int[] iArr = lg4Var.b;
        if (iR < iArr.length) {
            iS = lg4Var.s(i2);
        } else {
            int iE2 = iE >= 0 ? lg4Var.E(iArr, iE) : iE;
            iS = lg4Var.s(iE);
            int i3 = iE;
            iE = iE2;
            i2 = i3;
        }
        while (i2 >= 0) {
            tu3Var.l(iS, (lg4Var.b[(lg4Var.r(i2) * 5) + 1] & 536870912) != 0 ? lg4Var.t(i2) : j80.a, lg4Var.O(i2), num);
            num = lg4Var.b(i2);
            if (iE >= 0) {
                int iE3 = lg4Var.E(lg4Var.b, iE);
                iS = lg4Var.s(iE);
                int i4 = iE;
                iE = iE3;
                i2 = i4;
            } else {
                i2 = iE;
            }
        }
        return (ArrayList) tu3Var.a;
    }

    public static final void e(WorkDatabase workDatabase, r90 r90Var, mc5 mc5Var) {
        int i2;
        workDatabase.getClass();
        r90Var.getClass();
        ArrayList arrayListQ = gb.Q(mc5Var);
        int i3 = 0;
        while (!arrayListQ.isEmpty()) {
            List list = ((mc5) v40.q0(arrayListQ)).d;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((bd5) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        fd5 fd5VarA = workDatabase.A();
        fd5VarA.getClass();
        w24 w24VarB = w24.b(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = fd5VarA.a;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            int i4 = cursorH.moveToFirst() ? cursorH.getInt(0) : 0;
            cursorH.close();
            w24VarB.j();
            int i5 = r90Var.j;
            if (i4 + i3 <= i5) {
                return;
            }
            kf2.n(f34.i(b11.t("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", i5, i4, ";\ncurrent enqueue operation count: "), i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        } catch (Throwable th) {
            cursorH.close();
            w24VarB.j();
            throw th;
        }
    }

    public static void f(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                nz2.n(f34.f(i3, "at index "));
                return;
            }
        }
    }

    public static long g(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        StringBuilder sb = new StringBuilder("overflow: checkedAdd(");
        sb.append(j);
        sb.append(", ");
        throw new ArithmeticException(b11.p(sb, j2, ")"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long h(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (ue2.a[roundingMode.ordinal()]) {
            case 1:
                l93.n(j4 == 0);
                return j3;
            case 2:
                return j3;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (i2 >= 0) {
                    return j3;
                }
                return j3 + ((long) i2);
            case 4:
                return j3 + ((long) i2);
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i2);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i2);
            default:
                throw new AssertionError();
        }
    }

    public static final void i(nc ncVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            i(ncVar, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan3 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan3 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i2 = 0;
        double d39 = d35;
        double d40 = d3;
        while (i2 < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i3 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            ncVar.a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            dSin2 = dSin2;
            d27 = d27;
            d2 = d42;
            i2++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i3;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final Integer j(hg4 hg4Var, u80 u80Var, int i2, int i3) {
        Integer numJ;
        int[] iArr = hg4Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (hg4Var.j(i2) && hg4Var.i(i2) == 206 && h12.c(hg4Var.p(iArr, i2), l80.e)) {
                Object objH = hg4Var.h(i2, 0);
                wg1 wg1Var = objH instanceof wg1 ? (wg1) objH : null;
                vy3 vy3Var = wg1Var != null ? wg1Var.a : null;
                og1 og1Var = vy3Var instanceof og1 ? (og1) vy3Var : null;
                if (og1Var != null && og1Var.n == u80Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (hg4Var.d(i2) && (numJ = j(hg4Var, u80Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numJ.intValue());
            }
            i2 = i4;
        }
    }

    public static long k(zw zwVar, int i2) throws IOException {
        if (i2 > 8) {
            kf2.n("Can't read more than eight bytes into a long value");
            return 0L;
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long jP = zwVar.p();
            if (jP == -1) {
                mj0.i("Premature end of data");
                return 0L;
            }
            j |= jP << (i3 * 8);
        }
        return j;
    }

    public static long l(DataInputStream dataInputStream) {
        long unsignedByte = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            unsignedByte |= ((long) dataInputStream.readUnsignedByte()) << (i2 * 8);
        }
        return unsignedByte;
    }

    public static long m(byte[] bArr, int i2, int i3) {
        if (i3 > 8) {
            kf2.n("Can't read more than eight bytes into a long value");
            return 0L;
        }
        long j = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j |= (((long) bArr[i2 + i4]) & 255) << (i4 * 8);
        }
        return j;
    }

    public static long n(long j, long j2) {
        l93.l("a", j);
        l93.l("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final String o(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ms4 p(e94 e94Var) {
        if1 if1Var;
        ArrayList arrayList = new ArrayList();
        Object objG = e94Var.n.g(d94.a);
        if (objG == null) {
            objG = null;
        }
        w2 w2Var = (w2) objG;
        if (w2Var == null || (if1Var = (if1) w2Var.b) == null || !((Boolean) if1Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (ms4) arrayList.get(0);
    }

    public static final tf0 q(f75 f75Var) {
        return f75Var instanceof ml1 ? ((ml1) f75Var).b() : sf0.b;
    }

    public static final b75 r(f75 f75Var) {
        return f75Var instanceof ml1 ? ((ml1) f75Var).a() : un0.b;
    }

    public static String s(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbJ = xa3.j("<", str2, " threw ");
                    sbJ.append(e2.getClass().getName());
                    sbJ.append(">");
                    string = sbJ.toString();
                }
            }
            objArr[i3] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:137:0x021b  */
    public static final long t(String str, int i2, int i3) {
        char cCharAt;
        int i4;
        long j;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        char c4;
        int i10;
        int i11;
        int i12;
        int i13;
        long j3 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z = cCharAt2 == '-';
        if (z) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i14 = i4;
        long j4 = 0;
        while (true) {
            if (i14 == i3) {
                j = j3;
                break;
            }
            j = j3;
            int i15 = cCharAt - '0';
            if (((char) i15) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + ((long) i15);
            i14++;
            cCharAt = i14 < length ? str.charAt(i14) : (char) 0;
            j3 = j;
        }
        int i16 = i14 - i4;
        char c5 = '0';
        if (i14 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i14;
            i6 = i5;
            i7 = 0;
        } else {
            int i17 = i14 + 1;
            c2 = ' ';
            i5 = i17;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i13 = i17;
                    break;
                }
                i13 = i17;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j5 = jCharAt - 13511005043687472L;
                int i18 = (((jCharAt + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i18 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + ((long) i18);
                i5 += 4;
                i17 = i13;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i5 == i3) {
                        break loop2;
                    }
                    int i19 = cCharAt - '0';
                    if (((char) i19) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + ((long) i19);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i13 - i5;
            i16 -= i7;
            i6 = i13;
        }
        if (i16 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i12 = i7;
                    break;
                }
                int i20 = cCharAt5 - c5;
                i12 = i7;
                if (((char) i20) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i20;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i12;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i12 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i21 = 19;
        if (i16 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i22 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i21;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i16--;
                }
                i22++;
                cCharAt6 = i22 < length ? str.charAt(i22) : (char) 0;
                i21 = 19;
            }
            if (i16 > i10) {
                char cCharAt7 = str.charAt(i4);
                long j6 = 0;
                while (true) {
                    if (i4 == i14) {
                        i11 = i14;
                        break;
                    }
                    char c7 = cCharAt7;
                    i11 = i14;
                    if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j6 = (j6 * 10) + ((long) (c7 - '0'));
                    i4++;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                    i14 = i11;
                }
                if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i7 = (i11 - i4) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i23 = i6;
                    while (i23 != i5 && Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j6 = (j6 * 10) + ((long) (cCharAt8 - '0'));
                        i23++;
                        cCharAt8 = i23 < length ? str.charAt(i23) : (char) 0;
                    }
                    i7 = (i6 - i23) + i9;
                }
                j2 = j6;
                c4 = c3;
            } else {
                j2 = j4;
                c4 = 0;
            }
        } else {
            j2 = j4;
            c4 = 0;
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
            float f2 = j2;
            float[] fArr = e;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j);
        }
        if (j2 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z ? -0.0f : 0.0f)) & j);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j);
        }
        long j7 = f[i7 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        long j8 = j2 << iNumberOfLeadingZeros;
        long j9 = j8 & j;
        long j10 = j8 >>> c2;
        long j11 = j7 & j;
        long j12 = j7 >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j)) >>> c2) + (j14 >>> c2);
        int i24 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i24 + 9);
        int i25 = iNumberOfLeadingZeros + (i24 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i25--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i25);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L)))) & j);
    }

    public static we u(be3 be3Var) {
        String str;
        int iM = be3Var.m();
        if (be3Var.m() != 1684108385) {
            l93.q0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = be3Var.m();
        byte[] bArr = wu.a;
        int i2 = iM2 & 16777215;
        if (i2 == 13) {
            str = "image/jpeg";
        } else {
            str = i2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            xa3.m(i2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        be3Var.O(4);
        int i3 = iM - 16;
        byte[] bArr2 = new byte[i3];
        be3Var.k(bArr2, 0, i3);
        return new we(str, null, 3, bArr2);
    }

    public static ds4 v(int i2, be3 be3Var, String str) {
        int iM = be3Var.m();
        if (be3Var.m() == 1684108385 && iM >= 22) {
            be3Var.O(10);
            int iH = be3Var.H();
            if (iH > 0) {
                String strF = f34.f(iH, "");
                int iH2 = be3Var.H();
                if (iH2 > 0) {
                    strF = strF + "/" + iH2;
                }
                return new ds4(str, null, yw1.o(strF));
            }
        }
        l93.q0("MetadataUtil", "Failed to parse index/count attribute: ".concat(uv.c(i2)));
        return null;
    }

    public static int w(be3 be3Var) {
        int iM = be3Var.m();
        if (be3Var.m() == 1684108385) {
            be3Var.O(8);
            int i2 = iM - 16;
            if (i2 == 1) {
                return be3Var.A();
            }
            if (i2 == 2) {
                return be3Var.H();
            }
            if (i2 == 3) {
                return be3Var.D();
            }
            if (i2 == 4 && (be3Var.j() & 128) == 0) {
                return be3Var.E();
            }
        }
        l93.q0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static nv1 x(int i2, String str, be3 be3Var, boolean z, boolean z2) {
        int iW = w(be3Var);
        if (z2) {
            iW = Math.min(1, iW);
        }
        if (iW >= 0) {
            return z ? new ds4(str, null, yw1.o(Integer.toString(iW))) : new l60("und", str, Integer.toString(iW));
        }
        l93.q0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(uv.c(i2)));
        return null;
    }

    public static ds4 y(int i2, be3 be3Var, String str) {
        int iM = be3Var.m();
        if (be3Var.m() == 1684108385) {
            be3Var.O(8);
            return new ds4(str, null, yw1.o(be3Var.w(iM - 16)));
        }
        l93.q0("MetadataUtil", "Failed to parse text attribute: ".concat(uv.c(i2)));
        return null;
    }

    public static final Object z(Object[] objArr, m54 m54Var, gf1 gf1Var, rg1 rg1Var, int i2) {
        m54 m54Var2;
        final Object obj;
        Object objD;
        final Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        long j = rg1Var.T;
        ya4.g(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        m54Var.getClass();
        final x44 x44Var = (x44) rg1Var.i(z44.a);
        Object objH = rg1Var.H();
        Object obj2 = j80.a;
        if (objH == obj2) {
            Object objF = (x44Var == null || (objD = x44Var.d(string)) == null) ? null : m54Var.f(objD);
            if (objF == null) {
                objF = gf1Var.invoke();
            }
            m54Var2 = m54Var;
            Object t44Var = new t44(m54Var2, x44Var, string, objF, objArrCopyOf);
            rg1Var.b0(t44Var);
            objH = t44Var;
        } else {
            m54Var2 = m54Var;
        }
        final t44 t44Var2 = (t44) objH;
        Object objInvoke = Arrays.equals(objArrCopyOf, t44Var2.r) ? t44Var2.q : null;
        if (objInvoke == null) {
            objInvoke = gf1Var.invoke();
        }
        boolean zG = rg1Var.g(t44Var2) | rg1Var.g(m54Var2) | rg1Var.g(x44Var) | rg1Var.e(string) | rg1Var.g(objInvoke) | rg1Var.g(objArrCopyOf);
        Object objH2 = rg1Var.H();
        if (zG || objH2 == obj2) {
            obj = objInvoke;
            final m54 m54Var3 = m54Var2;
            Object obj3 = new gf1() { // from class: wy3
                @Override // defpackage.gf1
                public final Object invoke() throws IOException {
                    boolean z;
                    t44 t44Var3 = t44Var2;
                    x44 x44Var2 = t44Var3.o;
                    x44 x44Var3 = x44Var;
                    boolean z2 = true;
                    if (x44Var2 != x44Var3) {
                        t44Var3.o = x44Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = t44Var3.p;
                    String str2 = string;
                    if (h12.c(str, str2)) {
                        z2 = z;
                    } else {
                        t44Var3.p = str2;
                    }
                    t44Var3.n = m54Var3;
                    t44Var3.q = obj;
                    t44Var3.r = objArrCopyOf;
                    c12 c12Var = t44Var3.s;
                    if (c12Var != null && z2) {
                        c12Var.k();
                        t44Var3.s = null;
                        t44Var3.b();
                    }
                    return j15.a;
                }
            };
            rg1Var.b0(obj3);
            objH2 = obj3;
        } else {
            obj = objInvoke;
        }
        ya3 ya3Var = rg1Var.M.b.n;
        ya3Var.x0(ma3.f);
        rr2.R(ya3Var, 0, (gf1) objH2);
        return obj;
    }
}
