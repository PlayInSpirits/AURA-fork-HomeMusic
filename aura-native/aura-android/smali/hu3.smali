.class public final synthetic Lhu3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lhu3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lhu3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lcom/eddyizm/tempus/model/Download;

    .line 7
    .line 8
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_3
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    const-string p0, ""

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :goto_0
    return-object p0

    .line 51
    :pswitch_4
    new-instance p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 52
    .line 53
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_5
    check-cast p1, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->toInternetRadioStation()Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
