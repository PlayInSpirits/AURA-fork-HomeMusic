package defpackage;

import android.R;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Path;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.widget.ArrayAdapter;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import java.io.DataInputStream;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh0 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final float[] e = null;
    public static final long[] f = null;
    public static final StackTraceElement[] g = null;
    public static final p61 h = null;
    public static final p61 i = null;

    static {
        a = new int[]{R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
        b = new int[]{R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
        c = new int[]{R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
        d = new int[]{R.attr.name, R.attr.pathData};
        e = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        f = new long[]{-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
        g = new StackTraceElement[0];
        h = new p61("is_user_verifying_platform_authenticator_available_for_credential", 1);
        i = new p61("is_user_verifying_platform_authenticator_available", 1);
    }

    public static long A(long r9, long r11) {
        int r1 = Long.numberOfLeadingZeros(~r11) + (Long.numberOfLeadingZeros(r11) + (Long.numberOfLeadingZeros(~r9) + Long.numberOfLeadingZeros(r9)));
        if (r1 > 65) goto L5;
        long r2 = ((r9 ^ r11) >>> 63) + Long.MAX_VALUE;
        boolean r4 = false;
        if (r1 >= 64) goto L9;
        boolean r0 = true;
    L11:
        if (r9 >= 0) goto L13;
        boolean r6 = true;
    L15:
        if (r11 != Long.MIN_VALUE) goto L18;
        r4 = true;
    L18:
        if ((r0 | (r4 & r6)) == true) goto L25;
        long r5 = r9 * r11;
        if (r9 != 0) goto L23;
    L26:
        return r5;
    L23:
        if ((r5 / r9) == r11) goto L26;
    L25:
        return r2;
    L13:
        r6 = false;
        goto L15
    L9:
        r0 = false;
        goto L11
    L5:
        return r9 * r11;
    }

    public static final void B(id r2, int r3) {
        Iterator<T> r4 = r2.getLayoutNodeToHolder().entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L8;
        Object r0 = r4.next();
        if (((c72) ((Map.Entry) r0).getKey()).o != r3) goto L4;
    L9:
        Map.Entry r1 = (Map.Entry) r0;
        if (r1 != null) goto L12;
        return;
    L12:
        if (r1.getValue() == null) goto L20;
        kf2.k();
        return;
    L20:
        return;
    L8:
        r0 = null;
        goto L9
    }

    public static final void C(TextPaint r2, float r3) {
        if (Float.isNaN(r3) == false) goto L5;
        return;
    L5:
        if (r3 >= 0.0f) goto L8;
        r3 = 0.0f;
    L8:
        if (r3 <= 1.0f) goto L10;
        r3 = 1.0f;
    L10:
        r2.setAlpha(Math.round(r3 * 255.0f));
    }

    public static void D(int r7, qv2 r8, sb1 r9, qv2 r10, qv2... r11) {
        int r0 = 0;
        if (r10 != null) goto L6;
        r10 = new qv2(new pv2[0]);
    L6:
        if (r8 == null) goto L21;
        uw1 r1 = yw1.j();
        pv2[] r12 = r8.a;
        int r2 = r12.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L13;
        pv2 r4 = r12[r3];
        if (oi2.class.isAssignableFrom(r4.getClass()) == false) goto L12;
        r1.c((pv2) oi2.class.cast(r4));
    L12:
        r3 = r3 + 1;
        goto L8
    L13:
        vw1 r13 = r1.f().m(0);
    L15:
        if (r13.hasNext() == false) goto L21;
        oi2 r5 = (oi2) r13.next();
        if (r5.a.equals("com.android.capture.fps") == false) goto L20;
        if (r7 != 2) goto L15;
    L20:
        r10 = r10.a(new pv2[]{r5});
    L21:
        int r14 = r11.length;
    L22:
        if (r0 >= r14) goto L25;
        r10 = r10.b(r11[r0]);
        r0 = r0 + 1;
        goto L22
    L25:
        if (r10.a.length <= 0) goto L38;
        r9.k = r10;
        return;
    }

    public static final void E(List r32, nc r33) {
        List r0 = r32;
        Path r2 = r33.a;
        Path r3 = r33.a;
        Path.FillType r4 = r2.getFillType();
        Path.FillType r5 = Path.FillType.EVEN_ODD;
        if (r4 != r5) goto L5;
        boolean r6 = true;
    L6:
        r3.rewind();
        if (r6 == true) goto L10;
        r5 = Path.FillType.WINDING;
    L10:
        r3.setFillType(r5);
        if (r0.isEmpty() == false) goto L13;
        bf3 r7 = je3.c;
    L14:
        int r10 = r0.size();
        float r11 = 0.0f;
        int r12 = 0;
        float r8 = 0.0f;
        float r9 = 0.0f;
        float r13 = 0.0f;
        float r14 = 0.0f;
        float r18 = 0.0f;
        float r19 = 0.0f;
    L15:
        if (r12 >= r10) goto L104;
        bf3 r15 = (bf3) r0.get(r12);
        if ((r15 instanceof je3) == false) goto L20;
        r3.close();
        r3 = r3;
        r10 = r10;
        r11 = r11;
        r12 = r12;
        bf3 r23 = r15;
        r8 = r18;
        r13 = r8;
        r9 = r19;
        r14 = r9;
    L93:
        r12 = r12 + 1;
        r0 = r32;
        r10 = r10;
        r3 = r3;
        r7 = r23;
        r11 = r11;
        goto L15
    L20:
        if ((r15 instanceof ve3) == false) goto L24;
        ve3 r16 = (ve3) r15;
        float r17 = r16.c;
        r13 = r13 + r17;
        float r20 = r16.d;
        r14 = r14 + r20;
        r3.rMoveTo(r17, r20);
        r3 = r3;
        r18 = r13;
        r19 = r14;
    L22:
        r23 = r15;
        goto L93
    L24:
        if ((r15 instanceof ne3) == false) goto L28;
        ne3 r21 = (ne3) r15;
        float r22 = r21.c;
        float r24 = r21.d;
        r3.moveTo(r22, r24);
        r14 = r24;
        r19 = r14;
        r13 = r22;
        r18 = r13;
        goto L22
    L28:
        if ((r15 instanceof ue3) == false) goto L32;
        ue3 r25 = (ue3) r15;
        float r26 = r25.d;
        float r27 = r25.c;
        r3.rLineTo(r27, r26);
        r13 = r13 + r27;
        r14 = r14 + r26;
        goto L22
    L32:
        if ((r15 instanceof me3) == false) goto L35;
        me3 r28 = (me3) r15;
        float r29 = r28.d;
        float r30 = r28.c;
        r3.lineTo(r30, r29);
        r13 = r30;
        r14 = r29;
        goto L22
    L35:
        if ((r15 instanceof te3) == false) goto L38;
        float r31 = ((te3) r15).c;
        r3.rLineTo(r31, r11);
        r13 = r13 + r31;
        goto L22
    L38:
        if ((r15 instanceof le3) == false) goto L41;
        float r34 = ((le3) r15).c;
        r3.lineTo(r34, r14);
        r13 = r34;
        goto L22
    L41:
        if ((r15 instanceof ze3) == false) goto L45;
        float r35 = ((ze3) r15).c;
        r3.rLineTo(r11, r35);
    L43:
        r14 = r14 + r35;
        goto L22
    L45:
        if ((r15 instanceof af3) == false) goto L48;
        float r36 = ((af3) r15).c;
        r3.lineTo(r13, r36);
        r14 = r36;
        goto L22
    L48:
        if ((r15 instanceof se3) == false) goto L51;
        se3 r37 = (se3) r15;
        r3.rCubicTo(r37.c, r37.d, r37.e, r37.f, r37.g, r37.h);
        r8 = r37.e + r13;
        r9 = r37.f + r14;
        r13 = r13 + r37.g;
        r35 = r37.h;
        goto L43
    L51:
        if ((r15 instanceof ke3) == false) goto L55;
        ke3 r38 = (ke3) r15;
        r3.cubicTo(r38.c, r38.d, r38.e, r38.f, r38.g, r38.h);
        r8 = r38.e;
        r9 = r38.f;
        float r39 = r38.g;
        float r40 = r38.h;
    L53:
        r14 = r40;
        r13 = r39;
        goto L22
    L55:
        if ((r15 instanceof xe3) == false) goto L62;
        if (r7.a == false) goto L59;
        float r41 = r14 - r9;
        float r42 = r13 - r8;
    L60:
        xe3 r43 = (xe3) r15;
        r3.rCubicTo(r42, r41, r43.c, r43.d, r43.e, r43.f);
        r8 = r43.c + r13;
        r9 = r43.d + r14;
        r13 = r13 + r43.e;
        r35 = r43.f;
        goto L43
    L59:
        r42 = r11;
        r41 = r42;
        goto L60
    L62:
        if ((r15 instanceof pe3) == false) goto L68;
        if (r7.a == false) goto L66;
        r13 = (r13 * 2.0f) - r8;
        r14 = (2.0f * r14) - r9;
    L66:
        pe3 r44 = (pe3) r15;
        r3.cubicTo(r13, r14, r44.c, r44.d, r44.e, r44.f);
        r8 = r44.c;
        r9 = r44.d;
        r39 = r44.e;
        r40 = r44.f;
        goto L53
    L68:
        if ((r15 instanceof we3) == false) goto L71;
        we3 r45 = (we3) r15;
        float r46 = r45.f;
        float r47 = r45.e;
        float r48 = r45.d;
        float r49 = r45.c;
        r3.rQuadTo(r49, r48, r47, r46);
        float r50 = r49 + r13;
        float r51 = r48 + r14;
        r13 = r13 + r47;
        r14 = r14 + r46;
        r8 = r50;
        r9 = r51;
        goto L22
    L71:
        if ((r15 instanceof oe3) == false) goto L75;
        oe3 r52 = (oe3) r15;
        float r53 = r52.f;
        float r54 = r52.e;
        float r55 = r52.d;
        float r56 = r52.c;
        r3.quadTo(r56, r55, r54, r53);
        r14 = r53;
        r13 = r54;
        r9 = r55;
    L73:
        r10 = r10;
        r11 = r11;
        r12 = r12;
        r23 = r15;
        r8 = r56;
        goto L93
    L75:
        if ((r15 instanceof ye3) == false) goto L82;
        if (r7.b == false) goto L79;
        float r57 = r13 - r8;
        float r58 = r14 - r9;
    L80:
        ye3 r59 = (ye3) r15;
        float r60 = r59.d;
        float r61 = r59.c;
        r3.rQuadTo(r57, r58, r61, r60);
        r56 = r57 + r13;
        float r62 = r58 + r14;
        r13 = r13 + r61;
        r14 = r14 + r60;
        r9 = r62;
        goto L73
    L79:
        r57 = r11;
        r58 = r57;
        goto L80
    L82:
        if ((r15 instanceof qe3) == false) goto L88;
        if (r7.b == false) goto L86;
        r13 = (r13 * 2.0f) - r8;
        r14 = (2.0f * r14) - r9;
    L86:
        qe3 r63 = (qe3) r15;
        float r64 = r63.d;
        float r65 = r63.c;
        r3.quadTo(r13, r14, r65, r64);
        r3 = r3;
        r10 = r10;
        r11 = r11;
        r12 = r12;
        r9 = r14;
        r23 = r15;
        r14 = r64;
        r8 = r13;
        r13 = r65;
        goto L93
    L88:
        if ((r15 instanceof re3) == false) goto L90;
        re3 r66 = (re3) r15;
        float r67 = r66.h + r13;
        float r68 = r66.i + r14;
        r10 = r10;
        r11 = 0.0f;
        r3 = r3;
        r12 = r12;
        i(r33, r13, r14, r67, r68, r66.c, r66.d, r66.e, r66.f, r66.g);
        r8 = r67;
        r13 = r8;
        r9 = r68;
        r14 = r9;
        r23 = r15;
        goto L93
    L90:
        r3 = r3;
        r10 = r10;
        r11 = r11;
        r12 = r12;
        if ((r15 instanceof ie3) == false) goto L94;
        ie3 r110 = (ie3) r15;
        float r1 = r110.i;
        float r69 = r110.h;
        r23 = r15;
        i(r33, r13, r14, r69, r1, r110.c, r110.d, r110.e, r110.f, r110.g);
        r9 = r1;
        r14 = r9;
        r8 = r69;
        r13 = r8;
        goto L93
    L94:
        er1.n();
        return;
    L104:
        return;
    L13:
        r7 = (bf3) r0.get(0);
        goto L14
    L5:
        r6 = false;
        goto L6
    }

    public static final String F(float r5) {
        if (Float.isNaN(r5) == false) goto L7;
        return "NaN";
    L7:
        if (Float.isInfinite(r5) == true) goto L9;
        int r0 = Math.max(1, 0);
        float r1 = (float) Math.pow(10.0d, r0);
        float r6 = r5 * r1;
        int r2 = (int) r6;
        if ((r6 - r2) < 0.5f) goto L17;
        r2 = r2 + 1;
    L17:
        float r7 = r2 / r1;
        if (r0 <= 0) goto L22;
        return String.valueOf(r7);
    L22:
        return String.valueOf((int) r7);
    L9:
        if (r5 >= 0.0f) goto L12;
        return "-Infinity";
    L12:
        return "Infinity";
    }

    public static final void G(final nc1 r14) {
        if (u52.c().a == false) goto L7;
        u52.f();
        return;
    L7:
        if (Build.VERSION.SDK_INT >= 37) goto L9;
    L12:
        Object r0 = r14.getSystemService("servicediscovery");
        r0.getClass();
        final NsdManager r5 = (NsdManager) r0;
        final Handler r7 = new Handler(Looper.getMainLooper());
        final LinkedHashMap r3 = new LinkedHashMap();
        final ArrayAdapter r4 = new ArrayAdapter(r14, R.layout.simple_list_item_1);
        final fx3 r2 = new fx3();
        final fx3 r1 = new fx3();
        vg2 r6 = new vg2(r14, 0);
        r6.p(app.homemusic.R.string.lan_choose_device);
        a9 r8 = r6.a;
        r8.q = r4;
        r8.r = null;
        r6.k(app.homemusic.R.string.lan_pair_title, new vr(3, r14));
        final f9 r9 = r6.j(R.string.cancel, null).create();
        final v42 r10 = new v42(r7, r2, r9, r3, r4);
        final wo1 r11 = new wo1(1, r9);
        r14.n.a(r11);
        r9.setOnDismissListener(new s42(r2, r14, r11, r5, r10));
        r9.show();
        r9.setTitle(app.homemusic.R.string.lan_searching);
        r9.t.f.setOnItemClickListener(new t42(r1, r3, r4, r9, r5, r2, r7, r14));
        r5.discoverServices("_tempus-lan._tcp.", 1, r10);     // Catch: Exception -> L15
        return;
    L15:
        r9.setTitle(app.homemusic.R.string.lan_discovery_error);
        return;
    L9:
        if (r14.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK") == 0) goto L12;
        r14.startActivity(new Intent(r14, LanPlaybackActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [rp, tu3] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList H(hg4 r7, int r8, Integer r9) {
        ?? r0 = new tu3(r7);
        r8 = r7.q(r8);
        mg1 r2 = r7.a(r8);
    L3:
        if (r8 < 0) goto L13;
        if (r7.k(r8) == false) goto L7;
        Object r3 = r7.p(r7.b, r8);
    L8:
        r0.l(r7.i(r8), r3, r7.a.g(r8), r9);
        if (r8 >= 0) goto L10;
        r9 = r2;
        goto L3
    L10:
        mg1 r10 = r7.a(r8);
        mg1 r6 = r2;
        r2 = r10;
        r8 = r7.q(r8);
        r9 = r6;
        goto L3
    L7:
        r3 = j80.a;
        goto L8
    L13:
        return (ArrayList) r0.a;
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
    public static final void I(rx4 r10, if1 r11) {
        cx2 r0 = (cx2) r10;
        if (r0.n.A == true) goto L5;
        cz1.b("visitAncestors called on an unattached node");
    L5:
        cx2 r1 = r0.n.r;
        c72 r2 = j51.O(r10);
    L6:
        if (r2 == null) goto L50;
        if ((((cx2) r2.Q.g).q & 262144) == 0) goto L44;
    L9:
        if (r1 == null) goto L44;
        if ((r1.p & 262144) == 0) goto L43;
        ?? r3 = r1;
        ?? r5 = 0;
    L13:
        if (r3 == 0) goto L43;
        boolean r7 = true;
        if ((r3 instanceof rx4) == true) goto L16;
        if ((r3.p & 262144) == 0) goto L42;
        if ((r3 instanceof fo0) == false) goto L42;
        cx2 r6 = ((fo0) r3).C;
        int r8 = 0;
        r3 = r3;
        r5 = r5;
    L28:
        if (r6 == null) goto L40;
        if ((r6.p & 262144) == 0) goto L39;
        r8 = r8 + 1;
        r5 = r5;
        if (r8 != 1) goto L34;
        r3 = r6;
        goto L39
    L34:
        if (r5 != 0) goto L36;
        r5 = new f13(new cx2[16]);
    L36:
        if (r3 == 0) goto L38;
        r5.b(r3);
        r3 = 0;
    L38:
        r5.b(r6);
    L39:
        r6 = r6.s;
        r3 = r3;
        r5 = r5;
        goto L28
    L40:
        if (r8 == 1) goto L13;
    L42:
        r3 = j51.c(r5);
        goto L13
    L16:
        rx4 r4 = (rx4) r3;
        if (h12.c(r10.f(), r4.f()) == true) goto L19;
    L21:
        if (r7 == true) goto L42;
        return;
    L19:
        if (r10.getClass() != r4.getClass()) goto L21;
        r7 = ((Boolean) r11.invoke(r4)).booleanValue();
    L43:
        r1 = r1.r;
    L44:
        r2 = r2.t();
        if (r2 == null) goto L49;
        w12 r9 = r2.Q;
        if (r9 == null) goto L49;
        r1 = (sq4) r9.f;
    L49:
        r1 = null;
        goto L6
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
    public static final void J(rx4 r12, if1 r13) {
        if (((cx2) r12).n.A == true) goto L5;
        cz1.b("visitSubtreeIf called on an unattached node");
    L5:
        f13 r0 = new f13(new cx2[16]);
        cx2 r2 = ((cx2) r12).n;
        cx2 r3 = r2.s;
        if (r3 != null) goto L8;
        j51.b(r0, r2);
    L9:
        int r4 = r0.p;
        if (r4 == 0) goto L58;
        cx2 r5 = (cx2) r0.k(r4 - 1);
        if ((r5.q & 262144) == 0) goto L57;
        cx2 r6 = r5;
    L14:
        if (r6 == null) goto L57;
        if (r6.A == false) goto L57;
        if ((r6.p & 262144) == 0) goto L56;
        ?? r7 = r6;
        ?? r8 = 0;
    L20:
        if (r7 == 0) goto L56;
        if ((r7 instanceof rx4) == true) goto L23;
        if ((r7.p & 262144) == 0) goto L55;
        if ((r7 instanceof fo0) == false) goto L55;
        cx2 r9 = ((fo0) r7).C;
        int r10 = 0;
        r7 = r7;
        r8 = r8;
    L41:
        if (r9 == null) goto L53;
        if ((r9.p & 262144) == 0) goto L52;
        r10 = r10 + 1;
        r8 = r8;
        if (r10 != 1) goto L47;
        r7 = r9;
        goto L52
    L47:
        if (r8 != 0) goto L49;
        r8 = new f13(new cx2[16]);
    L49:
        if (r7 == 0) goto L51;
        r8.b(r7);
        r7 = 0;
    L51:
        r8.b(r9);
    L52:
        r9 = r9.s;
        r7 = r7;
        r8 = r8;
        goto L41
    L53:
        if (r10 == 1) goto L20;
    L55:
        r7 = j51.c(r8);
        goto L20
    L23:
        rx4 r11 = (rx4) r7;
        if (h12.c(r12.f(), r11.f()) == true) goto L26;
    L28:
        qx4 r14 = qx4.n;
    L30:
        if (r14 == qx4.p) goto L81;
        if (r14 == qx4.o) goto L9;
    L81:
        return;
    L26:
        if (r12.getClass() != r11.getClass()) goto L28;
        r14 = (qx4) r13.invoke(r11);
    L56:
        r6 = r6.s;
    L57:
        j51.b(r0, r5);
        goto L9
    L58:
        return;
    L8:
        r0.b(r3);
        goto L9
    }

    public static final dd5 K(List r15, dd5 r16) {
        r15.getClass();
        r16.getClass();
        oh0 r17 = r16.e;
        boolean r2 = r17.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean r3 = r17.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean r4 = r17.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (r2 == true) goto L7;
        if (r3 == false) goto L7;
        if (r4 == false) goto L7;
        String r5 = r16.c;
        nh0 r6 = new nh0(0);
        r6.a(r17.a);
        LinkedHashMap r18 = r6.a;
        r18.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", r5);
        oh0 r7 = new oh0(r18);
        bu.E(r7);
        dd5 r0 = dd5.b(r16, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", r7, 0, 0, 0, 0, 0, 0, 16777195);
    L9:
        if (Build.VERSION.SDK_INT >= 26) goto L18;
        mc0 r19 = r0.j;
        String r1 = r0.c;
        if (h12.c(r1, ConstraintTrackingWorker.class.getName()) == true) goto L18;
        if (r19.e == false) goto L15;
    L16:
        nh0 r110 = new nh0(0);
        oh0 r8 = r0.e;
        r8.getClass();
        r110.a(r8.a);
        LinkedHashMap r111 = r110.a;
        r111.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", r1);
        oh0 r9 = new oh0(r111);
        bu.E(r9);
        return dd5.b(r0, null, 0, ConstraintTrackingWorker.class.getName(), r9, 0, 0, 0, 0, 0, 0, 16777195);
    L15:
        if (r19.f == true) goto L16;
    L18:
        return r0;
    L7:
        r0 = r16;
        goto L9
    }

    public static void L(Parcel r2, Parcelable r3) {
        if (r3 == null) goto L6;
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
        return;
    L6:
        r2.writeInt(0);
    }

    public static int M(gi5 r3) {
        Iterator r4 = r3.iterator();
        int r1 = 0;
    L4:
        if (r4.hasNext() == false) goto L10;
        Object r2 = r4.next();
        if (r2 == null) goto L8;
        int r5 = r2.hashCode();
    L9:
        r1 = r1 + r5;
        goto L4
    L8:
        r5 = 0;
        goto L9
    L10:
        return r1;
    }

    public static Object a(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L5;
        return null;
    L5:
        return r2.createFromParcel(r1);
    }

    public static void b(Parcel r3, List r4) {
        if (r4 != null) goto L5;
        r3.writeInt(-1);
        return;
    L5:
        int r0 = r4.size();
        r3.writeInt(r0);
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L8;
        L(r3, (Parcelable) r4.get(r1));
        r1 = r1 + 1;
        goto L6
    }

    public static void c(Object r2, StringBuilder r3) {
        if (r2 != null) goto L5;
        r3.append("null");
        return;
    L5:
        String r0 = r2.getClass().getSimpleName();
        if (r0.length() > 0) goto L10;
        r0 = r2.getClass().getName();
        int r1 = r0.lastIndexOf(46);
        if (r1 <= 0) goto L10;
        r0 = r0.substring(r1 + 1);
    L10:
        r3.append(r0);
        r3.append('{');
        r3.append(Integer.toHexString(System.identityHashCode(r2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [rp, tu3] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [mg1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List d(lg4 r5, Integer r6, int r7, Integer r8) {
        if (r5.w == true) goto L40;
        if (r5.p() == 0) goto L40;
        ?? r0 = new tu3(r5);
        if (r8 == null) goto L9;
        int r9 = r8.intValue();
    L12:
        if (r6 != 0) goto L20;
        int r10 = r5.i - r5.N(r5.b, r5.r(r7));
        i03 r1 = r5.s;
        if (r1 == null) goto L18;
        q03 r2 = (q03) r1.b(r7);
        if (r2 == null) goto L18;
        int r3 = r2.b;
    L19:
        r6 = Integer.valueOf(r10 + r3);
    L18:
        r3 = 0;
    L20:
        int r4 = r5.r(r7) * 5;
        int[] r11 = r5.b;
        if (r4 >= r11.length) goto L23;
        int r12 = r5.s(r7);
    L27:
        if (r7 < 0) goto L38;
        int r13 = r5.r(r7);
        if ((r5.b[(r13 * 5) + 1] & 536870912) == 0) goto L31;
        Object r14 = r5.t(r7);
    L32:
        r0.l(r12, r14, r5.O(r7), r6);
        r6 = r5.b(r7);
        if (r9 >= 0) goto L34;
        r7 = r9;
        goto L27
    L34:
        int r15 = r5.E(r5.b, r9);
        r12 = r5.s(r9);
        int r16 = r9;
        r9 = r15;
        r7 = r16;
        goto L27
    L31:
        r14 = j80.a;
        goto L32
    L38:
        return (ArrayList) r0.a;
    L23:
        if (r9 < 0) goto L25;
        int r17 = r5.E(r11, r9);
    L26:
        r12 = r5.s(r9);
        int r18 = r9;
        r9 = r17;
        r7 = r18;
        goto L27
    L25:
        r17 = r9;
        goto L26
    L9:
        r9 = r5.v;
        if (r9 >= 0) goto L12;
        r9 = r5.E(r5.b, r7);
    L40:
        return u01.n;
    }

    public static final void e(WorkDatabase r5, r90 r6, mc5 r7) {
        r5.getClass();
        r6.getClass();
        ArrayList r8 = gb.Q(new mc5[]{r7});
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r8.isEmpty() == true) goto L19;
        List r2 = ((mc5) v40.q0(r8)).d;
        r2.getClass();
        if (r2.isEmpty() == false) goto L8;
        int r3 = 0;
    L18:
        r1 = r1 + r3;
        goto L4
    L8:
        Iterator r4 = r2.iterator();
        r3 = 0;
    L10:
        if (r4.hasNext() == false) goto L18;
        if (((bd5) r4.next()).b.j.i.isEmpty() == true) goto L10;
        r3 = r3 + 1;
        if (r3 >= 0) goto L10;
        throw new ArithmeticException("Count overflow has happened.");
    L19:
        if (r1 == 0) goto L45;
        fd5 r9 = r5.A();
        r9.getClass();
        w24 r10 = w24.b(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl r11 = r9.a;
        r11.b();
        Cursor r12 = xl.H(r11, r10);
    L26:
        th = move-exception;
        r12.close();
        r10.j();
        throw th;
    L23:
        if (r12.moveToFirst() == false) goto L28;
        r0 = r12.getInt(0);     // Catch: Throwable -> L26
    L28:
        r12.close();
        r10.j();
        int r13 = r6.j;
        if ((r0 + r1) > r13) goto L31;
        return;
    L31:
        kf2.n(f34.i(b11.t("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", r13, r0, ";\ncurrent enqueue operation count: "), r1, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        return;
    }

    public static void f(int r2, Object[] r3) {
        int r0 = 0;
    L3:
        if (r0 >= r2) goto L11;
        if (r3[r0] == null) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        nz2.n(f34.f(r0, "at index "));
        return;
    }

    public static long g(long r9, long r11) {
        long r0 = r9 + r11;
        boolean r3 = false;
        if ((r9 ^ r11) >= 0) goto L5;
        boolean r2 = true;
    L7:
        if ((r9 ^ r0) < 0) goto L10;
        r3 = true;
    L10:
        if ((r2 | r3) == false) goto L12;
        return r0;
    L12:
        StringBuilder r1 = new StringBuilder("overflow: checkedAdd(");
        r1.append(r9);
        r1.append(", ");
        throw new ArithmeticException(b11.p(r1, r11, ")"));
    L5:
        r2 = false;
        goto L7
    }

    public static long h(long r9, long r11, RoundingMode r13) {
        r13.getClass();
        long r0 = r9 / r11;
        long r2 = r9 - (r11 * r0);
        if (r2 != 0) goto L5;
        return r0;
    L5:
        boolean r10 = true;
        int r12 = ((int) ((r9 ^ r11) >> 63)) | 1;
        switch(ue2.a[r13.ordinal()]) {
            case 1: goto L28;
            case 2: goto L32;
            case 3: goto L25;
            case 4: goto L27;
            case 5: goto L22;
            case 6: goto L9;
            case 7: goto L9;
            case 8: goto L9;
            default: goto L8;
        };
    L9:
        long r3 = Math.abs(r2);
        long r4 = r3 - (Math.abs(r11) - r3);
        if (r4 == 0) goto L12;
        if (r4 > 0) goto L27;
        return r0;
    L12:
        if (r13 == RoundingMode.HALF_UP) goto L27;
        if (r13 == RoundingMode.HALF_EVEN) goto L16;
    L18:
        return r0;
    L16:
        if ((1 & r0) == 0) goto L18;
    L22:
        if (r12 > 0) goto L27;
        return r0;
    L25:
        if (r12 < 0) goto L27;
        return r0;
    L28:
        if (r2 == 0) goto L31;
        r10 = false;
    L31:
        l93.n(r10);
    L32:
        return r0;
    L8:
        throw new AssertionError();
    L27:
        return r0 + ((long) r12);
    }

    public static final void i(nc r50, double r51, double r53, double r55, double r57, double r59, double r61, double r63, boolean r65, boolean r66) {
        double r3 = r59;
        double r7 = (r63 / 180.0d) * 3.141592653589793d;
        double r11 = Math.cos(r7);
        double r13 = Math.sin(r7);
        double r17 = ((r53 * r13) + (r51 * r11)) / r3;
        double r19 = ((r53 * r11) + ((-r51) * r13)) / r61;
        double r21 = ((r57 * r13) + (r55 * r11)) / r3;
        double r23 = ((r57 * r11) + ((-r55) * r13)) / r61;
        double r9 = r17 - r21;
        double r25 = r19 - r23;
        double r27 = (r17 + r21) / 2.0d;
        double r31 = (r19 + r23) / 2.0d;
        double r35 = (r25 * r25) + (r9 * r9);
        if (r35 == 0.0d) goto L25;
        double r39 = (1.0d / r35) - 0.25d;
        if (r39 >= 0.0d) goto L9;
        double r8 = (float) (Math.sqrt(r35) / 1.99999d);
        i(r50, r51, r53, r55, r57, r3 * r8, r61 * r8, r63, r65, r66);
        return;
    L9:
        double r1 = Math.sqrt(r39);
        double r10 = r9 * r1;
        double r2 = r1 * r25;
        if (r65 != r66) goto L12;
        double r28 = r27 - r2;
        double r32 = r31 + r10;
    L13:
        double r4 = Math.atan2(r19 - r32, r17 - r28);
        double r5 = Math.atan2(r23 - r32, r21 - r28) - r4;
        if (r5 < 0.0d) goto L16;
        boolean r12 = true;
    L17:
        if (r66 != r12) goto L19;
    L22:
        double r29 = r28 * r3;
        double r33 = r32 * r61;
        double r14 = (r29 * r11) - (r33 * r13);
        double r34 = (r33 * r11) + (r29 * r13);
        int r0 = (int) Math.ceil(Math.abs((r5 * 4.0d) / 3.141592653589793d));
        double r15 = Math.cos(r7);
        double r16 = Math.sin(r7);
        double r18 = Math.cos(r4);
        double r110 = Math.sin(r4);
        double r111 = -r3;
        double r112 = r111 * r15;
        double r24 = r61 * r16;
        double r22 = (r112 * r110) - (r24 * r18);
        double r113 = r111 * r16;
        double r26 = r61 * r15;
        double r114 = (r18 * r26) + (r110 * r113);
        double r6 = r5 / ((double) r0);
        double r115 = r4;
        double r210 = r22;
        int r20 = 0;
        double r211 = r114;
        double r116 = r53;
    L23:
        if (r20 >= r0) goto L27;
        double r36 = r115 + r6;
        double r37 = Math.sin(r36);
        double r310 = Math.cos(r36);
        int r30 = r0;
        double r38 = (((r3 * r15) * r310) + r14) - (r24 * r37);
        double r40 = (r26 * r37) + (((r3 * r16) * r310) + r34);
        double r41 = (r112 * r37) - (r24 * r310);
        double r311 = (r310 * r26) + (r37 * r113);
        double r117 = r36 - r115;
        double r312 = Math.tan(r117 / 2.0d);
        double r313 = ((Math.sqrt(((r312 * 3.0d) * r312) + 4.0d) - 1.0d) * Math.sin(r117)) / 3.0d;
        double r118 = r113;
        Path r119 = r50.a;
        r119.cubicTo((float) ((r210 * r313) + r51), (float) ((r211 * r313) + r116), (float) (r38 - (r313 * r41)), (float) (r40 - (r313 * r311)), (float) r38, (float) r40);
        r6 = r6;
        r16 = r16;
        r14 = r14;
        r51 = r38;
        r20 = r20 + 1;
        r113 = r118;
        r115 = r36;
        r211 = r311;
        r210 = r41;
        r0 = r30;
        r116 = r40;
        r3 = r59;
        goto L23
    L27:
        return;
    L19:
        if (r5 <= 0.0d) goto L21;
        r5 = r5 - 6.283185307179586d;
        goto L22
    L21:
        r5 = r5 + 6.283185307179586d;
        goto L22
    L16:
        r12 = false;
        goto L17
    L12:
        r28 = r27 + r2;
        r32 = r31 - r10;
        goto L13
    }

    public static final Integer j(hg4 r5, u80 r6, int r7, int r8) {
        int[] r0 = r5.b;
    L3:
        og1 r1 = null;
        if (r7 >= r8) goto L34;
        int r2 = r0[(r7 * 5) + 3] + r7;
        if (r5.j(r7) == false) goto L28;
        if (r5.i(r7) != 206) goto L28;
        if (h12.c(r5.p(r0, r7), l80.e) == false) goto L28;
        Object r3 = r5.h(r7, 0);
        if ((r3 instanceof wg1) == false) goto L14;
        wg1 r4 = (wg1) r3;
    L15:
        if (r4 == null) goto L17;
        vy3 r9 = r4.a;
    L19:
        if ((r9 instanceof og1) == false) goto L21;
        r1 = (og1) r9;
    L21:
        if (r1 == null) goto L28;
        if (r1.n != r6) goto L28;
        return Integer.valueOf(r7);
    L17:
        r9 = null;
        goto L19
    L14:
        r4 = null;
    L28:
        if (r5.d(r7) == false) goto L33;
        Integer r10 = j(r5, r6, r7 + 1, r2);
        if (r10 == null) goto L33;
        return Integer.valueOf(r10.intValue());
    L33:
        r7 = r2;
        goto L3
    L34:
        return null;
    }

    public static long k(zw r7, int r8) {
        if (r8 > 8) goto L13;
        long r0 = 0;
        int r2 = 0;
    L5:
        if (r2 >= r8) goto L12;
        long r3 = r7.p();
        if (r3 == (-1)) goto L9;
        r0 = r0 | (r3 << (r2 * 8));
        r2 = r2 + 1;
        goto L5
    L9:
        mj0.i("Premature end of data");
        return 0;
    L12:
        return r0;
    L13:
        kf2.n("Can't read more than eight bytes into a long value");
        return 0;
    }

    public static long l(DataInputStream r6) {
        long r0 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 4) goto L6;
        r0 = r0 | (((long) r6.readUnsignedByte()) << (r2 * 8));
        r2 = r2 + 1;
        goto L4
    L6:
        return r0;
    }

    public static long m(byte[] r7, int r8, int r9) {
        if (r9 > 8) goto L8;
        long r0 = 0;
        int r2 = 0;
    L5:
        if (r2 >= r9) goto L7;
        r0 = r0 | ((((long) r7[r8 + r2]) & 255) << (r2 * 8));
        r2 = r2 + 1;
        goto L5
    L7:
        return r0;
    L8:
        kf2.n("Can't read more than eight bytes into a long value");
        return 0;
    }

    public static long n(long r4, long r6) {
        l93.l("a", r4);
        l93.l("b", r6);
        if (r4 != 0) goto L6;
        return r6;
    L6:
        if (r6 != 0) goto L8;
        return r4;
    L8:
        int r0 = Long.numberOfTrailingZeros(r4);
        long r5 = r4 >> r0;
        int r1 = Long.numberOfTrailingZeros(r6);
        long r7 = r6 >> r1;
    L10:
        if (r5 == r7) goto L13;
        long r8 = r5 - r7;
        long r2 = (r8 >> 63) & r8;
        long r9 = (r8 - r2) - r2;
        r7 = r7 + r2;
        r5 = r9 >> Long.numberOfTrailingZeros(r9);
        goto L10
    L13:
        return r5 << Math.min(r0, r1);
    }

    public static final String o(Object r1) {
        return r1 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ms4 p(e94 r2) {
        ArrayList r0 = new ArrayList();
        Object r3 = r2.n.g(d94.a);
        if (r3 != null) goto L5;
        r3 = null;
    L5:
        w2 r4 = (w2) r3;
        if (r4 == null) goto L13;
        if1 r5 = (if1) r4.b;
        if (r5 == null) goto L13;
        if (((Boolean) r5.invoke(r0)).booleanValue() == false) goto L13;
        return (ms4) r0.get(0);
    L13:
        return null;
    }

    public static final tf0 q(f75 r1) {
        if ((r1 instanceof ml1) == false) goto L7;
        return ((ml1) r1).b();
    L7:
        return sf0.b;
    }

    public static final b75 r(f75 r1) {
        if ((r1 instanceof ml1) == false) goto L7;
        return ((ml1) r1).a();
    L7:
        return un0.b;
    }

    public static String s(String r8, Object... r9) {
        String r10 = String.valueOf(r8);
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r9.length) goto L13;
        Object r2 = r9[r1];
        if (r2 != null) goto L29;
        String r3 = "null";
    L12:
        r9[r1] = r3;
        r1 = r1 + 1;
        goto L4
    L29:
        r3 = r2.toString();     // Catch: Exception -> L10
    L10:
        e = move-exception;
        String r4 = r2.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(r2));
        Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(r4), e);
        StringBuilder r5 = xa3.j("<", r4, " threw ");
        r5.append(e.getClass().getName());
        r5.append(">");
        r3 = r5.toString();
        goto L12
    L13:
        StringBuilder r6 = new StringBuilder((r9.length * 16) + r10.length());
        int r7 = 0;
    L15:
        if (r0 >= r9.length) goto L20;
        int r11 = r10.indexOf("%s", r7);
        if (r11 == (-1)) goto L20;
        r6.append(r10, r7, r11);
        r6.append(r9[r0]);
        r7 = r11 + 2;
        r0 = r0 + 1;
    L20:
        r6.append(r10, r7, r10.length());
        if (r0 >= r9.length) goto L28;
        r6.append(" [");
        int r12 = r0 + 1;
        r6.append(r9[r0]);
    L24:
        if (r12 >= r9.length) goto L26;
        r6.append(", ");
        r6.append(r9[r12]);
        r12 = r12 + 1;
        goto L24
    L26:
        r6.append(']');
    L28:
        return r6.toString();
    }

    public static final long t(String r32, int r33, int r34) {
        long r4 = 4294967295L;
        if (r33 == r34) goto L5;
        char r7 = r32.charAt(r33);
        if (r7 != '-') goto L9;
        boolean r11 = true;
    L11:
        if (r11 == false) goto L22;
        int r8 = r33 + 1;
        if (r8 == r34) goto L15;
        char r14 = r32.charAt(r8);
        if (((char) (r14 - '0')) < '\n') goto L23;
        if (r14 == '.') goto L23;
        return (((long) r8) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
    L23:
        int r15 = r32.length();
        long r16 = 0;
        int r3 = r8;
        long r19 = 0;
    L25:
        if (r3 == r34) goto L33;
        long r23 = r4;
        int r5 = r14 - '0';
        if (((char) r5) >= '\n') goto L34;
        r19 = (r19 * 10) + ((long) r5);
        r3 = r3 + 1;
        if (r3 >= r15) goto L31;
        r14 = r32.charAt(r3);
    L32:
        r4 = r23;
        goto L25
    L31:
        r14 = 0;
    L34:
        int r6 = r3 - r8;
        char r9 = '0';
        if (r3 == r34) goto L59;
        if (r14 != '.') goto L59;
        int r17 = r3 + 1;
        char r26 = ' ';
        int r10 = r17;
    L38:
        char r27 = 1;
        if ((r34 - r10) < 4) goto L46;
        int r29 = r17;
        long r12 = ((((long) r32.charAt(r10)) | (((long) r32.charAt(r10 + 1)) << 16)) | (((long) r32.charAt(r10 + 2)) << 32)) | (((long) r32.charAt(r10 + 3)) << 48);
        long r13 = r12 - 13511005043687472L;
        if ((((r12 + 19703549022044230L) | r13) & (-35747867511423104L)) == 0) goto L43;
        int r18 = -1;
    L44:
        if (r18 < 0) goto L47;
        r19 = (r19 * 10000) + ((long) r18);
        r10 = r10 + 4;
        r17 = r29;
    L47:
        if (r10 >= r15) goto L49;
        char r20 = r32.charAt(r10);
    L50:
        r14 = r20;
    L51:
        if (r10 == r34) goto L58;
        int r21 = r14 - '0';
        if (((char) r21) >= '\n') goto L58;
        r19 = (r19 * 10) + ((long) r21);
        r10 = r10 + 1;
        if (r10 < r15) goto L56;
        r14 = 0;
        goto L51
    L56:
        r20 = r32.charAt(r10);
    L58:
        int r22 = r29 - r10;
        r6 = r6 - r22;
        int r24 = r29;
    L60:
        if (r6 != 0) goto L64;
        return (((long) r10) << r26) | (((long) Float.floatToRawIntBits(Float.NaN)) & r23);
    L64:
        if ((r14 | ' ') != 101) goto L93;
        int r110 = r10 + 1;
        if (r110 >= r15) goto L69;
        char r111 = r32.charAt(r110);
    L70:
        if (r111 != '-') goto L72;
        char r112 = r27;
    L73:
        if (r112 == 0) goto L75;
    L76:
        r110 = r10 + 2;
    L77:
        char r113 = r32.charAt(r110);
        int r114 = 0;
    L78:
        if (r110 == r34) goto L89;
        int r115 = r113 - r9;
        int r210 = r22;
        if (((char) r115) >= '\n') goto L90;
        if (r114 >= 1024) goto L84;
        r114 = (r114 * 10) + r115;
    L84:
        r110 = r110 + 1;
        if (r110 >= r15) goto L87;
        r113 = r32.charAt(r110);
    L88:
        r22 = r210;
        r9 = '0';
        goto L78
    L87:
        r113 = 0;
    L90:
        if (r112 == 0) goto L92;
        r114 = -r114;
    L92:
        r22 = r210 + r114;
    L94:
        int r25 = 19;
        if (r6 <= 19) goto L137;
        char r116 = r32.charAt(r8);
        int r117 = r8;
    L97:
        if (r110 == r34) goto L111;
        if (r116 == '0') goto L104;
        if (r116 == '.') goto L104;
        int r2 = 19;
    L112:
        if (r6 <= r2) goto L137;
        char r28 = r32.charAt(r8);
        long r118 = 0;
    L115:
        if (r8 == r3) goto L123;
        char r35 = r28;
        int r119 = r3;
        if (Long.compare(r118 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) goto L125;
        r118 = (r118 * 10) + ((long) (r35 - '0'));
        r8 = r8 + 1;
        if (r8 >= r15) goto L121;
        r28 = r32.charAt(r8);
    L122:
        r3 = r119;
        goto L115
    L121:
        r28 = 0;
    L125:
        if (Long.compare(r118 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) goto L128;
        r22 = (r119 - r8) + r114;
    L127:
        long r30 = r118;
        char r31 = r27;
    L139:
        if ((-10) > r22) goto L154;
        if (r22 >= 11) goto L154;
        if (r31 != 0) goto L154;
        if (Long.compare(r30 ^ Long.MIN_VALUE, -9223372036837998592L) > 0) goto L154;
        float r0 = r30;
        float[] r1 = e;
        if (r22 >= 0) goto L148;
        float r36 = r0 / r1[-r22];
    L149:
        if (r11 == false) goto L152;
        r36 = -r36;
    L152:
        return (((long) r110) << r26) | (((long) Float.floatToRawIntBits(r36)) & r23);
    L148:
        r36 = r0 * r1[r22];
    L154:
        if (r30 != 0) goto L161;
        if (r11 == false) goto L157;
        float r37 = -0.0f;
    L159:
        return (((long) r110) << r26) | (((long) Float.floatToRawIntBits(r37)) & r23);
    L157:
        r37 = 0.0f;
        goto L159
    L161:
        if ((-126) > r22) goto L189;
        if (r22 >= 128) goto L189;
        long r38 = f[r22 + 325];
        int r39 = Long.numberOfLeadingZeros(r30);
        long r40 = r30 << r39;
        long r120 = r40 & r23;
        long r41 = r40 >>> r26;
        long r121 = r38 & r23;
        long r42 = r38 >>> r26;
        long r122 = r41 * r42;
        long r43 = r42 * r120;
        long r123 = (r122 + ((((r41 * r121) + ((r120 * r121) >>> r26)) + (r43 & r23)) >>> r26)) + (r43 >>> r26);
        int r44 = (int) (r123 >>> 63);
        long r45 = r123 >>> (r44 + 9);
        int r46 = r39 + (r44 ^ 1);
        long r124 = r123 & 511;
        if (r124 == 511) goto L187;
        if (r124 == 0) goto L169;
    L171:
        long r47 = (r45 + 1) >>> r27;
        if (r47 < 9007199254740992L) goto L174;
        r46 = r46 - 1;
        r47 = 4503599627370496L;
    L174:
        long r48 = r47 & (-4503599627370497L);
        long r49 = (((((long) r22) * 217706) >> 16) + 1087) - ((long) r46);
        if (r49 < 1) goto L185;
        if (r49 > 2046) goto L185;
        long r50 = (r49 << 52) | r48;
        if (r11 == false) goto L183;
        r16 = Long.MIN_VALUE;
    L183:
        return (((long) r110) << r26) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble(r50 | r16))) & r23);
    L185:
        return (((long) r110) << r26) | (((long) Float.floatToRawIntBits(Float.parseFloat(r32.substring(r33, r110)))) & r23);
    L169:
        if ((3 & r45) != 1) goto L171;
    L187:
        return (((long) r110) << r26) | (((long) Float.floatToRawIntBits(Float.parseFloat(r32.substring(r33, r110)))) & r23);
    L189:
        return (((long) r110) << r26) | (((long) Float.floatToRawIntBits(Float.parseFloat(r32.substring(r33, r110)))) & r23);
    L128:
        char r51 = r32.charAt(r24);
        int r52 = r24;
    L129:
        if (r52 == r10) goto L136;
        if (Long.compare(r118 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) goto L136;
        r118 = (r118 * 10) + ((long) (r51 - '0'));
        r52 = r52 + 1;
        if (r52 < r15) goto L134;
        r51 = 0;
        goto L129
    L134:
        r51 = r32.charAt(r52);
    L136:
        r22 = (r24 - r52) + r114;
        goto L127
    L123:
        r119 = r3;
    L104:
        if (r116 != '0') goto L106;
        r6 = r6 - 1;
    L106:
        r117 = r117 + 1;
        if (r117 >= r15) goto L109;
        r116 = r32.charAt(r117);
    L110:
        r25 = 19;
        goto L97
    L109:
        r116 = 0;
        goto L110
    L111:
        r2 = r25;
    L137:
        r30 = r19;
        r31 = 0;
        goto L139
    L89:
        r210 = r22;
        goto L90
    L75:
        if (r111 != '+') goto L77;
    L72:
        r112 = 0;
        goto L73
    L69:
        r111 = 0;
        goto L70
    L93:
        r110 = r10;
        r114 = 0;
        goto L94
    L49:
        r20 = 0;
        goto L50
    L43:
        r18 = (int) ((r13 * 281475406208040961L) >>> 48);
        goto L44
    L46:
        r29 = r17;
    L59:
        r26 = ' ';
        r27 = 1;
        r10 = r3;
        r24 = r10;
        r22 = 0;
        goto L60
    L33:
        r23 = r4;
        goto L34
    L15:
        return (((long) r8) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
    L22:
        r14 = r7;
        r8 = r33;
        goto L23
    L9:
        r11 = false;
        goto L11
    L5:
        return (((long) r33) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
    }

    public static we u(be3 r5) {
        int r0 = r5.m();
        if (r5.m() != 1684108385) goto L16;
        int r1 = r5.m();
        byte[] r2 = wu.a;
        int r3 = r1 & 16777215;
        if (r3 != 13) goto L8;
        String r4 = "image/jpeg";
    L11:
        if (r4 != null) goto L14;
        xa3.m(r3, "Unrecognized cover art flags: ", "MetadataUtil");
        return null;
    L14:
        r5.O(4);
        int r6 = r0 - 16;
        byte[] r7 = new byte[r6];
        r5.k(r7, 0, r6);
        return new we(r4, null, 3, r7);
    L8:
        if (r3 != 14) goto L10;
        r4 = "image/png";
        goto L11
    L10:
        r4 = null;
        goto L11
    L16:
        l93.q0("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static ds4 v(int r4, be3 r5, String r6) {
        int r0 = r5.m();
        if (r5.m() == 1684108385) goto L5;
    L13:
        l93.q0("MetadataUtil", "Failed to parse index/count attribute: ".concat(uv.c(r4)));
        return null;
    L5:
        if (r0 < 22) goto L13;
        r5.O(10);
        int r1 = r5.H();
        if (r1 <= 0) goto L13;
        String r7 = f34.f(r1, "");
        int r8 = r5.H();
        if (r8 <= 0) goto L12;
        r7 = r7 + "/" + r8;
    L12:
        return new ds4(r6, null, yw1.o(r7));
    }

    public static int w(be3 r3) {
        int r0 = r3.m();
        if (r3.m() != 1684108385) goto L23;
        r3.O(8);
        int r1 = r0 - 16;
        if (r1 == 1) goto L22;
        if (r1 == 2) goto L20;
        if (r1 == 3) goto L18;
        if (r1 != 4) goto L23;
        if ((r3.j() & 128) != 0) goto L23;
        return r3.E();
    L18:
        return r3.D();
    L20:
        return r3.H();
    L22:
        return r3.A();
    L23:
        l93.q0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static nv1 x(int r0, String r1, be3 r2, boolean r3, boolean r4) {
        int r5 = w(r2);
        if (r4 == false) goto L6;
        r5 = Math.min(1, r5);
    L6:
        if (r5 < 0) goto L12;
        if (r3 == false) goto L11;
        return new ds4(r1, null, yw1.o(Integer.toString(r5)));
    L11:
        return new l60("und", r1, Integer.toString(r5));
    L12:
        l93.q0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(uv.c(r0)));
        return null;
    }

    public static ds4 y(int r4, be3 r5, String r6) {
        int r0 = r5.m();
        if (r5.m() != 1684108385) goto L6;
        r5.O(8);
        return new ds4(r6, null, yw1.o(r5.w(r0 - 16)));
    L6:
        l93.q0("MetadataUtil", "Failed to parse text attribute: ".concat(uv.c(r4)));
        return null;
    }

    public static final Object z(Object[] r7, m54 r8, gf1 r9, rg1 r10, int r11) {
        final Object[] r5 = Arrays.copyOf(r7, r7.length);
        long r0 = r10.T;
        ya4.g(36);
        final String r3 = Long.toString(r0, 36);
        r3.getClass();
        r8.getClass();
        final x44 r2 = (x44) r10.i(z44.a);
        Object r12 = r10.H();
        Object r13 = null;
        Object r6 = j80.a;
        if (r12 != r6) goto L12;
        if (r2 == null) goto L8;
        Object r14 = r2.d(r3);
        if (r14 == null) goto L8;
        Object r15 = r8.f(r14);
    L9:
        if (r15 != null) goto L11;
        r15 = r9.invoke();
    L11:
        m54 r1 = r8;
        Object r4 = new t44(r1, r2, r3, r15, r5);
        r10.b0(r4);
        r12 = r4;
    L13:
        final t44 r16 = (t44) r12;
        if (Arrays.equals(r5, r16.r) == false) goto L16;
        r13 = r16.q;
    L16:
        if (r13 != null) goto L18;
        r13 = r9.invoke();
    L18:
        boolean r17 = ((((r10.g(r16) | r10.g(r1)) | r10.g(r2)) | r10.e(r3)) | r10.g(r13)) | r10.g(r5);
        Object r18 = r10.H();
        if (r17 == true) goto L23;
        if (r18 == r6) goto L23;
        final Object r19 = r13;
    L24:
        ya3 r20 = r10.M.b.n;
        r20.x0(ma3.f);
        rr2.R(r20, 0, (gf1) r18);
        return r19;
    L23:
        r19 = r13;
        final m54 r21 = r1;
        Object r22 = new wy3(r16, r21, r2, r3, r19, r5);
        r10.b0(r22);
        r18 = r22;
    L8:
        r15 = null;
        goto L9
    L12:
        r1 = r8;
        goto L13
    }
}
