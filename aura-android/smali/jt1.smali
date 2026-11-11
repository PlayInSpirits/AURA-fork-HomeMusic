.class public abstract Ljt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lkd3;

    .line 2
    .line 3
    const-string v1, "hitmoz"

    .line 4
    .line 5
    const-string v2, "Hitmos"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lkd3;

    .line 11
    .line 12
    const-string v2, "hitmos_fm"

    .line 13
    .line 14
    const-string v3, "Hitmos FM"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lkd3;

    .line 20
    .line 21
    const-string v3, "ytdlp"

    .line 22
    .line 23
    const-string v4, "YouTube"

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lkd3;

    .line 29
    .line 30
    const-string v5, "yt_reupload"

    .line 31
    .line 32
    invoke-direct {v3, v5, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lkd3;

    .line 36
    .line 37
    const-string v5, "upload"

    .line 38
    .line 39
    const-string v6, "\u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043e \u0432\u0440\u0443\u0447\u043d\u0443\u044e"

    .line 40
    .line 41
    invoke-direct {v4, v5, v6}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, Lkd3;

    .line 45
    .line 46
    const-string v6, "manual"

    .line 47
    .line 48
    const-string v7, "\u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e \u0432\u0440\u0443\u0447\u043d\u0443\u044e"

    .line 49
    .line 50
    invoke-direct {v5, v6, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    filled-new-array/range {v0 .. v5}, [Lkd3;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Ljt1;->a:Ljava/util/Map;

    .line 62
    .line 63
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-static {p0}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    if-eqz p0, :cond_5

    .line 13
    .line 14
    sget-object v0, Ljt1;->a:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object p0, v0

    .line 26
    :goto_1
    if-eqz p1, :cond_4

    .line 27
    .line 28
    invoke-static {p1}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const-string v0, "http"

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {p1, v0, v1}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    const-string v0, "\n"

    .line 46
    .line 47
    invoke-static {p0, v0, p1}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_4
    :goto_2
    return-object p0

    .line 52
    :cond_5
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Lot1;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x194

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lrr1;->a:Lrr1;

    .line 11
    .line 12
    new-instance v0, Lrs0;

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-direct {v0, v3, p0}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, Lor1;

    .line 19
    .line 20
    const/16 v3, 0xd

    .line 21
    .line 22
    invoke-direct {p0, v3}, Lor1;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p0}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubTrackSource;
    :try_end_0
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p0

    .line 33
    iget v0, p0, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 34
    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    move-object p0, v2

    .line 38
    :goto_0
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubTrackSource;->getSource()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubTrackSource;->getSourceUrl()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {v0, p0}, Ljt1;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_0
    return-object v2

    .line 53
    :cond_1
    throw p0

    .line 54
    :cond_2
    const-string v0, "hub:"

    .line 55
    .line 56
    invoke-static {p0, v0}, Lqm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :try_start_1
    sget-object v0, Lrr1;->a:Lrr1;

    .line 61
    .line 62
    new-instance v0, Lrs0;

    .line 63
    .line 64
    const/4 v3, 0x4

    .line 65
    invoke-direct {v0, v3, p0}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance p0, Lor1;

    .line 69
    .line 70
    const/16 v3, 0xe

    .line 71
    .line 72
    invoke-direct {p0, v3}, Lor1;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p0}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubTrackSource;
    :try_end_1
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catch_1
    move-exception p0

    .line 83
    iget v0, p0, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 84
    .line 85
    if-ne v0, v1, :cond_6

    .line 86
    .line 87
    move-object p0, v2

    .line 88
    :goto_1
    if-nez p0, :cond_3

    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubTrackSource;->getKind()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "full"

    .line 96
    .line 97
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubTrackSource;->getProvider()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubTrackSource;->getPageUrl()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {v0, p0}, Ljt1;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    const-string p0, "preview"

    .line 117
    .line 118
    invoke-static {v0, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_5

    .line 123
    .line 124
    const-string v2, "Deezer, \u043f\u0440\u0435\u0432\u044c\u044e 30 \u0441\u0435\u043a"

    .line 125
    .line 126
    :cond_5
    :goto_2
    return-object v2

    .line 127
    :cond_6
    throw p0
.end method
